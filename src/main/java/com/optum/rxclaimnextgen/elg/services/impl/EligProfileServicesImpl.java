package com.optum.rxclaimnextgen.elg.services.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.optum.ibm.entities.ObjectStatistics;
import com.optum.ibm.entities.Sysschemas;
import com.optum.ibm.entities.Systables;
import com.optum.ibm.repositories.ObjectStatisticsRepository;
import com.optum.ibm.repositories.SysschemasRepository;
import com.optum.ibm.repositories.SystablesRepository;
import com.optum.rxclaimnextgen.elg.entities.*;
import com.optum.rxclaimnextgen.elg.exceptions.ValidationException;
import com.optum.rxclaimnextgen.elg.pojo.*;
import com.optum.rxclaimnextgen.elg.projections.*;
import com.optum.rxclaimnextgen.elg.repositories.*;
import com.optum.rxclaimnextgen.elg.services.EligProfileServices;
import com.optum.rxclaimnextgen.elg.services.NonEligAPIServices;
import com.optum.rxclaimnextgen.elg.services.helper.EligQueueDetailServiceHelper;
import com.optum.rxclaimnextgen.elg.utils.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.optum.rxclaimnextgen.elg.utils.Utils.isListNotEmpty;

/**
 * Created by bkocinsk on 5/29/2018.
 */
@Service
public class EligProfileServicesImpl implements EligProfileServices {

    private static final Logger LOG = LoggerFactory.getLogger(EligProfileServicesImpl.class);

    @Autowired
    private ElgAclAccountListRepository elgAclAccountListRepo;

    @Autowired
    private NonEligAPIServices nonEligAPIServices;


    @Autowired
    private ElgAldAccountListDetailRepository elgAldAccountListDetailRepo;

    @Autowired
    private ElgCrdCarrierListDetailRepository elgCrdCarrierListDetailRepo;

    @Autowired
    private ElgCrlCarrierListRepository elgCrlCarrierListRepo;

    @Autowired
    private ElgGldGroupListDetailRepository elgGldGroupListDetailRepo;

    @Autowired
    private ElgGrlGroupListRepository elgGrlGroupListRepo;

    @Autowired
    private ElgPlatformIdRepository elgPlatformIdRepo;

    @Autowired
    private ElgPlatformCarrierMapRepository elgPlatformCarrierMapRepo;

    @Autowired
    private ElgEligProfileEpfRepository eligProfEpfRepo;

    @Autowired
    private ElgProfileViewRepository elgProfileDataRepository;

    @Autowired
    private ElgGroupGrpRepository elgGroupGrpRepo;

    @Autowired
    private ElgEodEligOverrideDfltsRepository elgEodEligOverrideDfltsRepo;

    @Autowired
    private ElgEligWCDefaultsEwdRepository elgEligWCDefaultsEwdRepo;

    @Autowired
    private ElgEqdEligQueueDefaultsRepository elgEqdEligQueueDefaultsRepo;

    @Autowired
    private ElgCarrierCarRepository elgCarrierCarRepo;

    @Autowired
    private ElgAccountAccRepository elgAccountAccRepo;

    @Autowired
    private ElgEligMemberDefaultsEmdRepository elgEligMemberDefaultsEmdRepo;

    @Autowired
    private ElgEligHealthDefaultsEhdRepository elgEligHealthDefaultsEhdRepo;

    @Autowired
    private ElgEligGroupDefaultsEgdRepository elgEligGroupDefaultsEgdRepo;

    @Autowired
    private ElgMemberPartdDefaultsEmpRepository elgMemberPartdDefaultsEmpRepo;

    @Autowired
    private ElgMbrOtherCoverageDefaultsEmcRepository elgMbrOtherCoverageDefaultsEmcRepo;

    /*  *****************  IBM Catalog Repositories ***********************/

    @Autowired
    private SystablesRepository systablesRepository;

    @Autowired
    private SysschemasRepository sysschemasRepository;

    @Autowired
    private ObjectStatisticsRepository objectStatisticsRepositoryRepository;
    
    @Autowired
    private EligQueueDetailServiceHelper eligQueueDetailServiceHelper;


     /*  *****************  IBM Catalog Repositories ***********************/


    public ElgAclAccountList findByAclAccountListName(String aclAccountListName) {
        ElgAclAccountList results = elgAclAccountListRepo.findByAclAccountListName(aclAccountListName);
        return results;
    }

    public ElgAldAccountListDetail findByAclAccountListNameAndCarrierIdAndAccAccountId(ElgAldAccountListDetailPK pk) {
        ElgAldAccountListDetail results =
                elgAldAccountListDetailRepo.findByAclAccountListNameAndCarCarrierIdAndAccAccountId(pk.getAclAccountListName(), pk.getCarCarrierId(), pk.getAccAccountId());
        return results;
    }

    public ElgCrdCarrierListDetail findByCrlCarrierListNameAndCarCarrierId(String crlCarrierListName, String carCarrierId) {
        ElgCrdCarrierListDetail results = elgCrdCarrierListDetailRepo.findByCrlCarrierListNameAndCarCarrierId(crlCarrierListName, carCarrierId);
        return results;
    }

    public ElgCrlCarrierList findByCrlCarrierListName(String crlCarrierListName) {
        ElgCrlCarrierList results = elgCrlCarrierListRepo.findByCrlCarrierListName(crlCarrierListName);
        return results;
    }

    public ElgGldGroupListDetail findByGroupListDetailPrimaryKey(String grlGroupListName, String carCarrierId, String accAccountId, String grpGroupId) {
        ElgGldGroupListDetail results =
                elgGldGroupListDetailRepo.findByGrlGroupListNameAndCarCarrierIdAndAccAccountIdAndGrpGroupId(grlGroupListName, carCarrierId, accAccountId, grpGroupId);
        return results;
    }

    public ElgGrlGroupList findByGrlGroupListName(String grlGroupListName) {
        ElgGrlGroupList results = elgGrlGroupListRepo.findByGrlGroupListName(grlGroupListName);
        return results;
    }


    public ElgPlatformId findByPlatformId(String platformId) {
        ElgPlatformId results = elgPlatformIdRepo.findByPlatformId(platformId);
        return results;
    }

    public List<ElgEligProfileEpf> findByCarCarrierId(String carCarrierId) {
        List<ElgEligProfileEpf> results = eligProfEpfRepo.findByCarCarrierId(carCarrierId);
        return results;
    }

    public List<ElgPlatformCarrierMap> findMapByPlatformId(String platformId) {
        List<ElgPlatformCarrierMap> results = elgPlatformCarrierMapRepo.findByPlatformId(platformId);
        return results;
    }

    public ElgPlatformCarrierMap findMapByPlatformIdAndCarrierId(String platformId, String carrierId) {
        ElgPlatformCarrierMap results = elgPlatformCarrierMapRepo.findByPlatformIdAndCarrierId(platformId, carrierId);
        return results;
    }

    public List<String> getAllPlatforms() {
        List<String> results = elgPlatformIdRepo.getAllPlatforms();
        return results;
    }

    public List<String> getAllCarrierLists() {
        List<String> results = elgCrlCarrierListRepo.getAllCarrierLists();
        return results;
    }

    public List<String> getAllCarrierIdsbyCarrierList(String carrierList) {
        List<String> results = elgCrlCarrierListRepo.getAllCarrierIdsbyCarrierList(carrierList);
        return results;
    }

    /**
     * Fetch all eligibility profile data and prepare required data list from
     * row data after fetching database.
     */
    @Override
    public List<EligProfileView> findAllEligProfileData() {
        return populateEligProfileView(elgProfileDataRepository.findElgProfileData());
    }

    /**
     * Take raw data and populate into list of view object to display in UI.
     *
     * @param eligProfileEntities
     * @return
     */
    private List<EligProfileView> populateEligProfileView(List<ElgProfileViewEntity> eligProfileEntities) {
        List<EligProfileView> eligProfileView = new ArrayList<EligProfileView>();
        EligProfileView eligProfile = null;
        if (null != eligProfileEntities && !eligProfileEntities.isEmpty()) {
            for (ElgProfileViewEntity eligProfileEntity : eligProfileEntities) {
                eligProfile = new EligProfileView();
                eligProfile.setPlatformId(StringUtils.trim(eligProfileEntity.getPlatformId()));
                eligProfile.setCarCarrierId(StringUtils.trim(eligProfileEntity.getCarCarrierId()));
                eligProfile.setAccountId(StringUtils.trim(eligProfileEntity.getAccountId()));
                eligProfile.setGroupId(StringUtils.trim(eligProfileEntity.getGroupId()));
                eligProfile.setLastLoad(DateUtils.convertDateToString(eligProfileEntity.getEpfCurrentLoadDate()));
                eligProfile.setCount(eligProfileEntity.getEpfCurrentLoaded());
                eligProfile.setIdentifier(StringUtils.trim(eligProfileEntity.getEpfLoadIdentifier()));
                eligProfile.setVersion(StringUtils.trim(eligProfileEntity.getEpfReformatVersion()));
                eligProfile.setReformat(StringUtils.trim(eligProfileEntity.getEpfReformatPgm()));
                eligProfile.setLoad(StringUtils.trim(eligProfileEntity.getEpfLoadType()));
                eligProfile.setEpfStatus(StringUtils.trim(eligProfileEntity.getEpfStatus()));
                eligProfileView.add(eligProfile);
            }
        }
        return eligProfileView;
    }

    public Systables findByTableNameAndTableSchema(String tableName, String tableSchema) {
        Systables results = systablesRepository.findByTableNameAndTableSchema(tableName, tableSchema);
        return results;

    }

    public Sysschemas findBySchemaName(String schemaName) {
        Sysschemas results = sysschemasRepository.findBySchemaName(schemaName);
        return results;
    }

    public ObjectStatistics findProgramStatInfo(String programSchema, String programName) {
        ObjectStatistics results =
                objectStatisticsRepositoryRepository.findStats(programSchema.toUpperCase(), programName.toUpperCase());
        return results;
    }

    public ElgEligProfileEpf saveProfileDetail(String jsonString, String mode) throws IOException, ValidationException {
        String results = null;
        ObjectMapper mapper = new ObjectMapper();
        EligProfileDetailForm formData = mapper.readValue(jsonString, new TypeReference<EligProfileDetailForm>() {
        });
        // change status back to the status code Active should be A, Inactive should be I
        if (formData.getEpfStatus().length() > 1) {
            formData.setEpfStatus(formData.getEpfStatus().substring(0, 1));
        }
        HashMap<String, String> validationErrors = validateProfileDetailForm(formData);
        if (validationErrors.isEmpty()) {
            if ("add".equalsIgnoreCase(mode)) {
                return callUpsertForAdd(formData);
            } else {
                // call the ElgEligProfileEpf repository save method to save to db
                return callUpsert(formData);
            }
        } else {
            // An error occurred. Throw an exception
            throw new ValidationException(mapper.writer().writeValueAsString(validationErrors));
        }

    }


    public static boolean validAlphaNumString(String inputString) {
        int numberCount = 0;
        int alphaCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isDigit(inputString.charAt(i))) {
                numberCount++;
            }
            if (Character.isAlphabetic(inputString.charAt(i))) {
                alphaCount++;
            }
        }
        if (alphaCount > 0 && numberCount > 0) {
            return true;
        } else {
            return false;
        }
    }


    private HashMap<String, String> validateProfileDetailForm(EligProfileDetailForm formData) {
        HashMap validationErrors = new HashMap<String, String>();
        boolean foundAnError = false;
        // Adding methiod to check Must contain both letter and numbers

        String loadIdentifier = formData.getEpfLoadIdentifier();
        String reformatProgram = formData.getEpfReformatPgm();


        if (!validAlphaNumString(loadIdentifier)) {
            validationErrors.put("epfLoadIdentifier", "Must contain both letters and numbers");
            foundAnError = true;

        }
        if (isLoadIdentifierDuplicate(formData.getCarCarrierId(), formData.getAccountId(),
                formData.getGroupId(), formData.getEpfLoadIdentifier())) {
            validationErrors.put("epfLoadIdentifier", "Identifier must be unique");
            foundAnError = true;
        }

        if (formData.getEpfGroupListName() != "") {
            ElgGrlGroupList groupList = findByGrlGroupListName(formData.getEpfGroupListName());
            if (groupList == null) {
                validationErrors.put("epfGroupListName", "C/A/G Eligibility List entered is invalid");
                foundAnError = true;
            }

        }


        // check to make sure reformat program exists in sysprogramstat table
        Sysschemas schema = findBySchemaName(formData.getEpfLibraryName());
        if (schema == null) {
            validationErrors.put("epfLibraryName", "Library name was not found");
            foundAnError = true;
        } else {
            // check to make sure reformat program exists in sysprogramstat table
            ObjectStatistics programStatInfo = findProgramStatInfo(formData.getEpfLibraryName(), formData.getEpfReformatPgm());
            if (programStatInfo == null) {
                validationErrors.put("epfReformatPgm", "Reformat program was not found");
                foundAnError = true;
            }
            if (!formData.getEpfPostProcessProgram().isEmpty()) { // Validate Post Process PGM if supplied
                ObjectStatistics postProcessProgramStatInfo = findProgramStatInfo(formData.getEpfLibraryName(), formData.getEpfPostProcessProgram());
                if (postProcessProgramStatInfo == null) {
                    validationErrors.put("epfPostProcessProgram", "Post-Load Process entered cannot be found in library");
                    foundAnError = true;
                }
            }
        }
        return validationErrors;
    }

    public ElgEligProfileEpf getProfileByPrimaryKey(String carrierId, String accountId, String groupId) {
        //return eligProfEpfRepo.find(new ElgEligProfileEpfPK(carrierId, accountId, groupId));
        return eligProfEpfRepo.findByCarCarrierIdAndAccountIdAndGroupId(carrierId, accountId, groupId);
    }

    @Override
    public ElgEligProfileEpf upsert(ElgEligProfileEpf elgEligProfileEpf) {
        return eligProfEpfRepo.saveAndFlush(elgEligProfileEpf);

    }

    private ElgEligProfileEpf callUpsert(EligProfileDetailForm eligProfileDetailForm) {
        ElgEligProfileEpf elgEligProfileEpf;
        elgEligProfileEpf = getProfileByPrimaryKey(eligProfileDetailForm.getCarCarrierId(), eligProfileDetailForm.getAccountId(), eligProfileDetailForm.getGroupId());
        elgEligProfileEpf.setEpfReformatVersion(eligProfileDetailForm.getEpfReformatVersion());
        elgEligProfileEpf.setEpfLoadIdentifier(eligProfileDetailForm.getEpfLoadIdentifier());
        elgEligProfileEpf.setEpfReformatPgm(eligProfileDetailForm.getEpfReformatPgm());
        elgEligProfileEpf.setEpfLibraryName(eligProfileDetailForm.getEpfLibraryName());
        elgEligProfileEpf.setEpfStatus(eligProfileDetailForm.getEpfStatus());
        elgEligProfileEpf.setEpfStageGroupsInd(eligProfileDetailForm.getEpfStageGroupsInd());
        elgEligProfileEpf.setEpfLoadType(eligProfileDetailForm.getEpfLoadType());
        elgEligProfileEpf.setEpfMbrFileName(eligProfileDetailForm.getEpfMbrFileName());
        elgEligProfileEpf.setEpfMbrMediaRecordLen(Integer.parseInt(eligProfileDetailForm.getEpfMbrMediaRecordLen()));
        elgEligProfileEpf.setEpfRejection(Integer.parseInt(eligProfileDetailForm.getEpfRejection()));
        elgEligProfileEpf.setEpfTermThresholdTba(Integer.parseInt(eligProfileDetailForm.getEpfTermThresholdTba()));
        elgEligProfileEpf.setEpfTermDaysQualifier(eligProfileDetailForm.getEpfTermDaysQualifier());
        elgEligProfileEpf.setEpfTermNbrOfDays(Integer.parseInt(eligProfileDetailForm.getEpfTermNbrOfDays()));
        elgEligProfileEpf.setEpfGroupLoadType(eligProfileDetailForm.getEpfGroupLoadType());
        elgEligProfileEpf.setEpfGrpMediaRecordLen(Integer.parseInt(eligProfileDetailForm.getEpfGrpMediaRecordLen()));
        elgEligProfileEpf.setEpfGroupRefreshRej(Integer.parseInt(eligProfileDetailForm.getEpfGroupRefreshRej()));
        elgEligProfileEpf.setEpfTermedMembersRpt(eligProfileDetailForm.getEpfTermedMembersRpt());
        elgEligProfileEpf.setEpfTermCareAssignment(eligProfileDetailForm.getEpfTermCareAssignment());
        elgEligProfileEpf.setEpfSuspendProcessing(eligProfileDetailForm.getEpfSuspendProcessing());
        elgEligProfileEpf.setEpfRejectionLookup(eligProfileDetailForm.getEpfRejectionLookup());
        elgEligProfileEpf.setEpfPrintMbrGrpErrors(eligProfileDetailForm.getEpfPrintMbrGrpErrors());
        elgEligProfileEpf.setEpfPostProcessProgram(eligProfileDetailForm.getEpfPostProcessProgram());
        elgEligProfileEpf.setEpfGroupListName(eligProfileDetailForm.getEpfGroupListName());

        elgEligProfileEpf.setChgDate(DateUtils.currentDate());
        elgEligProfileEpf.setChgTime(DateUtils.currentTime());
        elgEligProfileEpf.setChgUserName("TEST_USER");
        elgEligProfileEpf.setChgProgramName("RXCNXGEELG");
        return upsert(elgEligProfileEpf);
    }

    private ElgEligProfileEpf callUpsertForAdd(EligProfileDetailForm eligProfileDetailForm) {
        java.sql.Date defaultDate = DateUtils.getDefaultValueWhenDateIsNull();
        ElgEligProfileEpf elgEligProfileEpf = new ElgEligProfileEpf();
        elgEligProfileEpf.setCarCarrierId(eligProfileDetailForm.getCarCarrierId());
        elgEligProfileEpf.setAccountId(eligProfileDetailForm.getAccountId());
        elgEligProfileEpf.setGroupId(eligProfileDetailForm.getGroupId());
        elgEligProfileEpf.setEpfReformatVersion(eligProfileDetailForm.getEpfReformatVersion());
        elgEligProfileEpf.setEpfLoadIdentifier(eligProfileDetailForm.getEpfLoadIdentifier());
        elgEligProfileEpf.setEpfReformatPgm(eligProfileDetailForm.getEpfReformatPgm());
        elgEligProfileEpf.setEpfLibraryName(eligProfileDetailForm.getEpfLibraryName());
        elgEligProfileEpf.setEpfStatus("A");

        if (eligProfileDetailForm.getEpfStageGroupsInd() != null && !eligProfileDetailForm.getEpfStageGroupsInd().isEmpty()) {
            elgEligProfileEpf.setEpfStageGroupsInd(eligProfileDetailForm.getEpfStageGroupsInd());
        } else {
            elgEligProfileEpf.setEpfStageGroupsInd("");
        }

        if (eligProfileDetailForm.getEpfLoadType() != null && !eligProfileDetailForm.getEpfLoadType().isEmpty()) {
            elgEligProfileEpf.setEpfLoadType(eligProfileDetailForm.getEpfLoadType());
        } else {
            elgEligProfileEpf.setEpfLoadType("");
        }
        if (eligProfileDetailForm.getEpfMbrFileName() != null && !eligProfileDetailForm.getEpfMbrFileName().isEmpty()) {
            elgEligProfileEpf.setEpfMbrFileName(eligProfileDetailForm.getEpfMbrFileName());
            elgEligProfileEpf.setEpfMbrMediaRecordLen(Integer.parseInt(eligProfileDetailForm.getEpfMbrMediaRecordLen()));
        } else {
            elgEligProfileEpf.setEpfMbrFileName("");
            elgEligProfileEpf.setEpfMbrMediaRecordLen(0);
        }

        if (eligProfileDetailForm.getEpfRejection() != null && !eligProfileDetailForm.getEpfRejection().isEmpty()) {
            elgEligProfileEpf.setEpfRejection(Integer.parseInt(eligProfileDetailForm.getEpfRejection()));
        } else {
            elgEligProfileEpf.setEpfRejection(0);
        }

        if (eligProfileDetailForm.getEpfTermThresholdTba() != null && !eligProfileDetailForm.getEpfTermThresholdTba().isEmpty()) {
            elgEligProfileEpf.setEpfTermThresholdTba(Integer.parseInt(eligProfileDetailForm.getEpfTermThresholdTba()));
        } else {
            elgEligProfileEpf.setEpfTermThresholdTba(100);
        }

        if (eligProfileDetailForm.getEpfTermDaysQualifier() != null && eligProfileDetailForm.getEpfTermDaysQualifier().isEmpty()) {
            elgEligProfileEpf.setEpfTermDaysQualifier(eligProfileDetailForm.getEpfTermDaysQualifier());
        } else {
            elgEligProfileEpf.setEpfTermDaysQualifier("A");
        }
        if (eligProfileDetailForm.getEpfTermNbrOfDays() != null && !eligProfileDetailForm.getEpfTermNbrOfDays().isEmpty()) {
            elgEligProfileEpf.setEpfTermNbrOfDays(Integer.parseInt(eligProfileDetailForm.getEpfTermNbrOfDays()));
        } else {
            elgEligProfileEpf.setEpfTermNbrOfDays(2);
        }

        if (eligProfileDetailForm.getEpfGroupLoadType() != null && !eligProfileDetailForm.getEpfGroupLoadType().isEmpty()) {
            elgEligProfileEpf.setEpfGroupLoadType(eligProfileDetailForm.getEpfGroupLoadType());
        } else {
            elgEligProfileEpf.setEpfGroupLoadType("U");
        }

        if (eligProfileDetailForm.getEpfGroupRefreshRej() != null && !eligProfileDetailForm.getEpfGroupRefreshRej().isEmpty()) {
            elgEligProfileEpf.setEpfGroupRefreshRej(Integer.parseInt(eligProfileDetailForm.getEpfGroupRefreshRej()));
        } else {
            elgEligProfileEpf.setEpfGroupRefreshRej(0);
        }

        if (eligProfileDetailForm.getEpfTermedMembersRpt() != null && !eligProfileDetailForm.getEpfTermedMembersRpt().isEmpty()) {
            elgEligProfileEpf.setEpfTermedMembersRpt(eligProfileDetailForm.getEpfTermedMembersRpt());
        } else {
            elgEligProfileEpf.setEpfTermedMembersRpt("");
        }

        if (eligProfileDetailForm.getEpfTermCareAssignment() != null && !eligProfileDetailForm.getEpfTermCareAssignment().isEmpty()) {
            elgEligProfileEpf.setEpfTermCareAssignment(eligProfileDetailForm.getEpfTermCareAssignment());
        } else {
            elgEligProfileEpf.setEpfTermCareAssignment("N");
        }

        if (eligProfileDetailForm.getEpfSuspendProcessing() != null && !eligProfileDetailForm.getEpfSuspendProcessing().isEmpty()) {
            elgEligProfileEpf.setEpfSuspendProcessing(eligProfileDetailForm.getEpfSuspendProcessing());
        } else {
            elgEligProfileEpf.setEpfSuspendProcessing("N");
        }

        if (eligProfileDetailForm.getEpfRejectionLookup() != null && !eligProfileDetailForm.getEpfRejectionLookup().isEmpty()) {
            elgEligProfileEpf.setEpfRejectionLookup(eligProfileDetailForm.getEpfRejectionLookup());
        } else {
            elgEligProfileEpf.setEpfRejectionLookup("");
        }

        if (eligProfileDetailForm.getEpfPrintMbrGrpErrors() != null && !eligProfileDetailForm.getEpfPrintMbrGrpErrors().isEmpty()) {
            elgEligProfileEpf.setEpfPrintMbrGrpErrors(eligProfileDetailForm.getEpfPrintMbrGrpErrors());
        } else {
            elgEligProfileEpf.setEpfPrintMbrGrpErrors("");
        }

        if (eligProfileDetailForm.getEpfPostProcessProgram() != null && !eligProfileDetailForm.getEpfPostProcessProgram().isEmpty()) {
            elgEligProfileEpf.setEpfPostProcessProgram(eligProfileDetailForm.getEpfPostProcessProgram());
        } else {
            elgEligProfileEpf.setEpfPostProcessProgram("");
        }

        if (eligProfileDetailForm.getEpfGroupListName() != null && !eligProfileDetailForm.getEpfGroupListName().isEmpty()) {
            elgEligProfileEpf.setEpfGroupListName(eligProfileDetailForm.getEpfGroupListName());
        } else {
            elgEligProfileEpf.setEpfGroupListName("");
        }

        if (eligProfileDetailForm.getEpfGrpFileName() != null && !eligProfileDetailForm.getEpfGrpFileName().isEmpty()) {
            elgEligProfileEpf.setEpfGrpFileName(eligProfileDetailForm.getEpfGrpFileName());
            elgEligProfileEpf.setEpfGrpMediaRecordLen(Integer.parseInt(eligProfileDetailForm.getEpfGrpMediaRecordLen()));
        } else {
            elgEligProfileEpf.setEpfGrpFileName("");
            elgEligProfileEpf.setEpfGrpMediaRecordLen(0);
        }

        // these aren't on the form so set to default values
        elgEligProfileEpf.setEpfMediaFrequency(0);
        elgEligProfileEpf.setEpfMediaType("");
        elgEligProfileEpf.setEpfMbrMediaBlockLen(0);
        elgEligProfileEpf.setEpfMbrMediaNbrReels(0);
        elgEligProfileEpf.setEpfMbrMediaLabels("");
        elgEligProfileEpf.setEpfMbrTapeSeqNbr(0);
        elgEligProfileEpf.setEpfGrpMediaBlockLen(0);
        elgEligProfileEpf.setEpfGrpMediaNbrReels(0);
        elgEligProfileEpf.setEpfGrpMediaLabels("");
        elgEligProfileEpf.setEpfGroupTapeSeqNbr(0);
        elgEligProfileEpf.setEpfCurrentStageDt(defaultDate);
        elgEligProfileEpf.setEpfCurrentInput(0);
        elgEligProfileEpf.setEpfCurrentStaged(0);
        elgEligProfileEpf.setEpfCurrentLoaded(0);
        elgEligProfileEpf.setEpfCurrentRejected(0);
        elgEligProfileEpf.setEpfCurrentLoadDate(defaultDate);
        elgEligProfileEpf.setEpfPreviousStageDt(defaultDate);
        elgEligProfileEpf.setEpfPreviousInput(0);
        elgEligProfileEpf.setEpfPreviousStaged(0);
        elgEligProfileEpf.setEpfPreviousLoaded(0);
        elgEligProfileEpf.setEpfPreviousRejected(0);
        elgEligProfileEpf.setEpfPreviousLoadDt(defaultDate);
        elgEligProfileEpf.setEpfPriorStageDate(defaultDate);
        elgEligProfileEpf.setEpfPriorInput(0);
        elgEligProfileEpf.setEpfPriorStaged(0);
        elgEligProfileEpf.setEpfPriorLoaded(0);
        elgEligProfileEpf.setEpfPriorRejected(0);
        elgEligProfileEpf.setEpfPriorLoadDate(defaultDate);
        elgEligProfileEpf.setEpfStageLoadInProcess("");
        elgEligProfileEpf.setEpfErrorsInLastRun("");
        elgEligProfileEpf.setEpfIdCard("");
        elgEligProfileEpf.setEpfGroupListName("");
        elgEligProfileEpf.setEpfTermThresholdExp(0);
        elgEligProfileEpf.setEpfDeviceName("TAP01");
        elgEligProfileEpf.setEpfTapeCharacterCode("E");
        elgEligProfileEpf.setAddProgramName("RXCNXGEELG");
        elgEligProfileEpf.setAddUserName("");
        elgEligProfileEpf.setAddDate(DateUtils.currentDate());
        elgEligProfileEpf.setAddTime(DateUtils.currentTime());
        elgEligProfileEpf.setChgProgramName("");
        elgEligProfileEpf.setChgUserName("");
        elgEligProfileEpf.setChgDate(DateUtils.currentDate());
        elgEligProfileEpf.setChgTime(DateUtils.currentTime());
        return upsert(elgEligProfileEpf);
    }


    public List<ElgCrlCarrierListProjection> getAllCarrierIdsAndDescriptions() {
        List<ElgCrlCarrierListProjection> results = elgCrlCarrierListRepo.getAllCarrierIdsAndDescriptions();
        return results;
    }

    public List<ElgGrlGroupListProjection> getAllGroupNamesAndDescriptions() {
        List<ElgGrlGroupListProjection> results = elgGrlGroupListRepo.getAllGroupNamesAndDescriptions();
        return results;
    }

    public List<EligGroupListNames> getAllGroupsForGroupNameList(String groupListName) {
        List<Object> results = elgGroupGrpRepo.getAllGroupsForGroupListName(groupListName);
        List<EligGroupListNames> grpList = new ArrayList<EligGroupListNames>();
        for (int i = 0; i < results.size(); i++) {
            Object[] row = (Object[]) results.get(i);
            EligGroupListNames nm = new EligGroupListNames();
            nm.setCarCarrierId((String) row[0]);
            nm.setAccAccountId((String) row[1]);
            nm.setGrpGroupId((String) row[2]);
            nm.setGrpGroupName((String) row[3]);
            grpList.add(nm);
        }

        return grpList;
    }

    public ElgGroupGrp findByGroupPrimaryKey(String carCarrierId, String accountId, String groupId) {
        ElgGroupGrp results = elgGroupGrpRepo.findByCarCarrierIdAndAccAccountIdAndGrpGroupId(carCarrierId, accountId, groupId);
        return results;
    }

    public List<EligGroupListNamesNoProfiles> getAllGroupsWithoutEligProfiles() {
    	LOG.info(">>> enter in getAllGroupsWithoutEligProfiles >>>");
        List<Object> results = elgGroupGrpRepo.getAllGroupsWithoutEligProfiles();
        List<EligGroupListNamesNoProfiles> grpList = new ArrayList<EligGroupListNamesNoProfiles>();
        for (int i = 0; i < results.size(); i++) {
            Object[] row = (Object[]) results.get(i);
            EligGroupListNamesNoProfiles nm = new EligGroupListNamesNoProfiles();
            nm.setCarCarrierId((String) row[0]);
            nm.setAccAccountId((String) row[1]);
            nm.setGrpGroupId((String) row[2]);
            nm.setGrpGroupName((String) row[3]);
            nm.setPlatformId((String) row[4]);
            grpList.add(nm);
        }
        return grpList;
    }

    public ElgEodEligOverrideDflts getOverrideDfltsByPrimaryKey(String carCarrierId, String accountId, String groupId) {
        ElgEodEligOverrideDflts results = elgEodEligOverrideDfltsRepo.findByCarCarrierIdAndAccountIdAndGroupId(carCarrierId, accountId, groupId);
        return results;
    }

    public ElgEligWCDefaultsEwd getEligWCDefaultsByPrimaryKey(String carCarrierId, String accountId, String groupId) {
        ElgEligWCDefaultsEwd results = elgEligWCDefaultsEwdRepo.findByCarCarrierIdAndAccountIdAndGroupId(carCarrierId, accountId, groupId);
        return results;

    }

    public ElgEqdEligQueueDefaults getEligQueueDefaultsByPrimaryKey(String carCarrierId, String accountId, String groupId, String reportName) {
        ElgEqdEligQueueDefaults results = elgEqdEligQueueDefaultsRepo.findByCarCarrierIdAndEqdAccountIdAndEqdGroupIdAndEqdReportName(carCarrierId, accountId, groupId, reportName);
        return results;
    }

    public List<ElgEqdEligQueueDefaultsProjection> getEligQueueDefaultsForProfile(String carCarrierId, String accountId, String groupId) {
        return elgEqdEligQueueDefaultsRepo.getAllEligQueuesForProfile(carCarrierId, accountId, groupId);
    }

    public Boolean checkIfCopayScheduleExists(String platformId, String copayScheduleName, String stepNumber) throws Exception {
        String api = "/getCscCopayScheduleByPrimaryKey?cid=" + copayScheduleName.trim() + "&sid=" + stepNumber.trim();
        String results = nonEligAPIServices.callNonEligDataService(platformId, api);
        if (results == null || results.isEmpty()) {
            return Boolean.FALSE;
        } else {
            return Boolean.TRUE;
        }
    }

    public List<CnwCareNetwork> getCareNetworkByCarrierIdAndNetworkId(String platformId, String carrierId, String networkId) throws Exception {
        String api = "/getCareNetworkByCarrierIdAndNetworkId?cid=" + carrierId.trim() + "&nid=" + networkId.trim();
        String results = nonEligAPIServices.callNonEligDataService(platformId, api);
        List<CnwCareNetwork> cnwList = new ArrayList<CnwCareNetwork>();
        if (results != null && !results.isEmpty()) {
            ObjectMapper mapper = new ObjectMapper();
            cnwList = mapper.readValue(results, new TypeReference<List<CnwCareNetwork>>() {
            });
        }
        return cnwList;
    }

    public List<PlnPlan> getPlanByPlanCodeAndEffDate(String platformId, String planCode, String effDate) throws Exception {
        String api = "/getPlanByPlanCodeAndEffDate?pc=" + planCode.trim() + "&efd=" + effDate.trim();
        String results = nonEligAPIServices.callNonEligDataService(platformId, api);
        List<PlnPlan> planList = new ArrayList<PlnPlan>();
        if (results != null && !results.isEmpty()) {
            ObjectMapper mapper = new ObjectMapper();
            planList = mapper.readValue(results, new TypeReference<List<PlnPlan>>() {
            });
        }
        return planList;
    }

    public Boolean checkIfCareFacilityExists(String platformId, String carrierId, String careFacilityId) throws Exception {
        String api = "/getCareFacilityByPrimaryKey?cid=" + carrierId.trim() + "&cfid=" + careFacilityId.trim();
        String results = nonEligAPIServices.callNonEligDataService(platformId, api);
        if (results == null || results.isEmpty()) {
            return Boolean.FALSE;
        } else {
            return Boolean.TRUE;
        }
    }

    public List<CquCareQualifier> getCareQualifierByCarrierIdAndQualifierId(String platformId, String carrierId, String qualifierId) throws Exception {
        String api = "/getCareQualifierByCarrierIdAndQualifierId?cid=" + carrierId.trim() + "&qid=" + qualifierId.trim();
        String results = nonEligAPIServices.callNonEligDataService(platformId, api);
        List<CquCareQualifier> cquList = new ArrayList<CquCareQualifier>();
        if (results != null && !results.isEmpty()) {
            ObjectMapper mapper = new ObjectMapper();
            cquList = mapper.readValue(results, new TypeReference<List<CquCareQualifier>>() {
            });
        }
        return cquList;
    }


    private boolean isLoadIdentifierDuplicate(String carCarrierId, String accountId, String groupId, String epfLoadIdentifier) {
        boolean isDuplicate = false;
        ElgEligProfileEpf epf;
        List<ElgEligProfileEpf> list = eligProfEpfRepo.findByEpfLoadIdentifier(epfLoadIdentifier);
        if (isListNotEmpty(list)) {
            epf = list.get(0);
            if (StringUtils.trim(epf.getEpfLoadIdentifier()).equals(epfLoadIdentifier)
                    && (!StringUtils.trim(epf.getCarCarrierId()).equals(carCarrierId)
                    || !StringUtils.trim(epf.getAccountId()).equals(accountId)
                    || !StringUtils.trim(epf.getGroupId()).equals(groupId))) {
                isDuplicate = true;
            }
         }
        return isDuplicate;
    }

    /**
     * Checks to see if the carrierId about to by copied is allowed for the chosen
     * platform.
     *
     * @param carrierId
     * @return true or false
     */
    public Boolean checkIfCarrierAllowedForPlatform(String platformId, String carrierId) {
        ElgPlatformCarrierMap results = elgPlatformCarrierMapRepo.findByPlatformIdAndCarrierId(platformId, carrierId);
        if (results != null && results.getCarrierId() != null && !results.getCarrierId().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }


    public Boolean checkIfCarrierExists(String carCarrierId) {
        ElgCarrierCarProjection results = elgCarrierCarRepo.findByCarCarrierId(carCarrierId);
        if (results != null && results.getCarCarrierId() != null && !results.getCarCarrierId().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean checkIfAccountExists(String carCarrierId, String accAccountId) {
        ElgAccountAccProjection results = elgAccountAccRepo.findByCarCarrierIdAndAccAccountId(carCarrierId, accAccountId);
        if (results != null && results.getCarCarrierId() != null && !results.getCarCarrierId().isEmpty() &&
                results.getAccAccountId() != null && !results.getAccAccountId().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean checkIfGroupExists(String carCarrierId, String accAccountId, String grpGroupId) {
        ElgGroupGrp results =
                elgGroupGrpRepo.findByCarCarrierIdAndAccAccountIdAndGrpGroupId(carCarrierId, accAccountId, grpGroupId);
        if (results != null && results.getCarCarrierId() != null && !results.getCarCarrierId().isEmpty() &&
                results.getAccAccountId() != null && !results.getAccAccountId().isEmpty() &&
                results.getGrpGroupId() != null && !results.getGrpGroupId().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This will copy the following profile tables from the old carrier, account, and group to
     * the new carrier, account
     *
     * 1. RCEPFP (elg_elig_profile_epf)
     * 2. RCEMDP (elg_elig_member_defaults_emd)
     * 3. RCEHDP (elg_elig_health_defaults_ehd)
     * 4. RCEGDP (elg_elig_group_defaults_egd)
     * 5. RCEWDP (elg_elig_w_c_defaults_ewd)
     * 6. RCEMPP (elg_member_partd_defaults_emp)
     * 7. RCEMCP (elg_mbr_other_coverage_defaults_emc)

     * @param jsonString
     * @return
     * @throws IOException
     * @throws ValidationException
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public CopyProfileForm copyProfile(String jsonString) throws IOException, ValidationException {
        String results = null;
        ObjectMapper mapper = new ObjectMapper();
        CopyProfileForm formData = mapper.readValue(jsonString, new TypeReference<CopyProfileForm>() {
        });
        HashMap<String, String> validationErrors = validateCopyForm(formData);

        if (validationErrors.isEmpty()) {
            // copy the data over

            ElgEligProfileEpf epf = formatCopyElgEligProfileEpf(formData);
            if (epf != null) {
                eligProfEpfRepo.saveAndFlush(epf);
            }

            ElgEligMemberDefaultsEmd emd = formatCopyMemberDefaultsEmd(formData);
            if (emd != null) {
                elgEligMemberDefaultsEmdRepo.saveAndFlush(emd);
            }

            ElgEligHealthDefaultsEhd ehd = formatCopyHealthDefaultsEhd(formData);
            if (ehd != null) {
                elgEligHealthDefaultsEhdRepo.saveAndFlush(ehd);
            }

            ElgEligGroupDefaultsEgd egd = formatCopyGroupDefaultsEgd(formData);
            if (egd != null) {
                elgEligGroupDefaultsEgdRepo.saveAndFlush(egd);
            }

            ElgEligWCDefaultsEwd ewd = formatCopyWCDefaultsEwd(formData);
            if (ewd != null) {
                elgEligWCDefaultsEwdRepo.saveAndFlush(ewd);
            }

            ElgMemberPartdDefaultsEmp emp = formatCopyMemberPartdDefaultsEmp(formData);
            if (emp != null) {
                elgMemberPartdDefaultsEmpRepo.saveAndFlush(emp);
            }

            ElgMbrOtherCoverageDefaultsEmc emc = formatCopyMbrOtherCoverageDefaultsEmc(formData);
            if (emc != null) {
                elgMbrOtherCoverageDefaultsEmcRepo.saveAndFlush(emc);
            }

            formData.setMessage("SUCCESS");
        } else {
            // An error occurred. Throw an exception
            throw new ValidationException(mapper.writer().writeValueAsString(validationErrors));
        }
        return formData;
    }

    private HashMap<String, String> validateCopyForm(CopyProfileForm formData) {
        HashMap validationErrors = new HashMap<String, String>();
        boolean foundAnError = false;

        // validate that carrier exists
        if (!checkIfCarrierExists(formData.getCarrierId())) {
            validationErrors.put("carrierId", "Carrier is invalid");
            foundAnError = true;
        }

        // validate that account exists if account is not *ALL
        if (!"*ALL".equals(formData.getAccountId().trim())) {
            if (!checkIfAccountExists(formData.getCarrierId(), formData.getAccountId())) {
                validationErrors.put("accountId", "Account is invalid");
                foundAnError = true;
            }
        }

        //validate group
        if ("*ALL".equals(formData.getAccountId().trim()) && !"*ALL".equals(formData.getGroupId().trim())) {
            validationErrors.put("groupId", "Group must be set to *ALL");
            foundAnError = true;
        } else {
            if (!"*ALL".equals(formData.getGroupId().trim())) {
                if (!checkIfGroupExists(formData.getCarrierId(), formData.getAccountId(), formData.getGroupId())) {
                    validationErrors.put("groupId", "Group is invalid");
                    foundAnError = true;
                }
            }
        }

        // validate identifier
        if (!validAlphaNumString(formData.getEpfLoadIdentifier())) {
            validationErrors.put("identifier", "Must contain both letters and numbers");
            foundAnError = true;

        }
        if (isLoadIdentifierDuplicate(formData.getCarrierId(), formData.getAccountId(),
                formData.getGroupId(), formData.getEpfLoadIdentifier())) {
            validationErrors.put("identifier", "Identifier must be unique");
            foundAnError = true;
        }

        // check to see if this cag is allowed for the selected platform
        if (!checkIfCarrierAllowedForPlatform(formData.getPlatformId(), formData.getCarrierId())) {
            validationErrors.put("platformId", "C/A/G entered was not found in this platform");
            foundAnError = true;
        }

        return validationErrors;
    }

    private ElgEligProfileEpf formatCopyElgEligProfileEpf(CopyProfileForm formData) {
        ElgEligProfileEpf epf = null;
        java.sql.Date defaultDate = DateUtils.getDefaultValueWhenDateIsNull();
        ElgEligProfileEpf fromEpf =
                eligProfEpfRepo.findByCarCarrierIdAndAccountIdAndGroupId(formData.getFromCarrierId(), formData.getFromAccountId(), formData.getFromGroupId());
        if (fromEpf != null) {

            epf = new ElgEligProfileEpf();
            BeanUtils.copyProperties(fromEpf, epf);
            epf.setCarCarrierId(formData.getCarrierId());
            epf.setAccountId(formData.getAccountId());
            epf.setGroupId(formData.getGroupId());
            epf.setEpfLoadIdentifier(formData.getEpfLoadIdentifier());
            epf.setAddProgramName("RXCNXGEELG");
            epf.setAddDate(DateUtils.currentDate());
            epf.setAddTime(DateUtils.currentTime());
            epf.setChgProgramName("RXCNXGEELG");
            epf.setChgUserName("");
            epf.setChgDate(DateUtils.currentDate());
            epf.setChgTime(DateUtils.currentTime());
            epf.setEpfStatus("A");
            // wipe out the stage load info
            epf.setEpfCurrentStageDt(defaultDate);
            epf.setEpfCurrentInput(0);
            epf.setEpfCurrentStaged(0);
            epf.setEpfCurrentLoaded(0);
            epf.setEpfCurrentRejected(0);
            epf.setEpfCurrentLoadDate(defaultDate);
            epf.setEpfPreviousStageDt(defaultDate);
            epf.setEpfPreviousInput(0);
            epf.setEpfPreviousStaged(0);
            epf.setEpfPreviousLoaded(0);
            epf.setEpfPreviousRejected(0);
            epf.setEpfPreviousLoadDt(defaultDate);
            epf.setEpfPriorStageDate(defaultDate);
            epf.setEpfPriorInput(0);
            epf.setEpfPriorStaged(0);
            epf.setEpfPriorLoaded(0);
            epf.setEpfPriorRejected(0);
            epf.setEpfPriorLoadDate(defaultDate);
        }
        return epf;
    }

    private ElgEligMemberDefaultsEmd formatCopyMemberDefaultsEmd(CopyProfileForm formData) {
        ElgEligMemberDefaultsEmd emd = null;
        ElgEligMemberDefaultsEmd fromEmd =
                elgEligMemberDefaultsEmdRepo.findByCarCarrierIdAndAccountIdAndGroupId(formData.getFromCarrierId(), formData.getFromAccountId(), formData.getFromGroupId());
        if (fromEmd != null) {
            emd = new ElgEligMemberDefaultsEmd();
            BeanUtils.copyProperties(fromEmd, emd);
            emd.setCarCarrierId(formData.getCarrierId());
            emd.setAccountId(formData.getAccountId());
            emd.setGroupId(formData.getGroupId());
            emd.setAddProgramName("RXCNXGEELG");
            emd.setAddDate(DateUtils.currentDate());
            emd.setAddTime(DateUtils.currentTime());
            emd.setChgProgramName("RXCNXGEELG");
            emd.setChgUserName("");
            emd.setChgDate(DateUtils.currentDate());
            emd.setChgTime(DateUtils.currentTime());
        }
        return emd;
    }

    private ElgEligHealthDefaultsEhd formatCopyHealthDefaultsEhd(CopyProfileForm formData) {
        ElgEligHealthDefaultsEhd ehd = null;
        ElgEligHealthDefaultsEhd fromEhd =
                elgEligHealthDefaultsEhdRepo.findByCarCarrierIdAndAccountIdAndGroupId(formData.getFromCarrierId(), formData.getFromAccountId(), formData.getFromGroupId());
        if (fromEhd != null) {
            ehd = new ElgEligHealthDefaultsEhd();
            BeanUtils.copyProperties(fromEhd, ehd);
            ehd.setCarCarrierId(formData.getCarrierId());
            ehd.setAccountId(formData.getAccountId());
            ehd.setGroupId(formData.getGroupId());
            ehd.setAddProgramName("RXCNXGEELG");
            ehd.setAddDate(DateUtils.currentDate());
            ehd.setAddTime(DateUtils.currentTime());
            ehd.setChgProgramName("RXCNXGEELG");
            ehd.setChgUserName("");
            ehd.setChgDate(DateUtils.currentDate());
            ehd.setChgTime(DateUtils.currentTime());
        }
        return ehd;
    }

    private ElgEligGroupDefaultsEgd formatCopyGroupDefaultsEgd(CopyProfileForm formData) {
        ElgEligGroupDefaultsEgd egd = null;
        ElgEligGroupDefaultsEgd fromEgd =
                elgEligGroupDefaultsEgdRepo.findByCarCarrierIdAndAccountIdAndGroupId(formData.getFromCarrierId(), formData.getFromAccountId(), formData.getFromGroupId());
        if (fromEgd != null) {
            egd = new ElgEligGroupDefaultsEgd();
            BeanUtils.copyProperties(fromEgd, egd);
            egd.setCarCarrierId(formData.getCarrierId());
            egd.setAccountId(formData.getAccountId());
            egd.setGroupId(formData.getGroupId());
            egd.setAddProgramName("RXCNXGEELG");
            egd.setAddDate(DateUtils.currentDate());
            egd.setAddTime(DateUtils.currentTime());
            egd.setChgProgramName("RXCNXGEELG");
            egd.setChgUserName("");
            egd.setChgDate(DateUtils.currentDate());
            egd.setChgTime(DateUtils.currentTime());
        }
        return egd;
    }

    private ElgEligWCDefaultsEwd formatCopyWCDefaultsEwd(CopyProfileForm formData) {
        ElgEligWCDefaultsEwd ewd = null;
        ElgEligWCDefaultsEwd fromEwd =
                elgEligWCDefaultsEwdRepo.findByCarCarrierIdAndAccountIdAndGroupId(formData.getFromCarrierId(), formData.getFromAccountId(), formData.getFromGroupId());
        if (fromEwd != null) {
            ewd = new ElgEligWCDefaultsEwd();
            BeanUtils.copyProperties(fromEwd, ewd);
            ewd.setCarCarrierId(formData.getCarrierId());
            ewd.setAccountId(formData.getAccountId());
            ewd.setGroupId(formData.getGroupId());
            ewd.setAddDate(DateUtils.currentDate());
            ewd.setChgProgramName("RXCNXGEELG");
            ewd.setChgUserName("");
            ewd.setChgDate(DateUtils.currentDate());
            ewd.setChgTime(DateUtils.currentTime());
        }
        return ewd;
    }

    private ElgMemberPartdDefaultsEmp formatCopyMemberPartdDefaultsEmp(CopyProfileForm formData) {
        ElgMemberPartdDefaultsEmp emp = null;
        ElgMemberPartdDefaultsEmp fromEmp =
                elgMemberPartdDefaultsEmpRepo.findByCarCarrierIdAndAccountIdAndGroupId(formData.getFromCarrierId(), formData.getFromAccountId(), formData.getFromGroupId());
        if (fromEmp != null) {
            emp = new ElgMemberPartdDefaultsEmp();
            BeanUtils.copyProperties(fromEmp, emp);
            emp.setCarCarrierId(formData.getCarrierId());
            emp.setAccountId(formData.getAccountId());
            emp.setGroupId(formData.getGroupId());
            emp.setAddProgramName("RXCNXGEELG");
            emp.setAddDate(DateUtils.currentDate());
            emp.setAddTime(DateUtils.currentTime());
            emp.setChgProgramName("RXCNXGEELG");
            emp.setChgUserName("");
            emp.setChgDate(DateUtils.currentDate());
            emp.setChgTime(DateUtils.currentTime());
        }
        return emp;
    }

    private ElgMbrOtherCoverageDefaultsEmc formatCopyMbrOtherCoverageDefaultsEmc(CopyProfileForm formData) {
        ElgMbrOtherCoverageDefaultsEmc emc = null;
        ElgMbrOtherCoverageDefaultsEmc fromEmc =
                elgMbrOtherCoverageDefaultsEmcRepo.findByCarCarrierIdAndAccountIdAndGroupId(formData.getFromCarrierId(), formData.getFromAccountId(), formData.getFromGroupId());
        if (fromEmc != null) {
            emc = new ElgMbrOtherCoverageDefaultsEmc();
            BeanUtils.copyProperties(fromEmc, emc);
            emc.setCarCarrierId(formData.getCarrierId());
            emc.setAccountId(formData.getAccountId());
            emc.setGroupId(formData.getGroupId());
            emc.setAddProgramName("RXCNXGEELG");
            emc.setAddDate(DateUtils.currentDate());
            emc.setAddTime(DateUtils.currentTime());
            emc.setChgProgramName("RXCNXGEELG");
            emc.setChgUserName("");
            emc.setChgDate(DateUtils.currentDate());
            emc.setChgTime(DateUtils.currentTime());
        }
        return emc;
    }
    
    public ElgEqdEligQueueDefaults saveEligQueueDetail(String jsonString) throws IOException, ValidationException {
		ElgEqdEligQueueDefaults elgEqdEligQueueDefaults;
		ObjectMapper mapper = new ObjectMapper();
		EligQueueDetailForm eligQueueDetailForm = mapper.readValue(jsonString,
				new TypeReference<EligQueueDetailForm>() {
				});
		HashMap<String, String> validationErrors = validateEligQueueDetailForm(eligQueueDetailForm);
		if (validationErrors.isEmpty()) {
			// check if existing queue record
			elgEqdEligQueueDefaults = getEligQueueDefaultsByPrimaryKey(eligQueueDetailForm.getCarCarrierId(),
					eligQueueDetailForm.getEqdAccountId(), eligQueueDetailForm.getEqdGroupId(),
					eligQueueDetailForm.getEqdReportName());
			// set entity data for add/update by using form object.
			elgEqdEligQueueDefaults = eligQueueDetailServiceHelper.prepareEligQueueDetailEntity(elgEqdEligQueueDefaults,
					eligQueueDetailForm);
			// save/update queue detail
			return elgEqdEligQueueDefaultsRepo.saveAndFlush(elgEqdEligQueueDefaults);
		} else
			throw new ValidationException(mapper.writer().writeValueAsString(validationErrors));
	}

	private HashMap<String, String> validateEligQueueDetailForm(EligQueueDetailForm formData) {
		HashMap validationErrors = new HashMap<String, String>();		
		boolean foundAnError = false; 
        String outputQueueLibrary = formData.getEqdOutputQueueLibrary();
        String outputQueueName = formData.getEqdOutputQueueName();
       
        // check to make sure library name exists in sysprogramstat table
        Sysschemas schema = findBySchemaName(outputQueueLibrary);
        if (schema == null) {
            validationErrors.put("eqdOutputQueueLibrary", "Library not found");
            foundAnError = true;
        } else {
            // check to make sure output queue name exists in sysprogramstat table
            ObjectStatistics outputQueueStatInfo = findOutputQueueStatInfo(outputQueueLibrary, outputQueueName);
            if (outputQueueStatInfo == null) {
                validationErrors.put("eqdOutputQueueName", "Queue not found");
                foundAnError = true;
            }
        }
        return validationErrors;
	}

    public void inactivateProfile(String carrierId, String accountId, String groupId, String body) throws Exception {
        ElgEligProfileEpf epf = eligProfEpfRepo.findByCarCarrierIdAndAccountIdAndGroupId(carrierId, accountId, groupId);

        if (epf == null || epf.getCarCarrierId() == null || epf.getCarCarrierId().isEmpty()) {
            throw new Exception("Profile was not found and could not be inactivated");
        }

        epf.setEpfStatus("I");
        epf.setChgProgramName("RXCNXGEELG");
        epf.setChgUserName("DUMMY_USER");
        epf.setChgDate(DateUtils.currentDate());
        epf.setChgTime(DateUtils.currentTime());

        eligProfEpfRepo.saveAndFlush(epf);
    }
    
    public ObjectStatistics findOutputQueueStatInfo(String outputQueueLibrary, String outputQueueName) {
        ObjectStatistics results =
                objectStatisticsRepositoryRepository.findOutputQueueStats(outputQueueLibrary.toUpperCase(), outputQueueName.toUpperCase());
        return results;
    }
}


