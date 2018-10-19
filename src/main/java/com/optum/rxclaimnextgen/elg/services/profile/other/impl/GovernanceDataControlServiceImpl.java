package com.optum.rxclaimnextgen.elg.services.profile.other.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.optum.rxclaimnextgen.elg.entities.ElgEligDataGovernanceEdg;
import com.optum.rxclaimnextgen.elg.exceptions.ValidationException;
import com.optum.rxclaimnextgen.elg.pojo.EligGovernanceDataControl;
import com.optum.rxclaimnextgen.elg.services.NonEligAPIServices;
import com.optum.rxclaimnextgen.elg.services.profile.other.GovernanceDataControlService;
import com.optum.rxclaimnextgen.elg.utils.DateUtils;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.optum.rxclaimnextgen.elg.repositories.profile.ElgEligDataGovernanceEdgRepository;

@Service
public class GovernanceDataControlServiceImpl implements GovernanceDataControlService {

    private static final Logger LOG = LoggerFactory.getLogger(GovernanceDataControlServiceImpl.class);

    @Autowired
    private NonEligAPIServices nonEligAPIServices;

    @Autowired
    ElgEligDataGovernanceEdgRepository elgEligDataGovernanceEdgRepository;

    @Override
    public ElgEligDataGovernanceEdg findByCarCarrierIdAndAccountIdAndGroupId(String carCarrierId, String accountId, String groupId) {
        return elgEligDataGovernanceEdgRepository.findByCarCarrierIdAndAccountIdAndGroupId(carCarrierId, accountId, groupId);
    }
    
	private HashMap<String, String> validateEligDataGovernanceForm(EligGovernanceDataControl formData) throws Exception {
		
		HashMap validationErrors = new HashMap<String, String>();					
		boolean foundAnError = false;         
		String edgEmailDistListId = formData.getEdgEmailDistListId();
        
       if(!StringUtils.isEmpty(edgEmailDistListId)){
		String result = checkEmailNotificationList(formData.getPlatformId(), edgEmailDistListId);
        if (StringUtils.isBlank(result)) {
        	validationErrors.put("edgEmailDistListId", "List not found");
            foundAnError = true;
        } 
       }
        return validationErrors;
	}
	
	private ElgEligDataGovernanceEdg prepareEligDataGovernanceEntity(ElgEligDataGovernanceEdg elgEligDataGovernanceEdg,
			EligGovernanceDataControl eligGovernanceDataControl) {
		if (null == elgEligDataGovernanceEdg) {
			elgEligDataGovernanceEdg = new ElgEligDataGovernanceEdg();
			elgEligDataGovernanceEdg.setCarCarrierId(eligGovernanceDataControl.getCarCarrierId());
			elgEligDataGovernanceEdg.setAccountId(eligGovernanceDataControl.getAccountId());
			elgEligDataGovernanceEdg.setGroupId(eligGovernanceDataControl.getGroupId());
			elgEligDataGovernanceEdg.setAddDate(DateUtils.currentDate());
			elgEligDataGovernanceEdg.setAddTime(DateUtils.currentTime());
			elgEligDataGovernanceEdg.setAddProgramName("JAVA_PRG");
			elgEligDataGovernanceEdg.setAddUserName("TEST_USER");
		}
		elgEligDataGovernanceEdg.setEdgEligibilityMbrMatch(eligGovernanceDataControl.getEdgEligibilityMbrMatch());
		elgEligDataGovernanceEdg.setEdgExternalEligUpdate(eligGovernanceDataControl.getEdgExternalEligUpdate());
		elgEligDataGovernanceEdg.setEdgEmailDistListId(eligGovernanceDataControl.getEdgEmailDistListId());
	
		// TODO
	
		elgEligDataGovernanceEdg.setChgDate(DateUtils.currentDate());
		elgEligDataGovernanceEdg.setChgTime(DateUtils.currentTime());
		elgEligDataGovernanceEdg.setChgProgramName("JAVA_PRG");
		elgEligDataGovernanceEdg.setChgUserName("TEST_USER");
		return elgEligDataGovernanceEdg;
	}

	@Override
	public ElgEligDataGovernanceEdg saveEGDControl(String jsonString) throws IOException, ValidationException, Exception {
		
		ElgEligDataGovernanceEdg elgEligDataGovernanceEdg;
		ObjectMapper mapper = new ObjectMapper();
		EligGovernanceDataControl eligGovernanceDataControl = mapper.readValue(jsonString,
				new TypeReference<EligGovernanceDataControl>() {
				});
		HashMap<String, String> validationErrors = validateEligDataGovernanceForm(eligGovernanceDataControl);
		if (validationErrors.isEmpty()) {
			// check if existing Data Governance Ctrl record
			elgEligDataGovernanceEdg = findByCarCarrierIdAndAccountIdAndGroupId(eligGovernanceDataControl.getCarCarrierId(),
					eligGovernanceDataControl.getAccountId(), eligGovernanceDataControl.getGroupId());
			// set entity data for add/update by using form object.
			elgEligDataGovernanceEdg = prepareEligDataGovernanceEntity(elgEligDataGovernanceEdg,
					eligGovernanceDataControl);
			// save/update Data Governance Ctrl detail
			return elgEligDataGovernanceEdgRepository.saveAndFlush(elgEligDataGovernanceEdg);
		} else
			throw new ValidationException(mapper.writer().writeValueAsString(validationErrors));
	}
	
	private String checkEmailNotificationList(String platformId, String emailDistListID) throws Exception {
    	
    	String api = "/getEmailDistributionList?emailListId="+URLEncoder.encode(emailDistListID.trim(),"UTF-8") ;   
    	String results = nonEligAPIServices.callNonEligDataService(platformId, api);	
        return results;
      
    }
	
}
