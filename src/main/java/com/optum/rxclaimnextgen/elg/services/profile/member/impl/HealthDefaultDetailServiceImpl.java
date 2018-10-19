package com.optum.rxclaimnextgen.elg.services.profile.member.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.optum.rxclaimnextgen.elg.entities.ElgEligHealthDefaultsEhd;
import com.optum.rxclaimnextgen.elg.exceptions.ValidationException;
import com.optum.rxclaimnextgen.elg.pojo.EligMemberCareAssignDetailForm;
import com.optum.rxclaimnextgen.elg.pojo.EligMemberHimDefaultOvrDetailForm;
import com.optum.rxclaimnextgen.elg.pojo.profile.member.DigDiagnosis;
import com.optum.rxclaimnextgen.elg.pojo.profile.member.EligMemberHealthDefaultDetailForm;
import com.optum.rxclaimnextgen.elg.repositories.ElgAllergyRepository;
import com.optum.rxclaimnextgen.elg.repositories.ElgEligHealthDefaultsEhdRepository;
import com.optum.rxclaimnextgen.elg.services.NonEligAPIServices;
import com.optum.rxclaimnextgen.elg.services.impl.EligProfileServicesImpl;
import com.optum.rxclaimnextgen.elg.services.profile.member.HealthDefaultDetailService;
import com.optum.rxclaimnextgen.elg.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;

@Service
public class HealthDefaultDetailServiceImpl implements HealthDefaultDetailService {

    private static final Logger LOG = LoggerFactory.getLogger(HealthDefaultDetailServiceImpl.class);

    @Autowired
    private ElgEligHealthDefaultsEhdRepository elgEligHealthDefaultsEhdRepo;

    @Autowired
    private NonEligAPIServices nonEligAPIServices;

    @Autowired
    ElgAllergyRepository elgAllergyRepository;

    private final static String DIAG_CODE_API = "/diagnosisCode";

    // Form values for using ICD 9/10 or no validation
    private final static String VALIDATE_ICD_10 = "I";
    private final static String VALIDATE_ICD_9 = "Y";
    private final static String NO_VALIDATE_ICD = "N";


    // Qualifier stored in diag code to verify against
    private final static String ICD_9_QUALIFIER = "01";
    private final static String ICD_10_QUALIFIER = "02";

    // Diagnosis code validation messages
    private final static String INVALID_DIAGNOIS_CODE = "Value entered must be valid diagnosis code.";
    private final static String INVALID_ICD_9_DIAGNOSIS_CODE = "Entry must be a ICD-9 code";
    private final static String INVALID_ICD_10_DIAGNOSIS_CODE = "Entry must be a ICD-10 code";

    private final static String INVALID_ALLERGY_CODE = "Code entered is invalid";


    public ElgEligHealthDefaultsEhd getHealthDefaultsEntityBYPK(String carCarrierId, String accountId, String groupId) {
        ElgEligHealthDefaultsEhd ehd = elgEligHealthDefaultsEhdRepo.findByCarCarrierIdAndAccountIdAndGroupId(carCarrierId, accountId, groupId);
        return ehd;
    }

    public EligMemberHealthDefaultDetailForm findHealthDefaultsByPrimaryKey(String carCarrierId, String accountId, String groupId) {
        ElgEligHealthDefaultsEhd ehd = elgEligHealthDefaultsEhdRepo.findByCarCarrierIdAndAccountIdAndGroupId(carCarrierId, accountId, groupId);
        if (ehd == null) {
            EligMemberHealthDefaultDetailForm eligMemberHealthDefaultDetailForm = new EligMemberHealthDefaultDetailForm();
            eligMemberHealthDefaultDetailForm.setCarCarrierId(carCarrierId);
            eligMemberHealthDefaultDetailForm.setAccountId(accountId);
            eligMemberHealthDefaultDetailForm.setGroupId(groupId);

            return eligMemberHealthDefaultDetailForm;
        }

        return this.populatePOJOFromEntity(ehd);
    }

    public EligMemberHealthDefaultDetailForm saveHealthDefaultDetails(String updatedHealthDefaultsJSON, String platformId) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        EligMemberHealthDefaultDetailForm updatedHealthDefaultsForm = objectMapper.readValue(updatedHealthDefaultsJSON, new TypeReference<EligMemberHealthDefaultDetailForm>() {
        });

        HashMap<String, String> validationErrors = this.validateHealthDefaultDetails(updatedHealthDefaultsForm, platformId);

        if (!validationErrors.isEmpty()) {
            throw new ValidationException(objectMapper.writer().writeValueAsString(validationErrors));
        }

        ElgEligHealthDefaultsEhd updatedHealthDefaults = this.populateHealthDefaultDetailsFromPOJO(updatedHealthDefaultsForm);

        updatedHealthDefaults = elgEligHealthDefaultsEhdRepo.saveAndFlush(updatedHealthDefaults);

        return this.populatePOJOFromEntity(updatedHealthDefaults);

    }

    private HashMap<String, String> validateHealthDefaultDetails(EligMemberHealthDefaultDetailForm eligMemberHealthDefaultDetailForm, String platformId) throws Exception {
        HashMap<String, String> validationErrors = new HashMap<>();

        validationErrors.putAll(this.validateDiagnosisCodes(eligMemberHealthDefaultDetailForm, platformId));
        validationErrors.putAll(this.validateAllergyCodes(eligMemberHealthDefaultDetailForm));

        return validationErrors;
    }

    private boolean isDefaultOrReplace(String value) {
        return (value.equalsIgnoreCase("D") || value.equalsIgnoreCase("R"));
    }

    private HashMap<String, String> validateDiagnosisCodes(EligMemberHealthDefaultDetailForm eligMemberHealthDefaultDetailForm, String platformId) throws Exception {
        HashMap<String, String> validationErrors = new HashMap<>();

        // Validate Diagnosis Codes

        String ICDQualifierToValidate;
        String invalidICDErrorMessage = INVALID_DIAGNOIS_CODE;
        switch (eligMemberHealthDefaultDetailForm.getEhdUseIcdValidation()) {
            case VALIDATE_ICD_9:
                ICDQualifierToValidate = ICD_9_QUALIFIER;
                invalidICDErrorMessage = INVALID_ICD_9_DIAGNOSIS_CODE;
                break;
            case VALIDATE_ICD_10:
                ICDQualifierToValidate = ICD_10_QUALIFIER;
                invalidICDErrorMessage = INVALID_ICD_10_DIAGNOSIS_CODE;
                break;
            case NO_VALIDATE_ICD:
            default:
                ICDQualifierToValidate = "";
                invalidICDErrorMessage = INVALID_DIAGNOIS_CODE;
        }

        DigDiagnosis diagnosisCodeFromNonElig;
        if (this.isDefaultOrReplace(eligMemberHealthDefaultDetailForm.getEhdDiagCode1Ind())) {
            diagnosisCodeFromNonElig = this.getValidDiagnosisCode(eligMemberHealthDefaultDetailForm.getEhdDiagCode1(), platformId, ICDQualifierToValidate);

            if (diagnosisCodeFromNonElig == null) {
                // Set error message for invalid diagnosis code
                validationErrors.put("ehdDiagCode1", invalidICDErrorMessage);
            }
            else {
                eligMemberHealthDefaultDetailForm.setEhdDiagQual1(diagnosisCodeFromNonElig.getQualifier());
                eligMemberHealthDefaultDetailForm.setEhdDiagType1(diagnosisCodeFromNonElig.getTypeCode());
            }
        }

        if (this.isDefaultOrReplace(eligMemberHealthDefaultDetailForm.getEhdDiagCode2Ind())) {
            diagnosisCodeFromNonElig = this.getValidDiagnosisCode(eligMemberHealthDefaultDetailForm.getEhdDiagCode2(), platformId, ICDQualifierToValidate);

            if (diagnosisCodeFromNonElig == null) {                // Set error message for invalid diagnosis code
                validationErrors.put("ehdDiagCode2", invalidICDErrorMessage);
            }
            else {
                eligMemberHealthDefaultDetailForm.setEhdDiagQual2(diagnosisCodeFromNonElig.getQualifier());
                eligMemberHealthDefaultDetailForm.setEhdDiagType2(diagnosisCodeFromNonElig.getTypeCode());
            }
        }

        if (this.isDefaultOrReplace(eligMemberHealthDefaultDetailForm.getEhdDiagCode3Ind())) {
            diagnosisCodeFromNonElig = this.getValidDiagnosisCode(eligMemberHealthDefaultDetailForm.getEhdDiagCode3(), platformId, ICDQualifierToValidate);

            if (diagnosisCodeFromNonElig == null) {                // Set error message for invalid diagnosis code
                validationErrors.put("ehdDiagCode3", invalidICDErrorMessage);
            }
            else {
                eligMemberHealthDefaultDetailForm.setEhdDiagQual3(diagnosisCodeFromNonElig.getQualifier());
                eligMemberHealthDefaultDetailForm.setEhdDiagType3(diagnosisCodeFromNonElig.getTypeCode());
            }
        }

        if (this.isDefaultOrReplace(eligMemberHealthDefaultDetailForm.getEhdDiagCode4Ind())) {
            diagnosisCodeFromNonElig = this.getValidDiagnosisCode(eligMemberHealthDefaultDetailForm.getEhdDiagCode4(), platformId, ICDQualifierToValidate);

            if (diagnosisCodeFromNonElig == null) {                // Set error message for invalid diagnosis code
                validationErrors.put("ehdDiagCode4", invalidICDErrorMessage);
            }
            else {
                eligMemberHealthDefaultDetailForm.setEhdDiagQual4(diagnosisCodeFromNonElig.getQualifier());
                eligMemberHealthDefaultDetailForm.setEhdDiagType4(diagnosisCodeFromNonElig.getTypeCode());
            }
        }

        if (this.isDefaultOrReplace(eligMemberHealthDefaultDetailForm.getEhdDiagCode5Ind())) {
            diagnosisCodeFromNonElig = this.getValidDiagnosisCode(eligMemberHealthDefaultDetailForm.getEhdDiagCode5(), platformId, ICDQualifierToValidate);

            if (diagnosisCodeFromNonElig == null) {                // Set error message for invalid diagnosis code
                validationErrors.put("ehdDiagCode5", invalidICDErrorMessage);
            }
            else {
                eligMemberHealthDefaultDetailForm.setEhdDiagQual5(diagnosisCodeFromNonElig.getQualifier());
                eligMemberHealthDefaultDetailForm.setEhdDiagType5(diagnosisCodeFromNonElig.getTypeCode());
            }
        }

        if (this.isDefaultOrReplace(eligMemberHealthDefaultDetailForm.getEhdDiagCode6Ind())) {
            diagnosisCodeFromNonElig = this.getValidDiagnosisCode(eligMemberHealthDefaultDetailForm.getEhdDiagCode6(), platformId, ICDQualifierToValidate);

            if (diagnosisCodeFromNonElig == null) {                // Set error message for invalid diagnosis code
                validationErrors.put("ehdDiagCode6", invalidICDErrorMessage);
            }
            else {
                eligMemberHealthDefaultDetailForm.setEhdDiagQual6(diagnosisCodeFromNonElig.getQualifier());
                eligMemberHealthDefaultDetailForm.setEhdDiagType6(diagnosisCodeFromNonElig.getTypeCode());
            }
        }


        if (this.isDefaultOrReplace(eligMemberHealthDefaultDetailForm.getEhdDiagCode7Ind())) {
            diagnosisCodeFromNonElig = this.getValidDiagnosisCode(eligMemberHealthDefaultDetailForm.getEhdDiagCode7(), platformId, ICDQualifierToValidate);

            if (diagnosisCodeFromNonElig == null) {                // Set error message for invalid diagnosis code
                validationErrors.put("ehdDiagCode7", invalidICDErrorMessage);
            }
            else {
                eligMemberHealthDefaultDetailForm.setEhdDiagQual7(diagnosisCodeFromNonElig.getQualifier());
                eligMemberHealthDefaultDetailForm.setEhdDiagType7(diagnosisCodeFromNonElig.getTypeCode());
            }
        }

        if (this.isDefaultOrReplace(eligMemberHealthDefaultDetailForm.getEhdDiagCode8Ind())) {
            diagnosisCodeFromNonElig = this.getValidDiagnosisCode(eligMemberHealthDefaultDetailForm.getEhdDiagCode8(), platformId, ICDQualifierToValidate);

            if (diagnosisCodeFromNonElig == null) {                // Set error message for invalid diagnosis code
                validationErrors.put("ehdDiagCode8", invalidICDErrorMessage);
            }
            else {
                eligMemberHealthDefaultDetailForm.setEhdDiagQual8(diagnosisCodeFromNonElig.getQualifier());
                eligMemberHealthDefaultDetailForm.setEhdDiagType8(diagnosisCodeFromNonElig.getTypeCode());
            }
        }

        if (this.isDefaultOrReplace(eligMemberHealthDefaultDetailForm.getEhdDiagCode9Ind())) {
            diagnosisCodeFromNonElig = this.getValidDiagnosisCode(eligMemberHealthDefaultDetailForm.getEhdDiagCode9(), platformId, ICDQualifierToValidate);

            if (diagnosisCodeFromNonElig == null) {                // Set error message for invalid diagnosis code
                validationErrors.put("ehdDiagCode9", invalidICDErrorMessage);
            }
            else {
                eligMemberHealthDefaultDetailForm.setEhdDiagQual9(diagnosisCodeFromNonElig.getQualifier());
                eligMemberHealthDefaultDetailForm.setEhdDiagType9(diagnosisCodeFromNonElig.getTypeCode());
            }
        }

        if (this.isDefaultOrReplace(eligMemberHealthDefaultDetailForm.getEhdDiagCode10Ind())) {
            diagnosisCodeFromNonElig = this.getValidDiagnosisCode(eligMemberHealthDefaultDetailForm.getEhdDiagCode10(), platformId, ICDQualifierToValidate);

            if (diagnosisCodeFromNonElig == null) {                // Set error message for invalid diagnosis code
                validationErrors.put("ehdDiagCode10", invalidICDErrorMessage);
            }
            else {
                eligMemberHealthDefaultDetailForm.setEhdDiagQual10(diagnosisCodeFromNonElig.getQualifier());
                eligMemberHealthDefaultDetailForm.setEhdDiagType10(diagnosisCodeFromNonElig.getTypeCode());
            }
        }


        return validationErrors;
    }

    private HashMap<String, String> validateAllergyCodes(EligMemberHealthDefaultDetailForm eligMemberHealthDefaultDetailForm) {
        HashMap<String, String> validationErrors = new HashMap<>();

        if (this.isDefaultOrReplace(eligMemberHealthDefaultDetailForm.getEhdAllergyCode1Ind())) {
            if (!this.allergyCodeExists(eligMemberHealthDefaultDetailForm.getEhdAllergyCode1())) {
                validationErrors.put("ehdAllergyCode1", INVALID_ALLERGY_CODE);
            }
        }

        if (this.isDefaultOrReplace(eligMemberHealthDefaultDetailForm.getEhdAllergyCode2Ind())) {
            if (!this.allergyCodeExists(eligMemberHealthDefaultDetailForm.getEhdAllergyCode2())) {
                validationErrors.put("ehdAllergyCode2", INVALID_ALLERGY_CODE);
            }
        }

        if (this.isDefaultOrReplace(eligMemberHealthDefaultDetailForm.getEhdAllergyCode3Ind())) {
            if (!this.allergyCodeExists(eligMemberHealthDefaultDetailForm.getEhdAllergyCode3())) {
                validationErrors.put("ehdAllergyCode3", INVALID_ALLERGY_CODE);
            }
        }

        if (this.isDefaultOrReplace(eligMemberHealthDefaultDetailForm.getEhdAllergyCode4Ind())) {
            if (!this.allergyCodeExists(eligMemberHealthDefaultDetailForm.getEhdAllergyCode4())) {
                validationErrors.put("ehdAllergyCode4", INVALID_ALLERGY_CODE);
            }
        }

        if (this.isDefaultOrReplace(eligMemberHealthDefaultDetailForm.getEhdAllergyCode5Ind())) {
            if (!this.allergyCodeExists(eligMemberHealthDefaultDetailForm.getEhdAllergyCode5())) {
                validationErrors.put("ehdAllergyCode5", INVALID_ALLERGY_CODE);
            }
        }

        if (this.isDefaultOrReplace(eligMemberHealthDefaultDetailForm.getEhdAllergyCode6Ind())) {
            if (!this.allergyCodeExists(eligMemberHealthDefaultDetailForm.getEhdAllergyCode6())) {
                validationErrors.put("ehdAllergyCode6", INVALID_ALLERGY_CODE);
            }
        }

        return validationErrors;
    }


    private DigDiagnosis getValidDiagnosisCode(String diagnosisCode, String platformId, String ICDQualifier) throws Exception {
        if (diagnosisCode.isEmpty()) {
            return null;
        }

        try {
            String results = nonEligAPIServices.callNonEligDataService(platformId, DIAG_CODE_API + "?diagnosisCode=" + diagnosisCode);

            if (results == null || results.isEmpty()) {
                return null;
            }


            ObjectMapper mapper = new ObjectMapper();
            DigDiagnosis diagnosis = mapper.readValue(results, new TypeReference<DigDiagnosis>() {
            });

            if (diagnosis.getQualifier().equalsIgnoreCase(ICDQualifier)) {
                return diagnosis;
            }

        } catch (Exception e) {
            throw new Exception("Unable to connect to Non-Eligibility Service");
        }

        return null;
    }

    private EligMemberHealthDefaultDetailForm populatePOJOFromEntity(ElgEligHealthDefaultsEhd elgEligHealthDefaultsEhd) {
        EligMemberHealthDefaultDetailForm eligMemberHealthDefaultDetailForm = new EligMemberHealthDefaultDetailForm();

        // Set CAG
        eligMemberHealthDefaultDetailForm.setCarCarrierId(elgEligHealthDefaultsEhd.getCarCarrierId());
        eligMemberHealthDefaultDetailForm.setAccountId(elgEligHealthDefaultsEhd.getAccountId());
        eligMemberHealthDefaultDetailForm.setGroupId(elgEligHealthDefaultsEhd.getGroupId());

        // Diagnosis Codes

        eligMemberHealthDefaultDetailForm.setEhdUseIcdValidation(elgEligHealthDefaultsEhd.getEhdUseIcdValidation());

        eligMemberHealthDefaultDetailForm.setEhdDiagCode1Ind(elgEligHealthDefaultsEhd.getEhdDiagCode1Ind());
        eligMemberHealthDefaultDetailForm.setEhdDiagCode2Ind(elgEligHealthDefaultsEhd.getEhdDiagCode2Ind());
        eligMemberHealthDefaultDetailForm.setEhdDiagCode3Ind(elgEligHealthDefaultsEhd.getEhdDiagCode3Ind());
        eligMemberHealthDefaultDetailForm.setEhdDiagCode4Ind(elgEligHealthDefaultsEhd.getEhdDiagCode4Ind());
        eligMemberHealthDefaultDetailForm.setEhdDiagCode5Ind(elgEligHealthDefaultsEhd.getEhdDiagCode5Ind());
        eligMemberHealthDefaultDetailForm.setEhdDiagCode6Ind(elgEligHealthDefaultsEhd.getEhdDiagCode6Ind());
        eligMemberHealthDefaultDetailForm.setEhdDiagCode7Ind(elgEligHealthDefaultsEhd.getEhdDiagCode7Ind());
        eligMemberHealthDefaultDetailForm.setEhdDiagCode8Ind(elgEligHealthDefaultsEhd.getEhdDiagCode8Ind());
        eligMemberHealthDefaultDetailForm.setEhdDiagCode9Ind(elgEligHealthDefaultsEhd.getEhdDiagCode9Ind());
        eligMemberHealthDefaultDetailForm.setEhdDiagCode10Ind(elgEligHealthDefaultsEhd.getEhdDiagCode10Ind());


        eligMemberHealthDefaultDetailForm.setEhdDiagCode1(elgEligHealthDefaultsEhd.getEhdDiagCode1());
        eligMemberHealthDefaultDetailForm.setEhdDiagCode2(elgEligHealthDefaultsEhd.getEhdDiagCode2());
        eligMemberHealthDefaultDetailForm.setEhdDiagCode3(elgEligHealthDefaultsEhd.getEhdDiagCode3());
        eligMemberHealthDefaultDetailForm.setEhdDiagCode4(elgEligHealthDefaultsEhd.getEhdDiagCode4());
        eligMemberHealthDefaultDetailForm.setEhdDiagCode5(elgEligHealthDefaultsEhd.getEhdDiagCode5());
        eligMemberHealthDefaultDetailForm.setEhdDiagCode6(elgEligHealthDefaultsEhd.getEhdDiagCode6());
        eligMemberHealthDefaultDetailForm.setEhdDiagCode7(elgEligHealthDefaultsEhd.getEhdDiagCode7());
        eligMemberHealthDefaultDetailForm.setEhdDiagCode8(elgEligHealthDefaultsEhd.getEhdDiagCode8());
        eligMemberHealthDefaultDetailForm.setEhdDiagCode9(elgEligHealthDefaultsEhd.getEhdDiagCode9());
        eligMemberHealthDefaultDetailForm.setEhdDiagCode10(elgEligHealthDefaultsEhd.getEhdDiagCode10());

        eligMemberHealthDefaultDetailForm.setEhdDiagType1(elgEligHealthDefaultsEhd.getEhdDiagType1());
        eligMemberHealthDefaultDetailForm.setEhdDiagType2(elgEligHealthDefaultsEhd.getEhdDiagType2());
        eligMemberHealthDefaultDetailForm.setEhdDiagType3(elgEligHealthDefaultsEhd.getEhdDiagType3());
        eligMemberHealthDefaultDetailForm.setEhdDiagType4(elgEligHealthDefaultsEhd.getEhdDiagType4());
        eligMemberHealthDefaultDetailForm.setEhdDiagType5(elgEligHealthDefaultsEhd.getEhdDiagType5());
        eligMemberHealthDefaultDetailForm.setEhdDiagType6(elgEligHealthDefaultsEhd.getEhdDiagType6());
        eligMemberHealthDefaultDetailForm.setEhdDiagType7(elgEligHealthDefaultsEhd.getEhdDiagType7());
        eligMemberHealthDefaultDetailForm.setEhdDiagType8(elgEligHealthDefaultsEhd.getEhdDiagType8());
        eligMemberHealthDefaultDetailForm.setEhdDiagType9(elgEligHealthDefaultsEhd.getEhdDiagType9());
        eligMemberHealthDefaultDetailForm.setEhdDiagType10(elgEligHealthDefaultsEhd.getEhdDiagType10());

        eligMemberHealthDefaultDetailForm.setEhdDiagQual1(elgEligHealthDefaultsEhd.getEhdDiagQual1());
        eligMemberHealthDefaultDetailForm.setEhdDiagQual2(elgEligHealthDefaultsEhd.getEhdDiagQual2());
        eligMemberHealthDefaultDetailForm.setEhdDiagQual3(elgEligHealthDefaultsEhd.getEhdDiagQual3());
        eligMemberHealthDefaultDetailForm.setEhdDiagQual4(elgEligHealthDefaultsEhd.getEhdDiagQual4());
        eligMemberHealthDefaultDetailForm.setEhdDiagQual5(elgEligHealthDefaultsEhd.getEhdDiagQual5());
        eligMemberHealthDefaultDetailForm.setEhdDiagQual6(elgEligHealthDefaultsEhd.getEhdDiagQual6());
        eligMemberHealthDefaultDetailForm.setEhdDiagQual7(elgEligHealthDefaultsEhd.getEhdDiagQual7());
        eligMemberHealthDefaultDetailForm.setEhdDiagQual8(elgEligHealthDefaultsEhd.getEhdDiagQual8());
        eligMemberHealthDefaultDetailForm.setEhdDiagQual9(elgEligHealthDefaultsEhd.getEhdDiagQual9());
        eligMemberHealthDefaultDetailForm.setEhdDiagQual10(elgEligHealthDefaultsEhd.getEhdDiagQual10());


        // Allergy codes
        eligMemberHealthDefaultDetailForm.setEhdAllergyCode1Ind(elgEligHealthDefaultsEhd.getEhdAllergyCode1Ind());
        eligMemberHealthDefaultDetailForm.setEhdAllergyCode2Ind(elgEligHealthDefaultsEhd.getEhdAllergyCode2Ind());
        eligMemberHealthDefaultDetailForm.setEhdAllergyCode3Ind(elgEligHealthDefaultsEhd.getEhdAllergyCode3Ind());
        eligMemberHealthDefaultDetailForm.setEhdAllergyCode4Ind(elgEligHealthDefaultsEhd.getEhdAllergyCode4Ind());
        eligMemberHealthDefaultDetailForm.setEhdAllergyCode5Ind(elgEligHealthDefaultsEhd.getEhdAllergyCode5Ind());
        eligMemberHealthDefaultDetailForm.setEhdAllergyCode6Ind(elgEligHealthDefaultsEhd.getEhdAllergyCode6Ind());

        eligMemberHealthDefaultDetailForm.setEhdAllergyCode1(elgEligHealthDefaultsEhd.getEhdAllergyCode1());
        eligMemberHealthDefaultDetailForm.setEhdAllergyCode2(elgEligHealthDefaultsEhd.getEhdAllergyCode2());
        eligMemberHealthDefaultDetailForm.setEhdAllergyCode3(elgEligHealthDefaultsEhd.getEhdAllergyCode3());
        eligMemberHealthDefaultDetailForm.setEhdAllergyCode4(elgEligHealthDefaultsEhd.getEhdAllergyCode4());
        eligMemberHealthDefaultDetailForm.setEhdAllergyCode5(elgEligHealthDefaultsEhd.getEhdAllergyCode5());
        eligMemberHealthDefaultDetailForm.setEhdAllergyCode6(elgEligHealthDefaultsEhd.getEhdAllergyCode6());


        // Misc Codes

        eligMemberHealthDefaultDetailForm.setEhdHeightInd(elgEligHealthDefaultsEhd.getEhdHeightInd());
        eligMemberHealthDefaultDetailForm.setEhdHeight(
                elgEligHealthDefaultsEhd.getEhdHeight() != null ? elgEligHealthDefaultsEhd.getEhdHeight() : BigDecimal.ZERO
        );

        eligMemberHealthDefaultDetailForm.setEhdWeightInd(elgEligHealthDefaultsEhd.getEhdWeightInd());
        eligMemberHealthDefaultDetailForm.setEhdWeight(
                elgEligHealthDefaultsEhd.getEhdWeight() != null ? elgEligHealthDefaultsEhd.getEhdWeight() : BigDecimal.ZERO
        );

        eligMemberHealthDefaultDetailForm.setEhdBloodTypeInd(elgEligHealthDefaultsEhd.getEhdBloodTypeInd());
        eligMemberHealthDefaultDetailForm.setEhdBloodType(elgEligHealthDefaultsEhd.getEhdBloodType());

        eligMemberHealthDefaultDetailForm.setEhdSmokingInd(elgEligHealthDefaultsEhd.getEhdSmokingInd());
        eligMemberHealthDefaultDetailForm.setEhdSmokingCode(elgEligHealthDefaultsEhd.getEhdSmokingCode());

        eligMemberHealthDefaultDetailForm.setEhdAlcoholInd(elgEligHealthDefaultsEhd.getEhdAlcoholInd());
        eligMemberHealthDefaultDetailForm.setEhdAlcoholCode(elgEligHealthDefaultsEhd.getEhdAlcoholCode());

        eligMemberHealthDefaultDetailForm.setEhdPregnancyInd(elgEligHealthDefaultsEhd.getEhdPregnancyInd());
        eligMemberHealthDefaultDetailForm.setEhdPregnantCode(elgEligHealthDefaultsEhd.getEhdPregnantCode());

        eligMemberHealthDefaultDetailForm.setEhdContactLensInd(elgEligHealthDefaultsEhd.getEhdContactLensInd());
        eligMemberHealthDefaultDetailForm.setEhdContactLensCode(elgEligHealthDefaultsEhd.getEhdContactLensCode());

        eligMemberHealthDefaultDetailForm.setEhdMiscCode1Ind(elgEligHealthDefaultsEhd.getEhdMiscCode1Ind());
        eligMemberHealthDefaultDetailForm.setEhdMiscCode1(elgEligHealthDefaultsEhd.getEhdMiscCode1());

        // Print option
        eligMemberHealthDefaultDetailForm.setEhdMiscCode2Ind(elgEligHealthDefaultsEhd.getEhdMiscCode2Ind());
        eligMemberHealthDefaultDetailForm.setEhdMiscCode2(elgEligHealthDefaultsEhd.getEhdMiscCode2());

        // Misc Updated Fields

        eligMemberHealthDefaultDetailForm.setAddUserName(elgEligHealthDefaultsEhd.getAddUserName());
        eligMemberHealthDefaultDetailForm.setAddDate(DateUtils.convertDateToString(elgEligHealthDefaultsEhd.getAddDate()));
        eligMemberHealthDefaultDetailForm.setAddTime(elgEligHealthDefaultsEhd.getAddTime().toString());
        eligMemberHealthDefaultDetailForm.setChgUserName(elgEligHealthDefaultsEhd.getChgUserName());
        eligMemberHealthDefaultDetailForm.setChgDate(DateUtils.convertDateToString(elgEligHealthDefaultsEhd.getChgDate()));
        eligMemberHealthDefaultDetailForm.setChgTime(elgEligHealthDefaultsEhd.getChgTime().toString());


        return eligMemberHealthDefaultDetailForm;
    }

    private ElgEligHealthDefaultsEhd populateHealthDefaultDetailsFromPOJO(EligMemberHealthDefaultDetailForm eligMemberHealthDefaultDetailForm) {
        ElgEligHealthDefaultsEhd elgEligHealthDefaultsEhd =
                this.getHealthDefaultsEntityBYPK(
                        eligMemberHealthDefaultDetailForm.getCarCarrierId(),
                        eligMemberHealthDefaultDetailForm.getAccountId(),
                        eligMemberHealthDefaultDetailForm.getGroupId()
                );

        // No existing record, this is an insert, add date/time/user/program/CAG
        if (elgEligHealthDefaultsEhd == null) {
            elgEligHealthDefaultsEhd = new ElgEligHealthDefaultsEhd();

            elgEligHealthDefaultsEhd.setCarCarrierId(eligMemberHealthDefaultDetailForm.getCarCarrierId());
            elgEligHealthDefaultsEhd.setAccountId(eligMemberHealthDefaultDetailForm.getAccountId());
            elgEligHealthDefaultsEhd.setGroupId(eligMemberHealthDefaultDetailForm.getGroupId());

            elgEligHealthDefaultsEhd.setAddDate(DateUtils.currentDate());
            elgEligHealthDefaultsEhd.setAddTime(DateUtils.currentTime());
            elgEligHealthDefaultsEhd.setAddProgramName("JAVA_PRG");
            elgEligHealthDefaultsEhd.setAddUserName("TEST_USER");
        }


        // Diagnosis Codes

        elgEligHealthDefaultsEhd.setEhdUseIcdValidation(eligMemberHealthDefaultDetailForm.getEhdUseIcdValidation());

        elgEligHealthDefaultsEhd.setEhdDiagCode1Ind(eligMemberHealthDefaultDetailForm.getEhdDiagCode1Ind());
        elgEligHealthDefaultsEhd.setEhdDiagCode2Ind(eligMemberHealthDefaultDetailForm.getEhdDiagCode2Ind());
        elgEligHealthDefaultsEhd.setEhdDiagCode3Ind(eligMemberHealthDefaultDetailForm.getEhdDiagCode3Ind());
        elgEligHealthDefaultsEhd.setEhdDiagCode4Ind(eligMemberHealthDefaultDetailForm.getEhdDiagCode4Ind());
        elgEligHealthDefaultsEhd.setEhdDiagCode5Ind(eligMemberHealthDefaultDetailForm.getEhdDiagCode5Ind());
        elgEligHealthDefaultsEhd.setEhdDiagCode6Ind(eligMemberHealthDefaultDetailForm.getEhdDiagCode6Ind());
        elgEligHealthDefaultsEhd.setEhdDiagCode7Ind(eligMemberHealthDefaultDetailForm.getEhdDiagCode7Ind());
        elgEligHealthDefaultsEhd.setEhdDiagCode8Ind(eligMemberHealthDefaultDetailForm.getEhdDiagCode8Ind());
        elgEligHealthDefaultsEhd.setEhdDiagCode9Ind(eligMemberHealthDefaultDetailForm.getEhdDiagCode9Ind());
        elgEligHealthDefaultsEhd.setEhdDiagCode10Ind(eligMemberHealthDefaultDetailForm.getEhdDiagCode10Ind());


        elgEligHealthDefaultsEhd.setEhdDiagCode1(eligMemberHealthDefaultDetailForm.getEhdDiagCode1());
        elgEligHealthDefaultsEhd.setEhdDiagCode2(eligMemberHealthDefaultDetailForm.getEhdDiagCode2());
        elgEligHealthDefaultsEhd.setEhdDiagCode3(eligMemberHealthDefaultDetailForm.getEhdDiagCode3());
        elgEligHealthDefaultsEhd.setEhdDiagCode4(eligMemberHealthDefaultDetailForm.getEhdDiagCode4());
        elgEligHealthDefaultsEhd.setEhdDiagCode5(eligMemberHealthDefaultDetailForm.getEhdDiagCode5());
        elgEligHealthDefaultsEhd.setEhdDiagCode6(eligMemberHealthDefaultDetailForm.getEhdDiagCode6());
        elgEligHealthDefaultsEhd.setEhdDiagCode7(eligMemberHealthDefaultDetailForm.getEhdDiagCode7());
        elgEligHealthDefaultsEhd.setEhdDiagCode8(eligMemberHealthDefaultDetailForm.getEhdDiagCode8());
        elgEligHealthDefaultsEhd.setEhdDiagCode9(eligMemberHealthDefaultDetailForm.getEhdDiagCode9());
        elgEligHealthDefaultsEhd.setEhdDiagCode10(eligMemberHealthDefaultDetailForm.getEhdDiagCode10());

        elgEligHealthDefaultsEhd.setEhdDiagType1(eligMemberHealthDefaultDetailForm.getEhdDiagType1());
        elgEligHealthDefaultsEhd.setEhdDiagType2(eligMemberHealthDefaultDetailForm.getEhdDiagType2());
        elgEligHealthDefaultsEhd.setEhdDiagType3(eligMemberHealthDefaultDetailForm.getEhdDiagType3());
        elgEligHealthDefaultsEhd.setEhdDiagType4(eligMemberHealthDefaultDetailForm.getEhdDiagType4());
        elgEligHealthDefaultsEhd.setEhdDiagType5(eligMemberHealthDefaultDetailForm.getEhdDiagType5());
        elgEligHealthDefaultsEhd.setEhdDiagType6(eligMemberHealthDefaultDetailForm.getEhdDiagType6());
        elgEligHealthDefaultsEhd.setEhdDiagType7(eligMemberHealthDefaultDetailForm.getEhdDiagType7());
        elgEligHealthDefaultsEhd.setEhdDiagType8(eligMemberHealthDefaultDetailForm.getEhdDiagType8());
        elgEligHealthDefaultsEhd.setEhdDiagType9(eligMemberHealthDefaultDetailForm.getEhdDiagType9());
        elgEligHealthDefaultsEhd.setEhdDiagType10(eligMemberHealthDefaultDetailForm.getEhdDiagType10());

        elgEligHealthDefaultsEhd.setEhdDiagQual1(eligMemberHealthDefaultDetailForm.getEhdDiagQual1());
        elgEligHealthDefaultsEhd.setEhdDiagQual2(eligMemberHealthDefaultDetailForm.getEhdDiagQual2());
        elgEligHealthDefaultsEhd.setEhdDiagQual3(eligMemberHealthDefaultDetailForm.getEhdDiagQual3());
        elgEligHealthDefaultsEhd.setEhdDiagQual4(eligMemberHealthDefaultDetailForm.getEhdDiagQual4());
        elgEligHealthDefaultsEhd.setEhdDiagQual5(eligMemberHealthDefaultDetailForm.getEhdDiagQual5());
        elgEligHealthDefaultsEhd.setEhdDiagQual6(eligMemberHealthDefaultDetailForm.getEhdDiagQual6());
        elgEligHealthDefaultsEhd.setEhdDiagQual7(eligMemberHealthDefaultDetailForm.getEhdDiagQual7());
        elgEligHealthDefaultsEhd.setEhdDiagQual8(eligMemberHealthDefaultDetailForm.getEhdDiagQual8());
        elgEligHealthDefaultsEhd.setEhdDiagQual9(eligMemberHealthDefaultDetailForm.getEhdDiagQual9());
        elgEligHealthDefaultsEhd.setEhdDiagQual10(eligMemberHealthDefaultDetailForm.getEhdDiagQual10());

        // Allergy codes
        elgEligHealthDefaultsEhd.setEhdAllergyCode1Ind(eligMemberHealthDefaultDetailForm.getEhdAllergyCode1Ind());
        elgEligHealthDefaultsEhd.setEhdAllergyCode2Ind(eligMemberHealthDefaultDetailForm.getEhdAllergyCode2Ind());
        elgEligHealthDefaultsEhd.setEhdAllergyCode3Ind(eligMemberHealthDefaultDetailForm.getEhdAllergyCode3Ind());
        elgEligHealthDefaultsEhd.setEhdAllergyCode4Ind(eligMemberHealthDefaultDetailForm.getEhdAllergyCode4Ind());
        elgEligHealthDefaultsEhd.setEhdAllergyCode5Ind(eligMemberHealthDefaultDetailForm.getEhdAllergyCode5Ind());
        elgEligHealthDefaultsEhd.setEhdAllergyCode6Ind(eligMemberHealthDefaultDetailForm.getEhdAllergyCode6Ind());

        elgEligHealthDefaultsEhd.setEhdAllergyCode1(eligMemberHealthDefaultDetailForm.getEhdAllergyCode1());
        elgEligHealthDefaultsEhd.setEhdAllergyCode2(eligMemberHealthDefaultDetailForm.getEhdAllergyCode2());
        elgEligHealthDefaultsEhd.setEhdAllergyCode3(eligMemberHealthDefaultDetailForm.getEhdAllergyCode3());
        elgEligHealthDefaultsEhd.setEhdAllergyCode4(eligMemberHealthDefaultDetailForm.getEhdAllergyCode4());
        elgEligHealthDefaultsEhd.setEhdAllergyCode5(eligMemberHealthDefaultDetailForm.getEhdAllergyCode5());
        elgEligHealthDefaultsEhd.setEhdAllergyCode6(eligMemberHealthDefaultDetailForm.getEhdAllergyCode6());


        // Misc Codes

        elgEligHealthDefaultsEhd.setEhdHeightInd(eligMemberHealthDefaultDetailForm.getEhdHeightInd());
        elgEligHealthDefaultsEhd.setEhdHeight(
                eligMemberHealthDefaultDetailForm.getEhdHeight() != null ? eligMemberHealthDefaultDetailForm.getEhdHeight() : BigDecimal.ZERO
        );

        elgEligHealthDefaultsEhd.setEhdWeightInd(eligMemberHealthDefaultDetailForm.getEhdWeightInd());
        elgEligHealthDefaultsEhd.setEhdWeight(
                eligMemberHealthDefaultDetailForm.getEhdWeight() != null ? eligMemberHealthDefaultDetailForm.getEhdWeight() : BigDecimal.ZERO
        );

        elgEligHealthDefaultsEhd.setEhdBloodTypeInd(eligMemberHealthDefaultDetailForm.getEhdBloodTypeInd());
        elgEligHealthDefaultsEhd.setEhdBloodType(eligMemberHealthDefaultDetailForm.getEhdBloodType());

        elgEligHealthDefaultsEhd.setEhdSmokingInd(eligMemberHealthDefaultDetailForm.getEhdSmokingInd());
        elgEligHealthDefaultsEhd.setEhdSmokingCode(eligMemberHealthDefaultDetailForm.getEhdSmokingCode());

        elgEligHealthDefaultsEhd.setEhdAlcoholInd(eligMemberHealthDefaultDetailForm.getEhdAlcoholInd());
        elgEligHealthDefaultsEhd.setEhdAlcoholCode(eligMemberHealthDefaultDetailForm.getEhdAlcoholCode());

        elgEligHealthDefaultsEhd.setEhdPregnancyInd(eligMemberHealthDefaultDetailForm.getEhdPregnancyInd());
        elgEligHealthDefaultsEhd.setEhdPregnantCode(eligMemberHealthDefaultDetailForm.getEhdPregnantCode());

        elgEligHealthDefaultsEhd.setEhdContactLensInd(eligMemberHealthDefaultDetailForm.getEhdContactLensInd());
        elgEligHealthDefaultsEhd.setEhdContactLensCode(eligMemberHealthDefaultDetailForm.getEhdContactLensCode());

        elgEligHealthDefaultsEhd.setEhdMiscCode1Ind(eligMemberHealthDefaultDetailForm.getEhdMiscCode1Ind());
        elgEligHealthDefaultsEhd.setEhdMiscCode1(eligMemberHealthDefaultDetailForm.getEhdMiscCode1());

        // Print option
        elgEligHealthDefaultsEhd.setEhdMiscCode2Ind(eligMemberHealthDefaultDetailForm.getEhdMiscCode2Ind());
        elgEligHealthDefaultsEhd.setEhdMiscCode2(eligMemberHealthDefaultDetailForm.getEhdMiscCode2());


        // Update info
        elgEligHealthDefaultsEhd.setChgDate(DateUtils.currentDate());
        elgEligHealthDefaultsEhd.setChgTime(DateUtils.currentTime());
        elgEligHealthDefaultsEhd.setChgProgramName("JAVA_PRG");
        elgEligHealthDefaultsEhd.setChgUserName("TEST_USER");

        return elgEligHealthDefaultsEhd;
    }

    private boolean allergyCodeExists(String allergyCode) {
        return (elgAllergyRepository.findByallergyCode(allergyCode) != null);
    }
}
