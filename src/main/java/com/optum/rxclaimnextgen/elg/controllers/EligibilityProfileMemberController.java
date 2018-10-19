package com.optum.rxclaimnextgen.elg.controllers;

import com.optum.rxclaimnextgen.elg.pojo.profile.member.EligMemberHealthDefaultDetailForm;
import com.optum.rxclaimnextgen.elg.services.profile.groupdetail.GroupDefaultDetailService;
import com.optum.rxclaimnextgen.elg.services.profile.member.HealthDefaultDetailService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.optum.rxclaimnextgen.elg.entities.ElgEligWCDefaultsEwd;
import com.optum.rxclaimnextgen.elg.exceptions.ValidationException;
import com.optum.rxclaimnextgen.elg.pojo.EligAltInsuranceDefaultDetail;
import com.optum.rxclaimnextgen.elg.pojo.EligCoverageDefaultDetail;
import com.optum.rxclaimnextgen.elg.pojo.EligGroupDefaultDetail;
import com.optum.rxclaimnextgen.elg.pojo.EligMemberCareAssignDetailForm;
import com.optum.rxclaimnextgen.elg.pojo.EligMemberDefaultDetailsForm;
import com.optum.rxclaimnextgen.elg.pojo.EligMemberHimDefaultOvrDetailForm;
import com.optum.rxclaimnextgen.elg.pojo.EligMemberIncidentDefaultDetailForm;
import com.optum.rxclaimnextgen.elg.pojo.EligMemberOverrideDetailForm;
import com.optum.rxclaimnextgen.elg.services.EligProfileMemberServices;


/**
 * @author Gaurav Sharma
 * <p>
 * REST controller for eligibility member.
 */

/**
 */
@CrossOrigin
@RestController
public class EligibilityProfileMemberController {
    private static final Logger LOG = LoggerFactory.getLogger(EligibilityProfileMemberController.class);

    private static String ADD_UPDATE_EXCEPTION_TEXT = "An error occurred and your changes were not saved. If you continue to experience this error, please contact technical support.";


    @Autowired
    EligProfileMemberServices eligProfileMemberServices;

    @Autowired
    HealthDefaultDetailService healthDefaultDetailService;
    
    @Autowired
    GroupDefaultDetailService groupDefaultDetailService;


    @PostMapping("/saveHimDefaultOverrideDetails")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseEntity saveHimDefaultOverrideDetails(@RequestBody String jsonString) {
        if (jsonString.isEmpty()) {
            return ResponseEntity.badRequest().body("Request body was not sent.");
        }

        try {
            LOG.debug(">>>Inside saveHimDefaultOverrideDetails-->" + jsonString);
            EligMemberHimDefaultOvrDetailForm eligMemberHimDefaultOvrDetailForm = eligProfileMemberServices.saveHimDefaultOverrideDetails(jsonString);
            return ResponseEntity.ok(eligMemberHimDefaultOvrDetailForm);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body("{\"Message\" : \"ERROR " + ADD_UPDATE_EXCEPTION_TEXT + "\"}");
        }
    }


    @GetMapping("/populateHimDefaultsOvrDetails")
    @ResponseBody
    public ResponseEntity populateHimDefaultsOvrDetails(@RequestParam("carrierId") String carrierId,
                                                        @RequestParam("accountId") String accountId,
                                                        @RequestParam("groupId") String groupId) {
        if (carrierId.isEmpty() || accountId.isEmpty() || groupId.isEmpty()) {
            return ResponseEntity.badRequest().body("Carrier ID, Account ID, and Group ID are all required.");
        }

        try {
            LOG.debug(">>>Inside getHimDefaultOverrideDetails");
            EligMemberHimDefaultOvrDetailForm eligMemberHimDefaultOvrDetailForm = eligProfileMemberServices.populateHimDefaultsOvrDetailsByPrimaryKey(carrierId, accountId, groupId);
            return ResponseEntity.ok().body(eligMemberHimDefaultOvrDetailForm);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    /**
     * @param carrierId
     * @param accountId
     * @param groupId
     * @return
     */
    @GetMapping("/populateCareAssignDetails")
    @ResponseBody
    public ResponseEntity populateCareAssignDetails(@RequestParam("carrierId") String carrierId,
                                                    @RequestParam("accountId") String accountId,
                                                    @RequestParam("groupId") String groupId,
                                                    @RequestParam("platformId") String platformId) {
        if (carrierId.isEmpty() || accountId.isEmpty() || groupId.isEmpty() || platformId.isEmpty()) {
            return ResponseEntity.badRequest().body("Carrier ID, Account ID, Group ID and Platform ID are all required.");
        }

        try {

            EligMemberCareAssignDetailForm eligMemberCareAssignDetailForm = eligProfileMemberServices.populateCareAssignDetailsByPrimaryKey(carrierId, accountId, groupId, platformId);

            return ResponseEntity.ok().body(eligMemberCareAssignDetailForm);
        } catch (Exception e) {
            e.printStackTrace();
            LOG.error("Error" + e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @PostMapping("/saveCareAssignDetails")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseEntity saveCareAssignDetails(@RequestBody String jsonString, @RequestParam("platformId") String platformId) {

        if (jsonString.isEmpty()) {
            return ResponseEntity.badRequest().body("Request body was not sent.");
        }

        try {

            EligMemberCareAssignDetailForm eligMemberCareAssignDetailForm = eligProfileMemberServices.saveCareAssignDetails(jsonString, platformId);
            return ResponseEntity.ok(eligMemberCareAssignDetailForm);
        }catch (ValidationException validationException) {
            return ResponseEntity.unprocessableEntity().body(validationException.getMessage());
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    // Override detail form

    @GetMapping("/populateOverrideDetails")
    @ResponseBody
    public ResponseEntity populateOverrideDetails(@RequestParam("carrierId") String carrierId,
                                                  @RequestParam("accountId") String accountId,
                                                  @RequestParam("groupId") String groupId) {
        if (carrierId.isEmpty() || accountId.isEmpty() || groupId.isEmpty()) {
            return ResponseEntity.badRequest().body("Carrier ID, Account ID, and Group ID are all required.");
        }

        try {

            EligMemberOverrideDetailForm eligMemberOverrideDetailForm = eligProfileMemberServices.populateOverrideDetailsByPrimaryKey(carrierId, accountId, groupId);
            return ResponseEntity.ok().body(eligMemberOverrideDetailForm);
        } catch (Exception e) {
            LOG.error("Error" + e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/saveOverrideDetails")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseEntity saveOverrideDetails(@RequestBody String jsonString) {
        if (jsonString.isEmpty()) {
            return ResponseEntity.badRequest().body("Request body was not sent.");
        }

        try {

            EligMemberOverrideDetailForm eligMemberOverrideDetailForm = eligProfileMemberServices.saveOverrideDetails(jsonString);
            return ResponseEntity.ok(eligMemberOverrideDetailForm);
        } catch (ValidationException validationException) {
            return ResponseEntity.badRequest().body(validationException.getMessage());
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(ADD_UPDATE_EXCEPTION_TEXT);
        }
    }

    //IncidentDefaultForm

    @GetMapping("/populateIncidentDefaultDetail")
    @ResponseBody
    public ResponseEntity populateIncidentDefaultDetail(@RequestParam("carrierId") String carrierId,
                                                        @RequestParam("accountId") String accountId,
                                                        @RequestParam("groupId") String groupId) {
        if (carrierId.isEmpty() || accountId.isEmpty() || groupId.isEmpty()) {
            return ResponseEntity.badRequest().body("Carrier ID, Account ID, and Group ID are all required.");
        }

        try {

            EligMemberIncidentDefaultDetailForm eligMemberIncidentDefaultDetailForm = eligProfileMemberServices.populateIncidentDefaultDetailByPrimaryKey(carrierId, accountId, groupId);

            return ResponseEntity.ok().body(eligMemberIncidentDefaultDetailForm);
        } catch (Exception e) {
            LOG.error("Error" + e.getMessage());
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/saveIncidentDefaultDetail")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseEntity saveIncidentDefaultDetail(@RequestBody String jsonString) {
        if (jsonString.isEmpty()) {
            return ResponseEntity.badRequest().body("Request body was not sent.");
        }

        try {
        	ElgEligWCDefaultsEwd elgEligWCDefaultsEwd = eligProfileMemberServices.saveIncidentDefaultDetail(jsonString);
            return ResponseEntity.ok(elgEligWCDefaultsEwd);
        } catch (ValidationException validationException) {
			return ResponseEntity.unprocessableEntity().body(validationException.getMessage());
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return ResponseEntity.badRequest().body(e.getMessage());
		}
    }

    @GetMapping("/populateCoverageDefaultDetails")
    @ResponseBody
    public ResponseEntity populateCoverageDefaultDetails(@RequestParam("carrierId") String carrierId,
                                                         @RequestParam("accountId") String accountId,
                                                         @RequestParam("groupId") String groupId) {
        if (StringUtils.isBlank(carrierId) || StringUtils.isBlank(accountId) || StringUtils.isBlank(groupId)) {
            return ResponseEntity.badRequest().body("Carrier ID, Account ID, and Group ID are all required.");
        }
        try {
            LOG.debug(">>>Inside populateCoverageDefaultDetails");
            EligCoverageDefaultDetail eligCoverageDefaultDetail = eligProfileMemberServices
                    .fetchCoverageDefaultDetail(carrierId, accountId, groupId);
            return ResponseEntity.ok().body(eligCoverageDefaultDetail);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/saveCoverageDefaultDetails")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseEntity saveCoverageDefaultDetails(@RequestBody String jsonString) {
        if (jsonString.isEmpty()) {
            return ResponseEntity.badRequest().body("Request body was not sent.");
        }
        try {
            LOG.debug(">>>Inside saveCoverageDefaultDetails-->" + jsonString);
            EligCoverageDefaultDetail eligCoverageDefaultDetail = eligProfileMemberServices
                    .saveCoverageDefaultDetail(jsonString);
            return ResponseEntity.ok(eligCoverageDefaultDetail);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body("{\"Message\" : \"ERROR " + ADD_UPDATE_EXCEPTION_TEXT + "\"}");
        }
    }

    @GetMapping("/fetchAltInsuranceDefaultDetails")
    @ResponseBody
    public ResponseEntity fetchAltInsuranceDefaultDetails(@RequestParam("carrierId") String carrierId,
                                                          @RequestParam("accountId") String accountId,
                                                          @RequestParam("groupId") String groupId) {
        if (StringUtils.isBlank(carrierId) || StringUtils.isBlank(accountId) || StringUtils.isBlank(groupId)) {
            return ResponseEntity.badRequest().body("Carrier ID, Account ID, and Group ID are all required.");
        }
        try {
            LOG.debug(">>>Inside fetchAltInsuranceDefaultDetails");
            EligAltInsuranceDefaultDetail eligAltInsuranceDefaultDetail = eligProfileMemberServices
                    .fetchAltInsuranceDefaultDetail(carrierId, accountId, groupId);
            return ResponseEntity.ok().body(eligAltInsuranceDefaultDetail);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/saveAltInsuranceDefaultDetail")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseEntity saveAltInsuranceDefaultDetail(@RequestBody String jsonString) {
        if (jsonString.isEmpty()) {
            return ResponseEntity.badRequest().body("Request body was not sent.");
        }
        try {
            LOG.debug(">>>Inside saveAltInsuranceDefaultDetail-->" + jsonString);
            EligAltInsuranceDefaultDetail eligCoverageDefaultDetail = eligProfileMemberServices
                    .saveAltInsuranceDefaultDetail(jsonString);
            return ResponseEntity.ok(eligCoverageDefaultDetail);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body("{\"Message\" : \"ERROR " + ADD_UPDATE_EXCEPTION_TEXT + "\"}");
        }
    }

    @GetMapping("/healthDefaultDetails")
    @ResponseBody
    public ResponseEntity getHealthDefaultDetailsByPK(
            @RequestParam("carrierId") String carrierId,
            @RequestParam("accountId") String accountId,
            @RequestParam("groupId") String groupId
    ) {
        if (StringUtils.isBlank(carrierId) || StringUtils.isBlank(accountId) || StringUtils.isBlank(groupId)) {
            return ResponseEntity.badRequest().body("Carrier ID, Account ID, and Group ID are all required.");
        }
        try {
            EligMemberHealthDefaultDetailForm eligMemberHealthDefaultDetailForm = healthDefaultDetailService
                    .findHealthDefaultsByPrimaryKey(carrierId, accountId, groupId);
            return ResponseEntity.ok().body(eligMemberHealthDefaultDetailForm);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/healthDefaultDetails")
    @ResponseBody
    public ResponseEntity saveHealthDefaultDetails(@RequestBody String updatedHealthDefaultsJSON, @RequestParam("platformId") String platformId) {
        if (updatedHealthDefaultsJSON.isEmpty()) {
            return ResponseEntity.badRequest().body("Request body was not sent.");
        }
        try {
            EligMemberHealthDefaultDetailForm savedValue = healthDefaultDetailService.saveHealthDefaultDetails(updatedHealthDefaultsJSON, platformId);
            return ResponseEntity.ok().body(savedValue);
        }
        catch (ValidationException validationException) {
            return ResponseEntity.badRequest().body(validationException.getMessage());
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(this.ADD_UPDATE_EXCEPTION_TEXT);
        }
    }

    @PostMapping("/saveMemberDefaultDetails")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseEntity saveMemberDefaultDetails(@RequestBody String jsonString) {
		if (jsonString.isEmpty()) {
			return ResponseEntity.badRequest().body("Request body was not sent.");
		}

		try {
			LOG.debug(">>>Inside saveMemberDefaultDetails-->" + jsonString);
			EligMemberDefaultDetailsForm  eligMemberDefaultDetailsForm = eligProfileMemberServices.saveMemberDefaultDetails(jsonString);
			return ResponseEntity.ok(eligMemberDefaultDetailsForm);
		} catch (ValidationException validationException) {
            return ResponseEntity.badRequest().body(validationException.getMessage());            
		} catch (Exception e) {			
			LOG.error(e.getMessage());
			return ResponseEntity.badRequest().body(ADD_UPDATE_EXCEPTION_TEXT);
		}
	}
    
   
    
    @GetMapping("/populateMemberDefaultDetails")
    @ResponseBody
    public ResponseEntity populateMemberDefaultDetails(@RequestParam("carrierId") String carrierId,
                                     @RequestParam("accountId") String accountId, @RequestParam("groupId") String groupId) {
		if (carrierId.isEmpty() || accountId.isEmpty() || groupId.isEmpty()) {
			return ResponseEntity.badRequest().body("Carrier ID, Account ID, and Group ID are all required.");
		}

		try {
        	LOG.debug(">>>Inside populateMemberDefaultDetails");
        	EligMemberDefaultDetailsForm  eligMemberDefaultDetailsForm = eligProfileMemberServices.populateMemberDefaultDetails(carrierId, accountId, groupId);
			return ResponseEntity.ok().body(eligMemberDefaultDetailsForm);
		}
        catch (Exception e) {
        	e.printStackTrace();
				LOG.error(e.getMessage());
			return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    @GetMapping("/getGroupDefaultDetailByPK")
	@ResponseBody
	public ResponseEntity getGroupDefaultDetailByPK(@RequestParam("carrierId") String carrierId,
			@RequestParam("accountId") String accountId, @RequestParam("groupId") String groupId) {
		if (StringUtils.isBlank(carrierId) || StringUtils.isBlank(accountId) || StringUtils.isBlank(groupId)) {
			return ResponseEntity.badRequest().body("Carrier ID, Account ID, and Group ID are all required.");
		}
		try {
			EligGroupDefaultDetail eligGroupDefaultDetail = groupDefaultDetailService
					.getGroupDefaultDetailByPrimaryKey(carrierId, accountId, groupId);
			return ResponseEntity.ok().body(eligGroupDefaultDetail);
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
    
    @PostMapping("/saveGroupDefaultDetail")
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public ResponseEntity saveGroupDefaultDetail(@RequestBody String jsonString) {
		if (jsonString.isEmpty()) {
			return ResponseEntity.badRequest().body("Request body was not sent.");
		}
		try {
			LOG.debug(">>>Inside saveGroupDefaultDetail >>>" + jsonString);
			groupDefaultDetailService.save(jsonString);
			return ResponseEntity.ok(null);
		} catch (ValidationException validationException) {
			return ResponseEntity.badRequest().body(validationException.getMessage());
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return ResponseEntity.badRequest().body(ADD_UPDATE_EXCEPTION_TEXT);
		}

	}
	
}