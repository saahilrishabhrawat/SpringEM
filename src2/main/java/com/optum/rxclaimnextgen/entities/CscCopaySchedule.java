package com.optum.rxclaimnextgen.entities;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by bkocinsk on 8/3/2018.
 */
@Entity
@Table(name = "RCCSCP")
@IdClass(CscCopaySchedulePK.class)
public class CscCopaySchedule {

    private String copayScheduleName;
    private int stepNbr;
    private String basis;
    private BigDecimal fscMaxAmt;
    private int daysSupply;
    private BigDecimal dollarAmt;
    private BigDecimal percent;
    private String copayCalcBasis;
    private String copayCompCodeOverride;
    private String minCopayOverride;
    private BigDecimal maxCopay;
    private BigDecimal maxCopayPercent;
    private String maxCopayCalcBasis;
    private String maxCopayOverage;
    private String addUserName;
    private int addDate;
    private int addTime;
    private String addProgramName;
    private String chgUserName;
    private int chgDate;
    private int chgTime;
    private String chgProgramName;


    @Id
    @Column(name = "CBGRCD")
    public String getCopayScheduleName() {
        return copayScheduleName;
    }

    public void setCopayScheduleName(String copayScheduleName) {
        this.copayScheduleName = copayScheduleName;
    }

    @Id
    @Column(name = "CBELNB")
    public int getStepNbr() {
        return stepNbr;
    }

    public void setStepNbr(int stepNbr) {
        this.stepNbr = stepNbr;
    }

    @Basic
    @Column(name = "CBE3ST")
    public String getBasis() {
        return basis;
    }

    public void setBasis(String basis) {
        this.basis = basis;
    }

    @Basic
    @Column(name = "CBBTPR")
    public BigDecimal getFscMaxAmt() {
        return fscMaxAmt;
    }

    public void setFscMaxAmt(BigDecimal fscMaxAmt) {
        this.fscMaxAmt = fscMaxAmt;
    }

    @Basic
    @Column(name = "CBFSN2")
    public int getDaysSupply() {
        return daysSupply;
    }

    public void setDaysSupply(int daysSupply) {
        this.daysSupply = daysSupply;
    }

    @Basic
    @Column(name = "CBBVPR")
    public BigDecimal getDollarAmt() {
        return dollarAmt;
    }

    public void setDollarAmt(BigDecimal dollarAmt) {
        this.dollarAmt = dollarAmt;
    }

    @Basic
    @Column(name = "CBAFPC")
    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    @Basic
    @Column(name = "CBU4AJ")
    public String getCopayCalcBasis() {
        return copayCalcBasis;
    }

    public void setCopayCalcBasis(String copayCalcBasis) {
        this.copayCalcBasis = copayCalcBasis;
    }

    @Basic
    @Column(name = "CBL0S3")
    public String getCopayCompCodeOverride() {
        return copayCompCodeOverride;
    }

    public void setCopayCompCodeOverride(String copayCompCodeOverride) {
        this.copayCompCodeOverride = copayCompCodeOverride;
    }

    @Basic
    @Column(name = "CBBOCJ")
    public String getMinCopayOverride() {
        return minCopayOverride;
    }

    public void setMinCopayOverride(String minCopayOverride) {
        this.minCopayOverride = minCopayOverride;
    }

    @Basic
    @Column(name = "CBLYP1")
    public BigDecimal getMaxCopay() { return maxCopay; }

    public void setMaxCopay(BigDecimal maxCopay) {
        this.maxCopay = maxCopay;
    }

    @Basic
    @Column(name = "CBCBPC")
    public BigDecimal getMaxCopayPercent() { return maxCopayPercent; }

    public void setMaxCopayPercent(BigDecimal maxCopayPercent) {
        this.maxCopayPercent = maxCopayPercent;
    }

    @Basic
    @Column(name = "CBSVCJ")
    public String getMaxCopayCalcBasis() {
        return maxCopayCalcBasis;
    }

    public void setMaxCopayCalcBasis(String maxCopayCalcBasis) {
        this.maxCopayCalcBasis = maxCopayCalcBasis;
    }


    @Basic
    @Column(name = "CBDKAI")
    public String getMaxCopayOverage() {
        return maxCopayOverage;
    }

    public void setMaxCopayOverage(String maxCopayOverage) {
        this.maxCopayOverage = maxCopayOverage;
    }

    @Basic
    @Column(name = "CBAKVN")
    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    @Basic
    @Column(name = "CBC2DT")
    public int getAddDate() {
        return addDate;
    }

    public void setAddDate(int addDate) {
        this.addDate = addDate;
    }


    @Basic
    @Column(name = "CBADTM")
    public int getAddTime() {
        return addTime;
    }

    public void setAddTime(int addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "CBALVN")
    public String getAddProgramName() {
        return addProgramName;
    }

    public void setAddProgramName(String addProgramName) {
        this.addProgramName = addProgramName;
    }

    @Basic
    @Column(name = "CBADVN")
    public String getChgUserName() {
        return chgUserName;
    }

    public void setChgUserName(String chgUserName) {
        this.chgUserName = chgUserName;
    }

    @Basic
    @Column(name = "CBBMDT")
    public int getChgDate() {
        return chgDate;
    }

    public void setChgDate(int chgDate) {
        this.chgDate = chgDate;
    }

    @Basic
    @Column(name = "CBABTM")
    public int getChgTime() {
        return chgTime;
    }

    public void setChgTime(int chgTime) {
        this.chgTime = chgTime;
    }

    @Basic
    @Column(name = "CBAEVN")
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

        CscCopaySchedule that = (CscCopaySchedule) o;

        if (stepNbr != that.stepNbr) return false;
        if (daysSupply != that.daysSupply) return false;
        if (addDate != that.addDate) return false;
        if (addTime != that.addTime) return false;
        if (chgDate != that.chgDate) return false;
        if (chgTime != that.chgTime) return false;
        if (copayScheduleName != null ? !copayScheduleName.equals(that.copayScheduleName) : that.copayScheduleName != null)
            return false;
        if (basis != null ? !basis.equals(that.basis) : that.basis != null) return false;
        if (fscMaxAmt != null ? !fscMaxAmt.equals(that.fscMaxAmt) : that.fscMaxAmt != null) return false;
        if (dollarAmt != null ? !dollarAmt.equals(that.dollarAmt) : that.dollarAmt != null) return false;
        if (percent != null ? !percent.equals(that.percent) : that.percent != null) return false;
        if (copayCalcBasis != null ? !copayCalcBasis.equals(that.copayCalcBasis) : that.copayCalcBasis != null)
            return false;
        if (copayCompCodeOverride != null ? !copayCompCodeOverride.equals(that.copayCompCodeOverride) : that.copayCompCodeOverride != null)
            return false;
        if (minCopayOverride != null ? !minCopayOverride.equals(that.minCopayOverride) : that.minCopayOverride != null)
            return false;
        if (maxCopay != null ? !maxCopay.equals(that.maxCopay) : that.maxCopay != null) return false;
        if (maxCopayPercent != null ? !maxCopayPercent.equals(that.maxCopayPercent) : that.maxCopayPercent != null)
            return false;
        if (maxCopayCalcBasis != null ? !maxCopayCalcBasis.equals(that.maxCopayCalcBasis) : that.maxCopayCalcBasis != null)
            return false;
        if (maxCopayOverage != null ? !maxCopayOverage.equals(that.maxCopayOverage) : that.maxCopayOverage != null)
            return false;
        if (addUserName != null ? !addUserName.equals(that.addUserName) : that.addUserName != null) return false;
        if (addProgramName != null ? !addProgramName.equals(that.addProgramName) : that.addProgramName != null)
            return false;
        if (chgUserName != null ? !chgUserName.equals(that.chgUserName) : that.chgUserName != null) return false;
        return chgProgramName != null ? chgProgramName.equals(that.chgProgramName) : that.chgProgramName == null;
    }

    @Override
    public int hashCode() {
        int result = copayScheduleName != null ? copayScheduleName.hashCode() : 0;
        result = 31 * result + stepNbr;
        result = 31 * result + (basis != null ? basis.hashCode() : 0);
        result = 31 * result + (fscMaxAmt != null ? fscMaxAmt.hashCode() : 0);
        result = 31 * result + daysSupply;
        result = 31 * result + (dollarAmt != null ? dollarAmt.hashCode() : 0);
        result = 31 * result + (percent != null ? percent.hashCode() : 0);
        result = 31 * result + (copayCalcBasis != null ? copayCalcBasis.hashCode() : 0);
        result = 31 * result + (copayCompCodeOverride != null ? copayCompCodeOverride.hashCode() : 0);
        result = 31 * result + (minCopayOverride != null ? minCopayOverride.hashCode() : 0);
        result = 31 * result + (maxCopay != null ? maxCopay.hashCode() : 0);
        result = 31 * result + (maxCopayPercent != null ? maxCopayPercent.hashCode() : 0);
        result = 31 * result + (maxCopayCalcBasis != null ? maxCopayCalcBasis.hashCode() : 0);
        result = 31 * result + (maxCopayOverage != null ? maxCopayOverage.hashCode() : 0);
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
        return "CscCopaySchedule{" +
                "copayScheduleName='" + copayScheduleName + '\'' +
                ", stepNbr=" + stepNbr +
                ", basis='" + basis + '\'' +
                ", fscMaxAmt=" + fscMaxAmt +
                ", daysSupply=" + daysSupply +
                ", dollarAmt=" + dollarAmt +
                ", percent=" + percent +
                ", copayCalcBasis='" + copayCalcBasis + '\'' +
                ", copayCompCodeOverride='" + copayCompCodeOverride + '\'' +
                ", minCopayOverride='" + minCopayOverride + '\'' +
                ", maxCopay=" + maxCopay +
                ", maxCopayPercent=" + maxCopayPercent +
                ", maxCopayCalcBasis='" + maxCopayCalcBasis + '\'' +
                ", maxCopayOverage='" + maxCopayOverage + '\'' +
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

