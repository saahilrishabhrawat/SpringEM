package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ElgRequiredMemberFieldRmfPK implements Serializable {
    private String rmfCarrierId;
    private String rmfAccountId;
    private String rmfGroupId;

    @Column(name = "RMF_CARRIER_ID")
    @Id
    public String getRmfCarrierId() {
        return rmfCarrierId;
    }

    public void setRmfCarrierId(String rmfCarrierId) {
        this.rmfCarrierId = rmfCarrierId;
    }

    @Column(name = "RMF_ACCOUNT_ID")
    @Id
    public String getRmfAccountId() {
        return rmfAccountId;
    }

    public void setRmfAccountId(String rmfAccountId) {
        this.rmfAccountId = rmfAccountId;
    }

    @Column(name = "RMF_GROUP_ID")
    @Id
    public String getRmfGroupId() {
        return rmfGroupId;
    }

    public void setRmfGroupId(String rmfGroupId) {
        this.rmfGroupId = rmfGroupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElgRequiredMemberFieldRmfPK that = (ElgRequiredMemberFieldRmfPK) o;
        return Objects.equals(rmfCarrierId, that.rmfCarrierId) &&
                Objects.equals(rmfAccountId, that.rmfAccountId) &&
                Objects.equals(rmfGroupId, that.rmfGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rmfCarrierId, rmfAccountId, rmfGroupId);
    }
}
