/**
 * 
 */
package com.optum.rxclaimnextgen.elg.pojo;

import java.sql.Date;
import java.sql.Time;

/**
 * @author sbahedi
 *
 */
public class EligGovernanceDataControl {
	
	private String carCarrierId;
    private String accountId;
    private String groupId;
    private String edgExternalEligUpdate;
    private String edgEligibilityMbrMatch;
    private String edgEmailDistListId;
    private String addUserName;
    private Date addDate;
    private Time addTime;
    private String addProgramName;
    private String chgUserName;
    private Date chgDate;
    private Time chgTime;
    private String chgProgramName;
    
    private String platformId;
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
	 * @return the edgExternalEligUpdate
	 */
	public String getEdgExternalEligUpdate() {
		return edgExternalEligUpdate;
	}
	/**
	 * @param edgExternalEligUpdate the edgExternalEligUpdate to set
	 */
	public void setEdgExternalEligUpdate(String edgExternalEligUpdate) {
		this.edgExternalEligUpdate = edgExternalEligUpdate;
	}
	/**
	 * @return the edgEligibilityMbrMatch
	 */
	public String getEdgEligibilityMbrMatch() {
		return edgEligibilityMbrMatch;
	}
	/**
	 * @param edgEligibilityMbrMatch the edgEligibilityMbrMatch to set
	 */
	public void setEdgEligibilityMbrMatch(String edgEligibilityMbrMatch) {
		this.edgEligibilityMbrMatch = edgEligibilityMbrMatch;
	}
	/**
	 * @return the edgEmailDistListId
	 */
	public String getEdgEmailDistListId() {
		return edgEmailDistListId;
	}
	/**
	 * @param edgEmailDistListId the edgEmailDistListId to set
	 */
	public void setEdgEmailDistListId(String edgEmailDistListId) {
		this.edgEmailDistListId = edgEmailDistListId;
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
	public Date getAddDate() {
		return addDate;
	}
	/**
	 * @param addDate the addDate to set
	 */
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	/**
	 * @return the addTime
	 */
	public Time getAddTime() {
		return addTime;
	}
	/**
	 * @param addTime the addTime to set
	 */
	public void setAddTime(Time addTime) {
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
	public Date getChgDate() {
		return chgDate;
	}
	/**
	 * @param chgDate the chgDate to set
	 */
	public void setChgDate(Date chgDate) {
		this.chgDate = chgDate;
	}
	/**
	 * @return the chgTime
	 */
	public Time getChgTime() {
		return chgTime;
	}
	/**
	 * @param chgTime the chgTime to set
	 */
	public void setChgTime(Time chgTime) {
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
	/* (non-Javadoc)
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
		result = prime * result + ((edgEligibilityMbrMatch == null) ? 0 : edgEligibilityMbrMatch.hashCode());
		result = prime * result + ((edgEmailDistListId == null) ? 0 : edgEmailDistListId.hashCode());
		result = prime * result + ((edgExternalEligUpdate == null) ? 0 : edgExternalEligUpdate.hashCode());
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
		return result;
	}
	/* (non-Javadoc)
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
		EligGovernanceDataControl other = (EligGovernanceDataControl) obj;
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
		if (edgEligibilityMbrMatch == null) {
			if (other.edgEligibilityMbrMatch != null)
				return false;
		} else if (!edgEligibilityMbrMatch.equals(other.edgEligibilityMbrMatch))
			return false;
		if (edgEmailDistListId == null) {
			if (other.edgEmailDistListId != null)
				return false;
		} else if (!edgEmailDistListId.equals(other.edgEmailDistListId))
			return false;
		if (edgExternalEligUpdate == null) {
			if (other.edgExternalEligUpdate != null)
				return false;
		} else if (!edgExternalEligUpdate.equals(other.edgExternalEligUpdate))
			return false;
		if (groupId == null) {
			if (other.groupId != null)
				return false;
		} else if (!groupId.equals(other.groupId))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EligGovernanceDataControl [carCarrierId=" + carCarrierId + ", accountId=" + accountId + ", groupId="
				+ groupId + ", edgExternalEligUpdate=" + edgExternalEligUpdate + ", edgEligibilityMbrMatch="
				+ edgEligibilityMbrMatch + ", edgEmailDistListId=" + edgEmailDistListId + ", addUserName=" + addUserName
				+ ", addDate=" + addDate + ", addTime=" + addTime + ", addProgramName=" + addProgramName
				+ ", chgUserName=" + chgUserName + ", chgDate=" + chgDate + ", chgTime=" + chgTime + ", chgProgramName="
				+ chgProgramName + "]";
	}
    
    

}
