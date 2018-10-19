package com.optum.rxclaimnextgen.elg.pojo;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Hemant Sharma
 *
 */
public class EligErrorToleranceControl {
	private String carCarrierId;
	private String accountId;
	private String groupId;
	private String platformId;
	private String eccAlwaysSuspAftrStaging;
	private String eccPrimaryEligAnalyst;
	private String eccSecondryEligAnalyst;
	private String eccEmailDistributionLst;
	private String eccSuspFileCndChkDlyMin;
	private String eccEnableToleranceChk;
	private String eccMinNbrInpRcdTrgTolChk;
	private String eccLengthOfMemberId;
	private String eccPerformRetroTrmChk;
	private String eccPercentForRetroTrmChk;
	private String eccPerfrmExplctTrmChk;
	private String eccPercntForExplctTrmChk;
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
	 * @return the eccEnableToleranceChk
	 */
	public String getEccEnableToleranceChk() {
		return eccEnableToleranceChk;
	}

	/**
	 * @param eccEnableToleranceChk the eccEnableToleranceChk to set
	 */
	public void setEccEnableToleranceChk(String eccEnableToleranceChk) {
		this.eccEnableToleranceChk = StringUtils.trim(eccEnableToleranceChk);
	}

	/**
	 * @return the eccAlwaysSuspAftrStaging
	 */
	public String getEccAlwaysSuspAftrStaging() {
		return eccAlwaysSuspAftrStaging;
	}

	/**
	 * @param eccAlwaysSuspAftrStaging the eccAlwaysSuspAftrStaging to set
	 */
	public void setEccAlwaysSuspAftrStaging(String eccAlwaysSuspAftrStaging) {
		this.eccAlwaysSuspAftrStaging = StringUtils.trim(eccAlwaysSuspAftrStaging);
	}

	/**
	 * @return the eccLengthOfMemberId
	 */
	public String getEccLengthOfMemberId() {
		return eccLengthOfMemberId;
	}

	/**
	 * @param eccLengthOfMemberId the eccLengthOfMemberId to set
	 */
	public void setEccLengthOfMemberId(String eccLengthOfMemberId) {
		this.eccLengthOfMemberId = StringUtils.trim(eccLengthOfMemberId);
	}

	/**
	 * @return the eccEmailDistributionLst
	 */
	public String getEccEmailDistributionLst() {
		return eccEmailDistributionLst;
	}

	/**
	 * @param eccEmailDistributionLst the eccEmailDistributionLst to set
	 */
	public void setEccEmailDistributionLst(String eccEmailDistributionLst) {
		this.eccEmailDistributionLst = StringUtils.trim(eccEmailDistributionLst);
	}

	/**
	 * @return the eccPerfrmExplctTrmChk
	 */
	public String getEccPerfrmExplctTrmChk() {
		return eccPerfrmExplctTrmChk;
	}

	/**
	 * @param eccPerfrmExplctTrmChk the eccPerfrmExplctTrmChk to set
	 */
	public void setEccPerfrmExplctTrmChk(String eccPerfrmExplctTrmChk) {
		this.eccPerfrmExplctTrmChk = StringUtils.trim(eccPerfrmExplctTrmChk);
	}

	/**
	 * @return the eccPercntForExplctTrmChk
	 */
	public String getEccPercntForExplctTrmChk() {
		return eccPercntForExplctTrmChk;
	}

	/**
	 * @param eccPercntForExplctTrmChk the eccPercntForExplctTrmChk to set
	 */
	public void setEccPercntForExplctTrmChk(String eccPercntForExplctTrmChk) {
		this.eccPercntForExplctTrmChk = StringUtils.trim(eccPercntForExplctTrmChk);
	}

	/**
	 * @return the eccPerformRetroTrmChk
	 */
	public String getEccPerformRetroTrmChk() {
		return eccPerformRetroTrmChk;
	}

	/**
	 * @param eccPerformRetroTrmChk the eccPerformRetroTrmChk to set
	 */
	public void setEccPerformRetroTrmChk(String eccPerformRetroTrmChk) {
		this.eccPerformRetroTrmChk = StringUtils.trim(eccPerformRetroTrmChk);
	}

	/**
	 * @return the eccPercentForRetroTrmChk
	 */
	public String getEccPercentForRetroTrmChk() {
		return eccPercentForRetroTrmChk;
	}

	/**
	 * @param eccPercentForRetroTrmChk the eccPercentForRetroTrmChk to set
	 */
	public void setEccPercentForRetroTrmChk(String eccPercentForRetroTrmChk) {
		this.eccPercentForRetroTrmChk = StringUtils.trim(eccPercentForRetroTrmChk);
	}

	/**
	 * @return the eccMinNbrInpRcdTrgTolChk
	 */
	public String getEccMinNbrInpRcdTrgTolChk() {
		return eccMinNbrInpRcdTrgTolChk;
	}

	/**
	 * @param eccMinNbrInpRcdTrgTolChk the eccMinNbrInpRcdTrgTolChk to set
	 */
	public void setEccMinNbrInpRcdTrgTolChk(String eccMinNbrInpRcdTrgTolChk) {
		this.eccMinNbrInpRcdTrgTolChk = StringUtils.trim(eccMinNbrInpRcdTrgTolChk);
	}

	/**
	 * @return the eccPrimaryEligAnalyst
	 */
	public String getEccPrimaryEligAnalyst() {
		return eccPrimaryEligAnalyst;
	}

	/**
	 * @param eccPrimaryEligAnalyst the eccPrimaryEligAnalyst to set
	 */
	public void setEccPrimaryEligAnalyst(String eccPrimaryEligAnalyst) {
		this.eccPrimaryEligAnalyst = StringUtils.trim(eccPrimaryEligAnalyst);
	}

	/**
	 * @return the eccSecondryEligAnalyst
	 */
	public String getEccSecondryEligAnalyst() {
		return eccSecondryEligAnalyst;
	}

	/**
	 * @param eccSecondryEligAnalyst the eccSecondryEligAnalyst to set
	 */
	public void setEccSecondryEligAnalyst(String eccSecondryEligAnalyst) {
		this.eccSecondryEligAnalyst = StringUtils.trim(eccSecondryEligAnalyst);
	}

	/**
	 * @return the eccSuspFileCndChkDlyMin
	 */
	public String getEccSuspFileCndChkDlyMin() {
		return eccSuspFileCndChkDlyMin;
	}

	/**
	 * @param eccSuspFileCndChkDlyMin the eccSuspFileCndChkDlyMin to set
	 */
	public void setEccSuspFileCndChkDlyMin(String eccSuspFileCndChkDlyMin) {
		this.eccSuspFileCndChkDlyMin = StringUtils.trim(eccSuspFileCndChkDlyMin);
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
		this.addUserName = StringUtils.trim(addUserName);
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
		this.addDate = StringUtils.trim(addDate);
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
		this.addTime = StringUtils.trim(addTime);
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
		this.addProgramName = StringUtils.trim(addProgramName);
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
		this.chgUserName = StringUtils.trim(chgUserName);
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
		this.chgDate = StringUtils.trim(chgDate);
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
		this.chgTime = StringUtils.trim(chgTime);
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
		this.chgProgramName = StringUtils.trim(chgProgramName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EligErrorToleranceControl [carCarrierId=" + carCarrierId + ", accountId=" + accountId + ", groupId="
				+ groupId + ", platformId=" + platformId + ", eccEnableToleranceChk=" + eccEnableToleranceChk
				+ ", eccAlwaysSuspAftrStaging=" + eccAlwaysSuspAftrStaging + ", eccLengthOfMemberId="
				+ eccLengthOfMemberId + ", eccEmailDistributionLst=" + eccEmailDistributionLst
				+ ", eccPerfrmExplctTrmChk=" + eccPerfrmExplctTrmChk + ", eccPercntForExplctTrmChk="
				+ eccPercntForExplctTrmChk + ", eccPerformRetroTrmChk=" + eccPerformRetroTrmChk
				+ ", eccPercentForRetroTrmChk=" + eccPercentForRetroTrmChk + ", eccMinNbrInpRcdTrgTolChk="
				+ eccMinNbrInpRcdTrgTolChk + ", eccPrimaryEligAnalyst=" + eccPrimaryEligAnalyst
				+ ", eccSecondryEligAnalyst=" + eccSecondryEligAnalyst + ", eccSuspFileCndChkDlyMin="
				+ eccSuspFileCndChkDlyMin + ", addUserName=" + addUserName + ", addDate=" + addDate + ", addTime="
				+ addTime + ", addProgramName=" + addProgramName + ", chgUserName=" + chgUserName + ", chgDate="
				+ chgDate + ", chgTime=" + chgTime + ", chgProgramName=" + chgProgramName + "]";
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
		result = prime * result + ((addDate == null) ? 0 : addDate.hashCode());
		result = prime * result + ((addProgramName == null) ? 0 : addProgramName.hashCode());
		result = prime * result + ((addTime == null) ? 0 : addTime.hashCode());
		result = prime * result + ((addUserName == null) ? 0 : addUserName.hashCode());
		result = prime * result + ((carCarrierId == null) ? 0 : carCarrierId.hashCode());
		result = prime * result + ((chgDate == null) ? 0 : chgDate.hashCode());
		result = prime * result + ((chgProgramName == null) ? 0 : chgProgramName.hashCode());
		result = prime * result + ((chgTime == null) ? 0 : chgTime.hashCode());
		result = prime * result + ((chgUserName == null) ? 0 : chgUserName.hashCode());
		result = prime * result + ((eccAlwaysSuspAftrStaging == null) ? 0 : eccAlwaysSuspAftrStaging.hashCode());
		result = prime * result + ((eccEmailDistributionLst == null) ? 0 : eccEmailDistributionLst.hashCode());
		result = prime * result + ((eccEnableToleranceChk == null) ? 0 : eccEnableToleranceChk.hashCode());
		result = prime * result + ((eccLengthOfMemberId == null) ? 0 : eccLengthOfMemberId.hashCode());
		result = prime * result + ((eccMinNbrInpRcdTrgTolChk == null) ? 0 : eccMinNbrInpRcdTrgTolChk.hashCode());
		result = prime * result + ((eccPercentForRetroTrmChk == null) ? 0 : eccPercentForRetroTrmChk.hashCode());
		result = prime * result + ((eccPercntForExplctTrmChk == null) ? 0 : eccPercntForExplctTrmChk.hashCode());
		result = prime * result + ((eccPerformRetroTrmChk == null) ? 0 : eccPerformRetroTrmChk.hashCode());
		result = prime * result + ((eccPerfrmExplctTrmChk == null) ? 0 : eccPerfrmExplctTrmChk.hashCode());
		result = prime * result + ((eccPrimaryEligAnalyst == null) ? 0 : eccPrimaryEligAnalyst.hashCode());
		result = prime * result + ((eccSecondryEligAnalyst == null) ? 0 : eccSecondryEligAnalyst.hashCode());
		result = prime * result + ((eccSuspFileCndChkDlyMin == null) ? 0 : eccSuspFileCndChkDlyMin.hashCode());
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
		EligErrorToleranceControl other = (EligErrorToleranceControl) obj;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (addDate == null) {
			if (other.addDate != null)
				return false;
		} else if (!addDate.equals(other.addDate))
			return false;
		if (addProgramName == null) {
			if (other.addProgramName != null)
				return false;
		} else if (!addProgramName.equals(other.addProgramName))
			return false;
		if (addTime == null) {
			if (other.addTime != null)
				return false;
		} else if (!addTime.equals(other.addTime))
			return false;
		if (addUserName == null) {
			if (other.addUserName != null)
				return false;
		} else if (!addUserName.equals(other.addUserName))
			return false;
		if (carCarrierId == null) {
			if (other.carCarrierId != null)
				return false;
		} else if (!carCarrierId.equals(other.carCarrierId))
			return false;
		if (chgDate == null) {
			if (other.chgDate != null)
				return false;
		} else if (!chgDate.equals(other.chgDate))
			return false;
		if (chgProgramName == null) {
			if (other.chgProgramName != null)
				return false;
		} else if (!chgProgramName.equals(other.chgProgramName))
			return false;
		if (chgTime == null) {
			if (other.chgTime != null)
				return false;
		} else if (!chgTime.equals(other.chgTime))
			return false;
		if (chgUserName == null) {
			if (other.chgUserName != null)
				return false;
		} else if (!chgUserName.equals(other.chgUserName))
			return false;
		if (eccAlwaysSuspAftrStaging == null) {
			if (other.eccAlwaysSuspAftrStaging != null)
				return false;
		} else if (!eccAlwaysSuspAftrStaging.equals(other.eccAlwaysSuspAftrStaging))
			return false;
		if (eccEmailDistributionLst == null) {
			if (other.eccEmailDistributionLst != null)
				return false;
		} else if (!eccEmailDistributionLst.equals(other.eccEmailDistributionLst))
			return false;
		if (eccEnableToleranceChk == null) {
			if (other.eccEnableToleranceChk != null)
				return false;
		} else if (!eccEnableToleranceChk.equals(other.eccEnableToleranceChk))
			return false;
		if (eccLengthOfMemberId == null) {
			if (other.eccLengthOfMemberId != null)
				return false;
		} else if (!eccLengthOfMemberId.equals(other.eccLengthOfMemberId))
			return false;
		if (eccMinNbrInpRcdTrgTolChk == null) {
			if (other.eccMinNbrInpRcdTrgTolChk != null)
				return false;
		} else if (!eccMinNbrInpRcdTrgTolChk.equals(other.eccMinNbrInpRcdTrgTolChk))
			return false;
		if (eccPercentForRetroTrmChk == null) {
			if (other.eccPercentForRetroTrmChk != null)
				return false;
		} else if (!eccPercentForRetroTrmChk.equals(other.eccPercentForRetroTrmChk))
			return false;
		if (eccPercntForExplctTrmChk == null) {
			if (other.eccPercntForExplctTrmChk != null)
				return false;
		} else if (!eccPercntForExplctTrmChk.equals(other.eccPercntForExplctTrmChk))
			return false;
		if (eccPerformRetroTrmChk == null) {
			if (other.eccPerformRetroTrmChk != null)
				return false;
		} else if (!eccPerformRetroTrmChk.equals(other.eccPerformRetroTrmChk))
			return false;
		if (eccPerfrmExplctTrmChk == null) {
			if (other.eccPerfrmExplctTrmChk != null)
				return false;
		} else if (!eccPerfrmExplctTrmChk.equals(other.eccPerfrmExplctTrmChk))
			return false;
		if (eccPrimaryEligAnalyst == null) {
			if (other.eccPrimaryEligAnalyst != null)
				return false;
		} else if (!eccPrimaryEligAnalyst.equals(other.eccPrimaryEligAnalyst))
			return false;
		if (eccSecondryEligAnalyst == null) {
			if (other.eccSecondryEligAnalyst != null)
				return false;
		} else if (!eccSecondryEligAnalyst.equals(other.eccSecondryEligAnalyst))
			return false;
		if (eccSuspFileCndChkDlyMin == null) {
			if (other.eccSuspFileCndChkDlyMin != null)
				return false;
		} else if (!eccSuspFileCndChkDlyMin.equals(other.eccSuspFileCndChkDlyMin))
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

}
