package com.optum.rxclaimnextgen.elg.pojo;

import java.io.Serializable;

/**
 * Created by bkocinsk on 8/1/2018.
 */
public class EligGroupListNames implements Serializable{
    private String carCarrierId;
    private String accAccountId;
    private String grpGroupId;
    private String grpGroupName;

    public EligGroupListNames() {}

    public EligGroupListNames(String carCarrierId, String accAccountId, String grpGroupId, String grpGroupName) {
        this.carCarrierId = carCarrierId;
        this.accAccountId = accAccountId;
        this.grpGroupId = grpGroupId;
        this.grpGroupName = grpGroupName;
    }

    public String getCarCarrierId() {
        return carCarrierId;
    }

    public void setCarCarrierId(String carCarrierId) {
        this.carCarrierId = carCarrierId;
    }

    public String getAccAccountId() {
        return accAccountId;
    }

    public void setAccAccountId(String accAccountId) {
        this.accAccountId = accAccountId;
    }

    public String getGrpGroupId() {
        return grpGroupId;
    }

    public void setGrpGroupId(String grpGroupId) {
        this.grpGroupId = grpGroupId;
    }

    public String getGrpGroupName() {
        return grpGroupName;
    }

    public void setGrpGroupName(String grpGroupName) {
        this.grpGroupName = grpGroupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EligGroupListNames that = (EligGroupListNames) o;

        if (carCarrierId != null ? !carCarrierId.equals(that.carCarrierId) : that.carCarrierId != null) return false;
        if (accAccountId != null ? !accAccountId.equals(that.accAccountId) : that.accAccountId != null) return false;
        if (grpGroupId != null ? !grpGroupId.equals(that.grpGroupId) : that.grpGroupId != null) return false;
        return grpGroupName != null ? grpGroupName.equals(that.grpGroupName) : that.grpGroupName == null;
    }

    @Override
    public int hashCode() {
        int result = carCarrierId != null ? carCarrierId.hashCode() : 0;
        result = 31 * result + (accAccountId != null ? accAccountId.hashCode() : 0);
        result = 31 * result + (grpGroupId != null ? grpGroupId.hashCode() : 0);
        result = 31 * result + (grpGroupName != null ? grpGroupName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "EligGroupListNames{" +
                "carCarrierId='" + carCarrierId + '\'' +
                ", accAccountId='" + accAccountId + '\'' +
                ", grpGroupId='" + grpGroupId + '\'' +
                ", grpGroupName='" + grpGroupName + '\'' +
                '}';
    }
}
