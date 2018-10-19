package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by bkocinsk on 8/10/2018.
 */
@Entity
@Table(name = "ELG_ACCOUNT_ACC")
@IdClass(ElgAccountAccPK.class)
public class ElgAccountAcc {
    private String carCarrierId;
    private String accAccountId;
    private String accAccountName;
    private String accAddress1;
    private String accAddress2;
    private String accCity;
    private String accState;
    private String accZip;
    private String accZip2;
    private String accZip3;
    private String accCountry;
    private int accPhone;
    private String accContact;
    private int accActiveMembers;
    private int accInactiveMembers;
    private Date accCountDate;
    private String accLanguageCode;
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

    @Basic
    @Column(name = "ACC_ACCOUNT_NAME")
    public String getAccAccountName() {
        return accAccountName;
    }

    public void setAccAccountName(String accAccountName) {
        this.accAccountName = accAccountName;
    }

    @Basic
    @Column(name = "ACC_ADDRESS1")
    public String getAccAddress1() {
        return accAddress1;
    }

    public void setAccAddress1(String accAddress1) {
        this.accAddress1 = accAddress1;
    }

    @Basic
    @Column(name = "ACC_ADDRESS2")
    public String getAccAddress2() {
        return accAddress2;
    }

    public void setAccAddress2(String accAddress2) {
        this.accAddress2 = accAddress2;
    }

    @Basic
    @Column(name = "ACC_CITY")
    public String getAccCity() {
        return accCity;
    }

    public void setAccCity(String accCity) {
        this.accCity = accCity;
    }

    @Basic
    @Column(name = "ACC_STATE")
    public String getAccState() {
        return accState;
    }

    public void setAccState(String accState) {
        this.accState = accState;
    }

    @Basic
    @Column(name = "ACC_ZIP")
    public String getAccZip() {
        return accZip;
    }

    public void setAccZip(String accZip) {
        this.accZip = accZip;
    }

    @Basic
    @Column(name = "ACC_ZIP2")
    public String getAccZip2() {
        return accZip2;
    }

    public void setAccZip2(String accZip2) {
        this.accZip2 = accZip2;
    }

    @Basic
    @Column(name = "ACC_ZIP3")
    public String getAccZip3() {
        return accZip3;
    }

    public void setAccZip3(String accZip3) {
        this.accZip3 = accZip3;
    }

    @Basic
    @Column(name = "ACC_COUNTRY")
    public String getAccCountry() {
        return accCountry;
    }

    public void setAccCountry(String accCountry) {
        this.accCountry = accCountry;
    }

    @Basic
    @Column(name = "ACC_PHONE")
    public int getAccPhone() {
        return accPhone;
    }

    public void setAccPhone(int accPhone) {
        this.accPhone = accPhone;
    }

    @Basic
    @Column(name = "ACC_CONTACT")
    public String getAccContact() {
        return accContact;
    }

    public void setAccContact(String accContact) {
        this.accContact = accContact;
    }

    @Basic
    @Column(name = "ACC_ACTIVE_MEMBERS")
    public int getAccActiveMembers() {
        return accActiveMembers;
    }

    public void setAccActiveMembers(int accActiveMembers) {
        this.accActiveMembers = accActiveMembers;
    }

    @Basic
    @Column(name = "ACC_INACTIVE_MEMBERS")
    public int getAccInactiveMembers() {
        return accInactiveMembers;
    }

    public void setAccInactiveMembers(int accInactiveMembers) {
        this.accInactiveMembers = accInactiveMembers;
    }

    @Basic
    @Column(name = "ACC_COUNT_DATE")
    public Date getAccCountDate() {
        return accCountDate;
    }

    public void setAccCountDate(Date accCountDate) {
        this.accCountDate = accCountDate;
    }

    @Basic
    @Column(name = "ACC_LANGUAGE_CODE")
    public String getAccLanguageCode() {
        return accLanguageCode;
    }

    public void setAccLanguageCode(String accLanguageCode) {
        this.accLanguageCode = accLanguageCode;
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

        ElgAccountAcc that = (ElgAccountAcc) o;

        if (accPhone != that.accPhone) return false;
        if (accActiveMembers != that.accActiveMembers) return false;
        if (accInactiveMembers != that.accInactiveMembers) return false;
        if (carCarrierId != null ? !carCarrierId.equals(that.carCarrierId) : that.carCarrierId != null) return false;
        if (accAccountId != null ? !accAccountId.equals(that.accAccountId) : that.accAccountId != null) return false;
        if (accAccountName != null ? !accAccountName.equals(that.accAccountName) : that.accAccountName != null)
            return false;
        if (accAddress1 != null ? !accAddress1.equals(that.accAddress1) : that.accAddress1 != null) return false;
        if (accAddress2 != null ? !accAddress2.equals(that.accAddress2) : that.accAddress2 != null) return false;
        if (accCity != null ? !accCity.equals(that.accCity) : that.accCity != null) return false;
        if (accState != null ? !accState.equals(that.accState) : that.accState != null) return false;
        if (accZip != null ? !accZip.equals(that.accZip) : that.accZip != null) return false;
        if (accZip2 != null ? !accZip2.equals(that.accZip2) : that.accZip2 != null) return false;
        if (accZip3 != null ? !accZip3.equals(that.accZip3) : that.accZip3 != null) return false;
        if (accCountry != null ? !accCountry.equals(that.accCountry) : that.accCountry != null) return false;
        if (accContact != null ? !accContact.equals(that.accContact) : that.accContact != null) return false;
        if (accCountDate != null ? !accCountDate.equals(that.accCountDate) : that.accCountDate != null) return false;
        if (accLanguageCode != null ? !accLanguageCode.equals(that.accLanguageCode) : that.accLanguageCode != null)
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
        result = 31 * result + (accAccountId != null ? accAccountId.hashCode() : 0);
        result = 31 * result + (accAccountName != null ? accAccountName.hashCode() : 0);
        result = 31 * result + (accAddress1 != null ? accAddress1.hashCode() : 0);
        result = 31 * result + (accAddress2 != null ? accAddress2.hashCode() : 0);
        result = 31 * result + (accCity != null ? accCity.hashCode() : 0);
        result = 31 * result + (accState != null ? accState.hashCode() : 0);
        result = 31 * result + (accZip != null ? accZip.hashCode() : 0);
        result = 31 * result + (accZip2 != null ? accZip2.hashCode() : 0);
        result = 31 * result + (accZip3 != null ? accZip3.hashCode() : 0);
        result = 31 * result + (accCountry != null ? accCountry.hashCode() : 0);
        result = 31 * result + accPhone;
        result = 31 * result + (accContact != null ? accContact.hashCode() : 0);
        result = 31 * result + accActiveMembers;
        result = 31 * result + accInactiveMembers;
        result = 31 * result + (accCountDate != null ? accCountDate.hashCode() : 0);
        result = 31 * result + (accLanguageCode != null ? accLanguageCode.hashCode() : 0);
        result = 31 * result + (addDate != null ? addDate.hashCode() : 0);
        result = 31 * result + (chgUserName != null ? chgUserName.hashCode() : 0);
        result = 31 * result + (chgDate != null ? chgDate.hashCode() : 0);
        result = 31 * result + (chgTime != null ? chgTime.hashCode() : 0);
        result = 31 * result + (chgProgramName != null ? chgProgramName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ElgAccountAccRepository{" +
                "carCarrierId='" + carCarrierId + '\'' +
                ", accAccountId='" + accAccountId + '\'' +
                ", accAccountName='" + accAccountName + '\'' +
                ", accAddress1='" + accAddress1 + '\'' +
                ", accAddress2='" + accAddress2 + '\'' +
                ", accCity='" + accCity + '\'' +
                ", accState='" + accState + '\'' +
                ", accZip='" + accZip + '\'' +
                ", accZip2='" + accZip2 + '\'' +
                ", accZip3='" + accZip3 + '\'' +
                ", accCountry='" + accCountry + '\'' +
                ", accPhone=" + accPhone +
                ", accContact='" + accContact + '\'' +
                ", accActiveMembers=" + accActiveMembers +
                ", accInactiveMembers=" + accInactiveMembers +
                ", accCountDate=" + accCountDate +
                ", accLanguageCode='" + accLanguageCode + '\'' +
                ", addDate=" + addDate +
                ", chgUserName='" + chgUserName + '\'' +
                ", chgDate=" + chgDate +
                ", chgTime=" + chgTime +
                ", chgProgramName='" + chgProgramName + '\'' +
                '}';
    }
}

