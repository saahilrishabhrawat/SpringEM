/**
 * 
 */
package com.optum.rxclaimnextgen.elg.pojo;

import java.sql.Date;
import java.sql.Time;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Hemant Sharma
 *
 */
public class EligAltInsuranceDefaultDetail {
	private String carCarrierId;
	private String accountId;
	private String groupId;
	private String emdMaiLock;
	private String emdMaiEffDateInd;
	private DateType emdMaiEffDate;
	private String emdMaiThruDateInd;
	private DateType emdMaiThruDate;
	private String emdAlternateInsInd;
	private String emdAlternateIns;
	private String emdAltInsuranceIdInd;
	private String emdAltInsuranceId;
	private String emdAltInsCodeInd;
	private String emdAltInsCode;
	private String addUserName;
	private Date addDate;
	private Time addTime;
	private String addProgramName;
	private String chgUserName;
	private Date chgDate;
	private Time chgTime;
	private String chgProgramName;

	/**
	 * @return the emdMaiLock
	 */
	public String getEmdMaiLock() {
		return emdMaiLock;
	}

	/**
	 * @param emdMaiLock the emdMaiLock to set
	 */
	public void setEmdMaiLock(String emdMaiLock) {
		this.emdMaiLock = StringUtils.trim(emdMaiLock);
	}

	/**
	 * @return the emdMaiEffDateInd
	 */
	public String getEmdMaiEffDateInd() {
		return emdMaiEffDateInd;
	}

	/**
	 * @param emdMaiEffDateInd the emdMaiEffDateInd to set
	 */
	public void setEmdMaiEffDateInd(String emdMaiEffDateInd) {
		this.emdMaiEffDateInd = StringUtils.trim(emdMaiEffDateInd);
	}

	/**
	 * @return the emdMaiEffDate
	 */
	public DateType getEmdMaiEffDate() {
		return emdMaiEffDate;
	}

	/**
	 * @param emdMaiEffDate the emdMaiEffDate to set
	 */
	public void setEmdMaiEffDate(DateType emdMaiEffDate) {
		this.emdMaiEffDate = emdMaiEffDate;
	}

	/**
	 * @return the emdMaiThruDateInd
	 */
	public String getEmdMaiThruDateInd() {
		return emdMaiThruDateInd;
	}

	/**
	 * @param emdMaiThruDateInd the emdMaiThruDateInd to set
	 */
	public void setEmdMaiThruDateInd(String emdMaiThruDateInd) {
		this.emdMaiThruDateInd = StringUtils.trim(emdMaiThruDateInd);
	}

	/**
	 * @return the emdMaiThruDate
	 */
	public DateType getEmdMaiThruDate() {
		return emdMaiThruDate;
	}

	/**
	 * @param emdMaiThruDate the emdMaiThruDate to set
	 */
	public void setEmdMaiThruDate(DateType emdMaiThruDate) {
		this.emdMaiThruDate = emdMaiThruDate;
	}

	/**
	 * @return the emdAlternateInsInd
	 */
	public String getEmdAlternateInsInd() {
		return emdAlternateInsInd;
	}

	/**
	 * @param emdAlternateInsInd the emdAlternateInsInd to set
	 */
	public void setEmdAlternateInsInd(String emdAlternateInsInd) {
		this.emdAlternateInsInd = StringUtils.trim(emdAlternateInsInd);
	}

	/**
	 * @return the emdAlternateIns
	 */
	public String getEmdAlternateIns() {
		return emdAlternateIns;
	}

	/**
	 * @param emdAlternateIns the emdAlternateIns to set
	 */
	public void setEmdAlternateIns(String emdAlternateIns) {
		this.emdAlternateIns = StringUtils.trim(emdAlternateIns);
	}

	/**
	 * @return the emdAltInsuranceIdInd
	 */
	public String getEmdAltInsuranceIdInd() {
		return emdAltInsuranceIdInd;
	}

	/**
	 * @param emdAltInsuranceIdInd the emdAltInsuranceIdInd to set
	 */
	public void setEmdAltInsuranceIdInd(String emdAltInsuranceIdInd) {
		this.emdAltInsuranceIdInd = StringUtils.trim(emdAltInsuranceIdInd);
	}

	/**
	 * @return the emdAltInsuranceId
	 */
	public String getEmdAltInsuranceId() {
		return emdAltInsuranceId;
	}

	/**
	 * @param emdAltInsuranceId the emdAltInsuranceId to set
	 */
	public void setEmdAltInsuranceId(String emdAltInsuranceId) {
		this.emdAltInsuranceId = StringUtils.trim(emdAltInsuranceId);
	}

	/**
	 * @return the emdAltInsCodeInd
	 */
	public String getEmdAltInsCodeInd() {
		return emdAltInsCodeInd;
	}

	/**
	 * @param emdAltInsCodeInd the emdAltInsCodeInd to set
	 */
	public void setEmdAltInsCodeInd(String emdAltInsCodeInd) {
		this.emdAltInsCodeInd = StringUtils.trim(emdAltInsCodeInd);
	}

	/**
	 * @return the emdAltInsCode
	 */
	public String getEmdAltInsCode() {
		return emdAltInsCode;
	}

	/**
	 * @param emdAltInsCode the emdAltInsCode to set
	 */
	public void setEmdAltInsCode(String emdAltInsCode) {
		this.emdAltInsCode = StringUtils.trim(emdAltInsCode);
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
		this.chgProgramName = StringUtils.trim(chgProgramName);
	}

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
		this.carCarrierId = StringUtils.trim(carCarrierId);
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
		this.accountId = StringUtils.trim(accountId);
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
		this.groupId = StringUtils.trim(groupId);
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
		result = prime * result + ((emdAltInsCode == null) ? 0 : emdAltInsCode.hashCode());
		result = prime * result + ((emdAltInsCodeInd == null) ? 0 : emdAltInsCodeInd.hashCode());
		result = prime * result + ((emdAltInsuranceId == null) ? 0 : emdAltInsuranceId.hashCode());
		result = prime * result + ((emdAltInsuranceIdInd == null) ? 0 : emdAltInsuranceIdInd.hashCode());
		result = prime * result + ((emdAlternateIns == null) ? 0 : emdAlternateIns.hashCode());
		result = prime * result + ((emdAlternateInsInd == null) ? 0 : emdAlternateInsInd.hashCode());
		result = prime * result + ((emdMaiEffDate == null) ? 0 : emdMaiEffDate.hashCode());
		result = prime * result + ((emdMaiEffDateInd == null) ? 0 : emdMaiEffDateInd.hashCode());
		result = prime * result + ((emdMaiLock == null) ? 0 : emdMaiLock.hashCode());
		result = prime * result + ((emdMaiThruDate == null) ? 0 : emdMaiThruDate.hashCode());
		result = prime * result + ((emdMaiThruDateInd == null) ? 0 : emdMaiThruDateInd.hashCode());
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
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
		EligAltInsuranceDefaultDetail other = (EligAltInsuranceDefaultDetail) obj;
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
		if (emdAltInsCode == null) {
			if (other.emdAltInsCode != null)
				return false;
		} else if (!emdAltInsCode.equals(other.emdAltInsCode))
			return false;
		if (emdAltInsCodeInd == null) {
			if (other.emdAltInsCodeInd != null)
				return false;
		} else if (!emdAltInsCodeInd.equals(other.emdAltInsCodeInd))
			return false;
		if (emdAltInsuranceId == null) {
			if (other.emdAltInsuranceId != null)
				return false;
		} else if (!emdAltInsuranceId.equals(other.emdAltInsuranceId))
			return false;
		if (emdAltInsuranceIdInd == null) {
			if (other.emdAltInsuranceIdInd != null)
				return false;
		} else if (!emdAltInsuranceIdInd.equals(other.emdAltInsuranceIdInd))
			return false;
		if (emdAlternateIns == null) {
			if (other.emdAlternateIns != null)
				return false;
		} else if (!emdAlternateIns.equals(other.emdAlternateIns))
			return false;
		if (emdAlternateInsInd == null) {
			if (other.emdAlternateInsInd != null)
				return false;
		} else if (!emdAlternateInsInd.equals(other.emdAlternateInsInd))
			return false;
		if (emdMaiEffDate == null) {
			if (other.emdMaiEffDate != null)
				return false;
		} else if (!emdMaiEffDate.equals(other.emdMaiEffDate))
			return false;
		if (emdMaiEffDateInd == null) {
			if (other.emdMaiEffDateInd != null)
				return false;
		} else if (!emdMaiEffDateInd.equals(other.emdMaiEffDateInd))
			return false;
		if (emdMaiLock == null) {
			if (other.emdMaiLock != null)
				return false;
		} else if (!emdMaiLock.equals(other.emdMaiLock))
			return false;
		if (emdMaiThruDate == null) {
			if (other.emdMaiThruDate != null)
				return false;
		} else if (!emdMaiThruDate.equals(other.emdMaiThruDate))
			return false;
		if (emdMaiThruDateInd == null) {
			if (other.emdMaiThruDateInd != null)
				return false;
		} else if (!emdMaiThruDateInd.equals(other.emdMaiThruDateInd))
			return false;
		if (groupId == null) {
			if (other.groupId != null)
				return false;
		} else if (!groupId.equals(other.groupId))
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
		return "EligAltInsuranceDefaultDetail [carCarrierId=" + carCarrierId + ", accountId=" + accountId + ", groupId="
				+ groupId + ", emdMaiLock=" + emdMaiLock + ", emdMaiEffDateInd=" + emdMaiEffDateInd + ", emdMaiEffDate="
				+ emdMaiEffDate + ", emdMaiThruDateInd=" + emdMaiThruDateInd + ", emdMaiThruDate=" + emdMaiThruDate
				+ ", emdAlternateInsInd=" + emdAlternateInsInd + ", emdAlternateIns=" + emdAlternateIns
				+ ", emdAltInsuranceIdInd=" + emdAltInsuranceIdInd + ", emdAltInsuranceId=" + emdAltInsuranceId
				+ ", emdAltInsCodeInd=" + emdAltInsCodeInd + ", emdAltInsCode=" + emdAltInsCode + ", addUserName="
				+ addUserName + ", addDate=" + addDate + ", addTime=" + addTime + ", addProgramName=" + addProgramName
				+ ", chgUserName=" + chgUserName + ", chgDate=" + chgDate + ", chgTime=" + chgTime + ", chgProgramName="
				+ chgProgramName + "]";
	}

}
