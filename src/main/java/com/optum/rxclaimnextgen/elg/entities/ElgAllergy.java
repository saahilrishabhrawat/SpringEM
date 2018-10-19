package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ELG_ALLERGY")
public class ElgAllergy {
    private String allergyCode;
    private String algAllergyName;
    private int crossSensCode1;
    private int crossSensCode2;
    private int crossSensCode3;
    private int crossSensCode4;
    private int crossSensCode5;
    private int crossSensCode6;
    private String algFileFiller;

    @Id
    @Column(name = "ALLERGY_CODE")
    public String getAllergyCode() {
        return allergyCode;
    }

    public void setAllergyCode(String allergyCode) {
        this.allergyCode = allergyCode;
    }

    @Basic
    @Column(name = "ALG_ALLERGY_NAME")
    public String getAlgAllergyName() {
        return algAllergyName;
    }

    public void setAlgAllergyName(String algAllergyName) {
        this.algAllergyName = algAllergyName;
    }

    @Basic
    @Column(name = "CROSS_SENS_CODE_1")
    public int getCrossSensCode1() {
        return crossSensCode1;
    }

    public void setCrossSensCode1(int crossSensCode1) {
        this.crossSensCode1 = crossSensCode1;
    }

    @Basic
    @Column(name = "CROSS_SENS_CODE_2")
    public int getCrossSensCode2() {
        return crossSensCode2;
    }

    public void setCrossSensCode2(int crossSensCode2) {
        this.crossSensCode2 = crossSensCode2;
    }

    @Basic
    @Column(name = "CROSS_SENS_CODE_3")
    public int getCrossSensCode3() {
        return crossSensCode3;
    }

    public void setCrossSensCode3(int crossSensCode3) {
        this.crossSensCode3 = crossSensCode3;
    }

    @Basic
    @Column(name = "CROSS_SENS_CODE_4")
    public int getCrossSensCode4() {
        return crossSensCode4;
    }

    public void setCrossSensCode4(int crossSensCode4) {
        this.crossSensCode4 = crossSensCode4;
    }

    @Basic
    @Column(name = "CROSS_SENS_CODE_5")
    public int getCrossSensCode5() {
        return crossSensCode5;
    }

    public void setCrossSensCode5(int crossSensCode5) {
        this.crossSensCode5 = crossSensCode5;
    }

    @Basic
    @Column(name = "CROSS_SENS_CODE_6")
    public int getCrossSensCode6() {
        return crossSensCode6;
    }

    public void setCrossSensCode6(int crossSensCode6) {
        this.crossSensCode6 = crossSensCode6;
    }

    @Basic
    @Column(name = "ALG_FILE_FILLER")
    public String getAlgFileFiller() {
        return algFileFiller;
    }

    public void setAlgFileFiller(String algFileFiller) {
        this.algFileFiller = algFileFiller;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElgAllergy that = (ElgAllergy) o;
        return crossSensCode1 == that.crossSensCode1 &&
                crossSensCode2 == that.crossSensCode2 &&
                crossSensCode3 == that.crossSensCode3 &&
                crossSensCode4 == that.crossSensCode4 &&
                crossSensCode5 == that.crossSensCode5 &&
                crossSensCode6 == that.crossSensCode6 &&
                Objects.equals(allergyCode, that.allergyCode) &&
                Objects.equals(algAllergyName, that.algAllergyName) &&
                Objects.equals(algFileFiller, that.algFileFiller);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allergyCode, algAllergyName, crossSensCode1, crossSensCode2, crossSensCode3, crossSensCode4, crossSensCode5, crossSensCode6, algFileFiller);
    }
}
