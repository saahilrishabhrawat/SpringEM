package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by bkocinsk on 8/31/2018.
 */
@Entity
@Table(name = "ELG_ELIG_QUALITY_DEFAULTS_QDE")
@IdClass(ElgEligQualityDefaultsQdePK.class)
public class ElgEligQualityDefaultsQde {
    private String carCarrierId;
    private String accountId;
    private String groupId;
    private String qdePersonCodeInd;
    private String qdePersonCode;
    private String qdeGenderInd;
    private String qdeGender;
    private String qdeDateOfBirthInd;
    private Date qdeDateOfBirth;
    private String qdeDurKeyInd;
    private String qdeDurKey;
    private String qdeSocSecNbrInd;
    private long qdeSocSecNbr;
    private String qdeAddress1Ind;
    private String qdeAddress1;
    private String qdeAddress2Ind;
    private String qdeAddress2;
    private String qdeAddress3Ind;
    private String qdeAddress3;
    private String qdeCityInd;
    private String qdeCity;
    private String qdeStateInd;
    private String qdeState;
    private String qdeZipInd;
    private String qdeZip;
    private String qdeZip2Ind;
    private String qdeZip2;
    private String qdeZip3Ind;
    private String qdeZip3;
    private String qdeFamilyFlagInd;
    private String qdeFamilyFlag;
    private String qdeFamilyTypeInd;
    private String qdeFamilyType;
    private String qdeFamilyIdInd;
    private String qdeFamilyId;
    private String planCode;
    private Date planEffDate;
    private String qdePlanCodeInd;
    private String qdePlanEffDateInd;
    private String qdeMedicareCvgTypeInd;
    private String qdeMedicareCvgType;
    private String qdeInactvFutureCovInd;
    private String qdeInactvFutureCov;
    private String qdeClientProdCodeInd;
    private String qdeClientProductCode;
    private String qdeClientRiderCodeInd;
    private String qdeClientRiderCode;
    private String qdeMedPartdCntNbrInd;
    private String qdeMedPartdCntNbr;
    private String qdeMedicareHicInd;
    private String qdeMedicareHic;
    private String qdePbpInd;
    private String qdePbp;
    private String qdeSubsidyLevelInd;
    private String qdeSubsidyLevel;
    private String qdeCopayCategoryInd;
    private String qdeCopayCategory;
    private String qdeMbrCddEffDateInd;
    private Date qdeMbrCddEffDate;
    private String qdeMbrCddThruDateInd;
    private Date qdeMbrCddThruDate;
    private String qdeMbrCddInd;
    private String qdeMbrCdd;
    private String qdeMpartdEffDateInd;
    private Date qdeMpartdEffDate;
    private String qdeMpartdThruDateInd;
    private Date qdeMpartdThruDate;
    private String qdeMsiAltIdInd;
    private String qdeMsiAltId;
    private String qdeAltInsTypeInd;
    private String qdeAlternateInsType;
    private String qdeMbrAptcIndInd;
    private String qdeMbrAptcInd;
    private String qdeHimGpEffDateInd;
    private Date qdeHimGpEffDate;
    private String qdeHimGpThruDateInd;
    private Date qdeHimGpThruDate;
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
    @Column(name = "QDE_PERSON_CODE_IND")
    public String getQdePersonCodeInd() {
        return qdePersonCodeInd;
    }

    public void setQdePersonCodeInd(String qdePersonCodeInd) {
        this.qdePersonCodeInd = qdePersonCodeInd;
    }

    @Basic
    @Column(name = "QDE_PERSON_CODE")
    public String getQdePersonCode() {
        return qdePersonCode;
    }

    public void setQdePersonCode(String qdePersonCode) {
        this.qdePersonCode = qdePersonCode;
    }

    @Basic
    @Column(name = "QDE_GENDER_IND")
    public String getQdeGenderInd() {
        return qdeGenderInd;
    }

    public void setQdeGenderInd(String qdeGenderInd) {
        this.qdeGenderInd = qdeGenderInd;
    }

    @Basic
    @Column(name = "QDE_GENDER")
    public String getQdeGender() {
        return qdeGender;
    }

    public void setQdeGender(String qdeGender) {
        this.qdeGender = qdeGender;
    }

    @Basic
    @Column(name = "QDE_DATE_OF_BIRTH_IND")
    public String getQdeDateOfBirthInd() {
        return qdeDateOfBirthInd;
    }

    public void setQdeDateOfBirthInd(String qdeDateOfBirthInd) {
        this.qdeDateOfBirthInd = qdeDateOfBirthInd;
    }

    @Basic
    @Column(name = "QDE_DATE_OF_BIRTH")
    public Date getQdeDateOfBirth() {
        return qdeDateOfBirth;
    }

    public void setQdeDateOfBirth(Date qdeDateOfBirth) {
        this.qdeDateOfBirth = qdeDateOfBirth;
    }

    @Basic
    @Column(name = "QDE_DUR_KEY_IND")
    public String getQdeDurKeyInd() {
        return qdeDurKeyInd;
    }

    public void setQdeDurKeyInd(String qdeDurKeyInd) {
        this.qdeDurKeyInd = qdeDurKeyInd;
    }

    @Basic
    @Column(name = "QDE_DUR_KEY")
    public String getQdeDurKey() {
        return qdeDurKey;
    }

    public void setQdeDurKey(String qdeDurKey) {
        this.qdeDurKey = qdeDurKey;
    }

    @Basic
    @Column(name = "QDE_SOC_SEC_NBR_IND")
    public String getQdeSocSecNbrInd() {
        return qdeSocSecNbrInd;
    }

    public void setQdeSocSecNbrInd(String qdeSocSecNbrInd) {
        this.qdeSocSecNbrInd = qdeSocSecNbrInd;
    }

    @Basic
    @Column(name = "QDE_SOC_SEC_NBR")
    public long getQdeSocSecNbr() {
        return qdeSocSecNbr;
    }

    public void setQdeSocSecNbr(long qdeSocSecNbr) {
        this.qdeSocSecNbr = qdeSocSecNbr;
    }

    @Basic
    @Column(name = "QDE_ADDRESS1_IND")
    public String getQdeAddress1Ind() {
        return qdeAddress1Ind;
    }

    public void setQdeAddress1Ind(String qdeAddress1Ind) {
        this.qdeAddress1Ind = qdeAddress1Ind;
    }

    @Basic
    @Column(name = "QDE_ADDRESS1")
    public String getQdeAddress1() {
        return qdeAddress1;
    }

    public void setQdeAddress1(String qdeAddress1) {
        this.qdeAddress1 = qdeAddress1;
    }

    @Basic
    @Column(name = "QDE_ADDRESS2_IND")
    public String getQdeAddress2Ind() {
        return qdeAddress2Ind;
    }

    public void setQdeAddress2Ind(String qdeAddress2Ind) {
        this.qdeAddress2Ind = qdeAddress2Ind;
    }

    @Basic
    @Column(name = "QDE_ADDRESS2")
    public String getQdeAddress2() {
        return qdeAddress2;
    }

    public void setQdeAddress2(String qdeAddress2) {
        this.qdeAddress2 = qdeAddress2;
    }

    @Basic
    @Column(name = "QDE_ADDRESS3_IND")
    public String getQdeAddress3Ind() {
        return qdeAddress3Ind;
    }

    public void setQdeAddress3Ind(String qdeAddress3Ind) {
        this.qdeAddress3Ind = qdeAddress3Ind;
    }

    @Basic
    @Column(name = "QDE_ADDRESS3")
    public String getQdeAddress3() {
        return qdeAddress3;
    }

    public void setQdeAddress3(String qdeAddress3) {
        this.qdeAddress3 = qdeAddress3;
    }

    @Basic
    @Column(name = "QDE_CITY_IND")
    public String getQdeCityInd() {
        return qdeCityInd;
    }

    public void setQdeCityInd(String qdeCityInd) {
        this.qdeCityInd = qdeCityInd;
    }

    @Basic
    @Column(name = "QDE_CITY")
    public String getQdeCity() {
        return qdeCity;
    }

    public void setQdeCity(String qdeCity) {
        this.qdeCity = qdeCity;
    }

    @Basic
    @Column(name = "QDE_STATE_IND")
    public String getQdeStateInd() {
        return qdeStateInd;
    }

    public void setQdeStateInd(String qdeStateInd) {
        this.qdeStateInd = qdeStateInd;
    }

    @Basic
    @Column(name = "QDE_STATE")
    public String getQdeState() {
        return qdeState;
    }

    public void setQdeState(String qdeState) {
        this.qdeState = qdeState;
    }

    @Basic
    @Column(name = "QDE_ZIP_IND")
    public String getQdeZipInd() {
        return qdeZipInd;
    }

    public void setQdeZipInd(String qdeZipInd) {
        this.qdeZipInd = qdeZipInd;
    }

    @Basic
    @Column(name = "QDE_ZIP")
    public String getQdeZip() {
        return qdeZip;
    }

    public void setQdeZip(String qdeZip) {
        this.qdeZip = qdeZip;
    }

    @Basic
    @Column(name = "QDE_ZIP2_IND")
    public String getQdeZip2Ind() {
        return qdeZip2Ind;
    }

    public void setQdeZip2Ind(String qdeZip2Ind) {
        this.qdeZip2Ind = qdeZip2Ind;
    }

    @Basic
    @Column(name = "QDE_ZIP2")
    public String getQdeZip2() {
        return qdeZip2;
    }

    public void setQdeZip2(String qdeZip2) {
        this.qdeZip2 = qdeZip2;
    }

    @Basic
    @Column(name = "QDE_ZIP3_IND")
    public String getQdeZip3Ind() {
        return qdeZip3Ind;
    }

    public void setQdeZip3Ind(String qdeZip3Ind) {
        this.qdeZip3Ind = qdeZip3Ind;
    }

    @Basic
    @Column(name = "QDE_ZIP3")
    public String getQdeZip3() {
        return qdeZip3;
    }

    public void setQdeZip3(String qdeZip3) {
        this.qdeZip3 = qdeZip3;
    }

    @Basic
    @Column(name = "QDE_FAMILY_FLAG_IND")
    public String getQdeFamilyFlagInd() {
        return qdeFamilyFlagInd;
    }

    public void setQdeFamilyFlagInd(String qdeFamilyFlagInd) {
        this.qdeFamilyFlagInd = qdeFamilyFlagInd;
    }

    @Basic
    @Column(name = "QDE_FAMILY_FLAG")
    public String getQdeFamilyFlag() {
        return qdeFamilyFlag;
    }

    public void setQdeFamilyFlag(String qdeFamilyFlag) {
        this.qdeFamilyFlag = qdeFamilyFlag;
    }

    @Basic
    @Column(name = "QDE_FAMILY_TYPE_IND")
    public String getQdeFamilyTypeInd() {
        return qdeFamilyTypeInd;
    }

    public void setQdeFamilyTypeInd(String qdeFamilyTypeInd) {
        this.qdeFamilyTypeInd = qdeFamilyTypeInd;
    }

    @Basic
    @Column(name = "QDE_FAMILY_TYPE")
    public String getQdeFamilyType() {
        return qdeFamilyType;
    }

    public void setQdeFamilyType(String qdeFamilyType) {
        this.qdeFamilyType = qdeFamilyType;
    }

    @Basic
    @Column(name = "QDE_FAMILY_ID_IND")
    public String getQdeFamilyIdInd() {
        return qdeFamilyIdInd;
    }

    public void setQdeFamilyIdInd(String qdeFamilyIdInd) {
        this.qdeFamilyIdInd = qdeFamilyIdInd;
    }

    @Basic
    @Column(name = "QDE_FAMILY_ID")
    public String getQdeFamilyId() {
        return qdeFamilyId;
    }

    public void setQdeFamilyId(String qdeFamilyId) {
        this.qdeFamilyId = qdeFamilyId;
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
    @Column(name = "QDE_PLAN_CODE_IND")
    public String getQdePlanCodeInd() {
        return qdePlanCodeInd;
    }

    public void setQdePlanCodeInd(String qdePlanCodeInd) {
        this.qdePlanCodeInd = qdePlanCodeInd;
    }

    @Basic
    @Column(name = "QDE_PLAN_EFF_DATE_IND")
    public String getQdePlanEffDateInd() {
        return qdePlanEffDateInd;
    }

    public void setQdePlanEffDateInd(String qdePlanEffDateInd) {
        this.qdePlanEffDateInd = qdePlanEffDateInd;
    }

    @Basic
    @Column(name = "QDE_MEDICARE_CVG_TYPE_IND")
    public String getQdeMedicareCvgTypeInd() {
        return qdeMedicareCvgTypeInd;
    }

    public void setQdeMedicareCvgTypeInd(String qdeMedicareCvgTypeInd) {
        this.qdeMedicareCvgTypeInd = qdeMedicareCvgTypeInd;
    }

    @Basic
    @Column(name = "QDE_MEDICARE_CVG_TYPE")
    public String getQdeMedicareCvgType() {
        return qdeMedicareCvgType;
    }

    public void setQdeMedicareCvgType(String qdeMedicareCvgType) {
        this.qdeMedicareCvgType = qdeMedicareCvgType;
    }

    @Basic
    @Column(name = "QDE_INACTV_FUTURE_COV_IND")
    public String getQdeInactvFutureCovInd() {
        return qdeInactvFutureCovInd;
    }

    public void setQdeInactvFutureCovInd(String qdeInactvFutureCovInd) {
        this.qdeInactvFutureCovInd = qdeInactvFutureCovInd;
    }

    @Basic
    @Column(name = "QDE_INACTV_FUTURE_COV")
    public String getQdeInactvFutureCov() {
        return qdeInactvFutureCov;
    }

    public void setQdeInactvFutureCov(String qdeInactvFutureCov) {
        this.qdeInactvFutureCov = qdeInactvFutureCov;
    }

    @Basic
    @Column(name = "QDE_CLIENT_PROD_CODE_IND")
    public String getQdeClientProdCodeInd() {
        return qdeClientProdCodeInd;
    }

    public void setQdeClientProdCodeInd(String qdeClientProdCodeInd) {
        this.qdeClientProdCodeInd = qdeClientProdCodeInd;
    }

    @Basic
    @Column(name = "QDE_CLIENT_PRODUCT_CODE")
    public String getQdeClientProductCode() {
        return qdeClientProductCode;
    }

    public void setQdeClientProductCode(String qdeClientProductCode) {
        this.qdeClientProductCode = qdeClientProductCode;
    }

    @Basic
    @Column(name = "QDE_CLIENT_RIDER_CODE_IND")
    public String getQdeClientRiderCodeInd() {
        return qdeClientRiderCodeInd;
    }

    public void setQdeClientRiderCodeInd(String qdeClientRiderCodeInd) {
        this.qdeClientRiderCodeInd = qdeClientRiderCodeInd;
    }

    @Basic
    @Column(name = "QDE_CLIENT_RIDER_CODE")
    public String getQdeClientRiderCode() {
        return qdeClientRiderCode;
    }

    public void setQdeClientRiderCode(String qdeClientRiderCode) {
        this.qdeClientRiderCode = qdeClientRiderCode;
    }

    @Basic
    @Column(name = "QDE_MED_PARTD_CNT_NBR_IND")
    public String getQdeMedPartdCntNbrInd() {
        return qdeMedPartdCntNbrInd;
    }

    public void setQdeMedPartdCntNbrInd(String qdeMedPartdCntNbrInd) {
        this.qdeMedPartdCntNbrInd = qdeMedPartdCntNbrInd;
    }

    @Basic
    @Column(name = "QDE_MED_PARTD_CNT_NBR")
    public String getQdeMedPartdCntNbr() {
        return qdeMedPartdCntNbr;
    }

    public void setQdeMedPartdCntNbr(String qdeMedPartdCntNbr) {
        this.qdeMedPartdCntNbr = qdeMedPartdCntNbr;
    }

    @Basic
    @Column(name = "QDE_MEDICARE_HIC_IND")
    public String getQdeMedicareHicInd() {
        return qdeMedicareHicInd;
    }

    public void setQdeMedicareHicInd(String qdeMedicareHicInd) {
        this.qdeMedicareHicInd = qdeMedicareHicInd;
    }

    @Basic
    @Column(name = "QDE_MEDICARE_HIC")
    public String getQdeMedicareHic() {
        return qdeMedicareHic;
    }

    public void setQdeMedicareHic(String qdeMedicareHic) {
        this.qdeMedicareHic = qdeMedicareHic;
    }

    @Basic
    @Column(name = "QDE_PBP_IND")
    public String getQdePbpInd() {
        return qdePbpInd;
    }

    public void setQdePbpInd(String qdePbpInd) {
        this.qdePbpInd = qdePbpInd;
    }

    @Basic
    @Column(name = "QDE_PBP")
    public String getQdePbp() {
        return qdePbp;
    }

    public void setQdePbp(String qdePbp) {
        this.qdePbp = qdePbp;
    }

    @Basic
    @Column(name = "QDE_SUBSIDY_LEVEL_IND")
    public String getQdeSubsidyLevelInd() {
        return qdeSubsidyLevelInd;
    }

    public void setQdeSubsidyLevelInd(String qdeSubsidyLevelInd) {
        this.qdeSubsidyLevelInd = qdeSubsidyLevelInd;
    }

    @Basic
    @Column(name = "QDE_SUBSIDY_LEVEL")
    public String getQdeSubsidyLevel() {
        return qdeSubsidyLevel;
    }

    public void setQdeSubsidyLevel(String qdeSubsidyLevel) {
        this.qdeSubsidyLevel = qdeSubsidyLevel;
    }

    @Basic
    @Column(name = "QDE_COPAY_CATEGORY_IND")
    public String getQdeCopayCategoryInd() {
        return qdeCopayCategoryInd;
    }

    public void setQdeCopayCategoryInd(String qdeCopayCategoryInd) {
        this.qdeCopayCategoryInd = qdeCopayCategoryInd;
    }

    @Basic
    @Column(name = "QDE_COPAY_CATEGORY")
    public String getQdeCopayCategory() {
        return qdeCopayCategory;
    }

    public void setQdeCopayCategory(String qdeCopayCategory) {
        this.qdeCopayCategory = qdeCopayCategory;
    }

    @Basic
    @Column(name = "QDE_MBR_CDD_EFF_DATE_IND")
    public String getQdeMbrCddEffDateInd() {
        return qdeMbrCddEffDateInd;
    }

    public void setQdeMbrCddEffDateInd(String qdeMbrCddEffDateInd) {
        this.qdeMbrCddEffDateInd = qdeMbrCddEffDateInd;
    }

    @Basic
    @Column(name = "QDE_MBR_CDD_EFF_DATE")
    public Date getQdeMbrCddEffDate() {
        return qdeMbrCddEffDate;
    }

    public void setQdeMbrCddEffDate(Date qdeMbrCddEffDate) {
        this.qdeMbrCddEffDate = qdeMbrCddEffDate;
    }

    @Basic
    @Column(name = "QDE_MBR_CDD_THRU_DATE_IND")
    public String getQdeMbrCddThruDateInd() {
        return qdeMbrCddThruDateInd;
    }

    public void setQdeMbrCddThruDateInd(String qdeMbrCddThruDateInd) {
        this.qdeMbrCddThruDateInd = qdeMbrCddThruDateInd;
    }

    @Basic
    @Column(name = "QDE_MBR_CDD_THRU_DATE")
    public Date getQdeMbrCddThruDate() {
        return qdeMbrCddThruDate;
    }

    public void setQdeMbrCddThruDate(Date qdeMbrCddThruDate) {
        this.qdeMbrCddThruDate = qdeMbrCddThruDate;
    }

    @Basic
    @Column(name = "QDE_MBR_CDD_IND")
    public String getQdeMbrCddInd() {
        return qdeMbrCddInd;
    }

    public void setQdeMbrCddInd(String qdeMbrCddInd) {
        this.qdeMbrCddInd = qdeMbrCddInd;
    }

    @Basic
    @Column(name = "QDE_MBR_CDD")
    public String getQdeMbrCdd() {
        return qdeMbrCdd;
    }

    public void setQdeMbrCdd(String qdeMbrCdd) {
        this.qdeMbrCdd = qdeMbrCdd;
    }

    @Basic
    @Column(name = "QDE_MPARTD_EFF_DATE_IND")
    public String getQdeMpartdEffDateInd() {
        return qdeMpartdEffDateInd;
    }

    public void setQdeMpartdEffDateInd(String qdeMpartdEffDateInd) {
        this.qdeMpartdEffDateInd = qdeMpartdEffDateInd;
    }

    @Basic
    @Column(name = "QDE_MPARTD_EFF_DATE")
    public Date getQdeMpartdEffDate() {
        return qdeMpartdEffDate;
    }

    public void setQdeMpartdEffDate(Date qdeMpartdEffDate) {
        this.qdeMpartdEffDate = qdeMpartdEffDate;
    }

    @Basic
    @Column(name = "QDE_MPARTD_THRU_DATE_IND")
    public String getQdeMpartdThruDateInd() {
        return qdeMpartdThruDateInd;
    }

    public void setQdeMpartdThruDateInd(String qdeMpartdThruDateInd) {
        this.qdeMpartdThruDateInd = qdeMpartdThruDateInd;
    }

    @Basic
    @Column(name = "QDE_MPARTD_THRU_DATE")
    public Date getQdeMpartdThruDate() {
        return qdeMpartdThruDate;
    }

    public void setQdeMpartdThruDate(Date qdeMpartdThruDate) {
        this.qdeMpartdThruDate = qdeMpartdThruDate;
    }

    @Basic
    @Column(name = "QDE_MSI_ALT_ID_IND")
    public String getQdeMsiAltIdInd() {
        return qdeMsiAltIdInd;
    }

    public void setQdeMsiAltIdInd(String qdeMsiAltIdInd) {
        this.qdeMsiAltIdInd = qdeMsiAltIdInd;
    }

    @Basic
    @Column(name = "QDE_MSI_ALT_ID")
    public String getQdeMsiAltId() {
        return qdeMsiAltId;
    }

    public void setQdeMsiAltId(String qdeMsiAltId) {
        this.qdeMsiAltId = qdeMsiAltId;
    }

    @Basic
    @Column(name = "QDE_ALT_INS_TYPE_IND")
    public String getQdeAltInsTypeInd() {
        return qdeAltInsTypeInd;
    }

    public void setQdeAltInsTypeInd(String qdeAltInsTypeInd) {
        this.qdeAltInsTypeInd = qdeAltInsTypeInd;
    }

    @Basic
    @Column(name = "QDE_ALTERNATE_INS_TYPE")
    public String getQdeAlternateInsType() {
        return qdeAlternateInsType;
    }

    public void setQdeAlternateInsType(String qdeAlternateInsType) {
        this.qdeAlternateInsType = qdeAlternateInsType;
    }

    @Basic
    @Column(name = "QDE_MBR_APTC_IND_IND")
    public String getQdeMbrAptcIndInd() {
        return qdeMbrAptcIndInd;
    }

    public void setQdeMbrAptcIndInd(String qdeMbrAptcIndInd) {
        this.qdeMbrAptcIndInd = qdeMbrAptcIndInd;
    }

    @Basic
    @Column(name = "QDE_MBR_APTC_IND")
    public String getQdeMbrAptcInd() {
        return qdeMbrAptcInd;
    }

    public void setQdeMbrAptcInd(String qdeMbrAptcInd) {
        this.qdeMbrAptcInd = qdeMbrAptcInd;
    }

    @Basic
    @Column(name = "QDE_HIM_GP_EFF_DATE_IND")
    public String getQdeHimGpEffDateInd() {
        return qdeHimGpEffDateInd;
    }

    public void setQdeHimGpEffDateInd(String qdeHimGpEffDateInd) {
        this.qdeHimGpEffDateInd = qdeHimGpEffDateInd;
    }

    @Basic
    @Column(name = "QDE_HIM_GP_EFF_DATE")
    public Date getQdeHimGpEffDate() {
        return qdeHimGpEffDate;
    }

    public void setQdeHimGpEffDate(Date qdeHimGpEffDate) {
        this.qdeHimGpEffDate = qdeHimGpEffDate;
    }

    @Basic
    @Column(name = "QDE_HIM_GP_THRU_DATE_IND")
    public String getQdeHimGpThruDateInd() {
        return qdeHimGpThruDateInd;
    }

    public void setQdeHimGpThruDateInd(String qdeHimGpThruDateInd) {
        this.qdeHimGpThruDateInd = qdeHimGpThruDateInd;
    }

    @Basic
    @Column(name = "QDE_HIM_GP_THRU_DATE")
    public Date getQdeHimGpThruDate() {
        return qdeHimGpThruDate;
    }

    public void setQdeHimGpThruDate(Date qdeHimGpThruDate) {
        this.qdeHimGpThruDate = qdeHimGpThruDate;
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

        ElgEligQualityDefaultsQde that = (ElgEligQualityDefaultsQde) o;

        if (qdeSocSecNbr != that.qdeSocSecNbr) return false;
        if (carCarrierId != null ? !carCarrierId.equals(that.carCarrierId) : that.carCarrierId != null) return false;
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        if (qdePersonCodeInd != null ? !qdePersonCodeInd.equals(that.qdePersonCodeInd) : that.qdePersonCodeInd != null)
            return false;
        if (qdePersonCode != null ? !qdePersonCode.equals(that.qdePersonCode) : that.qdePersonCode != null)
            return false;
        if (qdeGenderInd != null ? !qdeGenderInd.equals(that.qdeGenderInd) : that.qdeGenderInd != null) return false;
        if (qdeGender != null ? !qdeGender.equals(that.qdeGender) : that.qdeGender != null) return false;
        if (qdeDateOfBirthInd != null ? !qdeDateOfBirthInd.equals(that.qdeDateOfBirthInd) : that.qdeDateOfBirthInd != null)
            return false;
        if (qdeDateOfBirth != null ? !qdeDateOfBirth.equals(that.qdeDateOfBirth) : that.qdeDateOfBirth != null)
            return false;
        if (qdeDurKeyInd != null ? !qdeDurKeyInd.equals(that.qdeDurKeyInd) : that.qdeDurKeyInd != null) return false;
        if (qdeDurKey != null ? !qdeDurKey.equals(that.qdeDurKey) : that.qdeDurKey != null) return false;
        if (qdeSocSecNbrInd != null ? !qdeSocSecNbrInd.equals(that.qdeSocSecNbrInd) : that.qdeSocSecNbrInd != null)
            return false;
        if (qdeAddress1Ind != null ? !qdeAddress1Ind.equals(that.qdeAddress1Ind) : that.qdeAddress1Ind != null)
            return false;
        if (qdeAddress1 != null ? !qdeAddress1.equals(that.qdeAddress1) : that.qdeAddress1 != null) return false;
        if (qdeAddress2Ind != null ? !qdeAddress2Ind.equals(that.qdeAddress2Ind) : that.qdeAddress2Ind != null)
            return false;
        if (qdeAddress2 != null ? !qdeAddress2.equals(that.qdeAddress2) : that.qdeAddress2 != null) return false;
        if (qdeAddress3Ind != null ? !qdeAddress3Ind.equals(that.qdeAddress3Ind) : that.qdeAddress3Ind != null)
            return false;
        if (qdeAddress3 != null ? !qdeAddress3.equals(that.qdeAddress3) : that.qdeAddress3 != null) return false;
        if (qdeCityInd != null ? !qdeCityInd.equals(that.qdeCityInd) : that.qdeCityInd != null) return false;
        if (qdeCity != null ? !qdeCity.equals(that.qdeCity) : that.qdeCity != null) return false;
        if (qdeStateInd != null ? !qdeStateInd.equals(that.qdeStateInd) : that.qdeStateInd != null) return false;
        if (qdeState != null ? !qdeState.equals(that.qdeState) : that.qdeState != null) return false;
        if (qdeZipInd != null ? !qdeZipInd.equals(that.qdeZipInd) : that.qdeZipInd != null) return false;
        if (qdeZip != null ? !qdeZip.equals(that.qdeZip) : that.qdeZip != null) return false;
        if (qdeZip2Ind != null ? !qdeZip2Ind.equals(that.qdeZip2Ind) : that.qdeZip2Ind != null) return false;
        if (qdeZip2 != null ? !qdeZip2.equals(that.qdeZip2) : that.qdeZip2 != null) return false;
        if (qdeZip3Ind != null ? !qdeZip3Ind.equals(that.qdeZip3Ind) : that.qdeZip3Ind != null) return false;
        if (qdeZip3 != null ? !qdeZip3.equals(that.qdeZip3) : that.qdeZip3 != null) return false;
        if (qdeFamilyFlagInd != null ? !qdeFamilyFlagInd.equals(that.qdeFamilyFlagInd) : that.qdeFamilyFlagInd != null)
            return false;
        if (qdeFamilyFlag != null ? !qdeFamilyFlag.equals(that.qdeFamilyFlag) : that.qdeFamilyFlag != null)
            return false;
        if (qdeFamilyTypeInd != null ? !qdeFamilyTypeInd.equals(that.qdeFamilyTypeInd) : that.qdeFamilyTypeInd != null)
            return false;
        if (qdeFamilyType != null ? !qdeFamilyType.equals(that.qdeFamilyType) : that.qdeFamilyType != null)
            return false;
        if (qdeFamilyIdInd != null ? !qdeFamilyIdInd.equals(that.qdeFamilyIdInd) : that.qdeFamilyIdInd != null)
            return false;
        if (qdeFamilyId != null ? !qdeFamilyId.equals(that.qdeFamilyId) : that.qdeFamilyId != null) return false;
        if (planCode != null ? !planCode.equals(that.planCode) : that.planCode != null) return false;
        if (planEffDate != null ? !planEffDate.equals(that.planEffDate) : that.planEffDate != null) return false;
        if (qdePlanCodeInd != null ? !qdePlanCodeInd.equals(that.qdePlanCodeInd) : that.qdePlanCodeInd != null)
            return false;
        if (qdePlanEffDateInd != null ? !qdePlanEffDateInd.equals(that.qdePlanEffDateInd) : that.qdePlanEffDateInd != null)
            return false;
        if (qdeMedicareCvgTypeInd != null ? !qdeMedicareCvgTypeInd.equals(that.qdeMedicareCvgTypeInd) : that.qdeMedicareCvgTypeInd != null)
            return false;
        if (qdeMedicareCvgType != null ? !qdeMedicareCvgType.equals(that.qdeMedicareCvgType) : that.qdeMedicareCvgType != null)
            return false;
        if (qdeInactvFutureCovInd != null ? !qdeInactvFutureCovInd.equals(that.qdeInactvFutureCovInd) : that.qdeInactvFutureCovInd != null)
            return false;
        if (qdeInactvFutureCov != null ? !qdeInactvFutureCov.equals(that.qdeInactvFutureCov) : that.qdeInactvFutureCov != null)
            return false;
        if (qdeClientProdCodeInd != null ? !qdeClientProdCodeInd.equals(that.qdeClientProdCodeInd) : that.qdeClientProdCodeInd != null)
            return false;
        if (qdeClientProductCode != null ? !qdeClientProductCode.equals(that.qdeClientProductCode) : that.qdeClientProductCode != null)
            return false;
        if (qdeClientRiderCodeInd != null ? !qdeClientRiderCodeInd.equals(that.qdeClientRiderCodeInd) : that.qdeClientRiderCodeInd != null)
            return false;
        if (qdeClientRiderCode != null ? !qdeClientRiderCode.equals(that.qdeClientRiderCode) : that.qdeClientRiderCode != null)
            return false;
        if (qdeMedPartdCntNbrInd != null ? !qdeMedPartdCntNbrInd.equals(that.qdeMedPartdCntNbrInd) : that.qdeMedPartdCntNbrInd != null)
            return false;
        if (qdeMedPartdCntNbr != null ? !qdeMedPartdCntNbr.equals(that.qdeMedPartdCntNbr) : that.qdeMedPartdCntNbr != null)
            return false;
        if (qdeMedicareHicInd != null ? !qdeMedicareHicInd.equals(that.qdeMedicareHicInd) : that.qdeMedicareHicInd != null)
            return false;
        if (qdeMedicareHic != null ? !qdeMedicareHic.equals(that.qdeMedicareHic) : that.qdeMedicareHic != null)
            return false;
        if (qdePbpInd != null ? !qdePbpInd.equals(that.qdePbpInd) : that.qdePbpInd != null) return false;
        if (qdePbp != null ? !qdePbp.equals(that.qdePbp) : that.qdePbp != null) return false;
        if (qdeSubsidyLevelInd != null ? !qdeSubsidyLevelInd.equals(that.qdeSubsidyLevelInd) : that.qdeSubsidyLevelInd != null)
            return false;
        if (qdeSubsidyLevel != null ? !qdeSubsidyLevel.equals(that.qdeSubsidyLevel) : that.qdeSubsidyLevel != null)
            return false;
        if (qdeCopayCategoryInd != null ? !qdeCopayCategoryInd.equals(that.qdeCopayCategoryInd) : that.qdeCopayCategoryInd != null)
            return false;
        if (qdeCopayCategory != null ? !qdeCopayCategory.equals(that.qdeCopayCategory) : that.qdeCopayCategory != null)
            return false;
        if (qdeMbrCddEffDateInd != null ? !qdeMbrCddEffDateInd.equals(that.qdeMbrCddEffDateInd) : that.qdeMbrCddEffDateInd != null)
            return false;
        if (qdeMbrCddEffDate != null ? !qdeMbrCddEffDate.equals(that.qdeMbrCddEffDate) : that.qdeMbrCddEffDate != null)
            return false;
        if (qdeMbrCddThruDateInd != null ? !qdeMbrCddThruDateInd.equals(that.qdeMbrCddThruDateInd) : that.qdeMbrCddThruDateInd != null)
            return false;
        if (qdeMbrCddThruDate != null ? !qdeMbrCddThruDate.equals(that.qdeMbrCddThruDate) : that.qdeMbrCddThruDate != null)
            return false;
        if (qdeMbrCddInd != null ? !qdeMbrCddInd.equals(that.qdeMbrCddInd) : that.qdeMbrCddInd != null) return false;
        if (qdeMbrCdd != null ? !qdeMbrCdd.equals(that.qdeMbrCdd) : that.qdeMbrCdd != null) return false;
        if (qdeMpartdEffDateInd != null ? !qdeMpartdEffDateInd.equals(that.qdeMpartdEffDateInd) : that.qdeMpartdEffDateInd != null)
            return false;
        if (qdeMpartdEffDate != null ? !qdeMpartdEffDate.equals(that.qdeMpartdEffDate) : that.qdeMpartdEffDate != null)
            return false;
        if (qdeMpartdThruDateInd != null ? !qdeMpartdThruDateInd.equals(that.qdeMpartdThruDateInd) : that.qdeMpartdThruDateInd != null)
            return false;
        if (qdeMpartdThruDate != null ? !qdeMpartdThruDate.equals(that.qdeMpartdThruDate) : that.qdeMpartdThruDate != null)
            return false;
        if (qdeMsiAltIdInd != null ? !qdeMsiAltIdInd.equals(that.qdeMsiAltIdInd) : that.qdeMsiAltIdInd != null)
            return false;
        if (qdeMsiAltId != null ? !qdeMsiAltId.equals(that.qdeMsiAltId) : that.qdeMsiAltId != null) return false;
        if (qdeAltInsTypeInd != null ? !qdeAltInsTypeInd.equals(that.qdeAltInsTypeInd) : that.qdeAltInsTypeInd != null)
            return false;
        if (qdeAlternateInsType != null ? !qdeAlternateInsType.equals(that.qdeAlternateInsType) : that.qdeAlternateInsType != null)
            return false;
        if (qdeMbrAptcIndInd != null ? !qdeMbrAptcIndInd.equals(that.qdeMbrAptcIndInd) : that.qdeMbrAptcIndInd != null)
            return false;
        if (qdeMbrAptcInd != null ? !qdeMbrAptcInd.equals(that.qdeMbrAptcInd) : that.qdeMbrAptcInd != null)
            return false;
        if (qdeHimGpEffDateInd != null ? !qdeHimGpEffDateInd.equals(that.qdeHimGpEffDateInd) : that.qdeHimGpEffDateInd != null)
            return false;
        if (qdeHimGpEffDate != null ? !qdeHimGpEffDate.equals(that.qdeHimGpEffDate) : that.qdeHimGpEffDate != null)
            return false;
        if (qdeHimGpThruDateInd != null ? !qdeHimGpThruDateInd.equals(that.qdeHimGpThruDateInd) : that.qdeHimGpThruDateInd != null)
            return false;
        if (qdeHimGpThruDate != null ? !qdeHimGpThruDate.equals(that.qdeHimGpThruDate) : that.qdeHimGpThruDate != null)
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
        result = 31 * result + (qdePersonCodeInd != null ? qdePersonCodeInd.hashCode() : 0);
        result = 31 * result + (qdePersonCode != null ? qdePersonCode.hashCode() : 0);
        result = 31 * result + (qdeGenderInd != null ? qdeGenderInd.hashCode() : 0);
        result = 31 * result + (qdeGender != null ? qdeGender.hashCode() : 0);
        result = 31 * result + (qdeDateOfBirthInd != null ? qdeDateOfBirthInd.hashCode() : 0);
        result = 31 * result + (qdeDateOfBirth != null ? qdeDateOfBirth.hashCode() : 0);
        result = 31 * result + (qdeDurKeyInd != null ? qdeDurKeyInd.hashCode() : 0);
        result = 31 * result + (qdeDurKey != null ? qdeDurKey.hashCode() : 0);
        result = 31 * result + (qdeSocSecNbrInd != null ? qdeSocSecNbrInd.hashCode() : 0);
        result = 31 * result + (int) (qdeSocSecNbr ^ (qdeSocSecNbr >>> 32));
        result = 31 * result + (qdeAddress1Ind != null ? qdeAddress1Ind.hashCode() : 0);
        result = 31 * result + (qdeAddress1 != null ? qdeAddress1.hashCode() : 0);
        result = 31 * result + (qdeAddress2Ind != null ? qdeAddress2Ind.hashCode() : 0);
        result = 31 * result + (qdeAddress2 != null ? qdeAddress2.hashCode() : 0);
        result = 31 * result + (qdeAddress3Ind != null ? qdeAddress3Ind.hashCode() : 0);
        result = 31 * result + (qdeAddress3 != null ? qdeAddress3.hashCode() : 0);
        result = 31 * result + (qdeCityInd != null ? qdeCityInd.hashCode() : 0);
        result = 31 * result + (qdeCity != null ? qdeCity.hashCode() : 0);
        result = 31 * result + (qdeStateInd != null ? qdeStateInd.hashCode() : 0);
        result = 31 * result + (qdeState != null ? qdeState.hashCode() : 0);
        result = 31 * result + (qdeZipInd != null ? qdeZipInd.hashCode() : 0);
        result = 31 * result + (qdeZip != null ? qdeZip.hashCode() : 0);
        result = 31 * result + (qdeZip2Ind != null ? qdeZip2Ind.hashCode() : 0);
        result = 31 * result + (qdeZip2 != null ? qdeZip2.hashCode() : 0);
        result = 31 * result + (qdeZip3Ind != null ? qdeZip3Ind.hashCode() : 0);
        result = 31 * result + (qdeZip3 != null ? qdeZip3.hashCode() : 0);
        result = 31 * result + (qdeFamilyFlagInd != null ? qdeFamilyFlagInd.hashCode() : 0);
        result = 31 * result + (qdeFamilyFlag != null ? qdeFamilyFlag.hashCode() : 0);
        result = 31 * result + (qdeFamilyTypeInd != null ? qdeFamilyTypeInd.hashCode() : 0);
        result = 31 * result + (qdeFamilyType != null ? qdeFamilyType.hashCode() : 0);
        result = 31 * result + (qdeFamilyIdInd != null ? qdeFamilyIdInd.hashCode() : 0);
        result = 31 * result + (qdeFamilyId != null ? qdeFamilyId.hashCode() : 0);
        result = 31 * result + (planCode != null ? planCode.hashCode() : 0);
        result = 31 * result + (planEffDate != null ? planEffDate.hashCode() : 0);
        result = 31 * result + (qdePlanCodeInd != null ? qdePlanCodeInd.hashCode() : 0);
        result = 31 * result + (qdePlanEffDateInd != null ? qdePlanEffDateInd.hashCode() : 0);
        result = 31 * result + (qdeMedicareCvgTypeInd != null ? qdeMedicareCvgTypeInd.hashCode() : 0);
        result = 31 * result + (qdeMedicareCvgType != null ? qdeMedicareCvgType.hashCode() : 0);
        result = 31 * result + (qdeInactvFutureCovInd != null ? qdeInactvFutureCovInd.hashCode() : 0);
        result = 31 * result + (qdeInactvFutureCov != null ? qdeInactvFutureCov.hashCode() : 0);
        result = 31 * result + (qdeClientProdCodeInd != null ? qdeClientProdCodeInd.hashCode() : 0);
        result = 31 * result + (qdeClientProductCode != null ? qdeClientProductCode.hashCode() : 0);
        result = 31 * result + (qdeClientRiderCodeInd != null ? qdeClientRiderCodeInd.hashCode() : 0);
        result = 31 * result + (qdeClientRiderCode != null ? qdeClientRiderCode.hashCode() : 0);
        result = 31 * result + (qdeMedPartdCntNbrInd != null ? qdeMedPartdCntNbrInd.hashCode() : 0);
        result = 31 * result + (qdeMedPartdCntNbr != null ? qdeMedPartdCntNbr.hashCode() : 0);
        result = 31 * result + (qdeMedicareHicInd != null ? qdeMedicareHicInd.hashCode() : 0);
        result = 31 * result + (qdeMedicareHic != null ? qdeMedicareHic.hashCode() : 0);
        result = 31 * result + (qdePbpInd != null ? qdePbpInd.hashCode() : 0);
        result = 31 * result + (qdePbp != null ? qdePbp.hashCode() : 0);
        result = 31 * result + (qdeSubsidyLevelInd != null ? qdeSubsidyLevelInd.hashCode() : 0);
        result = 31 * result + (qdeSubsidyLevel != null ? qdeSubsidyLevel.hashCode() : 0);
        result = 31 * result + (qdeCopayCategoryInd != null ? qdeCopayCategoryInd.hashCode() : 0);
        result = 31 * result + (qdeCopayCategory != null ? qdeCopayCategory.hashCode() : 0);
        result = 31 * result + (qdeMbrCddEffDateInd != null ? qdeMbrCddEffDateInd.hashCode() : 0);
        result = 31 * result + (qdeMbrCddEffDate != null ? qdeMbrCddEffDate.hashCode() : 0);
        result = 31 * result + (qdeMbrCddThruDateInd != null ? qdeMbrCddThruDateInd.hashCode() : 0);
        result = 31 * result + (qdeMbrCddThruDate != null ? qdeMbrCddThruDate.hashCode() : 0);
        result = 31 * result + (qdeMbrCddInd != null ? qdeMbrCddInd.hashCode() : 0);
        result = 31 * result + (qdeMbrCdd != null ? qdeMbrCdd.hashCode() : 0);
        result = 31 * result + (qdeMpartdEffDateInd != null ? qdeMpartdEffDateInd.hashCode() : 0);
        result = 31 * result + (qdeMpartdEffDate != null ? qdeMpartdEffDate.hashCode() : 0);
        result = 31 * result + (qdeMpartdThruDateInd != null ? qdeMpartdThruDateInd.hashCode() : 0);
        result = 31 * result + (qdeMpartdThruDate != null ? qdeMpartdThruDate.hashCode() : 0);
        result = 31 * result + (qdeMsiAltIdInd != null ? qdeMsiAltIdInd.hashCode() : 0);
        result = 31 * result + (qdeMsiAltId != null ? qdeMsiAltId.hashCode() : 0);
        result = 31 * result + (qdeAltInsTypeInd != null ? qdeAltInsTypeInd.hashCode() : 0);
        result = 31 * result + (qdeAlternateInsType != null ? qdeAlternateInsType.hashCode() : 0);
        result = 31 * result + (qdeMbrAptcIndInd != null ? qdeMbrAptcIndInd.hashCode() : 0);
        result = 31 * result + (qdeMbrAptcInd != null ? qdeMbrAptcInd.hashCode() : 0);
        result = 31 * result + (qdeHimGpEffDateInd != null ? qdeHimGpEffDateInd.hashCode() : 0);
        result = 31 * result + (qdeHimGpEffDate != null ? qdeHimGpEffDate.hashCode() : 0);
        result = 31 * result + (qdeHimGpThruDateInd != null ? qdeHimGpThruDateInd.hashCode() : 0);
        result = 31 * result + (qdeHimGpThruDate != null ? qdeHimGpThruDate.hashCode() : 0);
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
        return "ElgEligQualityDefaultsQde{" +
                "carCarrierId='" + carCarrierId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", qdePersonCodeInd='" + qdePersonCodeInd + '\'' +
                ", qdePersonCode='" + qdePersonCode + '\'' +
                ", qdeGenderInd='" + qdeGenderInd + '\'' +
                ", qdeGender='" + qdeGender + '\'' +
                ", qdeDateOfBirthInd='" + qdeDateOfBirthInd + '\'' +
                ", qdeDateOfBirth=" + qdeDateOfBirth +
                ", qdeDurKeyInd='" + qdeDurKeyInd + '\'' +
                ", qdeDurKey='" + qdeDurKey + '\'' +
                ", qdeSocSecNbrInd='" + qdeSocSecNbrInd + '\'' +
                ", qdeSocSecNbr=" + qdeSocSecNbr +
                ", qdeAddress1Ind='" + qdeAddress1Ind + '\'' +
                ", qdeAddress1='" + qdeAddress1 + '\'' +
                ", qdeAddress2Ind='" + qdeAddress2Ind + '\'' +
                ", qdeAddress2='" + qdeAddress2 + '\'' +
                ", qdeAddress3Ind='" + qdeAddress3Ind + '\'' +
                ", qdeAddress3='" + qdeAddress3 + '\'' +
                ", qdeCityInd='" + qdeCityInd + '\'' +
                ", qdeCity='" + qdeCity + '\'' +
                ", qdeStateInd='" + qdeStateInd + '\'' +
                ", qdeState='" + qdeState + '\'' +
                ", qdeZipInd='" + qdeZipInd + '\'' +
                ", qdeZip='" + qdeZip + '\'' +
                ", qdeZip2Ind='" + qdeZip2Ind + '\'' +
                ", qdeZip2='" + qdeZip2 + '\'' +
                ", qdeZip3Ind='" + qdeZip3Ind + '\'' +
                ", qdeZip3='" + qdeZip3 + '\'' +
                ", qdeFamilyFlagInd='" + qdeFamilyFlagInd + '\'' +
                ", qdeFamilyFlag='" + qdeFamilyFlag + '\'' +
                ", qdeFamilyTypeInd='" + qdeFamilyTypeInd + '\'' +
                ", qdeFamilyType='" + qdeFamilyType + '\'' +
                ", qdeFamilyIdInd='" + qdeFamilyIdInd + '\'' +
                ", qdeFamilyId='" + qdeFamilyId + '\'' +
                ", planCode='" + planCode + '\'' +
                ", planEffDate=" + planEffDate +
                ", qdePlanCodeInd='" + qdePlanCodeInd + '\'' +
                ", qdePlanEffDateInd='" + qdePlanEffDateInd + '\'' +
                ", qdeMedicareCvgTypeInd='" + qdeMedicareCvgTypeInd + '\'' +
                ", qdeMedicareCvgType='" + qdeMedicareCvgType + '\'' +
                ", qdeInactvFutureCovInd='" + qdeInactvFutureCovInd + '\'' +
                ", qdeInactvFutureCov='" + qdeInactvFutureCov + '\'' +
                ", qdeClientProdCodeInd='" + qdeClientProdCodeInd + '\'' +
                ", qdeClientProductCode='" + qdeClientProductCode + '\'' +
                ", qdeClientRiderCodeInd='" + qdeClientRiderCodeInd + '\'' +
                ", qdeClientRiderCode='" + qdeClientRiderCode + '\'' +
                ", qdeMedPartdCntNbrInd='" + qdeMedPartdCntNbrInd + '\'' +
                ", qdeMedPartdCntNbr='" + qdeMedPartdCntNbr + '\'' +
                ", qdeMedicareHicInd='" + qdeMedicareHicInd + '\'' +
                ", qdeMedicareHic='" + qdeMedicareHic + '\'' +
                ", qdePbpInd='" + qdePbpInd + '\'' +
                ", qdePbp='" + qdePbp + '\'' +
                ", qdeSubsidyLevelInd='" + qdeSubsidyLevelInd + '\'' +
                ", qdeSubsidyLevel='" + qdeSubsidyLevel + '\'' +
                ", qdeCopayCategoryInd='" + qdeCopayCategoryInd + '\'' +
                ", qdeCopayCategory='" + qdeCopayCategory + '\'' +
                ", qdeMbrCddEffDateInd='" + qdeMbrCddEffDateInd + '\'' +
                ", qdeMbrCddEffDate=" + qdeMbrCddEffDate +
                ", qdeMbrCddThruDateInd='" + qdeMbrCddThruDateInd + '\'' +
                ", qdeMbrCddThruDate=" + qdeMbrCddThruDate +
                ", qdeMbrCddInd='" + qdeMbrCddInd + '\'' +
                ", qdeMbrCdd='" + qdeMbrCdd + '\'' +
                ", qdeMpartdEffDateInd='" + qdeMpartdEffDateInd + '\'' +
                ", qdeMpartdEffDate=" + qdeMpartdEffDate +
                ", qdeMpartdThruDateInd='" + qdeMpartdThruDateInd + '\'' +
                ", qdeMpartdThruDate=" + qdeMpartdThruDate +
                ", qdeMsiAltIdInd='" + qdeMsiAltIdInd + '\'' +
                ", qdeMsiAltId='" + qdeMsiAltId + '\'' +
                ", qdeAltInsTypeInd='" + qdeAltInsTypeInd + '\'' +
                ", qdeAlternateInsType='" + qdeAlternateInsType + '\'' +
                ", qdeMbrAptcIndInd='" + qdeMbrAptcIndInd + '\'' +
                ", qdeMbrAptcInd='" + qdeMbrAptcInd + '\'' +
                ", qdeHimGpEffDateInd='" + qdeHimGpEffDateInd + '\'' +
                ", qdeHimGpEffDate=" + qdeHimGpEffDate +
                ", qdeHimGpThruDateInd='" + qdeHimGpThruDateInd + '\'' +
                ", qdeHimGpThruDate=" + qdeHimGpThruDate +
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
