package com.optum.rxclaimnextgen.elg.pojo;

/**
 * Created by bkocinsk on 8/6/2018.
 */
public class CnwCareNetwork {

    private String carrierId;
    private String accountId;
    private String groupId;
    private String networkId;
    private String networkName;
    private String addUserName;
    private int addDate;
    private int addTime;
    private String addProgramName;
    private String chgUserName;
    private int chgDate;
    private int chgTime;
    private String chgProgramName;

    public String getCarrierId() {
        return carrierId;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getNetworkId() {
        return networkId;
    }

    public String getNetworkName() {
        return networkName;
    }

    public String getAddUserName() {
        return addUserName;
    }

    public int getAddDate() {
        return addDate;
    }

    public int getAddTime() {
        return addTime;
    }

    public String getAddProgramName() {
        return addProgramName;
    }

    public String getChgUserName() {
        return chgUserName;
    }

    public int getChgDate() {
        return chgDate;
    }

    public int getChgTime() {
        return chgTime;
    }

    public String getChgProgramName() {
        return chgProgramName;
    }

    @Override
    public String toString() {
        return "CnwCareNetwork{" +
                "carrierId='" + carrierId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", networkId='" + networkId + '\'' +
                ", networkName='" + networkName + '\'' +
                ", addUserName='" + addUserName + '\'' +
                ", addDate=" + addDate +
                ", addTime=" + addTime +
                ", addProgramName='" + addProgramName + '\'' +
                ", chgUserName='" + chgUserName + '\'' +
                ", chgDate=" + chgDate +
                ", chgTime=" + chgTime +
                ", chgProgramName='" + chgProgramName + '\'' +
                '}';
    }
}
