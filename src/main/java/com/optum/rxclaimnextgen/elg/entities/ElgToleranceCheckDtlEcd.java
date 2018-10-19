package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "ELG_TOLERANCE_CHECK_DTL_ECD")
@IdClass(ElgToleranceCheckDtlEcdPK.class)
public class ElgToleranceCheckDtlEcd {
    private String carCarrierId;
    private String accountId;
    private String groupId;
    private String ecdFileIdFieldNumber;
    private String ecdFieldName;
    private String ecdToleranceChkActive;
    private BigDecimal ecdTolerancePercentage;
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
    @Column(name = "ECD_FILE_ID_FIELD_NUMBER")
    public String getEcdFileIdFieldNumber() {
        return ecdFileIdFieldNumber;
    }

    public void setEcdFileIdFieldNumber(String ecdFileIdFieldNumber) {
        this.ecdFileIdFieldNumber = ecdFileIdFieldNumber;
    }

    @Basic
    @Column(name = "ECD_FIELD_NAME")
    public String getEcdFieldName() {
        return ecdFieldName;
    }

    public void setEcdFieldName(String ecdFieldName) {
        this.ecdFieldName = ecdFieldName;
    }

    @Basic
    @Column(name = "ECD_TOLERANCE_CHK_ACTIVE")
    public String getEcdToleranceChkActive() {
        return ecdToleranceChkActive;
    }

    public void setEcdToleranceChkActive(String ecdToleranceChkActive) {
        this.ecdToleranceChkActive = ecdToleranceChkActive;
    }

    @Basic
    @Column(name = "ECD_TOLERANCE_PERCENTAGE")
    public BigDecimal getEcdTolerancePercentage() {
        return ecdTolerancePercentage;
    }

    public void setEcdTolerancePercentage(BigDecimal ecdTolerancePercentage) {
        this.ecdTolerancePercentage = ecdTolerancePercentage;
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
        ElgToleranceCheckDtlEcd that = (ElgToleranceCheckDtlEcd) o;
        return Objects.equals(carCarrierId, that.carCarrierId) &&
                Objects.equals(accountId, that.accountId) &&
                Objects.equals(groupId, that.groupId) &&
                Objects.equals(ecdFileIdFieldNumber, that.ecdFileIdFieldNumber) &&
                Objects.equals(ecdFieldName, that.ecdFieldName) &&
                Objects.equals(ecdToleranceChkActive, that.ecdToleranceChkActive) &&
                Objects.equals(ecdTolerancePercentage, that.ecdTolerancePercentage) &&
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
        return Objects.hash(carCarrierId, accountId, groupId, ecdFileIdFieldNumber, ecdFieldName, ecdToleranceChkActive, ecdTolerancePercentage, addUserName, addDate, addTime, addProgramName, chgUserName, chgDate, chgTime, chgProgramName);
    }
}
