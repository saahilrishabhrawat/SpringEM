package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by bkocinsk on 6/8/2018.
 */
public class ElgAldAccountListDetailPK implements Serializable {
    private String aclAccountListName;
    private String carCarrierId;
    private String accAccountId;

    @Column(name = "ACL_ACCOUNT_LIST_NAME", nullable = false, length = 10)
    @Id
    public String getAclAccountListName() {
        return aclAccountListName;
    }

    public void setAclAccountListName(String aclAccountListName) {
        this.aclAccountListName = aclAccountListName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElgAldAccountListDetailPK that = (ElgAldAccountListDetailPK) o;

        if (aclAccountListName != null ? !aclAccountListName.equals(that.aclAccountListName) : that.aclAccountListName != null)
            return false;
        if (carCarrierId != null ? !carCarrierId.equals(that.carCarrierId) : that.carCarrierId != null) return false;
        if (accAccountId != null ? !accAccountId.equals(that.accAccountId) : that.accAccountId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aclAccountListName != null ? aclAccountListName.hashCode() : 0;
        result = 31 * result + (carCarrierId != null ? carCarrierId.hashCode() : 0);
        result = 31 * result + (accAccountId != null ? accAccountId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ElgAldAccountListDetailPK{" +
                "aclAccountListName='" + aclAccountListName + '\'' +
                ", carCarrierId='" + carCarrierId + '\'' +
                ", accAccountId='" + accAccountId + '\'' +
                '}';
    }
}
