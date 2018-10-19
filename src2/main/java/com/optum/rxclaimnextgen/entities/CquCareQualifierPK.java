package com.optum.rxclaimnextgen.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by bkocinsk on 7/22/2018.
 */
public class CquCareQualifierPK implements Serializable {

    private String carrierId;
    private String accountId;
    private String groupId;
    private String qualifierId;

    public CquCareQualifierPK() {
        super();
    }

    public CquCareQualifierPK(String carrierId, String accountId, String groupId, String qualifierId) {
        super();
        this.carrierId = carrierId;
        this.accountId = accountId;
        this.groupId = groupId;
        this.qualifierId = qualifierId;
    }

    @Id
    @Column(name = "HDAACD")
    public String getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(String carrierId) {
        this.carrierId = carrierId;
    }


    @Id
    @Column(name = "HDYIC4")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Id
    @Column(name = "HDYJC4")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Id
    @Column(name = "HDPNC2")
    public String getQualifierId() {
        return qualifierId;
    }

    public void setQualifierId(String qualifierId) {
        this.qualifierId = qualifierId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        com.optum.rxclaimnextgen.entities.CquCareQualifierPK that = (com.optum.rxclaimnextgen.entities.CquCareQualifierPK) o;

        if (carrierId != null ? !carrierId.equals(that.carrierId) : that.carrierId != null) return false;
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        return qualifierId != null ? qualifierId.equals(that.qualifierId) : that.qualifierId == null;
    }

    @Override
    public int hashCode() {
        int result = carrierId != null ? carrierId.hashCode() : 0;
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (qualifierId != null ? qualifierId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CquCareQualifierPK{" +
                "carrierId='" + carrierId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", qualifierId='" + qualifierId + '\'' +
                '}';
    }
}
