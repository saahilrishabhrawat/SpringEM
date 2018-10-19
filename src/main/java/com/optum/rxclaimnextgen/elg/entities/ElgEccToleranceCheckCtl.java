package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "ELG_ECC_TOLERANCE_CHECK_CTL")
@IdClass(ElgEccToleranceCheckCtlPK.class)
public class ElgEccToleranceCheckCtl {
	private String carCarrierId;
	private String accountId;
	private String groupId;
	private String eccEnableToleranceChk;
	private String eccAlwaysSuspAftrStaging;
	private BigInteger eccLengthOfMemberId;
	private String eccEmailDistributionLst;
	private String eccPerfrmExplctTrmChk;
	private BigDecimal eccPercntForExplctTrmChk;
	private String eccPerformRetroTrmChk;
	private BigDecimal eccPercentForRetroTrmChk;
	private int eccMinNbrInpRcdTrgTolChk;
	private String eccPrimaryEligAnalyst;
	private String eccSecondryEligAnalyst;
	private int eccSuspFileCndChkDlyMin;
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
	@Column(name = "ECC_ENABLE_TOLERANCE_CHK")
	public String getEccEnableToleranceChk() {
		return eccEnableToleranceChk;
	}

	public void setEccEnableToleranceChk(String eccEnableToleranceChk) {
		this.eccEnableToleranceChk = eccEnableToleranceChk;
	}

	/**
	 * @return the eccAlwaysSuspAftrStaging
	 */
	@Basic
	@Column(name = "ECC_ALWAYSSUSPAFTRSTAGING")
	public String getEccAlwaysSuspAftrStaging() {
		return eccAlwaysSuspAftrStaging;
	}

	/**
	 * @param eccAlwaysSuspAftrStaging the eccAlwaysSuspAftrStaging to set
	 */
	public void setEccAlwaysSuspAftrStaging(String eccAlwaysSuspAftrStaging) {
		this.eccAlwaysSuspAftrStaging = eccAlwaysSuspAftrStaging;
	}

	@Basic
	@Column(name = "ECC_LENGTH_OF_MEMBER_ID")
	public BigInteger getEccLengthOfMemberId() {
		return eccLengthOfMemberId;
	}

	public void setEccLengthOfMemberId(BigInteger eccLengthOfMemberId) {
		this.eccLengthOfMemberId = eccLengthOfMemberId;
	}

	/**
	 * @return the eccEmailDistributionLst
	 */
	@Basic
	@Column(name = "ECC_EMAILDISTRIBUTIONLST")

	public String getEccEmailDistributionLst() {
		return eccEmailDistributionLst;
	}

	/**
	 * @param eccEmailDistributionLst the eccEmailDistributionLst to set
	 */
	public void setEccEmailDistributionLst(String eccEmailDistributionLst) {
		this.eccEmailDistributionLst = eccEmailDistributionLst;
	}

	@Basic
	@Column(name = "ECC_PERFRM_EXPLCT_TRM_CHK")
	public String getEccPerfrmExplctTrmChk() {
		return eccPerfrmExplctTrmChk;
	}

	public void setEccPerfrmExplctTrmChk(String eccPerfrmExplctTrmChk) {
		this.eccPerfrmExplctTrmChk = eccPerfrmExplctTrmChk;
	}

	/**
	 * @return the eccPercntForExplctTrmChk
	 */
	@Basic
	@Column(name = "ECC_PERCNTFOREXPLCTTRMCHK")
	public BigDecimal getEccPercntForExplctTrmChk() {
		return eccPercntForExplctTrmChk;
	}

	/**
	 * @param eccPercntForExplctTrmChk the eccPercntForExplctTrmChk to set
	 */
	public void setEccPercntForExplctTrmChk(BigDecimal eccPercntForExplctTrmChk) {
		this.eccPercntForExplctTrmChk = eccPercntForExplctTrmChk;
	}

	@Basic
	@Column(name = "ECC_PERFORM_RETRO_TRM_CHK")
	public String getEccPerformRetroTrmChk() {
		return eccPerformRetroTrmChk;
	}

	public void setEccPerformRetroTrmChk(String eccPerformRetroTrmChk) {
		this.eccPerformRetroTrmChk = eccPerformRetroTrmChk;
	}

	/**
	 * @return the eccPercentForRetroTrmChk
	 */
	@Basic
	@Column(name = "ECC_PERCENTFORRETROTRMCHK")

	public BigDecimal getEccPercentForRetroTrmChk() {
		return eccPercentForRetroTrmChk;
	}

	/**
	 * @param eccPercentForRetroTrmChk the eccPercentForRetroTrmChk to set
	 */
	public void setEccPercentForRetroTrmChk(BigDecimal eccPercentForRetroTrmChk) {
		this.eccPercentForRetroTrmChk = eccPercentForRetroTrmChk;
	}

	/**
	 * @return the eccMinNbrInpRcdTrgTolChk
	 */
	@Basic
	@Column(name = "ECC_MINNBRINPRCDTRGTOLCHK")
	public int getEccMinNbrInpRcdTrgTolChk() {
		return eccMinNbrInpRcdTrgTolChk;
	}

	/**
	 * @param eccMinNbrInpRcdTrgTolChk the eccMinNbrInpRcdTrgTolChk to set
	 */
	public void setEccMinNbrInpRcdTrgTolChk(int eccMinNbrInpRcdTrgTolChk) {
		this.eccMinNbrInpRcdTrgTolChk = eccMinNbrInpRcdTrgTolChk;
	}

	@Basic
	@Column(name = "ECC_PRIMARY_ELIG_ANALYST")
	public String getEccPrimaryEligAnalyst() {
		return eccPrimaryEligAnalyst;
	}

	public void setEccPrimaryEligAnalyst(String eccPrimaryEligAnalyst) {
		this.eccPrimaryEligAnalyst = eccPrimaryEligAnalyst;
	}

	@Basic
	@Column(name = "ECC_SECONDRY_ELIG_ANALYST")
	public String getEccSecondryEligAnalyst() {
		return eccSecondryEligAnalyst;
	}

	public void setEccSecondryEligAnalyst(String eccSecondryEligAnalyst) {
		this.eccSecondryEligAnalyst = eccSecondryEligAnalyst;
	}

	/**
	 * @return the eccSuspFileCndChkDlyMin
	 */
	@Basic
	@Column(name = "ECC_SUSPFILECNDCHKDLYMIN")
	public int getEccSuspFileCndChkDlyMin() {
		return eccSuspFileCndChkDlyMin;
	}

	/**
	 * @param eccSuspFileCndChkDlyMin the eccSuspFileCndChkDlyMin to set
	 */
	public void setEccSuspFileCndChkDlyMin(int eccSuspFileCndChkDlyMin) {
		this.eccSuspFileCndChkDlyMin = eccSuspFileCndChkDlyMin;
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
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		ElgEccToleranceCheckCtl that = (ElgEccToleranceCheckCtl) o;
		return eccMinNbrInpRcdTrgTolChk == that.eccMinNbrInpRcdTrgTolChk
				&& eccSuspFileCndChkDlyMin == that.eccSuspFileCndChkDlyMin
				&& Objects.equals(carCarrierId, that.carCarrierId) && Objects.equals(accountId, that.accountId)
				&& Objects.equals(groupId, that.groupId)
				&& Objects.equals(eccEnableToleranceChk, that.eccEnableToleranceChk)
				&& Objects.equals(eccAlwaysSuspAftrStaging, that.eccAlwaysSuspAftrStaging)
				&& Objects.equals(eccLengthOfMemberId, that.eccLengthOfMemberId)
				&& Objects.equals(eccEmailDistributionLst, that.eccEmailDistributionLst)
				&& Objects.equals(eccPerfrmExplctTrmChk, that.eccPerfrmExplctTrmChk)
				&& Objects.equals(eccPercntForExplctTrmChk, that.eccPercntForExplctTrmChk)
				&& Objects.equals(eccPerformRetroTrmChk, that.eccPerformRetroTrmChk)
				&& Objects.equals(eccPercentForRetroTrmChk, that.eccPercentForRetroTrmChk)
				&& Objects.equals(eccPrimaryEligAnalyst, that.eccPrimaryEligAnalyst)
				&& Objects.equals(eccSecondryEligAnalyst, that.eccSecondryEligAnalyst)
				&& Objects.equals(addUserName, that.addUserName) && Objects.equals(addDate, that.addDate)
				&& Objects.equals(addTime, that.addTime) && Objects.equals(addProgramName, that.addProgramName)
				&& Objects.equals(chgUserName, that.chgUserName) && Objects.equals(chgDate, that.chgDate)
				&& Objects.equals(chgTime, that.chgTime) && Objects.equals(chgProgramName, that.chgProgramName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(carCarrierId, accountId, groupId, eccEnableToleranceChk, eccAlwaysSuspAftrStaging,
				eccLengthOfMemberId, eccEmailDistributionLst, eccPerfrmExplctTrmChk, eccPercntForExplctTrmChk,
				eccPerformRetroTrmChk, eccPercentForRetroTrmChk, eccMinNbrInpRcdTrgTolChk, eccPrimaryEligAnalyst,
				eccSecondryEligAnalyst, eccSuspFileCndChkDlyMin, addUserName, addDate, addTime, addProgramName,
				chgUserName, chgDate, chgTime, chgProgramName);
	}
}
