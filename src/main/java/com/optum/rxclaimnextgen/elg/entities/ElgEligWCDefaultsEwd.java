package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by bkocinsk on 7/23/2018.
 */
@Entity
@Table(name = "ELG_ELIG_W_C_DEFAULTS_EWD")
@IdClass(ElgEligWCDefaultsEwdPK.class)
public class ElgEligWCDefaultsEwd {
    private String carCarrierId;
    private String accountId;
    private String groupId;
    private String ewdPriceScheduleInd;
    private String prcPriceScheduleName;
    private String ewdPlanInd;
    private String planCode;
    private Date planEffDate;
    private String ewdInjuryFromDateInd;
    private Date ewdInjuryFromDate;
    private String ewdInjuryThruDateInd;
    private Date ewdInjuryThruDate;
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
    private Date addDate;
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
    @Column(name = "EWD_PRICE_SCHEDULE_IND")
    public String getEwdPriceScheduleInd() {
        return ewdPriceScheduleInd;
    }

    public void setEwdPriceScheduleInd(String ewdPriceScheduleInd) {
        this.ewdPriceScheduleInd = ewdPriceScheduleInd;
    }

    @Basic
    @Column(name = "PRC_PRICE_SCHEDULE_NAME")
    public String getPrcPriceScheduleName() {
        return prcPriceScheduleName;
    }

    public void setPrcPriceScheduleName(String prcPriceScheduleName) {
        this.prcPriceScheduleName = prcPriceScheduleName;
    }

    @Basic
    @Column(name = "EWD_PLAN_IND")
    public String getEwdPlanInd() {
        return ewdPlanInd;
    }

    public void setEwdPlanInd(String ewdPlanInd) {
        this.ewdPlanInd = ewdPlanInd;
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
    @Column(name = "EWD_INJURY_FROM_DATE_IND")
    public String getEwdInjuryFromDateInd() {
        return ewdInjuryFromDateInd;
    }

    public void setEwdInjuryFromDateInd(String ewdInjuryFromDateInd) {
        this.ewdInjuryFromDateInd = ewdInjuryFromDateInd;
    }

    @Basic
    @Column(name = "EWD_INJURY_FROM_DATE")
    public Date getEwdInjuryFromDate() {
        return ewdInjuryFromDate;
    }

    public void setEwdInjuryFromDate(Date ewdInjuryFromDate) {
        this.ewdInjuryFromDate = ewdInjuryFromDate;
    }

    @Basic
    @Column(name = "EWD_INJURY_THRU_DATE_IND")
    public String getEwdInjuryThruDateInd() {
        return ewdInjuryThruDateInd;
    }

    public void setEwdInjuryThruDateInd(String ewdInjuryThruDateInd) {
        this.ewdInjuryThruDateInd = ewdInjuryThruDateInd;
    }

    @Basic
    @Column(name = "EWD_INJURY_THRU_DATE")
    public Date getEwdInjuryThruDate() {
        return ewdInjuryThruDate;
    }

    public void setEwdInjuryThruDate(Date ewdInjuryThruDate) {
        this.ewdInjuryThruDate = ewdInjuryThruDate;
    }

    @Basic
    @Column(name = "EWD_WC_INCIDENT_ID_IND")
    public String getEwdWcIncidentIdInd() {
        return ewdWcIncidentIdInd;
    }

    public void setEwdWcIncidentIdInd(String ewdWcIncidentIdInd) {
        this.ewdWcIncidentIdInd = ewdWcIncidentIdInd;
    }

    @Basic
    @Column(name = "EWD_WC_INCIDENT_ID")
    public String getEwdWcIncidentId() {
        return ewdWcIncidentId;
    }

    public void setEwdWcIncidentId(String ewdWcIncidentId) {
        this.ewdWcIncidentId = ewdWcIncidentId;
    }

    @Basic
    @Column(name = "EWD_CLAIM_REFERENCE_IND")
    public String getEwdClaimReferenceInd() {
        return ewdClaimReferenceInd;
    }

    public void setEwdClaimReferenceInd(String ewdClaimReferenceInd) {
        this.ewdClaimReferenceInd = ewdClaimReferenceInd;
    }

    @Basic
    @Column(name = "EWD_CLAIM_REFERENCE")
    public String getEwdClaimReference() {
        return ewdClaimReference;
    }

    public void setEwdClaimReference(String ewdClaimReference) {
        this.ewdClaimReference = ewdClaimReference;
    }

    @Basic
    @Column(name = "EWD_ID_CARD_IND")
    public String getEwdIdCardInd() {
        return ewdIdCardInd;
    }

    public void setEwdIdCardInd(String ewdIdCardInd) {
        this.ewdIdCardInd = ewdIdCardInd;
    }

    @Basic
    @Column(name = "EWD_PHARM_PATIENT_PAY_IND")
    public String getEwdPharmPatientPayInd() {
        return ewdPharmPatientPayInd;
    }

    public void setEwdPharmPatientPayInd(String ewdPharmPatientPayInd) {
        this.ewdPharmPatientPayInd = ewdPharmPatientPayInd;
    }

    @Basic
    @Column(name = "EWD_PHARM_PATIENT_PAY")
    public String getEwdPharmPatientPay() {
        return ewdPharmPatientPay;
    }

    public void setEwdPharmPatientPay(String ewdPharmPatientPay) {
        this.ewdPharmPatientPay = ewdPharmPatientPay;
    }

    @Basic
    @Column(name = "EWD_CLIENT_PRICE_SCHD_IND")
    public String getEwdClientPriceSchdInd() {
        return ewdClientPriceSchdInd;
    }

    public void setEwdClientPriceSchdInd(String ewdClientPriceSchdInd) {
        this.ewdClientPriceSchdInd = ewdClientPriceSchdInd;
    }

    @Basic
    @Column(name = "EWD_CLIENT_PRICE_SCHEDULE")
    public String getEwdClientPriceSchedule() {
        return ewdClientPriceSchedule;
    }

    public void setEwdClientPriceSchedule(String ewdClientPriceSchedule) {
        this.ewdClientPriceSchedule = ewdClientPriceSchedule;
    }

    @Basic
    @Column(name = "EWD_CLIENT_PATIENTPAY_IND")
    public String getEwdClientPatientpayInd() {
        return ewdClientPatientpayInd;
    }

    public void setEwdClientPatientpayInd(String ewdClientPatientpayInd) {
        this.ewdClientPatientpayInd = ewdClientPatientpayInd;
    }

    @Basic
    @Column(name = "EWD_CLIENT_PATIENT_PAY")
    public String getEwdClientPatientPay() {
        return ewdClientPatientPay;
    }

    public void setEwdClientPatientPay(String ewdClientPatientPay) {
        this.ewdClientPatientPay = ewdClientPatientPay;
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

        ElgEligWCDefaultsEwd that = (ElgEligWCDefaultsEwd) o;

        if (carCarrierId != null ? !carCarrierId.equals(that.carCarrierId) : that.carCarrierId != null) return false;
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        if (ewdPriceScheduleInd != null ? !ewdPriceScheduleInd.equals(that.ewdPriceScheduleInd) : that.ewdPriceScheduleInd != null)
            return false;
        if (prcPriceScheduleName != null ? !prcPriceScheduleName.equals(that.prcPriceScheduleName) : that.prcPriceScheduleName != null)
            return false;
        if (ewdPlanInd != null ? !ewdPlanInd.equals(that.ewdPlanInd) : that.ewdPlanInd != null) return false;
        if (planCode != null ? !planCode.equals(that.planCode) : that.planCode != null) return false;
        if (planEffDate != null ? !planEffDate.equals(that.planEffDate) : that.planEffDate != null) return false;
        if (ewdInjuryFromDateInd != null ? !ewdInjuryFromDateInd.equals(that.ewdInjuryFromDateInd) : that.ewdInjuryFromDateInd != null)
            return false;
        if (ewdInjuryFromDate != null ? !ewdInjuryFromDate.equals(that.ewdInjuryFromDate) : that.ewdInjuryFromDate != null)
            return false;
        if (ewdInjuryThruDateInd != null ? !ewdInjuryThruDateInd.equals(that.ewdInjuryThruDateInd) : that.ewdInjuryThruDateInd != null)
            return false;
        if (ewdInjuryThruDate != null ? !ewdInjuryThruDate.equals(that.ewdInjuryThruDate) : that.ewdInjuryThruDate != null)
            return false;
        if (ewdWcIncidentIdInd != null ? !ewdWcIncidentIdInd.equals(that.ewdWcIncidentIdInd) : that.ewdWcIncidentIdInd != null)
            return false;
        if (ewdWcIncidentId != null ? !ewdWcIncidentId.equals(that.ewdWcIncidentId) : that.ewdWcIncidentId != null)
            return false;
        if (ewdClaimReferenceInd != null ? !ewdClaimReferenceInd.equals(that.ewdClaimReferenceInd) : that.ewdClaimReferenceInd != null)
            return false;
        if (ewdClaimReference != null ? !ewdClaimReference.equals(that.ewdClaimReference) : that.ewdClaimReference != null)
            return false;
        if (ewdIdCardInd != null ? !ewdIdCardInd.equals(that.ewdIdCardInd) : that.ewdIdCardInd != null) return false;
        if (ewdPharmPatientPayInd != null ? !ewdPharmPatientPayInd.equals(that.ewdPharmPatientPayInd) : that.ewdPharmPatientPayInd != null)
            return false;
        if (ewdPharmPatientPay != null ? !ewdPharmPatientPay.equals(that.ewdPharmPatientPay) : that.ewdPharmPatientPay != null)
            return false;
        if (ewdClientPriceSchdInd != null ? !ewdClientPriceSchdInd.equals(that.ewdClientPriceSchdInd) : that.ewdClientPriceSchdInd != null)
            return false;
        if (ewdClientPriceSchedule != null ? !ewdClientPriceSchedule.equals(that.ewdClientPriceSchedule) : that.ewdClientPriceSchedule != null)
            return false;
        if (ewdClientPatientpayInd != null ? !ewdClientPatientpayInd.equals(that.ewdClientPatientpayInd) : that.ewdClientPatientpayInd != null)
            return false;
        if (ewdClientPatientPay != null ? !ewdClientPatientPay.equals(that.ewdClientPatientPay) : that.ewdClientPatientPay != null)
            return false;
        if (addDate != null ? !addDate.equals(that.addDate) : that.addDate != null) return false;
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
        result = 31 * result + (ewdPriceScheduleInd != null ? ewdPriceScheduleInd.hashCode() : 0);
        result = 31 * result + (prcPriceScheduleName != null ? prcPriceScheduleName.hashCode() : 0);
        result = 31 * result + (ewdPlanInd != null ? ewdPlanInd.hashCode() : 0);
        result = 31 * result + (planCode != null ? planCode.hashCode() : 0);
        result = 31 * result + (planEffDate != null ? planEffDate.hashCode() : 0);
        result = 31 * result + (ewdInjuryFromDateInd != null ? ewdInjuryFromDateInd.hashCode() : 0);
        result = 31 * result + (ewdInjuryFromDate != null ? ewdInjuryFromDate.hashCode() : 0);
        result = 31 * result + (ewdInjuryThruDateInd != null ? ewdInjuryThruDateInd.hashCode() : 0);
        result = 31 * result + (ewdInjuryThruDate != null ? ewdInjuryThruDate.hashCode() : 0);
        result = 31 * result + (ewdWcIncidentIdInd != null ? ewdWcIncidentIdInd.hashCode() : 0);
        result = 31 * result + (ewdWcIncidentId != null ? ewdWcIncidentId.hashCode() : 0);
        result = 31 * result + (ewdClaimReferenceInd != null ? ewdClaimReferenceInd.hashCode() : 0);
        result = 31 * result + (ewdClaimReference != null ? ewdClaimReference.hashCode() : 0);
        result = 31 * result + (ewdIdCardInd != null ? ewdIdCardInd.hashCode() : 0);
        result = 31 * result + (ewdPharmPatientPayInd != null ? ewdPharmPatientPayInd.hashCode() : 0);
        result = 31 * result + (ewdPharmPatientPay != null ? ewdPharmPatientPay.hashCode() : 0);
        result = 31 * result + (ewdClientPriceSchdInd != null ? ewdClientPriceSchdInd.hashCode() : 0);
        result = 31 * result + (ewdClientPriceSchedule != null ? ewdClientPriceSchedule.hashCode() : 0);
        result = 31 * result + (ewdClientPatientpayInd != null ? ewdClientPatientpayInd.hashCode() : 0);
        result = 31 * result + (ewdClientPatientPay != null ? ewdClientPatientPay.hashCode() : 0);
        result = 31 * result + (addDate != null ? addDate.hashCode() : 0);
        result = 31 * result + (chgUserName != null ? chgUserName.hashCode() : 0);
        result = 31 * result + (chgDate != null ? chgDate.hashCode() : 0);
        result = 31 * result + (chgTime != null ? chgTime.hashCode() : 0);
        result = 31 * result + (chgProgramName != null ? chgProgramName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ElgEligWCDefaultsEwd{" +
                "carCarrierId='" + carCarrierId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", ewdPriceScheduleInd='" + ewdPriceScheduleInd + '\'' +
                ", prcPriceScheduleName='" + prcPriceScheduleName + '\'' +
                ", ewdPlanInd='" + ewdPlanInd + '\'' +
                ", planCode='" + planCode + '\'' +
                ", planEffDate=" + planEffDate +
                ", ewdInjuryFromDateInd='" + ewdInjuryFromDateInd + '\'' +
                ", ewdInjuryFromDate=" + ewdInjuryFromDate +
                ", ewdInjuryThruDateInd='" + ewdInjuryThruDateInd + '\'' +
                ", ewdInjuryThruDate=" + ewdInjuryThruDate +
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
                ", chgUserName='" + chgUserName + '\'' +
                ", chgDate=" + chgDate +
                ", chgTime=" + chgTime +
                ", chgProgramName='" + chgProgramName + '\'' +
                '}';
    }
}
