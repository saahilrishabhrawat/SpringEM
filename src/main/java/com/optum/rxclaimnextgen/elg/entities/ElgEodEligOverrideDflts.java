package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by bkocinsk on 7/18/2018.
 */
@Entity
@Table(name = "ELG_EOD_ELIG_OVERRIDE_DFLTS")
@IdClass(ElgEodEligOverrideDfltsPK.class)
public class ElgEodEligOverrideDflts {
    private String carCarrierId;
    private String accountId;
    private String groupId;
    private String eodCopayFromDateInd;
    private Date eodCopayFromDate;
    private String eodCopayThruDateInd;
    private Date eodCopayThruDate;
    private String eodCopayScheduleInd;
    private String eodCopaySchedule;
    private String eodCopayStepInd;
    private Integer eodCopayStep;
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
    @Column(name = "EOD_COPAY_FROM_DATE_IND")
    public String getEodCopayFromDateInd() {
        return eodCopayFromDateInd;
    }

    public void setEodCopayFromDateInd(String eodCopayFromDateInd) {
        this.eodCopayFromDateInd = eodCopayFromDateInd;
    }

    @Basic
    @Column(name = "EOD_COPAY_FROM_DATE")
    public Date getEodCopayFromDate() {
        return eodCopayFromDate;
    }

    public void setEodCopayFromDate(Date eodCopayFromDate) {
        this.eodCopayFromDate = eodCopayFromDate;
    }

    @Basic
    @Column(name = "EOD_COPAY_THRU_DATE_IND")
    public String getEodCopayThruDateInd() {
        return eodCopayThruDateInd;
    }

    public void setEodCopayThruDateInd(String eodCopayThruDateInd) {
        this.eodCopayThruDateInd = eodCopayThruDateInd;
    }

    @Basic
    @Column(name = "EOD_COPAY_THRU_DATE")
    public Date getEodCopayThruDate() {
        return eodCopayThruDate;
    }

    public void setEodCopayThruDate(Date eodCopayThruDate) {
        this.eodCopayThruDate = eodCopayThruDate;
    }

    @Basic
    @Column(name = "EOD_COPAY_SCHEDULE_IND")
    public String getEodCopayScheduleInd() {
        return eodCopayScheduleInd;
    }

    public void setEodCopayScheduleInd(String eodCopayScheduleInd) {
        this.eodCopayScheduleInd = eodCopayScheduleInd;
    }

    @Basic
    @Column(name = "EOD_COPAY_SCHEDULE")
    public String getEodCopaySchedule() {
        return eodCopaySchedule;
    }

    public void setEodCopaySchedule(String eodCopaySchedule) {
        this.eodCopaySchedule = eodCopaySchedule;
    }

    @Basic
    @Column(name = "EOD_COPAY_STEP_IND")
    public String getEodCopayStepInd() {
        return eodCopayStepInd;
    }

    public void setEodCopayStepInd(String eodCopayStepInd) {
        this.eodCopayStepInd = eodCopayStepInd;
    }

    @Basic
    @Column(name = "EOD_COPAY_STEP")
    public Integer getEodCopayStep() {
        return eodCopayStep;
    }

    public void setEodCopayStep(Integer eodCopayStep) {
        this.eodCopayStep = eodCopayStep;
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElgEodEligOverrideDflts that = (ElgEodEligOverrideDflts) o;

        if (carCarrierId != null ? !carCarrierId.equals(that.carCarrierId) : that.carCarrierId != null) return false;
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        if (eodCopayFromDateInd != null ? !eodCopayFromDateInd.equals(that.eodCopayFromDateInd) : that.eodCopayFromDateInd != null)
            return false;
        if (eodCopayFromDate != null ? !eodCopayFromDate.equals(that.eodCopayFromDate) : that.eodCopayFromDate != null)
            return false;
        if (eodCopayThruDateInd != null ? !eodCopayThruDateInd.equals(that.eodCopayThruDateInd) : that.eodCopayThruDateInd != null)
            return false;
        if (eodCopayThruDate != null ? !eodCopayThruDate.equals(that.eodCopayThruDate) : that.eodCopayThruDate != null)
            return false;
        if (eodCopayScheduleInd != null ? !eodCopayScheduleInd.equals(that.eodCopayScheduleInd) : that.eodCopayScheduleInd != null)
            return false;
        if (eodCopaySchedule != null ? !eodCopaySchedule.equals(that.eodCopaySchedule) : that.eodCopaySchedule != null)
            return false;
        if (eodCopayStepInd != null ? !eodCopayStepInd.equals(that.eodCopayStepInd) : that.eodCopayStepInd != null)
            return false;
        if (eodCopayStep != null ? !eodCopayStep.equals(that.eodCopayStep) : that.eodCopayStep != null) return false;
        if (addUserName != null ? !addUserName.equals(that.addUserName) : that.addUserName != null) return false;
        if (addDate != null ? !addDate.equals(that.addDate) : that.addDate != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (addProgramName != null ? !addProgramName.equals(that.addProgramName) : that.addProgramName != null)
            return false;
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
        result = 31 * result + (eodCopayFromDateInd != null ? eodCopayFromDateInd.hashCode() : 0);
        result = 31 * result + (eodCopayFromDate != null ? eodCopayFromDate.hashCode() : 0);
        result = 31 * result + (eodCopayThruDateInd != null ? eodCopayThruDateInd.hashCode() : 0);
        result = 31 * result + (eodCopayThruDate != null ? eodCopayThruDate.hashCode() : 0);
        result = 31 * result + (eodCopayScheduleInd != null ? eodCopayScheduleInd.hashCode() : 0);
        result = 31 * result + (eodCopaySchedule != null ? eodCopaySchedule.hashCode() : 0);
        result = 31 * result + (eodCopayStepInd != null ? eodCopayStepInd.hashCode() : 0);
        result = 31 * result + (eodCopayStep != null ? eodCopayStep.hashCode() : 0);
        result = 31 * result + (addUserName != null ? addUserName.hashCode() : 0);
        result = 31 * result + (addDate != null ? addDate.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (addProgramName != null ? addProgramName.hashCode() : 0);
        result = 31 * result + (chgUserName != null ? chgUserName.hashCode() : 0);
        result = 31 * result + (chgDate != null ? chgDate.hashCode() : 0);
        result = 31 * result + (chgTime != null ? chgTime.hashCode() : 0);
        result = 31 * result + (chgProgramName != null ? chgProgramName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ElgEodEligOverrideDflts{" +
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
}
