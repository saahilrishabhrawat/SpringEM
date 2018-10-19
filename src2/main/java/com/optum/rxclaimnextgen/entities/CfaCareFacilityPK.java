package com.optum.rxclaimnextgen.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
/**
 * Created by bkocinsk on 7/19/2018.
 */
public class CfaCareFacilityPK implements Serializable {

    private String carrierId;
    private String careFacilityId;

    public CfaCareFacilityPK() {
        super();
    }

    public CfaCareFacilityPK(String carrierId, String careFacilityId) {
        super();
        this.carrierId = carrierId;
        this.careFacilityId = careFacilityId;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        com.optum.rxclaimnextgen.entities.CfaCareFacilityPK that = (com.optum.rxclaimnextgen.entities.CfaCareFacilityPK) o;

        if (carrierId != null ? !carrierId.equals(that.carrierId) : that.carrierId != null) return false;
        return careFacilityId != null ? careFacilityId.equals(that.careFacilityId) : that.careFacilityId == null;
    }

    @Override
    public int hashCode() {
        int result = carrierId != null ? carrierId.hashCode() : 0;
        result = 31 * result + (careFacilityId != null ? careFacilityId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CfaCareFacilityPK{" +
                "carrierId='" + carrierId + '\'' +
                ", careFacilityId='" + careFacilityId + '\'' +
                '}';
    }
}

