package com.optum.rxclaimnextgen.elg.services.profile.groupdetail.impl;

import static com.optum.rxclaimnextgen.elg.utils.Constants.EMPTY_STRING;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.sql.Date;
import java.sql.Time;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.optum.rxclaimnextgen.elg.entities.ElgEligGroupDefaultsEgd;
import com.optum.rxclaimnextgen.elg.exceptions.ValidationException;
import com.optum.rxclaimnextgen.elg.pojo.EligGroupDefaultDetail;
import com.optum.rxclaimnextgen.elg.repositories.ElgEligGroupDefaultsEgdRepository;
import com.optum.rxclaimnextgen.elg.services.NonEligAPIServices;
import com.optum.rxclaimnextgen.elg.services.profile.groupdetail.GroupDefaultDetailService;
import com.optum.rxclaimnextgen.elg.utils.Constants;
import com.optum.rxclaimnextgen.elg.utils.DateUtils;
import com.optum.rxclaimnextgen.elg.utils.Utils;

/**
 *
 * Implementation of group default detail and expose methods to perform get OR
 * save/update operation.
 *
 * @author Hemant Sharma
 *
 */
@Service
public class GroupDefaultDetailServiceImpl implements GroupDefaultDetailService {

	private static final Logger LOG = LoggerFactory.getLogger(GroupDefaultDetailServiceImpl.class);

	@Autowired
	private ElgEligGroupDefaultsEgdRepository elgEligGroupDefaultsEgdRepo;

	@Autowired
	private NonEligAPIServices nonEligAPIServices;

	@Override
	public EligGroupDefaultDetail getGroupDefaultDetailByPrimaryKey(String carrierId, String accountId,
			String groupId) {
		ElgEligGroupDefaultsEgd eligGroupDefaultsEgd = elgEligGroupDefaultsEgdRepo
				.findByCarCarrierIdAndAccountIdAndGroupId(carrierId, accountId, groupId);
		return populateGroupDefaultDetail(eligGroupDefaultsEgd);
	}

	public EligGroupDefaultDetail save(String jsonString) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
		EligGroupDefaultDetail eligGroupDefaultDetail = parseRequestData(jsonString);
		Map<String, String> validationErrors = validate(eligGroupDefaultDetail);
		if (null == validationErrors) {
			eligGroupDefaultDetail = populateGroupDefaultDetail(
					elgEligGroupDefaultsEgdRepo.saveAndFlush(prepareGroupDetailEntity(eligGroupDefaultDetail,
							elgEligGroupDefaultsEgdRepo.findByCarCarrierIdAndAccountIdAndGroupId(
									eligGroupDefaultDetail.getCarCarrierId(), eligGroupDefaultDetail.getAccountId(),
									eligGroupDefaultDetail.getGroupId()))));
		} else
			throw new ValidationException(mapper.writer().writeValueAsString(validationErrors));

		return eligGroupDefaultDetail;
	}

	public ElgEligGroupDefaultsEgd prepareGroupDetailEntity(EligGroupDefaultDetail groupDefaultDetail,
			ElgEligGroupDefaultsEgd elgEligGroupDefaultsEgd) {
		Date date = DateUtils.currentDate();
		Time time = DateUtils.currentTime();
		if (null == elgEligGroupDefaultsEgd) {
			LOG.info(
					"prepare entity for Alt Insurance as insert as no existing details were found for given C/A/G cobmination");
			elgEligGroupDefaultsEgd = new ElgEligGroupDefaultsEgd();
			elgEligGroupDefaultsEgd.setCarCarrierId(groupDefaultDetail.getCarCarrierId());
			elgEligGroupDefaultsEgd.setAccountId(groupDefaultDetail.getAccountId());
			elgEligGroupDefaultsEgd.setGroupId(groupDefaultDetail.getGroupId());
			elgEligGroupDefaultsEgd.setAddDate(date);
			elgEligGroupDefaultsEgd.setAddTime(time);
			elgEligGroupDefaultsEgd.setAddProgramName(Constants.JAVA_PRG);
			elgEligGroupDefaultsEgd.setAddUserName(Constants.TEST_USER);
			// TODO Need to remove NOTNULL from the table DDL but for now set fields value
			// to " " (empty string) as not null constraints added so it won't allow to
			// save/update group default detail.
			setDefaultValue(elgEligGroupDefaultsEgd);
		}
		elgEligGroupDefaultsEgd.setEgdGroupNameInd(groupDefaultDetail.getEgdGroupNameInd());
		elgEligGroupDefaultsEgd.setEgdGroupName(
				Utils.isDefaultOrReplace(groupDefaultDetail.getEgdGroupNameInd()) ? groupDefaultDetail.getEgdGroupName()
						: EMPTY_STRING);
		elgEligGroupDefaultsEgd.setEgdAddressInd(groupDefaultDetail.getEgdAddressInd());
		if (Utils.isDefaultOrReplace(groupDefaultDetail.getEgdAddressInd())
				&& null != groupDefaultDetail.getAddressGroup()) {
			elgEligGroupDefaultsEgd.setEgdAddress1(groupDefaultDetail.getAddressGroup().getEgdAddress1());
			elgEligGroupDefaultsEgd.setEgdAddress2(groupDefaultDetail.getAddressGroup().getEgdAddress2());
			elgEligGroupDefaultsEgd.setEgdCity(groupDefaultDetail.getAddressGroup().getEgdCity());
			elgEligGroupDefaultsEgd.setEgdState(groupDefaultDetail.getAddressGroup().getEgdState());
			elgEligGroupDefaultsEgd.setEgdZip(groupDefaultDetail.getAddressGroup().getEgdZip());
			elgEligGroupDefaultsEgd.setEgdZip2(groupDefaultDetail.getAddressGroup().getEgdZip2());
			elgEligGroupDefaultsEgd.setEgdZip3(groupDefaultDetail.getAddressGroup().getEgdZip3());
			elgEligGroupDefaultsEgd.setEgdCountryCode(groupDefaultDetail.getAddressGroup().getEgdCountryCode());
		} else {
			elgEligGroupDefaultsEgd.setEgdAddress1(EMPTY_STRING);
			elgEligGroupDefaultsEgd.setEgdAddress2(EMPTY_STRING);
			elgEligGroupDefaultsEgd.setEgdCity(EMPTY_STRING);
			elgEligGroupDefaultsEgd.setEgdState(EMPTY_STRING);
			elgEligGroupDefaultsEgd.setEgdZip(EMPTY_STRING);
			elgEligGroupDefaultsEgd.setEgdZip2(EMPTY_STRING);
			elgEligGroupDefaultsEgd.setEgdZip3(EMPTY_STRING);
			elgEligGroupDefaultsEgd.setEgdCountryCode(EMPTY_STRING);
		}
		elgEligGroupDefaultsEgd.setEgdPhoneInd(groupDefaultDetail.getEgdPhoneInd());
		elgEligGroupDefaultsEgd.setEgdPhone(Utils.isDefaultOrReplace(groupDefaultDetail.getEgdPhoneInd())
				? Utils.removeMaskFrmPhone(groupDefaultDetail.getEgdPhone())
				: 0L);
		elgEligGroupDefaultsEgd.setEgdContactInd(groupDefaultDetail.getEgdContactInd());
		elgEligGroupDefaultsEgd.setEgdContact(
				Utils.isDefaultOrReplace(groupDefaultDetail.getEgdContactInd()) ? groupDefaultDetail.getEgdContact()
						: EMPTY_STRING);
		elgEligGroupDefaultsEgd.setEgdRenewalDtInd(groupDefaultDetail.getEgdRenewalDtInd());
		elgEligGroupDefaultsEgd.setEgdRenewalDate(DateUtils.parseToSqlDateType(groupDefaultDetail.getEgdRenewalDate()));
		elgEligGroupDefaultsEgd.setEgdSicCodeInd(groupDefaultDetail.getEgdSicCodeInd());
		elgEligGroupDefaultsEgd.setEgdSicCode(
				Utils.isDefaultOrReplace(groupDefaultDetail.getEgdSicCodeInd()) ? groupDefaultDetail.getEgdSicCode()
						: EMPTY_STRING);
		elgEligGroupDefaultsEgd.setEgdContractDateInd(groupDefaultDetail.getEgdContractDateInd());
		elgEligGroupDefaultsEgd
				.setEgdContractDate(DateUtils.parseToSqlDateType(groupDefaultDetail.getEgdContractDate()));
		elgEligGroupDefaultsEgd.setEgdLanguageCodeInd(groupDefaultDetail.getEgdLanguageCodeInd());
		elgEligGroupDefaultsEgd.setEgdLanguageCode(Utils.isDefaultOrReplace(groupDefaultDetail.getEgdLanguageCodeInd())
				? groupDefaultDetail.getEgdLanguageCode()
				: EMPTY_STRING);
		elgEligGroupDefaultsEgd.setEgdSuppressPlanMsgInd(groupDefaultDetail.getEgdSuppressPlanMsgInd());
		elgEligGroupDefaultsEgd.setEgdEffDateInd(groupDefaultDetail.getEgdEffDateInd());
		elgEligGroupDefaultsEgd
				.setEgdEffectiveDate(DateUtils.parseToSqlDateType(groupDefaultDetail.getEgdEffectiveDate()));
		elgEligGroupDefaultsEgd.setEgdThruDateInd(groupDefaultDetail.getEgdThruDateInd());
		elgEligGroupDefaultsEgd.setEgdThruDate(
				DateUtils.parseToSqlDateType(groupDefaultDetail.getThruDateDaysGroup().getEgdThruDate()));
		elgEligGroupDefaultsEgd.setEgdThruDays((Utils.isDefaultOrReplace(groupDefaultDetail.getEgdThruDateInd())
				&& StringUtils.isNotBlank(groupDefaultDetail.getThruDateDaysGroup().getEgdThruDays()))
						? Integer.parseInt(groupDefaultDetail.getThruDateDaysGroup().getEgdThruDays())
						: 0);
		elgEligGroupDefaultsEgd.setEgdBrandCopayInd(groupDefaultDetail.getEgdBrandCopayInd());
		elgEligGroupDefaultsEgd.setEgdBrandCopay(Utils.isDefaultOrReplace(groupDefaultDetail.getEgdBrandCopayInd())
				? new BigDecimal(groupDefaultDetail.getEgdBrandCopay())
				: new BigDecimal(0));
		elgEligGroupDefaultsEgd.setEgdGenericInd(groupDefaultDetail.getEgdGenericInd());
		elgEligGroupDefaultsEgd.setEgdGenericCopay(Utils.isDefaultOrReplace(groupDefaultDetail.getEgdGenericInd())
				? new BigDecimal(groupDefaultDetail.getEgdGenericCopay())
				: new BigDecimal(0));
		elgEligGroupDefaultsEgd.setEgdCopay3Ind(groupDefaultDetail.getEgdCopay3Ind());
		elgEligGroupDefaultsEgd.setEgdCopay3(Utils.isDefaultOrReplace(groupDefaultDetail.getEgdCopay3Ind())
				? new BigDecimal(groupDefaultDetail.getEgdCopay3())
				: new BigDecimal(0));
		elgEligGroupDefaultsEgd.setEgdCopay4Ind(groupDefaultDetail.getEgdCopay4Ind());
		elgEligGroupDefaultsEgd.setEgdCopay4(Utils.isDefaultOrReplace(groupDefaultDetail.getEgdCopay4Ind())
				? new BigDecimal(groupDefaultDetail.getEgdCopay4())
				: new BigDecimal(0));
		elgEligGroupDefaultsEgd.setEgdCopay5Ind(groupDefaultDetail.getEgdCopay5Ind());
		elgEligGroupDefaultsEgd.setEgdCopay5(Utils.isDefaultOrReplace(groupDefaultDetail.getEgdCopay5Ind())
				? new BigDecimal(groupDefaultDetail.getEgdCopay5())
				: new BigDecimal(0));
		elgEligGroupDefaultsEgd.setEgdCopay6Ind(groupDefaultDetail.getEgdCopay6Ind());
		elgEligGroupDefaultsEgd.setEgdCopay6(Utils.isDefaultOrReplace(groupDefaultDetail.getEgdCopay6Ind())
				? new BigDecimal(groupDefaultDetail.getEgdCopay6())
				: new BigDecimal(0));
		elgEligGroupDefaultsEgd.setEgdCopay7Ind(groupDefaultDetail.getEgdCopay7Ind());
		elgEligGroupDefaultsEgd.setEgdCopay7(Utils.isDefaultOrReplace(groupDefaultDetail.getEgdCopay7Ind())
				? new BigDecimal(groupDefaultDetail.getEgdCopay7())
				: new BigDecimal(0));
		elgEligGroupDefaultsEgd.setEgdCopay8Ind(groupDefaultDetail.getEgdCopay8Ind());
		elgEligGroupDefaultsEgd.setEgdCopay8(Utils.isDefaultOrReplace(groupDefaultDetail.getEgdCopay8Ind())
				? new BigDecimal(groupDefaultDetail.getEgdCopay8())
				: new BigDecimal(0));
		elgEligGroupDefaultsEgd.setEgdBenefitCdInd(groupDefaultDetail.getEgdBenefitCdInd());
		elgEligGroupDefaultsEgd.setEgdBenefitCode1(Utils.isDefaultOrReplace(groupDefaultDetail.getEgdBenefitCdInd())
				? groupDefaultDetail.getEgdBenefitCode1()
				: EMPTY_STRING);
		elgEligGroupDefaultsEgd.setEgdPlanInd(groupDefaultDetail.getEgdPlanInd());
		elgEligGroupDefaultsEgd.setPlanCode(Utils.isDefaultOrReplace(groupDefaultDetail.getEgdPlanInd())
				? groupDefaultDetail.getPlanCodeDateGroup().getPlanCode()
				: EMPTY_STRING);
		elgEligGroupDefaultsEgd.setPlanEffDate(
				DateUtils.parseToSqlDateType(groupDefaultDetail.getPlanCodeDateGroup().getPlanEffDate()));
		elgEligGroupDefaultsEgd.setEgdPlanEligValidation(groupDefaultDetail.getEgdPlanEligValidation());
		elgEligGroupDefaultsEgd.setChgDate(date);
		elgEligGroupDefaultsEgd.setChgTime(time);
		elgEligGroupDefaultsEgd.setChgProgramName(Constants.JAVA_PRG);
		elgEligGroupDefaultsEgd.setChgUserName(Constants.TEST_USER);
		return elgEligGroupDefaultsEgd;
	}

	private void setDefaultValue(ElgEligGroupDefaultsEgd egd) {
		egd.setEgdRenewalDteValidate(EMPTY_STRING);
		egd.setEgdCardLogoInd(EMPTY_STRING);
		egd.setEgdCardLogo(EMPTY_STRING);
		egd.setEgdCardDataInd(EMPTY_STRING);
		egd.setEgdAltAddrCode(EMPTY_STRING);
		egd.setEgdCardText1Ind(EMPTY_STRING);
		egd.setEgdCardText1(EMPTY_STRING);
		egd.setEgdCardText2Ind(EMPTY_STRING);
		egd.setEgdCardText2(EMPTY_STRING);
		egd.setEgdCardText3Ind(EMPTY_STRING);
		egd.setEgdCardText3(EMPTY_STRING);
		egd.setEgdCardText4Ind(EMPTY_STRING);
		egd.setEgdCardText4(EMPTY_STRING);
		egd.setEgdDepAgeFromDateInd(EMPTY_STRING);
		egd.setEgdDepAgeFromDate(DateUtils.getDefaultValueWhenDateIsNull());
		egd.setEgdDepAgeThruDateInd(EMPTY_STRING);
		egd.setEgdDepAgeThruDate(DateUtils.getDefaultValueWhenDateIsNull());
		egd.setEgdDepAgeMax(new BigInteger("0"));
		egd.setEgdDepDateQualifier(EMPTY_STRING);
		egd.setEgdDepEligibilityQual(EMPTY_STRING);
		egd.setEgdStudentAgeMax(new BigInteger("0"));
		egd.setEgdStudentAgeDateQual(EMPTY_STRING);
		egd.setEgdStudentAgeEligQual(EMPTY_STRING);
		egd.setEgdOtherAge(new BigInteger("0"));
		egd.setEgdOtherDateQualifier(EMPTY_STRING);
		egd.setEgdOtherEligQualifier(EMPTY_STRING);
		egd.setEgdClientDefindDataIn(EMPTY_STRING);
	}

	public EligGroupDefaultDetail populateGroupDefaultDetail(ElgEligGroupDefaultsEgd eligGroupDefaultsEgd) {
		EligGroupDefaultDetail groupDefaultDetail = null;
		if (null != eligGroupDefaultsEgd) {
			groupDefaultDetail = new EligGroupDefaultDetail();
			groupDefaultDetail.setCarCarrierId(eligGroupDefaultsEgd.getCarCarrierId());
			groupDefaultDetail.setAccountId(eligGroupDefaultsEgd.getAccountId());
			groupDefaultDetail.setGroupId(eligGroupDefaultsEgd.getGroupId());
			groupDefaultDetail.setEgdGroupNameInd(eligGroupDefaultsEgd.getEgdGroupNameInd());
			groupDefaultDetail.setEgdGroupName(eligGroupDefaultsEgd.getEgdGroupName());
			groupDefaultDetail.setEgdAddressInd(eligGroupDefaultsEgd.getEgdAddressInd());
			groupDefaultDetail.getAddressGroup().setEgdAddress1(eligGroupDefaultsEgd.getEgdAddress1());
			groupDefaultDetail.getAddressGroup().setEgdAddress2(eligGroupDefaultsEgd.getEgdAddress2());
			groupDefaultDetail.getAddressGroup().setEgdCity(eligGroupDefaultsEgd.getEgdCity());
			groupDefaultDetail.getAddressGroup().setEgdState(eligGroupDefaultsEgd.getEgdState());
			groupDefaultDetail.getAddressGroup().setEgdZip(eligGroupDefaultsEgd.getEgdZip());
			groupDefaultDetail.getAddressGroup().setEgdZip2(eligGroupDefaultsEgd.getEgdZip2());
			groupDefaultDetail.getAddressGroup().setEgdZip3(eligGroupDefaultsEgd.getEgdZip3());
			groupDefaultDetail.getAddressGroup().setEgdCountryCode(eligGroupDefaultsEgd.getEgdCountryCode());
			groupDefaultDetail.setEgdPhoneInd(eligGroupDefaultsEgd.getEgdPhoneInd());
			groupDefaultDetail.setEgdPhone(String.valueOf(eligGroupDefaultsEgd.getEgdPhone()));
			groupDefaultDetail.setEgdContactInd(eligGroupDefaultsEgd.getEgdContactInd());
			groupDefaultDetail.setEgdContact(eligGroupDefaultsEgd.getEgdContact());
			groupDefaultDetail.setEgdRenewalDtInd(eligGroupDefaultsEgd.getEgdRenewalDtInd());
			groupDefaultDetail
					.setEgdRenewalDate(DateUtils.convertUtilDateTODateType(eligGroupDefaultsEgd.getEgdRenewalDate()));
			groupDefaultDetail.setEgdSicCodeInd(eligGroupDefaultsEgd.getEgdSicCodeInd());
			groupDefaultDetail.setEgdSicCode(eligGroupDefaultsEgd.getEgdSicCode());
			groupDefaultDetail.setEgdContractDateInd(eligGroupDefaultsEgd.getEgdContractDateInd());
			groupDefaultDetail
					.setEgdContractDate(DateUtils.convertUtilDateTODateType(eligGroupDefaultsEgd.getEgdContractDate()));
			groupDefaultDetail.setEgdLanguageCodeInd(eligGroupDefaultsEgd.getEgdLanguageCodeInd());
			groupDefaultDetail.setEgdLanguageCode(eligGroupDefaultsEgd.getEgdLanguageCode());
			groupDefaultDetail.setEgdSuppressPlanMsgInd(eligGroupDefaultsEgd.getEgdSuppressPlanMsgInd());
			groupDefaultDetail.setEgdEffDateInd(eligGroupDefaultsEgd.getEgdEffDateInd());
			groupDefaultDetail.setEgdEffectiveDate(
					DateUtils.convertUtilDateTODateType(eligGroupDefaultsEgd.getEgdEffectiveDate()));
			groupDefaultDetail.setEgdThruDateInd(eligGroupDefaultsEgd.getEgdThruDateInd());
			groupDefaultDetail.getThruDateDaysGroup()
					.setEgdThruDate(DateUtils.convertUtilDateTODateType(eligGroupDefaultsEgd.getEgdThruDate()));
			groupDefaultDetail.getThruDateDaysGroup()
					.setEgdThruDays(String.valueOf(eligGroupDefaultsEgd.getEgdThruDays()));
			groupDefaultDetail.setEgdBrandCopayInd(eligGroupDefaultsEgd.getEgdBrandCopayInd());
			groupDefaultDetail.setEgdBrandCopay(String.valueOf(eligGroupDefaultsEgd.getEgdBrandCopay()));
			groupDefaultDetail.setEgdGenericInd(eligGroupDefaultsEgd.getEgdGenericInd());
			groupDefaultDetail.setEgdGenericCopay(String.valueOf(eligGroupDefaultsEgd.getEgdGenericCopay()));
			groupDefaultDetail.setEgdCopay3Ind(eligGroupDefaultsEgd.getEgdCopay3Ind());
			groupDefaultDetail.setEgdCopay3(String.valueOf(eligGroupDefaultsEgd.getEgdCopay3()));
			groupDefaultDetail.setEgdCopay4Ind(eligGroupDefaultsEgd.getEgdCopay4Ind());
			groupDefaultDetail.setEgdCopay4(String.valueOf(eligGroupDefaultsEgd.getEgdCopay4()));
			groupDefaultDetail.setEgdCopay5Ind(eligGroupDefaultsEgd.getEgdCopay5Ind());
			groupDefaultDetail.setEgdCopay5(String.valueOf(eligGroupDefaultsEgd.getEgdCopay5()));
			groupDefaultDetail.setEgdCopay6Ind(eligGroupDefaultsEgd.getEgdCopay6Ind());
			groupDefaultDetail.setEgdCopay6(String.valueOf(eligGroupDefaultsEgd.getEgdCopay6()));
			groupDefaultDetail.setEgdCopay7Ind(eligGroupDefaultsEgd.getEgdCopay7Ind());
			groupDefaultDetail.setEgdCopay7(String.valueOf(eligGroupDefaultsEgd.getEgdCopay7()));
			groupDefaultDetail.setEgdCopay8Ind(eligGroupDefaultsEgd.getEgdCopay8Ind());
			groupDefaultDetail.setEgdCopay8(String.valueOf(eligGroupDefaultsEgd.getEgdCopay8()));
			groupDefaultDetail.setEgdBenefitCdInd(eligGroupDefaultsEgd.getEgdBenefitCdInd());
			groupDefaultDetail.setEgdBenefitCode1(eligGroupDefaultsEgd.getEgdBenefitCode1());
			groupDefaultDetail.setEgdPlanInd(eligGroupDefaultsEgd.getEgdPlanInd());
			groupDefaultDetail.getPlanCodeDateGroup().setPlanCode(eligGroupDefaultsEgd.getPlanCode());
			groupDefaultDetail.getPlanCodeDateGroup()
					.setPlanEffDate(DateUtils.convertUtilDateTODateType(eligGroupDefaultsEgd.getPlanEffDate()));
			groupDefaultDetail.setEgdPlanEligValidation(eligGroupDefaultsEgd.getEgdPlanEligValidation());

			groupDefaultDetail.setAddDate(DateUtils.convertDateToString(eligGroupDefaultsEgd.getAddDate()));
			groupDefaultDetail.setAddTime(
					eligGroupDefaultsEgd.getAddTime() != null ? eligGroupDefaultsEgd.getAddTime().toString() : null);
			groupDefaultDetail.setAddUserName(eligGroupDefaultsEgd.getAddUserName());
			groupDefaultDetail.setAddProgramName(eligGroupDefaultsEgd.getAddProgramName());
			groupDefaultDetail.setChgDate(DateUtils.convertDateToString(eligGroupDefaultsEgd.getChgDate()));
			groupDefaultDetail.setChgTime(
					eligGroupDefaultsEgd.getAddTime() != null ? eligGroupDefaultsEgd.getChgTime().toString() : null);
			groupDefaultDetail.setChgUserName(eligGroupDefaultsEgd.getChgUserName());
			groupDefaultDetail.setChgProgramName(eligGroupDefaultsEgd.getChgProgramName());
			groupDefaultDetail.setEgdLanguageCode(eligGroupDefaultsEgd.getEgdLanguageCode());
			groupDefaultDetail.setEgdSuppressPlanMsgInd(eligGroupDefaultsEgd.getEgdSuppressPlanMsgInd());
		}
		return groupDefaultDetail;
	}

	private Map<String, String> validate(EligGroupDefaultDetail eligGroupDefaultDetail) throws Exception {
		Map<String, String> validationErrors = null;
		if (Utils.isDefaultOrReplace(eligGroupDefaultDetail.getEgdPlanInd())
				&& StringUtils.isNotBlank(eligGroupDefaultDetail.getPlanCodeDateGroup().getPlanCode())
				&& !eligGroupDefaultDetail.getPlanCodeDateGroup().getPlanCode().equals(Constants.DEFAULT_PLAN_CODE)) {
			java.sql.Date sqlPlanEffDate = DateUtils
					.parseToSqlDateType(eligGroupDefaultDetail.getPlanCodeDateGroup().getPlanEffDate());
			String strPlanEffDate = DateUtils.convertDateToString(sqlPlanEffDate);
			int intPlanEffDate = DateUtils.convertDateToCenturyDate(strPlanEffDate);
			String result = findPlanByPlanCodeAndEffDate(intPlanEffDate,
					eligGroupDefaultDetail.getPlanCodeDateGroup().getPlanCode(),
					eligGroupDefaultDetail.getPlatformId());
			if (result == null) {
				validationErrors = new HashMap<String, String>();
				validationErrors.put("invalidPlanCode", "Plan code not valid");
			}
		}
		return validationErrors;
	}

	public String findPlanByPlanCodeAndEffDate(int planEffDate, String planCode, String platformId) throws Exception {
		String api = "/getPlanByPlanCodeAndEffDate?efd=" + planEffDate + "&pc="
				+ URLEncoder.encode(planCode.trim(), "UTF-8");
		String result = nonEligAPIServices.callNonEligDataService(platformId, api);
		return result;
	}

	public EligGroupDefaultDetail parseRequestData(String jsonString)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		EligGroupDefaultDetail eligGroupDefaultDetail = mapper.readValue(jsonString,
				new TypeReference<EligGroupDefaultDetail>() {
				});
		return eligGroupDefaultDetail;
	}

}
