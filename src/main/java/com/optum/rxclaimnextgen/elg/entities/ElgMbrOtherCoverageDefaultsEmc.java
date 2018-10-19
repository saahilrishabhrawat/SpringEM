package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by bkocinsk on 7/3/2018.
 */
@Entity
@Table(name = "ELG_MBR_OTHER_COVERAGE_DEFAULTS_EMC")
@IdClass(ElgMbrOtherCoverageDefaultsEmcPK.class)
public class ElgMbrOtherCoverageDefaultsEmc {
    private String carCarrierId;
    private String accountId;
    private String groupId;
    private String emcBinInd;
    private String emcBin;
    private String emcPcnInd;
    private String emcPcn;
    private String emcSbmGroupInd;
    private String emcSbmGroup;
    private String emcHelpDeskPhoneInd;
    private long emcHelpDeskPhone;
    private String emcSupplementaltypcdInd;
    private String emcSupplementaltypcd;
    private String emcSupplementaltypcdRep;
    private String emcCoverageIdInd;
    private String emcCoverageId;
    private String emcMemberIdInd;
    private String emcMemberId;
    private String emcPersonCodeInd;
    private String emcPersonCode;
    private String emcCoverageCategoryInd;
    private String emcCoverageCategory;
    private String emcFromDateInd;
    private String emcFromDateReproInd;
    private String emcThruDateInd;
    private String emcThruDateReproInd;
    private String emcMmcLock;
    private String emcRemoveReproFlag;
    private String emcBinRepro;
    private String emcPcnRepro;
    private String emcSbmGroupRepro;
    private String emcMemberIdRepro;
    private String addUserName;
    private Date addDate;
    private Time addTime;
    private String addProgramName;
    private String chgUserName;
    private Date chgDate;
    private Time chgTime;
    private String chgProgramName;

    @Id
    @Column(name = "CAR_CARRIER_ID")
    public String getCarCarrierId() {
        return carCarrierId;
    }

    public void setCarCarrierId(String carCarrierId) {
        this.carCarrierId = carCarrierId;
    }

    @Id
    @Column(name = "ACCOUNT_ID")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Id
    @Column(name = "GROUP_ID")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "EMC_BIN_IND")
    public String getEmcBinInd() {
        return emcBinInd;
    }

    public void setEmcBinInd(String emcBinInd) {
        this.emcBinInd = emcBinInd;
    }

    @Basic
    @Column(name = "EMC_BIN")
    public String getEmcBin() {
        return emcBin;
    }

    public void setEmcBin(String emcBin) {
        this.emcBin = emcBin;
    }

    @Basic
    @Column(name = "EMC_PCN_IND")
    public String getEmcPcnInd() {
        return emcPcnInd;
    }

    public void setEmcPcnInd(String emcPcnInd) {
        this.emcPcnInd = emcPcnInd;
    }

    @Basic
    @Column(name = "EMC_PCN")
    public String getEmcPcn() {
        return emcPcn;
    }

    public void setEmcPcn(String emcPcn) {
        this.emcPcn = emcPcn;
    }

    @Basic
    @Column(name = "EMC_SBM_GROUP_IND")
    public String getEmcSbmGroupInd() {
        return emcSbmGroupInd;
    }

    public void setEmcSbmGroupInd(String emcSbmGroupInd) {
        this.emcSbmGroupInd = emcSbmGroupInd;
    }

    @Basic
    @Column(name = "EMC_SBM_GROUP")
    public String getEmcSbmGroup() {
        return emcSbmGroup;
    }

    public void setEmcSbmGroup(String emcSbmGroup) {
        this.emcSbmGroup = emcSbmGroup;
    }

    @Basic
    @Column(name = "EMC_HELP_DESK_PHONE_IND")
    public String getEmcHelpDeskPhoneInd() {
        return emcHelpDeskPhoneInd;
    }

    public void setEmcHelpDeskPhoneInd(String emcHelpDeskPhoneInd) {
        this.emcHelpDeskPhoneInd = emcHelpDeskPhoneInd;
    }

    @Basic
    @Column(name = "EMC_HELP_DESK_PHONE")
    public long getEmcHelpDeskPhone() {
        return emcHelpDeskPhone;
    }

    public void setEmcHelpDeskPhone(long emcHelpDeskPhone) {
        this.emcHelpDeskPhone = emcHelpDeskPhone;
    }

    @Basic
    @Column(name = "EMC_SUPPLEMENTALTYPCD_IND")
    public String getEmcSupplementaltypcdInd() {
        return emcSupplementaltypcdInd;
    }

    public void setEmcSupplementaltypcdInd(String emcSupplementaltypcdInd) {
        this.emcSupplementaltypcdInd = emcSupplementaltypcdInd;
    }

    @Basic
    @Column(name = "EMC_SUPPLEMENTALTYPCD")
    public String getEmcSupplementaltypcd() {
        return emcSupplementaltypcd;
    }

    public void setEmcSupplementaltypcd(String emcSupplementaltypcd) {
        this.emcSupplementaltypcd = emcSupplementaltypcd;
    }

    @Basic
    @Column(name = "EMC_SUPPLEMENTALTYPCD_REP")
    public String getEmcSupplementaltypcdRep() {
        return emcSupplementaltypcdRep;
    }

    public void setEmcSupplementaltypcdRep(String emcSupplementaltypcdRep) {
        this.emcSupplementaltypcdRep = emcSupplementaltypcdRep;
    }

    @Basic
    @Column(name = "EMC_COVERAGE_ID_IND")
    public String getEmcCoverageIdInd() {
        return emcCoverageIdInd;
    }

    public void setEmcCoverageIdInd(String emcCoverageIdInd) {
        this.emcCoverageIdInd = emcCoverageIdInd;
    }

    @Basic
    @Column(name = "EMC_COVERAGE_ID")
    public String getEmcCoverageId() {
        return emcCoverageId;
    }

    public void setEmcCoverageId(String emcCoverageId) {
        this.emcCoverageId = emcCoverageId;
    }

    @Basic
    @Column(name = "EMC_MEMBER_ID_IND")
    public String getEmcMemberIdInd() {
        return emcMemberIdInd;
    }

    public void setEmcMemberIdInd(String emcMemberIdInd) {
        this.emcMemberIdInd = emcMemberIdInd;
    }

    @Basic
    @Column(name = "EMC_MEMBER_ID")
    public String getEmcMemberId() {
        return emcMemberId;
    }

    public void setEmcMemberId(String emcMemberId) {
        this.emcMemberId = emcMemberId;
    }

    @Basic
    @Column(name = "EMC_PERSON_CODE_IND")
    public String getEmcPersonCodeInd() {
        return emcPersonCodeInd;
    }

    public void setEmcPersonCodeInd(String emcPersonCodeInd) {
        this.emcPersonCodeInd = emcPersonCodeInd;
    }

    @Basic
    @Column(name = "EMC_PERSON_CODE")
    public String getEmcPersonCode() {
        return emcPersonCode;
    }

    public void setEmcPersonCode(String emcPersonCode) {
        this.emcPersonCode = emcPersonCode;
    }

    @Basic
    @Column(name = "EMC_COVERAGE_CATEGORY_IND")
    public String getEmcCoverageCategoryInd() {
        return emcCoverageCategoryInd;
    }

    public void setEmcCoverageCategoryInd(String emcCoverageCategoryInd) {
        this.emcCoverageCategoryInd = emcCoverageCategoryInd;
    }

    @Basic
    @Column(name = "EMC_COVERAGE_CATEGORY")
    public String getEmcCoverageCategory() {
        return emcCoverageCategory;
    }

    public void setEmcCoverageCategory(String emcCoverageCategory) {
        this.emcCoverageCategory = emcCoverageCategory;
    }

    @Basic
    @Column(name = "EMC_FROM_DATE_IND")
    public String getEmcFromDateInd() {
        return emcFromDateInd;
    }

    public void setEmcFromDateInd(String emcFromDateInd) {
        this.emcFromDateInd = emcFromDateInd;
    }

    @Basic
    @Column(name = "EMC_FROM_DATE_REPRO_IND")
    public String getEmcFromDateReproInd() {
        return emcFromDateReproInd;
    }

    public void setEmcFromDateReproInd(String emcFromDateReproInd) {
        this.emcFromDateReproInd = emcFromDateReproInd;
    }

    @Basic
    @Column(name = "EMC_THRU_DATE_IND")
    public String getEmcThruDateInd() {
        return emcThruDateInd;
    }

    public void setEmcThruDateInd(String emcThruDateInd) {
        this.emcThruDateInd = emcThruDateInd;
    }

    @Basic
    @Column(name = "EMC_THRU_DATE_REPRO_IND")
    public String getEmcThruDateReproInd() {
        return emcThruDateReproInd;
    }

    public void setEmcThruDateReproInd(String emcThruDateReproInd) {
        this.emcThruDateReproInd = emcThruDateReproInd;
    }

    @Basic
    @Column(name = "EMC_MMC_LOCK")
    public String getEmcMmcLock() {
        return emcMmcLock;
    }

    public void setEmcMmcLock(String emcMmcLock) {
        this.emcMmcLock = emcMmcLock;
    }

    @Basic
    @Column(name = "EMC_REMOVE_REPRO_FLAG")
    public String getEmcRemoveReproFlag() {
        return emcRemoveReproFlag;
    }

    public void setEmcRemoveReproFlag(String emcRemoveReproFlag) {
        this.emcRemoveReproFlag = emcRemoveReproFlag;
    }

    @Basic
    @Column(name = "EMC_BIN_REPRO")
    public String getEmcBinRepro() {
        return emcBinRepro;
    }

    public void setEmcBinRepro(String emcBinRepro) {
        this.emcBinRepro = emcBinRepro;
    }

    @Basic
    @Column(name = "EMC_PCN_REPRO")
    public String getEmcPcnRepro() {
        return emcPcnRepro;
    }

    public void setEmcPcnRepro(String emcPcnRepro) {
        this.emcPcnRepro = emcPcnRepro;
    }

    @Basic
    @Column(name = "EMC_SBM_GROUP_REPRO")
    public String getEmcSbmGroupRepro() {
        return emcSbmGroupRepro;
    }

    public void setEmcSbmGroupRepro(String emcSbmGroupRepro) {
        this.emcSbmGroupRepro = emcSbmGroupRepro;
    }

    @Basic
    @Column(name = "EMC_MEMBER_ID_REPRO")
    public String getEmcMemberIdRepro() {
        return emcMemberIdRepro;
    }

    public void setEmcMemberIdRepro(String emcMemberIdRepro) {
        this.emcMemberIdRepro = emcMemberIdRepro;
    }

    @Basic
    @Column(name = "ADD_USER_NAME")
    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    @Basic
    @Column(name = "ADD_DATE")
    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    @Basic
    @Column(name = "ADD_TIME")
    public Time getAddTime() {
        return addTime;
    }

    public void setAddTime(Time addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "ADD_PROGRAM_NAME")
    public String getAddProgramName() {
        return addProgramName;
    }

    public void setAddProgramName(String addProgramName) {
        this.addProgramName = addProgramName;
    }

    @Basic
    @Column(name = "CHG_USER_NAME")
    public String getChgUserName() {
        return chgUserName;
    }

    public void setChgUserName(String chgUserName) {
        this.chgUserName = chgUserName;
    }

    @Basic
    @Column(name = "CHG_DATE")
    public Date getChgDate() {
        return chgDate;
    }

    public void setChgDate(Date chgDate) {
        this.chgDate = chgDate;
    }

    @Basic
    @Column(name = "CHG_TIME")
    public Time getChgTime() {
        return chgTime;
    }

    public void setChgTime(Time chgTime) {
        this.chgTime = chgTime;
    }

    @Basic
    @Column(name = "CHG_PROGRAM_NAME")
    public String getChgProgramName() {
        return chgProgramName;
    }

    public void setChgProgramName(String chgProgramName) {
        this.chgProgramName = chgProgramName;
    }

    /* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((addDate == null) ? 0 : addDate.hashCode());
		result = prime * result + ((addProgramName == null) ? 0 : addProgramName.hashCode());
		result = prime * result + ((addTime == null) ? 0 : addTime.hashCode());
		result = prime * result + ((addUserName == null) ? 0 : addUserName.hashCode());
		result = prime * result + ((carCarrierId == null) ? 0 : carCarrierId.hashCode());
		result = prime * result + ((chgDate == null) ? 0 : chgDate.hashCode());
		result = prime * result + ((chgProgramName == null) ? 0 : chgProgramName.hashCode());
		result = prime * result + ((chgTime == null) ? 0 : chgTime.hashCode());
		result = prime * result + ((chgUserName == null) ? 0 : chgUserName.hashCode());
		result = prime * result + ((emcBin == null) ? 0 : emcBin.hashCode());
		result = prime * result + ((emcBinInd == null) ? 0 : emcBinInd.hashCode());
		result = prime * result + ((emcBinRepro == null) ? 0 : emcBinRepro.hashCode());
		result = prime * result + ((emcCoverageCategory == null) ? 0 : emcCoverageCategory.hashCode());
		result = prime * result + ((emcCoverageCategoryInd == null) ? 0 : emcCoverageCategoryInd.hashCode());
		result = prime * result + ((emcCoverageId == null) ? 0 : emcCoverageId.hashCode());
		result = prime * result + ((emcCoverageIdInd == null) ? 0 : emcCoverageIdInd.hashCode());
		result = prime * result + ((emcFromDateInd == null) ? 0 : emcFromDateInd.hashCode());
		result = prime * result + ((emcFromDateReproInd == null) ? 0 : emcFromDateReproInd.hashCode());
		result = prime * result + (int) (emcHelpDeskPhone ^ (emcHelpDeskPhone >>> 32));
		result = prime * result + ((emcHelpDeskPhoneInd == null) ? 0 : emcHelpDeskPhoneInd.hashCode());
		result = prime * result + ((emcMemberId == null) ? 0 : emcMemberId.hashCode());
		result = prime * result + ((emcMemberIdInd == null) ? 0 : emcMemberIdInd.hashCode());
		result = prime * result + ((emcMemberIdRepro == null) ? 0 : emcMemberIdRepro.hashCode());
		result = prime * result + ((emcMmcLock == null) ? 0 : emcMmcLock.hashCode());
		result = prime * result + ((emcPcn == null) ? 0 : emcPcn.hashCode());
		result = prime * result + ((emcPcnInd == null) ? 0 : emcPcnInd.hashCode());
		result = prime * result + ((emcPcnRepro == null) ? 0 : emcPcnRepro.hashCode());
		result = prime * result + ((emcPersonCode == null) ? 0 : emcPersonCode.hashCode());
		result = prime * result + ((emcPersonCodeInd == null) ? 0 : emcPersonCodeInd.hashCode());
		result = prime * result + ((emcRemoveReproFlag == null) ? 0 : emcRemoveReproFlag.hashCode());
		result = prime * result + ((emcSbmGroup == null) ? 0 : emcSbmGroup.hashCode());
		result = prime * result + ((emcSbmGroupInd == null) ? 0 : emcSbmGroupInd.hashCode());
		result = prime * result + ((emcSbmGroupRepro == null) ? 0 : emcSbmGroupRepro.hashCode());
		result = prime * result + ((emcSupplementaltypcd == null) ? 0 : emcSupplementaltypcd.hashCode());
		result = prime * result + ((emcSupplementaltypcdInd == null) ? 0 : emcSupplementaltypcdInd.hashCode());
		result = prime * result + ((emcSupplementaltypcdRep == null) ? 0 : emcSupplementaltypcdRep.hashCode());
		result = prime * result + ((emcThruDateInd == null) ? 0 : emcThruDateInd.hashCode());
		result = prime * result + ((emcThruDateReproInd == null) ? 0 : emcThruDateReproInd.hashCode());
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ElgMbrOtherCoverageDefaultsEmc))
			return false;
		ElgMbrOtherCoverageDefaultsEmc other = (ElgMbrOtherCoverageDefaultsEmc) obj;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (addDate == null) {
			if (other.addDate != null)
				return false;
		} else if (!addDate.equals(other.addDate))
			return false;
		if (addProgramName == null) {
			if (other.addProgramName != null)
				return false;
		} else if (!addProgramName.equals(other.addProgramName))
			return false;
		if (addTime == null) {
			if (other.addTime != null)
				return false;
		} else if (!addTime.equals(other.addTime))
			return false;
		if (addUserName == null) {
			if (other.addUserName != null)
				return false;
		} else if (!addUserName.equals(other.addUserName))
			return false;
		if (carCarrierId == null) {
			if (other.carCarrierId != null)
				return false;
		} else if (!carCarrierId.equals(other.carCarrierId))
			return false;
		if (chgDate == null) {
			if (other.chgDate != null)
				return false;
		} else if (!chgDate.equals(other.chgDate))
			return false;
		if (chgProgramName == null) {
			if (other.chgProgramName != null)
				return false;
		} else if (!chgProgramName.equals(other.chgProgramName))
			return false;
		if (chgTime == null) {
			if (other.chgTime != null)
				return false;
		} else if (!chgTime.equals(other.chgTime))
			return false;
		if (chgUserName == null) {
			if (other.chgUserName != null)
				return false;
		} else if (!chgUserName.equals(other.chgUserName))
			return false;
		if (emcBin == null) {
			if (other.emcBin != null)
				return false;
		} else if (!emcBin.equals(other.emcBin))
			return false;
		if (emcBinInd == null) {
			if (other.emcBinInd != null)
				return false;
		} else if (!emcBinInd.equals(other.emcBinInd))
			return false;
		if (emcBinRepro == null) {
			if (other.emcBinRepro != null)
				return false;
		} else if (!emcBinRepro.equals(other.emcBinRepro))
			return false;
		if (emcCoverageCategory == null) {
			if (other.emcCoverageCategory != null)
				return false;
		} else if (!emcCoverageCategory.equals(other.emcCoverageCategory))
			return false;
		if (emcCoverageCategoryInd == null) {
			if (other.emcCoverageCategoryInd != null)
				return false;
		} else if (!emcCoverageCategoryInd.equals(other.emcCoverageCategoryInd))
			return false;
		if (emcCoverageId == null) {
			if (other.emcCoverageId != null)
				return false;
		} else if (!emcCoverageId.equals(other.emcCoverageId))
			return false;
		if (emcCoverageIdInd == null) {
			if (other.emcCoverageIdInd != null)
				return false;
		} else if (!emcCoverageIdInd.equals(other.emcCoverageIdInd))
			return false;
		if (emcFromDateInd == null) {
			if (other.emcFromDateInd != null)
				return false;
		} else if (!emcFromDateInd.equals(other.emcFromDateInd))
			return false;
		if (emcFromDateReproInd == null) {
			if (other.emcFromDateReproInd != null)
				return false;
		} else if (!emcFromDateReproInd.equals(other.emcFromDateReproInd))
			return false;
		if (emcHelpDeskPhone != other.emcHelpDeskPhone)
			return false;
		if (emcHelpDeskPhoneInd == null) {
			if (other.emcHelpDeskPhoneInd != null)
				return false;
		} else if (!emcHelpDeskPhoneInd.equals(other.emcHelpDeskPhoneInd))
			return false;
		if (emcMemberId == null) {
			if (other.emcMemberId != null)
				return false;
		} else if (!emcMemberId.equals(other.emcMemberId))
			return false;
		if (emcMemberIdInd == null) {
			if (other.emcMemberIdInd != null)
				return false;
		} else if (!emcMemberIdInd.equals(other.emcMemberIdInd))
			return false;
		if (emcMemberIdRepro == null) {
			if (other.emcMemberIdRepro != null)
				return false;
		} else if (!emcMemberIdRepro.equals(other.emcMemberIdRepro))
			return false;
		if (emcMmcLock == null) {
			if (other.emcMmcLock != null)
				return false;
		} else if (!emcMmcLock.equals(other.emcMmcLock))
			return false;
		if (emcPcn == null) {
			if (other.emcPcn != null)
				return false;
		} else if (!emcPcn.equals(other.emcPcn))
			return false;
		if (emcPcnInd == null) {
			if (other.emcPcnInd != null)
				return false;
		} else if (!emcPcnInd.equals(other.emcPcnInd))
			return false;
		if (emcPcnRepro == null) {
			if (other.emcPcnRepro != null)
				return false;
		} else if (!emcPcnRepro.equals(other.emcPcnRepro))
			return false;
		if (emcPersonCode == null) {
			if (other.emcPersonCode != null)
				return false;
		} else if (!emcPersonCode.equals(other.emcPersonCode))
			return false;
		if (emcPersonCodeInd == null) {
			if (other.emcPersonCodeInd != null)
				return false;
		} else if (!emcPersonCodeInd.equals(other.emcPersonCodeInd))
			return false;
		if (emcRemoveReproFlag == null) {
			if (other.emcRemoveReproFlag != null)
				return false;
		} else if (!emcRemoveReproFlag.equals(other.emcRemoveReproFlag))
			return false;
		if (emcSbmGroup == null) {
			if (other.emcSbmGroup != null)
				return false;
		} else if (!emcSbmGroup.equals(other.emcSbmGroup))
			return false;
		if (emcSbmGroupInd == null) {
			if (other.emcSbmGroupInd != null)
				return false;
		} else if (!emcSbmGroupInd.equals(other.emcSbmGroupInd))
			return false;
		if (emcSbmGroupRepro == null) {
			if (other.emcSbmGroupRepro != null)
				return false;
		} else if (!emcSbmGroupRepro.equals(other.emcSbmGroupRepro))
			return false;
		if (emcSupplementaltypcd == null) {
			if (other.emcSupplementaltypcd != null)
				return false;
		} else if (!emcSupplementaltypcd.equals(other.emcSupplementaltypcd))
			return false;
		if (emcSupplementaltypcdInd == null) {
			if (other.emcSupplementaltypcdInd != null)
				return false;
		} else if (!emcSupplementaltypcdInd.equals(other.emcSupplementaltypcdInd))
			return false;
		if (emcSupplementaltypcdRep == null) {
			if (other.emcSupplementaltypcdRep != null)
				return false;
		} else if (!emcSupplementaltypcdRep.equals(other.emcSupplementaltypcdRep))
			return false;
		if (emcThruDateInd == null) {
			if (other.emcThruDateInd != null)
				return false;
		} else if (!emcThruDateInd.equals(other.emcThruDateInd))
			return false;
		if (emcThruDateReproInd == null) {
			if (other.emcThruDateReproInd != null)
				return false;
		} else if (!emcThruDateReproInd.equals(other.emcThruDateReproInd))
			return false;
		if (groupId == null) {
			if (other.groupId != null)
				return false;
		} else if (!groupId.equals(other.groupId))
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "ElgMbrOtherCoverageDefaultsEmcEntity{" +
                "carCarrierId='" + carCarrierId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", emcBinInd='" + emcBinInd + '\'' +
                ", emcBin='" + emcBin + '\'' +
                ", emcPcnInd='" + emcPcnInd + '\'' +
                ", emcPcn='" + emcPcn + '\'' +
                ", emcSbmGroupInd='" + emcSbmGroupInd + '\'' +
                ", emcSbmGroup='" + emcSbmGroup + '\'' +
                ", emcHelpDeskPhoneInd='" + emcHelpDeskPhoneInd + '\'' +
                ", emcHelpDeskPhone=" + emcHelpDeskPhone +
                ", emcSupplementaltypcdInd='" + emcSupplementaltypcdInd + '\'' +
                ", emcSupplementaltypcd='" + emcSupplementaltypcd + '\'' +
                ", emcSupplementaltypcdRep='" + emcSupplementaltypcdRep + '\'' +
                ", emcCoverageIdInd='" + emcCoverageIdInd + '\'' +
                ", emcCoverageId='" + emcCoverageId + '\'' +
                ", emcMemberIdInd='" + emcMemberIdInd + '\'' +
                ", emcMemberId='" + emcMemberId + '\'' +
                ", emcPersonCodeInd='" + emcPersonCodeInd + '\'' +
                ", emcPersonCode='" + emcPersonCode + '\'' +
                ", emcCoverageCategoryInd='" + emcCoverageCategoryInd + '\'' +
                ", emcCoverageCategory='" + emcCoverageCategory + '\'' +
                ", emcFromDateInd='" + emcFromDateInd + '\'' +
                ", emcFromDateReproInd='" + emcFromDateReproInd + '\'' +
                ", emcThruDateInd='" + emcThruDateInd + '\'' +
                ", emcThruDateReproInd='" + emcThruDateReproInd + '\'' +
                ", emcMmcLock='" + emcMmcLock + '\'' +
                ", emcRemoveReproFlag='" + emcRemoveReproFlag + '\'' +
                ", emcBinRepro='" + emcBinRepro + '\'' +
                ", emcPcnRepro='" + emcPcnRepro + '\'' +
                ", emcSbmGroupRepro='" + emcSbmGroupRepro + '\'' +
                ", emcMemberIdRepro='" + emcMemberIdRepro + '\'' +
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

