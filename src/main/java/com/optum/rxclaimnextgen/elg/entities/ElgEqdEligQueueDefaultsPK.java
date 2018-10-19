package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by bkocinsk on 7/23/2018.
 */
public class ElgEqdEligQueueDefaultsPK implements Serializable {
    private String carCarrierId;
    private String eqdAccountId;
    private String eqdGroupId;
    private String eqdReportName;

    @Column(name = "CAR_CARRIER_ID")
    @Id
    public String getCarCarrierId() {
        return carCarrierId;
    }

    public void setCarCarrierId(String carCarrierId) {
        this.carCarrierId = carCarrierId;
    }

    @Column(name = "EQD_ACCOUNT_ID")
    @Id
    public String getEqdAccountId() {
        return eqdAccountId;
    }

    public void setEqdAccountId(String eqdAccountId) {
        this.eqdAccountId = eqdAccountId;
    }

    @Column(name = "EQD_GROUP_ID")
    @Id
    public String getEqdGroupId() {
        return eqdGroupId;
    }

    public void setEqdGroupId(String eqdGroupId) {
        this.eqdGroupId = eqdGroupId;
    }

    @Column(name = "EQD_REPORT_NAME")
    @Id
    public String getEqdReportName() {
        return eqdReportName;
    }

    public void setEqdReportName(String eqdReportName) {
        this.eqdReportName = eqdReportName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElgEqdEligQueueDefaultsPK that = (ElgEqdEligQueueDefaultsPK) o;

        if (carCarrierId != null ? !carCarrierId.equals(that.carCarrierId) : that.carCarrierId != null) return false;
        if (eqdAccountId != null ? !eqdAccountId.equals(that.eqdAccountId) : that.eqdAccountId != null) return false;
        if (eqdGroupId != null ? !eqdGroupId.equals(that.eqdGroupId) : that.eqdGroupId != null) return false;
        if (eqdReportName != null ? !eqdReportName.equals(that.eqdReportName) : that.eqdReportName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = carCarrierId != null ? carCarrierId.hashCode() : 0;
        result = 31 * result + (eqdAccountId != null ? eqdAccountId.hashCode() : 0);
        result = 31 * result + (eqdGroupId != null ? eqdGroupId.hashCode() : 0);
        result = 31 * result + (eqdReportName != null ? eqdReportName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ElgEqdEligQueueDefaultsPK{" +
                "carCarrierId='" + carCarrierId + '\'' +
                ", eqdAccountId='" + eqdAccountId + '\'' +
                ", eqdGroupId='" + eqdGroupId + '\'' +
                ", eqdReportName='" + eqdReportName + '\'' +
                '}';
    }
}
