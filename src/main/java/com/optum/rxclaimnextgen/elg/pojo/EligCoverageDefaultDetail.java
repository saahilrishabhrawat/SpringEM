/**
 * 
 */
package com.optum.rxclaimnextgen.elg.pojo;

import java.sql.Date;
import java.sql.Time;

import org.apache.commons.lang3.StringUtils;

/**
 * This is ValueObject (VO) which carry values coming from UI coverage default
 * detail and will be used to perform DB operation further.
 * 
 * @author Hemant Sharma
 */
public class EligCoverageDefaultDetail {
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
	private DateType empCcategoryEffDate;
	private String empCcategoryEffDteRep;
	private String empEnrollmentSourceInd;
	private String empEnrollmentSource;
	private String empPlanCodeRepr;
	private String empMsiMedicareHicInd;
	private String empContractPbpValidlvl;
	private String empMmdLock;
	private String empGroupRepr;
	private String emcBinInd;
	private String emcBin;
	private String emcPcnInd;
	private String emcPcn;
	private String emcSbmGroupInd;
	private String emcSbmGroup;
	private String emcHelpDeskPhoneInd;
	private String emcHelpDeskPhone;
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
	private String message;
	private String addUserName;
	private Date addDate;
	private Time addTime;
	private String addProgramName;
	private String chgUserName;
	private Date chgDate;
	private Time chgTime;
	private String chgProgramName;

	/**
	 * @return the carCarrierId
	 */
	public String getCarCarrierId() {
		return carCarrierId;
	}

	/**
	 * @param carCarrierId the carCarrierId to set
	 */
	public void setCarCarrierId(String carCarrierId) {
		this.carCarrierId = StringUtils.trim(carCarrierId);
	}

	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = StringUtils.trim(accountId);
	}

	/**
	 * @return the groupId
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(String groupId) {
		this.groupId = StringUtils.trim(groupId);
	}

	/**
	 * @return the empContractNumberInd
	 */
	public String getEmpContractNumberInd() {
		return empContractNumberInd;
	}

	/**
	 * @param empContractNumberInd the empContractNumberInd to set
	 */
	public void setEmpContractNumberInd(String empContractNumberInd) {
		this.empContractNumberInd = StringUtils.trim(empContractNumberInd);
	}

	/**
	 * @return the empContractNumber
	 */
	public String getEmpContractNumber() {
		return empContractNumber;
	}

	/**
	 * @param empContractNumber the empContractNumber to set
	 */
	public void setEmpContractNumber(String empContractNumber) {
		this.empContractNumber = StringUtils.trim(empContractNumber);
	}

	/**
	 * @return the empContractNumberRepr
	 */
	public String getEmpContractNumberRepr() {
		return empContractNumberRepr;
	}

	/**
	 * @param empContractNumberRepr the empContractNumberRepr to set
	 */
	public void setEmpContractNumberRepr(String empContractNumberRepr) {
		this.empContractNumberRepr = StringUtils.trim(empContractNumberRepr);
	}

	/**
	 * @return the empPbpInd
	 */
	public String getEmpPbpInd() {
		return empPbpInd;
	}

	/**
	 * @param empPbpInd the empPbpInd to set
	 */
	public void setEmpPbpInd(String empPbpInd) {
		this.empPbpInd = StringUtils.trim(empPbpInd);
	}

	/**
	 * @return the empPbp
	 */
	public String getEmpPbp() {
		return empPbp;
	}

	/**
	 * @param empPbp the empPbp to set
	 */
	public void setEmpPbp(String empPbp) {
		this.empPbp = StringUtils.trim(empPbp);
	}

	/**
	 * @return the empPbpRepr
	 */
	public String getEmpPbpRepr() {
		return empPbpRepr;
	}

	/**
	 * @param empPbpRepr the empPbpRepr to set
	 */
	public void setEmpPbpRepr(String empPbpRepr) {
		this.empPbpRepr = StringUtils.trim(empPbpRepr);
	}

	/**
	 * @return the empSegmentInd
	 */
	public String getEmpSegmentInd() {
		return empSegmentInd;
	}

	/**
	 * @param empSegmentInd the empSegmentInd to set
	 */
	public void setEmpSegmentInd(String empSegmentInd) {
		this.empSegmentInd = StringUtils.trim(empSegmentInd);
	}

	/**
	 * @return the empSegment
	 */
	public String getEmpSegment() {
		return empSegment;
	}

	/**
	 * @param empSegment the empSegment to set
	 */
	public void setEmpSegment(String empSegment) {
		this.empSegment = StringUtils.trim(empSegment);
	}

	/**
	 * @return the empSubsidyLevelInd
	 */
	public String getEmpSubsidyLevelInd() {
		return empSubsidyLevelInd;
	}

	/**
	 * @param empSubsidyLevelInd the empSubsidyLevelInd to set
	 */
	public void setEmpSubsidyLevelInd(String empSubsidyLevelInd) {
		this.empSubsidyLevelInd = StringUtils.trim(empSubsidyLevelInd);
	}

	/**
	 * @return the empSubsidyLevel
	 */
	public String getEmpSubsidyLevel() {
		return empSubsidyLevel;
	}

	/**
	 * @param empSubsidyLevel the empSubsidyLevel to set
	 */
	public void setEmpSubsidyLevel(String empSubsidyLevel) {
		this.empSubsidyLevel = StringUtils.trim(empSubsidyLevel);
	}

	/**
	 * @return the empCopayCategoryInd
	 */
	public String getEmpCopayCategoryInd() {
		return empCopayCategoryInd;
	}

	/**
	 * @param empCopayCategoryInd the empCopayCategoryInd to set
	 */
	public void setEmpCopayCategoryInd(String empCopayCategoryInd) {
		this.empCopayCategoryInd = StringUtils.trim(empCopayCategoryInd);
	}

	/**
	 * @return the empCopayCategory
	 */
	public String getEmpCopayCategory() {
		return empCopayCategory;
	}

	/**
	 * @param empCopayCategory the empCopayCategory to set
	 */
	public void setEmpCopayCategory(String empCopayCategory) {
		this.empCopayCategory = StringUtils.trim(empCopayCategory);
	}

	/**
	 * @return the empCopayCategoryRepr
	 */
	public String getEmpCopayCategoryRepr() {
		return empCopayCategoryRepr;
	}

	/**
	 * @param empCopayCategoryRepr the empCopayCategoryRepr to set
	 */
	public void setEmpCopayCategoryRepr(String empCopayCategoryRepr) {
		this.empCopayCategoryRepr = StringUtils.trim(empCopayCategoryRepr);
	}

	/**
	 * @return the empCcategoryEffDteInd
	 */
	public String getEmpCcategoryEffDteInd() {
		return empCcategoryEffDteInd;
	}

	/**
	 * @param empCcategoryEffDteInd the empCcategoryEffDteInd to set
	 */
	public void setEmpCcategoryEffDteInd(String empCcategoryEffDteInd) {
		this.empCcategoryEffDteInd = StringUtils.trim(empCcategoryEffDteInd);
	}

	/**
	 * @return the empCcategoryEffDate
	 */
	public DateType getEmpCcategoryEffDate() {
		return empCcategoryEffDate;
	}

	/**
	 * @param empCcategoryEffDate the empCcategoryEffDate to set
	 */
	public void setEmpCcategoryEffDate(DateType empCcategoryEffDate) {
		this.empCcategoryEffDate = empCcategoryEffDate;
	}

	/**
	 * @return the empCcategoryEffDteRep
	 */
	public String getEmpCcategoryEffDteRep() {
		return empCcategoryEffDteRep;
	}

	/**
	 * @param empCcategoryEffDteRep the empCcategoryEffDteRep to set
	 */
	public void setEmpCcategoryEffDteRep(String empCcategoryEffDteRep) {
		this.empCcategoryEffDteRep = StringUtils.trim(empCcategoryEffDteRep);
	}

	/**
	 * @return the empEnrollmentSourceInd
	 */
	public String getEmpEnrollmentSourceInd() {
		return empEnrollmentSourceInd;
	}

	/**
	 * @param empEnrollmentSourceInd the empEnrollmentSourceInd to set
	 */
	public void setEmpEnrollmentSourceInd(String empEnrollmentSourceInd) {
		this.empEnrollmentSourceInd = StringUtils.trim(empEnrollmentSourceInd);
	}

	/**
	 * @return the empEnrollmentSource
	 */
	public String getEmpEnrollmentSource() {
		return empEnrollmentSource;
	}

	/**
	 * @param empEnrollmentSource the empEnrollmentSource to set
	 */
	public void setEmpEnrollmentSource(String empEnrollmentSource) {
		this.empEnrollmentSource = StringUtils.trim(empEnrollmentSource);
	}

	/**
	 * @return the empPlanCodeRepr
	 */
	public String getEmpPlanCodeRepr() {
		return empPlanCodeRepr;
	}

	/**
	 * @param empPlanCodeRepr the empPlanCodeRepr to set
	 */
	public void setEmpPlanCodeRepr(String empPlanCodeRepr) {
		this.empPlanCodeRepr = StringUtils.trim(empPlanCodeRepr);
	}

	/**
	 * @return the empMsiMedicareHicInd
	 */
	public String getEmpMsiMedicareHicInd() {
		return empMsiMedicareHicInd;
	}

	/**
	 * @param empMsiMedicareHicInd the empMsiMedicareHicInd to set
	 */
	public void setEmpMsiMedicareHicInd(String empMsiMedicareHicInd) {
		this.empMsiMedicareHicInd = StringUtils.trim(empMsiMedicareHicInd);
	}

	/**
	 * @return the empContractPbpValidlvl
	 */
	public String getEmpContractPbpValidlvl() {
		return empContractPbpValidlvl;
	}

	/**
	 * @param empContractPbpValidlvl the empContractPbpValidlvl to set
	 */
	public void setEmpContractPbpValidlvl(String empContractPbpValidlvl) {
		this.empContractPbpValidlvl = StringUtils.trim(empContractPbpValidlvl);
	}

	/**
	 * @return the empMmdLock
	 */
	public String getEmpMmdLock() {
		return empMmdLock;
	}

	/**
	 * @param empMmdLock the empMmdLock to set
	 */
	public void setEmpMmdLock(String empMmdLock) {
		this.empMmdLock = StringUtils.trim(empMmdLock);
	}

	/**
	 * @return the empGroupRepr
	 */
	public String getEmpGroupRepr() {
		return empGroupRepr;
	}

	/**
	 * @param empGroupRepr the empGroupRepr to set
	 */
	public void setEmpGroupRepr(String empGroupRepr) {
		this.empGroupRepr = StringUtils.trim(empGroupRepr);
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the emcBinInd
	 */
	public String getEmcBinInd() {
		return emcBinInd;
	}

	/**
	 * @param emcBinInd the emcBinInd to set
	 */
	public void setEmcBinInd(String emcBinInd) {
		this.emcBinInd = StringUtils.trim(emcBinInd);
	}

	/**
	 * @return the emcBin
	 */
	public String getEmcBin() {
		return emcBin;
	}

	/**
	 * @param emcBin the emcBin to set
	 */
	public void setEmcBin(String emcBin) {
		this.emcBin = StringUtils.trim(emcBin);
	}

	/**
	 * @return the emcPcnInd
	 */
	public String getEmcPcnInd() {
		return emcPcnInd;
	}

	/**
	 * @param emcPcnInd the emcPcnInd to set
	 */
	public void setEmcPcnInd(String emcPcnInd) {
		this.emcPcnInd = StringUtils.trim(emcPcnInd);
	}

	/**
	 * @return the emcPcn
	 */
	public String getEmcPcn() {
		return emcPcn;
	}

	/**
	 * @param emcPcn the emcPcn to set
	 */
	public void setEmcPcn(String emcPcn) {
		this.emcPcn = StringUtils.trim(emcPcn);
	}

	/**
	 * @return the emcSbmGroupInd
	 */
	public String getEmcSbmGroupInd() {
		return emcSbmGroupInd;
	}

	/**
	 * @param emcSbmGroupInd the emcSbmGroupInd to set
	 */
	public void setEmcSbmGroupInd(String emcSbmGroupInd) {
		this.emcSbmGroupInd = StringUtils.trim(emcSbmGroupInd);
	}

	/**
	 * @return the emcSbmGroup
	 */
	public String getEmcSbmGroup() {
		return emcSbmGroup;
	}

	/**
	 * @param emcSbmGroup the emcSbmGroup to set
	 */
	public void setEmcSbmGroup(String emcSbmGroup) {
		this.emcSbmGroup = StringUtils.trim(emcSbmGroup);
	}

	/**
	 * @return the emcHelpDeskPhoneInd
	 */
	public String getEmcHelpDeskPhoneInd() {
		return emcHelpDeskPhoneInd;
	}

	/**
	 * @param emcHelpDeskPhoneInd the emcHelpDeskPhoneInd to set
	 */
	public void setEmcHelpDeskPhoneInd(String emcHelpDeskPhoneInd) {
		this.emcHelpDeskPhoneInd = StringUtils.trim(emcHelpDeskPhoneInd);
	}

	/**
	 * @return the emcHelpDeskPhone
	 */
	public String getEmcHelpDeskPhone() {
		return emcHelpDeskPhone;
	}

	/**
	 * @param emcHelpDeskPhone the emcHelpDeskPhone to set
	 */
	public void setEmcHelpDeskPhone(String emcHelpDeskPhone) {
		this.emcHelpDeskPhone = emcHelpDeskPhone;
	}

	/**
	 * @return the emcSupplementaltypcdInd
	 */
	public String getEmcSupplementaltypcdInd() {
		return emcSupplementaltypcdInd;
	}

	/**
	 * @param emcSupplementaltypcdInd the emcSupplementaltypcdInd to set
	 */
	public void setEmcSupplementaltypcdInd(String emcSupplementaltypcdInd) {
		this.emcSupplementaltypcdInd = StringUtils.trim(emcSupplementaltypcdInd);
	}

	/**
	 * @return the emcSupplementaltypcd
	 */
	public String getEmcSupplementaltypcd() {
		return emcSupplementaltypcd;
	}

	/**
	 * @param emcSupplementaltypcd the emcSupplementaltypcd to set
	 */
	public void setEmcSupplementaltypcd(String emcSupplementaltypcd) {
		this.emcSupplementaltypcd = StringUtils.trim(emcSupplementaltypcd);
	}

	/**
	 * @return the emcSupplementaltypcdRep
	 */
	public String getEmcSupplementaltypcdRep() {
		return emcSupplementaltypcdRep;
	}

	/**
	 * @param emcSupplementaltypcdRep the emcSupplementaltypcdRep to set
	 */
	public void setEmcSupplementaltypcdRep(String emcSupplementaltypcdRep) {
		this.emcSupplementaltypcdRep = StringUtils.trim(emcSupplementaltypcdRep);
	}

	/**
	 * @return the emcCoverageIdInd
	 */
	public String getEmcCoverageIdInd() {
		return emcCoverageIdInd;
	}

	/**
	 * @param emcCoverageIdInd the emcCoverageIdInd to set
	 */
	public void setEmcCoverageIdInd(String emcCoverageIdInd) {
		this.emcCoverageIdInd = StringUtils.trim(emcCoverageIdInd);
	}

	/**
	 * @return the emcCoverageId
	 */
	public String getEmcCoverageId() {
		return emcCoverageId;
	}

	/**
	 * @param emcCoverageId the emcCoverageId to set
	 */
	public void setEmcCoverageId(String emcCoverageId) {
		this.emcCoverageId = StringUtils.trim(emcCoverageId);
	}

	/**
	 * @return the emcMemberIdInd
	 */
	public String getEmcMemberIdInd() {
		return emcMemberIdInd;
	}

	/**
	 * @param emcMemberIdInd the emcMemberIdInd to set
	 */
	public void setEmcMemberIdInd(String emcMemberIdInd) {
		this.emcMemberIdInd = StringUtils.trim(emcMemberIdInd);
	}

	/**
	 * @return the emcMemberId
	 */
	public String getEmcMemberId() {
		return emcMemberId;
	}

	/**
	 * @param emcMemberId the emcMemberId to set
	 */
	public void setEmcMemberId(String emcMemberId) {
		this.emcMemberId = StringUtils.trim(emcMemberId);
	}

	/**
	 * @return the emcPersonCodeInd
	 */
	public String getEmcPersonCodeInd() {
		return emcPersonCodeInd;
	}

	/**
	 * @param emcPersonCodeInd the emcPersonCodeInd to set
	 */
	public void setEmcPersonCodeInd(String emcPersonCodeInd) {
		this.emcPersonCodeInd = StringUtils.trim(emcPersonCodeInd);
	}

	/**
	 * @return the emcPersonCode
	 */
	public String getEmcPersonCode() {
		return emcPersonCode;
	}

	/**
	 * @param emcPersonCode the emcPersonCode to set
	 */
	public void setEmcPersonCode(String emcPersonCode) {
		this.emcPersonCode = StringUtils.trim(emcPersonCode);
	}

	/**
	 * @return the emcCoverageCategoryInd
	 */
	public String getEmcCoverageCategoryInd() {
		return emcCoverageCategoryInd;
	}

	/**
	 * @param emcCoverageCategoryInd the emcCoverageCategoryInd to set
	 */
	public void setEmcCoverageCategoryInd(String emcCoverageCategoryInd) {
		this.emcCoverageCategoryInd = StringUtils.trim(emcCoverageCategoryInd);
	}

	/**
	 * @return the emcCoverageCategory
	 */
	public String getEmcCoverageCategory() {
		return emcCoverageCategory;
	}

	/**
	 * @param emcCoverageCategory the emcCoverageCategory to set
	 */
	public void setEmcCoverageCategory(String emcCoverageCategory) {
		this.emcCoverageCategory = StringUtils.trim(emcCoverageCategory);
	}

	/**
	 * @return the emcFromDateInd
	 */
	public String getEmcFromDateInd() {
		return emcFromDateInd;
	}

	/**
	 * @param emcFromDateInd the emcFromDateInd to set
	 */
	public void setEmcFromDateInd(String emcFromDateInd) {
		this.emcFromDateInd = emcFromDateInd;
	}

	/**
	 * @return the emcThruDateInd
	 */
	public String getEmcThruDateInd() {
		return emcThruDateInd;
	}

	/**
	 * @param emcThruDateInd the emcThruDateInd to set
	 */
	public void setEmcThruDateInd(String emcThruDateInd) {
		this.emcThruDateInd = emcThruDateInd;
	}

	/**
	 * @return the emcFromDateReproInd
	 */
	public String getEmcFromDateReproInd() {
		return emcFromDateReproInd;
	}

	/**
	 * @param emcFromDateReproInd the emcFromDateReproInd to set
	 */
	public void setEmcFromDateReproInd(String emcFromDateReproInd) {
		this.emcFromDateReproInd = StringUtils.trim(emcFromDateReproInd);
	}

	/**
	 * @return the emcThruDateReproInd
	 */
	public String getEmcThruDateReproInd() {
		return emcThruDateReproInd;
	}

	/**
	 * @param emcThruDateReproInd the emcThruDateReproInd to set
	 */
	public void setEmcThruDateReproInd(String emcThruDateReproInd) {
		this.emcThruDateReproInd = StringUtils.trim(emcThruDateReproInd);
	}

	/**
	 * @return the emcMmcLock
	 */
	public String getEmcMmcLock() {
		return emcMmcLock;
	}

	/**
	 * @param emcMmcLock the emcMmcLock to set
	 */
	public void setEmcMmcLock(String emcMmcLock) {
		this.emcMmcLock = StringUtils.trim(emcMmcLock);
	}

	/**
	 * @return the emcRemoveReproFlag
	 */
	public String getEmcRemoveReproFlag() {
		return emcRemoveReproFlag;
	}

	/**
	 * @param emcRemoveReproFlag the emcRemoveReproFlag to set
	 */
	public void setEmcRemoveReproFlag(String emcRemoveReproFlag) {
		this.emcRemoveReproFlag = StringUtils.trim(emcRemoveReproFlag);
	}

	/**
	 * @return the emcBinRepro
	 */
	public String getEmcBinRepro() {
		return emcBinRepro;
	}

	/**
	 * @param emcBinRepro the emcBinRepro to set
	 */
	public void setEmcBinRepro(String emcBinRepro) {
		this.emcBinRepro = StringUtils.trim(emcBinRepro);
	}

	/**
	 * @return the emcPcnRepro
	 */
	public String getEmcPcnRepro() {
		return emcPcnRepro;
	}

	/**
	 * @param emcPcnRepro the emcPcnRepro to set
	 */
	public void setEmcPcnRepro(String emcPcnRepro) {
		this.emcPcnRepro = StringUtils.trim(emcPcnRepro);
	}

	/**
	 * @return the emcSbmGroupRepro
	 */
	public String getEmcSbmGroupRepro() {
		return emcSbmGroupRepro;
	}

	/**
	 * @param emcSbmGroupRepro the emcSbmGroupRepro to set
	 */
	public void setEmcSbmGroupRepro(String emcSbmGroupRepro) {
		this.emcSbmGroupRepro = StringUtils.trim(emcSbmGroupRepro);
	}

	/**
	 * @return the emcMemberIdRepro
	 */
	public String getEmcMemberIdRepro() {
		return emcMemberIdRepro;
	}

	/**
	 * @param emcMemberIdRepro the emcMemberIdRepro to set
	 */
	public void setEmcMemberIdRepro(String emcMemberIdRepro) {
		this.emcMemberIdRepro = StringUtils.trim(emcMemberIdRepro);
	}

	/**
	 * @return the addUserName
	 */
	public String getAddUserName() {
		return addUserName;
	}

	/**
	 * @param addUserName the addUserName to set
	 */
	public void setAddUserName(String addUserName) {
		this.addUserName = StringUtils.trim(addUserName);
	}

	/**
	 * @return the addDate
	 */
	public Date getAddDate() {
		return addDate;
	}

	/**
	 * @param addDate the addDate to set
	 */
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	/**
	 * @return the addTime
	 */
	public Time getAddTime() {
		return addTime;
	}

	/**
	 * @param addTime the addTime to set
	 */
	public void setAddTime(Time addTime) {
		this.addTime = addTime;
	}

	/**
	 * @return the addProgramName
	 */
	public String getAddProgramName() {
		return addProgramName;
	}

	/**
	 * @param addProgramName the addProgramName to set
	 */
	public void setAddProgramName(String addProgramName) {
		this.addProgramName = StringUtils.trim(addProgramName);
	}

	/**
	 * @return the chgUserName
	 */
	public String getChgUserName() {
		return chgUserName;
	}

	/**
	 * @param chgUserName the chgUserName to set
	 */
	public void setChgUserName(String chgUserName) {
		this.chgUserName = StringUtils.trim(chgUserName);
	}

	/**
	 * @return the chgDate
	 */
	public Date getChgDate() {
		return chgDate;
	}

	/**
	 * @param chgDate the chgDate to set
	 */
	public void setChgDate(Date chgDate) {
		this.chgDate = chgDate;
	}

	/**
	 * @return the chgTime
	 */
	public Time getChgTime() {
		return chgTime;
	}

	/**
	 * @param chgTime the chgTime to set
	 */
	public void setChgTime(Time chgTime) {
		this.chgTime = chgTime;
	}

	/**
	 * @return the chgProgramName
	 */
	public String getChgProgramName() {
		return chgProgramName;
	}

	/**
	 * @param chgProgramName the chgProgramName to set
	 */
	public void setChgProgramName(String chgProgramName) {
		this.chgProgramName = StringUtils.trim(chgProgramName);
	}

	/*
	 * (non-Javadoc)
	 * 
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
		result = prime * result + ((emcHelpDeskPhone == null) ? 0 : emcFromDateReproInd.hashCode());;
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
		result = prime * result + ((empCcategoryEffDate == null) ? 0 : empCcategoryEffDate.hashCode());
		result = prime * result + ((empCcategoryEffDteInd == null) ? 0 : empCcategoryEffDteInd.hashCode());
		result = prime * result + ((empCcategoryEffDteRep == null) ? 0 : empCcategoryEffDteRep.hashCode());
		result = prime * result + ((empContractNumber == null) ? 0 : empContractNumber.hashCode());
		result = prime * result + ((empContractNumberInd == null) ? 0 : empContractNumberInd.hashCode());
		result = prime * result + ((empContractNumberRepr == null) ? 0 : empContractNumberRepr.hashCode());
		result = prime * result + ((empContractPbpValidlvl == null) ? 0 : empContractPbpValidlvl.hashCode());
		result = prime * result + ((empCopayCategory == null) ? 0 : empCopayCategory.hashCode());
		result = prime * result + ((empCopayCategoryInd == null) ? 0 : empCopayCategoryInd.hashCode());
		result = prime * result + ((empCopayCategoryRepr == null) ? 0 : empCopayCategoryRepr.hashCode());
		result = prime * result + ((empEnrollmentSource == null) ? 0 : empEnrollmentSource.hashCode());
		result = prime * result + ((empEnrollmentSourceInd == null) ? 0 : empEnrollmentSourceInd.hashCode());
		result = prime * result + ((empGroupRepr == null) ? 0 : empGroupRepr.hashCode());
		result = prime * result + ((empMmdLock == null) ? 0 : empMmdLock.hashCode());
		result = prime * result + ((empMsiMedicareHicInd == null) ? 0 : empMsiMedicareHicInd.hashCode());
		result = prime * result + ((empPbp == null) ? 0 : empPbp.hashCode());
		result = prime * result + ((empPbpInd == null) ? 0 : empPbpInd.hashCode());
		result = prime * result + ((empPbpRepr == null) ? 0 : empPbpRepr.hashCode());
		result = prime * result + ((empPlanCodeRepr == null) ? 0 : empPlanCodeRepr.hashCode());
		result = prime * result + ((empSegment == null) ? 0 : empSegment.hashCode());
		result = prime * result + ((empSegmentInd == null) ? 0 : empSegmentInd.hashCode());
		result = prime * result + ((empSubsidyLevel == null) ? 0 : empSubsidyLevel.hashCode());
		result = prime * result + ((empSubsidyLevelInd == null) ? 0 : empSubsidyLevelInd.hashCode());
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof EligCoverageDefaultDetail))
			return false;
		EligCoverageDefaultDetail other = (EligCoverageDefaultDetail) obj;
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
		if (empCcategoryEffDate == null) {
			if (other.empCcategoryEffDate != null)
				return false;
		} else if (!empCcategoryEffDate.equals(other.empCcategoryEffDate))
			return false;
		if (empCcategoryEffDteInd == null) {
			if (other.empCcategoryEffDteInd != null)
				return false;
		} else if (!empCcategoryEffDteInd.equals(other.empCcategoryEffDteInd))
			return false;
		if (empCcategoryEffDteRep == null) {
			if (other.empCcategoryEffDteRep != null)
				return false;
		} else if (!empCcategoryEffDteRep.equals(other.empCcategoryEffDteRep))
			return false;
		if (empContractNumber == null) {
			if (other.empContractNumber != null)
				return false;
		} else if (!empContractNumber.equals(other.empContractNumber))
			return false;
		if (empContractNumberInd == null) {
			if (other.empContractNumberInd != null)
				return false;
		} else if (!empContractNumberInd.equals(other.empContractNumberInd))
			return false;
		if (empContractNumberRepr == null) {
			if (other.empContractNumberRepr != null)
				return false;
		} else if (!empContractNumberRepr.equals(other.empContractNumberRepr))
			return false;
		if (empContractPbpValidlvl == null) {
			if (other.empContractPbpValidlvl != null)
				return false;
		} else if (!empContractPbpValidlvl.equals(other.empContractPbpValidlvl))
			return false;
		if (empCopayCategory == null) {
			if (other.empCopayCategory != null)
				return false;
		} else if (!empCopayCategory.equals(other.empCopayCategory))
			return false;
		if (empCopayCategoryInd == null) {
			if (other.empCopayCategoryInd != null)
				return false;
		} else if (!empCopayCategoryInd.equals(other.empCopayCategoryInd))
			return false;
		if (empCopayCategoryRepr == null) {
			if (other.empCopayCategoryRepr != null)
				return false;
		} else if (!empCopayCategoryRepr.equals(other.empCopayCategoryRepr))
			return false;
		if (empEnrollmentSource == null) {
			if (other.empEnrollmentSource != null)
				return false;
		} else if (!empEnrollmentSource.equals(other.empEnrollmentSource))
			return false;
		if (empEnrollmentSourceInd == null) {
			if (other.empEnrollmentSourceInd != null)
				return false;
		} else if (!empEnrollmentSourceInd.equals(other.empEnrollmentSourceInd))
			return false;
		if (empGroupRepr == null) {
			if (other.empGroupRepr != null)
				return false;
		} else if (!empGroupRepr.equals(other.empGroupRepr))
			return false;
		if (empMmdLock == null) {
			if (other.empMmdLock != null)
				return false;
		} else if (!empMmdLock.equals(other.empMmdLock))
			return false;
		if (empMsiMedicareHicInd == null) {
			if (other.empMsiMedicareHicInd != null)
				return false;
		} else if (!empMsiMedicareHicInd.equals(other.empMsiMedicareHicInd))
			return false;
		if (empPbp == null) {
			if (other.empPbp != null)
				return false;
		} else if (!empPbp.equals(other.empPbp))
			return false;
		if (empPbpInd == null) {
			if (other.empPbpInd != null)
				return false;
		} else if (!empPbpInd.equals(other.empPbpInd))
			return false;
		if (empPbpRepr == null) {
			if (other.empPbpRepr != null)
				return false;
		} else if (!empPbpRepr.equals(other.empPbpRepr))
			return false;
		if (empPlanCodeRepr == null) {
			if (other.empPlanCodeRepr != null)
				return false;
		} else if (!empPlanCodeRepr.equals(other.empPlanCodeRepr))
			return false;
		if (empSegment == null) {
			if (other.empSegment != null)
				return false;
		} else if (!empSegment.equals(other.empSegment))
			return false;
		if (empSegmentInd == null) {
			if (other.empSegmentInd != null)
				return false;
		} else if (!empSegmentInd.equals(other.empSegmentInd))
			return false;
		if (empSubsidyLevel == null) {
			if (other.empSubsidyLevel != null)
				return false;
		} else if (!empSubsidyLevel.equals(other.empSubsidyLevel))
			return false;
		if (empSubsidyLevelInd == null) {
			if (other.empSubsidyLevelInd != null)
				return false;
		} else if (!empSubsidyLevelInd.equals(other.empSubsidyLevelInd))
			return false;
		if (groupId == null) {
			if (other.groupId != null)
				return false;
		} else if (!groupId.equals(other.groupId))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EligCoverageDefaultDetail [carCarrierId=" + carCarrierId + ", accountId=" + accountId + ", groupId="
				+ groupId + ", empContractNumberInd=" + empContractNumberInd + ", empContractNumber="
				+ empContractNumber + ", empContractNumberRepr=" + empContractNumberRepr + ", empPbpInd=" + empPbpInd
				+ ", empPbp=" + empPbp + ", empPbpRepr=" + empPbpRepr + ", empSegmentInd=" + empSegmentInd
				+ ", empSegment=" + empSegment + ", empSubsidyLevelInd=" + empSubsidyLevelInd + ", empSubsidyLevel="
				+ empSubsidyLevel + ", empCopayCategoryInd=" + empCopayCategoryInd + ", empCopayCategory="
				+ empCopayCategory + ", empCopayCategoryRepr=" + empCopayCategoryRepr + ", empCcategoryEffDteInd="
				+ empCcategoryEffDteInd + ", empCcategoryEffDate=" + empCcategoryEffDate + ", empCcategoryEffDteRep="
				+ empCcategoryEffDteRep + ", empEnrollmentSourceInd=" + empEnrollmentSourceInd
				+ ", empEnrollmentSource=" + empEnrollmentSource + ", empPlanCodeRepr=" + empPlanCodeRepr
				+ ", empMsiMedicareHicInd=" + empMsiMedicareHicInd + ", empContractPbpValidlvl="
				+ empContractPbpValidlvl + ", empMmdLock=" + empMmdLock + ", empGroupRepr=" + empGroupRepr
				+ ", emcBinInd=" + emcBinInd + ", emcBin=" + emcBin + ", emcPcnInd=" + emcPcnInd + ", emcPcn=" + emcPcn
				+ ", emcSbmGroupInd=" + emcSbmGroupInd + ", emcSbmGroup=" + emcSbmGroup + ", emcHelpDeskPhoneInd="
				+ emcHelpDeskPhoneInd + ", emcHelpDeskPhone=" + emcHelpDeskPhone + ", emcSupplementaltypcdInd="
				+ emcSupplementaltypcdInd + ", emcSupplementaltypcd=" + emcSupplementaltypcd
				+ ", emcSupplementaltypcdRep=" + emcSupplementaltypcdRep + ", emcCoverageIdInd=" + emcCoverageIdInd
				+ ", emcCoverageId=" + emcCoverageId + ", emcMemberIdInd=" + emcMemberIdInd + ", emcMemberId="
				+ emcMemberId + ", emcPersonCodeInd=" + emcPersonCodeInd + ", emcPersonCode=" + emcPersonCode
				+ ", emcCoverageCategoryInd=" + emcCoverageCategoryInd + ", emcCoverageCategory=" + emcCoverageCategory
				+ ", emcFromDateInd=" + emcFromDateInd + ", emcFromDateReproInd=" + emcFromDateReproInd
				+ ", emcThruDateInd=" + emcThruDateInd + ", emcThruDateReproInd=" + emcThruDateReproInd
				+ ", emcMmcLock=" + emcMmcLock + ", emcRemoveReproFlag=" + emcRemoveReproFlag + ", emcBinRepro="
				+ emcBinRepro + ", emcPcnRepro=" + emcPcnRepro + ", emcSbmGroupRepro=" + emcSbmGroupRepro
				+ ", emcMemberIdRepro=" + emcMemberIdRepro + ", message=" + message + ", addUserName=" + addUserName
				+ ", addDate=" + addDate + ", addTime=" + addTime + ", addProgramName=" + addProgramName
				+ ", chgUserName=" + chgUserName + ", chgDate=" + chgDate + ", chgTime=" + chgTime + ", chgProgramName="
				+ chgProgramName + "]";
	}
}
