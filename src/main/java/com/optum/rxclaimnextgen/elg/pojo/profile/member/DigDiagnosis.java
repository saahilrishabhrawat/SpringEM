package com.optum.rxclaimnextgen.elg.pojo.profile.member;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by James Sheputis on 8/30/2018.
 */
public class DigDiagnosis {

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

    public String getQualifier() {
        return qualifier;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode;
    }

    public String getDiagnosisDescription() {
        return diagnosisDescription;
    }

    public void setDiagnosisDescription(String diagnosisDescription) {
        this.diagnosisDescription = diagnosisDescription;
    }

    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    public int getAddDate() {
        return addDate;
    }

    public void setAddDate(int addDate) {
        this.addDate = addDate;
    }

    public int getAddTime() {
        return addTime;
    }

    public void setAddTime(int addTime) {
        this.addTime = addTime;
    }

    public String getAddProgramName() {
        return addProgramName;
    }

    public void setAddProgramName(String addProgramName) {
        this.addProgramName = addProgramName;
    }

    public String getChgUserName() {
        return chgUserName;
    }

    public void setChgUserName(String chgUserName) {
        this.chgUserName = chgUserName;
    }

    public int getChgDate() {
        return chgDate;
    }

    public void setChgDate(int chgDate) {
        this.chgDate = chgDate;
    }

    public int getChgTime() {
        return chgTime;
    }

    public void setChgTime(int chgTime) {
        this.chgTime = chgTime;
    }

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
