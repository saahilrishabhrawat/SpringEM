package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;

import org.apache.commons.lang3.StringUtils;

import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "ELG_STATE_STA")
public class ElgStateSta {
    private String staStateCode;
    private String staStateDescription;
    private String addUserName;
    private Date addDate;
    private Time addTime;
    private String addProgramName;
    private String chgUserName;
    private Date chgDate;
    private Time chgTime;
    private String chgProgramName;

    @Id
    @Column(name = "STA_STATE_CODE")
    public String getStaStateCode() {
        return staStateCode;
    }

    public void setStaStateCode(String staStateCode) {
        this.staStateCode = StringUtils.trim(staStateCode);
    }

    @Basic
    @Column(name = "STA_STATE_DESCRIPTION")
    public String getStaStateDescription() {
        return StringUtils.trim(staStateDescription);
    }

    public void setStaStateDescription(String staStateDescription) {
        this.staStateDescription = StringUtils.trim(staStateDescription);
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
        ElgStateSta that = (ElgStateSta) o;
        return Objects.equals(staStateCode, that.staStateCode) &&
                Objects.equals(staStateDescription, that.staStateDescription) &&
                Objects.equals(addUserName, that.addUserName) &&
                Objects.equals(addDate, that.addDate) &&
                Objects.equals(addTime, that.addTime) &&
                Objects.equals(addProgramName, that.addProgramName) &&
                Objects.equals(chgUserName, that.chgUserName) &&
                Objects.equals(chgDate, that.chgDate) &&
                Objects.equals(chgTime, that.chgTime) &&
                Objects.equals(chgProgramName, that.chgProgramName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staStateCode, staStateDescription, addUserName, addDate, addTime, addProgramName, chgUserName, chgDate, chgTime, chgProgramName);
    }
}
