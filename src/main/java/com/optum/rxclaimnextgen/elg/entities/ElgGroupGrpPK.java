package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by bkocinsk on 7/16/2018.
 */
public class ElgGroupGrpPK implements Serializable {
    private String carCarrierId;
    private String accAccountId;
    private String grpGroupId;

    @Column(name = "CAR_CARRIER_ID")
    @Id
    public String getCarCarrierId() {
        return carCarrierId;
    }

    public void setCarCarrierId(String carCarrierId) {
        this.carCarrierId = carCarrierId;
    }

    @Column(name = "ACC_ACCOUNT_ID")
    @Id
    public String getAccAccountId() {
        return accAccountId;
    }

    public void setAccAccountId(String accAccountId) {
        this.accAccountId = accAccountId;
    }

    @Column(name = "GRP_GROUP_ID")
    @Id
    public String getGrpGroupId() {
        return grpGroupId;
    }

    public void setGrpGroupId(String grpGroupId) {
        this.grpGroupId = grpGroupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElgGroupGrpPK that = (ElgGroupGrpPK) o;

        if (carCarrierId != null ? !carCarrierId.equals(that.carCarrierId) : that.carCarrierId != null) return false;
        if (accAccountId != null ? !accAccountId.equals(that.accAccountId) : that.accAccountId != null) return false;
        if (grpGroupId != null ? !grpGroupId.equals(that.grpGroupId) : that.grpGroupId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = carCarrierId != null ? carCarrierId.hashCode() : 0;
        result = 31 * result + (accAccountId != null ? accAccountId.hashCode() : 0);
        result = 31 * result + (grpGroupId != null ? grpGroupId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ElgGroupGrpPK{" +
                "carCarrierId='" + carCarrierId + '\'' +
                ", accAccountId='" + accAccountId + '\'' +
                ", grpGroupId='" + grpGroupId + '\'' +
                '}';
    }
}
