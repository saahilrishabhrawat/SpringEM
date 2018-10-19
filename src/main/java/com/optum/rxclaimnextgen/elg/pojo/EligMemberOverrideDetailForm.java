package com.optum.rxclaimnextgen.elg.pojo;

import java.math.BigInteger;
import java.sql.Date;

public class EligMemberOverrideDetailForm {
	
	

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
	public String getEodCopayFromDateInd() {
		return eodCopayFromDateInd;
	}
	public void setEodCopayFromDateInd(String eodCopayFromDateInd) {
		this.eodCopayFromDateInd = eodCopayFromDateInd;
	}
	public DateType getEodCopayFromDate() {
		return eodCopayFromDate;
	}
	public void setEodCopayFromDate(DateType eodCopayFromDate) {
		this.eodCopayFromDate = eodCopayFromDate;
	}
	public String getEodCopayThruDateInd() {
		return eodCopayThruDateInd;
	}
	public void setEodCopayThruDateInd(String eodCopayThruDateInd) {
		this.eodCopayThruDateInd = eodCopayThruDateInd;
	}
	public DateType getEodCopayThruDate() {
		return eodCopayThruDate;
	}
	public void setEodCopayThruDate(DateType eodCopayThruDate) {
		this.eodCopayThruDate = eodCopayThruDate;
	}
	public String getEodCopayScheduleInd() {
		return eodCopayScheduleInd;
	}
	public void setEodCopayScheduleInd(String eodCopayScheduleInd) {
		this.eodCopayScheduleInd = eodCopayScheduleInd;
	}
	public String getEodCopaySchedule() {
		return eodCopaySchedule;
	}
	public void setEodCopaySchedule(String eodCopaySchedule) {
		this.eodCopaySchedule = eodCopaySchedule;
	}
	public String getEodCopayStepInd() {
		return eodCopayStepInd;
	}
	public void setEodCopayStepInd(String eodCopayStepInd) {
		this.eodCopayStepInd = eodCopayStepInd;
	}
	public String getEodCopayStep() {
		return eodCopayStep;
	}
	public void setEodCopayStep(String eodCopayStep) {
		this.eodCopayStep = eodCopayStep;
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
	


    @Override
    public String toString() {
        return "EligMemberOverrideDetailForm{" +
                "carCarrierId='" + carCarrierId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", eodCopayFromDateInd='" + eodCopayFromDateInd + '\'' +
                ", eodCopayFromDate=" + eodCopayFromDate +
                ", eodCopayThruDateInd='" + eodCopayThruDateInd + '\'' +
                ", eodCopayThruDate=" + eodCopayThruDate +
                ", eodCopayScheduleInd='" + eodCopayScheduleInd + '\'' +
                ", eodCopaySchedule='" + eodCopaySchedule + '\'' +
                ", eodCopayStepInd='" + eodCopayStepInd + '\'' +
                ", eodCopayStep=" + eodCopayStep +
                ", addUserName='" + addUserName + '\'' +
                ", addDate=" + addDate +
                ", addTime=" + addTime +
                ", addProgramName='" + addProgramName + '\'' +
                ", chgUserName='" + chgUserName + '\'' +
                ", chgDate=" + chgDate +
                ", chgTime=" + chgTime +
                ", chgProgramName='" + chgProgramName + '\'' +
                '}';
    }
	
	private String carCarrierId;
	private String accountId;
	private String groupId;
	private String platformId;
	
	

		private String eodCopayFromDateInd;
	    private DateType eodCopayFromDate;
	    private String eodCopayThruDateInd;
	    private DateType eodCopayThruDate;
	    private String eodCopayScheduleInd;
	    private String eodCopaySchedule;
	    private String eodCopayStepInd;
	    private String eodCopayStep;
	
	private String addUserName;
	private String addDate;
	private String addTime;
	private String addProgramName;
	private String chgUserName;
	private String chgDate;
	private String chgTime;
	private String chgProgramName;
	private String message;
}
