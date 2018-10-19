package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by bkocinsk on 6/8/2018.
 */
public class ElgGldGroupListDetailPK implements Serializable {
    private String grlGroupListName;
    private String carCarrierId;
    private String accAccountId;
    private String grpGroupId;

    @Column(name = "GRL_GROUP_LIST_NAME", nullable = false, length = 10)
    @Id
    public String getGrlGroupListName() {
        return grlGroupListName;
    }

    public void setGrlGroupListName(String grlGroupListName) {
        this.grlGroupListName = grlGroupListName;
    }

    @Column(name = "CAR_CARRIER_ID", nullable = false, length = 9)
    @Id
    public String getCarCarrierId() {
        return carCarrierId;
    }

    public void setCarCarrierId(String carCarrierId) {
        this.carCarrierId = carCarrierId;
    }

    @Column(name = "ACC_ACCOUNT_ID", nullable = false, length = 15)
    @Id
    public String getAccAccountId() {
        return accAccountId;
    }

    public void setAccAccountId(String accAccountId) {
        this.accAccountId = accAccountId;
    }

    @Column(name = "GRP_GROUP_ID", nullable = false, length = 15)
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

        ElgGldGroupListDetailPK that = (ElgGldGroupListDetailPK) o;

        if (grlGroupListName != null ? !grlGroupListName.equals(that.grlGroupListName) : that.grlGroupListName != null)
            return false;
        if (carCarrierId != null ? !carCarrierId.equals(that.carCarrierId) : that.carCarrierId != null) return false;
        if (accAccountId != null ? !accAccountId.equals(that.accAccountId) : that.accAccountId != null) return false;
        if (grpGroupId != null ? !grpGroupId.equals(that.grpGroupId) : that.grpGroupId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = grlGroupListName != null ? grlGroupListName.hashCode() : 0;
        result = 31 * result + (carCarrierId != null ? carCarrierId.hashCode() : 0);
        result = 31 * result + (accAccountId != null ? accAccountId.hashCode() : 0);
        result = 31 * result + (grpGroupId != null ? grpGroupId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ElgGldGroupListDetailPK{" +
                "grlGroupListName='" + grlGroupListName + '\'' +
                ", carCarrierId='" + carCarrierId + '\'' +
                ", accAccountId='" + accAccountId + '\'' +
                ", grpGroupId='" + grpGroupId + '\'' +
                '}';
    }
}

