package com.optum.rxclaimnextgen.elg.pojo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;

public class EligMemberDefaultDetailsForm {
	
    private String carCarrierId;
    private String accountId;
    private String groupId;
    private String platformId;
    private String emdMemberEligibilityTp;
    private String emdCreateFamilyInd;
    private String emdCreateSpouseInd;
    private String emdCreateDependentsInd;
    private String emdNumberOfDependents;
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
    private String emdSocSecNbr;
    private String emdBuildSocSecNbr;
    private String emdSexInd;
    private String emdSex;
    private String emdDurKeyInd;
    private String emdDurKey;
    private String emdDateOfBirthInd;
    private DateType emdDateOfBirth;
    private String emdRenewalDateInd;
    private DateType emdRenewalDate;
    private String emdEffectiveDateInd;
    private DateType emdEffectiveDate;
    private String emdThruDateInd;
    private DateType emdThruDate;
    private String emdThruDays;
    private String emdMedicareHicInd;
    private String emdMedicareHic;
    private String emdMedicareEffDateInd;
    private DateType emdMedicareEffDate;
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
    private String emdBrandCopay;
    private String emdGenericCopayInd;
    private String emdGenericCopay;
    private String emdCopay3Ind;
    private String emdCopay3;
    private String emdCopay4Ind;
    private String emdCopay4;
    private String emdPlanInd;
    private String planCode;
    private DateType planEffDate;
    private String emdLanguageCodeInd;    
    private TypeAheadType emdLanguageCode;    
    private String emdDurFlagInd;
    private String emdDurFlag;
    private String emdMultBirthCodeInd;
    private String emdMultipleBirthCode;
    private String emdBaseMemberIdLength;
    private String emdOrigEffDateInd;
    private DateType emdOrigEffectiveDate;
	private String emdMemberTypeInd;
    private String emdMemberType;
    private String emdNetworkInd;
    private String cnwNetworkId;
    private String emdQualifierInd;
    private String cquQualifierId;
    private String emdCareEffDateInd;
    private DateType emdCareEffDate;
    private String emdCareThruDateInd;
    private DateType emdCareThruDate;
    private String emdClientProdCodeInd;
    private String emdClientProductCode;
    private String emdClientRiderCodeInd;
    private String emdClientRiderCode;
    private String emdMcfOvrPlanInd;
    private String emdMcfOvrPlanCode;
    private DateType emdMcfOvrPlanEffDate;
    private String emdMaiEffDateInd;
    private DateType emdMaiEffDate;
    private String emdMaiThruDateInd;
    private DateType emdMaiThruDate;
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
    private String addDate;
    private String addTime;
    private String addProgramName;
    private String chgUserName;
    private String chgDate;
    private String chgTime;
    private String chgProgramName;
    private String message;
	public String getCarCarrierId() {
		return carCarrierId;
	}
	public void setCarCarrierId(String carCarrierId) {
		this.carCarrierId = carCarrierId;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getPlatformId() {
		return platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}
	public String getEmdMemberEligibilityTp() {
		return emdMemberEligibilityTp;
	}
	public void setEmdMemberEligibilityTp(String emdMemberEligibilityTp) {
		this.emdMemberEligibilityTp = emdMemberEligibilityTp;
	}
	public String getEmdCreateFamilyInd() {
		return emdCreateFamilyInd;
	}
	public void setEmdCreateFamilyInd(String emdCreateFamilyInd) {
		this.emdCreateFamilyInd = emdCreateFamilyInd;
	}
	public String getEmdCreateSpouseInd() {
		return emdCreateSpouseInd;
	}
	public void setEmdCreateSpouseInd(String emdCreateSpouseInd) {
		this.emdCreateSpouseInd = emdCreateSpouseInd;
	}
	public String getEmdCreateDependentsInd() {
		return emdCreateDependentsInd;
	}
	public void setEmdCreateDependentsInd(String emdCreateDependentsInd) {
		this.emdCreateDependentsInd = emdCreateDependentsInd;
	}
	public String getEmdNumberOfDependents() {
		return emdNumberOfDependents;
	}
	public void setEmdNumberOfDependents(String emdNumberOfDependents) {
		this.emdNumberOfDependents = emdNumberOfDependents;
	}
	public String getEmdNameInd() {
		return emdNameInd;
	}
	public void setEmdNameInd(String emdNameInd) {
		this.emdNameInd = emdNameInd;
	}
	public String getEmdLastName() {
		return emdLastName;
	}
	public void setEmdLastName(String emdLastName) {
		this.emdLastName = emdLastName;
	}
	public String getEmdFirstName() {
		return emdFirstName;
	}
	public void setEmdFirstName(String emdFirstName) {
		this.emdFirstName = emdFirstName;
	}
	public String getEmdMiddleInitial() {
		return emdMiddleInitial;
	}
	public void setEmdMiddleInitial(String emdMiddleInitial) {
		this.emdMiddleInitial = emdMiddleInitial;
	}
	public String getEmdAddressInd() {
		return emdAddressInd;
	}
	public void setEmdAddressInd(String emdAddressInd) {
		this.emdAddressInd = emdAddressInd;
	}
	public String getEmdCountryInd() {
		return emdCountryInd;
	}
	public void setEmdCountryInd(String emdCountryInd) {
		this.emdCountryInd = emdCountryInd;
	}
	public String getEmdCountryCode() {
		return emdCountryCode;
	}
	public void setEmdCountryCode(String emdCountryCode) {
		this.emdCountryCode = emdCountryCode;
	}
	public String getEmdEmailInd() {
		return emdEmailInd;
	}
	public void setEmdEmailInd(String emdEmailInd) {
		this.emdEmailInd = emdEmailInd;
	}
	public String getEmdPhoneNumberInd() {
		return emdPhoneNumberInd;
	}
	public void setEmdPhoneNumberInd(String emdPhoneNumberInd) {
		this.emdPhoneNumberInd = emdPhoneNumberInd;
	}
	public String getEmdSocSecNbrInd() {
		return emdSocSecNbrInd;
	}
	public void setEmdSocSecNbrInd(String emdSocSecNbrInd) {
		this.emdSocSecNbrInd = emdSocSecNbrInd;
	}
	public String getEmdSocSecNbr() {
		return emdSocSecNbr;
	}
	public void setEmdSocSecNbr(String emdSocSecNbr) {
		this.emdSocSecNbr = emdSocSecNbr;
	}
	public String getEmdBuildSocSecNbr() {
		return emdBuildSocSecNbr;
	}
	public void setEmdBuildSocSecNbr(String emdBuildSocSecNbr) {
		this.emdBuildSocSecNbr = emdBuildSocSecNbr;
	}
	public String getEmdSexInd() {
		return emdSexInd;
	}
	public void setEmdSexInd(String emdSexInd) {
		this.emdSexInd = emdSexInd;
	}
	public String getEmdSex() {
		return emdSex;
	}
	public void setEmdSex(String emdSex) {
		this.emdSex = emdSex;
	}
	public String getEmdDurKeyInd() {
		return emdDurKeyInd;
	}
	public void setEmdDurKeyInd(String emdDurKeyInd) {
		this.emdDurKeyInd = emdDurKeyInd;
	}
	public String getEmdDurKey() {
		return emdDurKey;
	}
	public void setEmdDurKey(String emdDurKey) {
		this.emdDurKey = emdDurKey;
	}
	public String getEmdDateOfBirthInd() {
		return emdDateOfBirthInd;
	}
	public void setEmdDateOfBirthInd(String emdDateOfBirthInd) {
		this.emdDateOfBirthInd = emdDateOfBirthInd;
	}
	public DateType getEmdDateOfBirth() {
		return emdDateOfBirth;
	}
	public void setEmdDateOfBirth(DateType emdDateOfBirth) {
		this.emdDateOfBirth = emdDateOfBirth;
	}
	public String getEmdRenewalDateInd() {
		return emdRenewalDateInd;
	}
	public void setEmdRenewalDateInd(String emdRenewalDateInd) {
		this.emdRenewalDateInd = emdRenewalDateInd;
	}
	public DateType getEmdRenewalDate() {
		return emdRenewalDate;
	}
	public void setEmdRenewalDate(DateType emdRenewalDate) {
		this.emdRenewalDate = emdRenewalDate;
	}
	public String getEmdEffectiveDateInd() {
		return emdEffectiveDateInd;
	}
	public void setEmdEffectiveDateInd(String emdEffectiveDateInd) {
		this.emdEffectiveDateInd = emdEffectiveDateInd;
	}
	public DateType getEmdEffectiveDate() {
		return emdEffectiveDate;
	}
	public void setEmdEffectiveDate(DateType emdEffectiveDate) {
		this.emdEffectiveDate = emdEffectiveDate;
	}
	public String getEmdThruDateInd() {
		return emdThruDateInd;
	}
	public void setEmdThruDateInd(String emdThruDateInd) {
		this.emdThruDateInd = emdThruDateInd;
	}
	public DateType getEmdThruDate() {
		return emdThruDate;
	}
	public void setEmdThruDate(DateType emdThruDate) {
		this.emdThruDate = emdThruDate;
	}
	public String getEmdThruDays() {
		return emdThruDays;
	}
	public void setEmdThruDays(String emdThruDays) {
		this.emdThruDays = emdThruDays;
	}
	public String getEmdMedicareHicInd() {
		return emdMedicareHicInd;
	}
	public void setEmdMedicareHicInd(String emdMedicareHicInd) {
		this.emdMedicareHicInd = emdMedicareHicInd;
	}
	public String getEmdMedicareHic() {
		return emdMedicareHic;
	}
	public void setEmdMedicareHic(String emdMedicareHic) {
		this.emdMedicareHic = emdMedicareHic;
	}
	public String getEmdMedicareEffDateInd() {
		return emdMedicareEffDateInd;
	}
	public void setEmdMedicareEffDateInd(String emdMedicareEffDateInd) {
		this.emdMedicareEffDateInd = emdMedicareEffDateInd;
	}
	public DateType getEmdMedicareEffDate() {
		return emdMedicareEffDate;
	}
	public void setEmdMedicareEffDate(DateType emdMedicareEffDate) {
		this.emdMedicareEffDate = emdMedicareEffDate;
	}
	public String getEmdMedicareCvgTypeInd() {
		return emdMedicareCvgTypeInd;
	}
	public void setEmdMedicareCvgTypeInd(String emdMedicareCvgTypeInd) {
		this.emdMedicareCvgTypeInd = emdMedicareCvgTypeInd;
	}
	public String getEmdMedicareCvgType() {
		return emdMedicareCvgType;
	}
	public void setEmdMedicareCvgType(String emdMedicareCvgType) {
		this.emdMedicareCvgType = emdMedicareCvgType;
	}
	public String getEmdPhysicianIdInd() {
		return emdPhysicianIdInd;
	}
	public void setEmdPhysicianIdInd(String emdPhysicianIdInd) {
		this.emdPhysicianIdInd = emdPhysicianIdInd;
	}
	public String getPrfPrescriberId() {
		return prfPrescriberId;
	}
	public void setPrfPrescriberId(String prfPrescriberId) {
		this.prfPrescriberId = prfPrescriberId;
	}
	public String getPrqPrscrbrIdQualifier() {
		return prqPrscrbrIdQualifier;
	}
	public void setPrqPrscrbrIdQualifier(String prqPrscrbrIdQualifier) {
		this.prqPrscrbrIdQualifier = prqPrscrbrIdQualifier;
	}
	public String getPrfPrescriberIdState() {
		return prfPrescriberIdState;
	}
	public void setPrfPrescriberIdState(String prfPrescriberIdState) {
		this.prfPrescriberIdState = prfPrescriberIdState;
	}
	public String getEmdCareFacilityInd() {
		return emdCareFacilityInd;
	}
	public void setEmdCareFacilityInd(String emdCareFacilityInd) {
		this.emdCareFacilityInd = emdCareFacilityInd;
	}
	public String getCfaCareFacilityId() {
		return cfaCareFacilityId;
	}
	public void setCfaCareFacilityId(String cfaCareFacilityId) {
		this.cfaCareFacilityId = cfaCareFacilityId;
	}
	public String getEmdPersonCodeInd() {
		return emdPersonCodeInd;
	}
	public void setEmdPersonCodeInd(String emdPersonCodeInd) {
		this.emdPersonCodeInd = emdPersonCodeInd;
	}
	public String getEmdPersonCode() {
		return emdPersonCode;
	}
	public void setEmdPersonCode(String emdPersonCode) {
		this.emdPersonCode = emdPersonCode;
	}
	public String getEmdFamilyTypeInd() {
		return emdFamilyTypeInd;
	}
	public void setEmdFamilyTypeInd(String emdFamilyTypeInd) {
		this.emdFamilyTypeInd = emdFamilyTypeInd;
	}
	public String getEmdFamilyType() {
		return emdFamilyType;
	}
	public void setEmdFamilyType(String emdFamilyType) {
		this.emdFamilyType = emdFamilyType;
	}
	public String getEmdFamilyIndicatorInd() {
		return emdFamilyIndicatorInd;
	}
	public void setEmdFamilyIndicatorInd(String emdFamilyIndicatorInd) {
		this.emdFamilyIndicatorInd = emdFamilyIndicatorInd;
	}
	public String getEmdFamilyIndicator() {
		return emdFamilyIndicator;
	}
	public void setEmdFamilyIndicator(String emdFamilyIndicator) {
		this.emdFamilyIndicator = emdFamilyIndicator;
	}
	public String getEmdFamilyIdInd() {
		return emdFamilyIdInd;
	}
	public void setEmdFamilyIdInd(String emdFamilyIdInd) {
		this.emdFamilyIdInd = emdFamilyIdInd;
	}
	public String getEmdFamilyId() {
		return emdFamilyId;
	}
	public void setEmdFamilyId(String emdFamilyId) {
		this.emdFamilyId = emdFamilyId;
	}
	public String getEmdRelationshipCodeInd() {
		return emdRelationshipCodeInd;
	}
	public void setEmdRelationshipCodeInd(String emdRelationshipCodeInd) {
		this.emdRelationshipCodeInd = emdRelationshipCodeInd;
	}
	public String getEmdRelationshipCode() {
		return emdRelationshipCode;
	}
	public void setEmdRelationshipCode(String emdRelationshipCode) {
		this.emdRelationshipCode = emdRelationshipCode;
	}
	public String getEmdAlternateInsInd() {
		return emdAlternateInsInd;
	}
	public void setEmdAlternateInsInd(String emdAlternateInsInd) {
		this.emdAlternateInsInd = emdAlternateInsInd;
	}
	public String getEmdAlternateIns() {
		return emdAlternateIns;
	}
	public void setEmdAlternateIns(String emdAlternateIns) {
		this.emdAlternateIns = emdAlternateIns;
	}
	public String getEmdAltInsCodeInd() {
		return emdAltInsCodeInd;
	}
	public void setEmdAltInsCodeInd(String emdAltInsCodeInd) {
		this.emdAltInsCodeInd = emdAltInsCodeInd;
	}
	public String getEmdAltInsCode() {
		return emdAltInsCode;
	}
	public void setEmdAltInsCode(String emdAltInsCode) {
		this.emdAltInsCode = emdAltInsCode;
	}
	public String getEmdAltInsuranceIdInd() {
		return emdAltInsuranceIdInd;
	}
	public void setEmdAltInsuranceIdInd(String emdAltInsuranceIdInd) {
		this.emdAltInsuranceIdInd = emdAltInsuranceIdInd;
	}
	public String getEmdAltInsuranceId() {
		return emdAltInsuranceId;
	}
	public void setEmdAltInsuranceId(String emdAltInsuranceId) {
		this.emdAltInsuranceId = emdAltInsuranceId;
	}
	public String getEmdBrandCopayInd() {
		return emdBrandCopayInd;
	}
	public void setEmdBrandCopayInd(String emdBrandCopayInd) {
		this.emdBrandCopayInd = emdBrandCopayInd;
	}
	public String getEmdBrandCopay() {
		return emdBrandCopay;
	}
	public void setEmdBrandCopay(String emdBrandCopay) {
		this.emdBrandCopay = emdBrandCopay;
	}
	public String getEmdGenericCopayInd() {
		return emdGenericCopayInd;
	}
	public void setEmdGenericCopayInd(String emdGenericCopayInd) {
		this.emdGenericCopayInd = emdGenericCopayInd;
	}
	public String getEmdGenericCopay() {
		return emdGenericCopay;
	}
	public void setEmdGenericCopay(String emdGenericCopay) {
		this.emdGenericCopay = emdGenericCopay;
	}
	public String getEmdCopay3Ind() {
		return emdCopay3Ind;
	}
	public void setEmdCopay3Ind(String emdCopay3Ind) {
		this.emdCopay3Ind = emdCopay3Ind;
	}
	public String getEmdCopay3() {
		return emdCopay3;
	}
	public void setEmdCopay3(String emdCopay3) {
		this.emdCopay3 = emdCopay3;
	}
	public String getEmdCopay4Ind() {
		return emdCopay4Ind;
	}
	public void setEmdCopay4Ind(String emdCopay4Ind) {
		this.emdCopay4Ind = emdCopay4Ind;
	}
	public String getEmdCopay4() {
		return emdCopay4;
	}
	public void setEmdCopay4(String emdCopay4) {
		this.emdCopay4 = emdCopay4;
	}
	public String getEmdPlanInd() {
		return emdPlanInd;
	}
	public void setEmdPlanInd(String emdPlanInd) {
		this.emdPlanInd = emdPlanInd;
	}
	public String getPlanCode() {
		return planCode;
	}
	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}
	public DateType getPlanEffDate() {
		return planEffDate;
	}
	public void setPlanEffDate(DateType planEffDate) {
		this.planEffDate = planEffDate;
	}
	public String getEmdLanguageCodeInd() {
		return emdLanguageCodeInd;
	}
	public void setEmdLanguageCodeInd(String emdLanguageCodeInd) {
		this.emdLanguageCodeInd = emdLanguageCodeInd;
	}
    public TypeAheadType getEmdLanguageCode() {
		return emdLanguageCode;
	}
	public void setEmdLanguageCode(TypeAheadType emdLanguageCode) {
		this.emdLanguageCode = emdLanguageCode;
	}	
	public String getEmdDurFlagInd() {
		return emdDurFlagInd;
	}
	public void setEmdDurFlagInd(String emdDurFlagInd) {
		this.emdDurFlagInd = emdDurFlagInd;
	}
	public String getEmdDurFlag() {
		return emdDurFlag;
	}
	public void setEmdDurFlag(String emdDurFlag) {
		this.emdDurFlag = emdDurFlag;
	}
	public String getEmdMultBirthCodeInd() {
		return emdMultBirthCodeInd;
	}
	public void setEmdMultBirthCodeInd(String emdMultBirthCodeInd) {
		this.emdMultBirthCodeInd = emdMultBirthCodeInd;
	}
	public String getEmdMultipleBirthCode() {
		return emdMultipleBirthCode;
	}
	public void setEmdMultipleBirthCode(String emdMultipleBirthCode) {
		this.emdMultipleBirthCode = emdMultipleBirthCode;
	}
	public String getEmdBaseMemberIdLength() {
		return emdBaseMemberIdLength;
	}
	public void setEmdBaseMemberIdLength(String emdBaseMemberIdLength) {
		this.emdBaseMemberIdLength = emdBaseMemberIdLength;
	}
	public String getEmdOrigEffDateInd() {
		return emdOrigEffDateInd;
	}
	public void setEmdOrigEffDateInd(String emdOrigEffDateInd) {
		this.emdOrigEffDateInd = emdOrigEffDateInd;
	}
	public DateType getEmdOrigEffectiveDate() {
		return emdOrigEffectiveDate;
	}
	public void setEmdOrigEffectiveDate(DateType emdOrigEffectiveDate) {
		this.emdOrigEffectiveDate = emdOrigEffectiveDate;
	}
	public String getEmdMemberTypeInd() {
		return emdMemberTypeInd;
	}
	public void setEmdMemberTypeInd(String emdMemberTypeInd) {
		this.emdMemberTypeInd = emdMemberTypeInd;
	}
	public String getEmdMemberType() {
		return emdMemberType;
	}
	public void setEmdMemberType(String emdMemberType) {
		this.emdMemberType = emdMemberType;
	}
	public String getEmdNetworkInd() {
		return emdNetworkInd;
	}
	public void setEmdNetworkInd(String emdNetworkInd) {
		this.emdNetworkInd = emdNetworkInd;
	}
	public String getCnwNetworkId() {
		return cnwNetworkId;
	}
	public void setCnwNetworkId(String cnwNetworkId) {
		this.cnwNetworkId = cnwNetworkId;
	}
	public String getEmdQualifierInd() {
		return emdQualifierInd;
	}
	public void setEmdQualifierInd(String emdQualifierInd) {
		this.emdQualifierInd = emdQualifierInd;
	}
	public String getCquQualifierId() {
		return cquQualifierId;
	}
	public void setCquQualifierId(String cquQualifierId) {
		this.cquQualifierId = cquQualifierId;
	}
	public String getEmdCareEffDateInd() {
		return emdCareEffDateInd;
	}
	public void setEmdCareEffDateInd(String emdCareEffDateInd) {
		this.emdCareEffDateInd = emdCareEffDateInd;
	}
	public DateType getEmdCareEffDate() {
		return emdCareEffDate;
	}
	public void setEmdCareEffDate(DateType emdCareEffDate) {
		this.emdCareEffDate = emdCareEffDate;
	}
	public String getEmdCareThruDateInd() {
		return emdCareThruDateInd;
	}
	public void setEmdCareThruDateInd(String emdCareThruDateInd) {
		this.emdCareThruDateInd = emdCareThruDateInd;
	}
	public DateType getEmdCareThruDate() {
		return emdCareThruDate;
	}
	public void setEmdCareThruDate(DateType emdCareThruDate) {
		this.emdCareThruDate = emdCareThruDate;
	}
	public String getEmdClientProdCodeInd() {
		return emdClientProdCodeInd;
	}
	public void setEmdClientProdCodeInd(String emdClientProdCodeInd) {
		this.emdClientProdCodeInd = emdClientProdCodeInd;
	}
	public String getEmdClientProductCode() {
		return emdClientProductCode;
	}
	public void setEmdClientProductCode(String emdClientProductCode) {
		this.emdClientProductCode = emdClientProductCode;
	}
	public String getEmdClientRiderCodeInd() {
		return emdClientRiderCodeInd;
	}
	public void setEmdClientRiderCodeInd(String emdClientRiderCodeInd) {
		this.emdClientRiderCodeInd = emdClientRiderCodeInd;
	}
	public String getEmdClientRiderCode() {
		return emdClientRiderCode;
	}
	public void setEmdClientRiderCode(String emdClientRiderCode) {
		this.emdClientRiderCode = emdClientRiderCode;
	}
	public String getEmdMcfOvrPlanInd() {
		return emdMcfOvrPlanInd;
	}
	public void setEmdMcfOvrPlanInd(String emdMcfOvrPlanInd) {
		this.emdMcfOvrPlanInd = emdMcfOvrPlanInd;
	}
	public String getEmdMcfOvrPlanCode() {
		return emdMcfOvrPlanCode;
	}
	public void setEmdMcfOvrPlanCode(String emdMcfOvrPlanCode) {
		this.emdMcfOvrPlanCode = emdMcfOvrPlanCode;
	}
	public DateType getEmdMcfOvrPlanEffDate() {
		return emdMcfOvrPlanEffDate;
	}
	public void setEmdMcfOvrPlanEffDate(DateType emdMcfOvrPlanEffDate) {
		this.emdMcfOvrPlanEffDate = emdMcfOvrPlanEffDate;
	}
	public String getEmdMaiEffDateInd() {
		return emdMaiEffDateInd;
	}
	public void setEmdMaiEffDateInd(String emdMaiEffDateInd) {
		this.emdMaiEffDateInd = emdMaiEffDateInd;
	}
	public DateType getEmdMaiEffDate() {
		return emdMaiEffDate;
	}
	public void setEmdMaiEffDate(DateType emdMaiEffDate) {
		this.emdMaiEffDate = emdMaiEffDate;
	}
	public String getEmdMaiThruDateInd() {
		return emdMaiThruDateInd;
	}
	public void setEmdMaiThruDateInd(String emdMaiThruDateInd) {
		this.emdMaiThruDateInd = emdMaiThruDateInd;
	}
	public DateType getEmdMaiThruDate() {
		return emdMaiThruDate;
	}
	public void setEmdMaiThruDate(DateType emdMaiThruDate) {
		this.emdMaiThruDate = emdMaiThruDate;
	}
	public String getEmdAutoTermMatchSex() {
		return emdAutoTermMatchSex;
	}
	public void setEmdAutoTermMatchSex(String emdAutoTermMatchSex) {
		this.emdAutoTermMatchSex = emdAutoTermMatchSex;
	}
	public String getEmdAutoTermMatchDob() {
		return emdAutoTermMatchDob;
	}
	public void setEmdAutoTermMatchDob(String emdAutoTermMatchDob) {
		this.emdAutoTermMatchDob = emdAutoTermMatchDob;
	}
	public String getEmdInactvFutureCovInd() {
		return emdInactvFutureCovInd;
	}
	public void setEmdInactvFutureCovInd(String emdInactvFutureCovInd) {
		this.emdInactvFutureCovInd = emdInactvFutureCovInd;
	}
	public String getEmdPlanEligValidation() {
		return emdPlanEligValidation;
	}
	public void setEmdPlanEligValidation(String emdPlanEligValidation) {
		this.emdPlanEligValidation = emdPlanEligValidation;
	}
	public String getEmdSsnOnErrorFile() {
		return emdSsnOnErrorFile;
	}
	public void setEmdSsnOnErrorFile(String emdSsnOnErrorFile) {
		this.emdSsnOnErrorFile = emdSsnOnErrorFile;
	}
	public String getEmdMaiLock() {
		return emdMaiLock;
	}
	public void setEmdMaiLock(String emdMaiLock) {
		this.emdMaiLock = emdMaiLock;
	}
	public String getEmdMemberIdFormatChec() {
		return emdMemberIdFormatChec;
	}
	public void setEmdMemberIdFormatChec(String emdMemberIdFormatChec) {
		this.emdMemberIdFormatChec = emdMemberIdFormatChec;
	}
	public String getEmdDataFldsInd() {
		return emdDataFldsInd;
	}
	public void setEmdDataFldsInd(String emdDataFldsInd) {
		this.emdDataFldsInd = emdDataFldsInd;
	}
	public String getEmdDataFldsEffDteInd() {
		return emdDataFldsEffDteInd;
	}
	public void setEmdDataFldsEffDteInd(String emdDataFldsEffDteInd) {
		this.emdDataFldsEffDteInd = emdDataFldsEffDteInd;
	}
	public String getEmdDataFldsThrDteInd() {
		return emdDataFldsThrDteInd;
	}
	public void setEmdDataFldsThrDteInd(String emdDataFldsThrDteInd) {
		this.emdDataFldsThrDteInd = emdDataFldsThrDteInd;
	}
	public String getAddUserName() {
		return addUserName;
	}
	public void setAddUserName(String addUserName) {
		this.addUserName = addUserName;
	}
	public String getAddDate() {
		return addDate;
	}
	public void setAddDate(String addDate) {
		this.addDate = addDate;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	public String getAddProgramName() {
		return addProgramName;
	}
	public void setAddProgramName(String addProgramName) {
		this.addProgramName = addProgramName;
	}
	public String getChgUserName() {
		return chgUserName;
	}
	public void setChgUserName(String chgUserName) {
		this.chgUserName = chgUserName;
	}
	public String getChgDate() {
		return chgDate;
	}
	public void setChgDate(String chgDate) {
		this.chgDate = chgDate;
	}
	public String getChgTime() {
		return chgTime;
	}
	public void setChgTime(String chgTime) {
		this.chgTime = chgTime;
	}
	public String getChgProgramName() {
		return chgProgramName;
	}
	public void setChgProgramName(String chgProgramName) {
		this.chgProgramName = chgProgramName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
 }