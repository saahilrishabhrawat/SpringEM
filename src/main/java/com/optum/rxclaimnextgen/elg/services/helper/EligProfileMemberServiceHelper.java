package com.optum.rxclaimnextgen.elg.services.helper;

import static com.optum.rxclaimnextgen.elg.utils.DateUtils.parseToSqlDateType;
import static com.optum.rxclaimnextgen.elg.utils.Utils.removeMaskFrmPhone;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.optum.rxclaimnextgen.elg.entities.ElgEligGroupDefaultsEgd;
import com.optum.rxclaimnextgen.elg.entities.ElgEligMemberDefaultsEmd;
import com.optum.rxclaimnextgen.elg.entities.ElgMbrOtherCoverageDefaultsEmc;
import com.optum.rxclaimnextgen.elg.entities.ElgMemberPartdDefaultsEmp;
import com.optum.rxclaimnextgen.elg.pojo.EligAltInsuranceDefaultDetail;
import com.optum.rxclaimnextgen.elg.pojo.EligCoverageDefaultDetail;
import com.optum.rxclaimnextgen.elg.pojo.EligGroupDefaultDetail;
import com.optum.rxclaimnextgen.elg.pojo.AddressGroup;
import com.optum.rxclaimnextgen.elg.utils.DateUtils;

/**
 * This is helper class of EligProfileMemberService.
 * 
 * @author Hemant Sharma
 */
@Component
public class EligProfileMemberServiceHelper {
	private static final Logger LOG = LoggerFactory.getLogger(EligProfileMemberServiceHelper.class);

	private static final String REPLACE_IND = "R";
	private static final String DEFAULT_IND = "D";
	private static final String YES = "Y";
	private static final String DEFAULT_CHAR_DB_VAL = "";
	private static final String JAVA_PRG = "JAVA_PRG";
	private static final String TEST_USER = "TEST_USER";

	/**
	 * Helper method to prepare coverage default detail entity from value object
	 * received from user request.
	 * 
	 * @param eligCoverageDefaultDetail
	 * @return
	 */
	public ElgMemberPartdDefaultsEmp prepareMedicareIndicatorsEnity(ElgMemberPartdDefaultsEmp elgMemberPartdDefaultsEmp,
			EligCoverageDefaultDetail eligCoverageDefaultDetail) {
		LOG.info("<<<< enter in EligProfileMemberServiceHelper.prepareMedicareIndicatorsEnity()");
		if (null == elgMemberPartdDefaultsEmp) {
			elgMemberPartdDefaultsEmp = new ElgMemberPartdDefaultsEmp();
			elgMemberPartdDefaultsEmp.setCarCarrierId(eligCoverageDefaultDetail.getCarCarrierId());
			elgMemberPartdDefaultsEmp.setAccountId(eligCoverageDefaultDetail.getAccountId());
			elgMemberPartdDefaultsEmp.setGroupId(eligCoverageDefaultDetail.getGroupId());
			elgMemberPartdDefaultsEmp.setAddDate(eligCoverageDefaultDetail.getChgDate());
			elgMemberPartdDefaultsEmp.setAddTime(eligCoverageDefaultDetail.getChgTime());
			elgMemberPartdDefaultsEmp.setAddProgramName(JAVA_PRG);
			elgMemberPartdDefaultsEmp.setAddUserName(TEST_USER);
		}
		elgMemberPartdDefaultsEmp.setEmpMmdLock(eligCoverageDefaultDetail.getEmpMmdLock());
		elgMemberPartdDefaultsEmp.setEmpContractNumberInd(eligCoverageDefaultDetail.getEmpContractNumberInd());
		elgMemberPartdDefaultsEmp.setEmpContractNumber(DEFAULT_CHAR_DB_VAL);
		elgMemberPartdDefaultsEmp.setEmpContractNumberRepr(eligCoverageDefaultDetail.getEmpContractNumberRepr());
		elgMemberPartdDefaultsEmp.setEmpPbpInd(eligCoverageDefaultDetail.getEmpPbpInd());
		elgMemberPartdDefaultsEmp.setEmpPbp(DEFAULT_CHAR_DB_VAL);
		elgMemberPartdDefaultsEmp.setEmpPbpRepr(eligCoverageDefaultDetail.getEmpPbpRepr());
		elgMemberPartdDefaultsEmp.setEmpContractPbpValidlvl(eligCoverageDefaultDetail.getEmpContractPbpValidlvl());
		elgMemberPartdDefaultsEmp.setEmpSegmentInd(eligCoverageDefaultDetail.getEmpSegmentInd());
		elgMemberPartdDefaultsEmp.setEmpSegment(isDefaultOrReplace(eligCoverageDefaultDetail.getEmpSegmentInd(),
				eligCoverageDefaultDetail.getEmpSegment()));
		elgMemberPartdDefaultsEmp.setEmpSubsidyLevelInd(eligCoverageDefaultDetail.getEmpSubsidyLevelInd());
		elgMemberPartdDefaultsEmp.setEmpSubsidyLevel(isDefaultOrReplace(
				eligCoverageDefaultDetail.getEmpSubsidyLevelInd(), eligCoverageDefaultDetail.getEmpSubsidyLevel()));
		elgMemberPartdDefaultsEmp.setEmpCopayCategoryInd(eligCoverageDefaultDetail.getEmpCopayCategoryInd());
		elgMemberPartdDefaultsEmp.setEmpCopayCategory(isDefaultOrReplace(
				eligCoverageDefaultDetail.getEmpCopayCategoryInd(), eligCoverageDefaultDetail.getEmpCopayCategory()));
		elgMemberPartdDefaultsEmp.setEmpCopayCategoryRepr(eligCoverageDefaultDetail.getEmpCopayCategoryRepr());
		elgMemberPartdDefaultsEmp.setEmpCcategoryEffDteInd(eligCoverageDefaultDetail.getEmpCcategoryEffDteInd());
		elgMemberPartdDefaultsEmp
				.setEmpCcategoryEffDate(parseToSqlDateType(eligCoverageDefaultDetail.getEmpCcategoryEffDate()));
		elgMemberPartdDefaultsEmp.setEmpCcategoryEffDteRep(eligCoverageDefaultDetail.getEmpCcategoryEffDteRep());
		elgMemberPartdDefaultsEmp.setEmpEnrollmentSourceInd(eligCoverageDefaultDetail.getEmpEnrollmentSourceInd());
		elgMemberPartdDefaultsEmp
				.setEmpEnrollmentSource(isDefaultOrReplace(eligCoverageDefaultDetail.getEmpEnrollmentSourceInd(),
						eligCoverageDefaultDetail.getEmpEnrollmentSource()));
		elgMemberPartdDefaultsEmp.setEmpPlanCodeRepr(eligCoverageDefaultDetail.getEmpPlanCodeRepr());
		elgMemberPartdDefaultsEmp.setEmpMsiMedicareHicInd(eligCoverageDefaultDetail.getEmpMsiMedicareHicInd());
		elgMemberPartdDefaultsEmp.setEmpGroupRepr(eligCoverageDefaultDetail.getEmpGroupRepr());
		elgMemberPartdDefaultsEmp.setChgDate(eligCoverageDefaultDetail.getChgDate());
		elgMemberPartdDefaultsEmp.setChgTime(eligCoverageDefaultDetail.getChgTime());
		elgMemberPartdDefaultsEmp.setChgProgramName(JAVA_PRG);
		elgMemberPartdDefaultsEmp.setChgUserName(TEST_USER);
		LOG.info(">>>> exit from EligProfileMemberServiceHelper.prepareMedicareIndicatorsEnity()");
		return elgMemberPartdDefaultsEmp;
	}

	/**
	 * Helper method to prepare coverage default detail entity from value object
	 * received from user request.
	 * 
	 * @param eligCoverageDefaultDetail
	 * @return
	 */
	public ElgMbrOtherCoverageDefaultsEmc prepareOtherCoverageIndicatorsEnity(
			ElgMbrOtherCoverageDefaultsEmc elgMbrOtherCoverageDefaultsEmc,
			EligCoverageDefaultDetail eligCoverageDefaultDetail) {
		LOG.info("<<<< enter in EligProfileMemberServiceHelper.prepareOtherCoverageIndicatorsEnity()");
		if (null == elgMbrOtherCoverageDefaultsEmc) {
			elgMbrOtherCoverageDefaultsEmc = new ElgMbrOtherCoverageDefaultsEmc();
			elgMbrOtherCoverageDefaultsEmc.setCarCarrierId(eligCoverageDefaultDetail.getCarCarrierId());
			elgMbrOtherCoverageDefaultsEmc.setAccountId(eligCoverageDefaultDetail.getAccountId());
			elgMbrOtherCoverageDefaultsEmc.setGroupId(eligCoverageDefaultDetail.getGroupId());
			elgMbrOtherCoverageDefaultsEmc.setAddDate(eligCoverageDefaultDetail.getChgDate());
			elgMbrOtherCoverageDefaultsEmc.setAddTime(eligCoverageDefaultDetail.getChgTime());
			elgMbrOtherCoverageDefaultsEmc.setAddProgramName(JAVA_PRG);
			elgMbrOtherCoverageDefaultsEmc.setAddUserName(TEST_USER);
		}
		elgMbrOtherCoverageDefaultsEmc.setEmcMmcLock(eligCoverageDefaultDetail.getEmcMmcLock());
		elgMbrOtherCoverageDefaultsEmc.setEmcRemoveReproFlag(eligCoverageDefaultDetail.getEmcRemoveReproFlag());
		elgMbrOtherCoverageDefaultsEmc.setEmcBinInd(eligCoverageDefaultDetail.getEmcBinInd());
		elgMbrOtherCoverageDefaultsEmc.setEmcBin(
				isDefaultOrReplace(eligCoverageDefaultDetail.getEmcBinInd(), eligCoverageDefaultDetail.getEmcBin()));
		elgMbrOtherCoverageDefaultsEmc.setEmcBinRepro(eligCoverageDefaultDetail.getEmcBinRepro());
		elgMbrOtherCoverageDefaultsEmc.setEmcPcnInd(eligCoverageDefaultDetail.getEmcPcnInd());
		elgMbrOtherCoverageDefaultsEmc.setEmcPcn(
				isDefaultOrReplace(eligCoverageDefaultDetail.getEmcPcnInd(), eligCoverageDefaultDetail.getEmcPcn()));
		elgMbrOtherCoverageDefaultsEmc.setEmcPcnRepro(eligCoverageDefaultDetail.getEmcPcnRepro());
		elgMbrOtherCoverageDefaultsEmc.setEmcSbmGroupInd(eligCoverageDefaultDetail.getEmcSbmGroupInd());
		elgMbrOtherCoverageDefaultsEmc.setEmcSbmGroup(isDefaultOrReplace(eligCoverageDefaultDetail.getEmcSbmGroupInd(),
				eligCoverageDefaultDetail.getEmcSbmGroup()));
		elgMbrOtherCoverageDefaultsEmc.setEmcSbmGroupRepro(eligCoverageDefaultDetail.getEmcSbmGroupRepro());
		elgMbrOtherCoverageDefaultsEmc.setEmcHelpDeskPhoneInd(eligCoverageDefaultDetail.getEmcHelpDeskPhoneInd());
		if (eligCoverageDefaultDetail.getEmcHelpDeskPhoneInd().equals(REPLACE_IND)
				|| eligCoverageDefaultDetail.getEmcHelpDeskPhoneInd().equals(DEFAULT_IND))
			elgMbrOtherCoverageDefaultsEmc
					.setEmcHelpDeskPhone(removeMaskFrmPhone(eligCoverageDefaultDetail.getEmcHelpDeskPhone()));
		else
			elgMbrOtherCoverageDefaultsEmc.setEmcHelpDeskPhone(0);
		elgMbrOtherCoverageDefaultsEmc
				.setEmcSupplementaltypcdInd(eligCoverageDefaultDetail.getEmcSupplementaltypcdInd());
		elgMbrOtherCoverageDefaultsEmc
				.setEmcSupplementaltypcd(isDefaultOrReplace(eligCoverageDefaultDetail.getEmcSupplementaltypcdInd(),
						eligCoverageDefaultDetail.getEmcSupplementaltypcd()));
		elgMbrOtherCoverageDefaultsEmc
				.setEmcSupplementaltypcdRep(eligCoverageDefaultDetail.getEmcSupplementaltypcdRep());
		elgMbrOtherCoverageDefaultsEmc.setEmcCoverageIdInd(eligCoverageDefaultDetail.getEmcCoverageIdInd());
		elgMbrOtherCoverageDefaultsEmc.setEmcCoverageId(isDefaultOrReplace(
				eligCoverageDefaultDetail.getEmcCoverageIdInd(), eligCoverageDefaultDetail.getEmcCoverageId()));
		elgMbrOtherCoverageDefaultsEmc.setEmcMemberIdInd(eligCoverageDefaultDetail.getEmcMemberIdInd());
		elgMbrOtherCoverageDefaultsEmc.setEmcMemberId(isDefaultOrReplace(eligCoverageDefaultDetail.getEmcMemberIdInd(),
				eligCoverageDefaultDetail.getEmcMemberId()));
		elgMbrOtherCoverageDefaultsEmc.setEmcMemberIdRepro(eligCoverageDefaultDetail.getEmcMemberIdRepro());
		elgMbrOtherCoverageDefaultsEmc.setEmcPersonCodeInd(eligCoverageDefaultDetail.getEmcPersonCodeInd());
		elgMbrOtherCoverageDefaultsEmc.setEmcPersonCode(isDefaultOrReplace(
				eligCoverageDefaultDetail.getEmcPersonCodeInd(), eligCoverageDefaultDetail.getEmcPersonCode()));
		elgMbrOtherCoverageDefaultsEmc.setEmcCoverageCategoryInd(eligCoverageDefaultDetail.getEmcCoverageCategoryInd());
		elgMbrOtherCoverageDefaultsEmc
				.setEmcCoverageCategory(isDefaultOrReplace(eligCoverageDefaultDetail.getEmcCoverageCategoryInd(),
						eligCoverageDefaultDetail.getEmcCoverageCategory()));
		elgMbrOtherCoverageDefaultsEmc.setEmcThruDateReproInd(eligCoverageDefaultDetail.getEmcThruDateReproInd());
		elgMbrOtherCoverageDefaultsEmc.setEmcFromDateReproInd(eligCoverageDefaultDetail.getEmcFromDateReproInd());
		elgMbrOtherCoverageDefaultsEmc.setChgDate(eligCoverageDefaultDetail.getChgDate());
		elgMbrOtherCoverageDefaultsEmc.setChgTime(eligCoverageDefaultDetail.getChgTime());
		elgMbrOtherCoverageDefaultsEmc.setChgProgramName(JAVA_PRG);
		elgMbrOtherCoverageDefaultsEmc.setChgUserName(TEST_USER);
		elgMbrOtherCoverageDefaultsEmc.setEmcFromDateInd(YES);
		elgMbrOtherCoverageDefaultsEmc.setEmcThruDateInd(YES);
		LOG.info(">>>> exit from EligProfileMemberServiceHelper.prepareOtherCoverageIndicatorsEnity()");
		return elgMbrOtherCoverageDefaultsEmc;
	}

	public EligCoverageDefaultDetail populateCoverageDetails(ElgMemberPartdDefaultsEmp elgMemberPartdDefaultsEmp,
			ElgMbrOtherCoverageDefaultsEmc otherCoverageDefaultsEmc) {
		EligCoverageDefaultDetail coverageDefaultDetail = null;
		if (null != elgMemberPartdDefaultsEmp && null != otherCoverageDefaultsEmc) {
			coverageDefaultDetail = new EligCoverageDefaultDetail();
			BeanUtils.copyProperties(elgMemberPartdDefaultsEmp, coverageDefaultDetail);
			coverageDefaultDetail.setEmpCcategoryEffDate(
					DateUtils.convertUtilDateTODateType(elgMemberPartdDefaultsEmp.getEmpCcategoryEffDate()));
			BeanUtils.copyProperties(otherCoverageDefaultsEmc, coverageDefaultDetail);
			coverageDefaultDetail.setEmcHelpDeskPhone(addMaskToPhone(otherCoverageDefaultsEmc.getEmcHelpDeskPhone()));
		}
		return coverageDefaultDetail;
	}

	public EligAltInsuranceDefaultDetail populateAltInsurance(ElgEligMemberDefaultsEmd elgEligMemberDefaultsEmd) {
		EligAltInsuranceDefaultDetail alternateInsuranceDefaultDetailForm = null;
		if (null != elgEligMemberDefaultsEmd) {
			alternateInsuranceDefaultDetailForm = new EligAltInsuranceDefaultDetail();
			BeanUtils.copyProperties(elgEligMemberDefaultsEmd, alternateInsuranceDefaultDetailForm);
			alternateInsuranceDefaultDetailForm
					.setEmdMaiEffDate(DateUtils.convertUtilDateTODateType(elgEligMemberDefaultsEmd.getEmdMaiEffDate()));
			alternateInsuranceDefaultDetailForm.setEmdMaiThruDate(
					DateUtils.convertUtilDateTODateType(elgEligMemberDefaultsEmd.getEmdMaiThruDate()));
		}
		return alternateInsuranceDefaultDetailForm;
	}

	public EligCoverageDefaultDetail parseCoverageFormData(String jsonString)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		EligCoverageDefaultDetail coverageDefaultDetail = mapper.readValue(jsonString,
				new TypeReference<EligCoverageDefaultDetail>() {
				});
		if (null != coverageDefaultDetail) {
			coverageDefaultDetail.setChgDate(DateUtils.currentDate());
			coverageDefaultDetail.setChgTime(DateUtils.currentTime());
		}
		return coverageDefaultDetail;
	}

	private String isDefaultOrReplace(String indicator, String value) {
		String val = DEFAULT_CHAR_DB_VAL;
		if (indicator.equals(DEFAULT_IND) || indicator.equals(REPLACE_IND))
			val = value;
		return val;
	}

	private String addMaskToPhone(long helpDeskPhone) {
		String actualVal = null;
		String changedVal = null;
		if (helpDeskPhone > 0) {
			actualVal = String.valueOf(helpDeskPhone);
			changedVal = actualVal.substring(0, 3);
			changedVal = changedVal.concat("-");
			changedVal = changedVal.concat(actualVal.substring(3, 6));
			changedVal = changedVal.concat("-");
			changedVal = changedVal.concat(actualVal.substring(6));
		}
		return changedVal;
	}

	public EligAltInsuranceDefaultDetail unmarshallAltInsFormData(String jsonString)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		EligAltInsuranceDefaultDetail altInsuranceDefaultDetail = mapper.readValue(jsonString,
				new TypeReference<EligAltInsuranceDefaultDetail>() {
				});

		return altInsuranceDefaultDetail;
	}

	public void prepareAltInsuranceEntity(EligAltInsuranceDefaultDetail altInsuranceDefaultDetail,
			ElgEligMemberDefaultsEmd elgEligMemberDefaultsEmd) {
		Date date = DateUtils.currentDate();
		Time time = DateUtils.currentTime();
		if (null == elgEligMemberDefaultsEmd) {
			LOG.info(
					"prepare entity for Alt Insurance as insert as no existing details were found for given C/A/G cobmination");
			elgEligMemberDefaultsEmd = new ElgEligMemberDefaultsEmd();
			elgEligMemberDefaultsEmd.setCarCarrierId(altInsuranceDefaultDetail.getCarCarrierId());
			elgEligMemberDefaultsEmd.setAccountId(altInsuranceDefaultDetail.getAccountId());
			elgEligMemberDefaultsEmd.setGroupId(altInsuranceDefaultDetail.getGroupId());
			elgEligMemberDefaultsEmd.setAddDate(date);
			elgEligMemberDefaultsEmd.setAddTime(time);
			elgEligMemberDefaultsEmd.setAddProgramName(JAVA_PRG);
			elgEligMemberDefaultsEmd.setAddUserName(TEST_USER);
		}
		elgEligMemberDefaultsEmd.setEmdMaiLock(altInsuranceDefaultDetail.getEmdMaiLock());
		elgEligMemberDefaultsEmd.setEmdMaiEffDateInd(altInsuranceDefaultDetail.getEmdMaiEffDateInd());
		elgEligMemberDefaultsEmd.setEmdMaiEffDate(parseToSqlDateType(altInsuranceDefaultDetail.getEmdMaiEffDate()));
		elgEligMemberDefaultsEmd.setEmdMaiThruDateInd(altInsuranceDefaultDetail.getEmdMaiThruDateInd());
		elgEligMemberDefaultsEmd.setEmdMaiThruDate(parseToSqlDateType(altInsuranceDefaultDetail.getEmdMaiThruDate()));
		elgEligMemberDefaultsEmd.setEmdAlternateInsInd(altInsuranceDefaultDetail.getEmdAlternateInsInd());
		elgEligMemberDefaultsEmd.setEmdAlternateIns(altInsuranceDefaultDetail.getEmdAlternateIns());
		elgEligMemberDefaultsEmd.setEmdAltInsuranceIdInd(altInsuranceDefaultDetail.getEmdAltInsuranceIdInd());
		elgEligMemberDefaultsEmd.setEmdAltInsuranceId(altInsuranceDefaultDetail.getEmdAltInsuranceId());
		elgEligMemberDefaultsEmd.setEmdAltInsCodeInd(altInsuranceDefaultDetail.getEmdAltInsCodeInd());
		elgEligMemberDefaultsEmd.setEmdAltInsCode(altInsuranceDefaultDetail.getEmdAltInsCode());
		elgEligMemberDefaultsEmd.setChgDate(date);
		elgEligMemberDefaultsEmd.setChgTime(time);
		elgEligMemberDefaultsEmd.setChgProgramName(JAVA_PRG);
		elgEligMemberDefaultsEmd.setChgUserName(TEST_USER);
	}

}
