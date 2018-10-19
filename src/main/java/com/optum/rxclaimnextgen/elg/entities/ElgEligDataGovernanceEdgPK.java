package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ElgEligDataGovernanceEdgPK implements Serializable {
    private String carCarrierId;
    private String accountId;
    private String groupId;

    @Column(name = "CAR_CARRIER_ID")
    @Id
    public String getCarCarrierId() {
        return carCarrierId;
    }

    public void setCarCarrierId(String carCarrierId) {
        this.carCarrierId = carCarrierId;
    }

    @Column(name = "ACCOUNT_ID")
    @Id
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Column(name = "GROUP_ID")
    @Id
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElgEligDataGovernanceEdgPK that = (ElgEligDataGovernanceEdgPK) o;
        return Objects.equals(carCarrierId, that.carCarrierId) &&
                Objects.equals(accountId, that.accountId) &&
                Objects.equals(groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carCarrierId, accountId, groupId);
    }
}
