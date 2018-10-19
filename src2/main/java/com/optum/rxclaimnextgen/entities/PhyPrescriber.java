package com.optum.rxclaimnextgen.entities;

import javax.persistence.*;

/**
 * Created by bkocinsk on 7/23/2018.
 */
@Entity
@Table(name = "RCPHYP")
public class PhyPrescriber {

    private String prescriberKey;
    private String originCode;
    private String loadSource;
    private int retirementDate;
    private String deaPrefix;
    private String deaCode;
    private String deaSuffix;
    private String busnActvSubCode;
    private String lastName;
    private String firstName;
    private String middleInitial;
    private String middleName;
    private String nameSuffix;
    private String primaryDegree;
    private String secondaryDegree;
    private String emailAddress;
    private String altEmailAddress;
    private String userLicense;
    private String addressLine1;
    private String addressLine2;
    private String suite;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private int phone1;
    private String phone1Ext;
    private int phone2;
    private String phone2Ext;
    private int fax;
    private String faxExt;
    private int dateOfBirth;
    private int deaRenewalDate;
    private int deaExpiredDate;
    private String vendorKey;
    private int dateOfDeath;
    private String addUserName;
    private int addDate;
    private int addTime;
    private String addProgramName;
    private String chgUserName;
    private int chgDate;
    private int chgTime;
    private String chgProgramName;

    @Id
    @Column(name = "ALAQCD")
    public String getPrescriberKey() {
        return prescriberKey;
    }

    public void setPrescriberKey(String prescriberKey) {
        this.prescriberKey = prescriberKey;
    }

    @Basic
    @Column(name = "ALEXH7")
    public String getOriginCode() {
        return originCode;
    }

    public void setOriginCode(String originCode) {
        this.originCode = originCode;
    }

    @Basic
    @Column(name = "ALEYH7")
    public String getLoadSource() {
        return loadSource;
    }

    public void setLoadSource(String loadSource) {
        this.loadSource = loadSource;
    }

    @Basic
    @Column(name = "ALE4HG")
    public int getRetirementDate() {
        return retirementDate;
    }

    public void setRetirementDate(int retirementDate) {
        this.retirementDate = retirementDate;
    }

    @Basic
    @Column(name = "ALBXTX")
    public String getDeaPrefix() {
        return deaPrefix;
    }

    public void setDeaPrefix(String deaPrefix) {
        this.deaPrefix = deaPrefix;
    }

    @Basic
    @Column(name = "ALATCD")
    public String getDeaCode() {
        return deaCode;
    }

    public void setDeaCode(String deaCode) {
        this.deaCode = deaCode;
    }

    @Basic
    @Column(name = "ALAUCD")
    public String getDeaSuffix() {
        return deaSuffix;
    }

    public void setDeaSuffix(String deaSuffix) {
        this.deaSuffix = deaSuffix;
    }

    @Basic
    @Column(name = "ALPUHB")
    public String getBusnActvSubCode() {
        return busnActvSubCode;
    }

    public void setBusnActvSubCode(String busnActvSubCode) {
        this.busnActvSubCode = busnActvSubCode;
    }

    @Basic
    @Column(name = "ALSQIG")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "ALSRIG")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "ALSSIG")
    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    @Basic
    @Column(name = "ALS5IG")
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Basic
    @Column(name = "ALPJHB")
    public String getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    @Basic
    @Column(name = "ALPKHB")
    public String getPrimaryDegree() {
        return primaryDegree;
    }

    public void setPrimaryDegree(String primaryDegree) {
        this.primaryDegree = primaryDegree;
    }

    @Basic
    @Column(name = "ALPLHB")
    public String getSecondaryDegree() {
        return secondaryDegree;
    }

    public void setSecondaryDegree(String secondaryDegree) {
        this.secondaryDegree = secondaryDegree;
    }

    @Basic
    @Column(name = "ALPMHB")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Basic
    @Column(name = "ALASHP")
    public String getAltEmailAddress() {
        return altEmailAddress;
    }

    public void setAltEmailAddress(String altEmailAddress) {
        this.altEmailAddress = altEmailAddress;
    }

    @Basic
    @Column(name = "ALB3TX")
    public String getUserLicense() {
        return userLicense;
    }

    public void setUserLicense(String userLicense) {
        this.userLicense = userLicense;
    }

    @Basic
    @Column(name = "ALBYTX")
    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @Basic
    @Column(name = "ALSTIG")
    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @Basic
    @Column(name = "ALSUIG")
    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    @Basic
    @Column(name = "ALBZTX")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "ALB1TX")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "ALB0TX")
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Basic
    @Column(name = "ALPNHB")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "ALADNB")
    public int getPhone1() {
        return phone1;
    }

    public void setPhone1(int phone1) {
        this.phone1 = phone1;
    }

    @Basic
    @Column(name = "ALSVIG")
    public String getPhone1Ext() {
        return phone1Ext;
    }

    public void setPhone1Ext(String phone1Ext) {
        this.phone1Ext = phone1Ext;
    }

    @Basic
    @Column(name = "ALOAHR")
    public int getPhone2() {
        return phone2;
    }

    public void setPhone2(int phone2) {
        this.phone2 = phone2;
    }

    @Basic
    @Column(name = "ALSWIG")
    public String getPhone2Ext() {
        return phone2Ext;
    }

    public void setPhone2Ext(String phone2Ext) {
        this.phone2Ext = phone2Ext;
    }

    @Basic
    @Column(name = "ALOBHR")
    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "ALSXIG")
    public String getFaxExt() {
        return faxExt;
    }

    public void setFaxExt(String faxExt) {
        this.faxExt = faxExt;
    }

    @Basic
    @Column(name = "ALESCE")
    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Basic
    @Column(name = "ALG4CE")
    public int getDeaRenewalDate() {
        return deaRenewalDate;
    }

    public void setDeaRenewalDate(int deaRenewalDate) {
        this.deaRenewalDate = deaRenewalDate;
    }

    @Basic
    @Column(name = "ALG5CE")
    public int getDeaExpiredDate() {
        return deaExpiredDate;
    }

    public void setDeaExpiredDate(int deaExpiredDate) {
        this.deaExpiredDate = deaExpiredDate;
    }

    @Basic
    @Column(name = "ALG9HO")
    public String getVendorKey() {
        return vendorKey;
    }

    public void setVendorKey(String vendorKey) {
        this.vendorKey = vendorKey;
    }

    @Basic
    @Column(name = "ALACCF")
    public int getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(int dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    @Basic
    @Column(name = "ALAKVN")
    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    @Basic
    @Column(name = "ALC2DT")
    public int getAddDate() {
        return addDate;
    }

    public void setAddDate(int addDate) {
        this.addDate = addDate;
    }

    @Basic
    @Column(name = "ALADTM")
    public int getAddTime() {
        return addTime;
    }

    public void setAddTime(int addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "ALALVN")
    public String getAddProgramName() {
        return addProgramName;
    }

    public void setAddProgramName(String addProgramName) {
        this.addProgramName = addProgramName;
    }

    @Basic
    @Column(name = "ALADVN")
    public String getChgUserName() {
        return chgUserName;
    }

    public void setChgUserName(String chgUserName) {
        this.chgUserName = chgUserName;
    }

    @Basic
    @Column(name = "ALBMDT")
    public int getChgDate() {
        return chgDate;
    }

    public void setChgDate(int chgDate) {
        this.chgDate = chgDate;
    }

    @Basic
    @Column(name = "ALABTM")
    public int getChgTime() {
        return chgTime;
    }

    public void setChgTime(int chgTime) {
        this.chgTime = chgTime;
    }

    @Basic
    @Column(name = "ALAEVN")
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

        com.optum.rxclaimnextgen.entities.PhyPrescriber that = (com.optum.rxclaimnextgen.entities.PhyPrescriber) o;

        if (retirementDate != that.retirementDate) return false;
        if (phone1 != that.phone1) return false;
        if (phone2 != that.phone2) return false;
        if (fax != that.fax) return false;
        if (dateOfBirth != that.dateOfBirth) return false;
        if (deaRenewalDate != that.deaRenewalDate) return false;
        if (deaExpiredDate != that.deaExpiredDate) return false;
        if (dateOfDeath != that.dateOfDeath) return false;
        if (addDate != that.addDate) return false;
        if (addTime != that.addTime) return false;
        if (chgDate != that.chgDate) return false;
        if (chgTime != that.chgTime) return false;
        if (prescriberKey != null ? !prescriberKey.equals(that.prescriberKey) : that.prescriberKey != null)
            return false;
        if (originCode != null ? !originCode.equals(that.originCode) : that.originCode != null) return false;
        if (loadSource != null ? !loadSource.equals(that.loadSource) : that.loadSource != null) return false;
        if (deaPrefix != null ? !deaPrefix.equals(that.deaPrefix) : that.deaPrefix != null) return false;
        if (deaCode != null ? !deaCode.equals(that.deaCode) : that.deaCode != null) return false;
        if (deaSuffix != null ? !deaSuffix.equals(that.deaSuffix) : that.deaSuffix != null) return false;
        if (busnActvSubCode != null ? !busnActvSubCode.equals(that.busnActvSubCode) : that.busnActvSubCode != null)
            return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (middleInitial != null ? !middleInitial.equals(that.middleInitial) : that.middleInitial != null)
            return false;
        if (middleName != null ? !middleName.equals(that.middleName) : that.middleName != null) return false;
        if (nameSuffix != null ? !nameSuffix.equals(that.nameSuffix) : that.nameSuffix != null) return false;
        if (primaryDegree != null ? !primaryDegree.equals(that.primaryDegree) : that.primaryDegree != null)
            return false;
        if (secondaryDegree != null ? !secondaryDegree.equals(that.secondaryDegree) : that.secondaryDegree != null)
            return false;
        if (emailAddress != null ? !emailAddress.equals(that.emailAddress) : that.emailAddress != null) return false;
        if (altEmailAddress != null ? !altEmailAddress.equals(that.altEmailAddress) : that.altEmailAddress != null)
            return false;
        if (userLicense != null ? !userLicense.equals(that.userLicense) : that.userLicense != null) return false;
        if (addressLine1 != null ? !addressLine1.equals(that.addressLine1) : that.addressLine1 != null) return false;
        if (addressLine2 != null ? !addressLine2.equals(that.addressLine2) : that.addressLine2 != null) return false;
        if (suite != null ? !suite.equals(that.suite) : that.suite != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (zipCode != null ? !zipCode.equals(that.zipCode) : that.zipCode != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (phone1Ext != null ? !phone1Ext.equals(that.phone1Ext) : that.phone1Ext != null) return false;
        if (phone2Ext != null ? !phone2Ext.equals(that.phone2Ext) : that.phone2Ext != null) return false;
        if (faxExt != null ? !faxExt.equals(that.faxExt) : that.faxExt != null) return false;
        if (vendorKey != null ? !vendorKey.equals(that.vendorKey) : that.vendorKey != null) return false;
        if (addUserName != null ? !addUserName.equals(that.addUserName) : that.addUserName != null) return false;
        if (addProgramName != null ? !addProgramName.equals(that.addProgramName) : that.addProgramName != null)
            return false;
        if (chgUserName != null ? !chgUserName.equals(that.chgUserName) : that.chgUserName != null) return false;
        return chgProgramName != null ? chgProgramName.equals(that.chgProgramName) : that.chgProgramName == null;
    }

    @Override
    public int hashCode() {
        int result = prescriberKey != null ? prescriberKey.hashCode() : 0;
        result = 31 * result + (originCode != null ? originCode.hashCode() : 0);
        result = 31 * result + (loadSource != null ? loadSource.hashCode() : 0);
        result = 31 * result + retirementDate;
        result = 31 * result + (deaPrefix != null ? deaPrefix.hashCode() : 0);
        result = 31 * result + (deaCode != null ? deaCode.hashCode() : 0);
        result = 31 * result + (deaSuffix != null ? deaSuffix.hashCode() : 0);
        result = 31 * result + (busnActvSubCode != null ? busnActvSubCode.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (middleInitial != null ? middleInitial.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (nameSuffix != null ? nameSuffix.hashCode() : 0);
        result = 31 * result + (primaryDegree != null ? primaryDegree.hashCode() : 0);
        result = 31 * result + (secondaryDegree != null ? secondaryDegree.hashCode() : 0);
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (altEmailAddress != null ? altEmailAddress.hashCode() : 0);
        result = 31 * result + (userLicense != null ? userLicense.hashCode() : 0);
        result = 31 * result + (addressLine1 != null ? addressLine1.hashCode() : 0);
        result = 31 * result + (addressLine2 != null ? addressLine2.hashCode() : 0);
        result = 31 * result + (suite != null ? suite.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + phone1;
        result = 31 * result + (phone1Ext != null ? phone1Ext.hashCode() : 0);
        result = 31 * result + phone2;
        result = 31 * result + (phone2Ext != null ? phone2Ext.hashCode() : 0);
        result = 31 * result + fax;
        result = 31 * result + (faxExt != null ? faxExt.hashCode() : 0);
        result = 31 * result + dateOfBirth;
        result = 31 * result + deaRenewalDate;
        result = 31 * result + deaExpiredDate;
        result = 31 * result + (vendorKey != null ? vendorKey.hashCode() : 0);
        result = 31 * result + dateOfDeath;
        result = 31 * result + (addUserName != null ? addUserName.hashCode() : 0);
        result = 31 * result + addDate;
        result = 31 * result + addTime;
        result = 31 * result + (addProgramName != null ? addProgramName.hashCode() : 0);
        result = 31 * result + (chgUserName != null ? chgUserName.hashCode() : 0);
        result = 31 * result + chgDate;
        result = 31 * result + chgTime;
        result = 31 * result + (chgProgramName != null ? chgProgramName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PhyPrescriber{" +
                "prescriberKey='" + prescriberKey + '\'' +
                ", originCode='" + originCode + '\'' +
                ", loadSource='" + loadSource + '\'' +
                ", retirementDate=" + retirementDate +
                ", deaPrefix='" + deaPrefix + '\'' +
                ", deaCode='" + deaCode + '\'' +
                ", deaSuffix='" + deaSuffix + '\'' +
                ", busnActvSubCode='" + busnActvSubCode + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleInitial='" + middleInitial + '\'' +
                ", middleName='" + middleName + '\'' +
                ", nameSuffix='" + nameSuffix + '\'' +
                ", primaryDegree='" + primaryDegree + '\'' +
                ", secondaryDegree='" + secondaryDegree + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", altEmailAddress='" + altEmailAddress + '\'' +
                ", userLicense='" + userLicense + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", suite='" + suite + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                ", phone1=" + phone1 +
                ", phone1Ext='" + phone1Ext + '\'' +
                ", phone2=" + phone2 +
                ", phone2Ext='" + phone2Ext + '\'' +
                ", fax=" + fax +
                ", faxExt='" + faxExt + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", deaRenewalDate=" + deaRenewalDate +
                ", deaExpiredDate=" + deaExpiredDate +
                ", vendorKey='" + vendorKey + '\'' +
                ", dateOfDeath=" + dateOfDeath +
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
