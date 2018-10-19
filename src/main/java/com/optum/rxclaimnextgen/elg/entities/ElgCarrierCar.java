package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by bkocinsk on 8/10/2018.
 */
@Entity
@Table(name = "ELG_CARRIER_CAR")
public class ElgCarrierCar {
    private String carCarrierId;
    private String carCarrierName;
    private String carMailingAddress1;
    private String carMailingAddress2;
    private String carMailingCity;
    private String carMailingState;
    private String carMailingZipCode;
    private String carMailingZip2;
    private String carMailingZip3;
    private String carMailingCountry;
    private String carContact;
    private int carPhone;
    private String carBillingAddress1;
    private String carBillingAddress2;
    private String carBillingCity;
    private String carBillingState;
    private String carBillingZipCode;
    private String carBillingZip2;
    private String carBillingZip3;
    private String carBillingCountry;
    private int carActiveMembers;
    private int carInactiveMembers;
    private Date carCountDate;
    private String carLanguageCode;
    private int proProcessorId;
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

    @Basic
    @Column(name = "CAR_CARRIER_NAME")
    public String getCarCarrierName() {
        return carCarrierName;
    }

    public void setCarCarrierName(String carCarrierName) {
        this.carCarrierName = carCarrierName;
    }

    @Basic
    @Column(name = "CAR_MAILING_ADDRESS1")
    public String getCarMailingAddress1() {
        return carMailingAddress1;
    }

    public void setCarMailingAddress1(String carMailingAddress1) {
        this.carMailingAddress1 = carMailingAddress1;
    }

    @Basic
    @Column(name = "CAR_MAILING_ADDRESS2")
    public String getCarMailingAddress2() {
        return carMailingAddress2;
    }

    public void setCarMailingAddress2(String carMailingAddress2) {
        this.carMailingAddress2 = carMailingAddress2;
    }

    @Basic
    @Column(name = "CAR_MAILING_CITY")
    public String getCarMailingCity() {
        return carMailingCity;
    }

    public void setCarMailingCity(String carMailingCity) {
        this.carMailingCity = carMailingCity;
    }

    @Basic
    @Column(name = "CAR_MAILING_STATE")
    public String getCarMailingState() {
        return carMailingState;
    }

    public void setCarMailingState(String carMailingState) {
        this.carMailingState = carMailingState;
    }

    @Basic
    @Column(name = "CAR_MAILING_ZIP_CODE")
    public String getCarMailingZipCode() {
        return carMailingZipCode;
    }

    public void setCarMailingZipCode(String carMailingZipCode) {
        this.carMailingZipCode = carMailingZipCode;
    }

    @Basic
    @Column(name = "CAR_MAILING_ZIP2")
    public String getCarMailingZip2() {
        return carMailingZip2;
    }

    public void setCarMailingZip2(String carMailingZip2) {
        this.carMailingZip2 = carMailingZip2;
    }

    @Basic
    @Column(name = "CAR_MAILING_ZIP3")
    public String getCarMailingZip3() {
        return carMailingZip3;
    }

    public void setCarMailingZip3(String carMailingZip3) {
        this.carMailingZip3 = carMailingZip3;
    }

    @Basic
    @Column(name = "CAR_MAILING_COUNTRY")
    public String getCarMailingCountry() {
        return carMailingCountry;
    }

    public void setCarMailingCountry(String carMailingCountry) {
        this.carMailingCountry = carMailingCountry;
    }

    @Basic
    @Column(name = "CAR_CONTACT")
    public String getCarContact() {
        return carContact;
    }

    public void setCarContact(String carContact) {
        this.carContact = carContact;
    }

    @Basic
    @Column(name = "CAR_PHONE")
    public int getCarPhone() {
        return carPhone;
    }

    public void setCarPhone(int carPhone) {
        this.carPhone = carPhone;
    }

    @Basic
    @Column(name = "CAR_BILLING_ADDRESS1")
    public String getCarBillingAddress1() {
        return carBillingAddress1;
    }

    public void setCarBillingAddress1(String carBillingAddress1) {
        this.carBillingAddress1 = carBillingAddress1;
    }

    @Basic
    @Column(name = "CAR_BILLING_ADDRESS2")
    public String getCarBillingAddress2() {
        return carBillingAddress2;
    }

    public void setCarBillingAddress2(String carBillingAddress2) {
        this.carBillingAddress2 = carBillingAddress2;
    }

    @Basic
    @Column(name = "CAR_BILLING_CITY")
    public String getCarBillingCity() {
        return carBillingCity;
    }

    public void setCarBillingCity(String carBillingCity) {
        this.carBillingCity = carBillingCity;
    }

    @Basic
    @Column(name = "CAR_BILLING_STATE")
    public String getCarBillingState() {
        return carBillingState;
    }

    public void setCarBillingState(String carBillingState) {
        this.carBillingState = carBillingState;
    }

    @Basic
    @Column(name = "CAR_BILLING_ZIP_CODE")
    public String getCarBillingZipCode() {
        return carBillingZipCode;
    }

    public void setCarBillingZipCode(String carBillingZipCode) {
        this.carBillingZipCode = carBillingZipCode;
    }

    @Basic
    @Column(name = "CAR_BILLING_ZIP2")
    public String getCarBillingZip2() {
        return carBillingZip2;
    }

    public void setCarBillingZip2(String carBillingZip2) {
        this.carBillingZip2 = carBillingZip2;
    }

    @Basic
    @Column(name = "CAR_BILLING_ZIP3")
    public String getCarBillingZip3() {
        return carBillingZip3;
    }

    public void setCarBillingZip3(String carBillingZip3) {
        this.carBillingZip3 = carBillingZip3;
    }

    @Basic
    @Column(name = "CAR_BILLING_COUNTRY")
    public String getCarBillingCountry() {
        return carBillingCountry;
    }

    public void setCarBillingCountry(String carBillingCountry) {
        this.carBillingCountry = carBillingCountry;
    }

    @Basic
    @Column(name = "CAR_ACTIVE_MEMBERS")
    public int getCarActiveMembers() {
        return carActiveMembers;
    }

    public void setCarActiveMembers(int carActiveMembers) {
        this.carActiveMembers = carActiveMembers;
    }

    @Basic
    @Column(name = "CAR_INACTIVE_MEMBERS")
    public int getCarInactiveMembers() {
        return carInactiveMembers;
    }

    public void setCarInactiveMembers(int carInactiveMembers) {
        this.carInactiveMembers = carInactiveMembers;
    }

    @Basic
    @Column(name = "CAR_COUNT_DATE")
    public Date getCarCountDate() {
        return carCountDate;
    }

    public void setCarCountDate(Date carCountDate) {
        this.carCountDate = carCountDate;
    }

    @Basic
    @Column(name = "CAR_LANGUAGE_CODE")
    public String getCarLanguageCode() {
        return carLanguageCode;
    }

    public void setCarLanguageCode(String carLanguageCode) {
        this.carLanguageCode = carLanguageCode;
    }

    @Basic
    @Column(name = "PRO_PROCESSOR_ID")
    public int getProProcessorId() {
        return proProcessorId;
    }

    public void setProProcessorId(int proProcessorId) {
        this.proProcessorId = proProcessorId;
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

        ElgCarrierCar that = (ElgCarrierCar) o;

        if (carPhone != that.carPhone) return false;
        if (carActiveMembers != that.carActiveMembers) return false;
        if (carInactiveMembers != that.carInactiveMembers) return false;
        if (proProcessorId != that.proProcessorId) return false;
        if (carCarrierId != null ? !carCarrierId.equals(that.carCarrierId) : that.carCarrierId != null) return false;
        if (carCarrierName != null ? !carCarrierName.equals(that.carCarrierName) : that.carCarrierName != null)
            return false;
        if (carMailingAddress1 != null ? !carMailingAddress1.equals(that.carMailingAddress1) : that.carMailingAddress1 != null)
            return false;
        if (carMailingAddress2 != null ? !carMailingAddress2.equals(that.carMailingAddress2) : that.carMailingAddress2 != null)
            return false;
        if (carMailingCity != null ? !carMailingCity.equals(that.carMailingCity) : that.carMailingCity != null)
            return false;
        if (carMailingState != null ? !carMailingState.equals(that.carMailingState) : that.carMailingState != null)
            return false;
        if (carMailingZipCode != null ? !carMailingZipCode.equals(that.carMailingZipCode) : that.carMailingZipCode != null)
            return false;
        if (carMailingZip2 != null ? !carMailingZip2.equals(that.carMailingZip2) : that.carMailingZip2 != null)
            return false;
        if (carMailingZip3 != null ? !carMailingZip3.equals(that.carMailingZip3) : that.carMailingZip3 != null)
            return false;
        if (carMailingCountry != null ? !carMailingCountry.equals(that.carMailingCountry) : that.carMailingCountry != null)
            return false;
        if (carContact != null ? !carContact.equals(that.carContact) : that.carContact != null) return false;
        if (carBillingAddress1 != null ? !carBillingAddress1.equals(that.carBillingAddress1) : that.carBillingAddress1 != null)
            return false;
        if (carBillingAddress2 != null ? !carBillingAddress2.equals(that.carBillingAddress2) : that.carBillingAddress2 != null)
            return false;
        if (carBillingCity != null ? !carBillingCity.equals(that.carBillingCity) : that.carBillingCity != null)
            return false;
        if (carBillingState != null ? !carBillingState.equals(that.carBillingState) : that.carBillingState != null)
            return false;
        if (carBillingZipCode != null ? !carBillingZipCode.equals(that.carBillingZipCode) : that.carBillingZipCode != null)
            return false;
        if (carBillingZip2 != null ? !carBillingZip2.equals(that.carBillingZip2) : that.carBillingZip2 != null)
            return false;
        if (carBillingZip3 != null ? !carBillingZip3.equals(that.carBillingZip3) : that.carBillingZip3 != null)
            return false;
        if (carBillingCountry != null ? !carBillingCountry.equals(that.carBillingCountry) : that.carBillingCountry != null)
            return false;
        if (carCountDate != null ? !carCountDate.equals(that.carCountDate) : that.carCountDate != null) return false;
        if (carLanguageCode != null ? !carLanguageCode.equals(that.carLanguageCode) : that.carLanguageCode != null)
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
        result = 31 * result + (carCarrierName != null ? carCarrierName.hashCode() : 0);
        result = 31 * result + (carMailingAddress1 != null ? carMailingAddress1.hashCode() : 0);
        result = 31 * result + (carMailingAddress2 != null ? carMailingAddress2.hashCode() : 0);
        result = 31 * result + (carMailingCity != null ? carMailingCity.hashCode() : 0);
        result = 31 * result + (carMailingState != null ? carMailingState.hashCode() : 0);
        result = 31 * result + (carMailingZipCode != null ? carMailingZipCode.hashCode() : 0);
        result = 31 * result + (carMailingZip2 != null ? carMailingZip2.hashCode() : 0);
        result = 31 * result + (carMailingZip3 != null ? carMailingZip3.hashCode() : 0);
        result = 31 * result + (carMailingCountry != null ? carMailingCountry.hashCode() : 0);
        result = 31 * result + (carContact != null ? carContact.hashCode() : 0);
        result = 31 * result + carPhone;
        result = 31 * result + (carBillingAddress1 != null ? carBillingAddress1.hashCode() : 0);
        result = 31 * result + (carBillingAddress2 != null ? carBillingAddress2.hashCode() : 0);
        result = 31 * result + (carBillingCity != null ? carBillingCity.hashCode() : 0);
        result = 31 * result + (carBillingState != null ? carBillingState.hashCode() : 0);
        result = 31 * result + (carBillingZipCode != null ? carBillingZipCode.hashCode() : 0);
        result = 31 * result + (carBillingZip2 != null ? carBillingZip2.hashCode() : 0);
        result = 31 * result + (carBillingZip3 != null ? carBillingZip3.hashCode() : 0);
        result = 31 * result + (carBillingCountry != null ? carBillingCountry.hashCode() : 0);
        result = 31 * result + carActiveMembers;
        result = 31 * result + carInactiveMembers;
        result = 31 * result + (carCountDate != null ? carCountDate.hashCode() : 0);
        result = 31 * result + (carLanguageCode != null ? carLanguageCode.hashCode() : 0);
        result = 31 * result + proProcessorId;
        result = 31 * result + (addDate != null ? addDate.hashCode() : 0);
        result = 31 * result + (chgUserName != null ? chgUserName.hashCode() : 0);
        result = 31 * result + (chgDate != null ? chgDate.hashCode() : 0);
        result = 31 * result + (chgTime != null ? chgTime.hashCode() : 0);
        result = 31 * result + (chgProgramName != null ? chgProgramName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ElgCarrierCar{" +
                "carCarrierId='" + carCarrierId + '\'' +
                ", carCarrierName='" + carCarrierName + '\'' +
                ", carMailingAddress1='" + carMailingAddress1 + '\'' +
                ", carMailingAddress2='" + carMailingAddress2 + '\'' +
                ", carMailingCity='" + carMailingCity + '\'' +
                ", carMailingState='" + carMailingState + '\'' +
                ", carMailingZipCode='" + carMailingZipCode + '\'' +
                ", carMailingZip2='" + carMailingZip2 + '\'' +
                ", carMailingZip3='" + carMailingZip3 + '\'' +
                ", carMailingCountry='" + carMailingCountry + '\'' +
                ", carContact='" + carContact + '\'' +
                ", carPhone=" + carPhone +
                ", carBillingAddress1='" + carBillingAddress1 + '\'' +
                ", carBillingAddress2='" + carBillingAddress2 + '\'' +
                ", carBillingCity='" + carBillingCity + '\'' +
                ", carBillingState='" + carBillingState + '\'' +
                ", carBillingZipCode='" + carBillingZipCode + '\'' +
                ", carBillingZip2='" + carBillingZip2 + '\'' +
                ", carBillingZip3='" + carBillingZip3 + '\'' +
                ", carBillingCountry='" + carBillingCountry + '\'' +
                ", carActiveMembers=" + carActiveMembers +
                ", carInactiveMembers=" + carInactiveMembers +
                ", carCountDate=" + carCountDate +
                ", carLanguageCode='" + carLanguageCode + '\'' +
                ", proProcessorId=" + proProcessorId +
                ", addDate=" + addDate +
                ", chgUserName='" + chgUserName + '\'' +
                ", chgDate=" + chgDate +
                ", chgTime=" + chgTime +
                ", chgProgramName='" + chgProgramName + '\'' +
                '}';
    }
}
