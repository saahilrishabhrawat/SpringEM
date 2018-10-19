package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by bkocinsk on 8/23/2018.
 */
@Entity
@Table(name = "ELG_TOOLTIPS")
@IdClass(ElgTooltipsPK.class)
public class ElgTooltips {
    private String screenTitle;
    private String fieldLabel;
    private String tooltipText;
    private Date addDate;
    private Time addTime;
    private String chgUserName;
    private Date chgDate;
    private Time chgTime;

    @Id
    @Column(name = "SCREEN_TITLE")
    public String getScreenTitle() {
        return screenTitle;
    }

    public void setScreenTitle(String screenTitle) {
        this.screenTitle = screenTitle;
    }

    @Id
    @Column(name = "FIELD_LABEL")
    public String getFieldLabel() {
        return fieldLabel;
    }

    public void setFieldLabel(String fieldLabel) {
        this.fieldLabel = fieldLabel;
    }

    @Basic
    @Column(name = "TOOLTIP_TEXT")
    public String getTooltipText() {
        return tooltipText;
    }

    public void setTooltipText(String tooltipText) {
        this.tooltipText = tooltipText;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElgTooltips that = (ElgTooltips) o;

        if (screenTitle != null ? !screenTitle.equals(that.screenTitle) : that.screenTitle != null) return false;
        if (fieldLabel != null ? !fieldLabel.equals(that.fieldLabel) : that.fieldLabel != null) return false;
        if (tooltipText != null ? !tooltipText.equals(that.tooltipText) : that.tooltipText != null) return false;
        if (addDate != null ? !addDate.equals(that.addDate) : that.addDate != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (chgUserName != null ? !chgUserName.equals(that.chgUserName) : that.chgUserName != null) return false;
        if (chgDate != null ? !chgDate.equals(that.chgDate) : that.chgDate != null) return false;
        if (chgTime != null ? !chgTime.equals(that.chgTime) : that.chgTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = screenTitle != null ? screenTitle.hashCode() : 0;
        result = 31 * result + (fieldLabel != null ? fieldLabel.hashCode() : 0);
        result = 31 * result + (tooltipText != null ? tooltipText.hashCode() : 0);
        result = 31 * result + (addDate != null ? addDate.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (chgUserName != null ? chgUserName.hashCode() : 0);
        result = 31 * result + (chgDate != null ? chgDate.hashCode() : 0);
        result = 31 * result + (chgTime != null ? chgTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ElgTooltips{" +
                "screenTitle='" + screenTitle + '\'' +
                ", fieldLabel='" + fieldLabel + '\'' +
                ", tooltipText='" + tooltipText + '\'' +
                ", addDate=" + addDate +
                ", addTime=" + addTime +
                ", chgUserName='" + chgUserName + '\'' +
                ", chgDate=" + chgDate +
                ", chgTime=" + chgTime +
                '}';
    }
}

