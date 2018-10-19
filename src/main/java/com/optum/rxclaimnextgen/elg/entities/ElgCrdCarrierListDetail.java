package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by bkocinsk on 6/8/2018.
 */
@Entity
@Table(name = "ELG_CRD_CARRIER_LIST_DETAIL")
@IdClass(ElgCrdCarrierListDetailPK.class)
public class ElgCrdCarrierListDetail {
    private String crlCarrierListName;
    private String carCarrierId;
    private String addUserName;
    private Date addDate;
    private Time addTime;
    private String addProgramName;
    private String chgUserName;
    private Date chgDate;
    private Time chgTime;
    private String chgProgramName;

    @Id
    @Column(name = "CRL_CARRIER_LIST_NAME", nullable = false, length = 10)
    public String getCrlCarrierListName() {
        return crlCarrierListName;
    }

    public void setCrlCarrierListName(String crlCarrierListName) {
        this.crlCarrierListName = crlCarrierListName;
    }

    @Id
    @Column(name = "CAR_CARRIER_ID", nullable = false, length = 9)
    public String getCarCarrierId() {
        return carCarrierId;
    }

    public void setCarCarrierId(String carCarrierId) {
        this.carCarrierId = carCarrierId;
    }

    @Basic
    @Column(name = "ADD_USER_NAME", nullable = false, length = 10)
    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    @Basic
    @Column(name = "ADD_DATE", nullable = false)
    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    @Basic
    @Column(name = "ADD_TIME", nullable = false)
    public Time getAddTime() {
        return addTime;
    }

    public void setAddTime(Time addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "ADD_PROGRAM_NAME", nullable = false, length = 10)
    public String getAddProgramName() {
        return addProgramName;
    }

    public void setAddProgramName(String addProgramName) {
        this.addProgramName = addProgramName;
    }

    @Basic
    @Column(name = "CHG_USER_NAME", nullable = false, length = 10)
    public String getChgUserName() {
        return chgUserName;
    }

    public void setChgUserName(String chgUserName) {
        this.chgUserName = chgUserName;
    }

    @Basic
    @Column(name = "CHG_DATE", nullable = false)
    public Date getChgDate() {
        return chgDate;
    }

    public void setChgDate(Date chgDate) {
        this.chgDate = chgDate;
    }

    @Basic
    @Column(name = "CHG_TIME", nullable = false)
    public Time getChgTime() {
        return chgTime;
    }

    public void setChgTime(Time chgTime) {
        this.chgTime = chgTime;
    }

    @Basic
    @Column(name = "CHG_PROGRAM_NAME", nullable = false, length = 10)
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

        ElgCrdCarrierListDetail that = (ElgCrdCarrierListDetail) o;

        if (crlCarrierListName != null ? !crlCarrierListName.equals(that.crlCarrierListName) : that.crlCarrierListName != null)
            return false;
        if (carCarrierId != null ? !carCarrierId.equals(that.carCarrierId) : that.carCarrierId != null) return false;
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
        int result = crlCarrierListName != null ? crlCarrierListName.hashCode() : 0;
        result = 31 * result + (carCarrierId != null ? carCarrierId.hashCode() : 0);
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
        return "ElgCrdCarrierListDetail{" +
                "crlCarrierListName='" + crlCarrierListName + '\'' +
                ", carCarrierId='" + carCarrierId + '\'' +
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

