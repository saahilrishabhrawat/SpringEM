package com.optum.rxclaimnextgen.elg.services;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.optum.rxclaimnextgen.elg.entities.*;
import com.optum.rxclaimnextgen.elg.exceptions.ValidationException;
import com.optum.rxclaimnextgen.elg.pojo.EligAltInsuranceDefaultDetail;
import com.optum.rxclaimnextgen.elg.pojo.EligCoverageDefaultDetail;
import com.optum.rxclaimnextgen.elg.pojo.EligGroupDefaultDetail;
import com.optum.rxclaimnextgen.elg.pojo.EligMemberCareAssignDetailForm;
import com.optum.rxclaimnextgen.elg.pojo.EligMemberDefaultDetailsForm;
import com.optum.rxclaimnextgen.elg.pojo.EligMemberHimDefaultOvrDetailForm;
import com.optum.rxclaimnextgen.elg.pojo.EligMemberIncidentDefaultDetailForm;
import com.optum.rxclaimnextgen.elg.pojo.EligMemberOverrideDetailForm;

/**
 * Created by gsharm40 on 06/25/2018.
 */
public interface EligProfileMemberServices {

	public EligMemberHimDefaultOvrDetailForm saveHimDefaultOverrideDetails(String jsonString) throws IOException;

	public EligMemberHimDefaultOvrDetailForm populateHimDefaultsOvrDetailsByPrimaryKey(String carrierId, String accountId, String groupId);

	public ElgEligMemberDefaultsEmd findMemberDefaultsEmdByPrimaryKey(String carCarrierId, String accountId, String groupId);

	public ElgEligMemberDefaultsOvrEmh findMemberDefaultsOvrEmhByPrimaryKey(String carCarrierId, String accountId, String groupId);

	public ElgMemberPartdDefaultsEmp findMemberPartdDefaultsEmpByPrimaryKey(String carCarrierId, String accountId, String groupId);

	public ElgMbrOtherCoverageDefaultsEmc findMbrOtherCovDefaultsByPrimaryKey(String carCarrierId, String accountId, String groupId);

	public ElgEligGroupDefaultsEgd findGroupDefaultsByPrimaryKey(String carCarrierId, String accountId, String groupId);

	/**
	 * Care Assign Methods
	 * @param jsonString
	 * @return
	 * @throws IOException
	 * @throws ValidationException 
	 */
	public EligMemberCareAssignDetailForm saveCareAssignDetails(String jsonString, String platformId) throws IOException, ValidationException, Exception;

	public EligMemberCareAssignDetailForm populateCareAssignDetailsByPrimaryKey(String carrierId, String accountId, String groupId, String platformId ) throws Exception;
	
	public int checkIfMultiplePrescriberIdExists(String platformId, String prescriberId) throws Exception;
	
	/**
	 * Overridedetail Methods
	 * @param jsonString
	 * @return
	 * @throws IOException
	 * @throws ValidationException 
	 */
	public EligMemberOverrideDetailForm saveOverrideDetails(String jsonString) throws IOException, ValidationException, Exception;

	public EligMemberOverrideDetailForm populateOverrideDetailsByPrimaryKey(String carrierId, String accountId, String groupId);
	
	public Boolean checkIfCopayScheduleExists(String platformId, String copayScheduleName, String stepNumber) throws Exception;

	
	/**
	 * Incident Default Detail Form Methods
	 * @param jsonString
	 * @return
	 * @throws IOException
	 * @throws ValidationException 
	 */

	public EligMemberIncidentDefaultDetailForm populateIncidentDefaultDetailByPrimaryKey(String carrierId, String accountId, String groupId);
	
	public ElgEligWCDefaultsEwd saveIncidentDefaultDetail(String jsonString) throws IOException, ValidationException, Exception;
		
	public EligCoverageDefaultDetail saveCoverageDefaultDetail(String jsonString) throws IOException;

	public EligCoverageDefaultDetail fetchCoverageDefaultDetail(String carrierId, String accountId, String groupId);
	
	public EligAltInsuranceDefaultDetail fetchAltInsuranceDefaultDetail(String carrierId, String accountId, String groupId);
	
	public EligAltInsuranceDefaultDetail saveAltInsuranceDefaultDetail(String formData) throws JsonParseException, JsonMappingException, IOException;
	
	public EligMemberDefaultDetailsForm saveMemberDefaultDetails(String jsonString) throws IOException,ValidationException, Exception;

	public EligMemberDefaultDetailsForm populateMemberDefaultDetails(String carrierId, String accountId, String groupId);

}
