package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by bkocinsk on 8/13/2018.
 */
@Entity
@Table(name = "ELG_ELIG_MEMBER_DEFAULTS_EMD")
@IdClass(ElgEligMemberDefaultsEmdPK.class)
public class ElgEligMemberDefaultsEmd {
    private String carCarrierId;
    private String accountId;
    private String groupId;
    private String emdMemberEligibilityTp;
    private String emdCreateFamilyInd;
    private String emdCreateSpouseInd;
    private String emdCreateDependentsInd;
    private BigInteger emdNumberOfDependents;
    private String emdNameInd;
    private String emdLastName;
    private String emdFirstName;
    private String emdMiddleInitial;
    private String emdAddressInd;
    private String emdCountryInd;
    private String emdCountryCode;
    private String emdEmailInd;
    private String emdPhoneNumberInd;
    private String emdSocSecNbrInd;
    private Integer emdSocSecNbr;
    private String emdBuildSocSecNbr;
    private String emdSexInd;
    private String emdSex;
    private String emdDurKeyInd;
    private String emdDurKey;
    private String emdDateOfBirthInd;
    private Date emdDateOfBirth;
    private String emdRenewalDateInd;
    private Date emdRenewalDate;
    private String emdEffectiveDateInd;
    private Date emdEffectiveDate;
    private String emdThruDateInd;
    private Date emdThruDate;
    private Integer emdThruDays;
    private String emdMedicareHicInd;
    private String emdMedicareHic;
    private String emdMedicareEffDateInd;
    private Date emdMedicareEffDate;
    private String emdMedicareCvgTypeInd;
    private String emdMedicareCvgType;
    private String emdPhysicianIdInd;
    private String prfPrescriberId;
    private String prqPrscrbrIdQualifier;
    private String prfPrescriberIdState;
    private String emdCareFacilityInd;
    private String cfaCareFacilityId;
    private String emdPersonCodeInd;
    private String emdPersonCode;
    private String emdFamilyTypeInd;
    private String emdFamilyType;
    private String emdFamilyIndicatorInd;
    private String emdFamilyIndicator;
    private String emdFamilyIdInd;
    private String emdFamilyId;
    private String emdRelationshipCodeInd;
    private String emdRelationshipCode;
    private String emdAlternateInsInd;
    private String emdAlternateIns;
    private String emdAltInsCodeInd;
    private String emdAltInsCode;
    private String emdAltInsuranceIdInd;
    private String emdAltInsuranceId;
    private String emdBrandCopayInd;
    private BigDecimal emdBrandCopay;
    private String emdGenericCopayInd;
    private BigDecimal emdGenericCopay;
    private String emdCopay3Ind;
    private BigDecimal emdCopay3;
    private String emdCopay4Ind;
    private BigDecimal emdCopay4;
    private String emdPlanInd;
    private String planCode;
    private Date planEffDate;
    private String emdLanguageCodeInd;
    private String emdLanguageCode;
    private String emdDurFlagInd;
    private String emdDurFlag;
    private String emdMultBirthCodeInd;
    private BigInteger emdMultipleBirthCode;
    private BigInteger emdBaseMemberIdLength;
    private String emdOrigEffDateInd;
    private Date emdOrigEffectiveDate;
    private String emdMemberTypeInd;
    private String emdMemberType;
    private String emdNetworkInd;
    private String cnwNetworkId;
    private String emdQualifierInd;
    private String cquQualifierId;
    private String emdCareEffDateInd;
    private Date emdCareEffDate;
    private String emdCareThruDateInd;
    private Date emdCareThruDate;
    private String emdClientProdCodeInd;
    private String emdClientProductCode;
    private String emdClientRiderCodeInd;
    private String emdClientRiderCode;
    private String emdMcfOvrPlanInd;
    private String emdMcfOvrPlanCode;
    private Date emdMcfOvrPlanEffDate;
    private String emdMaiEffDateInd;
    private Date emdMaiEffDate;
    private String emdMaiThruDateInd;
    private Date emdMaiThruDate;
    private String emdAutoTermMatchSex;
    private String emdAutoTermMatchDob;
    private String emdInactvFutureCovInd;
    private String emdPlanEligValidation;
    private String emdSsnOnErrorFile;
    private String emdMaiLock;
    private String emdMemberIdFormatChec;
    private String emdDataFldsInd;
    private String emdDataFldsEffDteInd;
    private String emdDataFldsThrDteInd;
    private String addUserName;
    private Date addDate;
    private Time addTime;
    private String addProgramName;
    private String chgUserName;
    private Date chgDate;
    private Time chgTime;
    private String chgProgramName;

    @Id
    @Column(name = "CAR_CARRIER_ID")
    public String getCarCarrierId() {
        return carCarrierId;
    }

    public void setCarCarrierId(String carCarrierId) {
        this.carCarrierId = carCarrierId;
    }

    @Id
    @Column(name = "ACCOUNT_ID")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Id
    @Column(name = "GROUP_ID")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "EMD_MEMBER_ELIGIBILITY_TP")
    public String getEmdMemberEligibilityTp() {
        return emdMemberEligibilityTp;
    }

    public void setEmdMemberEligibilityTp(String emdMemberEligibilityTp) {
        this.emdMemberEligibilityTp = emdMemberEligibilityTp;
    }

    @Basic
    @Column(name = "EMD_CREATE_FAMILY_IND")
    public String getEmdCreateFamilyInd() {
        return emdCreateFamilyInd;
    }

    public void setEmdCreateFamilyInd(String emdCreateFamilyInd) {
        this.emdCreateFamilyInd = emdCreateFamilyInd;
    }

    @Basic
    @Column(name = "EMD_CREATE_SPOUSE_IND")
    public String getEmdCreateSpouseInd() {
        return emdCreateSpouseInd;
    }

    public void setEmdCreateSpouseInd(String emdCreateSpouseInd) {
        this.emdCreateSpouseInd = emdCreateSpouseInd;
    }

    @Basic
    @Column(name = "EMD_CREATE_DEPENDENTS_IND")
    public String getEmdCreateDependentsInd() {
        return emdCreateDependentsInd;
    }

    public void setEmdCreateDependentsInd(String emdCreateDependentsInd) {
        this.emdCreateDependentsInd = emdCreateDependentsInd;
    }

    @Basic
    @Column(name = "EMD_NUMBER_OF_DEPENDENTS")
    public BigInteger getEmdNumberOfDependents() {
        return emdNumberOfDependents;
    }

    public void setEmdNumberOfDependents(BigInteger emdNumberOfDependents) {
        this.emdNumberOfDependents = emdNumberOfDependents;
    }

    @Basic
    @Column(name = "EMD_NAME_IND")
    public String getEmdNameInd() {
        return emdNameInd;
    }

    public void setEmdNameInd(String emdNameInd) {
        this.emdNameInd = emdNameInd;
    }

    @Basic
    @Column(name = "EMD_LAST_NAME")
    public String getEmdLastName() {
        return emdLastName;
    }

    public void setEmdLastName(String emdLastName) {
        this.emdLastName = emdLastName;
    }

    @Basic
    @Column(name = "EMD_FIRST_NAME")
    public String getEmdFirstName() {
        return emdFirstName;
    }

    public void setEmdFirstName(String emdFirstName) {
        this.emdFirstName = emdFirstName;
    }

    @Basic
    @Column(name = "EMD_MIDDLE_INITIAL")
    public String getEmdMiddleInitial() {
        return emdMiddleInitial;
    }

    public void setEmdMiddleInitial(String emdMiddleInitial) {
        this.emdMiddleInitial = emdMiddleInitial;
    }

    @Basic
    @Column(name = "EMD_ADDRESS_IND")
    public String getEmdAddressInd() {
        return emdAddressInd;
    }

    public void setEmdAddressInd(String emdAddressInd) {
        this.emdAddressInd = emdAddressInd;
    }

    @Basic
    @Column(name = "EMD_COUNTRY_IND")
    public String getEmdCountryInd() {
        return emdCountryInd;
    }

    public void setEmdCountryInd(String emdCountryInd) {
        this.emdCountryInd = emdCountryInd;
    }

    @Basic
    @Column(name = "EMD_COUNTRY_CODE")
    public String getEmdCountryCode() {
        return emdCountryCode;
    }

    public void setEmdCountryCode(String emdCountryCode) {
        this.emdCountryCode = emdCountryCode;
    }

    @Basic
    @Column(name = "EMD_EMAIL_IND")
    public String getEmdEmailInd() {
        return emdEmailInd;
    }

    public void setEmdEmailInd(String emdEmailInd) {
        this.emdEmailInd = emdEmailInd;
    }

    @Basic
    @Column(name = "EMD_PHONE_NUMBER_IND")
    public String getEmdPhoneNumberInd() {
        return emdPhoneNumberInd;
    }

    public void setEmdPhoneNumberInd(String emdPhoneNumberInd) {
        this.emdPhoneNumberInd = emdPhoneNumberInd;
    }

    @Basic
    @Column(name = "EMD_SOC_SEC_NBR_IND")
    public String getEmdSocSecNbrInd() {
        return emdSocSecNbrInd;
    }

    public void setEmdSocSecNbrInd(String emdSocSecNbrInd) {
        this.emdSocSecNbrInd = emdSocSecNbrInd;
    }

    @Basic
    @Column(name = "EMD_SOC_SEC_NBR")
    public Integer getEmdSocSecNbr() {
        return emdSocSecNbr;
    }

    public void setEmdSocSecNbr(Integer emdSocSecNbr) {
        this.emdSocSecNbr = emdSocSecNbr;
    }

    @Basic
    @Column(name = "EMD_BUILD_SOC_SEC_NBR")
    public String getEmdBuildSocSecNbr() {
        return emdBuildSocSecNbr;
    }

    public void setEmdBuildSocSecNbr(String emdBuildSocSecNbr) {
        this.emdBuildSocSecNbr = emdBuildSocSecNbr;
    }

    @Basic
    @Column(name = "EMD_SEX_IND")
    public String getEmdSexInd() {
        return emdSexInd;
    }

    public void setEmdSexInd(String emdSexInd) {
        this.emdSexInd = emdSexInd;
    }

    @Basic
    @Column(name = "EMD_SEX")
    public String getEmdSex() {
        return emdSex;
    }

    public void setEmdSex(String emdSex) {
        this.emdSex = emdSex;
    }

    @Basic
    @Column(name = "EMD_DUR_KEY_IND")
    public String getEmdDurKeyInd() {
        return emdDurKeyInd;
    }

    public void setEmdDurKeyInd(String emdDurKeyInd) {
        this.emdDurKeyInd = emdDurKeyInd;
    }

    @Basic
    @Column(name = "EMD_DUR_KEY")
    public String getEmdDurKey() {
        return emdDurKey;
    }

    public void setEmdDurKey(String emdDurKey) {
        this.emdDurKey = emdDurKey;
    }

    @Basic
    @Column(name = "EMD_DATE_OF_BIRTH_IND")
    public String getEmdDateOfBirthInd() {
        return emdDateOfBirthInd;
    }

    public void setEmdDateOfBirthInd(String emdDateOfBirthInd) {
        this.emdDateOfBirthInd = emdDateOfBirthInd;
    }

    @Basic
    @Column(name = "EMD_DATE_OF_BIRTH")
    public Date getEmdDateOfBirth() {
        return emdDateOfBirth;
    }

    public void setEmdDateOfBirth(Date emdDateOfBirth) {
        this.emdDateOfBirth = emdDateOfBirth;
    }

    @Basic
    @Column(name = "EMD_RENEWAL_DATE_IND")
    public String getEmdRenewalDateInd() {
        return emdRenewalDateInd;
    }

    public void setEmdRenewalDateInd(String emdRenewalDateInd) {
        this.emdRenewalDateInd = emdRenewalDateInd;
    }

    @Basic
    @Column(name = "EMD_RENEWAL_DATE")
    public Date getEmdRenewalDate() {
        return emdRenewalDate;
    }

    public void setEmdRenewalDate(Date emdRenewalDate) {
        this.emdRenewalDate = emdRenewalDate;
    }

    @Basic
    @Column(name = "EMD_EFFECTIVE_DATE_IND")
    public String getEmdEffectiveDateInd() {
        return emdEffectiveDateInd;
    }

    public void setEmdEffectiveDateInd(String emdEffectiveDateInd) {
        this.emdEffectiveDateInd = emdEffectiveDateInd;
    }

    @Basic
    @Column(name = "EMD_EFFECTIVE_DATE")
    public Date getEmdEffectiveDate() {
        return emdEffectiveDate;
    }

    public void setEmdEffectiveDate(Date emdEffectiveDate) {
        this.emdEffectiveDate = emdEffectiveDate;
    }

    @Basic
    @Column(name = "EMD_THRU_DATE_IND")
    public String getEmdThruDateInd() {
        return emdThruDateInd;
    }

    public void setEmdThruDateInd(String emdThruDateInd) {
        this.emdThruDateInd = emdThruDateInd;
    }

    @Basic
    @Column(name = "EMD_THRU_DATE")
    public Date getEmdThruDate() {
        return emdThruDate;
    }

    public void setEmdThruDate(Date emdThruDate) {
        this.emdThruDate = emdThruDate;
    }

    @Basic
    @Column(name = "EMD_THRU_DAYS")
    public Integer getEmdThruDays() {
        return emdThruDays;
    }

    public void setEmdThruDays(Integer emdThruDays) {
        this.emdThruDays = emdThruDays;
    }

    @Basic
    @Column(name = "EMD_MEDICARE_HIC_IND")
    public String getEmdMedicareHicInd() {
        return emdMedicareHicInd;
    }

    public void setEmdMedicareHicInd(String emdMedicareHicInd) {
        this.emdMedicareHicInd = emdMedicareHicInd;
    }

    @Basic
    @Column(name = "EMD_MEDICARE_HIC")
    public String getEmdMedicareHic() {
        return emdMedicareHic;
    }

    public void setEmdMedicareHic(String emdMedicareHic) {
        this.emdMedicareHic = emdMedicareHic;
    }

    @Basic
    @Column(name = "EMD_MEDICARE_EFF_DATE_IND")
    public String getEmdMedicareEffDateInd() {
        return emdMedicareEffDateInd;
    }

    public void setEmdMedicareEffDateInd(String emdMedicareEffDateInd) {
        this.emdMedicareEffDateInd = emdMedicareEffDateInd;
    }

    @Basic
    @Column(name = "EMD_MEDICARE_EFF_DATE")
    public Date getEmdMedicareEffDate() {
        return emdMedicareEffDate;
    }

    public void setEmdMedicareEffDate(Date emdMedicareEffDate) {
        this.emdMedicareEffDate = emdMedicareEffDate;
    }

    @Basic
    @Column(name = "EMD_MEDICARE_CVG_TYPE_IND")
    public String getEmdMedicareCvgTypeInd() {
        return emdMedicareCvgTypeInd;
    }

    public void setEmdMedicareCvgTypeInd(String emdMedicareCvgTypeInd) {
        this.emdMedicareCvgTypeInd = emdMedicareCvgTypeInd;
    }

    @Basic
    @Column(name = "EMD_MEDICARE_CVG_TYPE")
    public String getEmdMedicareCvgType() {
        return emdMedicareCvgType;
    }

    public void setEmdMedicareCvgType(String emdMedicareCvgType) {
        this.emdMedicareCvgType = emdMedicareCvgType;
    }

    @Basic
    @Column(name = "EMD_PHYSICIAN_ID_IND")
    public String getEmdPhysicianIdInd() {
        return emdPhysicianIdInd;
    }

    public void setEmdPhysicianIdInd(String emdPhysicianIdInd) {
        this.emdPhysicianIdInd = emdPhysicianIdInd;
    }

    @Basic
    @Column(name = "PRF_PRESCRIBER_ID")
    public String getPrfPrescriberId() {
        return prfPrescriberId;
    }

    public void setPrfPrescriberId(String prfPrescriberId) {
        this.prfPrescriberId = prfPrescriberId;
    }

    @Basic
    @Column(name = "PRQ_PRSCRBR_ID_QUALIFIER")
    public String getPrqPrscrbrIdQualifier() {
        return prqPrscrbrIdQualifier;
    }

    public void setPrqPrscrbrIdQualifier(String prqPrscrbrIdQualifier) {
        this.prqPrscrbrIdQualifier = prqPrscrbrIdQualifier;
    }

    @Basic
    @Column(name = "PRF_PRESCRIBER_ID_STATE")
    public String getPrfPrescriberIdState() {
        return prfPrescriberIdState;
    }

    public void setPrfPrescriberIdState(String prfPrescriberIdState) {
        this.prfPrescriberIdState = prfPrescriberIdState;
    }

    @Basic
    @Column(name = "EMD_CARE_FACILITY_IND")
    public String getEmdCareFacilityInd() {
        return emdCareFacilityInd;
    }

    public void setEmdCareFacilityInd(String emdCareFacilityInd) {
        this.emdCareFacilityInd = emdCareFacilityInd;
    }

    @Basic
    @Column(name = "CFA_CARE_FACILITY_ID")
    public String getCfaCareFacilityId() {
        return cfaCareFacilityId;
    }

    public void setCfaCareFacilityId(String cfaCareFacilityId) {
        this.cfaCareFacilityId = cfaCareFacilityId;
    }

    @Basic
    @Column(name = "EMD_PERSON_CODE_IND")
    public String getEmdPersonCodeInd() {
        return emdPersonCodeInd;
    }

    public void setEmdPersonCodeInd(String emdPersonCodeInd) {
        this.emdPersonCodeInd = emdPersonCodeInd;
    }

    @Basic
    @Column(name = "EMD_PERSON_CODE")
    public String getEmdPersonCode() {
        return emdPersonCode;
    }

    public void setEmdPersonCode(String emdPersonCode) {
        this.emdPersonCode = emdPersonCode;
    }

    @Basic
    @Column(name = "EMD_FAMILY_TYPE_IND")
    public String getEmdFamilyTypeInd() {
        return emdFamilyTypeInd;
    }

    public void setEmdFamilyTypeInd(String emdFamilyTypeInd) {
        this.emdFamilyTypeInd = emdFamilyTypeInd;
    }

    @Basic
    @Column(name = "EMD_FAMILY_TYPE")
    public String getEmdFamilyType() {
        return emdFamilyType;
    }

    public void setEmdFamilyType(String emdFamilyType) {
        this.emdFamilyType = emdFamilyType;
    }

    @Basic
    @Column(name = "EMD_FAMILY_INDICATOR_IND")
    public String getEmdFamilyIndicatorInd() {
        return emdFamilyIndicatorInd;
    }

    public void setEmdFamilyIndicatorInd(String emdFamilyIndicatorInd) {
        this.emdFamilyIndicatorInd = emdFamilyIndicatorInd;
    }

    @Basic
    @Column(name = "EMD_FAMILY_INDICATOR")
    public String getEmdFamilyIndicator() {
        return emdFamilyIndicator;
    }

    public void setEmdFamilyIndicator(String emdFamilyIndicator) {
        this.emdFamilyIndicator = emdFamilyIndicator;
    }

    @Basic
    @Column(name = "EMD_FAMILY_ID_IND")
    public String getEmdFamilyIdInd() {
        return emdFamilyIdInd;
    }

    public void setEmdFamilyIdInd(String emdFamilyIdInd) {
        this.emdFamilyIdInd = emdFamilyIdInd;
    }

    @Basic
    @Column(name = "EMD_FAMILY_ID")
    public String getEmdFamilyId() {
        return emdFamilyId;
    }

    public void setEmdFamilyId(String emdFamilyId) {
        this.emdFamilyId = emdFamilyId;
    }

    @Basic
    @Column(name = "EMD_RELATIONSHIP_CODE_IND")
    public String getEmdRelationshipCodeInd() {
        return emdRelationshipCodeInd;
    }

    public void setEmdRelationshipCodeInd(String emdRelationshipCodeInd) {
        this.emdRelationshipCodeInd = emdRelationshipCodeInd;
    }

    @Basic
    @Column(name = "EMD_RELATIONSHIP_CODE")
    public String getEmdRelationshipCode() {
        return emdRelationshipCode;
    }

    public void setEmdRelationshipCode(String emdRelationshipCode) {
        this.emdRelationshipCode = emdRelationshipCode;
    }

    @Basic
    @Column(name = "EMD_ALTERNATE_INS_IND")
    public String getEmdAlternateInsInd() {
        return emdAlternateInsInd;
    }

    public void setEmdAlternateInsInd(String emdAlternateInsInd) {
        this.emdAlternateInsInd = emdAlternateInsInd;
    }

    @Basic
    @Column(name = "EMD_ALTERNATE_INS")
    public String getEmdAlternateIns() {
        return emdAlternateIns;
    }

    public void setEmdAlternateIns(String emdAlternateIns) {
        this.emdAlternateIns = emdAlternateIns;
    }

    @Basic
    @Column(name = "EMD_ALT_INS_CODE_IND")
    public String getEmdAltInsCodeInd() {
        return emdAltInsCodeInd;
    }

    public void setEmdAltInsCodeInd(String emdAltInsCodeInd) {
        this.emdAltInsCodeInd = emdAltInsCodeInd;
    }

    @Basic
    @Column(name = "EMD_ALT_INS_CODE")
    public String getEmdAltInsCode() {
        return emdAltInsCode;
    }

    public void setEmdAltInsCode(String emdAltInsCode) {
        this.emdAltInsCode = emdAltInsCode;
    }

    @Basic
    @Column(name = "EMD_ALT_INSURANCE_ID_IND")
    public String getEmdAltInsuranceIdInd() {
        return emdAltInsuranceIdInd;
    }

    public void setEmdAltInsuranceIdInd(String emdAltInsuranceIdInd) {
        this.emdAltInsuranceIdInd = emdAltInsuranceIdInd;
    }

    @Basic
    @Column(name = "EMD_ALT_INSURANCE_ID")
    public String getEmdAltInsuranceId() {
        return emdAltInsuranceId;
    }

    public void setEmdAltInsuranceId(String emdAltInsuranceId) {
        this.emdAltInsuranceId = emdAltInsuranceId;
    }

    @Basic
    @Column(name = "EMD_BRAND_COPAY_IND")
    public String getEmdBrandCopayInd() {
        return emdBrandCopayInd;
    }

    public void setEmdBrandCopayInd(String emdBrandCopayInd) {
        this.emdBrandCopayInd = emdBrandCopayInd;
    }

    @Basic
    @Column(name = "EMD_BRAND_COPAY")
    public BigDecimal getEmdBrandCopay() {
        return emdBrandCopay;
    }

    public void setEmdBrandCopay(BigDecimal emdBrandCopay) {
        this.emdBrandCopay = emdBrandCopay;
    }

    @Basic
    @Column(name = "EMD_GENERIC_COPAY_IND")
    public String getEmdGenericCopayInd() {
        return emdGenericCopayInd;
    }

    public void setEmdGenericCopayInd(String emdGenericCopayInd) {
        this.emdGenericCopayInd = emdGenericCopayInd;
    }

    @Basic
    @Column(name = "EMD_GENERIC_COPAY")
    public BigDecimal getEmdGenericCopay() {
        return emdGenericCopay;
    }

    public void setEmdGenericCopay(BigDecimal emdGenericCopay) {
        this.emdGenericCopay = emdGenericCopay;
    }

    @Basic
    @Column(name = "EMD_COPAY_3_IND")
    public String getEmdCopay3Ind() {
        return emdCopay3Ind;
    }

    public void setEmdCopay3Ind(String emdCopay3Ind) {
        this.emdCopay3Ind = emdCopay3Ind;
    }

    @Basic
    @Column(name = "EMD_COPAY_3")
    public BigDecimal getEmdCopay3() {
        return emdCopay3;
    }

    public void setEmdCopay3(BigDecimal emdCopay3) {
        this.emdCopay3 = emdCopay3;
    }

    @Basic
    @Column(name = "EMD_COPAY_4_IND")
    public String getEmdCopay4Ind() {
        return emdCopay4Ind;
    }

    public void setEmdCopay4Ind(String emdCopay4Ind) {
        this.emdCopay4Ind = emdCopay4Ind;
    }

    @Basic
    @Column(name = "EMD_COPAY_4")
    public BigDecimal getEmdCopay4() {
        return emdCopay4;
    }

    public void setEmdCopay4(BigDecimal emdCopay4) {
        this.emdCopay4 = emdCopay4;
    }

    @Basic
    @Column(name = "EMD_PLAN_IND")
    public String getEmdPlanInd() {
        return emdPlanInd;
    }

    public void setEmdPlanInd(String emdPlanInd) {
        this.emdPlanInd = emdPlanInd;
    }

    @Basic
    @Column(name = "PLAN_CODE")
    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    @Basic
    @Column(name = "PLAN_EFF_DATE")
    public Date getPlanEffDate() {
        return planEffDate;
    }

    public void setPlanEffDate(Date planEffDate) {
        this.planEffDate = planEffDate;
    }

    @Basic
    @Column(name = "EMD_LANGUAGE_CODE_IND")
    public String getEmdLanguageCodeInd() {
        return emdLanguageCodeInd;
    }

    public void setEmdLanguageCodeInd(String emdLanguageCodeInd) {
        this.emdLanguageCodeInd = emdLanguageCodeInd;
    }

    @Basic
    @Column(name = "EMD_LANGUAGE_CODE")
    public String getEmdLanguageCode() {
        return emdLanguageCode;
    }

    public void setEmdLanguageCode(String emdLanguageCode) {
        this.emdLanguageCode = emdLanguageCode;
    }

    @Basic
    @Column(name = "EMD_DUR_FLAG_IND")
    public String getEmdDurFlagInd() {
        return emdDurFlagInd;
    }

    public void setEmdDurFlagInd(String emdDurFlagInd) {
        this.emdDurFlagInd = emdDurFlagInd;
    }

    @Basic
    @Column(name = "EMD_DUR_FLAG")
    public String getEmdDurFlag() {
        return emdDurFlag;
    }

    public void setEmdDurFlag(String emdDurFlag) {
        this.emdDurFlag = emdDurFlag;
    }

    @Basic
    @Column(name = "EMD_MULT_BIRTH_CODE_IND")
    public String getEmdMultBirthCodeInd() {
        return emdMultBirthCodeInd;
    }

    public void setEmdMultBirthCodeInd(String emdMultBirthCodeInd) {
        this.emdMultBirthCodeInd = emdMultBirthCodeInd;
    }

    @Basic
    @Column(name = "EMD_MULTIPLE_BIRTH_CODE")
    public BigInteger getEmdMultipleBirthCode() {
        return emdMultipleBirthCode;
    }

    public void setEmdMultipleBirthCode(BigInteger emdMultipleBirthCode) {
        this.emdMultipleBirthCode = emdMultipleBirthCode;
    }

    @Basic
    @Column(name = "EMD_BASE_MEMBER_ID_LENGTH")
    public BigInteger getEmdBaseMemberIdLength() {
        return emdBaseMemberIdLength;
    }

    public void setEmdBaseMemberIdLength(BigInteger emdBaseMemberIdLength) {
        this.emdBaseMemberIdLength = emdBaseMemberIdLength;
    }

    @Basic
    @Column(name = "EMD_ORIG_EFF_DATE_IND")
    public String getEmdOrigEffDateInd() {
        return emdOrigEffDateInd;
    }

    public void setEmdOrigEffDateInd(String emdOrigEffDateInd) {
        this.emdOrigEffDateInd = emdOrigEffDateInd;
    }

    @Basic
    @Column(name = "EMD_ORIG_EFFECTIVE_DATE")
    public Date getEmdOrigEffectiveDate() {
        return emdOrigEffectiveDate;
    }

    public void setEmdOrigEffectiveDate(Date emdOrigEffectiveDate) {
        this.emdOrigEffectiveDate = emdOrigEffectiveDate;
    }

    @Basic
    @Column(name = "EMD_MEMBER_TYPE_IND")
    public String getEmdMemberTypeInd() {
        return emdMemberTypeInd;
    }

    public void setEmdMemberTypeInd(String emdMemberTypeInd) {
        this.emdMemberTypeInd = emdMemberTypeInd;
    }

    @Basic
    @Column(name = "EMD_MEMBER_TYPE")
    public String getEmdMemberType() {
        return emdMemberType;
    }

    public void setEmdMemberType(String emdMemberType) {
        this.emdMemberType = emdMemberType;
    }

    @Basic
    @Column(name = "EMD_NETWORK_IND")
    public String getEmdNetworkInd() {
        return emdNetworkInd;
    }

    public void setEmdNetworkInd(String emdNetworkInd) {
        this.emdNetworkInd = emdNetworkInd;
    }

    @Basic
    @Column(name = "CNW_NETWORK_ID")
    public String getCnwNetworkId() {
        return cnwNetworkId;
    }

    public void setCnwNetworkId(String cnwNetworkId) {
        this.cnwNetworkId = cnwNetworkId;
    }

    @Basic
    @Column(name = "EMD_QUALIFIER_IND")
    public String getEmdQualifierInd() {
        return emdQualifierInd;
    }

    public void setEmdQualifierInd(String emdQualifierInd) {
        this.emdQualifierInd = emdQualifierInd;
    }

    @Basic
    @Column(name = "CQU_QUALIFIER_ID")
    public String getCquQualifierId() {
        return cquQualifierId;
    }

    public void setCquQualifierId(String cquQualifierId) {
        this.cquQualifierId = cquQualifierId;
    }

    @Basic
    @Column(name = "EMD_CARE_EFF_DATE_IND")
    public String getEmdCareEffDateInd() {
        return emdCareEffDateInd;
    }

    public void setEmdCareEffDateInd(String emdCareEffDateInd) {
        this.emdCareEffDateInd = emdCareEffDateInd;
    }

    @Basic
    @Column(name = "EMD_CARE_EFF_DATE")
    public Date getEmdCareEffDate() {
        return emdCareEffDate;
    }

    public void setEmdCareEffDate(Date emdCareEffDate) {
        this.emdCareEffDate = emdCareEffDate;
    }

    @Basic
    @Column(name = "EMD_CARE_THRU_DATE_IND")
    public String getEmdCareThruDateInd() {
        return emdCareThruDateInd;
    }

    public void setEmdCareThruDateInd(String emdCareThruDateInd) {
        this.emdCareThruDateInd = emdCareThruDateInd;
    }

    @Basic
    @Column(name = "EMD_CARE_THRU_DATE")
    public Date getEmdCareThruDate() {
        return emdCareThruDate;
    }

    public void setEmdCareThruDate(Date emdCareThruDate) {
        this.emdCareThruDate = emdCareThruDate;
    }

    @Basic
    @Column(name = "EMD_CLIENT_PROD_CODE_IND")
    public String getEmdClientProdCodeInd() {
        return emdClientProdCodeInd;
    }

    public void setEmdClientProdCodeInd(String emdClientProdCodeInd) {
        this.emdClientProdCodeInd = emdClientProdCodeInd;
    }

    @Basic
    @Column(name = "EMD_CLIENT_PRODUCT_CODE")
    public String getEmdClientProductCode() {
        return emdClientProductCode;
    }

    public void setEmdClientProductCode(String emdClientProductCode) {
        this.emdClientProductCode = emdClientProductCode;
    }

    @Basic
    @Column(name = "EMD_CLIENT_RIDER_CODE_IND")
    public String getEmdClientRiderCodeInd() {
        return emdClientRiderCodeInd;
    }

    public void setEmdClientRiderCodeInd(String emdClientRiderCodeInd) {
        this.emdClientRiderCodeInd = emdClientRiderCodeInd;
    }

    @Basic
    @Column(name = "EMD_CLIENT_RIDER_CODE")
    public String getEmdClientRiderCode() {
        return emdClientRiderCode;
    }

    public void setEmdClientRiderCode(String emdClientRiderCode) {
        this.emdClientRiderCode = emdClientRiderCode;
    }

    @Basic
    @Column(name = "EMD_MCF_OVR_PLAN_IND")
    public String getEmdMcfOvrPlanInd() {
        return emdMcfOvrPlanInd;
    }

    public void setEmdMcfOvrPlanInd(String emdMcfOvrPlanInd) {
        this.emdMcfOvrPlanInd = emdMcfOvrPlanInd;
    }

    @Basic
    @Column(name = "EMD_MCF_OVR_PLAN_CODE")
    public String getEmdMcfOvrPlanCode() {
        return emdMcfOvrPlanCode;
    }

    public void setEmdMcfOvrPlanCode(String emdMcfOvrPlanCode) {
        this.emdMcfOvrPlanCode = emdMcfOvrPlanCode;
    }

    @Basic
    @Column(name = "EMD_MCF_OVR_PLAN_EFF_DATE")
    public Date getEmdMcfOvrPlanEffDate() {
        return emdMcfOvrPlanEffDate;
    }

    public void setEmdMcfOvrPlanEffDate(Date emdMcfOvrPlanEffDate) {
        this.emdMcfOvrPlanEffDate = emdMcfOvrPlanEffDate;
    }

    @Basic
    @Column(name = "EMD_MAI_EFF_DATE_IND")
    public String getEmdMaiEffDateInd() {
        return emdMaiEffDateInd;
    }

    public void setEmdMaiEffDateInd(String emdMaiEffDateInd) {
        this.emdMaiEffDateInd = emdMaiEffDateInd;
    }

    @Basic
    @Column(name = "EMD_MAI_EFF_DATE")
    public Date getEmdMaiEffDate() {
        return emdMaiEffDate;
    }

    public void setEmdMaiEffDate(Date emdMaiEffDate) {
        this.emdMaiEffDate = emdMaiEffDate;
    }

    @Basic
    @Column(name = "EMD_MAI_THRU_DATE_IND")
    public String getEmdMaiThruDateInd() {
        return emdMaiThruDateInd;
    }

    public void setEmdMaiThruDateInd(String emdMaiThruDateInd) {
        this.emdMaiThruDateInd = emdMaiThruDateInd;
    }

    @Basic
    @Column(name = "EMD_MAI_THRU_DATE")
    public Date getEmdMaiThruDate() {
        return emdMaiThruDate;
    }

    public void setEmdMaiThruDate(Date emdMaiThruDate) {
        this.emdMaiThruDate = emdMaiThruDate;
    }

    @Basic
    @Column(name = "EMD_AUTO_TERM_MATCH_SEX")
    public String getEmdAutoTermMatchSex() {
        return emdAutoTermMatchSex;
    }

    public void setEmdAutoTermMatchSex(String emdAutoTermMatchSex) {
        this.emdAutoTermMatchSex = emdAutoTermMatchSex;
    }

    @Basic
    @Column(name = "EMD_AUTO_TERM_MATCH_DOB")
    public String getEmdAutoTermMatchDob() {
        return emdAutoTermMatchDob;
    }

    public void setEmdAutoTermMatchDob(String emdAutoTermMatchDob) {
        this.emdAutoTermMatchDob = emdAutoTermMatchDob;
    }

    @Basic
    @Column(name = "EMD_INACTV_FUTURE_COV_IND")
    public String getEmdInactvFutureCovInd() {
        return emdInactvFutureCovInd;
    }

    public void setEmdInactvFutureCovInd(String emdInactvFutureCovInd) {
        this.emdInactvFutureCovInd = emdInactvFutureCovInd;
    }

    @Basic
    @Column(name = "EMD_PLAN_ELIG_VALIDATION")
    public String getEmdPlanEligValidation() {
        return emdPlanEligValidation;
    }

    public void setEmdPlanEligValidation(String emdPlanEligValidation) {
        this.emdPlanEligValidation = emdPlanEligValidation;
    }

    @Basic
    @Column(name = "EMD_SSN_ON_ERROR_FILE")
    public String getEmdSsnOnErrorFile() {
        return emdSsnOnErrorFile;
    }

    public void setEmdSsnOnErrorFile(String emdSsnOnErrorFile) {
        this.emdSsnOnErrorFile = emdSsnOnErrorFile;
    }

    @Basic
    @Column(name = "EMD_MAI_LOCK")
    public String getEmdMaiLock() {
        return emdMaiLock;
    }

    public void setEmdMaiLock(String emdMaiLock) {
        this.emdMaiLock = emdMaiLock;
    }

    @Basic
    @Column(name = "EMD_MEMBER_ID_FORMAT_CHEC")
    public String getEmdMemberIdFormatChec() {
        return emdMemberIdFormatChec;
    }

    public void setEmdMemberIdFormatChec(String emdMemberIdFormatChec) {
        this.emdMemberIdFormatChec = emdMemberIdFormatChec;
    }

    @Basic
    @Column(name = "EMD_DATA_FLDS_IND")
    public String getEmdDataFldsInd() {
        return emdDataFldsInd;
    }

    public void setEmdDataFldsInd(String emdDataFldsInd) {
        this.emdDataFldsInd = emdDataFldsInd;
    }

    @Basic
    @Column(name = "EMD_DATA_FLDS_EFF_DTE_IND")
    public String getEmdDataFldsEffDteInd() {
        return emdDataFldsEffDteInd;
    }

    public void setEmdDataFldsEffDteInd(String emdDataFldsEffDteInd) {
        this.emdDataFldsEffDteInd = emdDataFldsEffDteInd;
    }

    @Basic
    @Column(name = "EMD_DATA_FLDS_THR_DTE_IND")
    public String getEmdDataFldsThrDteInd() {
        return emdDataFldsThrDteInd;
    }

    public void setEmdDataFldsThrDteInd(String emdDataFldsThrDteInd) {
        this.emdDataFldsThrDteInd = emdDataFldsThrDteInd;
    }

    @Basic
    @Column(name = "ADD_USER_NAME")
    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    @Basic
    @Column(name = "ADD_DATE")
    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    @Basic
    @Column(name = "ADD_TIME")
    public Time getAddTime() {
        return addTime;
    }

    public void setAddTime(Time addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "ADD_PROGRAM_NAME")
    public String getAddProgramName() {
        return addProgramName;
    }

    public void setAddProgramName(String addProgramName) {
        this.addProgramName = addProgramName;
    }

    @Basic
    @Column(name = "CHG_USER_NAME")
    public String getChgUserName() {
        return chgUserName;
    }

    public void setChgUserName(String chgUserName) {
        this.chgUserName = chgUserName;
    }

    @Basic
    @Column(name = "CHG_DATE")
    public Date getChgDate() {
        return chgDate;
    }

    public void setChgDate(Date chgDate) {
        this.chgDate = chgDate;
    }

    @Basic
    @Column(name = "CHG_TIME")
    public Time getChgTime() {
        return chgTime;
    }

    public void setChgTime(Time chgTime) {
        this.chgTime = chgTime;
    }

    @Basic
    @Column(name = "CHG_PROGRAM_NAME")
    public String getChgProgramName() {
        return chgProgramName;
    }

    public void setChgProgramName(String chgProgramName) {
        this.chgProgramName = chgProgramName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElgEligMemberDefaultsEmd that = (ElgEligMemberDefaultsEmd) o;

        if (emdSocSecNbr != that.emdSocSecNbr) return false;
        if (emdThruDays != that.emdThruDays) return false;
        if (carCarrierId != null ? !carCarrierId.equals(that.carCarrierId) : that.carCarrierId != null) return false;
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        if (emdMemberEligibilityTp != null ? !emdMemberEligibilityTp.equals(that.emdMemberEligibilityTp) : that.emdMemberEligibilityTp != null)
            return false;
        if (emdCreateFamilyInd != null ? !emdCreateFamilyInd.equals(that.emdCreateFamilyInd) : that.emdCreateFamilyInd != null)
            return false;
        if (emdCreateSpouseInd != null ? !emdCreateSpouseInd.equals(that.emdCreateSpouseInd) : that.emdCreateSpouseInd != null)
            return false;
        if (emdCreateDependentsInd != null ? !emdCreateDependentsInd.equals(that.emdCreateDependentsInd) : that.emdCreateDependentsInd != null)
            return false;
        if (emdNumberOfDependents != null ? !emdNumberOfDependents.equals(that.emdNumberOfDependents) : that.emdNumberOfDependents != null)
            return false;
        if (emdNameInd != null ? !emdNameInd.equals(that.emdNameInd) : that.emdNameInd != null) return false;
        if (emdLastName != null ? !emdLastName.equals(that.emdLastName) : that.emdLastName != null) return false;
        if (emdFirstName != null ? !emdFirstName.equals(that.emdFirstName) : that.emdFirstName != null) return false;
        if (emdMiddleInitial != null ? !emdMiddleInitial.equals(that.emdMiddleInitial) : that.emdMiddleInitial != null)
            return false;
        if (emdAddressInd != null ? !emdAddressInd.equals(that.emdAddressInd) : that.emdAddressInd != null)
            return false;
        if (emdCountryInd != null ? !emdCountryInd.equals(that.emdCountryInd) : that.emdCountryInd != null)
            return false;
        if (emdCountryCode != null ? !emdCountryCode.equals(that.emdCountryCode) : that.emdCountryCode != null)
            return false;
        if (emdEmailInd != null ? !emdEmailInd.equals(that.emdEmailInd) : that.emdEmailInd != null) return false;
        if (emdPhoneNumberInd != null ? !emdPhoneNumberInd.equals(that.emdPhoneNumberInd) : that.emdPhoneNumberInd != null)
            return false;
        if (emdSocSecNbrInd != null ? !emdSocSecNbrInd.equals(that.emdSocSecNbrInd) : that.emdSocSecNbrInd != null)
            return false;
        if (emdBuildSocSecNbr != null ? !emdBuildSocSecNbr.equals(that.emdBuildSocSecNbr) : that.emdBuildSocSecNbr != null)
            return false;
        if (emdSexInd != null ? !emdSexInd.equals(that.emdSexInd) : that.emdSexInd != null) return false;
        if (emdSex != null ? !emdSex.equals(that.emdSex) : that.emdSex != null) return false;
        if (emdDurKeyInd != null ? !emdDurKeyInd.equals(that.emdDurKeyInd) : that.emdDurKeyInd != null) return false;
        if (emdDurKey != null ? !emdDurKey.equals(that.emdDurKey) : that.emdDurKey != null) return false;
        if (emdDateOfBirthInd != null ? !emdDateOfBirthInd.equals(that.emdDateOfBirthInd) : that.emdDateOfBirthInd != null)
            return false;
        if (emdDateOfBirth != null ? !emdDateOfBirth.equals(that.emdDateOfBirth) : that.emdDateOfBirth != null)
            return false;
        if (emdRenewalDateInd != null ? !emdRenewalDateInd.equals(that.emdRenewalDateInd) : that.emdRenewalDateInd != null)
            return false;
        if (emdRenewalDate != null ? !emdRenewalDate.equals(that.emdRenewalDate) : that.emdRenewalDate != null)
            return false;
        if (emdEffectiveDateInd != null ? !emdEffectiveDateInd.equals(that.emdEffectiveDateInd) : that.emdEffectiveDateInd != null)
            return false;
        if (emdEffectiveDate != null ? !emdEffectiveDate.equals(that.emdEffectiveDate) : that.emdEffectiveDate != null)
            return false;
        if (emdThruDateInd != null ? !emdThruDateInd.equals(that.emdThruDateInd) : that.emdThruDateInd != null)
            return false;
        if (emdThruDate != null ? !emdThruDate.equals(that.emdThruDate) : that.emdThruDate != null) return false;
        if (emdMedicareHicInd != null ? !emdMedicareHicInd.equals(that.emdMedicareHicInd) : that.emdMedicareHicInd != null)
            return false;
        if (emdMedicareHic != null ? !emdMedicareHic.equals(that.emdMedicareHic) : that.emdMedicareHic != null)
            return false;
        if (emdMedicareEffDateInd != null ? !emdMedicareEffDateInd.equals(that.emdMedicareEffDateInd) : that.emdMedicareEffDateInd != null)
            return false;
        if (emdMedicareEffDate != null ? !emdMedicareEffDate.equals(that.emdMedicareEffDate) : that.emdMedicareEffDate != null)
            return false;
        if (emdMedicareCvgTypeInd != null ? !emdMedicareCvgTypeInd.equals(that.emdMedicareCvgTypeInd) : that.emdMedicareCvgTypeInd != null)
            return false;
        if (emdMedicareCvgType != null ? !emdMedicareCvgType.equals(that.emdMedicareCvgType) : that.emdMedicareCvgType != null)
            return false;
        if (emdPhysicianIdInd != null ? !emdPhysicianIdInd.equals(that.emdPhysicianIdInd) : that.emdPhysicianIdInd != null)
            return false;
        if (prfPrescriberId != null ? !prfPrescriberId.equals(that.prfPrescriberId) : that.prfPrescriberId != null)
            return false;
        if (prqPrscrbrIdQualifier != null ? !prqPrscrbrIdQualifier.equals(that.prqPrscrbrIdQualifier) : that.prqPrscrbrIdQualifier != null)
            return false;
        if (prfPrescriberIdState != null ? !prfPrescriberIdState.equals(that.prfPrescriberIdState) : that.prfPrescriberIdState != null)
            return false;
        if (emdCareFacilityInd != null ? !emdCareFacilityInd.equals(that.emdCareFacilityInd) : that.emdCareFacilityInd != null)
            return false;
        if (cfaCareFacilityId != null ? !cfaCareFacilityId.equals(that.cfaCareFacilityId) : that.cfaCareFacilityId != null)
            return false;
        if (emdPersonCodeInd != null ? !emdPersonCodeInd.equals(that.emdPersonCodeInd) : that.emdPersonCodeInd != null)
            return false;
        if (emdPersonCode != null ? !emdPersonCode.equals(that.emdPersonCode) : that.emdPersonCode != null)
            return false;
        if (emdFamilyTypeInd != null ? !emdFamilyTypeInd.equals(that.emdFamilyTypeInd) : that.emdFamilyTypeInd != null)
            return false;
        if (emdFamilyType != null ? !emdFamilyType.equals(that.emdFamilyType) : that.emdFamilyType != null)
            return false;
        if (emdFamilyIndicatorInd != null ? !emdFamilyIndicatorInd.equals(that.emdFamilyIndicatorInd) : that.emdFamilyIndicatorInd != null)
            return false;
        if (emdFamilyIndicator != null ? !emdFamilyIndicator.equals(that.emdFamilyIndicator) : that.emdFamilyIndicator != null)
            return false;
        if (emdFamilyIdInd != null ? !emdFamilyIdInd.equals(that.emdFamilyIdInd) : that.emdFamilyIdInd != null)
            return false;
        if (emdFamilyId != null ? !emdFamilyId.equals(that.emdFamilyId) : that.emdFamilyId != null) return false;
        if (emdRelationshipCodeInd != null ? !emdRelationshipCodeInd.equals(that.emdRelationshipCodeInd) : that.emdRelationshipCodeInd != null)
            return false;
        if (emdRelationshipCode != null ? !emdRelationshipCode.equals(that.emdRelationshipCode) : that.emdRelationshipCode != null)
            return false;
        if (emdAlternateInsInd != null ? !emdAlternateInsInd.equals(that.emdAlternateInsInd) : that.emdAlternateInsInd != null)
            return false;
        if (emdAlternateIns != null ? !emdAlternateIns.equals(that.emdAlternateIns) : that.emdAlternateIns != null)
            return false;
        if (emdAltInsCodeInd != null ? !emdAltInsCodeInd.equals(that.emdAltInsCodeInd) : that.emdAltInsCodeInd != null)
            return false;
        if (emdAltInsCode != null ? !emdAltInsCode.equals(that.emdAltInsCode) : that.emdAltInsCode != null)
            return false;
        if (emdAltInsuranceIdInd != null ? !emdAltInsuranceIdInd.equals(that.emdAltInsuranceIdInd) : that.emdAltInsuranceIdInd != null)
            return false;
        if (emdAltInsuranceId != null ? !emdAltInsuranceId.equals(that.emdAltInsuranceId) : that.emdAltInsuranceId != null)
            return false;
        if (emdBrandCopayInd != null ? !emdBrandCopayInd.equals(that.emdBrandCopayInd) : that.emdBrandCopayInd != null)
            return false;
        if (emdBrandCopay != null ? !emdBrandCopay.equals(that.emdBrandCopay) : that.emdBrandCopay != null)
            return false;
        if (emdGenericCopayInd != null ? !emdGenericCopayInd.equals(that.emdGenericCopayInd) : that.emdGenericCopayInd != null)
            return false;
        if (emdGenericCopay != null ? !emdGenericCopay.equals(that.emdGenericCopay) : that.emdGenericCopay != null)
            return false;
        if (emdCopay3Ind != null ? !emdCopay3Ind.equals(that.emdCopay3Ind) : that.emdCopay3Ind != null) return false;
        if (emdCopay3 != null ? !emdCopay3.equals(that.emdCopay3) : that.emdCopay3 != null) return false;
        if (emdCopay4Ind != null ? !emdCopay4Ind.equals(that.emdCopay4Ind) : that.emdCopay4Ind != null) return false;
        if (emdCopay4 != null ? !emdCopay4.equals(that.emdCopay4) : that.emdCopay4 != null) return false;
        if (emdPlanInd != null ? !emdPlanInd.equals(that.emdPlanInd) : that.emdPlanInd != null) return false;
        if (planCode != null ? !planCode.equals(that.planCode) : that.planCode != null) return false;
        if (planEffDate != null ? !planEffDate.equals(that.planEffDate) : that.planEffDate != null) return false;
        if (emdLanguageCodeInd != null ? !emdLanguageCodeInd.equals(that.emdLanguageCodeInd) : that.emdLanguageCodeInd != null)
            return false;
        if (emdLanguageCode != null ? !emdLanguageCode.equals(that.emdLanguageCode) : that.emdLanguageCode != null)
            return false;
        if (emdDurFlagInd != null ? !emdDurFlagInd.equals(that.emdDurFlagInd) : that.emdDurFlagInd != null)
            return false;
        if (emdDurFlag != null ? !emdDurFlag.equals(that.emdDurFlag) : that.emdDurFlag != null) return false;
        if (emdMultBirthCodeInd != null ? !emdMultBirthCodeInd.equals(that.emdMultBirthCodeInd) : that.emdMultBirthCodeInd != null)
            return false;
        if (emdMultipleBirthCode != null ? !emdMultipleBirthCode.equals(that.emdMultipleBirthCode) : that.emdMultipleBirthCode != null)
            return false;
        if (emdBaseMemberIdLength != null ? !emdBaseMemberIdLength.equals(that.emdBaseMemberIdLength) : that.emdBaseMemberIdLength != null)
            return false;
        if (emdOrigEffDateInd != null ? !emdOrigEffDateInd.equals(that.emdOrigEffDateInd) : that.emdOrigEffDateInd != null)
            return false;
        if (emdOrigEffectiveDate != null ? !emdOrigEffectiveDate.equals(that.emdOrigEffectiveDate) : that.emdOrigEffectiveDate != null)
            return false;
        if (emdMemberTypeInd != null ? !emdMemberTypeInd.equals(that.emdMemberTypeInd) : that.emdMemberTypeInd != null)
            return false;
        if (emdMemberType != null ? !emdMemberType.equals(that.emdMemberType) : that.emdMemberType != null)
            return false;
        if (emdNetworkInd != null ? !emdNetworkInd.equals(that.emdNetworkInd) : that.emdNetworkInd != null)
            return false;
        if (cnwNetworkId != null ? !cnwNetworkId.equals(that.cnwNetworkId) : that.cnwNetworkId != null) return false;
        if (emdQualifierInd != null ? !emdQualifierInd.equals(that.emdQualifierInd) : that.emdQualifierInd != null)
            return false;
        if (cquQualifierId != null ? !cquQualifierId.equals(that.cquQualifierId) : that.cquQualifierId != null)
            return false;
        if (emdCareEffDateInd != null ? !emdCareEffDateInd.equals(that.emdCareEffDateInd) : that.emdCareEffDateInd != null)
            return false;
        if (emdCareEffDate != null ? !emdCareEffDate.equals(that.emdCareEffDate) : that.emdCareEffDate != null)
            return false;
        if (emdCareThruDateInd != null ? !emdCareThruDateInd.equals(that.emdCareThruDateInd) : that.emdCareThruDateInd != null)
            return false;
        if (emdCareThruDate != null ? !emdCareThruDate.equals(that.emdCareThruDate) : that.emdCareThruDate != null)
            return false;
        if (emdClientProdCodeInd != null ? !emdClientProdCodeInd.equals(that.emdClientProdCodeInd) : that.emdClientProdCodeInd != null)
            return false;
        if (emdClientProductCode != null ? !emdClientProductCode.equals(that.emdClientProductCode) : that.emdClientProductCode != null)
            return false;
        if (emdClientRiderCodeInd != null ? !emdClientRiderCodeInd.equals(that.emdClientRiderCodeInd) : that.emdClientRiderCodeInd != null)
            return false;
        if (emdClientRiderCode != null ? !emdClientRiderCode.equals(that.emdClientRiderCode) : that.emdClientRiderCode != null)
            return false;
        if (emdMcfOvrPlanInd != null ? !emdMcfOvrPlanInd.equals(that.emdMcfOvrPlanInd) : that.emdMcfOvrPlanInd != null)
            return false;
        if (emdMcfOvrPlanCode != null ? !emdMcfOvrPlanCode.equals(that.emdMcfOvrPlanCode) : that.emdMcfOvrPlanCode != null)
            return false;
        if (emdMcfOvrPlanEffDate != null ? !emdMcfOvrPlanEffDate.equals(that.emdMcfOvrPlanEffDate) : that.emdMcfOvrPlanEffDate != null)
            return false;
        if (emdMaiEffDateInd != null ? !emdMaiEffDateInd.equals(that.emdMaiEffDateInd) : that.emdMaiEffDateInd != null)
            return false;
        if (emdMaiEffDate != null ? !emdMaiEffDate.equals(that.emdMaiEffDate) : that.emdMaiEffDate != null)
            return false;
        if (emdMaiThruDateInd != null ? !emdMaiThruDateInd.equals(that.emdMaiThruDateInd) : that.emdMaiThruDateInd != null)
            return false;
        if (emdMaiThruDate != null ? !emdMaiThruDate.equals(that.emdMaiThruDate) : that.emdMaiThruDate != null)
            return false;
        if (emdAutoTermMatchSex != null ? !emdAutoTermMatchSex.equals(that.emdAutoTermMatchSex) : that.emdAutoTermMatchSex != null)
            return false;
        if (emdAutoTermMatchDob != null ? !emdAutoTermMatchDob.equals(that.emdAutoTermMatchDob) : that.emdAutoTermMatchDob != null)
            return false;
        if (emdInactvFutureCovInd != null ? !emdInactvFutureCovInd.equals(that.emdInactvFutureCovInd) : that.emdInactvFutureCovInd != null)
            return false;
        if (emdPlanEligValidation != null ? !emdPlanEligValidation.equals(that.emdPlanEligValidation) : that.emdPlanEligValidation != null)
            return false;
        if (emdSsnOnErrorFile != null ? !emdSsnOnErrorFile.equals(that.emdSsnOnErrorFile) : that.emdSsnOnErrorFile != null)
            return false;
        if (emdMaiLock != null ? !emdMaiLock.equals(that.emdMaiLock) : that.emdMaiLock != null) return false;
        if (emdMemberIdFormatChec != null ? !emdMemberIdFormatChec.equals(that.emdMemberIdFormatChec) : that.emdMemberIdFormatChec != null)
            return false;
        if (emdDataFldsInd != null ? !emdDataFldsInd.equals(that.emdDataFldsInd) : that.emdDataFldsInd != null)
            return false;
        if (emdDataFldsEffDteInd != null ? !emdDataFldsEffDteInd.equals(that.emdDataFldsEffDteInd) : that.emdDataFldsEffDteInd != null)
            return false;
        if (emdDataFldsThrDteInd != null ? !emdDataFldsThrDteInd.equals(that.emdDataFldsThrDteInd) : that.emdDataFldsThrDteInd != null)
            return false;
        if (addUserName != null ? !addUserName.equals(that.addUserName) : that.addUserName != null) return false;
        if (addDate != null ? !addDate.equals(that.addDate) : that.addDate != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (addProgramName != null ? !addProgramName.equals(that.addProgramName) : that.addProgramName != null)
            return false;
        if (chgUserName != null ? !chgUserName.equals(that.chgUserName) : that.chgUserName != null) return false;
        if (chgDate != null ? !chgDate.equals(that.chgDate) : that.chgDate != null) return false;
        if (chgTime != null ? !chgTime.equals(that.chgTime) : that.chgTime != null) return false;
        if (chgProgramName != null ? !chgProgramName.equals(that.chgProgramName) : that.chgProgramName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = carCarrierId != null ? carCarrierId.hashCode() : 0;
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (emdMemberEligibilityTp != null ? emdMemberEligibilityTp.hashCode() : 0);
        result = 31 * result + (emdCreateFamilyInd != null ? emdCreateFamilyInd.hashCode() : 0);
        result = 31 * result + (emdCreateSpouseInd != null ? emdCreateSpouseInd.hashCode() : 0);
        result = 31 * result + (emdCreateDependentsInd != null ? emdCreateDependentsInd.hashCode() : 0);
        result = 31 * result + (emdNumberOfDependents != null ? emdNumberOfDependents.hashCode() : 0);
        result = 31 * result + (emdNameInd != null ? emdNameInd.hashCode() : 0);
        result = 31 * result + (emdLastName != null ? emdLastName.hashCode() : 0);
        result = 31 * result + (emdFirstName != null ? emdFirstName.hashCode() : 0);
        result = 31 * result + (emdMiddleInitial != null ? emdMiddleInitial.hashCode() : 0);
        result = 31 * result + (emdAddressInd != null ? emdAddressInd.hashCode() : 0);
        result = 31 * result + (emdCountryInd != null ? emdCountryInd.hashCode() : 0);
        result = 31 * result + (emdCountryCode != null ? emdCountryCode.hashCode() : 0);
        result = 31 * result + (emdEmailInd != null ? emdEmailInd.hashCode() : 0);
        result = 31 * result + (emdPhoneNumberInd != null ? emdPhoneNumberInd.hashCode() : 0);
        result = 31 * result + (emdSocSecNbrInd != null ? emdSocSecNbrInd.hashCode() : 0);
        result = 31 * result + emdSocSecNbr;
        result = 31 * result + (emdBuildSocSecNbr != null ? emdBuildSocSecNbr.hashCode() : 0);
        result = 31 * result + (emdSexInd != null ? emdSexInd.hashCode() : 0);
        result = 31 * result + (emdSex != null ? emdSex.hashCode() : 0);
        result = 31 * result + (emdDurKeyInd != null ? emdDurKeyInd.hashCode() : 0);
        result = 31 * result + (emdDurKey != null ? emdDurKey.hashCode() : 0);
        result = 31 * result + (emdDateOfBirthInd != null ? emdDateOfBirthInd.hashCode() : 0);
        result = 31 * result + (emdDateOfBirth != null ? emdDateOfBirth.hashCode() : 0);
        result = 31 * result + (emdRenewalDateInd != null ? emdRenewalDateInd.hashCode() : 0);
        result = 31 * result + (emdRenewalDate != null ? emdRenewalDate.hashCode() : 0);
        result = 31 * result + (emdEffectiveDateInd != null ? emdEffectiveDateInd.hashCode() : 0);
        result = 31 * result + (emdEffectiveDate != null ? emdEffectiveDate.hashCode() : 0);
        result = 31 * result + (emdThruDateInd != null ? emdThruDateInd.hashCode() : 0);
        result = 31 * result + (emdThruDate != null ? emdThruDate.hashCode() : 0);
        result = 31 * result + emdThruDays;
        result = 31 * result + (emdMedicareHicInd != null ? emdMedicareHicInd.hashCode() : 0);
        result = 31 * result + (emdMedicareHic != null ? emdMedicareHic.hashCode() : 0);
        result = 31 * result + (emdMedicareEffDateInd != null ? emdMedicareEffDateInd.hashCode() : 0);
        result = 31 * result + (emdMedicareEffDate != null ? emdMedicareEffDate.hashCode() : 0);
        result = 31 * result + (emdMedicareCvgTypeInd != null ? emdMedicareCvgTypeInd.hashCode() : 0);
        result = 31 * result + (emdMedicareCvgType != null ? emdMedicareCvgType.hashCode() : 0);
        result = 31 * result + (emdPhysicianIdInd != null ? emdPhysicianIdInd.hashCode() : 0);
        result = 31 * result + (prfPrescriberId != null ? prfPrescriberId.hashCode() : 0);
        result = 31 * result + (prqPrscrbrIdQualifier != null ? prqPrscrbrIdQualifier.hashCode() : 0);
        result = 31 * result + (prfPrescriberIdState != null ? prfPrescriberIdState.hashCode() : 0);
        result = 31 * result + (emdCareFacilityInd != null ? emdCareFacilityInd.hashCode() : 0);
        result = 31 * result + (cfaCareFacilityId != null ? cfaCareFacilityId.hashCode() : 0);
        result = 31 * result + (emdPersonCodeInd != null ? emdPersonCodeInd.hashCode() : 0);
        result = 31 * result + (emdPersonCode != null ? emdPersonCode.hashCode() : 0);
        result = 31 * result + (emdFamilyTypeInd != null ? emdFamilyTypeInd.hashCode() : 0);
        result = 31 * result + (emdFamilyType != null ? emdFamilyType.hashCode() : 0);
        result = 31 * result + (emdFamilyIndicatorInd != null ? emdFamilyIndicatorInd.hashCode() : 0);
        result = 31 * result + (emdFamilyIndicator != null ? emdFamilyIndicator.hashCode() : 0);
        result = 31 * result + (emdFamilyIdInd != null ? emdFamilyIdInd.hashCode() : 0);
        result = 31 * result + (emdFamilyId != null ? emdFamilyId.hashCode() : 0);
        result = 31 * result + (emdRelationshipCodeInd != null ? emdRelationshipCodeInd.hashCode() : 0);
        result = 31 * result + (emdRelationshipCode != null ? emdRelationshipCode.hashCode() : 0);
        result = 31 * result + (emdAlternateInsInd != null ? emdAlternateInsInd.hashCode() : 0);
        result = 31 * result + (emdAlternateIns != null ? emdAlternateIns.hashCode() : 0);
        result = 31 * result + (emdAltInsCodeInd != null ? emdAltInsCodeInd.hashCode() : 0);
        result = 31 * result + (emdAltInsCode != null ? emdAltInsCode.hashCode() : 0);
        result = 31 * result + (emdAltInsuranceIdInd != null ? emdAltInsuranceIdInd.hashCode() : 0);
        result = 31 * result + (emdAltInsuranceId != null ? emdAltInsuranceId.hashCode() : 0);
        result = 31 * result + (emdBrandCopayInd != null ? emdBrandCopayInd.hashCode() : 0);
        result = 31 * result + (emdBrandCopay != null ? emdBrandCopay.hashCode() : 0);
        result = 31 * result + (emdGenericCopayInd != null ? emdGenericCopayInd.hashCode() : 0);
        result = 31 * result + (emdGenericCopay != null ? emdGenericCopay.hashCode() : 0);
        result = 31 * result + (emdCopay3Ind != null ? emdCopay3Ind.hashCode() : 0);
        result = 31 * result + (emdCopay3 != null ? emdCopay3.hashCode() : 0);
        result = 31 * result + (emdCopay4Ind != null ? emdCopay4Ind.hashCode() : 0);
        result = 31 * result + (emdCopay4 != null ? emdCopay4.hashCode() : 0);
        result = 31 * result + (emdPlanInd != null ? emdPlanInd.hashCode() : 0);
        result = 31 * result + (planCode != null ? planCode.hashCode() : 0);
        result = 31 * result + (planEffDate != null ? planEffDate.hashCode() : 0);
        result = 31 * result + (emdLanguageCodeInd != null ? emdLanguageCodeInd.hashCode() : 0);
        result = 31 * result + (emdLanguageCode != null ? emdLanguageCode.hashCode() : 0);
        result = 31 * result + (emdDurFlagInd != null ? emdDurFlagInd.hashCode() : 0);
        result = 31 * result + (emdDurFlag != null ? emdDurFlag.hashCode() : 0);
        result = 31 * result + (emdMultBirthCodeInd != null ? emdMultBirthCodeInd.hashCode() : 0);
        result = 31 * result + (emdMultipleBirthCode != null ? emdMultipleBirthCode.hashCode() : 0);
        result = 31 * result + (emdBaseMemberIdLength != null ? emdBaseMemberIdLength.hashCode() : 0);
        result = 31 * result + (emdOrigEffDateInd != null ? emdOrigEffDateInd.hashCode() : 0);
        result = 31 * result + (emdOrigEffectiveDate != null ? emdOrigEffectiveDate.hashCode() : 0);
        result = 31 * result + (emdMemberTypeInd != null ? emdMemberTypeInd.hashCode() : 0);
        result = 31 * result + (emdMemberType != null ? emdMemberType.hashCode() : 0);
        result = 31 * result + (emdNetworkInd != null ? emdNetworkInd.hashCode() : 0);
        result = 31 * result + (cnwNetworkId != null ? cnwNetworkId.hashCode() : 0);
        result = 31 * result + (emdQualifierInd != null ? emdQualifierInd.hashCode() : 0);
        result = 31 * result + (cquQualifierId != null ? cquQualifierId.hashCode() : 0);
        result = 31 * result + (emdCareEffDateInd != null ? emdCareEffDateInd.hashCode() : 0);
        result = 31 * result + (emdCareEffDate != null ? emdCareEffDate.hashCode() : 0);
        result = 31 * result + (emdCareThruDateInd != null ? emdCareThruDateInd.hashCode() : 0);
        result = 31 * result + (emdCareThruDate != null ? emdCareThruDate.hashCode() : 0);
        result = 31 * result + (emdClientProdCodeInd != null ? emdClientProdCodeInd.hashCode() : 0);
        result = 31 * result + (emdClientProductCode != null ? emdClientProductCode.hashCode() : 0);
        result = 31 * result + (emdClientRiderCodeInd != null ? emdClientRiderCodeInd.hashCode() : 0);
        result = 31 * result + (emdClientRiderCode != null ? emdClientRiderCode.hashCode() : 0);
        result = 31 * result + (emdMcfOvrPlanInd != null ? emdMcfOvrPlanInd.hashCode() : 0);
        result = 31 * result + (emdMcfOvrPlanCode != null ? emdMcfOvrPlanCode.hashCode() : 0);
        result = 31 * result + (emdMcfOvrPlanEffDate != null ? emdMcfOvrPlanEffDate.hashCode() : 0);
        result = 31 * result + (emdMaiEffDateInd != null ? emdMaiEffDateInd.hashCode() : 0);
        result = 31 * result + (emdMaiEffDate != null ? emdMaiEffDate.hashCode() : 0);
        result = 31 * result + (emdMaiThruDateInd != null ? emdMaiThruDateInd.hashCode() : 0);
        result = 31 * result + (emdMaiThruDate != null ? emdMaiThruDate.hashCode() : 0);
        result = 31 * result + (emdAutoTermMatchSex != null ? emdAutoTermMatchSex.hashCode() : 0);
        result = 31 * result + (emdAutoTermMatchDob != null ? emdAutoTermMatchDob.hashCode() : 0);
        result = 31 * result + (emdInactvFutureCovInd != null ? emdInactvFutureCovInd.hashCode() : 0);
        result = 31 * result + (emdPlanEligValidation != null ? emdPlanEligValidation.hashCode() : 0);
        result = 31 * result + (emdSsnOnErrorFile != null ? emdSsnOnErrorFile.hashCode() : 0);
        result = 31 * result + (emdMaiLock != null ? emdMaiLock.hashCode() : 0);
        result = 31 * result + (emdMemberIdFormatChec != null ? emdMemberIdFormatChec.hashCode() : 0);
        result = 31 * result + (emdDataFldsInd != null ? emdDataFldsInd.hashCode() : 0);
        result = 31 * result + (emdDataFldsEffDteInd != null ? emdDataFldsEffDteInd.hashCode() : 0);
        result = 31 * result + (emdDataFldsThrDteInd != null ? emdDataFldsThrDteInd.hashCode() : 0);
        result = 31 * result + (addUserName != null ? addUserName.hashCode() : 0);
        result = 31 * result + (addDate != null ? addDate.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (addProgramName != null ? addProgramName.hashCode() : 0);
        result = 31 * result + (chgUserName != null ? chgUserName.hashCode() : 0);
        result = 31 * result + (chgDate != null ? chgDate.hashCode() : 0);
        result = 31 * result + (chgTime != null ? chgTime.hashCode() : 0);
        result = 31 * result + (chgProgramName != null ? chgProgramName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ElgEligMemberDefaultsEmd{" +
                "carCarrierId='" + carCarrierId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", emdMemberEligibilityTp='" + emdMemberEligibilityTp + '\'' +
                ", emdCreateFamilyInd='" + emdCreateFamilyInd + '\'' +
                ", emdCreateSpouseInd='" + emdCreateSpouseInd + '\'' +
                ", emdCreateDependentsInd='" + emdCreateDependentsInd + '\'' +
                ", emdNumberOfDependents=" + emdNumberOfDependents +
                ", emdNameInd='" + emdNameInd + '\'' +
                ", emdLastName='" + emdLastName + '\'' +
                ", emdFirstName='" + emdFirstName + '\'' +
                ", emdMiddleInitial='" + emdMiddleInitial + '\'' +
                ", emdAddressInd='" + emdAddressInd + '\'' +
                ", emdCountryInd='" + emdCountryInd + '\'' +
                ", emdCountryCode='" + emdCountryCode + '\'' +
                ", emdEmailInd='" + emdEmailInd + '\'' +
                ", emdPhoneNumberInd='" + emdPhoneNumberInd + '\'' +
                ", emdSocSecNbrInd='" + emdSocSecNbrInd + '\'' +
                ", emdSocSecNbr=" + emdSocSecNbr +
                ", emdBuildSocSecNbr='" + emdBuildSocSecNbr + '\'' +
                ", emdSexInd='" + emdSexInd + '\'' +
                ", emdSex='" + emdSex + '\'' +
                ", emdDurKeyInd='" + emdDurKeyInd + '\'' +
                ", emdDurKey='" + emdDurKey + '\'' +
                ", emdDateOfBirthInd='" + emdDateOfBirthInd + '\'' +
                ", emdDateOfBirth=" + emdDateOfBirth +
                ", emdRenewalDateInd='" + emdRenewalDateInd + '\'' +
                ", emdRenewalDate=" + emdRenewalDate +
                ", emdEffectiveDateInd='" + emdEffectiveDateInd + '\'' +
                ", emdEffectiveDate=" + emdEffectiveDate +
                ", emdThruDateInd='" + emdThruDateInd + '\'' +
                ", emdThruDate=" + emdThruDate +
                ", emdThruDays=" + emdThruDays +
                ", emdMedicareHicInd='" + emdMedicareHicInd + '\'' +
                ", emdMedicareHic='" + emdMedicareHic + '\'' +
                ", emdMedicareEffDateInd='" + emdMedicareEffDateInd + '\'' +
                ", emdMedicareEffDate=" + emdMedicareEffDate +
                ", emdMedicareCvgTypeInd='" + emdMedicareCvgTypeInd + '\'' +
                ", emdMedicareCvgType='" + emdMedicareCvgType + '\'' +
                ", emdPhysicianIdInd='" + emdPhysicianIdInd + '\'' +
                ", prfPrescriberId='" + prfPrescriberId + '\'' +
                ", prqPrscrbrIdQualifier='" + prqPrscrbrIdQualifier + '\'' +
                ", prfPrescriberIdState='" + prfPrescriberIdState + '\'' +
                ", emdCareFacilityInd='" + emdCareFacilityInd + '\'' +
                ", cfaCareFacilityId='" + cfaCareFacilityId + '\'' +
                ", emdPersonCodeInd='" + emdPersonCodeInd + '\'' +
                ", emdPersonCode='" + emdPersonCode + '\'' +
                ", emdFamilyTypeInd='" + emdFamilyTypeInd + '\'' +
                ", emdFamilyType='" + emdFamilyType + '\'' +
                ", emdFamilyIndicatorInd='" + emdFamilyIndicatorInd + '\'' +
                ", emdFamilyIndicator='" + emdFamilyIndicator + '\'' +
                ", emdFamilyIdInd='" + emdFamilyIdInd + '\'' +
                ", emdFamilyId='" + emdFamilyId + '\'' +
                ", emdRelationshipCodeInd='" + emdRelationshipCodeInd + '\'' +
                ", emdRelationshipCode='" + emdRelationshipCode + '\'' +
                ", emdAlternateInsInd='" + emdAlternateInsInd + '\'' +
                ", emdAlternateIns='" + emdAlternateIns + '\'' +
                ", emdAltInsCodeInd='" + emdAltInsCodeInd + '\'' +
                ", emdAltInsCode='" + emdAltInsCode + '\'' +
                ", emdAltInsuranceIdInd='" + emdAltInsuranceIdInd + '\'' +
                ", emdAltInsuranceId='" + emdAltInsuranceId + '\'' +
                ", emdBrandCopayInd='" + emdBrandCopayInd + '\'' +
                ", emdBrandCopay=" + emdBrandCopay +
                ", emdGenericCopayInd='" + emdGenericCopayInd + '\'' +
                ", emdGenericCopay=" + emdGenericCopay +
                ", emdCopay3Ind='" + emdCopay3Ind + '\'' +
                ", emdCopay3=" + emdCopay3 +
                ", emdCopay4Ind='" + emdCopay4Ind + '\'' +
                ", emdCopay4=" + emdCopay4 +
                ", emdPlanInd='" + emdPlanInd + '\'' +
                ", planCode='" + planCode + '\'' +
                ", planEffDate=" + planEffDate +
                ", emdLanguageCodeInd='" + emdLanguageCodeInd + '\'' +
                ", emdLanguageCode='" + emdLanguageCode + '\'' +
                ", emdDurFlagInd='" + emdDurFlagInd + '\'' +
                ", emdDurFlag='" + emdDurFlag + '\'' +
                ", emdMultBirthCodeInd='" + emdMultBirthCodeInd + '\'' +
                ", emdMultipleBirthCode=" + emdMultipleBirthCode +
                ", emdBaseMemberIdLength=" + emdBaseMemberIdLength +
                ", emdOrigEffDateInd='" + emdOrigEffDateInd + '\'' +
                ", emdOrigEffectiveDate=" + emdOrigEffectiveDate +
                ", emdMemberTypeInd='" + emdMemberTypeInd + '\'' +
                ", emdMemberType='" + emdMemberType + '\'' +
                ", emdNetworkInd='" + emdNetworkInd + '\'' +
                ", cnwNetworkId='" + cnwNetworkId + '\'' +
                ", emdQualifierInd='" + emdQualifierInd + '\'' +
                ", cquQualifierId='" + cquQualifierId + '\'' +
                ", emdCareEffDateInd='" + emdCareEffDateInd + '\'' +
                ", emdCareEffDate=" + emdCareEffDate +
                ", emdCareThruDateInd='" + emdCareThruDateInd + '\'' +
                ", emdCareThruDate=" + emdCareThruDate +
                ", emdClientProdCodeInd='" + emdClientProdCodeInd + '\'' +
                ", emdClientProductCode='" + emdClientProductCode + '\'' +
                ", emdClientRiderCodeInd='" + emdClientRiderCodeInd + '\'' +
                ", emdClientRiderCode='" + emdClientRiderCode + '\'' +
                ", emdMcfOvrPlanInd='" + emdMcfOvrPlanInd + '\'' +
                ", emdMcfOvrPlanCode='" + emdMcfOvrPlanCode + '\'' +
                ", emdMcfOvrPlanEffDate=" + emdMcfOvrPlanEffDate +
                ", emdMaiEffDateInd='" + emdMaiEffDateInd + '\'' +
                ", emdMaiEffDate=" + emdMaiEffDate +
                ", emdMaiThruDateInd='" + emdMaiThruDateInd + '\'' +
                ", emdMaiThruDate=" + emdMaiThruDate +
                ", emdAutoTermMatchSex='" + emdAutoTermMatchSex + '\'' +
                ", emdAutoTermMatchDob='" + emdAutoTermMatchDob + '\'' +
                ", emdInactvFutureCovInd='" + emdInactvFutureCovInd + '\'' +
                ", emdPlanEligValidation='" + emdPlanEligValidation + '\'' +
                ", emdSsnOnErrorFile='" + emdSsnOnErrorFile + '\'' +
                ", emdMaiLock='" + emdMaiLock + '\'' +
                ", emdMemberIdFormatChec='" + emdMemberIdFormatChec + '\'' +
                ", emdDataFldsInd='" + emdDataFldsInd + '\'' +
                ", emdDataFldsEffDteInd='" + emdDataFldsEffDteInd + '\'' +
                ", emdDataFldsThrDteInd='" + emdDataFldsThrDteInd + '\'' +
                ", addUserName='" + addUserName + '\'' +
                ", addDate=" + addDate +
                ", addTime=" + addTime +
                ", addProgramName='" + addProgramName + '\'' +
                ", chgUserName='" + chgUserName + '\'' +
                ", chgDate=" + chgDate +
                ", chgTime=" + chgTime +
                ", chgProgramName='" + chgProgramName + '\''+
                '}';
    }
}
