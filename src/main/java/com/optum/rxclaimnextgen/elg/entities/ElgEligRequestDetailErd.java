package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "ELG_ELIG_REQUEST_DETAIL_ERD")
@IdClass(ElgEligRequestDetailErdPK.class)
public class ElgEligRequestDetailErd {
    private String carCarrierId;
    private String accountId;
    private String groupId;
    private int erdTrackingId;
    private int erdNbrOfGroupRecords;
    private String erdGroupFileName;
    private String erdGroupFileLibrary;
    private int erdNbrOfMemberRecords;
    private String erdMemberFileName;
    private String erdMemberFileLibrary;
    private String erdShortInstruction;
    private Date erdFutureDate;
    private String erdMediaType;
    private String erdLoadType;
    private String erdNotes;
    private String erdStatus;
    private String erdFileType;
    private String erdEpfChangedBy;
    private String erdCalcExplicitTrmMbr;
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

    @Id
    @Column(name = "ERD_TRACKING_ID")
    public int getErdTrackingId() {
        return erdTrackingId;
    }

    public void setErdTrackingId(int erdTrackingId) {
        this.erdTrackingId = erdTrackingId;
    }

    @Basic
    @Column(name = "ERD_NBR_OF_GROUP_RECORDS")
    public int getErdNbrOfGroupRecords() {
        return erdNbrOfGroupRecords;
    }

    public void setErdNbrOfGroupRecords(int erdNbrOfGroupRecords) {
        this.erdNbrOfGroupRecords = erdNbrOfGroupRecords;
    }

    @Basic
    @Column(name = "ERD_GROUP_FILE_NAME")
    public String getErdGroupFileName() {
        return erdGroupFileName;
    }

    public void setErdGroupFileName(String erdGroupFileName) {
        this.erdGroupFileName = erdGroupFileName;
    }

    @Basic
    @Column(name = "ERD_GROUP_FILE_LIBRARY")
    public String getErdGroupFileLibrary() {
        return erdGroupFileLibrary;
    }

    public void setErdGroupFileLibrary(String erdGroupFileLibrary) {
        this.erdGroupFileLibrary = erdGroupFileLibrary;
    }

    @Basic
    @Column(name = "ERD_NBR_OF_MEMBER_RECORDS")
    public int getErdNbrOfMemberRecords() {
        return erdNbrOfMemberRecords;
    }

    public void setErdNbrOfMemberRecords(int erdNbrOfMemberRecords) {
        this.erdNbrOfMemberRecords = erdNbrOfMemberRecords;
    }

    @Basic
    @Column(name = "ERD_MEMBER_FILE_NAME")
    public String getErdMemberFileName() {
        return erdMemberFileName;
    }

    public void setErdMemberFileName(String erdMemberFileName) {
        this.erdMemberFileName = erdMemberFileName;
    }

    @Basic
    @Column(name = "ERD_MEMBER_FILE_LIBRARY")
    public String getErdMemberFileLibrary() {
        return erdMemberFileLibrary;
    }

    public void setErdMemberFileLibrary(String erdMemberFileLibrary) {
        this.erdMemberFileLibrary = erdMemberFileLibrary;
    }

    @Basic
    @Column(name = "ERD_SHORT_INSTRUCTION")
    public String getErdShortInstruction() {
        return erdShortInstruction;
    }

    public void setErdShortInstruction(String erdShortInstruction) {
        this.erdShortInstruction = erdShortInstruction;
    }

    @Basic
    @Column(name = "ERD_FUTURE_DATE")
    public Date getErdFutureDate() {
        return erdFutureDate;
    }

    public void setErdFutureDate(Date erdFutureDate) {
        this.erdFutureDate = erdFutureDate;
    }

    @Basic
    @Column(name = "ERD_MEDIA_TYPE")
    public String getErdMediaType() {
        return erdMediaType;
    }

    public void setErdMediaType(String erdMediaType) {
        this.erdMediaType = erdMediaType;
    }

    @Basic
    @Column(name = "ERD_LOAD_TYPE")
    public String getErdLoadType() {
        return erdLoadType;
    }

    public void setErdLoadType(String erdLoadType) {
        this.erdLoadType = erdLoadType;
    }

    @Basic
    @Column(name = "ERD_NOTES")
    public String getErdNotes() {
        return erdNotes;
    }

    public void setErdNotes(String erdNotes) {
        this.erdNotes = erdNotes;
    }

    @Basic
    @Column(name = "ERD_STATUS")
    public String getErdStatus() {
        return erdStatus;
    }

    public void setErdStatus(String erdStatus) {
        this.erdStatus = erdStatus;
    }

    @Basic
    @Column(name = "ERD_FILE_TYPE")
    public String getErdFileType() {
        return erdFileType;
    }

    public void setErdFileType(String erdFileType) {
        this.erdFileType = erdFileType;
    }

    @Basic
    @Column(name = "ERD_EPF_CHANGED_BY")
    public String getErdEpfChangedBy() {
        return erdEpfChangedBy;
    }

    public void setErdEpfChangedBy(String erdEpfChangedBy) {
        this.erdEpfChangedBy = erdEpfChangedBy;
    }

    @Basic
    @Column(name = "ERD_CALC_EXPLICIT_TRM_MBR")
    public String getErdCalcExplicitTrmMbr() {
        return erdCalcExplicitTrmMbr;
    }

    public void setErdCalcExplicitTrmMbr(String erdCalcExplicitTrmMbr) {
        this.erdCalcExplicitTrmMbr = erdCalcExplicitTrmMbr;
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
        ElgEligRequestDetailErd that = (ElgEligRequestDetailErd) o;
        return erdTrackingId == that.erdTrackingId &&
                erdNbrOfGroupRecords == that.erdNbrOfGroupRecords &&
                erdNbrOfMemberRecords == that.erdNbrOfMemberRecords &&
                Objects.equals(carCarrierId, that.carCarrierId) &&
                Objects.equals(accountId, that.accountId) &&
                Objects.equals(groupId, that.groupId) &&
                Objects.equals(erdGroupFileName, that.erdGroupFileName) &&
                Objects.equals(erdGroupFileLibrary, that.erdGroupFileLibrary) &&
                Objects.equals(erdMemberFileName, that.erdMemberFileName) &&
                Objects.equals(erdMemberFileLibrary, that.erdMemberFileLibrary) &&
                Objects.equals(erdShortInstruction, that.erdShortInstruction) &&
                Objects.equals(erdFutureDate, that.erdFutureDate) &&
                Objects.equals(erdMediaType, that.erdMediaType) &&
                Objects.equals(erdLoadType, that.erdLoadType) &&
                Objects.equals(erdNotes, that.erdNotes) &&
                Objects.equals(erdStatus, that.erdStatus) &&
                Objects.equals(erdFileType, that.erdFileType) &&
                Objects.equals(erdEpfChangedBy, that.erdEpfChangedBy) &&
                Objects.equals(erdCalcExplicitTrmMbr, that.erdCalcExplicitTrmMbr) &&
                Objects.equals(addUserName, that.addUserName) &&
                Objects.equals(addDate, that.addDate) &&
                Objects.equals(addTime, that.addTime) &&
                Objects.equals(addProgramName, that.addProgramName) &&
                Objects.equals(chgUserName, that.chgUserName) &&
                Objects.equals(chgDate, that.chgDate) &&
                Objects.equals(chgTime, that.chgTime) &&
                Objects.equals(chgProgramName, that.chgProgramName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carCarrierId, accountId, groupId, erdTrackingId, erdNbrOfGroupRecords, erdGroupFileName, erdGroupFileLibrary, erdNbrOfMemberRecords, erdMemberFileName, erdMemberFileLibrary, erdShortInstruction, erdFutureDate, erdMediaType, erdLoadType, erdNotes, erdStatus, erdFileType, erdEpfChangedBy, erdCalcExplicitTrmMbr, addUserName, addDate, addTime, addProgramName, chgUserName, chgDate, chgTime, chgProgramName);
    }
}
