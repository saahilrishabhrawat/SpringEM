package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by bkocinsk on 6/8/2018.
 */
public class ElgCrdCarrierListDetailPK implements Serializable {
    private String crlCarrierListName;
    private String carCarrierId;

    @Column(name = "CRL_CARRIER_LIST_NAME", nullable = false, length = 10)
    @Id
    public String getCrlCarrierListName() {
        return crlCarrierListName;
    }

    public void setCrlCarrierListName(String crlCarrierListName) {
        this.crlCarrierListName = crlCarrierListName;
    }

    @Column(name = "CAR_CARRIER_ID", nullable = false, length = 9)
    @Id
    public String getCarCarrierId() {
        return carCarrierId;
    }

    public void setCarCarrierId(String carCarrierId) {
        this.carCarrierId = carCarrierId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElgCrdCarrierListDetailPK that = (ElgCrdCarrierListDetailPK) o;

        if (crlCarrierListName != null ? !crlCarrierListName.equals(that.crlCarrierListName) : that.crlCarrierListName != null)
            return false;
        if (carCarrierId != null ? !carCarrierId.equals(that.carCarrierId) : that.carCarrierId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = crlCarrierListName != null ? crlCarrierListName.hashCode() : 0;
        result = 31 * result + (carCarrierId != null ? carCarrierId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ElgCrdCarrierListDetailPK{" +
                "crlCarrierListName='" + crlCarrierListName + '\'' +
                ", carCarrierId='" + carCarrierId + '\'' +
                '}';
    }
}
