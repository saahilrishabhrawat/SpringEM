package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by bkocinsk on 8/9/2018.
 */
@Entity
@Table(name = "ELG_ELIG_GROUP_DEFAULTS_EGD")
@IdClass(ElgEligGroupDefaultsEgdPK.class)
public class ElgEligGroupDefaultsEgd {
    private String carCarrierId;
    private String accountId;
    private String groupId;
    private String egdGroupNameInd;
    private String egdGroupName;
    private String egdAddressInd;
    private String egdAddress1;
    private String egdAddress2;
    private String egdCity;
    private String egdState;
    private String egdZip;
    private String egdZip2;
    private String egdZip3;
    private String egdCountryCode;
    private String egdPhoneInd;
    private long egdPhone;
    private String egdContactInd;
    private String egdContact;
    private String egdRenewalDtInd;
    private Date egdRenewalDate;
    private String egdSicCodeInd;
    private String egdSicCode;
    private String egdEffDateInd;
    private Date egdEffectiveDate;
    private String egdThruDateInd;
    private Date egdThruDate;
    private int egdThruDays;
    private String egdBrandCopayInd;
    private BigDecimal egdBrandCopay;
    private String egdGenericInd;
    private BigDecimal egdGenericCopay;
    private String egdCopay3Ind;
    private BigDecimal egdCopay3;
    private String egdCopay4Ind;
    private BigDecimal egdCopay4;
    private BigDecimal egdCopay5;
    private String egdCopay5Ind;
    private BigDecimal egdCopay6;
    private String egdCopay6Ind;
    private BigDecimal egdCopay7;
    private String egdCopay7Ind;
    private BigDecimal egdCopay8;
    private String egdCopay8Ind;
    private String egdBenefitCdInd;
    private String egdBenefitCode1;
    private String egdPlanInd;
    private String planCode;
    private Date planEffDate;
    private String egdContractDateInd;
    private Date egdContractDate;
    private String egdLanguageCodeInd;
    private String egdLanguageCode;
    private String egdRenewalDteValidate;
    private String egdCardLogoInd;
    private String egdCardLogo;
    private String egdCardDataInd;
    private String egdAltAddrCode;
    private String egdCardText1Ind;
    private String egdCardText1;
    private String egdCardText2Ind;
    private String egdCardText2;
    private String egdCardText3Ind;
    private String egdCardText3;
    private String egdCardText4Ind;
    private String egdCardText4;
    private String egdDepAgeFromDateInd;
    private Date egdDepAgeFromDate;
    private String egdDepAgeThruDateInd;
    private Date egdDepAgeThruDate;
    private BigInteger egdDepAgeMax;
    private String egdDepDateQualifier;
    private String egdDepEligibilityQual;
    private BigInteger egdStudentAgeMax;
    private String egdStudentAgeDateQual;
    private String egdStudentAgeEligQual;
    private BigInteger egdOtherAge;
    private String egdOtherDateQualifier;
    private String egdOtherEligQualifier;
    private String egdClientDefindDataIn;
    private String egdPlanEligValidation;
    private String egdSuppressPlanMsgInd;
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
    @Column(name = "EGD_GROUP_NAME_IND")
    public String getEgdGroupNameInd() {
        return egdGroupNameInd;
    }

    public void setEgdGroupNameInd(String egdGroupNameInd) {
        this.egdGroupNameInd = egdGroupNameInd;
    }

    @Basic
    @Column(name = "EGD_GROUP_NAME")
    public String getEgdGroupName() {
        return egdGroupName;
    }

    public void setEgdGroupName(String egdGroupName) {
        this.egdGroupName = egdGroupName;
    }

    @Basic
    @Column(name = "EGD_ADDRESS_IND")
    public String getEgdAddressInd() {
        return egdAddressInd;
    }

    public void setEgdAddressInd(String egdAddressInd) {
        this.egdAddressInd = egdAddressInd;
    }

    @Basic
    @Column(name = "EGD_ADDRESS_1")
    public String getEgdAddress1() {
        return egdAddress1;
    }

    public void setEgdAddress1(String egdAddress1) {
        this.egdAddress1 = egdAddress1;
    }

    @Basic
    @Column(name = "EGD_ADDRESS_2")
    public String getEgdAddress2() {
        return egdAddress2;
    }

    public void setEgdAddress2(String egdAddress2) {
        this.egdAddress2 = egdAddress2;
    }

    @Basic
    @Column(name = "EGD_CITY")
    public String getEgdCity() {
        return egdCity;
    }

    public void setEgdCity(String egdCity) {
        this.egdCity = egdCity;
    }

    @Basic
    @Column(name = "EGD_STATE")
    public String getEgdState() {
        return egdState;
    }

    public void setEgdState(String egdState) {
        this.egdState = egdState;
    }

    @Basic
    @Column(name = "EGD_ZIP")
    public String getEgdZip() {
        return egdZip;
    }

    public void setEgdZip(String egdZip) {
        this.egdZip = egdZip;
    }

    @Basic
    @Column(name = "EGD_ZIP2")
    public String getEgdZip2() {
        return egdZip2;
    }

    public void setEgdZip2(String egdZip2) {
        this.egdZip2 = egdZip2;
    }

    @Basic
    @Column(name = "EGD_ZIP3")
    public String getEgdZip3() {
        return egdZip3;
    }

    public void setEgdZip3(String egdZip3) {
        this.egdZip3 = egdZip3;
    }

    @Basic
    @Column(name = "EGD_COUNTRY_CODE")
    public String getEgdCountryCode() {
        return egdCountryCode;
    }

    public void setEgdCountryCode(String egdCountryCode) {
        this.egdCountryCode = egdCountryCode;
    }

    @Basic
    @Column(name = "EGD_PHONE_IND")
    public String getEgdPhoneInd() {
        return egdPhoneInd;
    }

    public void setEgdPhoneInd(String egdPhoneInd) {
        this.egdPhoneInd = egdPhoneInd;
    }

    @Basic
    @Column(name = "EGD_PHONE")
    public long getEgdPhone() {
        return egdPhone;
    }

    public void setEgdPhone(long egdPhone) {
        this.egdPhone = egdPhone;
    }

    @Basic
    @Column(name = "EGD_CONTACT_IND")
    public String getEgdContactInd() {
        return egdContactInd;
    }

    public void setEgdContactInd(String egdContactInd) {
        this.egdContactInd = egdContactInd;
    }

    @Basic
    @Column(name = "EGD_CONTACT")
    public String getEgdContact() {
        return egdContact;
    }

    public void setEgdContact(String egdContact) {
        this.egdContact = egdContact;
    }

    @Basic
    @Column(name = "EGD_RENEWAL_DT_IND")
    public String getEgdRenewalDtInd() {
        return egdRenewalDtInd;
    }

    public void setEgdRenewalDtInd(String egdRenewalDtInd) {
        this.egdRenewalDtInd = egdRenewalDtInd;
    }

    @Basic
    @Column(name = "EGD_RENEWAL_DATE")
    public Date getEgdRenewalDate() {
        return egdRenewalDate;
    }

    public void setEgdRenewalDate(Date egdRenewalDate) {
        this.egdRenewalDate = egdRenewalDate;
    }

    @Basic
    @Column(name = "EGD_SIC_CODE_IND")
    public String getEgdSicCodeInd() {
        return egdSicCodeInd;
    }

    public void setEgdSicCodeInd(String egdSicCodeInd) {
        this.egdSicCodeInd = egdSicCodeInd;
    }

    @Basic
    @Column(name = "EGD_SIC_CODE")
    public String getEgdSicCode() {
        return egdSicCode;
    }

    public void setEgdSicCode(String egdSicCode) {
        this.egdSicCode = egdSicCode;
    }

    @Basic
    @Column(name = "EGD_EFF_DATE_IND")
    public String getEgdEffDateInd() {
        return egdEffDateInd;
    }

    public void setEgdEffDateInd(String egdEffDateInd) {
        this.egdEffDateInd = egdEffDateInd;
    }

    @Basic
    @Column(name = "EGD_EFFECTIVE_DATE")
    public Date getEgdEffectiveDate() {
        return egdEffectiveDate;
    }

    public void setEgdEffectiveDate(Date egdEffectiveDate) {
        this.egdEffectiveDate = egdEffectiveDate;
    }

    @Basic
    @Column(name = "EGD_THRU_DATE_IND")
    public String getEgdThruDateInd() {
        return egdThruDateInd;
    }

    public void setEgdThruDateInd(String egdThruDateInd) {
        this.egdThruDateInd = egdThruDateInd;
    }

    @Basic
    @Column(name = "EGD_THRU_DATE")
    public Date getEgdThruDate() {
        return egdThruDate;
    }

    public void setEgdThruDate(Date egdThruDate) {
        this.egdThruDate = egdThruDate;
    }

    @Basic
    @Column(name = "EGD_THRU_DAYS")
    public int getEgdThruDays() {
        return egdThruDays;
    }

    public void setEgdThruDays(int egdThruDays) {
        this.egdThruDays = egdThruDays;
    }

    @Basic
    @Column(name = "EGD_BRAND_COPAY_IND")
    public String getEgdBrandCopayInd() {
        return egdBrandCopayInd;
    }

    public void setEgdBrandCopayInd(String egdBrandCopayInd) {
        this.egdBrandCopayInd = egdBrandCopayInd;
    }

    @Basic
    @Column(name = "EGD_BRAND_COPAY")
    public BigDecimal getEgdBrandCopay() {
        return egdBrandCopay;
    }

    public void setEgdBrandCopay(BigDecimal egdBrandCopay) {
        this.egdBrandCopay = egdBrandCopay;
    }

    @Basic
    @Column(name = "EGD_GENERIC_IND")
    public String getEgdGenericInd() {
        return egdGenericInd;
    }

    public void setEgdGenericInd(String egdGenericInd) {
        this.egdGenericInd = egdGenericInd;
    }

    @Basic
    @Column(name = "EGD_GENERIC_COPAY")
    public BigDecimal getEgdGenericCopay() {
        return egdGenericCopay;
    }

    public void setEgdGenericCopay(BigDecimal egdGenericCopay) {
        this.egdGenericCopay = egdGenericCopay;
    }

    @Basic
    @Column(name = "EGD_COPAY_3_IND")
    public String getEgdCopay3Ind() {
        return egdCopay3Ind;
    }

    public void setEgdCopay3Ind(String egdCopay3Ind) {
        this.egdCopay3Ind = egdCopay3Ind;
    }

    @Basic
    @Column(name = "EGD_COPAY_3")
    public BigDecimal getEgdCopay3() {
        return egdCopay3;
    }

    public void setEgdCopay3(BigDecimal egdCopay3) {
        this.egdCopay3 = egdCopay3;
    }

    @Basic
    @Column(name = "EGD_COPAY_4_IND")
    public String getEgdCopay4Ind() {
        return egdCopay4Ind;
    }

    public void setEgdCopay4Ind(String egdCopay4Ind) {
        this.egdCopay4Ind = egdCopay4Ind;
    }

    @Basic
    @Column(name = "EGD_COPAY_4")
    public BigDecimal getEgdCopay4() {
        return egdCopay4;
    }

    public void setEgdCopay4(BigDecimal egdCopay4) {
        this.egdCopay4 = egdCopay4;
    }

    @Basic
    @Column(name = "EGD_COPAY_5")
    public BigDecimal getEgdCopay5() {
        return egdCopay5;
    }

    public void setEgdCopay5(BigDecimal egdCopay5) {
        this.egdCopay5 = egdCopay5;
    }

    @Basic
    @Column(name = "EGD_COPAY_5_IND")
    public String getEgdCopay5Ind() {
        return egdCopay5Ind;
    }

    public void setEgdCopay5Ind(String egdCopay5Ind) {
        this.egdCopay5Ind = egdCopay5Ind;
    }

    @Basic
    @Column(name = "EGD_COPAY_6")
    public BigDecimal getEgdCopay6() {
        return egdCopay6;
    }

    public void setEgdCopay6(BigDecimal egdCopay6) {
        this.egdCopay6 = egdCopay6;
    }

    @Basic
    @Column(name = "EGD_COPAY_6_IND")
    public String getEgdCopay6Ind() {
        return egdCopay6Ind;
    }

    public void setEgdCopay6Ind(String egdCopay6Ind) {
        this.egdCopay6Ind = egdCopay6Ind;
    }

    @Basic
    @Column(name = "EGD_COPAY_7")
    public BigDecimal getEgdCopay7() {
        return egdCopay7;
    }

    public void setEgdCopay7(BigDecimal egdCopay7) {
        this.egdCopay7 = egdCopay7;
    }

    @Basic
    @Column(name = "EGD_COPAY_7_IND")
    public String getEgdCopay7Ind() {
        return egdCopay7Ind;
    }

    public void setEgdCopay7Ind(String egdCopay7Ind) {
        this.egdCopay7Ind = egdCopay7Ind;
    }

    @Basic
    @Column(name = "EGD_COPAY_8")
    public BigDecimal getEgdCopay8() {
        return egdCopay8;
    }

    public void setEgdCopay8(BigDecimal egdCopay8) {
        this.egdCopay8 = egdCopay8;
    }

    @Basic
    @Column(name = "EGD_COPAY_8_IND")
    public String getEgdCopay8Ind() {
        return egdCopay8Ind;
    }

    public void setEgdCopay8Ind(String egdCopay8Ind) {
        this.egdCopay8Ind = egdCopay8Ind;
    }

    @Basic
    @Column(name = "EGD_BENEFIT_CD_IND")
    public String getEgdBenefitCdInd() {
        return egdBenefitCdInd;
    }

    public void setEgdBenefitCdInd(String egdBenefitCdInd) {
        this.egdBenefitCdInd = egdBenefitCdInd;
    }

    @Basic
    @Column(name = "EGD_BENEFIT_CODE_1")
    public String getEgdBenefitCode1() {
        return egdBenefitCode1;
    }

    public void setEgdBenefitCode1(String egdBenefitCode1) {
        this.egdBenefitCode1 = egdBenefitCode1;
    }

    @Basic
    @Column(name = "EGD_PLAN_IND")
    public String getEgdPlanInd() {
        return egdPlanInd;
    }

    public void setEgdPlanInd(String egdPlanInd) {
        this.egdPlanInd = egdPlanInd;
    }

    @Basic
    @Column(name = "PLAN_CODE")
    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    @Basic
    @Column(name = "PLAN_EFF_DATE")
    public Date getPlanEffDate() {
        return planEffDate;
    }

    public void setPlanEffDate(Date planEffDate) {
        this.planEffDate = planEffDate;
    }

    @Basic
    @Column(name = "EGD_CONTRACT_DATE_IND")
    public String getEgdContractDateInd() {
        return egdContractDateInd;
    }

    public void setEgdContractDateInd(String egdContractDateInd) {
        this.egdContractDateInd = egdContractDateInd;
    }

    @Basic
    @Column(name = "EGD_CONTRACT_DATE")
    public Date getEgdContractDate() {
        return egdContractDate;
    }

    public void setEgdContractDate(Date egdContractDate) {
        this.egdContractDate = egdContractDate;
    }

    @Basic
    @Column(name = "EGD_LANGUAGE_CODE_IND")
    public String getEgdLanguageCodeInd() {
        return egdLanguageCodeInd;
    }

    public void setEgdLanguageCodeInd(String egdLanguageCodeInd) {
        this.egdLanguageCodeInd = egdLanguageCodeInd;
    }

    @Basic
    @Column(name = "EGD_LANGUAGE_CODE")
    public String getEgdLanguageCode() {
        return egdLanguageCode;
    }

    public void setEgdLanguageCode(String egdLanguageCode) {
        this.egdLanguageCode = egdLanguageCode;
    }

    @Basic
    @Column(name = "EGD_RENEWAL_DTE_VALIDATE")
    public String getEgdRenewalDteValidate() {
        return egdRenewalDteValidate;
    }

    public void setEgdRenewalDteValidate(String egdRenewalDteValidate) {
        this.egdRenewalDteValidate = egdRenewalDteValidate;
    }

    @Basic
    @Column(name = "EGD_CARD_LOGO_IND")
    public String getEgdCardLogoInd() {
        return egdCardLogoInd;
    }

    public void setEgdCardLogoInd(String egdCardLogoInd) {
        this.egdCardLogoInd = egdCardLogoInd;
    }

    @Basic
    @Column(name = "EGD_CARD_LOGO")
    public String getEgdCardLogo() {
        return egdCardLogo;
    }

    public void setEgdCardLogo(String egdCardLogo) {
        this.egdCardLogo = egdCardLogo;
    }

    @Basic
    @Column(name = "EGD_CARD_DATA_IND")
    public String getEgdCardDataInd() {
        return egdCardDataInd;
    }

    public void setEgdCardDataInd(String egdCardDataInd) {
        this.egdCardDataInd = egdCardDataInd;
    }

    @Basic
    @Column(name = "EGD_ALT_ADDR_CODE")
    public String getEgdAltAddrCode() {
        return egdAltAddrCode;
    }

    public void setEgdAltAddrCode(String egdAltAddrCode) {
        this.egdAltAddrCode = egdAltAddrCode;
    }

    @Basic
    @Column(name = "EGD_CARD_TEXT_1_IND")
    public String getEgdCardText1Ind() {
        return egdCardText1Ind;
    }

    public void setEgdCardText1Ind(String egdCardText1Ind) {
        this.egdCardText1Ind = egdCardText1Ind;
    }

    @Basic
    @Column(name = "EGD_CARD_TEXT_1")
    public String getEgdCardText1() {
        return egdCardText1;
    }

    public void setEgdCardText1(String egdCardText1) {
        this.egdCardText1 = egdCardText1;
    }

    @Basic
    @Column(name = "EGD_CARD_TEXT_2_IND")
    public String getEgdCardText2Ind() {
        return egdCardText2Ind;
    }

    public void setEgdCardText2Ind(String egdCardText2Ind) {
        this.egdCardText2Ind = egdCardText2Ind;
    }

    @Basic
    @Column(name = "EGD_CARD_TEXT_2")
    public String getEgdCardText2() {
        return egdCardText2;
    }

    public void setEgdCardText2(String egdCardText2) {
        this.egdCardText2 = egdCardText2;
    }

    @Basic
    @Column(name = "EGD_CARD_TEXT_3_IND")
    public String getEgdCardText3Ind() {
        return egdCardText3Ind;
    }

    public void setEgdCardText3Ind(String egdCardText3Ind) {
        this.egdCardText3Ind = egdCardText3Ind;
    }

    @Basic
    @Column(name = "EGD_CARD_TEXT_3")
    public String getEgdCardText3() {
        return egdCardText3;
    }

    public void setEgdCardText3(String egdCardText3) {
        this.egdCardText3 = egdCardText3;
    }

    @Basic
    @Column(name = "EGD_CARD_TEXT_4_IND")
    public String getEgdCardText4Ind() {
        return egdCardText4Ind;
    }

    public void setEgdCardText4Ind(String egdCardText4Ind) {
        this.egdCardText4Ind = egdCardText4Ind;
    }

    @Basic
    @Column(name = "EGD_CARD_TEXT_4")
    public String getEgdCardText4() {
        return egdCardText4;
    }

    public void setEgdCardText4(String egdCardText4) {
        this.egdCardText4 = egdCardText4;
    }

    @Basic
    @Column(name = "EGD_DEP_AGE_FROM_DATE_IND")
    public String getEgdDepAgeFromDateInd() {
        return egdDepAgeFromDateInd;
    }

    public void setEgdDepAgeFromDateInd(String egdDepAgeFromDateInd) {
        this.egdDepAgeFromDateInd = egdDepAgeFromDateInd;
    }

    @Basic
    @Column(name = "EGD_DEP_AGE_FROM_DATE")
    public Date getEgdDepAgeFromDate() {
        return egdDepAgeFromDate;
    }

    public void setEgdDepAgeFromDate(Date egdDepAgeFromDate) {
        this.egdDepAgeFromDate = egdDepAgeFromDate;
    }

    @Basic
    @Column(name = "EGD_DEP_AGE_THRU_DATE_IND")
    public String getEgdDepAgeThruDateInd() {
        return egdDepAgeThruDateInd;
    }

    public void setEgdDepAgeThruDateInd(String egdDepAgeThruDateInd) {
        this.egdDepAgeThruDateInd = egdDepAgeThruDateInd;
    }

    @Basic
    @Column(name = "EGD_DEP_AGE_THRU_DATE")
    public Date getEgdDepAgeThruDate() {
        return egdDepAgeThruDate;
    }

    public void setEgdDepAgeThruDate(Date egdDepAgeThruDate) {
        this.egdDepAgeThruDate = egdDepAgeThruDate;
    }

    @Basic
    @Column(name = "EGD_DEP_AGE_MAX")
    public BigInteger getEgdDepAgeMax() {
        return egdDepAgeMax;
    }

    public void setEgdDepAgeMax(BigInteger egdDepAgeMax) {
        this.egdDepAgeMax = egdDepAgeMax;
    }

    @Basic
    @Column(name = "EGD_DEP_DATE_QUALIFIER")
    public String getEgdDepDateQualifier() {
        return egdDepDateQualifier;
    }

    public void setEgdDepDateQualifier(String egdDepDateQualifier) {
        this.egdDepDateQualifier = egdDepDateQualifier;
    }

    @Basic
    @Column(name = "EGD_DEP_ELIGIBILITY_QUAL")
    public String getEgdDepEligibilityQual() {
        return egdDepEligibilityQual;
    }

    public void setEgdDepEligibilityQual(String egdDepEligibilityQual) {
        this.egdDepEligibilityQual = egdDepEligibilityQual;
    }

    @Basic
    @Column(name = "EGD_STUDENT_AGE_MAX")
    public BigInteger getEgdStudentAgeMax() {
        return egdStudentAgeMax;
    }

    public void setEgdStudentAgeMax(BigInteger egdStudentAgeMax) {
        this.egdStudentAgeMax = egdStudentAgeMax;
    }

    @Basic
    @Column(name = "EGD_STUDENT_AGE_DATE_QUAL")
    public String getEgdStudentAgeDateQual() {
        return egdStudentAgeDateQual;
    }

    public void setEgdStudentAgeDateQual(String egdStudentAgeDateQual) {
        this.egdStudentAgeDateQual = egdStudentAgeDateQual;
    }

    @Basic
    @Column(name = "EGD_STUDENT_AGE_ELIG_QUAL")
    public String getEgdStudentAgeEligQual() {
        return egdStudentAgeEligQual;
    }

    public void setEgdStudentAgeEligQual(String egdStudentAgeEligQual) {
        this.egdStudentAgeEligQual = egdStudentAgeEligQual;
    }

    @Basic
    @Column(name = "EGD_OTHER_AGE")
    public BigInteger getEgdOtherAge() {
        return egdOtherAge;
    }

    public void setEgdOtherAge(BigInteger egdOtherAge) {
        this.egdOtherAge = egdOtherAge;
    }

    @Basic
    @Column(name = "EGD_OTHER_DATE_QUALIFIER")
    public String getEgdOtherDateQualifier() {
        return egdOtherDateQualifier;
    }

    public void setEgdOtherDateQualifier(String egdOtherDateQualifier) {
        this.egdOtherDateQualifier = egdOtherDateQualifier;
    }

    @Basic
    @Column(name = "EGD_OTHER_ELIG_QUALIFIER")
    public String getEgdOtherEligQualifier() {
        return egdOtherEligQualifier;
    }

    public void setEgdOtherEligQualifier(String egdOtherEligQualifier) {
        this.egdOtherEligQualifier = egdOtherEligQualifier;
    }

    @Basic
    @Column(name = "EGD_CLIENT_DEFIND_DATA_IN")
    public String getEgdClientDefindDataIn() {
        return egdClientDefindDataIn;
    }

    public void setEgdClientDefindDataIn(String egdClientDefindDataIn) {
        this.egdClientDefindDataIn = egdClientDefindDataIn;
    }

    @Basic
    @Column(name = "EGD_PLAN_ELIG_VALIDATION")
    public String getEgdPlanEligValidation() {
        return egdPlanEligValidation;
    }

    public void setEgdPlanEligValidation(String egdPlanEligValidation) {
        this.egdPlanEligValidation = egdPlanEligValidation;
    }

    @Basic
    @Column(name = "EGD_SUPPRESS_PLAN_MSG_IND")
    public String getEgdSuppressPlanMsgInd() {
        return egdSuppressPlanMsgInd;
    }

    public void setEgdSuppressPlanMsgInd(String egdSuppressPlanMsgInd) {
        this.egdSuppressPlanMsgInd = egdSuppressPlanMsgInd;
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

    /* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((addDate == null) ? 0 : addDate.hashCode());
		result = prime * result + ((addProgramName == null) ? 0 : addProgramName.hashCode());
		result = prime * result + ((addTime == null) ? 0 : addTime.hashCode());
		result = prime * result + ((addUserName == null) ? 0 : addUserName.hashCode());
		result = prime * result + ((carCarrierId == null) ? 0 : carCarrierId.hashCode());
		result = prime * result + ((chgDate == null) ? 0 : chgDate.hashCode());
		result = prime * result + ((chgProgramName == null) ? 0 : chgProgramName.hashCode());
		result = prime * result + ((chgTime == null) ? 0 : chgTime.hashCode());
		result = prime * result + ((chgUserName == null) ? 0 : chgUserName.hashCode());
		result = prime * result + ((egdAddress1 == null) ? 0 : egdAddress1.hashCode());
		result = prime * result + ((egdAddress2 == null) ? 0 : egdAddress2.hashCode());
		result = prime * result + ((egdAddressInd == null) ? 0 : egdAddressInd.hashCode());
		result = prime * result + ((egdAltAddrCode == null) ? 0 : egdAltAddrCode.hashCode());
		result = prime * result + ((egdBenefitCdInd == null) ? 0 : egdBenefitCdInd.hashCode());
		result = prime * result + ((egdBenefitCode1 == null) ? 0 : egdBenefitCode1.hashCode());
		result = prime * result + ((egdBrandCopay == null) ? 0 : egdBrandCopay.hashCode());
		result = prime * result + ((egdBrandCopayInd == null) ? 0 : egdBrandCopayInd.hashCode());
		result = prime * result + ((egdCardDataInd == null) ? 0 : egdCardDataInd.hashCode());
		result = prime * result + ((egdCardLogo == null) ? 0 : egdCardLogo.hashCode());
		result = prime * result + ((egdCardLogoInd == null) ? 0 : egdCardLogoInd.hashCode());
		result = prime * result + ((egdCardText1 == null) ? 0 : egdCardText1.hashCode());
		result = prime * result + ((egdCardText1Ind == null) ? 0 : egdCardText1Ind.hashCode());
		result = prime * result + ((egdCardText2 == null) ? 0 : egdCardText2.hashCode());
		result = prime * result + ((egdCardText2Ind == null) ? 0 : egdCardText2Ind.hashCode());
		result = prime * result + ((egdCardText3 == null) ? 0 : egdCardText3.hashCode());
		result = prime * result + ((egdCardText3Ind == null) ? 0 : egdCardText3Ind.hashCode());
		result = prime * result + ((egdCardText4 == null) ? 0 : egdCardText4.hashCode());
		result = prime * result + ((egdCardText4Ind == null) ? 0 : egdCardText4Ind.hashCode());
		result = prime * result + ((egdCity == null) ? 0 : egdCity.hashCode());
		result = prime * result + ((egdClientDefindDataIn == null) ? 0 : egdClientDefindDataIn.hashCode());
		result = prime * result + ((egdContact == null) ? 0 : egdContact.hashCode());
		result = prime * result + ((egdContactInd == null) ? 0 : egdContactInd.hashCode());
		result = prime * result + ((egdContractDate == null) ? 0 : egdContractDate.hashCode());
		result = prime * result + ((egdContractDateInd == null) ? 0 : egdContractDateInd.hashCode());
		result = prime * result + ((egdCopay3 == null) ? 0 : egdCopay3.hashCode());
		result = prime * result + ((egdCopay3Ind == null) ? 0 : egdCopay3Ind.hashCode());
		result = prime * result + ((egdCopay4 == null) ? 0 : egdCopay4.hashCode());
		result = prime * result + ((egdCopay4Ind == null) ? 0 : egdCopay4Ind.hashCode());
		result = prime * result + ((egdCopay5 == null) ? 0 : egdCopay5.hashCode());
		result = prime * result + ((egdCopay5Ind == null) ? 0 : egdCopay5Ind.hashCode());
		result = prime * result + ((egdCopay6 == null) ? 0 : egdCopay6.hashCode());
		result = prime * result + ((egdCopay6Ind == null) ? 0 : egdCopay6Ind.hashCode());
		result = prime * result + ((egdCopay7 == null) ? 0 : egdCopay7.hashCode());
		result = prime * result + ((egdCopay7Ind == null) ? 0 : egdCopay7Ind.hashCode());
		result = prime * result + ((egdCopay8 == null) ? 0 : egdCopay8.hashCode());
		result = prime * result + ((egdCopay8Ind == null) ? 0 : egdCopay8Ind.hashCode());
		result = prime * result + ((egdCountryCode == null) ? 0 : egdCountryCode.hashCode());
		result = prime * result + ((egdDepAgeFromDate == null) ? 0 : egdDepAgeFromDate.hashCode());
		result = prime * result + ((egdDepAgeFromDateInd == null) ? 0 : egdDepAgeFromDateInd.hashCode());
		result = prime * result + ((egdDepAgeMax == null) ? 0 : egdDepAgeMax.hashCode());
		result = prime * result + ((egdDepAgeThruDate == null) ? 0 : egdDepAgeThruDate.hashCode());
		result = prime * result + ((egdDepAgeThruDateInd == null) ? 0 : egdDepAgeThruDateInd.hashCode());
		result = prime * result + ((egdDepDateQualifier == null) ? 0 : egdDepDateQualifier.hashCode());
		result = prime * result + ((egdDepEligibilityQual == null) ? 0 : egdDepEligibilityQual.hashCode());
		result = prime * result + ((egdEffDateInd == null) ? 0 : egdEffDateInd.hashCode());
		result = prime * result + ((egdEffectiveDate == null) ? 0 : egdEffectiveDate.hashCode());
		result = prime * result + ((egdGenericCopay == null) ? 0 : egdGenericCopay.hashCode());
		result = prime * result + ((egdGenericInd == null) ? 0 : egdGenericInd.hashCode());
		result = prime * result + ((egdGroupName == null) ? 0 : egdGroupName.hashCode());
		result = prime * result + ((egdGroupNameInd == null) ? 0 : egdGroupNameInd.hashCode());
		result = prime * result + ((egdLanguageCode == null) ? 0 : egdLanguageCode.hashCode());
		result = prime * result + ((egdLanguageCodeInd == null) ? 0 : egdLanguageCodeInd.hashCode());
		result = prime * result + ((egdOtherAge == null) ? 0 : egdOtherAge.hashCode());
		result = prime * result + ((egdOtherDateQualifier == null) ? 0 : egdOtherDateQualifier.hashCode());
		result = prime * result + ((egdOtherEligQualifier == null) ? 0 : egdOtherEligQualifier.hashCode());
		result = prime * result + (int) (egdPhone ^ (egdPhone >>> 32));
		result = prime * result + ((egdPhoneInd == null) ? 0 : egdPhoneInd.hashCode());
		result = prime * result + ((egdPlanEligValidation == null) ? 0 : egdPlanEligValidation.hashCode());
		result = prime * result + ((egdPlanInd == null) ? 0 : egdPlanInd.hashCode());
		result = prime * result + ((egdRenewalDate == null) ? 0 : egdRenewalDate.hashCode());
		result = prime * result + ((egdRenewalDtInd == null) ? 0 : egdRenewalDtInd.hashCode());
		result = prime * result + ((egdRenewalDteValidate == null) ? 0 : egdRenewalDteValidate.hashCode());
		result = prime * result + ((egdSicCode == null) ? 0 : egdSicCode.hashCode());
		result = prime * result + ((egdSicCodeInd == null) ? 0 : egdSicCodeInd.hashCode());
		result = prime * result + ((egdState == null) ? 0 : egdState.hashCode());
		result = prime * result + ((egdStudentAgeDateQual == null) ? 0 : egdStudentAgeDateQual.hashCode());
		result = prime * result + ((egdStudentAgeEligQual == null) ? 0 : egdStudentAgeEligQual.hashCode());
		result = prime * result + ((egdStudentAgeMax == null) ? 0 : egdStudentAgeMax.hashCode());
		result = prime * result + ((egdSuppressPlanMsgInd == null) ? 0 : egdSuppressPlanMsgInd.hashCode());
		result = prime * result + ((egdThruDate == null) ? 0 : egdThruDate.hashCode());
		result = prime * result + ((egdThruDateInd == null) ? 0 : egdThruDateInd.hashCode());
		result = prime * result + egdThruDays;
		result = prime * result + ((egdZip == null) ? 0 : egdZip.hashCode());
		result = prime * result + ((egdZip2 == null) ? 0 : egdZip2.hashCode());
		result = prime * result + ((egdZip3 == null) ? 0 : egdZip3.hashCode());
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
		result = prime * result + ((planCode == null) ? 0 : planCode.hashCode());
		result = prime * result + ((planEffDate == null) ? 0 : planEffDate.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElgEligGroupDefaultsEgd other = (ElgEligGroupDefaultsEgd) obj;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (addDate == null) {
			if (other.addDate != null)
				return false;
		} else if (!addDate.equals(other.addDate))
			return false;
		if (addProgramName == null) {
			if (other.addProgramName != null)
				return false;
		} else if (!addProgramName.equals(other.addProgramName))
			return false;
		if (addTime == null) {
			if (other.addTime != null)
				return false;
		} else if (!addTime.equals(other.addTime))
			return false;
		if (addUserName == null) {
			if (other.addUserName != null)
				return false;
		} else if (!addUserName.equals(other.addUserName))
			return false;
		if (carCarrierId == null) {
			if (other.carCarrierId != null)
				return false;
		} else if (!carCarrierId.equals(other.carCarrierId))
			return false;
		if (chgDate == null) {
			if (other.chgDate != null)
				return false;
		} else if (!chgDate.equals(other.chgDate))
			return false;
		if (chgProgramName == null) {
			if (other.chgProgramName != null)
				return false;
		} else if (!chgProgramName.equals(other.chgProgramName))
			return false;
		if (chgTime == null) {
			if (other.chgTime != null)
				return false;
		} else if (!chgTime.equals(other.chgTime))
			return false;
		if (chgUserName == null) {
			if (other.chgUserName != null)
				return false;
		} else if (!chgUserName.equals(other.chgUserName))
			return false;
		if (egdAddress1 == null) {
			if (other.egdAddress1 != null)
				return false;
		} else if (!egdAddress1.equals(other.egdAddress1))
			return false;
		if (egdAddress2 == null) {
			if (other.egdAddress2 != null)
				return false;
		} else if (!egdAddress2.equals(other.egdAddress2))
			return false;
		if (egdAddressInd == null) {
			if (other.egdAddressInd != null)
				return false;
		} else if (!egdAddressInd.equals(other.egdAddressInd))
			return false;
		if (egdAltAddrCode == null) {
			if (other.egdAltAddrCode != null)
				return false;
		} else if (!egdAltAddrCode.equals(other.egdAltAddrCode))
			return false;
		if (egdBenefitCdInd == null) {
			if (other.egdBenefitCdInd != null)
				return false;
		} else if (!egdBenefitCdInd.equals(other.egdBenefitCdInd))
			return false;
		if (egdBenefitCode1 == null) {
			if (other.egdBenefitCode1 != null)
				return false;
		} else if (!egdBenefitCode1.equals(other.egdBenefitCode1))
			return false;
		if (egdBrandCopay == null) {
			if (other.egdBrandCopay != null)
				return false;
		} else if (!egdBrandCopay.equals(other.egdBrandCopay))
			return false;
		if (egdBrandCopayInd == null) {
			if (other.egdBrandCopayInd != null)
				return false;
		} else if (!egdBrandCopayInd.equals(other.egdBrandCopayInd))
			return false;
		if (egdCardDataInd == null) {
			if (other.egdCardDataInd != null)
				return false;
		} else if (!egdCardDataInd.equals(other.egdCardDataInd))
			return false;
		if (egdCardLogo == null) {
			if (other.egdCardLogo != null)
				return false;
		} else if (!egdCardLogo.equals(other.egdCardLogo))
			return false;
		if (egdCardLogoInd == null) {
			if (other.egdCardLogoInd != null)
				return false;
		} else if (!egdCardLogoInd.equals(other.egdCardLogoInd))
			return false;
		if (egdCardText1 == null) {
			if (other.egdCardText1 != null)
				return false;
		} else if (!egdCardText1.equals(other.egdCardText1))
			return false;
		if (egdCardText1Ind == null) {
			if (other.egdCardText1Ind != null)
				return false;
		} else if (!egdCardText1Ind.equals(other.egdCardText1Ind))
			return false;
		if (egdCardText2 == null) {
			if (other.egdCardText2 != null)
				return false;
		} else if (!egdCardText2.equals(other.egdCardText2))
			return false;
		if (egdCardText2Ind == null) {
			if (other.egdCardText2Ind != null)
				return false;
		} else if (!egdCardText2Ind.equals(other.egdCardText2Ind))
			return false;
		if (egdCardText3 == null) {
			if (other.egdCardText3 != null)
				return false;
		} else if (!egdCardText3.equals(other.egdCardText3))
			return false;
		if (egdCardText3Ind == null) {
			if (other.egdCardText3Ind != null)
				return false;
		} else if (!egdCardText3Ind.equals(other.egdCardText3Ind))
			return false;
		if (egdCardText4 == null) {
			if (other.egdCardText4 != null)
				return false;
		} else if (!egdCardText4.equals(other.egdCardText4))
			return false;
		if (egdCardText4Ind == null) {
			if (other.egdCardText4Ind != null)
				return false;
		} else if (!egdCardText4Ind.equals(other.egdCardText4Ind))
			return false;
		if (egdCity == null) {
			if (other.egdCity != null)
				return false;
		} else if (!egdCity.equals(other.egdCity))
			return false;
		if (egdClientDefindDataIn == null) {
			if (other.egdClientDefindDataIn != null)
				return false;
		} else if (!egdClientDefindDataIn.equals(other.egdClientDefindDataIn))
			return false;
		if (egdContact == null) {
			if (other.egdContact != null)
				return false;
		} else if (!egdContact.equals(other.egdContact))
			return false;
		if (egdContactInd == null) {
			if (other.egdContactInd != null)
				return false;
		} else if (!egdContactInd.equals(other.egdContactInd))
			return false;
		if (egdContractDate == null) {
			if (other.egdContractDate != null)
				return false;
		} else if (!egdContractDate.equals(other.egdContractDate))
			return false;
		if (egdContractDateInd == null) {
			if (other.egdContractDateInd != null)
				return false;
		} else if (!egdContractDateInd.equals(other.egdContractDateInd))
			return false;
		if (egdCopay3 == null) {
			if (other.egdCopay3 != null)
				return false;
		} else if (!egdCopay3.equals(other.egdCopay3))
			return false;
		if (egdCopay3Ind == null) {
			if (other.egdCopay3Ind != null)
				return false;
		} else if (!egdCopay3Ind.equals(other.egdCopay3Ind))
			return false;
		if (egdCopay4 == null) {
			if (other.egdCopay4 != null)
				return false;
		} else if (!egdCopay4.equals(other.egdCopay4))
			return false;
		if (egdCopay4Ind == null) {
			if (other.egdCopay4Ind != null)
				return false;
		} else if (!egdCopay4Ind.equals(other.egdCopay4Ind))
			return false;
		if (egdCopay5 == null) {
			if (other.egdCopay5 != null)
				return false;
		} else if (!egdCopay5.equals(other.egdCopay5))
			return false;
		if (egdCopay5Ind == null) {
			if (other.egdCopay5Ind != null)
				return false;
		} else if (!egdCopay5Ind.equals(other.egdCopay5Ind))
			return false;
		if (egdCopay6 == null) {
			if (other.egdCopay6 != null)
				return false;
		} else if (!egdCopay6.equals(other.egdCopay6))
			return false;
		if (egdCopay6Ind == null) {
			if (other.egdCopay6Ind != null)
				return false;
		} else if (!egdCopay6Ind.equals(other.egdCopay6Ind))
			return false;
		if (egdCopay7 == null) {
			if (other.egdCopay7 != null)
				return false;
		} else if (!egdCopay7.equals(other.egdCopay7))
			return false;
		if (egdCopay7Ind == null) {
			if (other.egdCopay7Ind != null)
				return false;
		} else if (!egdCopay7Ind.equals(other.egdCopay7Ind))
			return false;
		if (egdCopay8 == null) {
			if (other.egdCopay8 != null)
				return false;
		} else if (!egdCopay8.equals(other.egdCopay8))
			return false;
		if (egdCopay8Ind == null) {
			if (other.egdCopay8Ind != null)
				return false;
		} else if (!egdCopay8Ind.equals(other.egdCopay8Ind))
			return false;
		if (egdCountryCode == null) {
			if (other.egdCountryCode != null)
				return false;
		} else if (!egdCountryCode.equals(other.egdCountryCode))
			return false;
		if (egdDepAgeFromDate == null) {
			if (other.egdDepAgeFromDate != null)
				return false;
		} else if (!egdDepAgeFromDate.equals(other.egdDepAgeFromDate))
			return false;
		if (egdDepAgeFromDateInd == null) {
			if (other.egdDepAgeFromDateInd != null)
				return false;
		} else if (!egdDepAgeFromDateInd.equals(other.egdDepAgeFromDateInd))
			return false;
		if (egdDepAgeMax == null) {
			if (other.egdDepAgeMax != null)
				return false;
		} else if (!egdDepAgeMax.equals(other.egdDepAgeMax))
			return false;
		if (egdDepAgeThruDate == null) {
			if (other.egdDepAgeThruDate != null)
				return false;
		} else if (!egdDepAgeThruDate.equals(other.egdDepAgeThruDate))
			return false;
		if (egdDepAgeThruDateInd == null) {
			if (other.egdDepAgeThruDateInd != null)
				return false;
		} else if (!egdDepAgeThruDateInd.equals(other.egdDepAgeThruDateInd))
			return false;
		if (egdDepDateQualifier == null) {
			if (other.egdDepDateQualifier != null)
				return false;
		} else if (!egdDepDateQualifier.equals(other.egdDepDateQualifier))
			return false;
		if (egdDepEligibilityQual == null) {
			if (other.egdDepEligibilityQual != null)
				return false;
		} else if (!egdDepEligibilityQual.equals(other.egdDepEligibilityQual))
			return false;
		if (egdEffDateInd == null) {
			if (other.egdEffDateInd != null)
				return false;
		} else if (!egdEffDateInd.equals(other.egdEffDateInd))
			return false;
		if (egdEffectiveDate == null) {
			if (other.egdEffectiveDate != null)
				return false;
		} else if (!egdEffectiveDate.equals(other.egdEffectiveDate))
			return false;
		if (egdGenericCopay == null) {
			if (other.egdGenericCopay != null)
				return false;
		} else if (!egdGenericCopay.equals(other.egdGenericCopay))
			return false;
		if (egdGenericInd == null) {
			if (other.egdGenericInd != null)
				return false;
		} else if (!egdGenericInd.equals(other.egdGenericInd))
			return false;
		if (egdGroupName == null) {
			if (other.egdGroupName != null)
				return false;
		} else if (!egdGroupName.equals(other.egdGroupName))
			return false;
		if (egdGroupNameInd == null) {
			if (other.egdGroupNameInd != null)
				return false;
		} else if (!egdGroupNameInd.equals(other.egdGroupNameInd))
			return false;
		if (egdLanguageCode == null) {
			if (other.egdLanguageCode != null)
				return false;
		} else if (!egdLanguageCode.equals(other.egdLanguageCode))
			return false;
		if (egdLanguageCodeInd == null) {
			if (other.egdLanguageCodeInd != null)
				return false;
		} else if (!egdLanguageCodeInd.equals(other.egdLanguageCodeInd))
			return false;
		if (egdOtherAge == null) {
			if (other.egdOtherAge != null)
				return false;
		} else if (!egdOtherAge.equals(other.egdOtherAge))
			return false;
		if (egdOtherDateQualifier == null) {
			if (other.egdOtherDateQualifier != null)
				return false;
		} else if (!egdOtherDateQualifier.equals(other.egdOtherDateQualifier))
			return false;
		if (egdOtherEligQualifier == null) {
			if (other.egdOtherEligQualifier != null)
				return false;
		} else if (!egdOtherEligQualifier.equals(other.egdOtherEligQualifier))
			return false;
		if (egdPhone != other.egdPhone)
			return false;
		if (egdPhoneInd == null) {
			if (other.egdPhoneInd != null)
				return false;
		} else if (!egdPhoneInd.equals(other.egdPhoneInd))
			return false;
		if (egdPlanEligValidation == null) {
			if (other.egdPlanEligValidation != null)
				return false;
		} else if (!egdPlanEligValidation.equals(other.egdPlanEligValidation))
			return false;
		if (egdPlanInd == null) {
			if (other.egdPlanInd != null)
				return false;
		} else if (!egdPlanInd.equals(other.egdPlanInd))
			return false;
		if (egdRenewalDate == null) {
			if (other.egdRenewalDate != null)
				return false;
		} else if (!egdRenewalDate.equals(other.egdRenewalDate))
			return false;
		if (egdRenewalDtInd == null) {
			if (other.egdRenewalDtInd != null)
				return false;
		} else if (!egdRenewalDtInd.equals(other.egdRenewalDtInd))
			return false;
		if (egdRenewalDteValidate == null) {
			if (other.egdRenewalDteValidate != null)
				return false;
		} else if (!egdRenewalDteValidate.equals(other.egdRenewalDteValidate))
			return false;
		if (egdSicCode == null) {
			if (other.egdSicCode != null)
				return false;
		} else if (!egdSicCode.equals(other.egdSicCode))
			return false;
		if (egdSicCodeInd == null) {
			if (other.egdSicCodeInd != null)
				return false;
		} else if (!egdSicCodeInd.equals(other.egdSicCodeInd))
			return false;
		if (egdState == null) {
			if (other.egdState != null)
				return false;
		} else if (!egdState.equals(other.egdState))
			return false;
		if (egdStudentAgeDateQual == null) {
			if (other.egdStudentAgeDateQual != null)
				return false;
		} else if (!egdStudentAgeDateQual.equals(other.egdStudentAgeDateQual))
			return false;
		if (egdStudentAgeEligQual == null) {
			if (other.egdStudentAgeEligQual != null)
				return false;
		} else if (!egdStudentAgeEligQual.equals(other.egdStudentAgeEligQual))
			return false;
		if (egdStudentAgeMax == null) {
			if (other.egdStudentAgeMax != null)
				return false;
		} else if (!egdStudentAgeMax.equals(other.egdStudentAgeMax))
			return false;
		if (egdSuppressPlanMsgInd == null) {
			if (other.egdSuppressPlanMsgInd != null)
				return false;
		} else if (!egdSuppressPlanMsgInd.equals(other.egdSuppressPlanMsgInd))
			return false;
		if (egdThruDate == null) {
			if (other.egdThruDate != null)
				return false;
		} else if (!egdThruDate.equals(other.egdThruDate))
			return false;
		if (egdThruDateInd == null) {
			if (other.egdThruDateInd != null)
				return false;
		} else if (!egdThruDateInd.equals(other.egdThruDateInd))
			return false;
		if (egdThruDays != other.egdThruDays)
			return false;
		if (egdZip == null) {
			if (other.egdZip != null)
				return false;
		} else if (!egdZip.equals(other.egdZip))
			return false;
		if (egdZip2 == null) {
			if (other.egdZip2 != null)
				return false;
		} else if (!egdZip2.equals(other.egdZip2))
			return false;
		if (egdZip3 == null) {
			if (other.egdZip3 != null)
				return false;
		} else if (!egdZip3.equals(other.egdZip3))
			return false;
		if (groupId == null) {
			if (other.groupId != null)
				return false;
		} else if (!groupId.equals(other.groupId))
			return false;
		if (planCode == null) {
			if (other.planCode != null)
				return false;
		} else if (!planCode.equals(other.planCode))
			return false;
		if (planEffDate == null) {
			if (other.planEffDate != null)
				return false;
		} else if (!planEffDate.equals(other.planEffDate))
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "ElgEligGroupDefaultsEgd{" +
                "carCarrierId='" + carCarrierId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", egdGroupNameInd='" + egdGroupNameInd + '\'' +
                ", egdGroupName='" + egdGroupName + '\'' +
                ", egdAddressInd='" + egdAddressInd + '\'' +
                ", egdAddress1='" + egdAddress1 + '\'' +
                ", egdAddress2='" + egdAddress2 + '\'' +
                ", egdCity='" + egdCity + '\'' +
                ", egdState='" + egdState + '\'' +
                ", egdZip='" + egdZip + '\'' +
                ", egdZip2='" + egdZip2 + '\'' +
                ", egdZip3='" + egdZip3 + '\'' +
                ", egdCountryCode='" + egdCountryCode + '\'' +
                ", egdPhoneInd='" + egdPhoneInd + '\'' +
                ", egdPhone=" + egdPhone +
                ", egdContactInd='" + egdContactInd + '\'' +
                ", egdContact='" + egdContact + '\'' +
                ", egdRenewalDtInd='" + egdRenewalDtInd + '\'' +
                ", egdRenewalDate=" + egdRenewalDate +
                ", egdSicCodeInd='" + egdSicCodeInd + '\'' +
                ", egdSicCode='" + egdSicCode + '\'' +
                ", egdEffDateInd='" + egdEffDateInd + '\'' +
                ", egdEffectiveDate=" + egdEffectiveDate +
                ", egdThruDateInd='" + egdThruDateInd + '\'' +
                ", egdThruDate=" + egdThruDate +
                ", egdThruDays=" + egdThruDays +
                ", egdBrandCopayInd='" + egdBrandCopayInd + '\'' +
                ", egdBrandCopay=" + egdBrandCopay +
                ", egdGenericInd='" + egdGenericInd + '\'' +
                ", egdGenericCopay=" + egdGenericCopay +
                ", egdCopay3Ind='" + egdCopay3Ind + '\'' +
                ", egdCopay3=" + egdCopay3 +
                ", egdCopay4Ind='" + egdCopay4Ind + '\'' +
                ", egdCopay4=" + egdCopay4 +
                ", egdCopay5=" + egdCopay5 +
                ", egdCopay5Ind='" + egdCopay5Ind + '\'' +
                ", egdCopay6=" + egdCopay6 +
                ", egdCopay6Ind='" + egdCopay6Ind + '\'' +
                ", egdCopay7=" + egdCopay7 +
                ", egdCopay7Ind='" + egdCopay7Ind + '\'' +
                ", egdCopay8=" + egdCopay8 +
                ", egdCopay8Ind='" + egdCopay8Ind + '\'' +
                ", egdBenefitCdInd='" + egdBenefitCdInd + '\'' +
                ", egdBenefitCode1='" + egdBenefitCode1 + '\'' +
                ", egdPlanInd='" + egdPlanInd + '\'' +
                ", planCode='" + planCode + '\'' +
                ", planEffDate=" + planEffDate +
                ", egdContractDateInd='" + egdContractDateInd + '\'' +
                ", egdContractDate=" + egdContractDate +
                ", egdLanguageCodeInd='" + egdLanguageCodeInd + '\'' +
                ", egdLanguageCode='" + egdLanguageCode + '\'' +
                ", egdRenewalDteValidate='" + egdRenewalDteValidate + '\'' +
                ", egdCardLogoInd='" + egdCardLogoInd + '\'' +
                ", egdCardLogo='" + egdCardLogo + '\'' +
                ", egdCardDataInd='" + egdCardDataInd + '\'' +
                ", egdAltAddrCode='" + egdAltAddrCode + '\'' +
                ", egdCardText1Ind='" + egdCardText1Ind + '\'' +
                ", egdCardText1='" + egdCardText1 + '\'' +
                ", egdCardText2Ind='" + egdCardText2Ind + '\'' +
                ", egdCardText2='" + egdCardText2 + '\'' +
                ", egdCardText3Ind='" + egdCardText3Ind + '\'' +
                ", egdCardText3='" + egdCardText3 + '\'' +
                ", egdCardText4Ind='" + egdCardText4Ind + '\'' +
                ", egdCardText4='" + egdCardText4 + '\'' +
                ", egdDepAgeFromDateInd='" + egdDepAgeFromDateInd + '\'' +
                ", egdDepAgeFromDate=" + egdDepAgeFromDate +
                ", egdDepAgeThruDateInd='" + egdDepAgeThruDateInd + '\'' +
                ", egdDepAgeThruDate=" + egdDepAgeThruDate +
                ", egdDepAgeMax=" + egdDepAgeMax +
                ", egdDepDateQualifier='" + egdDepDateQualifier + '\'' +
                ", egdDepEligibilityQual='" + egdDepEligibilityQual + '\'' +
                ", egdStudentAgeMax=" + egdStudentAgeMax +
                ", egdStudentAgeDateQual='" + egdStudentAgeDateQual + '\'' +
                ", egdStudentAgeEligQual='" + egdStudentAgeEligQual + '\'' +
                ", egdOtherAge=" + egdOtherAge +
                ", egdOtherDateQualifier='" + egdOtherDateQualifier + '\'' +
                ", egdOtherEligQualifier='" + egdOtherEligQualifier + '\'' +
                ", egdClientDefindDataIn='" + egdClientDefindDataIn + '\'' +
                ", egdPlanEligValidation='" + egdPlanEligValidation + '\'' +
                ", egdSuppressPlanMsgInd='" + egdSuppressPlanMsgInd + '\'' +
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

