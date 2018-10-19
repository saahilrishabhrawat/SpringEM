package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "ELG_REQUIRED_MEMBER_FIELD_RMF")
@IdClass(ElgRequiredMemberFieldRmfPK.class)
public class ElgRequiredMemberFieldRmf {
    private String rmfCarrierId;
    private String rmfAccountId;
    private String rmfGroupId;
    private BigInteger rmfMemberIdLength;
    private String rmfFirstName;
    private String rmfFirstNameVal;
    private String rmfMiddleName;
    private String rmfMiddleNameVal;
    private String rmfPersonCode;
    private String rmfPersonCodeVal;
    private String rmfRelationship;
    private String rmfRelationshipVal;
    private String rmfType;
    private String rmfTypeVal;
    private String rmfSex;
    private String rmfSexVal;
    private String rmfDateOfBirth;
    private Date rmfDateOfBirthVal;
    private String rmfMultiBirth;
    private BigInteger rmfMultiBirthVal;
    private String rmfDurKey;
    private String rmfDurKeyVal;
    private String rmfSocialSecurityNbr;
    private int rmfSocSecNbrVal;
    private String rmfAddress1;
    private String rmfAddress1Val;
    private String rmfAddress2;
    private String rmfAddress2Val;
    private String rmfAddress3;
    private String rmfAddress3Val;
    private String rmfPhone;
    private int rmfPhoneVal;
    private String rmfCity;
    private String rmfCityVal;
    private String rmfState;
    private String rmfStateVal;
    private String rmfZip2;
    private String rmfZip2Val;
    private String rmfZip1;
    private String rmfZip1Val;
    private String rmfZip3;
    private String rmfZip3Val;
    private String rmfCountry;
    private String rmfCountryVal;
    private String rmfFamilyFlag;
    private String rmfFamilyFlagVal;
    private String rmfFamilyType;
    private String rmfFamilyTypeVal;
    private String rmfFamilyId;
    private String rmfFamilyIdVal;
    private String rmfAltInsuranceFlag;
    private String rmfAltInsuranceCode;
    private String rmfAltInsuranceId;
    private String rmfMedicareType;
    private String rmfMedicareTypeVal;
    private String rmfMedicareFromDate;
    private Date rmfMedicareFromDteVal;
    private String rmfMedicareHic;
    private String rmfMedicareHicVal;
    private String rmfOriginalFromDate;
    private Date rmfOriginalFromDteVal;
    private String rmfBenefitResetDate;
    private Date rmfBenefitResetDteVal;
    private String rmfCareNetwork;
    private String rmfCarePlanOverride;
    private String rmfCareplanOREffDate;
    private String rmfCareFacility;
    private String rmfCareQualifier;
    private String rmfPrimaryProvider;
    private String rmfPlanCode;
    private String rmfPlanEffDate;
    private String rmfCopayBrand;
    private String rmfCopayGeneric;
    private String rmfCopay3;
    private String rmfCopay4;
    private String rmfClientProductCode;
    private String rmfClientRiderCode;
    private String rmfExternalProgram;
    private String rmfEmailAddress;
    private String rmfProcessDurSts;
    private String rmfProcessDurValue;
    private Date addDate;
    private String chgUserName;
    private Date chgDate;
    private Time chgTime;
    private String chgProgramName;

    @Id
    @Column(name = "RMF_CARRIER_ID")
    public String getRmfCarrierId() {
        return rmfCarrierId;
    }

    public void setRmfCarrierId(String rmfCarrierId) {
        this.rmfCarrierId = rmfCarrierId;
    }

    @Id
    @Column(name = "RMF_ACCOUNT_ID")
    public String getRmfAccountId() {
        return rmfAccountId;
    }

    public void setRmfAccountId(String rmfAccountId) {
        this.rmfAccountId = rmfAccountId;
    }

    @Id
    @Column(name = "RMF_GROUP_ID")
    public String getRmfGroupId() {
        return rmfGroupId;
    }

    public void setRmfGroupId(String rmfGroupId) {
        this.rmfGroupId = rmfGroupId;
    }

    @Basic
    @Column(name = "RMF_MEMBER_ID_LENGTH")
    public BigInteger getRmfMemberIdLength() {
        return rmfMemberIdLength;
    }

    public void setRmfMemberIdLength(BigInteger rmfMemberIdLength) {
        this.rmfMemberIdLength = rmfMemberIdLength;
    }

    @Basic
    @Column(name = "RMF_FIRST_NAME")
    public String getRmfFirstName() {
        return rmfFirstName;
    }

    public void setRmfFirstName(String rmfFirstName) {
        this.rmfFirstName = rmfFirstName;
    }

    @Basic
    @Column(name = "RMF_FIRST_NAME_VAL")
    public String getRmfFirstNameVal() {
        return rmfFirstNameVal;
    }

    public void setRmfFirstNameVal(String rmfFirstNameVal) {
        this.rmfFirstNameVal = rmfFirstNameVal;
    }

    @Basic
    @Column(name = "RMF_MIDDLE_NAME")
    public String getRmfMiddleName() {
        return rmfMiddleName;
    }

    public void setRmfMiddleName(String rmfMiddleName) {
        this.rmfMiddleName = rmfMiddleName;
    }

    @Basic
    @Column(name = "RMF_MIDDLE_NAME_VAL")
    public String getRmfMiddleNameVal() {
        return rmfMiddleNameVal;
    }

    public void setRmfMiddleNameVal(String rmfMiddleNameVal) {
        this.rmfMiddleNameVal = rmfMiddleNameVal;
    }

    @Basic
    @Column(name = "RMF_PERSON_CODE")
    public String getRmfPersonCode() {
        return rmfPersonCode;
    }

    public void setRmfPersonCode(String rmfPersonCode) {
        this.rmfPersonCode = rmfPersonCode;
    }

    @Basic
    @Column(name = "RMF_PERSON_CODE_VAL")
    public String getRmfPersonCodeVal() {
        return rmfPersonCodeVal;
    }

    public void setRmfPersonCodeVal(String rmfPersonCodeVal) {
        this.rmfPersonCodeVal = rmfPersonCodeVal;
    }

    @Basic
    @Column(name = "RMF_RELATIONSHIP")
    public String getRmfRelationship() {
        return rmfRelationship;
    }

    public void setRmfRelationship(String rmfRelationship) {
        this.rmfRelationship = rmfRelationship;
    }

    @Basic
    @Column(name = "RMF_RELATIONSHIP_VAL")
    public String getRmfRelationshipVal() {
        return rmfRelationshipVal;
    }

    public void setRmfRelationshipVal(String rmfRelationshipVal) {
        this.rmfRelationshipVal = rmfRelationshipVal;
    }

    @Basic
    @Column(name = "RMF_TYPE")
    public String getRmfType() {
        return rmfType;
    }

    public void setRmfType(String rmfType) {
        this.rmfType = rmfType;
    }

    @Basic
    @Column(name = "RMF_TYPE_VAL")
    public String getRmfTypeVal() {
        return rmfTypeVal;
    }

    public void setRmfTypeVal(String rmfTypeVal) {
        this.rmfTypeVal = rmfTypeVal;
    }

    @Basic
    @Column(name = "RMF_SEX")
    public String getRmfSex() {
        return rmfSex;
    }

    public void setRmfSex(String rmfSex) {
        this.rmfSex = rmfSex;
    }

    @Basic
    @Column(name = "RMF_SEX_VAL")
    public String getRmfSexVal() {
        return rmfSexVal;
    }

    public void setRmfSexVal(String rmfSexVal) {
        this.rmfSexVal = rmfSexVal;
    }

    @Basic
    @Column(name = "RMF_DATE_OF_BIRTH")
    public String getRmfDateOfBirth() {
        return rmfDateOfBirth;
    }

    public void setRmfDateOfBirth(String rmfDateOfBirth) {
        this.rmfDateOfBirth = rmfDateOfBirth;
    }

    @Basic
    @Column(name = "RMF_DATE_OF_BIRTH_VAL")
    public Date getRmfDateOfBirthVal() {
        return rmfDateOfBirthVal;
    }

    public void setRmfDateOfBirthVal(Date rmfDateOfBirthVal) {
        this.rmfDateOfBirthVal = rmfDateOfBirthVal;
    }

    @Basic
    @Column(name = "RMF_MULTI_BIRTH")
    public String getRmfMultiBirth() {
        return rmfMultiBirth;
    }

    public void setRmfMultiBirth(String rmfMultiBirth) {
        this.rmfMultiBirth = rmfMultiBirth;
    }

    @Basic
    @Column(name = "RMF_MULTI_BIRTH_VAL")
    public BigInteger getRmfMultiBirthVal() {
        return rmfMultiBirthVal;
    }

    public void setRmfMultiBirthVal(BigInteger rmfMultiBirthVal) {
        this.rmfMultiBirthVal = rmfMultiBirthVal;
    }

    @Basic
    @Column(name = "RMF_DUR_KEY")
    public String getRmfDurKey() {
        return rmfDurKey;
    }

    public void setRmfDurKey(String rmfDurKey) {
        this.rmfDurKey = rmfDurKey;
    }

    @Basic
    @Column(name = "RMF_DUR_KEY_VAL")
    public String getRmfDurKeyVal() {
        return rmfDurKeyVal;
    }

    public void setRmfDurKeyVal(String rmfDurKeyVal) {
        this.rmfDurKeyVal = rmfDurKeyVal;
    }

    @Basic
    @Column(name = "RMF_SOCIAL_SECURITY_NBR")
    public String getRmfSocialSecurityNbr() {
        return rmfSocialSecurityNbr;
    }

    public void setRmfSocialSecurityNbr(String rmfSocialSecurityNbr) {
        this.rmfSocialSecurityNbr = rmfSocialSecurityNbr;
    }

    @Basic
    @Column(name = "RMF_SOC_SEC_NBR_VAL")
    public int getRmfSocSecNbrVal() {
        return rmfSocSecNbrVal;
    }

    public void setRmfSocSecNbrVal(int rmfSocSecNbrVal) {
        this.rmfSocSecNbrVal = rmfSocSecNbrVal;
    }

    @Basic
    @Column(name = "RMF_ADDRESS_1")
    public String getRmfAddress1() {
        return rmfAddress1;
    }

    public void setRmfAddress1(String rmfAddress1) {
        this.rmfAddress1 = rmfAddress1;
    }

    @Basic
    @Column(name = "RMF_ADDRESS_1_VAL")
    public String getRmfAddress1Val() {
        return rmfAddress1Val;
    }

    public void setRmfAddress1Val(String rmfAddress1Val) {
        this.rmfAddress1Val = rmfAddress1Val;
    }

    @Basic
    @Column(name = "RMF_ADDRESS_2")
    public String getRmfAddress2() {
        return rmfAddress2;
    }

    public void setRmfAddress2(String rmfAddress2) {
        this.rmfAddress2 = rmfAddress2;
    }

    @Basic
    @Column(name = "RMF_ADDRESS_2_VAL")
    public String getRmfAddress2Val() {
        return rmfAddress2Val;
    }

    public void setRmfAddress2Val(String rmfAddress2Val) {
        this.rmfAddress2Val = rmfAddress2Val;
    }

    @Basic
    @Column(name = "RMF_ADDRESS_3")
    public String getRmfAddress3() {
        return rmfAddress3;
    }

    public void setRmfAddress3(String rmfAddress3) {
        this.rmfAddress3 = rmfAddress3;
    }

    @Basic
    @Column(name = "RMF_ADDRESS_3_VAL")
    public String getRmfAddress3Val() {
        return rmfAddress3Val;
    }

    public void setRmfAddress3Val(String rmfAddress3Val) {
        this.rmfAddress3Val = rmfAddress3Val;
    }

    @Basic
    @Column(name = "RMF_PHONE")
    public String getRmfPhone() {
        return rmfPhone;
    }

    public void setRmfPhone(String rmfPhone) {
        this.rmfPhone = rmfPhone;
    }

    @Basic
    @Column(name = "RMF_PHONE_VAL")
    public int getRmfPhoneVal() {
        return rmfPhoneVal;
    }

    public void setRmfPhoneVal(int rmfPhoneVal) {
        this.rmfPhoneVal = rmfPhoneVal;
    }

    @Basic
    @Column(name = "RMF_CITY")
    public String getRmfCity() {
        return rmfCity;
    }

    public void setRmfCity(String rmfCity) {
        this.rmfCity = rmfCity;
    }

    @Basic
    @Column(name = "RMF_CITY_VAL")
    public String getRmfCityVal() {
        return rmfCityVal;
    }

    public void setRmfCityVal(String rmfCityVal) {
        this.rmfCityVal = rmfCityVal;
    }

    @Basic
    @Column(name = "RMF_STATE")
    public String getRmfState() {
        return rmfState;
    }

    public void setRmfState(String rmfState) {
        this.rmfState = rmfState;
    }

    @Basic
    @Column(name = "RMF_STATE_VAL")
    public String getRmfStateVal() {
        return rmfStateVal;
    }

    public void setRmfStateVal(String rmfStateVal) {
        this.rmfStateVal = rmfStateVal;
    }

    @Basic
    @Column(name = "RMF_ZIP_2")
    public String getRmfZip2() {
        return rmfZip2;
    }

    public void setRmfZip2(String rmfZip2) {
        this.rmfZip2 = rmfZip2;
    }

    @Basic
    @Column(name = "RMF_ZIP_2_VAL")
    public String getRmfZip2Val() {
        return rmfZip2Val;
    }

    public void setRmfZip2Val(String rmfZip2Val) {
        this.rmfZip2Val = rmfZip2Val;
    }

    @Basic
    @Column(name = "RMF_ZIP_1")
    public String getRmfZip1() {
        return rmfZip1;
    }

    public void setRmfZip1(String rmfZip1) {
        this.rmfZip1 = rmfZip1;
    }

    @Basic
    @Column(name = "RMF_ZIP_1_VAL")
    public String getRmfZip1Val() {
        return rmfZip1Val;
    }

    public void setRmfZip1Val(String rmfZip1Val) {
        this.rmfZip1Val = rmfZip1Val;
    }

    @Basic
    @Column(name = "RMF_ZIP_3")
    public String getRmfZip3() {
        return rmfZip3;
    }

    public void setRmfZip3(String rmfZip3) {
        this.rmfZip3 = rmfZip3;
    }

    @Basic
    @Column(name = "RMF_ZIP_3_VAL")
    public String getRmfZip3Val() {
        return rmfZip3Val;
    }

    public void setRmfZip3Val(String rmfZip3Val) {
        this.rmfZip3Val = rmfZip3Val;
    }

    @Basic
    @Column(name = "RMF_COUNTRY")
    public String getRmfCountry() {
        return rmfCountry;
    }

    public void setRmfCountry(String rmfCountry) {
        this.rmfCountry = rmfCountry;
    }

    @Basic
    @Column(name = "RMF_COUNTRY_VAL")
    public String getRmfCountryVal() {
        return rmfCountryVal;
    }

    public void setRmfCountryVal(String rmfCountryVal) {
        this.rmfCountryVal = rmfCountryVal;
    }

    @Basic
    @Column(name = "RMF_FAMILY_FLAG")
    public String getRmfFamilyFlag() {
        return rmfFamilyFlag;
    }

    public void setRmfFamilyFlag(String rmfFamilyFlag) {
        this.rmfFamilyFlag = rmfFamilyFlag;
    }

    @Basic
    @Column(name = "RMF_FAMILY_FLAG_VAL")
    public String getRmfFamilyFlagVal() {
        return rmfFamilyFlagVal;
    }

    public void setRmfFamilyFlagVal(String rmfFamilyFlagVal) {
        this.rmfFamilyFlagVal = rmfFamilyFlagVal;
    }

    @Basic
    @Column(name = "RMF_FAMILY_TYPE")
    public String getRmfFamilyType() {
        return rmfFamilyType;
    }

    public void setRmfFamilyType(String rmfFamilyType) {
        this.rmfFamilyType = rmfFamilyType;
    }

    @Basic
    @Column(name = "RMF_FAMILY_TYPE_VAL")
    public String getRmfFamilyTypeVal() {
        return rmfFamilyTypeVal;
    }

    public void setRmfFamilyTypeVal(String rmfFamilyTypeVal) {
        this.rmfFamilyTypeVal = rmfFamilyTypeVal;
    }

    @Basic
    @Column(name = "RMF_FAMILY_ID")
    public String getRmfFamilyId() {
        return rmfFamilyId;
    }

    public void setRmfFamilyId(String rmfFamilyId) {
        this.rmfFamilyId = rmfFamilyId;
    }

    @Basic
    @Column(name = "RMF_FAMILY_ID_VAL")
    public String getRmfFamilyIdVal() {
        return rmfFamilyIdVal;
    }

    public void setRmfFamilyIdVal(String rmfFamilyIdVal) {
        this.rmfFamilyIdVal = rmfFamilyIdVal;
    }

    @Basic
    @Column(name = "RMF_ALT_INSURANCE_FLAG")
    public String getRmfAltInsuranceFlag() {
        return rmfAltInsuranceFlag;
    }

    public void setRmfAltInsuranceFlag(String rmfAltInsuranceFlag) {
        this.rmfAltInsuranceFlag = rmfAltInsuranceFlag;
    }

    @Basic
    @Column(name = "RMF_ALT_INSURANCE_CODE")
    public String getRmfAltInsuranceCode() {
        return rmfAltInsuranceCode;
    }

    public void setRmfAltInsuranceCode(String rmfAltInsuranceCode) {
        this.rmfAltInsuranceCode = rmfAltInsuranceCode;
    }

    @Basic
    @Column(name = "RMF_ALT_INSURANCE_ID")
    public String getRmfAltInsuranceId() {
        return rmfAltInsuranceId;
    }

    public void setRmfAltInsuranceId(String rmfAltInsuranceId) {
        this.rmfAltInsuranceId = rmfAltInsuranceId;
    }

    @Basic
    @Column(name = "RMF_MEDICARE_TYPE")
    public String getRmfMedicareType() {
        return rmfMedicareType;
    }

    public void setRmfMedicareType(String rmfMedicareType) {
        this.rmfMedicareType = rmfMedicareType;
    }

    @Basic
    @Column(name = "RMF_MEDICARE_TYPE_VAL")
    public String getRmfMedicareTypeVal() {
        return rmfMedicareTypeVal;
    }

    public void setRmfMedicareTypeVal(String rmfMedicareTypeVal) {
        this.rmfMedicareTypeVal = rmfMedicareTypeVal;
    }

    @Basic
    @Column(name = "RMF_MEDICARE_FROM_DATE")
    public String getRmfMedicareFromDate() {
        return rmfMedicareFromDate;
    }

    public void setRmfMedicareFromDate(String rmfMedicareFromDate) {
        this.rmfMedicareFromDate = rmfMedicareFromDate;
    }

    @Basic
    @Column(name = "RMF_MEDICARE_FROM_DTE_VAL")
    public Date getRmfMedicareFromDteVal() {
        return rmfMedicareFromDteVal;
    }

    public void setRmfMedicareFromDteVal(Date rmfMedicareFromDteVal) {
        this.rmfMedicareFromDteVal = rmfMedicareFromDteVal;
    }

    @Basic
    @Column(name = "RMF_MEDICARE_HIC")
    public String getRmfMedicareHic() {
        return rmfMedicareHic;
    }

    public void setRmfMedicareHic(String rmfMedicareHic) {
        this.rmfMedicareHic = rmfMedicareHic;
    }

    @Basic
    @Column(name = "RMF_MEDICARE_HIC_VAL")
    public String getRmfMedicareHicVal() {
        return rmfMedicareHicVal;
    }

    public void setRmfMedicareHicVal(String rmfMedicareHicVal) {
        this.rmfMedicareHicVal = rmfMedicareHicVal;
    }

    @Basic
    @Column(name = "RMF_ORIGINAL_FROM_DATE")
    public String getRmfOriginalFromDate() {
        return rmfOriginalFromDate;
    }

    public void setRmfOriginalFromDate(String rmfOriginalFromDate) {
        this.rmfOriginalFromDate = rmfOriginalFromDate;
    }

    @Basic
    @Column(name = "RMF_ORIGINAL_FROM_DTE_VAL")
    public Date getRmfOriginalFromDteVal() {
        return rmfOriginalFromDteVal;
    }

    public void setRmfOriginalFromDteVal(Date rmfOriginalFromDteVal) {
        this.rmfOriginalFromDteVal = rmfOriginalFromDteVal;
    }

    @Basic
    @Column(name = "RMF_BENEFIT_RESET_DATE")
    public String getRmfBenefitResetDate() {
        return rmfBenefitResetDate;
    }

    public void setRmfBenefitResetDate(String rmfBenefitResetDate) {
        this.rmfBenefitResetDate = rmfBenefitResetDate;
    }

    @Basic
    @Column(name = "RMF_BENEFIT_RESET_DTE_VAL")
    public Date getRmfBenefitResetDteVal() {
        return rmfBenefitResetDteVal;
    }

    public void setRmfBenefitResetDteVal(Date rmfBenefitResetDteVal) {
        this.rmfBenefitResetDteVal = rmfBenefitResetDteVal;
    }

    @Basic
    @Column(name = "RMF_CARE_NETWORK")
    public String getRmfCareNetwork() {
        return rmfCareNetwork;
    }

    public void setRmfCareNetwork(String rmfCareNetwork) {
        this.rmfCareNetwork = rmfCareNetwork;
    }

    @Basic
    @Column(name = "RMF_CARE_PLAN_OVERRIDE")
    public String getRmfCarePlanOverride() {
        return rmfCarePlanOverride;
    }

    public void setRmfCarePlanOverride(String rmfCarePlanOverride) {
        this.rmfCarePlanOverride = rmfCarePlanOverride;
    }

    @Basic
    @Column(name = "RMF_CAREPLAN_O_R_EFF_DATE")
    public String getRmfCareplanOREffDate() {
        return rmfCareplanOREffDate;
    }

    public void setRmfCareplanOREffDate(String rmfCareplanOREffDate) {
        this.rmfCareplanOREffDate = rmfCareplanOREffDate;
    }

    @Basic
    @Column(name = "RMF_CARE_FACILITY")
    public String getRmfCareFacility() {
        return rmfCareFacility;
    }

    public void setRmfCareFacility(String rmfCareFacility) {
        this.rmfCareFacility = rmfCareFacility;
    }

    @Basic
    @Column(name = "RMF_CARE_QUALIFIER")
    public String getRmfCareQualifier() {
        return rmfCareQualifier;
    }

    public void setRmfCareQualifier(String rmfCareQualifier) {
        this.rmfCareQualifier = rmfCareQualifier;
    }

    @Basic
    @Column(name = "RMF_PRIMARY_PROVIDER")
    public String getRmfPrimaryProvider() {
        return rmfPrimaryProvider;
    }

    public void setRmfPrimaryProvider(String rmfPrimaryProvider) {
        this.rmfPrimaryProvider = rmfPrimaryProvider;
    }

    @Basic
    @Column(name = "RMF_PLAN_CODE")
    public String getRmfPlanCode() {
        return rmfPlanCode;
    }

    public void setRmfPlanCode(String rmfPlanCode) {
        this.rmfPlanCode = rmfPlanCode;
    }

    @Basic
    @Column(name = "RMF_PLAN_EFF_DATE")
    public String getRmfPlanEffDate() {
        return rmfPlanEffDate;
    }

    public void setRmfPlanEffDate(String rmfPlanEffDate) {
        this.rmfPlanEffDate = rmfPlanEffDate;
    }

    @Basic
    @Column(name = "RMF_COPAY_BRAND")
    public String getRmfCopayBrand() {
        return rmfCopayBrand;
    }

    public void setRmfCopayBrand(String rmfCopayBrand) {
        this.rmfCopayBrand = rmfCopayBrand;
    }

    @Basic
    @Column(name = "RMF_COPAY_GENERIC")
    public String getRmfCopayGeneric() {
        return rmfCopayGeneric;
    }

    public void setRmfCopayGeneric(String rmfCopayGeneric) {
        this.rmfCopayGeneric = rmfCopayGeneric;
    }

    @Basic
    @Column(name = "RMF_COPAY_3")
    public String getRmfCopay3() {
        return rmfCopay3;
    }

    public void setRmfCopay3(String rmfCopay3) {
        this.rmfCopay3 = rmfCopay3;
    }

    @Basic
    @Column(name = "RMF_COPAY_4")
    public String getRmfCopay4() {
        return rmfCopay4;
    }

    public void setRmfCopay4(String rmfCopay4) {
        this.rmfCopay4 = rmfCopay4;
    }

    @Basic
    @Column(name = "RMF_CLIENT_PRODUCT_CODE")
    public String getRmfClientProductCode() {
        return rmfClientProductCode;
    }

    public void setRmfClientProductCode(String rmfClientProductCode) {
        this.rmfClientProductCode = rmfClientProductCode;
    }

    @Basic
    @Column(name = "RMF_CLIENT_RIDER_CODE")
    public String getRmfClientRiderCode() {
        return rmfClientRiderCode;
    }

    public void setRmfClientRiderCode(String rmfClientRiderCode) {
        this.rmfClientRiderCode = rmfClientRiderCode;
    }

    @Basic
    @Column(name = "RMF_EXTERNAL_PROGRAM")
    public String getRmfExternalProgram() {
        return rmfExternalProgram;
    }

    public void setRmfExternalProgram(String rmfExternalProgram) {
        this.rmfExternalProgram = rmfExternalProgram;
    }

    @Basic
    @Column(name = "RMF_EMAIL_ADDRESS")
    public String getRmfEmailAddress() {
        return rmfEmailAddress;
    }

    public void setRmfEmailAddress(String rmfEmailAddress) {
        this.rmfEmailAddress = rmfEmailAddress;
    }

    @Basic
    @Column(name = "RMF_PROCESS_DUR_STS")
    public String getRmfProcessDurSts() {
        return rmfProcessDurSts;
    }

    public void setRmfProcessDurSts(String rmfProcessDurSts) {
        this.rmfProcessDurSts = rmfProcessDurSts;
    }

    @Basic
    @Column(name = "RMF_PROCESS_DUR_VALUE")
    public String getRmfProcessDurValue() {
        return rmfProcessDurValue;
    }

    public void setRmfProcessDurValue(String rmfProcessDurValue) {
        this.rmfProcessDurValue = rmfProcessDurValue;
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
        ElgRequiredMemberFieldRmf that = (ElgRequiredMemberFieldRmf) o;
        return rmfSocSecNbrVal == that.rmfSocSecNbrVal &&
                rmfPhoneVal == that.rmfPhoneVal &&
                Objects.equals(rmfCarrierId, that.rmfCarrierId) &&
                Objects.equals(rmfAccountId, that.rmfAccountId) &&
                Objects.equals(rmfGroupId, that.rmfGroupId) &&
                Objects.equals(rmfMemberIdLength, that.rmfMemberIdLength) &&
                Objects.equals(rmfFirstName, that.rmfFirstName) &&
                Objects.equals(rmfFirstNameVal, that.rmfFirstNameVal) &&
                Objects.equals(rmfMiddleName, that.rmfMiddleName) &&
                Objects.equals(rmfMiddleNameVal, that.rmfMiddleNameVal) &&
                Objects.equals(rmfPersonCode, that.rmfPersonCode) &&
                Objects.equals(rmfPersonCodeVal, that.rmfPersonCodeVal) &&
                Objects.equals(rmfRelationship, that.rmfRelationship) &&
                Objects.equals(rmfRelationshipVal, that.rmfRelationshipVal) &&
                Objects.equals(rmfType, that.rmfType) &&
                Objects.equals(rmfTypeVal, that.rmfTypeVal) &&
                Objects.equals(rmfSex, that.rmfSex) &&
                Objects.equals(rmfSexVal, that.rmfSexVal) &&
                Objects.equals(rmfDateOfBirth, that.rmfDateOfBirth) &&
                Objects.equals(rmfDateOfBirthVal, that.rmfDateOfBirthVal) &&
                Objects.equals(rmfMultiBirth, that.rmfMultiBirth) &&
                Objects.equals(rmfMultiBirthVal, that.rmfMultiBirthVal) &&
                Objects.equals(rmfDurKey, that.rmfDurKey) &&
                Objects.equals(rmfDurKeyVal, that.rmfDurKeyVal) &&
                Objects.equals(rmfSocialSecurityNbr, that.rmfSocialSecurityNbr) &&
                Objects.equals(rmfAddress1, that.rmfAddress1) &&
                Objects.equals(rmfAddress1Val, that.rmfAddress1Val) &&
                Objects.equals(rmfAddress2, that.rmfAddress2) &&
                Objects.equals(rmfAddress2Val, that.rmfAddress2Val) &&
                Objects.equals(rmfAddress3, that.rmfAddress3) &&
                Objects.equals(rmfAddress3Val, that.rmfAddress3Val) &&
                Objects.equals(rmfPhone, that.rmfPhone) &&
                Objects.equals(rmfCity, that.rmfCity) &&
                Objects.equals(rmfCityVal, that.rmfCityVal) &&
                Objects.equals(rmfState, that.rmfState) &&
                Objects.equals(rmfStateVal, that.rmfStateVal) &&
                Objects.equals(rmfZip2, that.rmfZip2) &&
                Objects.equals(rmfZip2Val, that.rmfZip2Val) &&
                Objects.equals(rmfZip1, that.rmfZip1) &&
                Objects.equals(rmfZip1Val, that.rmfZip1Val) &&
                Objects.equals(rmfZip3, that.rmfZip3) &&
                Objects.equals(rmfZip3Val, that.rmfZip3Val) &&
                Objects.equals(rmfCountry, that.rmfCountry) &&
                Objects.equals(rmfCountryVal, that.rmfCountryVal) &&
                Objects.equals(rmfFamilyFlag, that.rmfFamilyFlag) &&
                Objects.equals(rmfFamilyFlagVal, that.rmfFamilyFlagVal) &&
                Objects.equals(rmfFamilyType, that.rmfFamilyType) &&
                Objects.equals(rmfFamilyTypeVal, that.rmfFamilyTypeVal) &&
                Objects.equals(rmfFamilyId, that.rmfFamilyId) &&
                Objects.equals(rmfFamilyIdVal, that.rmfFamilyIdVal) &&
                Objects.equals(rmfAltInsuranceFlag, that.rmfAltInsuranceFlag) &&
                Objects.equals(rmfAltInsuranceCode, that.rmfAltInsuranceCode) &&
                Objects.equals(rmfAltInsuranceId, that.rmfAltInsuranceId) &&
                Objects.equals(rmfMedicareType, that.rmfMedicareType) &&
                Objects.equals(rmfMedicareTypeVal, that.rmfMedicareTypeVal) &&
                Objects.equals(rmfMedicareFromDate, that.rmfMedicareFromDate) &&
                Objects.equals(rmfMedicareFromDteVal, that.rmfMedicareFromDteVal) &&
                Objects.equals(rmfMedicareHic, that.rmfMedicareHic) &&
                Objects.equals(rmfMedicareHicVal, that.rmfMedicareHicVal) &&
                Objects.equals(rmfOriginalFromDate, that.rmfOriginalFromDate) &&
                Objects.equals(rmfOriginalFromDteVal, that.rmfOriginalFromDteVal) &&
                Objects.equals(rmfBenefitResetDate, that.rmfBenefitResetDate) &&
                Objects.equals(rmfBenefitResetDteVal, that.rmfBenefitResetDteVal) &&
                Objects.equals(rmfCareNetwork, that.rmfCareNetwork) &&
                Objects.equals(rmfCarePlanOverride, that.rmfCarePlanOverride) &&
                Objects.equals(rmfCareplanOREffDate, that.rmfCareplanOREffDate) &&
                Objects.equals(rmfCareFacility, that.rmfCareFacility) &&
                Objects.equals(rmfCareQualifier, that.rmfCareQualifier) &&
                Objects.equals(rmfPrimaryProvider, that.rmfPrimaryProvider) &&
                Objects.equals(rmfPlanCode, that.rmfPlanCode) &&
                Objects.equals(rmfPlanEffDate, that.rmfPlanEffDate) &&
                Objects.equals(rmfCopayBrand, that.rmfCopayBrand) &&
                Objects.equals(rmfCopayGeneric, that.rmfCopayGeneric) &&
                Objects.equals(rmfCopay3, that.rmfCopay3) &&
                Objects.equals(rmfCopay4, that.rmfCopay4) &&
                Objects.equals(rmfClientProductCode, that.rmfClientProductCode) &&
                Objects.equals(rmfClientRiderCode, that.rmfClientRiderCode) &&
                Objects.equals(rmfExternalProgram, that.rmfExternalProgram) &&
                Objects.equals(rmfEmailAddress, that.rmfEmailAddress) &&
                Objects.equals(rmfProcessDurSts, that.rmfProcessDurSts) &&
                Objects.equals(rmfProcessDurValue, that.rmfProcessDurValue) &&
                Objects.equals(addDate, that.addDate) &&
                Objects.equals(chgUserName, that.chgUserName) &&
                Objects.equals(chgDate, that.chgDate) &&
                Objects.equals(chgTime, that.chgTime) &&
                Objects.equals(chgProgramName, that.chgProgramName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rmfCarrierId, rmfAccountId, rmfGroupId, rmfMemberIdLength, rmfFirstName, rmfFirstNameVal, rmfMiddleName, rmfMiddleNameVal, rmfPersonCode, rmfPersonCodeVal, rmfRelationship, rmfRelationshipVal, rmfType, rmfTypeVal, rmfSex, rmfSexVal, rmfDateOfBirth, rmfDateOfBirthVal, rmfMultiBirth, rmfMultiBirthVal, rmfDurKey, rmfDurKeyVal, rmfSocialSecurityNbr, rmfSocSecNbrVal, rmfAddress1, rmfAddress1Val, rmfAddress2, rmfAddress2Val, rmfAddress3, rmfAddress3Val, rmfPhone, rmfPhoneVal, rmfCity, rmfCityVal, rmfState, rmfStateVal, rmfZip2, rmfZip2Val, rmfZip1, rmfZip1Val, rmfZip3, rmfZip3Val, rmfCountry, rmfCountryVal, rmfFamilyFlag, rmfFamilyFlagVal, rmfFamilyType, rmfFamilyTypeVal, rmfFamilyId, rmfFamilyIdVal, rmfAltInsuranceFlag, rmfAltInsuranceCode, rmfAltInsuranceId, rmfMedicareType, rmfMedicareTypeVal, rmfMedicareFromDate, rmfMedicareFromDteVal, rmfMedicareHic, rmfMedicareHicVal, rmfOriginalFromDate, rmfOriginalFromDteVal, rmfBenefitResetDate, rmfBenefitResetDteVal, rmfCareNetwork, rmfCarePlanOverride, rmfCareplanOREffDate, rmfCareFacility, rmfCareQualifier, rmfPrimaryProvider, rmfPlanCode, rmfPlanEffDate, rmfCopayBrand, rmfCopayGeneric, rmfCopay3, rmfCopay4, rmfClientProductCode, rmfClientRiderCode, rmfExternalProgram, rmfEmailAddress, rmfProcessDurSts, rmfProcessDurValue, addDate, chgUserName, chgDate, chgTime, chgProgramName);
    }
}
