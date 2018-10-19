package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by bkocinsk on 6/22/2018.
 */
@Entity
@Table(name = "ELG_ELIG_MEMBER_DEFAULTS_OVR_EMH")
@IdClass(ElgEligMemberDefaultsOvrEmhPK.class)
public class ElgEligMemberDefaultsOvrEmh {
    private String carCarrierId;
    private String accountId;
    private String groupId;
    private String emhHimFromThruDateI;
    private String emhHimFromThruDateR;
    private String emhQhpPlanIdInd;
    private String emhQhpPlanIdRep;
    private String emhCsrLevelInd;
    private String emhCsrLevelRep;
    private String emhMetalLevelInd;
    private String emhMetalLevelIndRep;
    private String emhMemberEthnicityInd;
    private String emhMemberEthnicityRep;
    private String emhAptcIndicator;
    private String emhHimGraceStartEndI;
    private String emhHimGraceStartEndR;
    private String emhFamilyIdReproc;
    private String addUserName;
    private Date addDate;
    private Time addTime;
    private String addProgramName;
    private String chgUserName;
    private Date chgDate;
    private Time chgTime;
    private String chgProgramName;

    @Id
    @Column(name = "CAR_CARRIER_ID", nullable = false, length = 9)
    public String getCarCarrierId() {
        return carCarrierId;
    }

    public void setCarCarrierId(String carCarrierId) {
        this.carCarrierId = carCarrierId;
    }

    @Id
    @Column(name = "ACCOUNT_ID", nullable = false, length = 15)
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Id
    @Column(name = "GROUP_ID", nullable = false, length = 15)
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "EMH_HIM_FROM_THRU_DATE_I", nullable = false, length = 1)
    public String getEmhHimFromThruDateI() {
        return emhHimFromThruDateI;
    }

    public void setEmhHimFromThruDateI(String emhHimFromThruDateI) {
        this.emhHimFromThruDateI = emhHimFromThruDateI;
    }

    @Basic
    @Column(name = "EMH_HIM_FROM_THRU_DATE_R", nullable = false, length = 1)
    public String getEmhHimFromThruDateR() {
        return emhHimFromThruDateR;
    }

    public void setEmhHimFromThruDateR(String emhHimFromThruDateR) {
        this.emhHimFromThruDateR = emhHimFromThruDateR;
    }

    @Basic
    @Column(name = "EMH_QHP_PLAN_ID_IND", nullable = false, length = 1)
    public String getEmhQhpPlanIdInd() {
        return emhQhpPlanIdInd;
    }

    public void setEmhQhpPlanIdInd(String emhQhpPlanIdInd) {
        this.emhQhpPlanIdInd = emhQhpPlanIdInd;
    }

    @Basic
    @Column(name = "EMH_QHP_PLAN_ID_REP", nullable = false, length = 1)
    public String getEmhQhpPlanIdRep() {
        return emhQhpPlanIdRep;
    }

    public void setEmhQhpPlanIdRep(String emhQhpPlanIdRep) {
        this.emhQhpPlanIdRep = emhQhpPlanIdRep;
    }

    @Basic
    @Column(name = "EMH_CSR_LEVEL_IND", nullable = false, length = 1)
    public String getEmhCsrLevelInd() {
        return emhCsrLevelInd;
    }

    public void setEmhCsrLevelInd(String emhCsrLevelInd) {
        this.emhCsrLevelInd = emhCsrLevelInd;
    }

    @Basic
    @Column(name = "EMH_CSR_LEVEL_REP", nullable = false, length = 1)
    public String getEmhCsrLevelRep() {
        return emhCsrLevelRep;
    }

    public void setEmhCsrLevelRep(String emhCsrLevelRep) {
        this.emhCsrLevelRep = emhCsrLevelRep;
    }

    @Basic
    @Column(name = "EMH_METAL_LEVEL_IND", nullable = false, length = 1)
    public String getEmhMetalLevelInd() {
        return emhMetalLevelInd;
    }

    public void setEmhMetalLevelInd(String emhMetalLevelInd) {
        this.emhMetalLevelInd = emhMetalLevelInd;
    }

    @Basic
    @Column(name = "EMH_METAL_LEVEL_IND_REP", nullable = false, length = 1)
    public String getEmhMetalLevelIndRep() {
        return emhMetalLevelIndRep;
    }

    public void setEmhMetalLevelIndRep(String emhMetalLevelIndRep) {
        this.emhMetalLevelIndRep = emhMetalLevelIndRep;
    }

    @Basic
    @Column(name = "EMH_MEMBER_ETHNICITY_IND", nullable = false, length = 1)
    public String getEmhMemberEthnicityInd() {
        return emhMemberEthnicityInd;
    }

    public void setEmhMemberEthnicityInd(String emhMemberEthnicityInd) {
        this.emhMemberEthnicityInd = emhMemberEthnicityInd;
    }

    @Basic
    @Column(name = "EMH_MEMBER_ETHNICITY_REP", nullable = false, length = 1)
    public String getEmhMemberEthnicityRep() {
        return emhMemberEthnicityRep;
    }

    public void setEmhMemberEthnicityRep(String emhMemberEthnicityRep) {
        this.emhMemberEthnicityRep = emhMemberEthnicityRep;
    }

    @Basic
    @Column(name = "EMH_APTC_INDICATOR", nullable = false, length = 1)
    public String getEmhAptcIndicator() {
        return emhAptcIndicator;
    }

    public void setEmhAptcIndicator(String emhAptcIndicator) {
        this.emhAptcIndicator = emhAptcIndicator;
    }

    @Basic
    @Column(name = "EMH_HIM_GRACE_START_END_I", nullable = false, length = 1)
    public String getEmhHimGraceStartEndI() {
        return emhHimGraceStartEndI;
    }

    public void setEmhHimGraceStartEndI(String emhHimGraceStartEndI) {
        this.emhHimGraceStartEndI = emhHimGraceStartEndI;
    }

    @Basic
    @Column(name = "EMH_HIM_GRACE_START_END_R", nullable = false, length = 1)
    public String getEmhHimGraceStartEndR() {
        return emhHimGraceStartEndR;
    }

    public void setEmhHimGraceStartEndR(String emhHimGraceStartEndR) {
        this.emhHimGraceStartEndR = emhHimGraceStartEndR;
    }

    @Basic
    @Column(name = "EMH_FAMILY_ID_REPROC", nullable = false, length = 1)
    public String getEmhFamilyIdReproc() {
        return emhFamilyIdReproc;
    }

    public void setEmhFamilyIdReproc(String emhFamilyIdReproc) {
        this.emhFamilyIdReproc = emhFamilyIdReproc;
    }

    @Basic
    @Column(name = "ADD_USER_NAME", nullable = false, length = 10)
    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    @Basic
    @Column(name = "ADD_DATE", nullable = false)
    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    @Basic
    @Column(name = "ADD_TIME", nullable = false)
    public Time getAddTime() {
        return addTime;
    }

    public void setAddTime(Time addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "ADD_PROGRAM_NAME", nullable = false, length = 10)
    public String getAddProgramName() {
        return addProgramName;
    }

    public void setAddProgramName(String addProgramName) {
        this.addProgramName = addProgramName;
    }

    @Basic
    @Column(name = "CHG_USER_NAME", nullable = false, length = 10)
    public String getChgUserName() {
        return chgUserName;
    }

    public void setChgUserName(String chgUserName) {
        this.chgUserName = chgUserName;
    }

    @Basic
    @Column(name = "CHG_DATE", nullable = false)
    public Date getChgDate() {
        return chgDate;
    }

    public void setChgDate(Date chgDate) {
        this.chgDate = chgDate;
    }

    @Basic
    @Column(name = "CHG_TIME", nullable = false)
    public Time getChgTime() {
        return chgTime;
    }

    public void setChgTime(Time chgTime) {
        this.chgTime = chgTime;
    }

    @Basic
    @Column(name = "CHG_PROGRAM_NAME", nullable = false, length = 10)
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

        ElgEligMemberDefaultsOvrEmh that = (ElgEligMemberDefaultsOvrEmh) o;

        if (carCarrierId != null ? !carCarrierId.equals(that.carCarrierId) : that.carCarrierId != null) return false;
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        if (emhHimFromThruDateI != null ? !emhHimFromThruDateI.equals(that.emhHimFromThruDateI) : that.emhHimFromThruDateI != null)
            return false;
        if (emhHimFromThruDateR != null ? !emhHimFromThruDateR.equals(that.emhHimFromThruDateR) : that.emhHimFromThruDateR != null)
            return false;
        if (emhQhpPlanIdInd != null ? !emhQhpPlanIdInd.equals(that.emhQhpPlanIdInd) : that.emhQhpPlanIdInd != null)
            return false;
        if (emhQhpPlanIdRep != null ? !emhQhpPlanIdRep.equals(that.emhQhpPlanIdRep) : that.emhQhpPlanIdRep != null)
            return false;
        if (emhCsrLevelInd != null ? !emhCsrLevelInd.equals(that.emhCsrLevelInd) : that.emhCsrLevelInd != null)
            return false;
        if (emhCsrLevelRep != null ? !emhCsrLevelRep.equals(that.emhCsrLevelRep) : that.emhCsrLevelRep != null)
            return false;
        if (emhMetalLevelInd != null ? !emhMetalLevelInd.equals(that.emhMetalLevelInd) : that.emhMetalLevelInd != null)
            return false;
        if (emhMetalLevelIndRep != null ? !emhMetalLevelIndRep.equals(that.emhMetalLevelIndRep) : that.emhMetalLevelIndRep != null)
            return false;
        if (emhMemberEthnicityInd != null ? !emhMemberEthnicityInd.equals(that.emhMemberEthnicityInd) : that.emhMemberEthnicityInd != null)
            return false;
        if (emhMemberEthnicityRep != null ? !emhMemberEthnicityRep.equals(that.emhMemberEthnicityRep) : that.emhMemberEthnicityRep != null)
            return false;
        if (emhAptcIndicator != null ? !emhAptcIndicator.equals(that.emhAptcIndicator) : that.emhAptcIndicator != null)
            return false;
        if (emhHimGraceStartEndI != null ? !emhHimGraceStartEndI.equals(that.emhHimGraceStartEndI) : that.emhHimGraceStartEndI != null)
            return false;
        if (emhHimGraceStartEndR != null ? !emhHimGraceStartEndR.equals(that.emhHimGraceStartEndR) : that.emhHimGraceStartEndR != null)
            return false;
        if (emhFamilyIdReproc != null ? !emhFamilyIdReproc.equals(that.emhFamilyIdReproc) : that.emhFamilyIdReproc != null)
            return false;
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
        result = 31 * result + (emhHimFromThruDateI != null ? emhHimFromThruDateI.hashCode() : 0);
        result = 31 * result + (emhHimFromThruDateR != null ? emhHimFromThruDateR.hashCode() : 0);
        result = 31 * result + (emhQhpPlanIdInd != null ? emhQhpPlanIdInd.hashCode() : 0);
        result = 31 * result + (emhQhpPlanIdRep != null ? emhQhpPlanIdRep.hashCode() : 0);
        result = 31 * result + (emhCsrLevelInd != null ? emhCsrLevelInd.hashCode() : 0);
        result = 31 * result + (emhCsrLevelRep != null ? emhCsrLevelRep.hashCode() : 0);
        result = 31 * result + (emhMetalLevelInd != null ? emhMetalLevelInd.hashCode() : 0);
        result = 31 * result + (emhMetalLevelIndRep != null ? emhMetalLevelIndRep.hashCode() : 0);
        result = 31 * result + (emhMemberEthnicityInd != null ? emhMemberEthnicityInd.hashCode() : 0);
        result = 31 * result + (emhMemberEthnicityRep != null ? emhMemberEthnicityRep.hashCode() : 0);
        result = 31 * result + (emhAptcIndicator != null ? emhAptcIndicator.hashCode() : 0);
        result = 31 * result + (emhHimGraceStartEndI != null ? emhHimGraceStartEndI.hashCode() : 0);
        result = 31 * result + (emhHimGraceStartEndR != null ? emhHimGraceStartEndR.hashCode() : 0);
        result = 31 * result + (emhFamilyIdReproc != null ? emhFamilyIdReproc.hashCode() : 0);
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
        return "ElgEligMemberDefaultsOvrEmh{" +
                "carCarrierId='" + carCarrierId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", emhHimFromThruDateI='" + emhHimFromThruDateI + '\'' +
                ", emhHimFromThruDateR='" + emhHimFromThruDateR + '\'' +
                ", emhQhpPlanIdInd='" + emhQhpPlanIdInd + '\'' +
                ", emhQhpPlanIdRep='" + emhQhpPlanIdRep + '\'' +
                ", emhCsrLevelInd='" + emhCsrLevelInd + '\'' +
                ", emhCsrLevelRep='" + emhCsrLevelRep + '\'' +
                ", emhMetalLevelInd='" + emhMetalLevelInd + '\'' +
                ", emhMetalLevelIndRep='" + emhMetalLevelIndRep + '\'' +
                ", emhMemberEthnicityInd='" + emhMemberEthnicityInd + '\'' +
                ", emhMemberEthnicityRep='" + emhMemberEthnicityRep + '\'' +
                ", emhAptcIndicator='" + emhAptcIndicator + '\'' +
                ", emhHimGraceStartEndI='" + emhHimGraceStartEndI + '\'' +
                ", emhHimGraceStartEndR='" + emhHimGraceStartEndR + '\'' +
                ", emhFamilyIdReproc='" + emhFamilyIdReproc + '\'' +
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

