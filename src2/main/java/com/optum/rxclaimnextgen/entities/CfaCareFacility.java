package com.optum.rxclaimnextgen.entities;

import javax.persistence.*;
/**
 * Created by bkocinsk on 7/19/2018.
 */
@Entity
@Table(name = "RCCFAP")
@IdClass(CfaCareFacilityPK.class)
public class CfaCareFacility {

        private String carrierId;
        private String careFacilityId;
        private String careFacilityName;
        private String careFacilityAddress;
        private String careFacilityCity;
        private String careFacilityState;
        private String careFacilityZip;
        private String careFacilityZip2;
        private String careFacilityZip3;
        private String careFacilityCountry;
        private int careFacilityPhone;
        private int addDate;
        private String chgUserName;
        private int chgDate;
        private int chgTime;
        private String chgProgramName;

        @Id
        @Column(name = "AKAACD")
        public String getCarrierId() {
            return carrierId;
        }

        public void setCarrierId(String carrierId) {
            this.carrierId = carrierId;
        }

        @Id
        @Column(name = "AKAPCD")
        public String getCareFacilityId() {
            return careFacilityId;
        }

        public void setCareFacilityId(String careFacilityId) {
            this.careFacilityId = careFacilityId;
        }

        @Basic
        @Column(name = "AKBHTX")
        public String getCareFacilityName() {
            return careFacilityName;
        }

        public void setCareFacilityName(String careFacilityName) {
            this.careFacilityName = careFacilityName;
        }

        @Basic
        @Column(name = "AKB4TX")
        public String getCareFacilityAddress() {
            return careFacilityAddress;
        }

        public void setCareFacilityAddress(String careFacilityAddress) {
            this.careFacilityAddress = careFacilityAddress;
        }

        @Basic
        @Column(name = "AKB5TX")
        public String getCareFacilityCity() {
            return careFacilityCity;
        }

        public void setCareFacilityCity(String careFacilityCity) {
            this.careFacilityCity = careFacilityCity;
        }

        @Basic
        @Column(name = "AKB7TX")
        public String getCareFacilityState() {
            return careFacilityState;
        }

        public void setCareFacilityState(String careFacilityState) {
            this.careFacilityState = careFacilityState;
        }

        @Basic
        @Column(name = "AKB6TX")
        public String getCareFacilityZip() {
            return careFacilityZip;
        }

        public void setCareFacilityZip(String careFacilityZip) {
            this.careFacilityZip = careFacilityZip;
        }

        @Basic
        @Column(name = "AKHGT1")
        public String getCareFacilityZip2() {
            return careFacilityZip2;
        }

        public void setCareFacilityZip2(String careFacilityZip2) {
            this.careFacilityZip2 = careFacilityZip2;
        }

        @Basic
        @Column(name = "AKHHT1")
        public String getCareFacilityZip3() {
            return careFacilityZip3;
        }

        public void setCareFacilityZip3(String careFacilityZip3) {
            this.careFacilityZip3 = careFacilityZip3;
        }

        @Basic
        @Column(name = "AKPYC2")
        public String getCareFacilityCountry() {
            return careFacilityCountry;
        }

        public void setCareFacilityCountry(String careFacilityCountry) {
            this.careFacilityCountry = careFacilityCountry;
        }

        @Basic
        @Column(name = "AKAENB")
        public int getCareFacilityPhone() {
            return careFacilityPhone;
        }

        public void setCareFacilityPhone(int careFacilityPhone) {
            this.careFacilityPhone = careFacilityPhone;
        }

        @Basic
        @Column(name = "AKC2DT")
        public int getAddDate() {
            return addDate;
        }

        public void setAddDate(int addDate) {
            this.addDate = addDate;
        }

        @Basic
        @Column(name = "AKADVN")
        public String getChgUserName() {
            return chgUserName;
        }

        public void setChgUserName(String chgUserName) {
            this.chgUserName = chgUserName;
        }

        @Basic
        @Column(name = "AKBMDT")
        public int getChgDate() {
            return chgDate;
        }

        public void setChgDate(int chgDate) {
            this.chgDate = chgDate;
        }

        @Basic
        @Column(name = "AKABTM")
        public int getChgTime() {
            return chgTime;
        }

        public void setChgTime(int chgTime) {
            this.chgTime = chgTime;
        }

        @Basic
        @Column(name = "AKAEVN")
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

        com.optum.rxclaimnextgen.entities.CfaCareFacility that = (com.optum.rxclaimnextgen.entities.CfaCareFacility) o;

        if (careFacilityPhone != that.careFacilityPhone) return false;
        if (addDate != that.addDate) return false;
        if (chgDate != that.chgDate) return false;
        if (chgTime != that.chgTime) return false;
        if (carrierId != null ? !carrierId.equals(that.carrierId) : that.carrierId != null) return false;
        if (careFacilityId != null ? !careFacilityId.equals(that.careFacilityId) : that.careFacilityId != null)
            return false;
        if (careFacilityName != null ? !careFacilityName.equals(that.careFacilityName) : that.careFacilityName != null)
            return false;
        if (careFacilityAddress != null ? !careFacilityAddress.equals(that.careFacilityAddress) : that.careFacilityAddress != null)
            return false;
        if (careFacilityCity != null ? !careFacilityCity.equals(that.careFacilityCity) : that.careFacilityCity != null)
            return false;
        if (careFacilityState != null ? !careFacilityState.equals(that.careFacilityState) : that.careFacilityState != null)
            return false;
        if (careFacilityZip != null ? !careFacilityZip.equals(that.careFacilityZip) : that.careFacilityZip != null)
            return false;
        if (careFacilityZip2 != null ? !careFacilityZip2.equals(that.careFacilityZip2) : that.careFacilityZip2 != null)
            return false;
        if (careFacilityZip3 != null ? !careFacilityZip3.equals(that.careFacilityZip3) : that.careFacilityZip3 != null)
            return false;
        if (careFacilityCountry != null ? !careFacilityCountry.equals(that.careFacilityCountry) : that.careFacilityCountry != null)
            return false;
        if (chgUserName != null ? !chgUserName.equals(that.chgUserName) : that.chgUserName != null) return false;
        return chgProgramName != null ? chgProgramName.equals(that.chgProgramName) : that.chgProgramName == null;
    }

    @Override
    public int hashCode() {
        int result = carrierId != null ? carrierId.hashCode() : 0;
        result = 31 * result + (careFacilityId != null ? careFacilityId.hashCode() : 0);
        result = 31 * result + (careFacilityName != null ? careFacilityName.hashCode() : 0);
        result = 31 * result + (careFacilityAddress != null ? careFacilityAddress.hashCode() : 0);
        result = 31 * result + (careFacilityCity != null ? careFacilityCity.hashCode() : 0);
        result = 31 * result + (careFacilityState != null ? careFacilityState.hashCode() : 0);
        result = 31 * result + (careFacilityZip != null ? careFacilityZip.hashCode() : 0);
        result = 31 * result + (careFacilityZip2 != null ? careFacilityZip2.hashCode() : 0);
        result = 31 * result + (careFacilityZip3 != null ? careFacilityZip3.hashCode() : 0);
        result = 31 * result + (careFacilityCountry != null ? careFacilityCountry.hashCode() : 0);
        result = 31 * result + careFacilityPhone;
        result = 31 * result + addDate;
        result = 31 * result + (chgUserName != null ? chgUserName.hashCode() : 0);
        result = 31 * result + chgDate;
        result = 31 * result + chgTime;
        result = 31 * result + (chgProgramName != null ? chgProgramName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CfaCareFacility{" +
                "carrierId='" + carrierId + '\'' +
                ", careFacilityId='" + careFacilityId + '\'' +
                ", careFacilityName='" + careFacilityName + '\'' +
                ", careFacilityAddress='" + careFacilityAddress + '\'' +
                ", careFacilityCity='" + careFacilityCity + '\'' +
                ", careFacilityState='" + careFacilityState + '\'' +
                ", careFacilityZip='" + careFacilityZip + '\'' +
                ", careFacilityZip2='" + careFacilityZip2 + '\'' +
                ", careFacilityZip3='" + careFacilityZip3 + '\'' +
                ", careFacilityCountry='" + careFacilityCountry + '\'' +
                ", careFacilityPhone=" + careFacilityPhone +
                ", addDate=" + addDate +
                ", chgUserName='" + chgUserName + '\'' +
                ", chgDate=" + chgDate +
                ", chgTime=" + chgTime +
                ", chgProgramName='" + chgProgramName + '\'' +
                '}';
    }
}
