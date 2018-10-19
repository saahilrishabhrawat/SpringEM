package com.optum.rxclaimnextgen.elg.services.profile.errorTolerance.impl;

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
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.optum.rxclaimnextgen.elg.entities.ElgEccToleranceCheckCtl;
import com.optum.rxclaimnextgen.elg.exceptions.ValidationException;
import com.optum.rxclaimnextgen.elg.pojo.EligErrorToleranceControl;
import com.optum.rxclaimnextgen.elg.repositories.profile.ElgEccToleranceCheckCtlRepository;
import com.optum.rxclaimnextgen.elg.services.NonEligAPIServices;
import com.optum.rxclaimnextgen.elg.services.profile.errorTolerance.ErrorToleranceControlService;
import com.optum.rxclaimnextgen.elg.utils.Constants;
import com.optum.rxclaimnextgen.elg.utils.DateUtils;

@Service
public class ErrorToleranceControlServiceImpl implements ErrorToleranceControlService {

	private static final Logger LOG = LoggerFactory.getLogger(ErrorToleranceControlServiceImpl.class);

	@Autowired
	private ElgEccToleranceCheckCtlRepository elgEccToleranceCheckCtlRepository;

	@Autowired
	private NonEligAPIServices nonEligAPIServices;

	@Override
	public EligErrorToleranceControl findByCarCarrierIdAndAccountIdAndGroupId(String carCarrierId, String accountId,
			String groupId) {
		LOG.info("enter in findByCarCarrierIdAndAccountIdAndGroupId()");
		ElgEccToleranceCheckCtl eccToleranceCheckCtl = elgEccToleranceCheckCtlRepository
				.findByCarCarrierIdAndAccountIdAndGroupId(carCarrierId, accountId, groupId);
		LOG.info("about to call prepareResponse() and return response");
		return prepareResponse(eccToleranceCheckCtl);
	}

	private EligErrorToleranceControl prepareResponse(ElgEccToleranceCheckCtl eccToleranceCheckCtl) {
		LOG.info("enter in prepareResponse()");
		EligErrorToleranceControl errorToleranceControl = null;
		if (null != eccToleranceCheckCtl) {
			errorToleranceControl = new EligErrorToleranceControl();
			errorToleranceControl.setCarCarrierId(eccToleranceCheckCtl.getCarCarrierId());
			errorToleranceControl.setAccountId(eccToleranceCheckCtl.getAccountId());
			errorToleranceControl.setGroupId(eccToleranceCheckCtl.getGroupId());
			errorToleranceControl.setEccEnableToleranceChk(eccToleranceCheckCtl.getEccEnableToleranceChk());
			errorToleranceControl.setEccAlwaysSuspAftrStaging(eccToleranceCheckCtl.getEccAlwaysSuspAftrStaging());
			errorToleranceControl.setEccLengthOfMemberId(String.valueOf(eccToleranceCheckCtl.getEccLengthOfMemberId()));
			errorToleranceControl.setEccEmailDistributionLst(eccToleranceCheckCtl.getEccEmailDistributionLst());
			errorToleranceControl.setEccPerfrmExplctTrmChk(eccToleranceCheckCtl.getEccPerfrmExplctTrmChk());
			errorToleranceControl
					.setEccPercntForExplctTrmChk(String.valueOf(eccToleranceCheckCtl.getEccPercntForExplctTrmChk()));
			errorToleranceControl.setEccPerformRetroTrmChk(eccToleranceCheckCtl.getEccPerformRetroTrmChk());
			errorToleranceControl
					.setEccPercentForRetroTrmChk(String.valueOf(eccToleranceCheckCtl.getEccPercentForRetroTrmChk()));
			errorToleranceControl
					.setEccMinNbrInpRcdTrgTolChk(String.valueOf(eccToleranceCheckCtl.getEccMinNbrInpRcdTrgTolChk()));
			errorToleranceControl.setEccPrimaryEligAnalyst(eccToleranceCheckCtl.getEccPrimaryEligAnalyst());
			errorToleranceControl.setEccSecondryEligAnalyst(eccToleranceCheckCtl.getEccSecondryEligAnalyst());
			errorToleranceControl
					.setEccSuspFileCndChkDlyMin(String.valueOf(eccToleranceCheckCtl.getEccSuspFileCndChkDlyMin()));
			errorToleranceControl.setAddDate(String.valueOf(eccToleranceCheckCtl.getAddDate()));
			errorToleranceControl.setAddTime(String.valueOf(eccToleranceCheckCtl.getAddTime()));
			errorToleranceControl.setAddUserName(eccToleranceCheckCtl.getAddUserName());
			errorToleranceControl.setAddProgramName(eccToleranceCheckCtl.getAddProgramName());
			errorToleranceControl.setChgDate(DateUtils.convertDateToString(eccToleranceCheckCtl.getChgDate()));
			errorToleranceControl.setChgTime(String.valueOf(eccToleranceCheckCtl.getChgTime()));
			errorToleranceControl.setChgUserName(eccToleranceCheckCtl.getChgUserName());
			errorToleranceControl.setChgProgramName(eccToleranceCheckCtl.getChgProgramName());

		}
		LOG.info("return error tolerance response");
		return errorToleranceControl;
	}

	private ElgEccToleranceCheckCtl prepareEntity(EligErrorToleranceControl eligErrorToleranceControl,
			ElgEccToleranceCheckCtl eccToleranceCheckCtl) {
		LOG.info("enter in prepareEntity()");
		Date date = DateUtils.currentDate();
		Time time = DateUtils.currentTime();
		if (null == eccToleranceCheckCtl) {
			eccToleranceCheckCtl = new ElgEccToleranceCheckCtl();
			eccToleranceCheckCtl.setCarCarrierId(eligErrorToleranceControl.getCarCarrierId());
			eccToleranceCheckCtl.setAccountId(eligErrorToleranceControl.getAccountId());
			eccToleranceCheckCtl.setGroupId(eligErrorToleranceControl.getGroupId());
			eccToleranceCheckCtl.setAddDate(date);
			eccToleranceCheckCtl.setAddProgramName(Constants.JAVA_PRG);
			eccToleranceCheckCtl.setAddTime(time);
			eccToleranceCheckCtl.setAddUserName(Constants.TEST_USER);
		}
		eccToleranceCheckCtl.setEccAlwaysSuspAftrStaging(eligErrorToleranceControl.getEccAlwaysSuspAftrStaging());
		eccToleranceCheckCtl.setEccPrimaryEligAnalyst(eligErrorToleranceControl.getEccPrimaryEligAnalyst());
		if (StringUtils.isNotBlank(eligErrorToleranceControl.getEccSecondryEligAnalyst()))
			eccToleranceCheckCtl.setEccSecondryEligAnalyst(eligErrorToleranceControl.getEccSecondryEligAnalyst());
		else
			eccToleranceCheckCtl.setEccSecondryEligAnalyst(Constants.EMPTY_STRING);

		eccToleranceCheckCtl.setEccEmailDistributionLst(eligErrorToleranceControl.getEccEmailDistributionLst());

		eccToleranceCheckCtl
				.setEccSuspFileCndChkDlyMin(Integer.parseInt(eligErrorToleranceControl.getEccSuspFileCndChkDlyMin()));

		eccToleranceCheckCtl.setEccEnableToleranceChk(eligErrorToleranceControl.getEccEnableToleranceChk());

		if (StringUtils.isNotBlank(eligErrorToleranceControl.getEccMinNbrInpRcdTrgTolChk()))
			eccToleranceCheckCtl.setEccMinNbrInpRcdTrgTolChk(
					Integer.parseInt(eligErrorToleranceControl.getEccMinNbrInpRcdTrgTolChk()));
		else
			eccToleranceCheckCtl.setEccMinNbrInpRcdTrgTolChk(0);

		if (StringUtils.isNotBlank(eligErrorToleranceControl.getEccLengthOfMemberId()))
			eccToleranceCheckCtl
					.setEccLengthOfMemberId(new BigInteger(eligErrorToleranceControl.getEccLengthOfMemberId()));
		else
			eccToleranceCheckCtl.setEccLengthOfMemberId(new BigInteger("0"));

		if (StringUtils.isNotBlank(eligErrorToleranceControl.getEccPerformRetroTrmChk()))
			eccToleranceCheckCtl.setEccPerformRetroTrmChk(eligErrorToleranceControl.getEccPerformRetroTrmChk());
		else
			eccToleranceCheckCtl.setEccPerformRetroTrmChk(Constants.EMPTY_STRING);

		if (StringUtils.isNotBlank(eligErrorToleranceControl.getEccPercentForRetroTrmChk()))
			eccToleranceCheckCtl.setEccPercentForRetroTrmChk(
					new BigDecimal(eligErrorToleranceControl.getEccPercentForRetroTrmChk()));
		else
			eccToleranceCheckCtl.setEccPercentForRetroTrmChk(new BigDecimal("0"));

		if (StringUtils.isNotBlank(eligErrorToleranceControl.getEccPerfrmExplctTrmChk()))
			eccToleranceCheckCtl.setEccPerfrmExplctTrmChk(eligErrorToleranceControl.getEccPerfrmExplctTrmChk());
		else
			eccToleranceCheckCtl.setEccPerfrmExplctTrmChk(Constants.EMPTY_STRING);

		if (StringUtils.isNotBlank(eligErrorToleranceControl.getEccPercntForExplctTrmChk()))
			eccToleranceCheckCtl.setEccPercntForExplctTrmChk(
					new BigDecimal(eligErrorToleranceControl.getEccPercntForExplctTrmChk()));
		else
			eccToleranceCheckCtl.setEccPercntForExplctTrmChk(new BigDecimal("0"));

		eccToleranceCheckCtl.setChgDate(date);
		eccToleranceCheckCtl.setChgProgramName(Constants.JAVA_PRG);
		eccToleranceCheckCtl.setChgTime(time);
		eccToleranceCheckCtl.setChgUserName(Constants.TEST_USER);
		LOG.info("exit from error tolerance prepareEntity()");
		return eccToleranceCheckCtl;
	}

	public EligErrorToleranceControl parseRequestData(String jsonString)
			throws JsonParseException, JsonMappingException, IOException {
		LOG.info("enter in error tolerance parseRequestData() methos");
		ObjectMapper mapper = new ObjectMapper();
		EligErrorToleranceControl eligErrorToleranceControl = mapper.readValue(jsonString,
				new TypeReference<EligErrorToleranceControl>() {
				});
		LOG.info("exit in error tolerance parseRequestData() methos");
		return eligErrorToleranceControl;
	}

	@Override
	public void save(String jsonString) throws Exception {
		LOG.info("enter in error tolerance save() methos");
		ObjectMapper mapper = new ObjectMapper();
		EligErrorToleranceControl eligErrorToleranceControl = parseRequestData(jsonString);
		ElgEccToleranceCheckCtl eccToleranceCheckCtl = elgEccToleranceCheckCtlRepository
				.findByCarCarrierIdAndAccountIdAndGroupId(eligErrorToleranceControl.getCarCarrierId(),
						eligErrorToleranceControl.getAccountId(), eligErrorToleranceControl.getGroupId());
		LOG.info("about to call error tolerance validate() method");
		Map<String, String> validationErrors = validate(eligErrorToleranceControl.getEccEmailDistributionLst(),
				eligErrorToleranceControl.getPlatformId());
		if (null == validationErrors) {
			elgEccToleranceCheckCtlRepository
					.saveAndFlush(prepareEntity(eligErrorToleranceControl, eccToleranceCheckCtl));
		} else
			throw new ValidationException(mapper.writer().writeValueAsString(validationErrors));
		LOG.info("exit from error tolerance save() methos");
	}

	private Map<String, String> validate(String emailDistributionLst, String platformId) throws Exception {
		LOG.info("enter in error tolerance validate() method");
		Map<String, String> validationErrors = null;
		String api = "/getEmailDistributionList?emailListId="
				+ URLEncoder.encode(StringUtils.trim(emailDistributionLst), "UTF-8");
		String result = nonEligAPIServices.callNonEligDataService(platformId, api);
		if (StringUtils.isBlank(result)) {
			validationErrors = new HashMap<>();
			validationErrors.put("eccEmailDistributionLst", "List not found");
		}
		LOG.info("exit in error tolerance validate() method");
		return validationErrors;
	}
}
