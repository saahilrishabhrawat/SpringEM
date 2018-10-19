package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by bkocinsk on 8/9/2018.
 */
@Entity
@Table(name = "ELG_ELIG_HEALTH_DEFAULTS_EHD")
@IdClass(ElgEligHealthDefaultsEhdPK.class)
public class ElgEligHealthDefaultsEhd {
    private String carCarrierId;
    private String accountId;
    private String groupId;
    private String ehdDiagCode1Ind;
    private String ehdDiagCode1;
    private String ehdDiagCode2Ind;
    private String ehdDiagCode2;
    private String ehdDiagCode3Ind;
    private String ehdDiagCode3;
    private String ehdDiagCode4Ind;
    private String ehdDiagCode4;
    private String ehdDiagCode5Ind;
    private String ehdDiagCode5;
    private String ehdDiagCode6Ind;
    private String ehdDiagCode6;
    private String ehdDiagCode7Ind;
    private String ehdDiagCode7;
    private String ehdDiagCode8Ind;
    private String ehdDiagCode8;
    private String ehdDiagCode9Ind;
    private String ehdDiagCode9;
    private String ehdDiagCode10Ind;
    private String ehdDiagCode10;
    private String ehdAllergyCode1Ind;
    private String ehdAllergyCode1;
    private String ehdAllergyCode2Ind;
    private String ehdAllergyCode2;
    private String ehdAllergyCode3Ind;
    private String ehdAllergyCode3;
    private String ehdAllergyCode4Ind;
    private String ehdAllergyCode4;
    private String ehdAllergyCode5Ind;
    private String ehdAllergyCode5;
    private String ehdAllergyCode6Ind;
    private String ehdAllergyCode6;
    private String ehdAlcoholInd;
    private String ehdAlcoholCode;
    private String ehdBloodTypeInd;
    private String ehdBloodType;
    private String ehdContactLensInd;
    private String ehdContactLensCode;
    private String ehdHeightInd;
    private BigDecimal ehdHeight;
    private String ehdPregnancyInd;
    private String ehdPregnantCode;
    private String ehdSmokingInd;
    private String ehdSmokingCode;
    private String ehdWeightInd;
    private BigDecimal ehdWeight;
    private String ehdMiscCode1Ind;
    private String ehdMiscCode1;
    private String ehdMiscCode2Ind;
    private String ehdMiscCode2;
    private String ehdUseIcdValidation;
    private String ehdDiagQual1;
    private String ehdDiagQual2;
    private String ehdDiagQual3;
    private String ehdDiagQual4;
    private String ehdDiagQual5;
    private String ehdDiagQual6;
    private String ehdDiagQual7;
    private String ehdDiagQual8;
    private String ehdDiagQual9;
    private String ehdDiagQual10;
    private String ehdDiagType1;
    private String ehdDiagType2;
    private String ehdDiagType3;
    private String ehdDiagType4;
    private String ehdDiagType5;
    private String ehdDiagType6;
    private String ehdDiagType7;
    private String ehdDiagType8;
    private String ehdDiagType9;
    private String ehdDiagType10;
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
    @Column(name = "EHD_DIAG_CODE_1_IND")
    public String getEhdDiagCode1Ind() {
        return ehdDiagCode1Ind;
    }

    public void setEhdDiagCode1Ind(String ehdDiagCode1Ind) {
        this.ehdDiagCode1Ind = ehdDiagCode1Ind;
    }

    @Basic
    @Column(name = "EHD_DIAG_CODE_1")
    public String getEhdDiagCode1() {
        return ehdDiagCode1;
    }

    public void setEhdDiagCode1(String ehdDiagCode1) {
        this.ehdDiagCode1 = ehdDiagCode1;
    }

    @Basic
    @Column(name = "EHD_DIAG_CODE_2_IND")
    public String getEhdDiagCode2Ind() {
        return ehdDiagCode2Ind;
    }

    public void setEhdDiagCode2Ind(String ehdDiagCode2Ind) {
        this.ehdDiagCode2Ind = ehdDiagCode2Ind;
    }

    @Basic
    @Column(name = "EHD_DIAG_CODE_2")
    public String getEhdDiagCode2() {
        return ehdDiagCode2;
    }

    public void setEhdDiagCode2(String ehdDiagCode2) {
        this.ehdDiagCode2 = ehdDiagCode2;
    }

    @Basic
    @Column(name = "EHD_DIAG_CODE_3_IND")
    public String getEhdDiagCode3Ind() {
        return ehdDiagCode3Ind;
    }

    public void setEhdDiagCode3Ind(String ehdDiagCode3Ind) {
        this.ehdDiagCode3Ind = ehdDiagCode3Ind;
    }

    @Basic
    @Column(name = "EHD_DIAG_CODE_3")
    public String getEhdDiagCode3() {
        return ehdDiagCode3;
    }

    public void setEhdDiagCode3(String ehdDiagCode3) {
        this.ehdDiagCode3 = ehdDiagCode3;
    }

    @Basic
    @Column(name = "EHD_DIAG_CODE_4_IND")
    public String getEhdDiagCode4Ind() {
        return ehdDiagCode4Ind;
    }

    public void setEhdDiagCode4Ind(String ehdDiagCode4Ind) {
        this.ehdDiagCode4Ind = ehdDiagCode4Ind;
    }

    @Basic
    @Column(name = "EHD_DIAG_CODE_4")
    public String getEhdDiagCode4() {
        return ehdDiagCode4;
    }

    public void setEhdDiagCode4(String ehdDiagCode4) {
        this.ehdDiagCode4 = ehdDiagCode4;
    }

    @Basic
    @Column(name = "EHD_DIAG_CODE_5_IND")
    public String getEhdDiagCode5Ind() {
        return ehdDiagCode5Ind;
    }

    public void setEhdDiagCode5Ind(String ehdDiagCode5Ind) {
        this.ehdDiagCode5Ind = ehdDiagCode5Ind;
    }

    @Basic
    @Column(name = "EHD_DIAG_CODE_5")
    public String getEhdDiagCode5() {
        return ehdDiagCode5;
    }

    public void setEhdDiagCode5(String ehdDiagCode5) {
        this.ehdDiagCode5 = ehdDiagCode5;
    }

    @Basic
    @Column(name = "EHD_DIAG_CODE_6_IND")
    public String getEhdDiagCode6Ind() {
        return ehdDiagCode6Ind;
    }

    public void setEhdDiagCode6Ind(String ehdDiagCode6Ind) {
        this.ehdDiagCode6Ind = ehdDiagCode6Ind;
    }

    @Basic
    @Column(name = "EHD_DIAG_CODE_6")
    public String getEhdDiagCode6() {
        return ehdDiagCode6;
    }

    public void setEhdDiagCode6(String ehdDiagCode6) {
        this.ehdDiagCode6 = ehdDiagCode6;
    }

    @Basic
    @Column(name = "EHD_DIAG_CODE_7_IND")
    public String getEhdDiagCode7Ind() {
        return ehdDiagCode7Ind;
    }

    public void setEhdDiagCode7Ind(String ehdDiagCode7Ind) {
        this.ehdDiagCode7Ind = ehdDiagCode7Ind;
    }

    @Basic
    @Column(name = "EHD_DIAG_CODE_7")
    public String getEhdDiagCode7() {
        return ehdDiagCode7;
    }

    public void setEhdDiagCode7(String ehdDiagCode7) {
        this.ehdDiagCode7 = ehdDiagCode7;
    }

    @Basic
    @Column(name = "EHD_DIAG_CODE_8_IND")
    public String getEhdDiagCode8Ind() {
        return ehdDiagCode8Ind;
    }

    public void setEhdDiagCode8Ind(String ehdDiagCode8Ind) {
        this.ehdDiagCode8Ind = ehdDiagCode8Ind;
    }

    @Basic
    @Column(name = "EHD_DIAG_CODE_8")
    public String getEhdDiagCode8() {
        return ehdDiagCode8;
    }

    public void setEhdDiagCode8(String ehdDiagCode8) {
        this.ehdDiagCode8 = ehdDiagCode8;
    }

    @Basic
    @Column(name = "EHD_DIAG_CODE_9_IND")
    public String getEhdDiagCode9Ind() {
        return ehdDiagCode9Ind;
    }

    public void setEhdDiagCode9Ind(String ehdDiagCode9Ind) {
        this.ehdDiagCode9Ind = ehdDiagCode9Ind;
    }

    @Basic
    @Column(name = "EHD_DIAG_CODE_9")
    public String getEhdDiagCode9() {
        return ehdDiagCode9;
    }

    public void setEhdDiagCode9(String ehdDiagCode9) {
        this.ehdDiagCode9 = ehdDiagCode9;
    }

    @Basic
    @Column(name = "EHD_DIAG_CODE_10_IND")
    public String getEhdDiagCode10Ind() {
        return ehdDiagCode10Ind;
    }

    public void setEhdDiagCode10Ind(String ehdDiagCode10Ind) {
        this.ehdDiagCode10Ind = ehdDiagCode10Ind;
    }

    @Basic
    @Column(name = "EHD_DIAG_CODE_10")
    public String getEhdDiagCode10() {
        return ehdDiagCode10;
    }

    public void setEhdDiagCode10(String ehdDiagCode10) {
        this.ehdDiagCode10 = ehdDiagCode10;
    }

    @Basic
    @Column(name = "EHD_ALLERGY_CODE_1_IND")
    public String getEhdAllergyCode1Ind() {
        return ehdAllergyCode1Ind;
    }

    public void setEhdAllergyCode1Ind(String ehdAllergyCode1Ind) {
        this.ehdAllergyCode1Ind = ehdAllergyCode1Ind;
    }

    @Basic
    @Column(name = "EHD_ALLERGY_CODE_1")
    public String getEhdAllergyCode1() {
        return ehdAllergyCode1;
    }

    public void setEhdAllergyCode1(String ehdAllergyCode1) {
        this.ehdAllergyCode1 = ehdAllergyCode1;
    }

    @Basic
    @Column(name = "EHD_ALLERGY_CODE_2_IND")
    public String getEhdAllergyCode2Ind() {
        return ehdAllergyCode2Ind;
    }

    public void setEhdAllergyCode2Ind(String ehdAllergyCode2Ind) {
        this.ehdAllergyCode2Ind = ehdAllergyCode2Ind;
    }

    @Basic
    @Column(name = "EHD_ALLERGY_CODE_2")
    public String getEhdAllergyCode2() {
        return ehdAllergyCode2;
    }

    public void setEhdAllergyCode2(String ehdAllergyCode2) {
        this.ehdAllergyCode2 = ehdAllergyCode2;
    }

    @Basic
    @Column(name = "EHD_ALLERGY_CODE_3_IND")
    public String getEhdAllergyCode3Ind() {
        return ehdAllergyCode3Ind;
    }

    public void setEhdAllergyCode3Ind(String ehdAllergyCode3Ind) {
        this.ehdAllergyCode3Ind = ehdAllergyCode3Ind;
    }

    @Basic
    @Column(name = "EHD_ALLERGY_CODE_3")
    public String getEhdAllergyCode3() {
        return ehdAllergyCode3;
    }

    public void setEhdAllergyCode3(String ehdAllergyCode3) {
        this.ehdAllergyCode3 = ehdAllergyCode3;
    }

    @Basic
    @Column(name = "EHD_ALLERGY_CODE_4_IND")
    public String getEhdAllergyCode4Ind() {
        return ehdAllergyCode4Ind;
    }

    public void setEhdAllergyCode4Ind(String ehdAllergyCode4Ind) {
        this.ehdAllergyCode4Ind = ehdAllergyCode4Ind;
    }

    @Basic
    @Column(name = "EHD_ALLERGY_CODE_4")
    public String getEhdAllergyCode4() {
        return ehdAllergyCode4;
    }

    public void setEhdAllergyCode4(String ehdAllergyCode4) {
        this.ehdAllergyCode4 = ehdAllergyCode4;
    }

    @Basic
    @Column(name = "EHD_ALLERGY_CODE_5_IND")
    public String getEhdAllergyCode5Ind() {
        return ehdAllergyCode5Ind;
    }

    public void setEhdAllergyCode5Ind(String ehdAllergyCode5Ind) {
        this.ehdAllergyCode5Ind = ehdAllergyCode5Ind;
    }

    @Basic
    @Column(name = "EHD_ALLERGY_CODE_5")
    public String getEhdAllergyCode5() {
        return ehdAllergyCode5;
    }

    public void setEhdAllergyCode5(String ehdAllergyCode5) {
        this.ehdAllergyCode5 = ehdAllergyCode5;
    }

    @Basic
    @Column(name = "EHD_ALLERGY_CODE_6_IND")
    public String getEhdAllergyCode6Ind() {
        return ehdAllergyCode6Ind;
    }

    public void setEhdAllergyCode6Ind(String ehdAllergyCode6Ind) {
        this.ehdAllergyCode6Ind = ehdAllergyCode6Ind;
    }

    @Basic
    @Column(name = "EHD_ALLERGY_CODE_6")
    public String getEhdAllergyCode6() {
        return ehdAllergyCode6;
    }

    public void setEhdAllergyCode6(String ehdAllergyCode6) {
        this.ehdAllergyCode6 = ehdAllergyCode6;
    }

    @Basic
    @Column(name = "EHD_ALCOHOL_IND")
    public String getEhdAlcoholInd() {
        return ehdAlcoholInd;
    }

    public void setEhdAlcoholInd(String ehdAlcoholInd) {
        this.ehdAlcoholInd = ehdAlcoholInd;
    }

    @Basic
    @Column(name = "EHD_ALCOHOL_CODE")
    public String getEhdAlcoholCode() {
        return ehdAlcoholCode;
    }

    public void setEhdAlcoholCode(String ehdAlcoholCode) {
        this.ehdAlcoholCode = ehdAlcoholCode;
    }

    @Basic
    @Column(name = "EHD_BLOOD_TYPE_IND")
    public String getEhdBloodTypeInd() {
        return ehdBloodTypeInd;
    }

    public void setEhdBloodTypeInd(String ehdBloodTypeInd) {
        this.ehdBloodTypeInd = ehdBloodTypeInd;
    }

    @Basic
    @Column(name = "EHD_BLOOD_TYPE")
    public String getEhdBloodType() {
        return ehdBloodType;
    }

    public void setEhdBloodType(String ehdBloodType) {
        this.ehdBloodType = ehdBloodType;
    }

    @Basic
    @Column(name = "EHD_CONTACT_LENS_IND")
    public String getEhdContactLensInd() {
        return ehdContactLensInd;
    }

    public void setEhdContactLensInd(String ehdContactLensInd) {
        this.ehdContactLensInd = ehdContactLensInd;
    }

    @Basic
    @Column(name = "EHD_CONTACT_LENS_CODE")
    public String getEhdContactLensCode() {
        return ehdContactLensCode;
    }

    public void setEhdContactLensCode(String ehdContactLensCode) {
        this.ehdContactLensCode = ehdContactLensCode;
    }

    @Basic
    @Column(name = "EHD_HEIGHT_IND")
    public String getEhdHeightInd() {
        return ehdHeightInd;
    }

    public void setEhdHeightInd(String ehdHeightInd) {
        this.ehdHeightInd = ehdHeightInd;
    }

    @Basic
    @Column(name = "EHD_HEIGHT")
    public BigDecimal getEhdHeight() {
        if (this.ehdHeight == null) {
            return BigDecimal.ZERO;
        }
        return ehdHeight;
    }

    public void setEhdHeight(BigDecimal ehdHeight) {
        this.ehdHeight = ehdHeight;
    }

    @Basic
    @Column(name = "EHD_PREGNANCY_IND")
    public String getEhdPregnancyInd() {
        return ehdPregnancyInd;
    }

    public void setEhdPregnancyInd(String ehdPregnancyInd) {
        this.ehdPregnancyInd = ehdPregnancyInd;
    }

    @Basic
    @Column(name = "EHD_PREGNANT_CODE")
    public String getEhdPregnantCode() {
        return ehdPregnantCode;
    }

    public void setEhdPregnantCode(String ehdPregnantCode) {
        this.ehdPregnantCode = ehdPregnantCode;
    }

    @Basic
    @Column(name = "EHD_SMOKING_IND")
    public String getEhdSmokingInd() {
        return ehdSmokingInd;
    }

    public void setEhdSmokingInd(String ehdSmokingInd) {
        this.ehdSmokingInd = ehdSmokingInd;
    }

    @Basic
    @Column(name = "EHD_SMOKING_CODE")
    public String getEhdSmokingCode() {
        return ehdSmokingCode;
    }

    public void setEhdSmokingCode(String ehdSmokingCode) {
        this.ehdSmokingCode = ehdSmokingCode;
    }

    @Basic
    @Column(name = "EHD_WEIGHT_IND")
    public String getEhdWeightInd() {
        return ehdWeightInd;
    }

    public void setEhdWeightInd(String ehdWeightInd) {
        this.ehdWeightInd = ehdWeightInd;
    }

    @Basic
    @Column(name = "EHD_WEIGHT")
    public BigDecimal getEhdWeight() {
        if (this.ehdWeight == null) {
            return BigDecimal.ZERO;
        }
        return ehdWeight;
    }

    public void setEhdWeight(BigDecimal ehdWeight) {
        this.ehdWeight = ehdWeight;
    }

    @Basic
    @Column(name = "EHD_MISC_CODE_1_IND")
    public String getEhdMiscCode1Ind() {
        return ehdMiscCode1Ind;
    }

    public void setEhdMiscCode1Ind(String ehdMiscCode1Ind) {
        this.ehdMiscCode1Ind = ehdMiscCode1Ind;
    }

    @Basic
    @Column(name = "EHD_MISC_CODE_1")
    public String getEhdMiscCode1() {
        return ehdMiscCode1;
    }

    public void setEhdMiscCode1(String ehdMiscCode1) {
        this.ehdMiscCode1 = ehdMiscCode1;
    }

    @Basic
    @Column(name = "EHD_MISC_CODE_2_IND")
    public String getEhdMiscCode2Ind() {
        return ehdMiscCode2Ind;
    }

    public void setEhdMiscCode2Ind(String ehdMiscCode2Ind) {
        this.ehdMiscCode2Ind = ehdMiscCode2Ind;
    }

    @Basic
    @Column(name = "EHD_MISC_CODE_2")
    public String getEhdMiscCode2() {
        return ehdMiscCode2;
    }

    public void setEhdMiscCode2(String ehdMiscCode2) {
        this.ehdMiscCode2 = ehdMiscCode2;
    }

    @Basic
    @Column(name = "EHD_USE_ICD_VALIDATION")
    public String getEhdUseIcdValidation() {
        return ehdUseIcdValidation;
    }

    public void setEhdUseIcdValidation(String ehdUseIcdValidation) {
        this.ehdUseIcdValidation = ehdUseIcdValidation;
    }

    @Basic
    @Column(name = "EHD_DIAG_QUAL_1")
    public String getEhdDiagQual1() {
        return ehdDiagQual1;
    }

    public void setEhdDiagQual1(String ehdDiagQual1) {
        this.ehdDiagQual1 = ehdDiagQual1;
    }

    @Basic
    @Column(name = "EHD_DIAG_QUAL_2")
    public String getEhdDiagQual2() {
        return ehdDiagQual2;
    }

    public void setEhdDiagQual2(String ehdDiagQual2) {
        this.ehdDiagQual2 = ehdDiagQual2;
    }

    @Basic
    @Column(name = "EHD_DIAG_QUAL_3")
    public String getEhdDiagQual3() {
        return ehdDiagQual3;
    }

    public void setEhdDiagQual3(String ehdDiagQual3) {
        this.ehdDiagQual3 = ehdDiagQual3;
    }

    @Basic
    @Column(name = "EHD_DIAG_QUAL_4")
    public String getEhdDiagQual4() {
        return ehdDiagQual4;
    }

    public void setEhdDiagQual4(String ehdDiagQual4) {
        this.ehdDiagQual4 = ehdDiagQual4;
    }

    @Basic
    @Column(name = "EHD_DIAG_QUAL_5")
    public String getEhdDiagQual5() {
        return ehdDiagQual5;
    }

    public void setEhdDiagQual5(String ehdDiagQual5) {
        this.ehdDiagQual5 = ehdDiagQual5;
    }

    @Basic
    @Column(name = "EHD_DIAG_QUAL_6")
    public String getEhdDiagQual6() {
        return ehdDiagQual6;
    }

    public void setEhdDiagQual6(String ehdDiagQual6) {
        this.ehdDiagQual6 = ehdDiagQual6;
    }

    @Basic
    @Column(name = "EHD_DIAG_QUAL_7")
    public String getEhdDiagQual7() {
        return ehdDiagQual7;
    }

    public void setEhdDiagQual7(String ehdDiagQual7) {
        this.ehdDiagQual7 = ehdDiagQual7;
    }

    @Basic
    @Column(name = "EHD_DIAG_QUAL_8")
    public String getEhdDiagQual8() {
        return ehdDiagQual8;
    }

    public void setEhdDiagQual8(String ehdDiagQual8) {
        this.ehdDiagQual8 = ehdDiagQual8;
    }

    @Basic
    @Column(name = "EHD_DIAG_QUAL_9")
    public String getEhdDiagQual9() {
        return ehdDiagQual9;
    }

    public void setEhdDiagQual9(String ehdDiagQual9) {
        this.ehdDiagQual9 = ehdDiagQual9;
    }

    @Basic
    @Column(name = "EHD_DIAG_QUAL_10")
    public String getEhdDiagQual10() {
        return ehdDiagQual10;
    }

    public void setEhdDiagQual10(String ehdDiagQual10) {
        this.ehdDiagQual10 = ehdDiagQual10;
    }

    @Basic
    @Column(name = "EHD_DIAG_TYPE_1")
    public String getEhdDiagType1() {
        return ehdDiagType1;
    }

    public void setEhdDiagType1(String ehdDiagType1) {
        this.ehdDiagType1 = ehdDiagType1;
    }

    @Basic
    @Column(name = "EHD_DIAG_TYPE_2")
    public String getEhdDiagType2() {
        return ehdDiagType2;
    }

    public void setEhdDiagType2(String ehdDiagType2) {
        this.ehdDiagType2 = ehdDiagType2;
    }

    @Basic
    @Column(name = "EHD_DIAG_TYPE_3")
    public String getEhdDiagType3() {
        return ehdDiagType3;
    }

    public void setEhdDiagType3(String ehdDiagType3) {
        this.ehdDiagType3 = ehdDiagType3;
    }

    @Basic
    @Column(name = "EHD_DIAG_TYPE_4")
    public String getEhdDiagType4() {
        return ehdDiagType4;
    }

    public void setEhdDiagType4(String ehdDiagType4) {
        this.ehdDiagType4 = ehdDiagType4;
    }

    @Basic
    @Column(name = "EHD_DIAG_TYPE_5")
    public String getEhdDiagType5() {
        return ehdDiagType5;
    }

    public void setEhdDiagType5(String ehdDiagType5) {
        this.ehdDiagType5 = ehdDiagType5;
    }

    @Basic
    @Column(name = "EHD_DIAG_TYPE_6")
    public String getEhdDiagType6() {
        return ehdDiagType6;
    }

    public void setEhdDiagType6(String ehdDiagType6) {
        this.ehdDiagType6 = ehdDiagType6;
    }

    @Basic
    @Column(name = "EHD_DIAG_TYPE_7")
    public String getEhdDiagType7() {
        return ehdDiagType7;
    }

    public void setEhdDiagType7(String ehdDiagType7) {
        this.ehdDiagType7 = ehdDiagType7;
    }

    @Basic
    @Column(name = "EHD_DIAG_TYPE_8")
    public String getEhdDiagType8() {
        return ehdDiagType8;
    }

    public void setEhdDiagType8(String ehdDiagType8) {
        this.ehdDiagType8 = ehdDiagType8;
    }

    @Basic
    @Column(name = "EHD_DIAG_TYPE_9")
    public String getEhdDiagType9() {
        return ehdDiagType9;
    }

    public void setEhdDiagType9(String ehdDiagType9) {
        this.ehdDiagType9 = ehdDiagType9;
    }

    @Basic
    @Column(name = "EHD_DIAG_TYPE_10")
    public String getEhdDiagType10() {
        return ehdDiagType10;
    }

    public void setEhdDiagType10(String ehdDiagType10) {
        this.ehdDiagType10 = ehdDiagType10;
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

        ElgEligHealthDefaultsEhd that = (ElgEligHealthDefaultsEhd) o;

        if (ehdHeight != that.ehdHeight) return false;
        if (ehdWeight != that.ehdWeight) return false;
        if (carCarrierId != null ? !carCarrierId.equals(that.carCarrierId) : that.carCarrierId != null) return false;
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        if (ehdDiagCode1Ind != null ? !ehdDiagCode1Ind.equals(that.ehdDiagCode1Ind) : that.ehdDiagCode1Ind != null)
            return false;
        if (ehdDiagCode1 != null ? !ehdDiagCode1.equals(that.ehdDiagCode1) : that.ehdDiagCode1 != null) return false;
        if (ehdDiagCode2Ind != null ? !ehdDiagCode2Ind.equals(that.ehdDiagCode2Ind) : that.ehdDiagCode2Ind != null)
            return false;
        if (ehdDiagCode2 != null ? !ehdDiagCode2.equals(that.ehdDiagCode2) : that.ehdDiagCode2 != null) return false;
        if (ehdDiagCode3Ind != null ? !ehdDiagCode3Ind.equals(that.ehdDiagCode3Ind) : that.ehdDiagCode3Ind != null)
            return false;
        if (ehdDiagCode3 != null ? !ehdDiagCode3.equals(that.ehdDiagCode3) : that.ehdDiagCode3 != null) return false;
        if (ehdDiagCode4Ind != null ? !ehdDiagCode4Ind.equals(that.ehdDiagCode4Ind) : that.ehdDiagCode4Ind != null)
            return false;
        if (ehdDiagCode4 != null ? !ehdDiagCode4.equals(that.ehdDiagCode4) : that.ehdDiagCode4 != null) return false;
        if (ehdDiagCode5Ind != null ? !ehdDiagCode5Ind.equals(that.ehdDiagCode5Ind) : that.ehdDiagCode5Ind != null)
            return false;
        if (ehdDiagCode5 != null ? !ehdDiagCode5.equals(that.ehdDiagCode5) : that.ehdDiagCode5 != null) return false;
        if (ehdDiagCode6Ind != null ? !ehdDiagCode6Ind.equals(that.ehdDiagCode6Ind) : that.ehdDiagCode6Ind != null)
            return false;
        if (ehdDiagCode6 != null ? !ehdDiagCode6.equals(that.ehdDiagCode6) : that.ehdDiagCode6 != null) return false;
        if (ehdDiagCode7Ind != null ? !ehdDiagCode7Ind.equals(that.ehdDiagCode7Ind) : that.ehdDiagCode7Ind != null)
            return false;
        if (ehdDiagCode7 != null ? !ehdDiagCode7.equals(that.ehdDiagCode7) : that.ehdDiagCode7 != null) return false;
        if (ehdDiagCode8Ind != null ? !ehdDiagCode8Ind.equals(that.ehdDiagCode8Ind) : that.ehdDiagCode8Ind != null)
            return false;
        if (ehdDiagCode8 != null ? !ehdDiagCode8.equals(that.ehdDiagCode8) : that.ehdDiagCode8 != null) return false;
        if (ehdDiagCode9Ind != null ? !ehdDiagCode9Ind.equals(that.ehdDiagCode9Ind) : that.ehdDiagCode9Ind != null)
            return false;
        if (ehdDiagCode9 != null ? !ehdDiagCode9.equals(that.ehdDiagCode9) : that.ehdDiagCode9 != null) return false;
        if (ehdDiagCode10Ind != null ? !ehdDiagCode10Ind.equals(that.ehdDiagCode10Ind) : that.ehdDiagCode10Ind != null)
            return false;
        if (ehdDiagCode10 != null ? !ehdDiagCode10.equals(that.ehdDiagCode10) : that.ehdDiagCode10 != null)
            return false;
        if (ehdAllergyCode1Ind != null ? !ehdAllergyCode1Ind.equals(that.ehdAllergyCode1Ind) : that.ehdAllergyCode1Ind != null)
            return false;
        if (ehdAllergyCode1 != null ? !ehdAllergyCode1.equals(that.ehdAllergyCode1) : that.ehdAllergyCode1 != null)
            return false;
        if (ehdAllergyCode2Ind != null ? !ehdAllergyCode2Ind.equals(that.ehdAllergyCode2Ind) : that.ehdAllergyCode2Ind != null)
            return false;
        if (ehdAllergyCode2 != null ? !ehdAllergyCode2.equals(that.ehdAllergyCode2) : that.ehdAllergyCode2 != null)
            return false;
        if (ehdAllergyCode3Ind != null ? !ehdAllergyCode3Ind.equals(that.ehdAllergyCode3Ind) : that.ehdAllergyCode3Ind != null)
            return false;
        if (ehdAllergyCode3 != null ? !ehdAllergyCode3.equals(that.ehdAllergyCode3) : that.ehdAllergyCode3 != null)
            return false;
        if (ehdAllergyCode4Ind != null ? !ehdAllergyCode4Ind.equals(that.ehdAllergyCode4Ind) : that.ehdAllergyCode4Ind != null)
            return false;
        if (ehdAllergyCode4 != null ? !ehdAllergyCode4.equals(that.ehdAllergyCode4) : that.ehdAllergyCode4 != null)
            return false;
        if (ehdAllergyCode5Ind != null ? !ehdAllergyCode5Ind.equals(that.ehdAllergyCode5Ind) : that.ehdAllergyCode5Ind != null)
            return false;
        if (ehdAllergyCode5 != null ? !ehdAllergyCode5.equals(that.ehdAllergyCode5) : that.ehdAllergyCode5 != null)
            return false;
        if (ehdAllergyCode6Ind != null ? !ehdAllergyCode6Ind.equals(that.ehdAllergyCode6Ind) : that.ehdAllergyCode6Ind != null)
            return false;
        if (ehdAllergyCode6 != null ? !ehdAllergyCode6.equals(that.ehdAllergyCode6) : that.ehdAllergyCode6 != null)
            return false;
        if (ehdAlcoholInd != null ? !ehdAlcoholInd.equals(that.ehdAlcoholInd) : that.ehdAlcoholInd != null)
            return false;
        if (ehdAlcoholCode != null ? !ehdAlcoholCode.equals(that.ehdAlcoholCode) : that.ehdAlcoholCode != null)
            return false;
        if (ehdBloodTypeInd != null ? !ehdBloodTypeInd.equals(that.ehdBloodTypeInd) : that.ehdBloodTypeInd != null)
            return false;
        if (ehdBloodType != null ? !ehdBloodType.equals(that.ehdBloodType) : that.ehdBloodType != null) return false;
        if (ehdContactLensInd != null ? !ehdContactLensInd.equals(that.ehdContactLensInd) : that.ehdContactLensInd != null)
            return false;
        if (ehdContactLensCode != null ? !ehdContactLensCode.equals(that.ehdContactLensCode) : that.ehdContactLensCode != null)
            return false;
        if (ehdHeightInd != null ? !ehdHeightInd.equals(that.ehdHeightInd) : that.ehdHeightInd != null) return false;
        if (ehdPregnancyInd != null ? !ehdPregnancyInd.equals(that.ehdPregnancyInd) : that.ehdPregnancyInd != null)
            return false;
        if (ehdPregnantCode != null ? !ehdPregnantCode.equals(that.ehdPregnantCode) : that.ehdPregnantCode != null)
            return false;
        if (ehdSmokingInd != null ? !ehdSmokingInd.equals(that.ehdSmokingInd) : that.ehdSmokingInd != null)
            return false;
        if (ehdSmokingCode != null ? !ehdSmokingCode.equals(that.ehdSmokingCode) : that.ehdSmokingCode != null)
            return false;
        if (ehdWeightInd != null ? !ehdWeightInd.equals(that.ehdWeightInd) : that.ehdWeightInd != null) return false;
        if (ehdMiscCode1Ind != null ? !ehdMiscCode1Ind.equals(that.ehdMiscCode1Ind) : that.ehdMiscCode1Ind != null)
            return false;
        if (ehdMiscCode1 != null ? !ehdMiscCode1.equals(that.ehdMiscCode1) : that.ehdMiscCode1 != null) return false;
        if (ehdMiscCode2Ind != null ? !ehdMiscCode2Ind.equals(that.ehdMiscCode2Ind) : that.ehdMiscCode2Ind != null)
            return false;
        if (ehdMiscCode2 != null ? !ehdMiscCode2.equals(that.ehdMiscCode2) : that.ehdMiscCode2 != null) return false;
        if (ehdUseIcdValidation != null ? !ehdUseIcdValidation.equals(that.ehdUseIcdValidation) : that.ehdUseIcdValidation != null)
            return false;
        if (ehdDiagQual1 != null ? !ehdDiagQual1.equals(that.ehdDiagQual1) : that.ehdDiagQual1 != null) return false;
        if (ehdDiagQual2 != null ? !ehdDiagQual2.equals(that.ehdDiagQual2) : that.ehdDiagQual2 != null) return false;
        if (ehdDiagQual3 != null ? !ehdDiagQual3.equals(that.ehdDiagQual3) : that.ehdDiagQual3 != null) return false;
        if (ehdDiagQual4 != null ? !ehdDiagQual4.equals(that.ehdDiagQual4) : that.ehdDiagQual4 != null) return false;
        if (ehdDiagQual5 != null ? !ehdDiagQual5.equals(that.ehdDiagQual5) : that.ehdDiagQual5 != null) return false;
        if (ehdDiagQual6 != null ? !ehdDiagQual6.equals(that.ehdDiagQual6) : that.ehdDiagQual6 != null) return false;
        if (ehdDiagQual7 != null ? !ehdDiagQual7.equals(that.ehdDiagQual7) : that.ehdDiagQual7 != null) return false;
        if (ehdDiagQual8 != null ? !ehdDiagQual8.equals(that.ehdDiagQual8) : that.ehdDiagQual8 != null) return false;
        if (ehdDiagQual9 != null ? !ehdDiagQual9.equals(that.ehdDiagQual9) : that.ehdDiagQual9 != null) return false;
        if (ehdDiagQual10 != null ? !ehdDiagQual10.equals(that.ehdDiagQual10) : that.ehdDiagQual10 != null)
            return false;
        if (ehdDiagType1 != null ? !ehdDiagType1.equals(that.ehdDiagType1) : that.ehdDiagType1 != null) return false;
        if (ehdDiagType2 != null ? !ehdDiagType2.equals(that.ehdDiagType2) : that.ehdDiagType2 != null) return false;
        if (ehdDiagType3 != null ? !ehdDiagType3.equals(that.ehdDiagType3) : that.ehdDiagType3 != null) return false;
        if (ehdDiagType4 != null ? !ehdDiagType4.equals(that.ehdDiagType4) : that.ehdDiagType4 != null) return false;
        if (ehdDiagType5 != null ? !ehdDiagType5.equals(that.ehdDiagType5) : that.ehdDiagType5 != null) return false;
        if (ehdDiagType6 != null ? !ehdDiagType6.equals(that.ehdDiagType6) : that.ehdDiagType6 != null) return false;
        if (ehdDiagType7 != null ? !ehdDiagType7.equals(that.ehdDiagType7) : that.ehdDiagType7 != null) return false;
        if (ehdDiagType8 != null ? !ehdDiagType8.equals(that.ehdDiagType8) : that.ehdDiagType8 != null) return false;
        if (ehdDiagType9 != null ? !ehdDiagType9.equals(that.ehdDiagType9) : that.ehdDiagType9 != null) return false;
        if (ehdDiagType10 != null ? !ehdDiagType10.equals(that.ehdDiagType10) : that.ehdDiagType10 != null)
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
        result = 31 * result + (ehdDiagCode1Ind != null ? ehdDiagCode1Ind.hashCode() : 0);
        result = 31 * result + (ehdDiagCode1 != null ? ehdDiagCode1.hashCode() : 0);
        result = 31 * result + (ehdDiagCode2Ind != null ? ehdDiagCode2Ind.hashCode() : 0);
        result = 31 * result + (ehdDiagCode2 != null ? ehdDiagCode2.hashCode() : 0);
        result = 31 * result + (ehdDiagCode3Ind != null ? ehdDiagCode3Ind.hashCode() : 0);
        result = 31 * result + (ehdDiagCode3 != null ? ehdDiagCode3.hashCode() : 0);
        result = 31 * result + (ehdDiagCode4Ind != null ? ehdDiagCode4Ind.hashCode() : 0);
        result = 31 * result + (ehdDiagCode4 != null ? ehdDiagCode4.hashCode() : 0);
        result = 31 * result + (ehdDiagCode5Ind != null ? ehdDiagCode5Ind.hashCode() : 0);
        result = 31 * result + (ehdDiagCode5 != null ? ehdDiagCode5.hashCode() : 0);
        result = 31 * result + (ehdDiagCode6Ind != null ? ehdDiagCode6Ind.hashCode() : 0);
        result = 31 * result + (ehdDiagCode6 != null ? ehdDiagCode6.hashCode() : 0);
        result = 31 * result + (ehdDiagCode7Ind != null ? ehdDiagCode7Ind.hashCode() : 0);
        result = 31 * result + (ehdDiagCode7 != null ? ehdDiagCode7.hashCode() : 0);
        result = 31 * result + (ehdDiagCode8Ind != null ? ehdDiagCode8Ind.hashCode() : 0);
        result = 31 * result + (ehdDiagCode8 != null ? ehdDiagCode8.hashCode() : 0);
        result = 31 * result + (ehdDiagCode9Ind != null ? ehdDiagCode9Ind.hashCode() : 0);
        result = 31 * result + (ehdDiagCode9 != null ? ehdDiagCode9.hashCode() : 0);
        result = 31 * result + (ehdDiagCode10Ind != null ? ehdDiagCode10Ind.hashCode() : 0);
        result = 31 * result + (ehdDiagCode10 != null ? ehdDiagCode10.hashCode() : 0);
        result = 31 * result + (ehdAllergyCode1Ind != null ? ehdAllergyCode1Ind.hashCode() : 0);
        result = 31 * result + (ehdAllergyCode1 != null ? ehdAllergyCode1.hashCode() : 0);
        result = 31 * result + (ehdAllergyCode2Ind != null ? ehdAllergyCode2Ind.hashCode() : 0);
        result = 31 * result + (ehdAllergyCode2 != null ? ehdAllergyCode2.hashCode() : 0);
        result = 31 * result + (ehdAllergyCode3Ind != null ? ehdAllergyCode3Ind.hashCode() : 0);
        result = 31 * result + (ehdAllergyCode3 != null ? ehdAllergyCode3.hashCode() : 0);
        result = 31 * result + (ehdAllergyCode4Ind != null ? ehdAllergyCode4Ind.hashCode() : 0);
        result = 31 * result + (ehdAllergyCode4 != null ? ehdAllergyCode4.hashCode() : 0);
        result = 31 * result + (ehdAllergyCode5Ind != null ? ehdAllergyCode5Ind.hashCode() : 0);
        result = 31 * result + (ehdAllergyCode5 != null ? ehdAllergyCode5.hashCode() : 0);
        result = 31 * result + (ehdAllergyCode6Ind != null ? ehdAllergyCode6Ind.hashCode() : 0);
        result = 31 * result + (ehdAllergyCode6 != null ? ehdAllergyCode6.hashCode() : 0);
        result = 31 * result + (ehdAlcoholInd != null ? ehdAlcoholInd.hashCode() : 0);
        result = 31 * result + (ehdAlcoholCode != null ? ehdAlcoholCode.hashCode() : 0);
        result = 31 * result + (ehdBloodTypeInd != null ? ehdBloodTypeInd.hashCode() : 0);
        result = 31 * result + (ehdBloodType != null ? ehdBloodType.hashCode() : 0);
        result = 31 * result + (ehdContactLensInd != null ? ehdContactLensInd.hashCode() : 0);
        result = 31 * result + (ehdContactLensCode != null ? ehdContactLensCode.hashCode() : 0);
        result = 31 * result + (ehdHeightInd != null ? ehdHeightInd.hashCode() : 0);
        result = 31 * result + (ehdHeight != null ? ehdHeight.hashCode() : 0);
        result = 31 * result + (ehdPregnancyInd != null ? ehdPregnancyInd.hashCode() : 0);
        result = 31 * result + (ehdPregnantCode != null ? ehdPregnantCode.hashCode() : 0);
        result = 31 * result + (ehdSmokingInd != null ? ehdSmokingInd.hashCode() : 0);
        result = 31 * result + (ehdSmokingCode != null ? ehdSmokingCode.hashCode() : 0);
        result = 31 * result + (ehdWeightInd != null ? ehdWeightInd.hashCode() : 0);
        result = 31 * result + (ehdWeight != null ? ehdWeight.hashCode() : 0);
        result = 31 * result + (ehdMiscCode1Ind != null ? ehdMiscCode1Ind.hashCode() : 0);
        result = 31 * result + (ehdMiscCode1 != null ? ehdMiscCode1.hashCode() : 0);
        result = 31 * result + (ehdMiscCode2Ind != null ? ehdMiscCode2Ind.hashCode() : 0);
        result = 31 * result + (ehdMiscCode2 != null ? ehdMiscCode2.hashCode() : 0);
        result = 31 * result + (ehdUseIcdValidation != null ? ehdUseIcdValidation.hashCode() : 0);
        result = 31 * result + (ehdDiagQual1 != null ? ehdDiagQual1.hashCode() : 0);
        result = 31 * result + (ehdDiagQual2 != null ? ehdDiagQual2.hashCode() : 0);
        result = 31 * result + (ehdDiagQual3 != null ? ehdDiagQual3.hashCode() : 0);
        result = 31 * result + (ehdDiagQual4 != null ? ehdDiagQual4.hashCode() : 0);
        result = 31 * result + (ehdDiagQual5 != null ? ehdDiagQual5.hashCode() : 0);
        result = 31 * result + (ehdDiagQual6 != null ? ehdDiagQual6.hashCode() : 0);
        result = 31 * result + (ehdDiagQual7 != null ? ehdDiagQual7.hashCode() : 0);
        result = 31 * result + (ehdDiagQual8 != null ? ehdDiagQual8.hashCode() : 0);
        result = 31 * result + (ehdDiagQual9 != null ? ehdDiagQual9.hashCode() : 0);
        result = 31 * result + (ehdDiagQual10 != null ? ehdDiagQual10.hashCode() : 0);
        result = 31 * result + (ehdDiagType1 != null ? ehdDiagType1.hashCode() : 0);
        result = 31 * result + (ehdDiagType2 != null ? ehdDiagType2.hashCode() : 0);
        result = 31 * result + (ehdDiagType3 != null ? ehdDiagType3.hashCode() : 0);
        result = 31 * result + (ehdDiagType4 != null ? ehdDiagType4.hashCode() : 0);
        result = 31 * result + (ehdDiagType5 != null ? ehdDiagType5.hashCode() : 0);
        result = 31 * result + (ehdDiagType6 != null ? ehdDiagType6.hashCode() : 0);
        result = 31 * result + (ehdDiagType7 != null ? ehdDiagType7.hashCode() : 0);
        result = 31 * result + (ehdDiagType8 != null ? ehdDiagType8.hashCode() : 0);
        result = 31 * result + (ehdDiagType9 != null ? ehdDiagType9.hashCode() : 0);
        result = 31 * result + (ehdDiagType10 != null ? ehdDiagType10.hashCode() : 0);
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
        return "ElgEligHealthDefaultsEhd{" +
                "carCarrierId='" + carCarrierId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", ehdDiagCode1Ind='" + ehdDiagCode1Ind + '\'' +
                ", ehdDiagCode1='" + ehdDiagCode1 + '\'' +
                ", ehdDiagCode2Ind='" + ehdDiagCode2Ind + '\'' +
                ", ehdDiagCode2='" + ehdDiagCode2 + '\'' +
                ", ehdDiagCode3Ind='" + ehdDiagCode3Ind + '\'' +
                ", ehdDiagCode3='" + ehdDiagCode3 + '\'' +
                ", ehdDiagCode4Ind='" + ehdDiagCode4Ind + '\'' +
                ", ehdDiagCode4='" + ehdDiagCode4 + '\'' +
                ", ehdDiagCode5Ind='" + ehdDiagCode5Ind + '\'' +
                ", ehdDiagCode5='" + ehdDiagCode5 + '\'' +
                ", ehdDiagCode6Ind='" + ehdDiagCode6Ind + '\'' +
                ", ehdDiagCode6='" + ehdDiagCode6 + '\'' +
                ", ehdDiagCode7Ind='" + ehdDiagCode7Ind + '\'' +
                ", ehdDiagCode7='" + ehdDiagCode7 + '\'' +
                ", ehdDiagCode8Ind='" + ehdDiagCode8Ind + '\'' +
                ", ehdDiagCode8='" + ehdDiagCode8 + '\'' +
                ", ehdDiagCode9Ind='" + ehdDiagCode9Ind + '\'' +
                ", ehdDiagCode9='" + ehdDiagCode9 + '\'' +
                ", ehdDiagCode10Ind='" + ehdDiagCode10Ind + '\'' +
                ", ehdDiagCode10='" + ehdDiagCode10 + '\'' +
                ", ehdAllergyCode1Ind='" + ehdAllergyCode1Ind + '\'' +
                ", ehdAllergyCode1='" + ehdAllergyCode1 + '\'' +
                ", ehdAllergyCode2Ind='" + ehdAllergyCode2Ind + '\'' +
                ", ehdAllergyCode2='" + ehdAllergyCode2 + '\'' +
                ", ehdAllergyCode3Ind='" + ehdAllergyCode3Ind + '\'' +
                ", ehdAllergyCode3='" + ehdAllergyCode3 + '\'' +
                ", ehdAllergyCode4Ind='" + ehdAllergyCode4Ind + '\'' +
                ", ehdAllergyCode4='" + ehdAllergyCode4 + '\'' +
                ", ehdAllergyCode5Ind='" + ehdAllergyCode5Ind + '\'' +
                ", ehdAllergyCode5='" + ehdAllergyCode5 + '\'' +
                ", ehdAllergyCode6Ind='" + ehdAllergyCode6Ind + '\'' +
                ", ehdAllergyCode6='" + ehdAllergyCode6 + '\'' +
                ", ehdAlcoholInd='" + ehdAlcoholInd + '\'' +
                ", ehdAlcoholCode='" + ehdAlcoholCode + '\'' +
                ", ehdBloodTypeInd='" + ehdBloodTypeInd + '\'' +
                ", ehdBloodType='" + ehdBloodType + '\'' +
                ", ehdContactLensInd='" + ehdContactLensInd + '\'' +
                ", ehdContactLensCode='" + ehdContactLensCode + '\'' +
                ", ehdHeightInd='" + ehdHeightInd + '\'' +
                ", ehdHeight=" + ehdHeight +
                ", ehdPregnancyInd='" + ehdPregnancyInd + '\'' +
                ", ehdPregnantCode='" + ehdPregnantCode + '\'' +
                ", ehdSmokingInd='" + ehdSmokingInd + '\'' +
                ", ehdSmokingCode='" + ehdSmokingCode + '\'' +
                ", ehdWeightInd='" + ehdWeightInd + '\'' +
                ", ehdWeight=" + ehdWeight +
                ", ehdMiscCode1Ind='" + ehdMiscCode1Ind + '\'' +
                ", ehdMiscCode1='" + ehdMiscCode1 + '\'' +
                ", ehdMiscCode2Ind='" + ehdMiscCode2Ind + '\'' +
                ", ehdMiscCode2='" + ehdMiscCode2 + '\'' +
                ", ehdUseIcdValidation='" + ehdUseIcdValidation + '\'' +
                ", ehdDiagQual1='" + ehdDiagQual1 + '\'' +
                ", ehdDiagQual2='" + ehdDiagQual2 + '\'' +
                ", ehdDiagQual3='" + ehdDiagQual3 + '\'' +
                ", ehdDiagQual4='" + ehdDiagQual4 + '\'' +
                ", ehdDiagQual5='" + ehdDiagQual5 + '\'' +
                ", ehdDiagQual6='" + ehdDiagQual6 + '\'' +
                ", ehdDiagQual7='" + ehdDiagQual7 + '\'' +
                ", ehdDiagQual8='" + ehdDiagQual8 + '\'' +
                ", ehdDiagQual9='" + ehdDiagQual9 + '\'' +
                ", ehdDiagQual10='" + ehdDiagQual10 + '\'' +
                ", ehdDiagType1='" + ehdDiagType1 + '\'' +
                ", ehdDiagType2='" + ehdDiagType2 + '\'' +
                ", ehdDiagType3='" + ehdDiagType3 + '\'' +
                ", ehdDiagType4='" + ehdDiagType4 + '\'' +
                ", ehdDiagType5='" + ehdDiagType5 + '\'' +
                ", ehdDiagType6='" + ehdDiagType6 + '\'' +
                ", ehdDiagType7='" + ehdDiagType7 + '\'' +
                ", ehdDiagType8='" + ehdDiagType8 + '\'' +
                ", ehdDiagType9='" + ehdDiagType9 + '\'' +
                ", ehdDiagType10='" + ehdDiagType10 + '\'' +
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

