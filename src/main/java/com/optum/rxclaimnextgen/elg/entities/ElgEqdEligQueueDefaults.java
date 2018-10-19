package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;

import org.apache.commons.lang3.StringUtils;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by bkocinsk on 7/23/2018.
 */
@Entity
@Table(name = "ELG_EQD_ELIG_QUEUE_DEFAULTS")
@IdClass(ElgEqdEligQueueDefaultsPK.class)
public class ElgEqdEligQueueDefaults {
    private String carCarrierId;
    private String eqdAccountId;
    private String eqdGroupId;
    private String eqdReportName;
    private String eqdOutputQueueLibrary;
    private String eqdOutputQueueName;
    private BigInteger eqdNumberOfCopies;
    private String eqdSaveSpoolFile;
    private String eqdHoldSpoolFile;
    private String eqdSpoolFileName;
    private String eqdFormType;
    private String eqdDistributionUserId;
    private String eqdSystemId;
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
    @Column(name = "EQD_ACCOUNT_ID")
    public String getEqdAccountId() {
        return eqdAccountId;
    }

    public void setEqdAccountId(String eqdAccountId) {
        this.eqdAccountId = eqdAccountId;
    }

    @Id
    @Column(name = "EQD_GROUP_ID")
    public String getEqdGroupId() {
        return eqdGroupId;
    }

    public void setEqdGroupId(String eqdGroupId) {
        this.eqdGroupId = eqdGroupId;
    }

    @Id
    @Column(name = "EQD_REPORT_NAME")
    public String getEqdReportName() {
        return eqdReportName;
    }

    public void setEqdReportName(String eqdReportName) {
        this.eqdReportName = eqdReportName;
    }

    @Basic
    @Column(name = "EQD_OUTPUT_QUEUE_LIBRARY")
    public String getEqdOutputQueueLibrary() {
        return eqdOutputQueueLibrary;
    }

    public void setEqdOutputQueueLibrary(String eqdOutputQueueLibrary) {
        this.eqdOutputQueueLibrary = StringUtils.trim(eqdOutputQueueLibrary);
    }

    @Basic
    @Column(name = "EQD_OUTPUT_QUEUE_NAME")
    public String getEqdOutputQueueName() {
        return eqdOutputQueueName;
    }

    public void setEqdOutputQueueName(String eqdOutputQueueName) {
        this.eqdOutputQueueName = StringUtils.trim(eqdOutputQueueName);
    }

    @Basic
    @Column(name = "EQD_NUMBER_OF_COPIES")
    public BigInteger getEqdNumberOfCopies() {
        return eqdNumberOfCopies;
    }

    public void setEqdNumberOfCopies(BigInteger eqdNumberOfCopies) {
        this.eqdNumberOfCopies = eqdNumberOfCopies;
    }

    @Basic
    @Column(name = "EQD_SAVE_SPOOL_FILE_")
    public String getEqdSaveSpoolFile() {
        return eqdSaveSpoolFile;
    }

    public void setEqdSaveSpoolFile(String eqdSaveSpoolFile) {
        this.eqdSaveSpoolFile = StringUtils.trim(eqdSaveSpoolFile);
    }

    @Basic
    @Column(name = "EQD_HOLD_SPOOL_FILE_")
    public String getEqdHoldSpoolFile() {
        return eqdHoldSpoolFile;
    }

    public void setEqdHoldSpoolFile(String eqdHoldSpoolFile) {
        this.eqdHoldSpoolFile = StringUtils.trim(eqdHoldSpoolFile);
    }

    @Basic
    @Column(name = "EQD_SPOOL_FILE_NAME")
    public String getEqdSpoolFileName() {
        return eqdSpoolFileName;
    }

    public void setEqdSpoolFileName(String eqdSpoolFileName) {
        this.eqdSpoolFileName = StringUtils.trim(eqdSpoolFileName);
    }

    @Basic
    @Column(name = "EQD_FORM_TYPE")
    public String getEqdFormType() {
        return eqdFormType;
    }

    public void setEqdFormType(String eqdFormType) {
        this.eqdFormType = StringUtils.trim(eqdFormType);
    }

    @Basic
    @Column(name = "EQD_DISTRIBUTION_USER_ID")
    public String getEqdDistributionUserId() {
        return eqdDistributionUserId;
    }

    public void setEqdDistributionUserId(String eqdDistributionUserId) {
        this.eqdDistributionUserId = StringUtils.trim(eqdDistributionUserId);
    }

    @Basic
    @Column(name = "EQD_SYSTEM_ID")
    public String getEqdSystemId() {
        return eqdSystemId;
    }

    public void setEqdSystemId(String eqdSystemId) {
        this.eqdSystemId = StringUtils.trim(eqdSystemId);
    }

    @Basic
    @Column(name = "ADD_USER_NAME")
    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = StringUtils.trim(addUserName);
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
        this.addProgramName = StringUtils.trim(addProgramName);
    }

    @Basic
    @Column(name = "CHG_USER_NAME")
    public String getChgUserName() {
        return chgUserName;
    }

    public void setChgUserName(String chgUserName) {
        this.chgUserName = StringUtils.trim(chgUserName);
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
        this.chgProgramName = StringUtils.trim(chgProgramName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElgEqdEligQueueDefaults that = (ElgEqdEligQueueDefaults) o;

        if (carCarrierId != null ? !carCarrierId.equals(that.carCarrierId) : that.carCarrierId != null) return false;
        if (eqdAccountId != null ? !eqdAccountId.equals(that.eqdAccountId) : that.eqdAccountId != null) return false;
        if (eqdGroupId != null ? !eqdGroupId.equals(that.eqdGroupId) : that.eqdGroupId != null) return false;
        if (eqdReportName != null ? !eqdReportName.equals(that.eqdReportName) : that.eqdReportName != null)
            return false;
        if (eqdOutputQueueLibrary != null ? !eqdOutputQueueLibrary.equals(that.eqdOutputQueueLibrary) : that.eqdOutputQueueLibrary != null)
            return false;
        if (eqdOutputQueueName != null ? !eqdOutputQueueName.equals(that.eqdOutputQueueName) : that.eqdOutputQueueName != null)
            return false;
        if (eqdNumberOfCopies != null ? !eqdNumberOfCopies.equals(that.eqdNumberOfCopies) : that.eqdNumberOfCopies != null)
            return false;
        if (eqdSaveSpoolFile != null ? !eqdSaveSpoolFile.equals(that.eqdSaveSpoolFile) : that.eqdSaveSpoolFile != null)
            return false;
        if (eqdHoldSpoolFile != null ? !eqdHoldSpoolFile.equals(that.eqdHoldSpoolFile) : that.eqdHoldSpoolFile != null)
            return false;
        if (eqdSpoolFileName != null ? !eqdSpoolFileName.equals(that.eqdSpoolFileName) : that.eqdSpoolFileName != null)
            return false;
        if (eqdFormType != null ? !eqdFormType.equals(that.eqdFormType) : that.eqdFormType != null) return false;
        if (eqdDistributionUserId != null ? !eqdDistributionUserId.equals(that.eqdDistributionUserId) : that.eqdDistributionUserId != null)
            return false;
        if (eqdSystemId != null ? !eqdSystemId.equals(that.eqdSystemId) : that.eqdSystemId != null) return false;
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
        result = 31 * result + (eqdAccountId != null ? eqdAccountId.hashCode() : 0);
        result = 31 * result + (eqdGroupId != null ? eqdGroupId.hashCode() : 0);
        result = 31 * result + (eqdReportName != null ? eqdReportName.hashCode() : 0);
        result = 31 * result + (eqdOutputQueueLibrary != null ? eqdOutputQueueLibrary.hashCode() : 0);
        result = 31 * result + (eqdOutputQueueName != null ? eqdOutputQueueName.hashCode() : 0);
        result = 31 * result + (eqdNumberOfCopies != null ? eqdNumberOfCopies.hashCode() : 0);
        result = 31 * result + (eqdSaveSpoolFile != null ? eqdSaveSpoolFile.hashCode() : 0);
        result = 31 * result + (eqdHoldSpoolFile != null ? eqdHoldSpoolFile.hashCode() : 0);
        result = 31 * result + (eqdSpoolFileName != null ? eqdSpoolFileName.hashCode() : 0);
        result = 31 * result + (eqdFormType != null ? eqdFormType.hashCode() : 0);
        result = 31 * result + (eqdDistributionUserId != null ? eqdDistributionUserId.hashCode() : 0);
        result = 31 * result + (eqdSystemId != null ? eqdSystemId.hashCode() : 0);
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
        return "ElgEqdEligQueueDefaults{" +
                "carCarrierId='" + carCarrierId + '\'' +
                ", eqdAccountId='" + eqdAccountId + '\'' +
                ", eqdGroupId='" + eqdGroupId + '\'' +
                ", eqdReportName='" + eqdReportName + '\'' +
                ", eqdOutputQueueLibrary='" + eqdOutputQueueLibrary + '\'' +
                ", eqdOutputQueueName='" + eqdOutputQueueName + '\'' +
                ", eqdNumberOfCopies=" + eqdNumberOfCopies +
                ", eqdSaveSpoolFile='" + eqdSaveSpoolFile + '\'' +
                ", eqdHoldSpoolFile='" + eqdHoldSpoolFile + '\'' +
                ", eqdSpoolFileName='" + eqdSpoolFileName + '\'' +
                ", eqdFormType='" + eqdFormType + '\'' +
                ", eqdDistributionUserId='" + eqdDistributionUserId + '\'' +
                ", eqdSystemId='" + eqdSystemId + '\'' +
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
