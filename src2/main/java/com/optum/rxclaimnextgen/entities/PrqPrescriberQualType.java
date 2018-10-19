package com.optum.rxclaimnextgen.entities;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * Created by bkocinsk on 7/23/2018.
 */
@Entity
@Table(name = "RCPRQP")
public class PrqPrescriberQualType {

    private String prescriberIdQualifier;
    private String qualifierAbbreviation;
    private String qualifierLongName;
    private BigInteger prqIdMinSize;
    private BigInteger prqIdMaxSize;
    private String prqIdDataType;
    private String addUserName;
    private int addDate;
    private int addTime;
    private String addProgramName;
    private String chgUserName;
    private int chgDate;
    private int chgTime;
    private String chgProgramName;

    @Id
    @Column(name = "QWXCH6")
    public String getPrescriberIdQualifier() {
        return prescriberIdQualifier;
    }

    public void setPrescriberIdQualifier(String prescriberIdQualifier) {
        this.prescriberIdQualifier = prescriberIdQualifier;
    }

    @Basic
    @Column(name = "QWP1IG")
    public String getQualifierAbbreviation() {
        return qualifierAbbreviation;
    }

    public void setQualifierAbbreviation(String qualifierAbbreviation) {
        this.qualifierAbbreviation = qualifierAbbreviation;
    }

    @Basic
    @Column(name = "QWP2IG")
    public String getQualifierLongName() {
        return qualifierLongName;
    }

    public void setQualifierLongName(String qualifierLongName) {
        this.qualifierLongName = qualifierLongName;
    }

    @Basic
    @Column(name = "QWLMHR")
    public BigInteger getPrqIdMinSize() {
        return prqIdMinSize;
    }

    public void setPrqIdMinSize(BigInteger prqIdMinSize) {
        this.prqIdMinSize = prqIdMinSize;
    }

    @Basic
    @Column(name = "QWLNHR")
    public BigInteger getPrqIdMaxSize() {
        return prqIdMaxSize;
    }

    public void setPrqIdMaxSize(BigInteger prqIdMaxSize) {
        this.prqIdMaxSize = prqIdMaxSize;
    }

    @Basic
    @Column(name = "QWXDH6")
    public String getPrqIdDataType() {
        return prqIdDataType;
    }

    public void setPrqIdDataType(String prqIdDataType) {
        this.prqIdDataType = prqIdDataType;
    }

    @Basic
    @Column(name = "QWAKVN")
    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    @Basic
    @Column(name = "QWC2DT")
    public int getAddDate() {
        return addDate;
    }

    public void setAddDate(int addDate) {
        this.addDate = addDate;
    }

    @Basic
    @Column(name = "QWADTM")
    public int getAddTime() {
        return addTime;
    }

    public void setAddTime(int addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "QWALVN")
    public String getAddProgramName() {
        return addProgramName;
    }

    public void setAddProgramName(String addProgramName) {
        this.addProgramName = addProgramName;
    }

    @Basic
    @Column(name = "QWADVN")
    public String getChgUserName() {
        return chgUserName;
    }

    public void setChgUserName(String chgUserName) {
        this.chgUserName = chgUserName;
    }

    @Basic
    @Column(name = "QWBMDT")
    public int getChgDate() {
        return chgDate;
    }

    public void setChgDate(int chgDate) {
        this.chgDate = chgDate;
    }

    @Basic
    @Column(name = "QWABTM")
    public int getChgTime() {
        return chgTime;
    }

    public void setChgTime(int chgTime) {
        this.chgTime = chgTime;
    }

    @Basic
    @Column(name = "QWAEVN")
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

        com.optum.rxclaimnextgen.entities.PrqPrescriberQualType that = (com.optum.rxclaimnextgen.entities.PrqPrescriberQualType) o;

        if (addDate != that.addDate) return false;
        if (addTime != that.addTime) return false;
        if (chgDate != that.chgDate) return false;
        if (chgTime != that.chgTime) return false;
        if (prescriberIdQualifier != null ? !prescriberIdQualifier.equals(that.prescriberIdQualifier) : that.prescriberIdQualifier != null)
            return false;
        if (qualifierAbbreviation != null ? !qualifierAbbreviation.equals(that.qualifierAbbreviation) : that.qualifierAbbreviation != null)
            return false;
        if (qualifierLongName != null ? !qualifierLongName.equals(that.qualifierLongName) : that.qualifierLongName != null)
            return false;
        if (prqIdMinSize != null ? !prqIdMinSize.equals(that.prqIdMinSize) : that.prqIdMinSize != null) return false;
        if (prqIdMaxSize != null ? !prqIdMaxSize.equals(that.prqIdMaxSize) : that.prqIdMaxSize != null) return false;
        if (prqIdDataType != null ? !prqIdDataType.equals(that.prqIdDataType) : that.prqIdDataType != null)
            return false;
        if (addUserName != null ? !addUserName.equals(that.addUserName) : that.addUserName != null) return false;
        if (addProgramName != null ? !addProgramName.equals(that.addProgramName) : that.addProgramName != null)
            return false;
        if (chgUserName != null ? !chgUserName.equals(that.chgUserName) : that.chgUserName != null) return false;
        return chgProgramName != null ? chgProgramName.equals(that.chgProgramName) : that.chgProgramName == null;
    }

    @Override
    public int hashCode() {
        int result = prescriberIdQualifier != null ? prescriberIdQualifier.hashCode() : 0;
        result = 31 * result + (qualifierAbbreviation != null ? qualifierAbbreviation.hashCode() : 0);
        result = 31 * result + (qualifierLongName != null ? qualifierLongName.hashCode() : 0);
        result = 31 * result + (prqIdMinSize != null ? prqIdMinSize.hashCode() : 0);
        result = 31 * result + (prqIdMaxSize != null ? prqIdMaxSize.hashCode() : 0);
        result = 31 * result + (prqIdDataType != null ? prqIdDataType.hashCode() : 0);
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
        return "PrqPrescriberQualType{" +
                "prescriberIdQualifier='" + prescriberIdQualifier + '\'' +
                ", qualifierAbbreviation='" + qualifierAbbreviation + '\'' +
                ", qualifierLongName='" + qualifierLongName + '\'' +
                ", prqIdMinSize=" + prqIdMinSize +
                ", prqIdMaxSize=" + prqIdMaxSize +
                ", prqIdDataType='" + prqIdDataType + '\'' +
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
