package com.optum.rxclaimnextgen.elg.pojo;

/**
 * Model class of group default screen.
 * 
 * @author Hemant Sharma
 */
public class EligGroupDefaultDetail {

	public EligGroupDefaultDetail() {
		super();
		this.addressGroup = new AddressGroup();
		this.thruDateDaysGroup = new ThruDateDaysGroup();
		this.planCodeDateGroup = new PlanCodeDateGroup();
	}

	private String carCarrierId;
	private String accountId;
	private String groupId;
	private String platformId;
	private String egdGroupNameInd;
	private String egdGroupName;
	private String egdAddressInd;
	private AddressGroup addressGroup;
	private String egdPhoneInd;
	private String egdPhone;
	private String egdContactInd;
	private String egdContact;
	private String egdRenewalDtInd;
	private DateType egdRenewalDate;
	private String egdSicCodeInd;
	private String egdSicCode;
	private String egdContractDateInd;
	private DateType egdContractDate;
	private String egdLanguageCodeInd;
	private String egdLanguageCode;
	private String egdSuppressPlanMsgInd;
	private String egdEffDateInd;
	private DateType egdEffectiveDate;
	private String egdThruDateInd;
	private ThruDateDaysGroup thruDateDaysGroup;
	private String egdBrandCopayInd;
	private String egdBrandCopay;
	private String egdGenericInd;
	private String egdGenericCopay;
	private String egdCopay3Ind;
	private String egdCopay3;
	private String egdCopay4Ind;
	private String egdCopay4;
	private String egdCopay5;
	private String egdCopay5Ind;
	private String egdCopay6;
	private String egdCopay6Ind;
	private String egdCopay7;
	private String egdCopay7Ind;
	private String egdCopay8;
	private String egdCopay8Ind;
	private String egdBenefitCdInd;
	private String egdBenefitCode1;
	private String egdPlanInd;
	private PlanCodeDateGroup planCodeDateGroup;
	private String egdPlanEligValidation;
	private String addUserName;
	private String addDate;
	private String addTime;
	private String addProgramName;
	private String chgUserName;
	private String chgDate;
	private String chgTime;
	private String chgProgramName;

	/**
	 * @return the carCarrierId
	 */
	public String getCarCarrierId() {
		return carCarrierId;
	}

	/**
	 * @param carCarrierId the carCarrierId to set
	 */
	public void setCarCarrierId(String carCarrierId) {
		this.carCarrierId = carCarrierId;
	}

	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the groupId
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	/**
	 * @return the platformId
	 */
	public String getPlatformId() {
		return platformId;
	}

	/**
	 * @param platformId the platformId to set
	 */
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	/**
	 * @return the egdGroupNameInd
	 */
	public String getEgdGroupNameInd() {
		return egdGroupNameInd;
	}

	/**
	 * @param egdGroupNameInd the egdGroupNameInd to set
	 */
	public void setEgdGroupNameInd(String egdGroupNameInd) {
		this.egdGroupNameInd = egdGroupNameInd;
	}

	/**
	 * @return the egdGroupName
	 */
	public String getEgdGroupName() {
		return egdGroupName;
	}

	/**
	 * @param egdGroupName the egdGroupName to set
	 */
	public void setEgdGroupName(String egdGroupName) {
		this.egdGroupName = egdGroupName;
	}

	/**
	 * @return the egdAddressInd
	 */
	public String getEgdAddressInd() {
		return egdAddressInd;
	}

	/**
	 * @param egdAddressInd the egdAddressInd to set
	 */
	public void setEgdAddressInd(String egdAddressInd) {
		this.egdAddressInd = egdAddressInd;
	}

	/**
	 * @return the addressGroup
	 */
	public AddressGroup getAddressGroup() {
		return addressGroup;
	}

	/**
	 * @param addressGroup the addressGroup to set
	 */
	public void setAddressGroup(AddressGroup addressGroup) {
		this.addressGroup = addressGroup;
	}

	/**
	 * @return the egdPhoneInd
	 */
	public String getEgdPhoneInd() {
		return egdPhoneInd;
	}

	/**
	 * @param egdPhoneInd the egdPhoneInd to set
	 */
	public void setEgdPhoneInd(String egdPhoneInd) {
		this.egdPhoneInd = egdPhoneInd;
	}

	/**
	 * @return the egdPhone
	 */
	public String getEgdPhone() {
		return egdPhone;
	}

	/**
	 * @param egdPhone the egdPhone to set
	 */
	public void setEgdPhone(String egdPhone) {
		this.egdPhone = egdPhone;
	}

	/**
	 * @return the egdContactInd
	 */
	public String getEgdContactInd() {
		return egdContactInd;
	}

	/**
	 * @param egdContactInd the egdContactInd to set
	 */
	public void setEgdContactInd(String egdContactInd) {
		this.egdContactInd = egdContactInd;
	}

	/**
	 * @return the egdContact
	 */
	public String getEgdContact() {
		return egdContact;
	}

	/**
	 * @param egdContact the egdContact to set
	 */
	public void setEgdContact(String egdContact) {
		this.egdContact = egdContact;
	}

	/**
	 * @return the egdRenewalDtInd
	 */
	public String getEgdRenewalDtInd() {
		return egdRenewalDtInd;
	}

	/**
	 * @param egdRenewalDtInd the egdRenewalDtInd to set
	 */
	public void setEgdRenewalDtInd(String egdRenewalDtInd) {
		this.egdRenewalDtInd = egdRenewalDtInd;
	}

	/**
	 * @return the egdRenewalDate
	 */
	public DateType getEgdRenewalDate() {
		return egdRenewalDate;
	}

	/**
	 * @param egdRenewalDate the egdRenewalDate to set
	 */
	public void setEgdRenewalDate(DateType egdRenewalDate) {
		this.egdRenewalDate = egdRenewalDate;
	}

	/**
	 * @return the egdSicCodeInd
	 */
	public String getEgdSicCodeInd() {
		return egdSicCodeInd;
	}

	/**
	 * @param egdSicCodeInd the egdSicCodeInd to set
	 */
	public void setEgdSicCodeInd(String egdSicCodeInd) {
		this.egdSicCodeInd = egdSicCodeInd;
	}

	/**
	 * @return the egdSicCode
	 */
	public String getEgdSicCode() {
		return egdSicCode;
	}

	/**
	 * @param egdSicCode the egdSicCode to set
	 */
	public void setEgdSicCode(String egdSicCode) {
		this.egdSicCode = egdSicCode;
	}

	/**
	 * @return the egdContractDateInd
	 */
	public String getEgdContractDateInd() {
		return egdContractDateInd;
	}

	/**
	 * @param egdContractDateInd the egdContractDateInd to set
	 */
	public void setEgdContractDateInd(String egdContractDateInd) {
		this.egdContractDateInd = egdContractDateInd;
	}

	/**
	 * @return the egdContractDate
	 */
	public DateType getEgdContractDate() {
		return egdContractDate;
	}

	/**
	 * @param egdContractDate the egdContractDate to set
	 */
	public void setEgdContractDate(DateType egdContractDate) {
		this.egdContractDate = egdContractDate;
	}

	/**
	 * @return the egdLanguageCodeInd
	 */
	public String getEgdLanguageCodeInd() {
		return egdLanguageCodeInd;
	}

	/**
	 * @param egdLanguageCodeInd the egdLanguageCodeInd to set
	 */
	public void setEgdLanguageCodeInd(String egdLanguageCodeInd) {
		this.egdLanguageCodeInd = egdLanguageCodeInd;
	}

	/**
	 * @return the egdLanguageCode
	 */
	public String getEgdLanguageCode() {
		return egdLanguageCode;
	}

	/**
	 * @param egdLanguageCode the egdLanguageCode to set
	 */
	public void setEgdLanguageCode(String egdLanguageCode) {
		this.egdLanguageCode = egdLanguageCode;
	}

	/**
	 * @return the egdSuppressPlanMsgInd
	 */
	public String getEgdSuppressPlanMsgInd() {
		return egdSuppressPlanMsgInd;
	}

	/**
	 * @param egdSuppressPlanMsgInd the egdSuppressPlanMsgInd to set
	 */
	public void setEgdSuppressPlanMsgInd(String egdSuppressPlanMsgInd) {
		this.egdSuppressPlanMsgInd = egdSuppressPlanMsgInd;
	}

	/**
	 * @return the egdEffDateInd
	 */
	public String getEgdEffDateInd() {
		return egdEffDateInd;
	}

	/**
	 * @param egdEffDateInd the egdEffDateInd to set
	 */
	public void setEgdEffDateInd(String egdEffDateInd) {
		this.egdEffDateInd = egdEffDateInd;
	}

	/**
	 * @return the egdEffectiveDate
	 */
	public DateType getEgdEffectiveDate() {
		return egdEffectiveDate;
	}

	/**
	 * @param egdEffectiveDate the egdEffectiveDate to set
	 */
	public void setEgdEffectiveDate(DateType egdEffectiveDate) {
		this.egdEffectiveDate = egdEffectiveDate;
	}

	/**
	 * @return the egdThruDateInd
	 */
	public String getEgdThruDateInd() {
		return egdThruDateInd;
	}

	/**
	 * @param egdThruDateInd the egdThruDateInd to set
	 */
	public void setEgdThruDateInd(String egdThruDateInd) {
		this.egdThruDateInd = egdThruDateInd;
	}

	/**
	 * @return the thruDateDaysGroup
	 */
	public ThruDateDaysGroup getThruDateDaysGroup() {
		return thruDateDaysGroup;
	}

	/**
	 * @param thruDateDaysGroup the thruDateDaysGroup to set
	 */
	public void setThruDateDaysGroup(ThruDateDaysGroup thruDateDaysGroup) {
		this.thruDateDaysGroup = thruDateDaysGroup;
	}

	/**
	 * @return the egdBrandCopayInd
	 */
	public String getEgdBrandCopayInd() {
		return egdBrandCopayInd;
	}

	/**
	 * @param egdBrandCopayInd the egdBrandCopayInd to set
	 */
	public void setEgdBrandCopayInd(String egdBrandCopayInd) {
		this.egdBrandCopayInd = egdBrandCopayInd;
	}

	/**
	 * @return the egdBrandCopay
	 */
	public String getEgdBrandCopay() {
		return egdBrandCopay;
	}

	/**
	 * @param egdBrandCopay the egdBrandCopay to set
	 */
	public void setEgdBrandCopay(String egdBrandCopay) {
		this.egdBrandCopay = egdBrandCopay;
	}

	/**
	 * @return the egdGenericInd
	 */
	public String getEgdGenericInd() {
		return egdGenericInd;
	}

	/**
	 * @param egdGenericInd the egdGenericInd to set
	 */
	public void setEgdGenericInd(String egdGenericInd) {
		this.egdGenericInd = egdGenericInd;
	}

	/**
	 * @return the egdGenericCopay
	 */
	public String getEgdGenericCopay() {
		return egdGenericCopay;
	}

	/**
	 * @param egdGenericCopay the egdGenericCopay to set
	 */
	public void setEgdGenericCopay(String egdGenericCopay) {
		this.egdGenericCopay = egdGenericCopay;
	}

	/**
	 * @return the egdCopay3Ind
	 */
	public String getEgdCopay3Ind() {
		return egdCopay3Ind;
	}

	/**
	 * @param egdCopay3Ind the egdCopay3Ind to set
	 */
	public void setEgdCopay3Ind(String egdCopay3Ind) {
		this.egdCopay3Ind = egdCopay3Ind;
	}

	/**
	 * @return the egdCopay3
	 */
	public String getEgdCopay3() {
		return egdCopay3;
	}

	/**
	 * @param egdCopay3 the egdCopay3 to set
	 */
	public void setEgdCopay3(String egdCopay3) {
		this.egdCopay3 = egdCopay3;
	}

	/**
	 * @return the egdCopay4Ind
	 */
	public String getEgdCopay4Ind() {
		return egdCopay4Ind;
	}

	/**
	 * @param egdCopay4Ind the egdCopay4Ind to set
	 */
	public void setEgdCopay4Ind(String egdCopay4Ind) {
		this.egdCopay4Ind = egdCopay4Ind;
	}

	/**
	 * @return the egdCopay4
	 */
	public String getEgdCopay4() {
		return egdCopay4;
	}

	/**
	 * @param egdCopay4 the egdCopay4 to set
	 */
	public void setEgdCopay4(String egdCopay4) {
		this.egdCopay4 = egdCopay4;
	}

	/**
	 * @return the egdCopay5
	 */
	public String getEgdCopay5() {
		return egdCopay5;
	}

	/**
	 * @param egdCopay5 the egdCopay5 to set
	 */
	public void setEgdCopay5(String egdCopay5) {
		this.egdCopay5 = egdCopay5;
	}

	/**
	 * @return the egdCopay5Ind
	 */
	public String getEgdCopay5Ind() {
		return egdCopay5Ind;
	}

	/**
	 * @param egdCopay5Ind the egdCopay5Ind to set
	 */
	public void setEgdCopay5Ind(String egdCopay5Ind) {
		this.egdCopay5Ind = egdCopay5Ind;
	}

	/**
	 * @return the egdCopay6
	 */
	public String getEgdCopay6() {
		return egdCopay6;
	}

	/**
	 * @param egdCopay6 the egdCopay6 to set
	 */
	public void setEgdCopay6(String egdCopay6) {
		this.egdCopay6 = egdCopay6;
	}

	/**
	 * @return the egdCopay6Ind
	 */
	public String getEgdCopay6Ind() {
		return egdCopay6Ind;
	}

	/**
	 * @param egdCopay6Ind the egdCopay6Ind to set
	 */
	public void setEgdCopay6Ind(String egdCopay6Ind) {
		this.egdCopay6Ind = egdCopay6Ind;
	}

	/**
	 * @return the egdCopay7
	 */
	public String getEgdCopay7() {
		return egdCopay7;
	}

	/**
	 * @param egdCopay7 the egdCopay7 to set
	 */
	public void setEgdCopay7(String egdCopay7) {
		this.egdCopay7 = egdCopay7;
	}

	/**
	 * @return the egdCopay7Ind
	 */
	public String getEgdCopay7Ind() {
		return egdCopay7Ind;
	}

	/**
	 * @param egdCopay7Ind the egdCopay7Ind to set
	 */
	public void setEgdCopay7Ind(String egdCopay7Ind) {
		this.egdCopay7Ind = egdCopay7Ind;
	}

	/**
	 * @return the egdCopay8
	 */
	public String getEgdCopay8() {
		return egdCopay8;
	}

	/**
	 * @param egdCopay8 the egdCopay8 to set
	 */
	public void setEgdCopay8(String egdCopay8) {
		this.egdCopay8 = egdCopay8;
	}

	/**
	 * @return the egdCopay8Ind
	 */
	public String getEgdCopay8Ind() {
		return egdCopay8Ind;
	}

	/**
	 * @param egdCopay8Ind the egdCopay8Ind to set
	 */
	public void setEgdCopay8Ind(String egdCopay8Ind) {
		this.egdCopay8Ind = egdCopay8Ind;
	}

	/**
	 * @return the egdBenefitCdInd
	 */
	public String getEgdBenefitCdInd() {
		return egdBenefitCdInd;
	}

	/**
	 * @param egdBenefitCdInd the egdBenefitCdInd to set
	 */
	public void setEgdBenefitCdInd(String egdBenefitCdInd) {
		this.egdBenefitCdInd = egdBenefitCdInd;
	}

	/**
	 * @return the egdBenefitCode1
	 */
	public String getEgdBenefitCode1() {
		return egdBenefitCode1;
	}

	/**
	 * @param egdBenefitCode1 the egdBenefitCode1 to set
	 */
	public void setEgdBenefitCode1(String egdBenefitCode1) {
		this.egdBenefitCode1 = egdBenefitCode1;
	}

	/**
	 * @return the egdPlanInd
	 */
	public String getEgdPlanInd() {
		return egdPlanInd;
	}

	/**
	 * @param egdPlanInd the egdPlanInd to set
	 */
	public void setEgdPlanInd(String egdPlanInd) {
		this.egdPlanInd = egdPlanInd;
	}

	/**
	 * @return the planCodeDateGroup
	 */
	public PlanCodeDateGroup getPlanCodeDateGroup() {
		return planCodeDateGroup;
	}

	/**
	 * @param planCodeDateGroup the planCodeDateGroup to set
	 */
	public void setPlanCodeDateGroup(PlanCodeDateGroup planCodeDateGroup) {
		this.planCodeDateGroup = planCodeDateGroup;
	}

	/**
	 * @return the egdPlanEligValidation
	 */
	public String getEgdPlanEligValidation() {
		return egdPlanEligValidation;
	}

	/**
	 * @param egdPlanEligValidation the egdPlanEligValidation to set
	 */
	public void setEgdPlanEligValidation(String egdPlanEligValidation) {
		this.egdPlanEligValidation = egdPlanEligValidation;
	}

	/**
	 * @return the addUserName
	 */
	public String getAddUserName() {
		return addUserName;
	}

	/**
	 * @param addUserName the addUserName to set
	 */
	public void setAddUserName(String addUserName) {
		this.addUserName = addUserName;
	}

	/**
	 * @return the addDate
	 */
	public String getAddDate() {
		return addDate;
	}

	/**
	 * @param addDate the addDate to set
	 */
	public void setAddDate(String addDate) {
		this.addDate = addDate;
	}

	/**
	 * @return the addTime
	 */
	public String getAddTime() {
		return addTime;
	}

	/**
	 * @param addTime the addTime to set
	 */
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

	/**
	 * @return the addProgramName
	 */
	public String getAddProgramName() {
		return addProgramName;
	}

	/**
	 * @param addProgramName the addProgramName to set
	 */
	public void setAddProgramName(String addProgramName) {
		this.addProgramName = addProgramName;
	}

	/**
	 * @return the chgUserName
	 */
	public String getChgUserName() {
		return chgUserName;
	}

	/**
	 * @param chgUserName the chgUserName to set
	 */
	public void setChgUserName(String chgUserName) {
		this.chgUserName = chgUserName;
	}

	/**
	 * @return the chgDate
	 */
	public String getChgDate() {
		return chgDate;
	}

	/**
	 * @param chgDate the chgDate to set
	 */
	public void setChgDate(String chgDate) {
		this.chgDate = chgDate;
	}

	/**
	 * @return the chgTime
	 */
	public String getChgTime() {
		return chgTime;
	}

	/**
	 * @param chgTime the chgTime to set
	 */
	public void setChgTime(String chgTime) {
		this.chgTime = chgTime;
	}

	/**
	 * @return the chgProgramName
	 */
	public String getChgProgramName() {
		return chgProgramName;
	}

	/**
	 * @param chgProgramName the chgProgramName to set
	 */
	public void setChgProgramName(String chgProgramName) {
		this.chgProgramName = chgProgramName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((carCarrierId == null) ? 0 : carCarrierId.hashCode());
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
		result = prime * result + ((platformId == null) ? 0 : platformId.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EligGroupDefaultDetail other = (EligGroupDefaultDetail) obj;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (carCarrierId == null) {
			if (other.carCarrierId != null)
				return false;
		} else if (!carCarrierId.equals(other.carCarrierId))
			return false;
		if (groupId == null) {
			if (other.groupId != null)
				return false;
		} else if (!groupId.equals(other.groupId))
			return false;
		if (platformId == null) {
			if (other.platformId != null)
				return false;
		} else if (!platformId.equals(other.platformId))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EligGroupDefaultDetail [carCarrierId=" + carCarrierId + ", accountId=" + accountId + ", groupId="
				+ groupId + ", platformId=" + platformId + ", egdGroupNameInd=" + egdGroupNameInd + ", egdGroupName="
				+ egdGroupName + ", egdAddressInd=" + egdAddressInd + ", addressGroup=" + addressGroup
				+ ", egdPhoneInd=" + egdPhoneInd + ", egdPhone=" + egdPhone + ", egdContactInd=" + egdContactInd
				+ ", egdContact=" + egdContact + ", egdRenewalDtInd=" + egdRenewalDtInd + ", egdRenewalDate="
				+ egdRenewalDate + ", egdSicCodeInd=" + egdSicCodeInd + ", egdSicCode=" + egdSicCode
				+ ", egdContractDateInd=" + egdContractDateInd + ", egdContractDate=" + egdContractDate
				+ ", egdLanguageCodeInd=" + egdLanguageCodeInd + ", egdLanguageCode=" + egdLanguageCode
				+ ", egdSuppressPlanMsgInd=" + egdSuppressPlanMsgInd + ", egdEffDateInd=" + egdEffDateInd
				+ ", egdEffectiveDate=" + egdEffectiveDate + ", egdThruDateInd=" + egdThruDateInd
				+ ", thruDateDaysGroup=" + thruDateDaysGroup + ", egdBrandCopayInd=" + egdBrandCopayInd
				+ ", egdBrandCopay=" + egdBrandCopay + ", egdGenericInd=" + egdGenericInd + ", egdGenericCopay="
				+ egdGenericCopay + ", egdCopay3Ind=" + egdCopay3Ind + ", egdCopay3=" + egdCopay3 + ", egdCopay4Ind="
				+ egdCopay4Ind + ", egdCopay4=" + egdCopay4 + ", egdCopay5=" + egdCopay5 + ", egdCopay5Ind="
				+ egdCopay5Ind + ", egdCopay6=" + egdCopay6 + ", egdCopay6Ind=" + egdCopay6Ind + ", egdCopay7="
				+ egdCopay7 + ", egdCopay7Ind=" + egdCopay7Ind + ", egdCopay8=" + egdCopay8 + ", egdCopay8Ind="
				+ egdCopay8Ind + ", egdBenefitCdInd=" + egdBenefitCdInd + ", egdBenefitCode1=" + egdBenefitCode1
				+ ", egdPlanInd=" + egdPlanInd + ", planCodeDateGroup=" + planCodeDateGroup + ", egdPlanEligValidation="
				+ egdPlanEligValidation + ", addUserName=" + addUserName + ", addDate=" + addDate + ", addTime="
				+ addTime + ", addProgramName=" + addProgramName + ", chgUserName=" + chgUserName + ", chgDate="
				+ chgDate + ", chgTime=" + chgTime + ", chgProgramName=" + chgProgramName + "]";
	}

}
