package com.optum.rxclaimnextgen.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by James Sheputis on 8/30/2018.
 */
@Entity
@Table(name = "RCDIGP")
@IdClass(DigDiagnosisPK.class)
public class DigDiagnosis implements Serializable {

    private String qualifier;
    private String typeCode;
    private String diagnosisCode;
    private String diagnosisDescription;
    private String addUserName;
    private int addDate;
    private int addTime;
    private String addProgramName;
    private String chgUserName;
    private int chgDate;
    private int chgTime;
    private String chgProgramName;

    @Id
    @Column(name = "AXSHAQ")
    public String getQualifier() {
        return qualifier;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    @Id
    @Column(name = "AXSIAQ")
    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    @Basic
    @Column(name = "AXBLCD")
    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode;
    }

    @Basic
    @Column(name = "AXC1TX")
    public String getDiagnosisDescription() {
        return diagnosisDescription;
    }

    public void setDiagnosisDescription(String diagnosisDescription) {
        this.diagnosisDescription = diagnosisDescription;
    }

    @Basic
    @Column(name = "AXAKVN")
    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    @Basic
    @Column(name = "AXC2DT")
    public int getAddDate() {
        return addDate;
    }

    public void setAddDate(int addDate) {
        this.addDate = addDate;
    }

    @Basic
    @Column(name = "AXADTM")
    public int getAddTime() {
        return addTime;
    }

    public void setAddTime(int addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "AXALVN")
    public String getAddProgramName() {
        return this.addProgramName;
    }

    public void setAddProgramName(String addProgramName) {
        this.addProgramName = addProgramName;
    }

    @Basic
    @Column(name = "AXADVN")
    public String getChgUserName() {
        return chgUserName;
    }

    public void setChgUserName(String chgUserName) {
        this.chgUserName = chgUserName;
    }

    @Basic
    @Column(name = "AXBMDT")
    public int getChgDate() {
        return chgDate;
    }

    public void setChgDate(int chgDate) {
        this.chgDate = chgDate;
    }

    @Basic
    @Column(name = "AXABTM")
    public int getChgTime() {
        return chgTime;
    }

    public void setChgTime(int chgTime) {
        this.chgTime = chgTime;
    }

    @Basic
    @Column(name = "AXAEVN")
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
        DigDiagnosis that = (DigDiagnosis) o;
        return addDate == that.addDate &&
                addTime == that.addTime &&
                chgDate == that.chgDate &&
                chgTime == that.chgTime &&
                Objects.equals(qualifier, that.qualifier) &&
                Objects.equals(typeCode, that.typeCode) &&
                Objects.equals(diagnosisCode, that.diagnosisCode) &&
                Objects.equals(diagnosisDescription, that.diagnosisDescription) &&
                Objects.equals(addUserName, that.addUserName) &&
                Objects.equals(addProgramName, that.addProgramName) &&
                Objects.equals(chgUserName, that.chgUserName) &&
                Objects.equals(chgProgramName, that.chgProgramName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qualifier, typeCode, diagnosisCode, diagnosisDescription, addUserName, addDate, addTime, addProgramName, chgUserName, chgDate, chgTime, chgProgramName);
    }


    @Override
    public String toString() {
        return "DigDiagnosis{" +
                "qualifier='" + qualifier + '\'' +
                ", typeCode='" + typeCode + '\'' +
                ", diagnosisCode='" + diagnosisCode + '\'' +
                ", diagnosisDescription='" + diagnosisDescription + '\'' +
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
