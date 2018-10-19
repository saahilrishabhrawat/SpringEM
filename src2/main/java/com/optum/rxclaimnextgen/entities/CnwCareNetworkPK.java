package com.optum.rxclaimnextgen.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by bkocinsk on 7/22/2018.
 */
public class CnwCareNetworkPK implements Serializable {

    private String carrierId;
    private String accountId;
    private String groupId;
    private String networkId;

    public CnwCareNetworkPK() {
        super();
    }

    public CnwCareNetworkPK(String carrierId, String accountId, String groupId, String networkId) {
        super();
        this.carrierId = carrierId;
        this.accountId = accountId;
        this.groupId = groupId;
        this.networkId = networkId;
    }

    @Id
    @Column(name = "HCAACD")
    public String getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(String carrierId) {
        this.carrierId = carrierId;
    }

    @Id
    @Column(name = "HCYKC4")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Id
    @Column(name = "HCYLC4")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Id
    @Column(name = "HCPMC2")
    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        com.optum.rxclaimnextgen.entities.CnwCareNetworkPK that = (com.optum.rxclaimnextgen.entities.CnwCareNetworkPK) o;

        if (carrierId != null ? !carrierId.equals(that.carrierId) : that.carrierId != null) return false;
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        return networkId != null ? networkId.equals(that.networkId) : that.networkId == null;
    }

    @Override
    public int hashCode() {
        int result = carrierId != null ? carrierId.hashCode() : 0;
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (networkId != null ? networkId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CnwCareNetworkPK{" +
                "carrierId='" + carrierId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", networkId='" + networkId + '\'' +
                '}';
    }
}
