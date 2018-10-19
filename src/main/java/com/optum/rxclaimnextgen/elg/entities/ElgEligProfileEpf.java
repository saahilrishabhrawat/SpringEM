package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by bkocinsk on 6/14/2018.
 */
@Entity
@Table(name = "ELG_ELIG_PROFILE_EPF")
@IdClass(ElgEligProfileEpfPK.class)
public class ElgEligProfileEpf {
    private String carCarrierId;
    private String accountId;
    private String groupId;
    private String epfLoadIdentifier;
    private String epfLibraryName;
    private String epfStageGroupsInd;
    private String epfLoadType;
    private String epfGroupLoadType;
    private String epfReformatPgm;
    private String epfPostProcessProgram;
    private Integer epfRejection;
    private Integer epfGroupRefreshRej;
    private Integer epfMediaFrequency;
    private String epfMediaType;
    private String epfTapeCharacterCode;
    private String epfDeviceName;
    private String epfMbrFileName;
    private Integer epfMbrMediaRecordLen;
    private Integer epfMbrMediaBlockLen;
    private Integer epfMbrMediaNbrReels;
    private String epfMbrMediaLabels;
    private Integer epfMbrTapeSeqNbr;
    private String epfGrpFileName;
    private Integer epfGrpMediaRecordLen;
    private Integer epfGrpMediaBlockLen;
    private Integer epfGrpMediaNbrReels;
    private String epfGrpMediaLabels;
    private Integer epfGroupTapeSeqNbr;
    private Date epfCurrentStageDt;
    private Integer epfCurrentInput;
    private Integer epfCurrentStaged;
    private Integer epfCurrentLoaded;
    private Integer epfCurrentRejected;
    private Date epfCurrentLoadDate;
    private Date epfPreviousStageDt;
    private Integer epfPreviousInput;
    private Integer epfPreviousStaged;
    private Integer epfPreviousLoaded;
    private Integer epfPreviousRejected;
    private Date epfPreviousLoadDt;
    private Date epfPriorStageDate;
    private Integer epfPriorInput;
    private Integer epfPriorStaged;
    private Integer epfPriorLoaded;
    private Integer epfPriorRejected;
    private Date epfPriorLoadDate;
    private String epfReformatVersion;
    private Integer epfTermNbrOfDays;
    private String epfTermDaysQualifier;
    private String epfStageLoadInProcess;
    private String epfSuspendProcessing;
    private String epfErrorsInLastRun;
    private String epfPrintMbrGrpErrors;
    private String epfIdCard;
    private String epfTermedMembersRpt;
    private String epfTermCareAssignment;
    private String epfGroupListName;
    private Integer epfTermThresholdTba;
    private Integer epfTermThresholdExp;
    private String epfRejectionLookup;
    private String epfStatus;
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
    @Column(name = "EPF_LOAD_IDENTIFIER", nullable = false, length = 9)
    public String getEpfLoadIdentifier() {
        return epfLoadIdentifier;
    }

    public void setEpfLoadIdentifier(String epfLoadIdentifier) {
        this.epfLoadIdentifier = epfLoadIdentifier;
    }

    @Basic
    @Column(name = "EPF_LIBRARY_NAME", nullable = false, length = 10)
    public String getEpfLibraryName() {
        return epfLibraryName;
    }

    public void setEpfLibraryName(String epfLibraryName) {
        this.epfLibraryName = epfLibraryName;
    }

    @Basic
    @Column(name = "EPF_STAGE_GROUPS_IND", nullable = false, length = 1)
    public String getEpfStageGroupsInd() {
        return epfStageGroupsInd;
    }

    public void setEpfStageGroupsInd(String epfStageGroupsInd) {
        this.epfStageGroupsInd = epfStageGroupsInd;
    }

    @Basic
    @Column(name = "EPF_LOAD_TYPE", nullable = false, length = 1)
    public String getEpfLoadType() {
        return epfLoadType;
    }

    public void setEpfLoadType(String epfLoadType) {
        this.epfLoadType = epfLoadType;
    }

    @Basic
    @Column(name = "EPF_GROUP_LOAD_TYPE", nullable = false, length = 1)
    public String getEpfGroupLoadType() {
        return epfGroupLoadType;
    }

    public void setEpfGroupLoadType(String epfGroupLoadType) {
        this.epfGroupLoadType = epfGroupLoadType;
    }

    @Basic
    @Column(name = "EPF_REFORMAT_PGM", nullable = false, length = 10)
    public String getEpfReformatPgm() {
        return epfReformatPgm;
    }

    public void setEpfReformatPgm(String epfReformatPgm) {
        this.epfReformatPgm = epfReformatPgm;
    }

    @Basic
    @Column(name = "EPF_POST_PROCESS_PROGRAM", nullable = false, length = 10)
    public String getEpfPostProcessProgram() {
        return epfPostProcessProgram;
    }

    public void setEpfPostProcessProgram(String epfPostProcessProgram) {
        this.epfPostProcessProgram = epfPostProcessProgram;
    }

    @Basic
    @Column(name = "EPF_REJECTION", nullable = false, precision = 0)
    public Integer getEpfRejection() {
        return epfRejection;
    }

    public void setEpfRejection(Integer epfRejection) {
        this.epfRejection = epfRejection;
    }

    @Basic
    @Column(name = "EPF_GROUP_REFRESH_REJ", nullable = false, precision = 0)
    public Integer getEpfGroupRefreshRej() {
        return epfGroupRefreshRej;
    }

    public void setEpfGroupRefreshRej(Integer epfGroupRefreshRej) {
        this.epfGroupRefreshRej = epfGroupRefreshRej;
    }

    @Basic
    @Column(name = "EPF_MEDIA_FREQUENCY", nullable = false, precision = 0)
    public Integer getEpfMediaFrequency() {
        return epfMediaFrequency;
    }

    public void setEpfMediaFrequency(Integer epfMediaFrequency) {
        this.epfMediaFrequency = epfMediaFrequency;
    }

    @Basic
    @Column(name = "EPF_MEDIA_TYPE", nullable = false, length = 1)
    public String getEpfMediaType() {
        return epfMediaType;
    }

    public void setEpfMediaType(String epfMediaType) {
        this.epfMediaType = epfMediaType;
    }

    @Basic
    @Column(name = "EPF_TAPE_CHARACTER_CODE", nullable = false, length = 1)
    public String getEpfTapeCharacterCode() {
        return epfTapeCharacterCode;
    }

    public void setEpfTapeCharacterCode(String epfTapeCharacterCode) {
        this.epfTapeCharacterCode = epfTapeCharacterCode;
    }

    @Basic
    @Column(name = "EPF_DEVICE_NAME", nullable = false, length = 10)
    public String getEpfDeviceName() {
        return epfDeviceName;
    }

    public void setEpfDeviceName(String epfDeviceName) {
        this.epfDeviceName = epfDeviceName;
    }

    @Basic
    @Column(name = "EPF_MBR_FILE_NAME", nullable = false, length = 10)
    public String getEpfMbrFileName() {
        return epfMbrFileName;
    }

    public void setEpfMbrFileName(String epfMbrFileName) {
        this.epfMbrFileName = epfMbrFileName;
    }

    @Basic
    @Column(name = "EPF_MBR_MEDIA_RECORD_LEN", nullable = false, precision = 0)
    public Integer getEpfMbrMediaRecordLen() {
        return epfMbrMediaRecordLen;
    }

    public void setEpfMbrMediaRecordLen(Integer epfMbrMediaRecordLen) {
        this.epfMbrMediaRecordLen = epfMbrMediaRecordLen;
    }

    @Basic
    @Column(name = "EPF_MBR_MEDIA_BLOCK_LEN", nullable = false, precision = 0)
    public Integer getEpfMbrMediaBlockLen() {
        return epfMbrMediaBlockLen;
    }

    public void setEpfMbrMediaBlockLen(Integer epfMbrMediaBlockLen) {
        this.epfMbrMediaBlockLen = epfMbrMediaBlockLen;
    }

    @Basic
    @Column(name = "EPF_MBR_MEDIA_NBR_REELS", nullable = false, precision = 0)
    public Integer getEpfMbrMediaNbrReels() {
        return epfMbrMediaNbrReels;
    }

    public void setEpfMbrMediaNbrReels(Integer epfMbrMediaNbrReels) {
        this.epfMbrMediaNbrReels = epfMbrMediaNbrReels;
    }

    @Basic
    @Column(name = "EPF_MBR_MEDIA_LABELS", nullable = false, length = 1)
    public String getEpfMbrMediaLabels() {
        return epfMbrMediaLabels;
    }

    public void setEpfMbrMediaLabels(String epfMbrMediaLabels) {
        this.epfMbrMediaLabels = epfMbrMediaLabels;
    }

    @Basic
    @Column(name = "EPF_MBR_TAPE_SEQ_NBR", nullable = false, precision = 0)
    public Integer getEpfMbrTapeSeqNbr() {
        return epfMbrTapeSeqNbr;
    }

    public void setEpfMbrTapeSeqNbr(Integer epfMbrTapeSeqNbr) {
        this.epfMbrTapeSeqNbr = epfMbrTapeSeqNbr;
    }

    @Basic
    @Column(name = "EPF_GRP_FILE_NAME", nullable = false, length = 10)
    public String getEpfGrpFileName() {
        return epfGrpFileName;
    }

    public void setEpfGrpFileName(String epfGrpFileName) {
        this.epfGrpFileName = epfGrpFileName;
    }

    @Basic
    @Column(name = "EPF_GRP_MEDIA_RECORD_LEN", nullable = false, precision = 0)
    public Integer getEpfGrpMediaRecordLen() {
        return epfGrpMediaRecordLen;
    }

    public void setEpfGrpMediaRecordLen(Integer epfGrpMediaRecordLen) {
        this.epfGrpMediaRecordLen = epfGrpMediaRecordLen;
    }

    @Basic
    @Column(name = "EPF_GRP_MEDIA_BLOCK_LEN", nullable = false, precision = 0)
    public Integer getEpfGrpMediaBlockLen() {
        return epfGrpMediaBlockLen;
    }

    public void setEpfGrpMediaBlockLen(Integer epfGrpMediaBlockLen) {
        this.epfGrpMediaBlockLen = epfGrpMediaBlockLen;
    }

    @Basic
    @Column(name = "EPF_GRP_MEDIA_NBR_REELS", nullable = false, precision = 0)
    public Integer getEpfGrpMediaNbrReels() {
        return epfGrpMediaNbrReels;
    }

    public void setEpfGrpMediaNbrReels(Integer epfGrpMediaNbrReels) {
        this.epfGrpMediaNbrReels = epfGrpMediaNbrReels;
    }

    @Basic
    @Column(name = "EPF_GRP_MEDIA_LABELS", nullable = false, length = 1)
    public String getEpfGrpMediaLabels() {
        return epfGrpMediaLabels;
    }

    public void setEpfGrpMediaLabels(String epfGrpMediaLabels) {
        this.epfGrpMediaLabels = epfGrpMediaLabels;
    }

    @Basic
    @Column(name = "EPF_GROUP_TAPE_SEQ_NBR", nullable = false, precision = 0)
    public Integer getEpfGroupTapeSeqNbr() {
        return epfGroupTapeSeqNbr;
    }

    public void setEpfGroupTapeSeqNbr(Integer epfGroupTapeSeqNbr) {
        this.epfGroupTapeSeqNbr = epfGroupTapeSeqNbr;
    }

    @Basic
    @Column(name = "EPF_CURRENT_STAGE_DT", nullable = false)
    public Date getEpfCurrentStageDt() {
        return epfCurrentStageDt;
    }

    public void setEpfCurrentStageDt(Date epfCurrentStageDt) {
        this.epfCurrentStageDt = epfCurrentStageDt;
    }

    @Basic
    @Column(name = "EPF_CURRENT_INPUT", nullable = false, precision = 0)
    public Integer getEpfCurrentInput() {
        return epfCurrentInput;
    }

    public void setEpfCurrentInput(Integer epfCurrentInput) {
        this.epfCurrentInput = epfCurrentInput;
    }

    @Basic
    @Column(name = "EPF_CURRENT_STAGED", nullable = false, precision = 0)
    public Integer getEpfCurrentStaged() {
        return epfCurrentStaged;
    }

    public void setEpfCurrentStaged(Integer epfCurrentStaged) {
        this.epfCurrentStaged = epfCurrentStaged;
    }

    @Basic
    @Column(name = "EPF_CURRENT_LOADED", nullable = false, precision = 0)
    public Integer getEpfCurrentLoaded() {
        return epfCurrentLoaded;
    }

    public void setEpfCurrentLoaded(Integer epfCurrentLoaded) {
        this.epfCurrentLoaded = epfCurrentLoaded;
    }

    @Basic
    @Column(name = "EPF_CURRENT_REJECTED", nullable = false, precision = 0)
    public Integer getEpfCurrentRejected() {
        return epfCurrentRejected;
    }

    public void setEpfCurrentRejected(Integer epfCurrentRejected) {
        this.epfCurrentRejected = epfCurrentRejected;
    }

    @Basic
    @Column(name = "EPF_CURRENT_LOAD_DATE", nullable = false)
    public Date getEpfCurrentLoadDate() {
        return epfCurrentLoadDate;
    }

    public void setEpfCurrentLoadDate(Date epfCurrentLoadDate) {
        this.epfCurrentLoadDate = epfCurrentLoadDate;
    }

    @Basic
    @Column(name = "EPF_PREVIOUS_STAGE_DT", nullable = false)
    public Date getEpfPreviousStageDt() {
        return epfPreviousStageDt;
    }

    public void setEpfPreviousStageDt(Date epfPreviousStageDt) {
        this.epfPreviousStageDt = epfPreviousStageDt;
    }

    @Basic
    @Column(name = "EPF_PREVIOUS_INPUT", nullable = false, precision = 0)
    public Integer getEpfPreviousInput() {
        return epfPreviousInput;
    }

    public void setEpfPreviousInput(Integer epfPreviousInput) {
        this.epfPreviousInput = epfPreviousInput;
    }

    @Basic
    @Column(name = "EPF_PREVIOUS_STAGED", nullable = false, precision = 0)
    public Integer getEpfPreviousStaged() {
        return epfPreviousStaged;
    }

    public void setEpfPreviousStaged(Integer epfPreviousStaged) {
        this.epfPreviousStaged = epfPreviousStaged;
    }

    @Basic
    @Column(name = "EPF_PREVIOUS_LOADED", nullable = false, precision = 0)
    public Integer getEpfPreviousLoaded() {
        return epfPreviousLoaded;
    }

    public void setEpfPreviousLoaded(Integer epfPreviousLoaded) {
        this.epfPreviousLoaded = epfPreviousLoaded;
    }

    @Basic
    @Column(name = "EPF_PREVIOUS_REJECTED", nullable = false, precision = 0)
    public Integer getEpfPreviousRejected() {
        return epfPreviousRejected;
    }

    public void setEpfPreviousRejected(Integer epfPreviousRejected) {
        this.epfPreviousRejected = epfPreviousRejected;
    }

    @Basic
    @Column(name = "EPF_PREVIOUS_LOAD_DT", nullable = false)
    public Date getEpfPreviousLoadDt() {
        return epfPreviousLoadDt;
    }

    public void setEpfPreviousLoadDt(Date epfPreviousLoadDt) {
        this.epfPreviousLoadDt = epfPreviousLoadDt;
    }

    @Basic
    @Column(name = "EPF_PRIOR_STAGE_DATE", nullable = false)
    public Date getEpfPriorStageDate() {
        return epfPriorStageDate;
    }

    public void setEpfPriorStageDate(Date epfPriorStageDate) {
        this.epfPriorStageDate = epfPriorStageDate;
    }

    @Basic
    @Column(name = "EPF_PRIOR_INPUT", nullable = false, precision = 0)
    public Integer getEpfPriorInput() {
        return epfPriorInput;
    }

    public void setEpfPriorInput(Integer epfPriorInput) {
        this.epfPriorInput = epfPriorInput;
    }

    @Basic
    @Column(name = "EPF_PRIOR_STAGED", nullable = false, precision = 0)
    public Integer getEpfPriorStaged() {
        return epfPriorStaged;
    }

    public void setEpfPriorStaged(Integer epfPriorStaged) {
        this.epfPriorStaged = epfPriorStaged;
    }

    @Basic
    @Column(name = "EPF_PRIOR_LOADED", nullable = false, precision = 0)
    public Integer getEpfPriorLoaded() {
        return epfPriorLoaded;
    }

    public void setEpfPriorLoaded(Integer epfPriorLoaded) {
        this.epfPriorLoaded = epfPriorLoaded;
    }

    @Basic
    @Column(name = "EPF_PRIOR_REJECTED", nullable = false, precision = 0)
    public Integer getEpfPriorRejected() {
        return epfPriorRejected;
    }

    public void setEpfPriorRejected(Integer epfPriorRejected) {
        this.epfPriorRejected = epfPriorRejected;
    }

    @Basic
    @Column(name = "EPF_PRIOR_LOAD_DATE", nullable = false)
    public Date getEpfPriorLoadDate() {
        return epfPriorLoadDate;
    }

    public void setEpfPriorLoadDate(Date epfPriorLoadDate) {
        this.epfPriorLoadDate = epfPriorLoadDate;
    }

    @Basic
    @Column(name = "EPF_REFORMAT_VERSION", nullable = false, length = 3)
    public String getEpfReformatVersion() {
        return epfReformatVersion;
    }

    public void setEpfReformatVersion(String epfReformatVersion) {
        this.epfReformatVersion = epfReformatVersion;
    }

    @Basic
    @Column(name = "EPF_TERM_NBR_OF_DAYS", nullable = false, precision = 0)
    public Integer getEpfTermNbrOfDays() {
        return epfTermNbrOfDays;
    }

    public void setEpfTermNbrOfDays(Integer epfTermNbrOfDays) {
        this.epfTermNbrOfDays = epfTermNbrOfDays;
    }

    @Basic
    @Column(name = "EPF_TERM_DAYS_QUALIFIER", nullable = false, length = 1)
    public String getEpfTermDaysQualifier() {
        return epfTermDaysQualifier;
    }

    public void setEpfTermDaysQualifier(String epfTermDaysQualifier) {
        this.epfTermDaysQualifier = epfTermDaysQualifier;
    }

    @Basic
    @Column(name = "EPF_STAGE_LOAD_IN_PROCESS", nullable = false, length = 1)
    public String getEpfStageLoadInProcess() {
        return epfStageLoadInProcess;
    }

    public void setEpfStageLoadInProcess(String epfStageLoadInProcess) {
        this.epfStageLoadInProcess = epfStageLoadInProcess;
    }

    @Basic
    @Column(name = "EPF_SUSPEND_PROCESSING", nullable = false, length = 1)
    public String getEpfSuspendProcessing() {
        return epfSuspendProcessing;
    }

    public void setEpfSuspendProcessing(String epfSuspendProcessing) {
        this.epfSuspendProcessing = epfSuspendProcessing;
    }

    @Basic
    @Column(name = "EPF_ERRORS_IN_LAST_RUN", nullable = false, length = 1)
    public String getEpfErrorsInLastRun() {
        return epfErrorsInLastRun;
    }

    public void setEpfErrorsInLastRun(String epfErrorsInLastRun) {
        this.epfErrorsInLastRun = epfErrorsInLastRun;
    }

    @Basic
    @Column(name = "EPF_PRINT_MBR_GRP_ERRORS", nullable = false, length = 1)
    public String getEpfPrintMbrGrpErrors() {
        return epfPrintMbrGrpErrors;
    }

    public void setEpfPrintMbrGrpErrors(String epfPrintMbrGrpErrors) {
        this.epfPrintMbrGrpErrors = epfPrintMbrGrpErrors;
    }

    @Basic
    @Column(name = "EPF_ID_CARD", nullable = false, length = 1)
    public String getEpfIdCard() {
        return epfIdCard;
    }

    public void setEpfIdCard(String epfIdCard) {
        this.epfIdCard = epfIdCard;
    }

    @Basic
    @Column(name = "EPF_TERMED_MEMBERS_RPT", nullable = false, length = 1)
    public String getEpfTermedMembersRpt() {
        return epfTermedMembersRpt;
    }

    public void setEpfTermedMembersRpt(String epfTermedMembersRpt) {
        this.epfTermedMembersRpt = epfTermedMembersRpt;
    }

    @Basic
    @Column(name = "EPF_TERM_CARE_ASSIGNMENT", nullable = false, length = 1)
    public String getEpfTermCareAssignment() {
        return epfTermCareAssignment;
    }

    public void setEpfTermCareAssignment(String epfTermCareAssignment) {
        this.epfTermCareAssignment = epfTermCareAssignment;
    }

    @Basic
    @Column(name = "EPF_GROUP_LIST_NAME", nullable = false, length = 10)
    public String getEpfGroupListName() {
        return epfGroupListName;
    }

    public void setEpfGroupListName(String epfGroupListName) {
        this.epfGroupListName = epfGroupListName;
    }

    @Basic
    @Column(name = "EPF_TERM_THRESHOLD_TBA", nullable = false, precision = 0)
    public Integer getEpfTermThresholdTba() {
        return epfTermThresholdTba;
    }

    public void setEpfTermThresholdTba(Integer epfTermThresholdTba) {
        this.epfTermThresholdTba = epfTermThresholdTba;
    }

    @Basic
    @Column(name = "EPF_TERM_THRESHOLD_EXP", nullable = false, precision = 0)
    public Integer getEpfTermThresholdExp() {
        return epfTermThresholdExp;
    }

    public void setEpfTermThresholdExp(Integer epfTermThresholdExp) {
        this.epfTermThresholdExp = epfTermThresholdExp;
    }

    @Basic
    @Column(name = "EPF_REJECTION_LOOKUP", nullable = false, length = 1)
    public String getEpfRejectionLookup() {
        return epfRejectionLookup;
    }

    public void setEpfRejectionLookup(String epfRejectionLookup) {
        this.epfRejectionLookup = epfRejectionLookup;
    }

    @Basic
    @Column(name = "EPF_STATUS", nullable = false, length = 1)
    public String getEpfStatus() {
        return epfStatus;
    }

    public void setEpfStatus(String epfStatus) {
        this.epfStatus = epfStatus;
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

        ElgEligProfileEpf that = (ElgEligProfileEpf) o;

        if (carCarrierId != null ? !carCarrierId.equals(that.carCarrierId) : that.carCarrierId != null) return false;
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        if (epfLoadIdentifier != null ? !epfLoadIdentifier.equals(that.epfLoadIdentifier) : that.epfLoadIdentifier != null)
            return false;
        if (epfLibraryName != null ? !epfLibraryName.equals(that.epfLibraryName) : that.epfLibraryName != null)
            return false;
        if (epfStageGroupsInd != null ? !epfStageGroupsInd.equals(that.epfStageGroupsInd) : that.epfStageGroupsInd != null)
            return false;
        if (epfLoadType != null ? !epfLoadType.equals(that.epfLoadType) : that.epfLoadType != null) return false;
        if (epfGroupLoadType != null ? !epfGroupLoadType.equals(that.epfGroupLoadType) : that.epfGroupLoadType != null)
            return false;
        if (epfReformatPgm != null ? !epfReformatPgm.equals(that.epfReformatPgm) : that.epfReformatPgm != null)
            return false;
        if (epfPostProcessProgram != null ? !epfPostProcessProgram.equals(that.epfPostProcessProgram) : that.epfPostProcessProgram != null)
            return false;
        if (epfRejection != null ? !epfRejection.equals(that.epfRejection) : that.epfRejection != null) return false;
        if (epfGroupRefreshRej != null ? !epfGroupRefreshRej.equals(that.epfGroupRefreshRej) : that.epfGroupRefreshRej != null)
            return false;
        if (epfMediaFrequency != null ? !epfMediaFrequency.equals(that.epfMediaFrequency) : that.epfMediaFrequency != null)
            return false;
        if (epfMediaType != null ? !epfMediaType.equals(that.epfMediaType) : that.epfMediaType != null) return false;
        if (epfTapeCharacterCode != null ? !epfTapeCharacterCode.equals(that.epfTapeCharacterCode) : that.epfTapeCharacterCode != null)
            return false;
        if (epfDeviceName != null ? !epfDeviceName.equals(that.epfDeviceName) : that.epfDeviceName != null)
            return false;
        if (epfMbrFileName != null ? !epfMbrFileName.equals(that.epfMbrFileName) : that.epfMbrFileName != null)
            return false;
        if (epfMbrMediaRecordLen != null ? !epfMbrMediaRecordLen.equals(that.epfMbrMediaRecordLen) : that.epfMbrMediaRecordLen != null)
            return false;
        if (epfMbrMediaBlockLen != null ? !epfMbrMediaBlockLen.equals(that.epfMbrMediaBlockLen) : that.epfMbrMediaBlockLen != null)
            return false;
        if (epfMbrMediaNbrReels != null ? !epfMbrMediaNbrReels.equals(that.epfMbrMediaNbrReels) : that.epfMbrMediaNbrReels != null)
            return false;
        if (epfMbrMediaLabels != null ? !epfMbrMediaLabels.equals(that.epfMbrMediaLabels) : that.epfMbrMediaLabels != null)
            return false;
        if (epfMbrTapeSeqNbr != null ? !epfMbrTapeSeqNbr.equals(that.epfMbrTapeSeqNbr) : that.epfMbrTapeSeqNbr != null)
            return false;
        if (epfGrpFileName != null ? !epfGrpFileName.equals(that.epfGrpFileName) : that.epfGrpFileName != null)
            return false;
        if (epfGrpMediaRecordLen != null ? !epfGrpMediaRecordLen.equals(that.epfGrpMediaRecordLen) : that.epfGrpMediaRecordLen != null)
            return false;
        if (epfGrpMediaBlockLen != null ? !epfGrpMediaBlockLen.equals(that.epfGrpMediaBlockLen) : that.epfGrpMediaBlockLen != null)
            return false;
        if (epfGrpMediaNbrReels != null ? !epfGrpMediaNbrReels.equals(that.epfGrpMediaNbrReels) : that.epfGrpMediaNbrReels != null)
            return false;
        if (epfGrpMediaLabels != null ? !epfGrpMediaLabels.equals(that.epfGrpMediaLabels) : that.epfGrpMediaLabels != null)
            return false;
        if (epfGroupTapeSeqNbr != null ? !epfGroupTapeSeqNbr.equals(that.epfGroupTapeSeqNbr) : that.epfGroupTapeSeqNbr != null)
            return false;
        if (epfCurrentStageDt != null ? !epfCurrentStageDt.equals(that.epfCurrentStageDt) : that.epfCurrentStageDt != null)
            return false;
        if (epfCurrentInput != null ? !epfCurrentInput.equals(that.epfCurrentInput) : that.epfCurrentInput != null)
            return false;
        if (epfCurrentStaged != null ? !epfCurrentStaged.equals(that.epfCurrentStaged) : that.epfCurrentStaged != null)
            return false;
        if (epfCurrentLoaded != null ? !epfCurrentLoaded.equals(that.epfCurrentLoaded) : that.epfCurrentLoaded != null)
            return false;
        if (epfCurrentRejected != null ? !epfCurrentRejected.equals(that.epfCurrentRejected) : that.epfCurrentRejected != null)
            return false;
        if (epfCurrentLoadDate != null ? !epfCurrentLoadDate.equals(that.epfCurrentLoadDate) : that.epfCurrentLoadDate != null)
            return false;
        if (epfPreviousStageDt != null ? !epfPreviousStageDt.equals(that.epfPreviousStageDt) : that.epfPreviousStageDt != null)
            return false;
        if (epfPreviousInput != null ? !epfPreviousInput.equals(that.epfPreviousInput) : that.epfPreviousInput != null)
            return false;
        if (epfPreviousStaged != null ? !epfPreviousStaged.equals(that.epfPreviousStaged) : that.epfPreviousStaged != null)
            return false;
        if (epfPreviousLoaded != null ? !epfPreviousLoaded.equals(that.epfPreviousLoaded) : that.epfPreviousLoaded != null)
            return false;
        if (epfPreviousRejected != null ? !epfPreviousRejected.equals(that.epfPreviousRejected) : that.epfPreviousRejected != null)
            return false;
        if (epfPreviousLoadDt != null ? !epfPreviousLoadDt.equals(that.epfPreviousLoadDt) : that.epfPreviousLoadDt != null)
            return false;
        if (epfPriorStageDate != null ? !epfPriorStageDate.equals(that.epfPriorStageDate) : that.epfPriorStageDate != null)
            return false;
        if (epfPriorInput != null ? !epfPriorInput.equals(that.epfPriorInput) : that.epfPriorInput != null)
            return false;
        if (epfPriorStaged != null ? !epfPriorStaged.equals(that.epfPriorStaged) : that.epfPriorStaged != null)
            return false;
        if (epfPriorLoaded != null ? !epfPriorLoaded.equals(that.epfPriorLoaded) : that.epfPriorLoaded != null)
            return false;
        if (epfPriorRejected != null ? !epfPriorRejected.equals(that.epfPriorRejected) : that.epfPriorRejected != null)
            return false;
        if (epfPriorLoadDate != null ? !epfPriorLoadDate.equals(that.epfPriorLoadDate) : that.epfPriorLoadDate != null)
            return false;
        if (epfReformatVersion != null ? !epfReformatVersion.equals(that.epfReformatVersion) : that.epfReformatVersion != null)
            return false;
        if (epfTermNbrOfDays != null ? !epfTermNbrOfDays.equals(that.epfTermNbrOfDays) : that.epfTermNbrOfDays != null)
            return false;
        if (epfTermDaysQualifier != null ? !epfTermDaysQualifier.equals(that.epfTermDaysQualifier) : that.epfTermDaysQualifier != null)
            return false;
        if (epfStageLoadInProcess != null ? !epfStageLoadInProcess.equals(that.epfStageLoadInProcess) : that.epfStageLoadInProcess != null)
            return false;
        if (epfSuspendProcessing != null ? !epfSuspendProcessing.equals(that.epfSuspendProcessing) : that.epfSuspendProcessing != null)
            return false;
        if (epfErrorsInLastRun != null ? !epfErrorsInLastRun.equals(that.epfErrorsInLastRun) : that.epfErrorsInLastRun != null)
            return false;
        if (epfPrintMbrGrpErrors != null ? !epfPrintMbrGrpErrors.equals(that.epfPrintMbrGrpErrors) : that.epfPrintMbrGrpErrors != null)
            return false;
        if (epfIdCard != null ? !epfIdCard.equals(that.epfIdCard) : that.epfIdCard != null) return false;
        if (epfTermedMembersRpt != null ? !epfTermedMembersRpt.equals(that.epfTermedMembersRpt) : that.epfTermedMembersRpt != null)
            return false;
        if (epfTermCareAssignment != null ? !epfTermCareAssignment.equals(that.epfTermCareAssignment) : that.epfTermCareAssignment != null)
            return false;
        if (epfGroupListName != null ? !epfGroupListName.equals(that.epfGroupListName) : that.epfGroupListName != null)
            return false;
        if (epfTermThresholdTba != null ? !epfTermThresholdTba.equals(that.epfTermThresholdTba) : that.epfTermThresholdTba != null)
            return false;
        if (epfTermThresholdExp != null ? !epfTermThresholdExp.equals(that.epfTermThresholdExp) : that.epfTermThresholdExp != null)
            return false;
        if (epfRejectionLookup != null ? !epfRejectionLookup.equals(that.epfRejectionLookup) : that.epfRejectionLookup != null)
            return false;
        if (epfStatus != null ? !epfStatus.equals(that.epfStatus) : that.epfStatus != null) return false;
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
        result = 31 * result + (epfLoadIdentifier != null ? epfLoadIdentifier.hashCode() : 0);
        result = 31 * result + (epfLibraryName != null ? epfLibraryName.hashCode() : 0);
        result = 31 * result + (epfStageGroupsInd != null ? epfStageGroupsInd.hashCode() : 0);
        result = 31 * result + (epfLoadType != null ? epfLoadType.hashCode() : 0);
        result = 31 * result + (epfGroupLoadType != null ? epfGroupLoadType.hashCode() : 0);
        result = 31 * result + (epfReformatPgm != null ? epfReformatPgm.hashCode() : 0);
        result = 31 * result + (epfPostProcessProgram != null ? epfPostProcessProgram.hashCode() : 0);
        result = 31 * result + (epfRejection != null ? epfRejection.hashCode() : 0);
        result = 31 * result + (epfGroupRefreshRej != null ? epfGroupRefreshRej.hashCode() : 0);
        result = 31 * result + (epfMediaFrequency != null ? epfMediaFrequency.hashCode() : 0);
        result = 31 * result + (epfMediaType != null ? epfMediaType.hashCode() : 0);
        result = 31 * result + (epfTapeCharacterCode != null ? epfTapeCharacterCode.hashCode() : 0);
        result = 31 * result + (epfDeviceName != null ? epfDeviceName.hashCode() : 0);
        result = 31 * result + (epfMbrFileName != null ? epfMbrFileName.hashCode() : 0);
        result = 31 * result + (epfMbrMediaRecordLen != null ? epfMbrMediaRecordLen.hashCode() : 0);
        result = 31 * result + (epfMbrMediaBlockLen != null ? epfMbrMediaBlockLen.hashCode() : 0);
        result = 31 * result + (epfMbrMediaNbrReels != null ? epfMbrMediaNbrReels.hashCode() : 0);
        result = 31 * result + (epfMbrMediaLabels != null ? epfMbrMediaLabels.hashCode() : 0);
        result = 31 * result + (epfMbrTapeSeqNbr != null ? epfMbrTapeSeqNbr.hashCode() : 0);
        result = 31 * result + (epfGrpFileName != null ? epfGrpFileName.hashCode() : 0);
        result = 31 * result + (epfGrpMediaRecordLen != null ? epfGrpMediaRecordLen.hashCode() : 0);
        result = 31 * result + (epfGrpMediaBlockLen != null ? epfGrpMediaBlockLen.hashCode() : 0);
        result = 31 * result + (epfGrpMediaNbrReels != null ? epfGrpMediaNbrReels.hashCode() : 0);
        result = 31 * result + (epfGrpMediaLabels != null ? epfGrpMediaLabels.hashCode() : 0);
        result = 31 * result + (epfGroupTapeSeqNbr != null ? epfGroupTapeSeqNbr.hashCode() : 0);
        result = 31 * result + (epfCurrentStageDt != null ? epfCurrentStageDt.hashCode() : 0);
        result = 31 * result + (epfCurrentInput != null ? epfCurrentInput.hashCode() : 0);
        result = 31 * result + (epfCurrentStaged != null ? epfCurrentStaged.hashCode() : 0);
        result = 31 * result + (epfCurrentLoaded != null ? epfCurrentLoaded.hashCode() : 0);
        result = 31 * result + (epfCurrentRejected != null ? epfCurrentRejected.hashCode() : 0);
        result = 31 * result + (epfCurrentLoadDate != null ? epfCurrentLoadDate.hashCode() : 0);
        result = 31 * result + (epfPreviousStageDt != null ? epfPreviousStageDt.hashCode() : 0);
        result = 31 * result + (epfPreviousInput != null ? epfPreviousInput.hashCode() : 0);
        result = 31 * result + (epfPreviousStaged != null ? epfPreviousStaged.hashCode() : 0);
        result = 31 * result + (epfPreviousLoaded != null ? epfPreviousLoaded.hashCode() : 0);
        result = 31 * result + (epfPreviousRejected != null ? epfPreviousRejected.hashCode() : 0);
        result = 31 * result + (epfPreviousLoadDt != null ? epfPreviousLoadDt.hashCode() : 0);
        result = 31 * result + (epfPriorStageDate != null ? epfPriorStageDate.hashCode() : 0);
        result = 31 * result + (epfPriorInput != null ? epfPriorInput.hashCode() : 0);
        result = 31 * result + (epfPriorStaged != null ? epfPriorStaged.hashCode() : 0);
        result = 31 * result + (epfPriorLoaded != null ? epfPriorLoaded.hashCode() : 0);
        result = 31 * result + (epfPriorRejected != null ? epfPriorRejected.hashCode() : 0);
        result = 31 * result + (epfPriorLoadDate != null ? epfPriorLoadDate.hashCode() : 0);
        result = 31 * result + (epfReformatVersion != null ? epfReformatVersion.hashCode() : 0);
        result = 31 * result + (epfTermNbrOfDays != null ? epfTermNbrOfDays.hashCode() : 0);
        result = 31 * result + (epfTermDaysQualifier != null ? epfTermDaysQualifier.hashCode() : 0);
        result = 31 * result + (epfStageLoadInProcess != null ? epfStageLoadInProcess.hashCode() : 0);
        result = 31 * result + (epfSuspendProcessing != null ? epfSuspendProcessing.hashCode() : 0);
        result = 31 * result + (epfErrorsInLastRun != null ? epfErrorsInLastRun.hashCode() : 0);
        result = 31 * result + (epfPrintMbrGrpErrors != null ? epfPrintMbrGrpErrors.hashCode() : 0);
        result = 31 * result + (epfIdCard != null ? epfIdCard.hashCode() : 0);
        result = 31 * result + (epfTermedMembersRpt != null ? epfTermedMembersRpt.hashCode() : 0);
        result = 31 * result + (epfTermCareAssignment != null ? epfTermCareAssignment.hashCode() : 0);
        result = 31 * result + (epfGroupListName != null ? epfGroupListName.hashCode() : 0);
        result = 31 * result + (epfTermThresholdTba != null ? epfTermThresholdTba.hashCode() : 0);
        result = 31 * result + (epfTermThresholdExp != null ? epfTermThresholdExp.hashCode() : 0);
        result = 31 * result + (epfRejectionLookup != null ? epfRejectionLookup.hashCode() : 0);
        result = 31 * result + (epfStatus != null ? epfStatus.hashCode() : 0);
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
        return "ElgEligProfileEpf{" +
                "carCarrierId='" + carCarrierId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", epfLoadIdentifier='" + epfLoadIdentifier + '\'' +
                ", epfLibraryName='" + epfLibraryName + '\'' +
                ", epfStageGroupsInd='" + epfStageGroupsInd + '\'' +
                ", epfLoadType='" + epfLoadType + '\'' +
                ", epfGroupLoadType='" + epfGroupLoadType + '\'' +
                ", epfReformatPgm='" + epfReformatPgm + '\'' +
                ", epfPostProcessProgram='" + epfPostProcessProgram + '\'' +
                ", epfRejection=" + epfRejection +
                ", epfGroupRefreshRej=" + epfGroupRefreshRej +
                ", epfMediaFrequency=" + epfMediaFrequency +
                ", epfMediaType='" + epfMediaType + '\'' +
                ", epfTapeCharacterCode='" + epfTapeCharacterCode + '\'' +
                ", epfDeviceName='" + epfDeviceName + '\'' +
                ", epfMbrFileName='" + epfMbrFileName + '\'' +
                ", epfMbrMediaRecordLen=" + epfMbrMediaRecordLen +
                ", epfMbrMediaBlockLen=" + epfMbrMediaBlockLen +
                ", epfMbrMediaNbrReels=" + epfMbrMediaNbrReels +
                ", epfMbrMediaLabels='" + epfMbrMediaLabels + '\'' +
                ", epfMbrTapeSeqNbr=" + epfMbrTapeSeqNbr +
                ", epfGrpFileName='" + epfGrpFileName + '\'' +
                ", epfGrpMediaRecordLen=" + epfGrpMediaRecordLen +
                ", epfGrpMediaBlockLen=" + epfGrpMediaBlockLen +
                ", epfGrpMediaNbrReels=" + epfGrpMediaNbrReels +
                ", epfGrpMediaLabels='" + epfGrpMediaLabels + '\'' +
                ", epfGroupTapeSeqNbr=" + epfGroupTapeSeqNbr +
                ", epfCurrentStageDt=" + epfCurrentStageDt +
                ", epfCurrentInput=" + epfCurrentInput +
                ", epfCurrentStaged=" + epfCurrentStaged +
                ", epfCurrentLoaded=" + epfCurrentLoaded +
                ", epfCurrentRejected=" + epfCurrentRejected +
                ", epfCurrentLoadDate=" + epfCurrentLoadDate +
                ", epfPreviousStageDt=" + epfPreviousStageDt +
                ", epfPreviousInput=" + epfPreviousInput +
                ", epfPreviousStaged=" + epfPreviousStaged +
                ", epfPreviousLoaded=" + epfPreviousLoaded +
                ", epfPreviousRejected=" + epfPreviousRejected +
                ", epfPreviousLoadDt=" + epfPreviousLoadDt +
                ", epfPriorStageDate=" + epfPriorStageDate +
                ", epfPriorInput=" + epfPriorInput +
                ", epfPriorStaged=" + epfPriorStaged +
                ", epfPriorLoaded=" + epfPriorLoaded +
                ", epfPriorRejected=" + epfPriorRejected +
                ", epfPriorLoadDate=" + epfPriorLoadDate +
                ", epfReformatVersion='" + epfReformatVersion + '\'' +
                ", epfTermNbrOfDays=" + epfTermNbrOfDays +
                ", epfTermDaysQualifier='" + epfTermDaysQualifier + '\'' +
                ", epfStageLoadInProcess='" + epfStageLoadInProcess + '\'' +
                ", epfSuspendProcessing='" + epfSuspendProcessing + '\'' +
                ", epfErrorsInLastRun='" + epfErrorsInLastRun + '\'' +
                ", epfPrintMbrGrpErrors='" + epfPrintMbrGrpErrors + '\'' +
                ", epfIdCard='" + epfIdCard + '\'' +
                ", epfTermedMembersRpt='" + epfTermedMembersRpt + '\'' +
                ", epfTermCareAssignment='" + epfTermCareAssignment + '\'' +
                ", epfGroupListName='" + epfGroupListName + '\'' +
                ", epfTermThresholdTba=" + epfTermThresholdTba +
                ", epfTermThresholdExp=" + epfTermThresholdExp +
                ", epfRejectionLookup='" + epfRejectionLookup + '\'' +
                ", epfStatus='" + epfStatus + '\'' +
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
