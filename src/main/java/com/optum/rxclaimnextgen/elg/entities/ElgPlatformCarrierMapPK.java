package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by bkocinsk on 6/8/2018.
 */
public class ElgPlatformCarrierMapPK implements Serializable {
    private String platformId;
    private String carrierId;

    @Column(name = "PLATFORM_ID", nullable = false, length = 10)
    @Id
    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    @Column(name = "CARRIER_ID", nullable = false, length = 9)
    @Id
    public String getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(String carrierId) {
        this.carrierId = carrierId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElgPlatformCarrierMapPK that = (ElgPlatformCarrierMapPK) o;

        if (platformId != null ? !platformId.equals(that.platformId) : that.platformId != null) return false;
        if (carrierId != null ? !carrierId.equals(that.carrierId) : that.carrierId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = platformId != null ? platformId.hashCode() : 0;
        result = 31 * result + (carrierId != null ? carrierId.hashCode() : 0);
        return result;
    }
}
