package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by bkocinsk on 7/16/2018.
 */
@Entity
@Table(name = "ELG_GROUP_GRP")
@IdClass(ElgGroupGrpPK.class)
public class ElgGroupGrp {
    private String carCarrierId;
    private String accAccountId;
    private String grpGroupId;
    private String grpGroupName;
    private String grpAddress1;
    private String grpAddress2;
    private String grpCity;
    private String grpState;
    private String grpZip;
    private String grpZip2;
    private String grpZip3;
    private String grpCountry;
    private long grpPhone;
    private String grpContactName;
    private Date grpContractDate;
    private Date grpRenewalDate;
    private String grpSicCode;
    private String grpLanguageCode;
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
    @Column(name = "ACC_ACCOUNT_ID")
    public String getAccAccountId() {
        return accAccountId;
    }

    public void setAccAccountId(String accAccountId) {
        this.accAccountId = accAccountId;
    }

    @Id
    @Column(name = "GRP_GROUP_ID")
    public String getGrpGroupId() {
        return grpGroupId;
    }

    public void setGrpGroupId(String grpGroupId) {
        this.grpGroupId = grpGroupId;
    }

    @Basic
    @Column(name = "GRP_GROUP_NAME")
    public String getGrpGroupName() {
        return grpGroupName;
    }

    public void setGrpGroupName(String grpGroupName) {
        this.grpGroupName = grpGroupName;
    }

    @Basic
    @Column(name = "GRP_ADDRESS_1")
    public String getGrpAddress1() {
        return grpAddress1;
    }

    public void setGrpAddress1(String grpAddress1) {
        this.grpAddress1 = grpAddress1;
    }

    @Basic
    @Column(name = "GRP_ADDRESS_2")
    public String getGrpAddress2() {
        return grpAddress2;
    }

    public void setGrpAddress2(String grpAddress2) {
        this.grpAddress2 = grpAddress2;
    }

    @Basic
    @Column(name = "GRP_CITY")
    public String getGrpCity() {
        return grpCity;
    }

    public void setGrpCity(String grpCity) {
        this.grpCity = grpCity;
    }

    @Basic
    @Column(name = "GRP_STATE")
    public String getGrpState() {
        return grpState;
    }

    public void setGrpState(String grpState) {
        this.grpState = grpState;
    }

    @Basic
    @Column(name = "GRP_ZIP")
    public String getGrpZip() {
        return grpZip;
    }

    public void setGrpZip(String grpZip) {
        this.grpZip = grpZip;
    }

    @Basic
    @Column(name = "GRP_ZIP2")
    public String getGrpZip2() {
        return grpZip2;
    }

    public void setGrpZip2(String grpZip2) {
        this.grpZip2 = grpZip2;
    }

    @Basic
    @Column(name = "GRP_ZIP3")
    public String getGrpZip3() {
        return grpZip3;
    }

    public void setGrpZip3(String grpZip3) {
        this.grpZip3 = grpZip3;
    }

    @Basic
    @Column(name = "GRP_COUNTRY")
    public String getGrpCountry() {
        return grpCountry;
    }

    public void setGrpCountry(String grpCountry) {
        this.grpCountry = grpCountry;
    }

    @Basic
    @Column(name = "GRP_PHONE")
    public long getGrpPhone() {
        return grpPhone;
    }

    public void setGrpPhone(long grpPhone) {
        this.grpPhone = grpPhone;
    }

    @Basic
    @Column(name = "GRP_CONTACT_NAME")
    public String getGrpContactName() {
        return grpContactName;
    }

    public void setGrpContactName(String grpContactName) {
        this.grpContactName = grpContactName;
    }

    @Basic
    @Column(name = "GRP_CONTRACT_DATE")
    public Date getGrpContractDate() {
        return grpContractDate;
    }

    public void setGrpContractDate(Date grpContractDate) {
        this.grpContractDate = grpContractDate;
    }

    @Basic
    @Column(name = "GRP_RENEWAL_DATE")
    public Date getGrpRenewalDate() {
        return grpRenewalDate;
    }

    public void setGrpRenewalDate(Date grpRenewalDate) {
        this.grpRenewalDate = grpRenewalDate;
    }

    @Basic
    @Column(name = "GRP_SIC_CODE")
    public String getGrpSicCode() {
        return grpSicCode;
    }

    public void setGrpSicCode(String grpSicCode) {
        this.grpSicCode = grpSicCode;
    }

    @Basic
    @Column(name = "GRP_LANGUAGE_CODE")
    public String getGrpLanguageCode() {
        return grpLanguageCode;
    }

    public void setGrpLanguageCode(String grpLanguageCode) {
        this.grpLanguageCode = grpLanguageCode;
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

        ElgGroupGrp that = (ElgGroupGrp) o;

        if (grpPhone != that.grpPhone) return false;
        if (carCarrierId != null ? !carCarrierId.equals(that.carCarrierId) : that.carCarrierId != null) return false;
        if (accAccountId != null ? !accAccountId.equals(that.accAccountId) : that.accAccountId != null) return false;
        if (grpGroupId != null ? !grpGroupId.equals(that.grpGroupId) : that.grpGroupId != null) return false;
        if (grpGroupName != null ? !grpGroupName.equals(that.grpGroupName) : that.grpGroupName != null) return false;
        if (grpAddress1 != null ? !grpAddress1.equals(that.grpAddress1) : that.grpAddress1 != null) return false;
        if (grpAddress2 != null ? !grpAddress2.equals(that.grpAddress2) : that.grpAddress2 != null) return false;
        if (grpCity != null ? !grpCity.equals(that.grpCity) : that.grpCity != null) return false;
        if (grpState != null ? !grpState.equals(that.grpState) : that.grpState != null) return false;
        if (grpZip != null ? !grpZip.equals(that.grpZip) : that.grpZip != null) return false;
        if (grpZip2 != null ? !grpZip2.equals(that.grpZip2) : that.grpZip2 != null) return false;
        if (grpZip3 != null ? !grpZip3.equals(that.grpZip3) : that.grpZip3 != null) return false;
        if (grpCountry != null ? !grpCountry.equals(that.grpCountry) : that.grpCountry != null) return false;
        if (grpContactName != null ? !grpContactName.equals(that.grpContactName) : that.grpContactName != null)
            return false;
        if (grpContractDate != null ? !grpContractDate.equals(that.grpContractDate) : that.grpContractDate != null)
            return false;
        if (grpRenewalDate != null ? !grpRenewalDate.equals(that.grpRenewalDate) : that.grpRenewalDate != null)
            return false;
        if (grpSicCode != null ? !grpSicCode.equals(that.grpSicCode) : that.grpSicCode != null) return false;
        if (grpLanguageCode != null ? !grpLanguageCode.equals(that.grpLanguageCode) : that.grpLanguageCode != null)
            return false;
        if (addDate != null ? !addDate.equals(that.addDate) : that.addDate != null) return false;
        if (chgUserName != null ? !chgUserName.equals(that.chgUserName) : that.chgUserName != null) return false;
        if (chgDate != null ? !chgDate.equals(that.chgDate) : that.chgDate != null) return false;
        if (chgTime != null ? !chgTime.equals(that.chgTime) : that.chgTime != null) return false;
        return chgProgramName != null ? chgProgramName.equals(that.chgProgramName) : that.chgProgramName == null;
    }

    @Override
    public int hashCode() {
        int result = carCarrierId != null ? carCarrierId.hashCode() : 0;
        result = 31 * result + (accAccountId != null ? accAccountId.hashCode() : 0);
        result = 31 * result + (grpGroupId != null ? grpGroupId.hashCode() : 0);
        result = 31 * result + (grpGroupName != null ? grpGroupName.hashCode() : 0);
        result = 31 * result + (grpAddress1 != null ? grpAddress1.hashCode() : 0);
        result = 31 * result + (grpAddress2 != null ? grpAddress2.hashCode() : 0);
        result = 31 * result + (grpCity != null ? grpCity.hashCode() : 0);
        result = 31 * result + (grpState != null ? grpState.hashCode() : 0);
        result = 31 * result + (grpZip != null ? grpZip.hashCode() : 0);
        result = 31 * result + (grpZip2 != null ? grpZip2.hashCode() : 0);
        result = 31 * result + (grpZip3 != null ? grpZip3.hashCode() : 0);
        result = 31 * result + (grpCountry != null ? grpCountry.hashCode() : 0);
        result = 31 * result + (int) (grpPhone ^ (grpPhone >>> 32));
        result = 31 * result + (grpContactName != null ? grpContactName.hashCode() : 0);
        result = 31 * result + (grpContractDate != null ? grpContractDate.hashCode() : 0);
        result = 31 * result + (grpRenewalDate != null ? grpRenewalDate.hashCode() : 0);
        result = 31 * result + (grpSicCode != null ? grpSicCode.hashCode() : 0);
        result = 31 * result + (grpLanguageCode != null ? grpLanguageCode.hashCode() : 0);
        result = 31 * result + (addDate != null ? addDate.hashCode() : 0);
        result = 31 * result + (chgUserName != null ? chgUserName.hashCode() : 0);
        result = 31 * result + (chgDate != null ? chgDate.hashCode() : 0);
        result = 31 * result + (chgTime != null ? chgTime.hashCode() : 0);
        result = 31 * result + (chgProgramName != null ? chgProgramName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ElgGroupGrp{" +
                "carCarrierId='" + carCarrierId + '\'' +
                ", accAccountId='" + accAccountId + '\'' +
                ", grpGroupId='" + grpGroupId + '\'' +
                ", grpGroupName='" + grpGroupName + '\'' +
                ", grpAddress1='" + grpAddress1 + '\'' +
                ", grpAddress2='" + grpAddress2 + '\'' +
                ", grpCity='" + grpCity + '\'' +
                ", grpState='" + grpState + '\'' +
                ", grpZip='" + grpZip + '\'' +
                ", grpZip2='" + grpZip2 + '\'' +
                ", grpZip3='" + grpZip3 + '\'' +
                ", grpCountry='" + grpCountry + '\'' +
                ", grpPhone=" + grpPhone +
                ", grpContactName='" + grpContactName + '\'' +
                ", grpContractDate=" + grpContractDate +
                ", grpRenewalDate=" + grpRenewalDate +
                ", grpSicCode='" + grpSicCode + '\'' +
                ", grpLanguageCode='" + grpLanguageCode + '\'' +
                ", addDate=" + addDate +
                ", chgUserName='" + chgUserName + '\'' +
                ", chgDate=" + chgDate +
                ", chgTime=" + chgTime +
                ", chgProgramName='" + chgProgramName + '\'' +
                '}';
    }
}
