package com.optum.rxclaimnextgen.elg.pojo;

/**
 * Created by bkocinsk on 8/11/2018.
 */
public class CopyProfileForm {

    private String fromPlatformId;
    private String fromCarrierId;
    private String fromAccountId;
    private String fromGroupId;
    private String fromEpfLoadIdentifier;
    private String platformId;
    private String carrierId;
    private String accountId;
    private String groupId;
    private String epfLoadIdentifier;
    private String message;

    public String getFromPlatformId() {
        return fromPlatformId;
    }

    public void setFromPlatformId(String fromPlatformId) {
        this.fromPlatformId = fromPlatformId;
    }

    public String getFromCarrierId() {
        return fromCarrierId;
    }

    public void setFromCarrierId(String fromCarrierId) {
        this.fromCarrierId = fromCarrierId;
    }

    public String getFromAccountId() {
        return fromAccountId;
    }

    public void setFromAccountId(String fromAccountId) {
        this.fromAccountId = fromAccountId;
    }

    public String getFromGroupId() {
        return fromGroupId;
    }

    public void setFromGroupId(String fromGroupId) {
        this.fromGroupId = fromGroupId;
    }

    public String getFromEpfLoadIdentifier() {
        return fromEpfLoadIdentifier;
    }

    public void setFromEpfLoadIdentifier(String fromEpfLoadIdentifier) {
        this.fromEpfLoadIdentifier = fromEpfLoadIdentifier;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(String carrierId) {
        this.carrierId = carrierId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getEpfLoadIdentifier() {
        return epfLoadIdentifier;
    }

    public void setEpfLoadIdentifier(String epfLoadIdentifier) {
        this.epfLoadIdentifier = epfLoadIdentifier;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "CopyProfileForm{" +
                "fromPlatformId='" + fromPlatformId + '\'' +
                ", fromCarrierId='" + fromCarrierId + '\'' +
                ", fromAccountId='" + fromAccountId + '\'' +
                ", fromGroupId='" + fromGroupId + '\'' +
                ", fromEpfLoadIdentifier='" + fromEpfLoadIdentifier + '\'' +
                ", platformId='" + platformId + '\'' +
                ", carrierId='" + carrierId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", epfLoadIdentifier='" + epfLoadIdentifier + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
