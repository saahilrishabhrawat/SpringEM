package com.optum.rxclaimnextgen.elg.pojo;

import java.sql.Date;
import java.sql.Time;

public class EligMemberIncidentDefaultDetailForm {
    private String carCarrierId;
    private String accountId;
    private String groupId;
    
    private String ewdPriceScheduleInd;
    private String prcPriceScheduleName;
    private String ewdPlanInd;
    private String planCode;
    private DateType planEffDate;
    private String ewdInjuryFromDateInd;
    private DateType ewdInjuryFromDate;
    private String ewdInjuryThruDateInd;
    private DateType ewdInjuryThruDate;
    private String ewdWcIncidentIdInd;
    private String ewdWcIncidentId;
    private String ewdClaimReferenceInd;
    private String ewdClaimReference;
    private String ewdIdCardInd;
    private String ewdPharmPatientPayInd;
    private String ewdPharmPatientPay;
    private String ewdClientPriceSchdInd;
    private String ewdClientPriceSchedule;
    private String ewdClientPatientpayInd;
    private String ewdClientPatientPay;
    
	private String addDate;
	private String addProgramName;
	private String chgUserName;
	private String chgDate;
	private String chgTime;
	private String chgProgramName;

    private String message;
    
    private String platformId;
    
    
	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public String getEwdPriceScheduleInd() {
		return ewdPriceScheduleInd;
	}

	public void setEwdPriceScheduleInd(String ewdPriceScheduleInd) {
		this.ewdPriceScheduleInd = ewdPriceScheduleInd;
	}

	public String getPrcPriceScheduleName() {
		return prcPriceScheduleName;
	}

	public void setPrcPriceScheduleName(String prcPriceScheduleName) {
		this.prcPriceScheduleName = prcPriceScheduleName;
	}

	public String getEwdPlanInd() {
		return ewdPlanInd;
	}

	public void setEwdPlanInd(String ewdPlanInd) {
		this.ewdPlanInd = ewdPlanInd;
	}

	public String getPlanCode() {
		return planCode;
	}

	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}



	public String getEwdInjuryFromDateInd() {
		return ewdInjuryFromDateInd;
	}

	public void setEwdInjuryFromDateInd(String ewdInjuryFromDateInd) {
		this.ewdInjuryFromDateInd = ewdInjuryFromDateInd;
	}



	public DateType getPlanEffDate() {
		return planEffDate;
	}

	public void setPlanEffDate(DateType planEffDate) {
		this.planEffDate = planEffDate;
	}

	public DateType getEwdInjuryFromDate() {
		return ewdInjuryFromDate;
	}

	public void setEwdInjuryFromDate(DateType ewdInjuryFromDate) {
		this.ewdInjuryFromDate = ewdInjuryFromDate;
	}

	public DateType getEwdInjuryThruDate() {
		return ewdInjuryThruDate;
	}

	public void setEwdInjuryThruDate(DateType ewdInjuryThruDate) {
		this.ewdInjuryThruDate = ewdInjuryThruDate;
	}

	public String getEwdInjuryThruDateInd() {
		return ewdInjuryThruDateInd;
	}

	public void setEwdInjuryThruDateInd(String ewdInjuryThruDateInd) {
		this.ewdInjuryThruDateInd = ewdInjuryThruDateInd;
	}


	public String getEwdWcIncidentIdInd() {
		return ewdWcIncidentIdInd;
	}

	public void setEwdWcIncidentIdInd(String ewdWcIncidentIdInd) {
		this.ewdWcIncidentIdInd = ewdWcIncidentIdInd;
	}

	public String getEwdWcIncidentId() {
		return ewdWcIncidentId;
	}

	public void setEwdWcIncidentId(String ewdWcIncidentId) {
		this.ewdWcIncidentId = ewdWcIncidentId;
	}

	public String getEwdClaimReferenceInd() {
		return ewdClaimReferenceInd;
	}

	public void setEwdClaimReferenceInd(String ewdClaimReferenceInd) {
		this.ewdClaimReferenceInd = ewdClaimReferenceInd;
	}

	public String getEwdClaimReference() {
		return ewdClaimReference;
	}

	public void setEwdClaimReference(String ewdClaimReference) {
		this.ewdClaimReference = ewdClaimReference;
	}

	public String getEwdIdCardInd() {
		return ewdIdCardInd;
	}

	public void setEwdIdCardInd(String ewdIdCardInd) {
		this.ewdIdCardInd = ewdIdCardInd;
	}

	public String getEwdPharmPatientPayInd() {
		return ewdPharmPatientPayInd;
	}

	public void setEwdPharmPatientPayInd(String ewdPharmPatientPayInd) {
		this.ewdPharmPatientPayInd = ewdPharmPatientPayInd;
	}

	public String getEwdPharmPatientPay() {
		return ewdPharmPatientPay;
	}

	public void setEwdPharmPatientPay(String ewdPharmPatientPay) {
		this.ewdPharmPatientPay = ewdPharmPatientPay;
	}

	public String getEwdClientPriceSchdInd() {
		return ewdClientPriceSchdInd;
	}

	public void setEwdClientPriceSchdInd(String ewdClientPriceSchdInd) {
		this.ewdClientPriceSchdInd = ewdClientPriceSchdInd;
	}

	public String getEwdClientPriceSchedule() {
		return ewdClientPriceSchedule;
	}

	public void setEwdClientPriceSchedule(String ewdClientPriceSchedule) {
		this.ewdClientPriceSchedule = ewdClientPriceSchedule;
	}

	public String getEwdClientPatientpayInd() {
		return ewdClientPatientpayInd;
	}

	public void setEwdClientPatientpayInd(String ewdClientPatientpayInd) {
		this.ewdClientPatientpayInd = ewdClientPatientpayInd;
	}

	public String getEwdClientPatientPay() {
		return ewdClientPatientPay;
	}

	public void setEwdClientPatientPay(String ewdClientPatientPay) {
		this.ewdClientPatientPay = ewdClientPatientPay;
	}

	public String getAddDate() {
		return addDate;
	}

	public void setAddDate(String addDate) {
		this.addDate = addDate;
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

	
	
	@Override
    public String toString() {
        return "EligMemberCareAssignDetailForm{" +
                "carCarrierId='" + carCarrierId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", ewdPriceScheduleInd='" + ewdPriceScheduleInd + '\'' +
                ", prcPriceScheduleName='" + prcPriceScheduleName + '\'' +
                ", ewdPlanInd='" + ewdPlanInd + '\'' +
                ", planCode='" + planCode + '\'' +
                ", planEffDate='" + planEffDate + '\'' +
                ", ewdInjuryFromDateInd='" + ewdInjuryFromDateInd + '\'' +
                ", ewdInjuryFromDate='" + ewdInjuryFromDate + '\'' +
                ", ewdInjuryThruDateInd='" + ewdInjuryThruDateInd + '\'' +
                ", ewdInjuryThruDate='" + ewdInjuryThruDate + '\'' +
                ", ewdWcIncidentIdInd='" + ewdWcIncidentIdInd + '\'' +
               ", ewdWcIncidentId='" + ewdWcIncidentId + '\'' +
                ", ewdClaimReferenceInd='" + ewdClaimReferenceInd + '\'' +
                ", ewdClaimReference='" + ewdClaimReference + '\'' +
                ", ewdIdCardInd='" + ewdIdCardInd + '\'' +
                ", ewdPharmPatientPayInd='" + ewdPharmPatientPayInd + '\'' +
                ", ewdPharmPatientPay='" + ewdPharmPatientPay + '\'' +
                ", ewdClientPriceSchdInd='" + ewdClientPriceSchdInd + '\'' +
                ", ewdClientPriceSchedule='" + ewdClientPriceSchedule + '\'' +
                ", ewdClientPatientpayInd='" + ewdClientPatientpayInd + '\'' +
                ", ewdClientPatientPay='" + ewdClientPatientPay + '\'' +                
                ", addDate=" + addDate +
                ", addProgramName='" + addProgramName + '\'' +
                ", chgUserName='" + chgUserName + '\'' +
                ", chgDate=" + chgDate +
                ", chgTime=" + chgTime +
                ", chgProgramName='" + chgProgramName + '\'' +
                '}';
    }
	
}
