package com.optum.rxclaimnextgen.entities;

import javax.persistence.*;

/**
 * Created by bkocinsk on 7/19/2018.
 */
@Entity
@Table(name = "RCPRFP")
@IdClass(PrfPrescriberIdPK.class)
public class PrfPrescriberId {

    private String prescriberId;
    private String prescriberIdQualifier;
    private String prescriberIdState;
    private String prescriberKey;
    private String status;
    private String originCode;
    private String loadSource;
    private String vendorKey;
    private String addUserName;
    private int addDate;
    private int addTime;
    private String addProgramName;
    private String chgUserName;
    private int chgDate;
    private int chgTime;
    private String chgProgramName;


    @Id
    @Column(name = "NYLGHB")

    public String getPrescriberId() {
        return prescriberId;
    }

    public void setPrescriberId(String prescriberId) {
        this.prescriberId = prescriberId;
    }

    @Basic
    @Column(name = "NYXCH6")
    public String getPrescriberIdQualifier() {
        return prescriberIdQualifier;
    }

    public void setPrescriberIdQualifier(String prescriberIdQualifier) {
        this.prescriberIdQualifier = prescriberIdQualifier;
    }

    @Basic
    @Column(name = "NYXEH6")
    public String getPrescriberIdState() {
        return prescriberIdState;
    }

    public void setPrescriberIdState(String prescriberIdState) {
        this.prescriberIdState = prescriberIdState;
    }

    @Basic
    @Column(name = "NYAQCD")
    public String getPrescriberKey() {
        return prescriberKey;
    }

    public void setPrescriberKey(String prescriberKey) {
        this.prescriberKey = prescriberKey;
    }

    @Basic
    @Column(name = "NYXFH6")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "NYXGH6")
    public String getOriginCode() {
        return originCode;
    }

    public void setOriginCode(String originCode) {
        this.originCode = originCode;
    }

    @Basic
    @Column(name = "NYXHH6")
    public String getLoadSource() {
        return loadSource;
    }

    public void setLoadSource(String loadSource) {
        this.loadSource = loadSource;
    }

    @Basic
    @Column(name = "NYHAHO")
    public String getVendorKey() {
        return vendorKey;
    }

    public void setVendorKey(String vendorKey) {
        this.vendorKey = vendorKey;
    }

    @Basic
    @Column(name = "NYAKVN")
    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    @Basic
    @Column(name = "NYC2DT")
    public int getAddDate() {
        return addDate;
    }

    public void setAddDate(int addDate) {
        this.addDate = addDate;
    }

    @Basic
    @Column(name = "NYADTM")
    public int getAddTime() {
        return addTime;
    }

    public void setAddTime(int addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "NYALVN")
    public String getAddProgramName() {
        return addProgramName;
    }

    public void setAddProgramName(String nyalvn) {
        this.addProgramName = addProgramName;
    }

    @Basic
    @Column(name = "NYADVN")
    public String getChgUserName() {
        return chgUserName;
    }

    public void setChgUserName(String chgProgramName) {
        this.chgUserName = chgUserName;
    }

    @Basic
    @Column(name = "NYBMDT")
    public int getChgDate() {
        return chgDate;
    }

    public void setChgDate(int chgDate) {
        this.chgDate = chgDate;
    }

    @Basic
    @Column(name = "NYABTM")
    public int getChgTime() {
        return chgTime;
    }

    public void setChgTime(int chgTime) {
        this.chgTime = chgTime;
    }

    @Basic
    @Column(name = "NYAEVN")
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

        com.optum.rxclaimnextgen.entities.PrfPrescriberId that = (com.optum.rxclaimnextgen.entities.PrfPrescriberId) o;

        if (addDate != that.addDate) return false;
        if (addTime != that.addTime) return false;
        if (chgDate != that.chgDate) return false;
        if (chgTime != that.chgTime) return false;
        if (prescriberId != null ? !prescriberId.equals(that.prescriberId) : that.prescriberId != null) return false;
        if (prescriberIdQualifier != null ? !prescriberIdQualifier.equals(that.prescriberIdQualifier) : that.prescriberIdQualifier != null)
            return false;
        if (prescriberIdState != null ? !prescriberIdState.equals(that.prescriberIdState) : that.prescriberIdState != null)
            return false;
        if (prescriberKey != null ? !prescriberKey.equals(that.prescriberKey) : that.prescriberKey != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (originCode != null ? !originCode.equals(that.originCode) : that.originCode != null) return false;
        if (loadSource != null ? !loadSource.equals(that.loadSource) : that.loadSource != null) return false;
        if (vendorKey != null ? !vendorKey.equals(that.vendorKey) : that.vendorKey != null) return false;
        if (addUserName != null ? !addUserName.equals(that.addUserName) : that.addUserName != null) return false;
        if (addProgramName != null ? !addProgramName.equals(that.addProgramName) : that.addProgramName != null)
            return false;
        if (chgUserName != null ? !chgUserName.equals(that.chgUserName) : that.chgUserName != null) return false;
        return chgProgramName != null ? chgProgramName.equals(that.chgProgramName) : that.chgProgramName == null;
    }

    @Override
    public int hashCode() {
        int result = prescriberId != null ? prescriberId.hashCode() : 0;
        result = 31 * result + (prescriberIdQualifier != null ? prescriberIdQualifier.hashCode() : 0);
        result = 31 * result + (prescriberIdState != null ? prescriberIdState.hashCode() : 0);
        result = 31 * result + (prescriberKey != null ? prescriberKey.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (originCode != null ? originCode.hashCode() : 0);
        result = 31 * result + (loadSource != null ? loadSource.hashCode() : 0);
        result = 31 * result + (vendorKey != null ? vendorKey.hashCode() : 0);
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
        return "PrfPrescriberId {" +
                "prescriberId='" + prescriberId + '\'' +
                ", prescriberIdQualifier='" + prescriberIdQualifier + '\'' +
                ", prescriberIdState='" + prescriberIdState + '\'' +
                ", prescriberKey='" + prescriberKey + '\'' +
                ", status='" + status + '\'' +
                ", originCode='" + originCode + '\'' +
                ", loadSource='" + loadSource + '\'' +
                ", vendorKey='" + vendorKey + '\'' +
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

