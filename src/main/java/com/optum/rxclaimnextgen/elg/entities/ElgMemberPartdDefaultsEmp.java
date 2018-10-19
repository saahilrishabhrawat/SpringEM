package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by bkocinsk on 6/22/2018.
 */
@Entity
@Table(name = "ELG_MEMBER_PARTD_DEFAULTS_EMP")
@IdClass(ElgMemberPartdDefaultsEmpPK.class)
public class ElgMemberPartdDefaultsEmp {
    private String carCarrierId;
    private String accountId;
    private String groupId;
    private String empContractNumberInd;
    private String empContractNumber;
    private String empContractNumberRepr;
    private String empPbpInd;
    private String empPbp;
    private String empPbpRepr;
    private String empSegmentInd;
    private String empSegment;
    private String empSubsidyLevelInd;
    private String empSubsidyLevel;
    private String empCopayCategoryInd;
    private String empCopayCategory;
    private String empCopayCategoryRepr;
    private String empCcategoryEffDteInd;
    private Date empCcategoryEffDate;
    private String empCcategoryEffDteRep;
    private String empEnrollmentSourceInd;
    private String empEnrollmentSource;
    private String empPlanCodeRepr;
    private String empMsiMedicareHicInd;
    private String empContractPbpValidlvl;
    private String empMmdLock;
    private String empGroupRepr;
    private String addUserName;
    private Date addDate;
    private Time addTime;
    private String addProgramName;
    private String chgUserName;
    private Date chgDate;
    private Time chgTime;
    private String chgProgramName;

    @Id
    @Column(name = "CAR_CARRIER_ID", nullable = false, length = 9)
    public String getCarCarrierId() {
        return carCarrierId;
    }

    public void setCarCarrierId(String carCarrierId) {
        this.carCarrierId = carCarrierId;
    }

    @Id
    @Column(name = "ACCOUNT_ID", nullable = false, length = 15)
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Id
    @Column(name = "GROUP_ID", nullable = false, length = 15)
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "EMP_CONTRACT_NUMBER_IND", nullable = false, length = 1)
    public String getEmpContractNumberInd() {
        return empContractNumberInd;
    }

    public void setEmpContractNumberInd(String empContractNumberInd) {
        this.empContractNumberInd = empContractNumberInd;
    }

    @Basic
    @Column(name = "EMP_CONTRACT_NUMBER", nullable = false, length = 5)
    public String getEmpContractNumber() {
        return empContractNumber;
    }

    public void setEmpContractNumber(String empContractNumber) {
        this.empContractNumber = empContractNumber;
    }

    @Basic
    @Column(name = "EMP_CONTRACT_NUMBER_REPR", nullable = false, length = 1)
    public String getEmpContractNumberRepr() {
        return empContractNumberRepr;
    }

    public void setEmpContractNumberRepr(String empContractNumberRepr) {
        this.empContractNumberRepr = empContractNumberRepr;
    }

    @Basic
    @Column(name = "EMP_PBP_IND", nullable = false, length = 1)
    public String getEmpPbpInd() {
        return empPbpInd;
    }

    public void setEmpPbpInd(String empPbpInd) {
        this.empPbpInd = empPbpInd;
    }

    @Basic
    @Column(name = "EMP_PBP", nullable = false, length = 3)
    public String getEmpPbp() {
        return empPbp;
    }

    public void setEmpPbp(String empPbp) {
        this.empPbp = empPbp;
    }

    @Basic
    @Column(name = "EMP_PBP_REPR", nullable = false, length = 1)
    public String getEmpPbpRepr() {
        return empPbpRepr;
    }

    public void setEmpPbpRepr(String empPbpRepr) {
        this.empPbpRepr = empPbpRepr;
    }

    @Basic
    @Column(name = "EMP_SEGMENT_IND", nullable = false, length = 1)
    public String getEmpSegmentInd() {
        return empSegmentInd;
    }

    public void setEmpSegmentInd(String empSegmentInd) {
        this.empSegmentInd = empSegmentInd;
    }

    @Basic
    @Column(name = "EMP_SEGMENT", nullable = false, length = 3)
    public String getEmpSegment() {
        return empSegment;
    }

    public void setEmpSegment(String empSegment) {
        this.empSegment = empSegment;
    }

    @Basic
    @Column(name = "EMP_SUBSIDY_LEVEL_IND", nullable = false, length = 1)
    public String getEmpSubsidyLevelInd() {
        return empSubsidyLevelInd;
    }

    public void setEmpSubsidyLevelInd(String empSubsidyLevelInd) {
        this.empSubsidyLevelInd = empSubsidyLevelInd;
    }

    @Basic
    @Column(name = "EMP_SUBSIDY_LEVEL", nullable = false, length = 3)
    public String getEmpSubsidyLevel() {
        return empSubsidyLevel;
    }

    public void setEmpSubsidyLevel(String empSubsidyLevel) {
        this.empSubsidyLevel = empSubsidyLevel;
    }

    @Basic
    @Column(name = "EMP_COPAY_CATEGORY_IND", nullable = false, length = 1)
    public String getEmpCopayCategoryInd() {
        return empCopayCategoryInd;
    }

    public void setEmpCopayCategoryInd(String empCopayCategoryInd) {
        this.empCopayCategoryInd = empCopayCategoryInd;
    }

    @Basic
    @Column(name = "EMP_COPAY_CATEGORY", nullable = false, length = 1)
    public String getEmpCopayCategory() {
        return empCopayCategory;
    }

    public void setEmpCopayCategory(String empCopayCategory) {
        this.empCopayCategory = empCopayCategory;
    }

    @Basic
    @Column(name = "EMP_COPAY_CATEGORY_REPR", nullable = false, length = 1)
    public String getEmpCopayCategoryRepr() {
        return empCopayCategoryRepr;
    }

    public void setEmpCopayCategoryRepr(String empCopayCategoryRepr) {
        this.empCopayCategoryRepr = empCopayCategoryRepr;
    }

    @Basic
    @Column(name = "EMP_CCATEGORY_EFF_DTE_IND", nullable = false, length = 1)
    public String getEmpCcategoryEffDteInd() {
        return empCcategoryEffDteInd;
    }

    public void setEmpCcategoryEffDteInd(String empCcategoryEffDteInd) {
        this.empCcategoryEffDteInd = empCcategoryEffDteInd;
    }

    @Basic
    @Column(name = "EMP_CCATEGORY_EFF_DATE", nullable = false)
    public Date getEmpCcategoryEffDate() {
        return empCcategoryEffDate;
    }

    public void setEmpCcategoryEffDate(Date empCcategoryEffDate) {
        this.empCcategoryEffDate = empCcategoryEffDate;
    }

    @Basic
    @Column(name = "EMP_CCATEGORY_EFF_DTE_REP", nullable = false, length = 1)
    public String getEmpCcategoryEffDteRep() {
        return empCcategoryEffDteRep;
    }

    public void setEmpCcategoryEffDteRep(String empCcategoryEffDteRep) {
        this.empCcategoryEffDteRep = empCcategoryEffDteRep;
    }

    @Basic
    @Column(name = "EMP_ENROLLMENT_SOURCE_IND", nullable = false, length = 1)
    public String getEmpEnrollmentSourceInd() {
        return empEnrollmentSourceInd;
    }

    public void setEmpEnrollmentSourceInd(String empEnrollmentSourceInd) {
        this.empEnrollmentSourceInd = empEnrollmentSourceInd;
    }

    @Basic
    @Column(name = "EMP_ENROLLMENT_SOURCE", nullable = false, length = 1)
    public String getEmpEnrollmentSource() {
        return empEnrollmentSource;
    }

    public void setEmpEnrollmentSource(String empEnrollmentSource) {
        this.empEnrollmentSource = empEnrollmentSource;
    }

    @Basic
    @Column(name = "EMP_PLAN_CODE_REPR", nullable = false, length = 1)
    public String getEmpPlanCodeRepr() {
        return empPlanCodeRepr;
    }

    public void setEmpPlanCodeRepr(String empPlanCodeRepr) {
        this.empPlanCodeRepr = empPlanCodeRepr;
    }

    @Basic
    @Column(name = "EMP_MSI_MEDICARE_HIC_IND", nullable = false, length = 1)
    public String getEmpMsiMedicareHicInd() {
        return empMsiMedicareHicInd;
    }

    public void setEmpMsiMedicareHicInd(String empMsiMedicareHicInd) {
        this.empMsiMedicareHicInd = empMsiMedicareHicInd;
    }

    @Basic
    @Column(name = "EMP_CONTRACT_PBP_VALIDLVL", nullable = false, length = 1)
    public String getEmpContractPbpValidlvl() {
        return empContractPbpValidlvl;
    }

    public void setEmpContractPbpValidlvl(String empContractPbpValidlvl) {
        this.empContractPbpValidlvl = empContractPbpValidlvl;
    }

    @Basic
    @Column(name = "EMP_MMD_LOCK", nullable = false, length = 1)
    public String getEmpMmdLock() {
        return empMmdLock;
    }

    public void setEmpMmdLock(String empMmdLock) {
        this.empMmdLock = empMmdLock;
    }

    @Basic
    @Column(name = "EMP_GROUP_REPR", nullable = false, length = 1)
    public String getEmpGroupRepr() {
        return empGroupRepr;
    }

    public void setEmpGroupRepr(String empGroupRepr) {
        this.empGroupRepr = empGroupRepr;
    }

    @Basic
    @Column(name = "ADD_USER_NAME", nullable = false, length = 10)
    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    @Basic
    @Column(name = "ADD_DATE", nullable = false)
    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    @Basic
    @Column(name = "ADD_TIME", nullable = false)
    public Time getAddTime() {
        return addTime;
    }

    public void setAddTime(Time addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "ADD_PROGRAM_NAME", nullable = false, length = 10)
    public String getAddProgramName() {
        return addProgramName;
    }

    public void setAddProgramName(String addProgramName) {
        this.addProgramName = addProgramName;
    }

    @Basic
    @Column(name = "CHG_USER_NAME", nullable = false, length = 10)
    public String getChgUserName() {
        return chgUserName;
    }

    public void setChgUserName(String chgUserName) {
        this.chgUserName = chgUserName;
    }

    @Basic
    @Column(name = "CHG_DATE", nullable = false)
    public Date getChgDate() {
        return chgDate;
    }

    public void setChgDate(Date chgDate) {
        this.chgDate = chgDate;
    }

    @Basic
    @Column(name = "CHG_TIME", nullable = false)
    public Time getChgTime() {
        return chgTime;
    }

    public void setChgTime(Time chgTime) {
        this.chgTime = chgTime;
    }

    @Basic
    @Column(name = "CHG_PROGRAM_NAME", nullable = false, length = 10)
    public String getChgProgramName() {
        return chgProgramName;
    }

    public void setChgProgramName(String chgProgramName) {
        this.chgProgramName = chgProgramName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElgMemberPartdDefaultsEmp that = (ElgMemberPartdDefaultsEmp) o;

        if (carCarrierId != null ? !carCarrierId.equals(that.carCarrierId) : that.carCarrierId != null) return false;
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        if (empContractNumberInd != null ? !empContractNumberInd.equals(that.empContractNumberInd) : that.empContractNumberInd != null)
            return false;
        if (empContractNumber != null ? !empContractNumber.equals(that.empContractNumber) : that.empContractNumber != null)
            return false;
        if (empContractNumberRepr != null ? !empContractNumberRepr.equals(that.empContractNumberRepr) : that.empContractNumberRepr != null)
            return false;
        if (empPbpInd != null ? !empPbpInd.equals(that.empPbpInd) : that.empPbpInd != null) return false;
        if (empPbp != null ? !empPbp.equals(that.empPbp) : that.empPbp != null) return false;
        if (empPbpRepr != null ? !empPbpRepr.equals(that.empPbpRepr) : that.empPbpRepr != null) return false;
        if (empSegmentInd != null ? !empSegmentInd.equals(that.empSegmentInd) : that.empSegmentInd != null)
            return false;
        if (empSegment != null ? !empSegment.equals(that.empSegment) : that.empSegment != null) return false;
        if (empSubsidyLevelInd != null ? !empSubsidyLevelInd.equals(that.empSubsidyLevelInd) : that.empSubsidyLevelInd != null)
            return false;
        if (empSubsidyLevel != null ? !empSubsidyLevel.equals(that.empSubsidyLevel) : that.empSubsidyLevel != null)
            return false;
        if (empCopayCategoryInd != null ? !empCopayCategoryInd.equals(that.empCopayCategoryInd) : that.empCopayCategoryInd != null)
            return false;
        if (empCopayCategory != null ? !empCopayCategory.equals(that.empCopayCategory) : that.empCopayCategory != null)
            return false;
        if (empCopayCategoryRepr != null ? !empCopayCategoryRepr.equals(that.empCopayCategoryRepr) : that.empCopayCategoryRepr != null)
            return false;
        if (empCcategoryEffDteInd != null ? !empCcategoryEffDteInd.equals(that.empCcategoryEffDteInd) : that.empCcategoryEffDteInd != null)
            return false;
        if (empCcategoryEffDate != null ? !empCcategoryEffDate.equals(that.empCcategoryEffDate) : that.empCcategoryEffDate != null)
            return false;
        if (empCcategoryEffDteRep != null ? !empCcategoryEffDteRep.equals(that.empCcategoryEffDteRep) : that.empCcategoryEffDteRep != null)
            return false;
        if (empEnrollmentSourceInd != null ? !empEnrollmentSourceInd.equals(that.empEnrollmentSourceInd) : that.empEnrollmentSourceInd != null)
            return false;
        if (empEnrollmentSource != null ? !empEnrollmentSource.equals(that.empEnrollmentSource) : that.empEnrollmentSource != null)
            return false;
        if (empPlanCodeRepr != null ? !empPlanCodeRepr.equals(that.empPlanCodeRepr) : that.empPlanCodeRepr != null)
            return false;
        if (empMsiMedicareHicInd != null ? !empMsiMedicareHicInd.equals(that.empMsiMedicareHicInd) : that.empMsiMedicareHicInd != null)
            return false;
        if (empContractPbpValidlvl != null ? !empContractPbpValidlvl.equals(that.empContractPbpValidlvl) : that.empContractPbpValidlvl != null)
            return false;
        if (empMmdLock != null ? !empMmdLock.equals(that.empMmdLock) : that.empMmdLock != null) return false;
        if (empGroupRepr != null ? !empGroupRepr.equals(that.empGroupRepr) : that.empGroupRepr != null) return false;
        if (addUserName != null ? !addUserName.equals(that.addUserName) : that.addUserName != null) return false;
        if (addDate != null ? !addDate.equals(that.addDate) : that.addDate != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (addProgramName != null ? !addProgramName.equals(that.addProgramName) : that.addProgramName != null)
            return false;
        if (chgUserName != null ? !chgUserName.equals(that.chgUserName) : that.chgUserName != null) return false;
        if (chgDate != null ? !chgDate.equals(that.chgDate) : that.chgDate != null) return false;
        if (chgTime != null ? !chgTime.equals(that.chgTime) : that.chgTime != null) return false;
        if (chgProgramName != null ? !chgProgramName.equals(that.chgProgramName) : that.chgProgramName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = carCarrierId != null ? carCarrierId.hashCode() : 0;
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (empContractNumberInd != null ? empContractNumberInd.hashCode() : 0);
        result = 31 * result + (empContractNumber != null ? empContractNumber.hashCode() : 0);
        result = 31 * result + (empContractNumberRepr != null ? empContractNumberRepr.hashCode() : 0);
        result = 31 * result + (empPbpInd != null ? empPbpInd.hashCode() : 0);
        result = 31 * result + (empPbp != null ? empPbp.hashCode() : 0);
        result = 31 * result + (empPbpRepr != null ? empPbpRepr.hashCode() : 0);
        result = 31 * result + (empSegmentInd != null ? empSegmentInd.hashCode() : 0);
        result = 31 * result + (empSegment != null ? empSegment.hashCode() : 0);
        result = 31 * result + (empSubsidyLevelInd != null ? empSubsidyLevelInd.hashCode() : 0);
        result = 31 * result + (empSubsidyLevel != null ? empSubsidyLevel.hashCode() : 0);
        result = 31 * result + (empCopayCategoryInd != null ? empCopayCategoryInd.hashCode() : 0);
        result = 31 * result + (empCopayCategory != null ? empCopayCategory.hashCode() : 0);
        result = 31 * result + (empCopayCategoryRepr != null ? empCopayCategoryRepr.hashCode() : 0);
        result = 31 * result + (empCcategoryEffDteInd != null ? empCcategoryEffDteInd.hashCode() : 0);
        result = 31 * result + (empCcategoryEffDate != null ? empCcategoryEffDate.hashCode() : 0);
        result = 31 * result + (empCcategoryEffDteRep != null ? empCcategoryEffDteRep.hashCode() : 0);
        result = 31 * result + (empEnrollmentSourceInd != null ? empEnrollmentSourceInd.hashCode() : 0);
        result = 31 * result + (empEnrollmentSource != null ? empEnrollmentSource.hashCode() : 0);
        result = 31 * result + (empPlanCodeRepr != null ? empPlanCodeRepr.hashCode() : 0);
        result = 31 * result + (empMsiMedicareHicInd != null ? empMsiMedicareHicInd.hashCode() : 0);
        result = 31 * result + (empContractPbpValidlvl != null ? empContractPbpValidlvl.hashCode() : 0);
        result = 31 * result + (empMmdLock != null ? empMmdLock.hashCode() : 0);
        result = 31 * result + (empGroupRepr != null ? empGroupRepr.hashCode() : 0);
        result = 31 * result + (addUserName != null ? addUserName.hashCode() : 0);
        result = 31 * result + (addDate != null ? addDate.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (addProgramName != null ? addProgramName.hashCode() : 0);
        result = 31 * result + (chgUserName != null ? chgUserName.hashCode() : 0);
        result = 31 * result + (chgDate != null ? chgDate.hashCode() : 0);
        result = 31 * result + (chgTime != null ? chgTime.hashCode() : 0);
        result = 31 * result + (chgProgramName != null ? chgProgramName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ElgMemberPartdDefaultsEmp{" +
                "carCarrierId='" + carCarrierId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", empContractNumberInd='" + empContractNumberInd + '\'' +
                ", empContractNumber='" + empContractNumber + '\'' +
                ", empContractNumberRepr='" + empContractNumberRepr + '\'' +
                ", empPbpInd='" + empPbpInd + '\'' +
                ", empPbp='" + empPbp + '\'' +
                ", empPbpRepr='" + empPbpRepr + '\'' +
                ", empSegmentInd='" + empSegmentInd + '\'' +
                ", empSegment='" + empSegment + '\'' +
                ", empSubsidyLevelInd='" + empSubsidyLevelInd + '\'' +
                ", empSubsidyLevel='" + empSubsidyLevel + '\'' +
                ", empCopayCategoryInd='" + empCopayCategoryInd + '\'' +
                ", empCopayCategory='" + empCopayCategory + '\'' +
                ", empCopayCategoryRepr='" + empCopayCategoryRepr + '\'' +
                ", empCcategoryEffDteInd='" + empCcategoryEffDteInd + '\'' +
                ", empCcategoryEffDate=" + empCcategoryEffDate +
                ", empCcategoryEffDteRep='" + empCcategoryEffDteRep + '\'' +
                ", empEnrollmentSourceInd='" + empEnrollmentSourceInd + '\'' +
                ", empEnrollmentSource='" + empEnrollmentSource + '\'' +
                ", empPlanCodeRepr='" + empPlanCodeRepr + '\'' +
                ", empMsiMedicareHicInd='" + empMsiMedicareHicInd + '\'' +
                ", empContractPbpValidlvl='" + empContractPbpValidlvl + '\'' +
                ", empMmdLock='" + empMmdLock + '\'' +
                ", empGroupRepr='" + empGroupRepr + '\'' +
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

