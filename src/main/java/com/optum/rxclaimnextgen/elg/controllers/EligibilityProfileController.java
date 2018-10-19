package com.optum.rxclaimnextgen.elg.controllers;

import com.optum.rxclaimnextgen.elg.entities.ElgEligDataGovernanceEdg;
import com.optum.rxclaimnextgen.elg.entities.ElgEligProfileEpf;
import com.optum.rxclaimnextgen.elg.entities.ElgEqdEligQueueDefaults;
import com.optum.rxclaimnextgen.elg.exceptions.ValidationException;
import com.optum.rxclaimnextgen.elg.pojo.CopyProfileForm;
import com.optum.rxclaimnextgen.elg.pojo.EligGroupListNames;
import com.optum.rxclaimnextgen.elg.pojo.EligGroupListNamesNoProfiles;
import com.optum.rxclaimnextgen.elg.pojo.EligProfileView;
import com.optum.rxclaimnextgen.elg.pojo.profile.quality.EligQualityDefaultDetailForm;
import com.optum.rxclaimnextgen.elg.projections.*;
import com.optum.rxclaimnextgen.elg.services.EligProfileServices;
import com.optum.rxclaimnextgen.elg.services.profile.errorTolerance.ErrorToleranceControlService;
import com.optum.rxclaimnextgen.elg.services.profile.errorTolerance.ErrorToleranceThresholdService;
import com.optum.rxclaimnextgen.elg.services.profile.other.GovernanceDataControlService;
import com.optum.rxclaimnextgen.elg.services.profile.quality.QualityDefaultDetailService;
import com.optum.rxclaimnextgen.elg.services.profile.other.EligibilityRequestService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Hemant Sharma
 * <p>
 * REST controller for eligibility profile screen.
 */

/**
 */
@CrossOrigin
@RestController
public class EligibilityProfileController {
    private static final Logger LOG = LoggerFactory.getLogger(EligibilityProfileController.class);

    @Autowired
    EligProfileServices eligProfileService;
    
    @Autowired
    QualityDefaultDetailService qualityDefaultDetailService;
    
    @Autowired
    ErrorToleranceControlService errorToleranceControlService;
    
    @Autowired
    GovernanceDataControlService governanceDataControlService;
    
    @Autowired
    EligibilityRequestService eligibilityRequestService;

    @Autowired
    ErrorToleranceThresholdService errorToleranceThresholdService;
    

    /**
     * Find all eligibility profile data by using service "EligProfileServices".
     * UI Navigation :-> Eligibility --> Profile --> View Existing
     */
    @GetMapping("/getAllEligProfileData")
    @ResponseBody
    public ResponseEntity findAllEligProfileData() {
        try {
            List<EligProfileView> results = eligProfileService.findAllEligProfileData();
            return ResponseEntity.ok().body(results);
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }

    @GetMapping("/getProfileByPrimaryKey")
    @ResponseBody
    public ResponseEntity getProfileByPrimaryKey(@RequestParam("carrierId") String carrierId,
                                     @RequestParam("accountId") String accountId, @RequestParam("groupId") String groupId) {
        if (carrierId.isEmpty() || accountId.isEmpty() || groupId.isEmpty()) {
            return ResponseEntity.badRequest().body("carrierId, accountId, groupId values required.");
        }

        try {
            ElgEligProfileEpf elgEligProfileEpf = eligProfileService.getProfileByPrimaryKey(carrierId, accountId, groupId);
            if (elgEligProfileEpf == null) {
                return ResponseEntity.badRequest().body("Could not find a matching profile.");
            }
            return ResponseEntity.ok(elgEligProfileEpf);
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/listAllPlatforms")
    @ResponseBody
    public ResponseEntity getAllPlatforms() {
        try {
            List<String> platforms = eligProfileService.getAllPlatforms();
            return ResponseEntity.ok().body(platforms);
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/addProfile")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseEntity addProfile(@RequestBody String jsonString) {
        try {
            eligProfileService.saveProfileDetail(jsonString, "add");
            return ResponseEntity.ok().body(null);
        }
        catch (ValidationException validationException) {
            return ResponseEntity.unprocessableEntity().body(validationException.getMessage());
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/copyProfile")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseEntity copyProfile(@RequestBody String jsonString) {
        try {
            CopyProfileForm form = eligProfileService.copyProfile(jsonString);
            return ResponseEntity.ok().body(form);
        }
        catch (ValidationException validationException) {
            return ResponseEntity.unprocessableEntity().body(validationException.getMessage());
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/saveProfile")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseEntity saveProfile(@RequestBody String jsonString) {
        try {
            ElgEligProfileEpf elgEligProfileEpf = eligProfileService.saveProfileDetail(jsonString, "update");
            return ResponseEntity.ok().body(elgEligProfileEpf);
        }
        catch (ValidationException validationException) {
            return ResponseEntity.unprocessableEntity().body(validationException.getMessage());
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/listAllCarrierLists")
    @ResponseBody
    public ResponseEntity getAllCarrierLists() {
        try {
            List<String> carrierLists = eligProfileService.getAllCarrierLists();
            return ResponseEntity.ok().body(carrierLists);
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/getAllCarrierIdsbyCarrierList")
    @ResponseBody
    public ResponseEntity getAllCarrierIdsbyCarrierList(@RequestParam("carrierList") String carrierList) {
        if (carrierList.isEmpty()) {
            return ResponseEntity.badRequest().body("carrierList value is required.");
        }
        try {
            List<String> carrierLists = eligProfileService.getAllCarrierIdsbyCarrierList(carrierList);
            return ResponseEntity.ok().body(carrierLists);
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/getCrlCarrierListProjection")
    @ResponseBody
    public ResponseEntity getAllCarrierIdsAndDescriptions() {
        try {
            List<ElgCrlCarrierListProjection> results = eligProfileService.getAllCarrierIdsAndDescriptions();
            return ResponseEntity.ok().body(results);
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/getGrlGroupListProjection")
    @ResponseBody
    public ResponseEntity getAllGroupNamesAndDescriptions() {
        try {
            List<ElgGrlGroupListProjection> results = eligProfileService.getAllGroupNamesAndDescriptions();
            return ResponseEntity.ok().body(results);
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @CrossOrigin
    @GetMapping("/getAllGroupsForGroupNameList")
    @ResponseBody
    public ResponseEntity getAllGroupsForGroupNameList(@RequestParam("gln") String groupListName)  {
        if (groupListName.isEmpty()) {
            return ResponseEntity.badRequest().body("group list name value is required.");
        }
        try {
            List<EligGroupListNames> results = eligProfileService.getAllGroupsForGroupNameList(groupListName);
            return ResponseEntity.ok().body(results);
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @GetMapping("/getAllGroupsWithoutEligProfiles")
    @ResponseBody
    public ResponseEntity getAllGroupsWithoutEligProfiles()  {
    	LOG.info(">>> enter in getAllGroupsWithoutEligProfiles");
        try {
            List<EligGroupListNamesNoProfiles> results = eligProfileService.getAllGroupsWithoutEligProfiles();
            return ResponseEntity.ok().body(results);
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/eligibilityQueueForProfile")
    @ResponseBody
    public ResponseEntity getEligibilityQueueForProfile(String carrierId, String accountId, String groupId) {
        try {
            if (carrierId.isEmpty() || accountId.isEmpty() || groupId.isEmpty()) {
                return ResponseEntity.badRequest().body("carrierId, accountId, groupId values required.");
            }
            return ResponseEntity.ok().body(eligProfileService.getEligQueueDefaultsForProfile(carrierId, accountId, groupId));
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    
    @GetMapping("/eligibilityRequestForProfile")
    @ResponseBody
    public ResponseEntity getEligibilityRequestForProfile(String carrierId, String accountId, String groupId) {
        try {
            if (carrierId.isEmpty() || accountId.isEmpty() || groupId.isEmpty()) {
                return ResponseEntity.badRequest().body("carrierId, accountId, groupId values required.");
            }
            return ResponseEntity.ok().body(eligibilityRequestService.getEligibilityRequestDetailForProfile(carrierId, accountId, groupId));
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    @GetMapping("/populateEligQueueDetail")
	@ResponseBody
	public ResponseEntity populateEligQueueDetail(String carrierId, String accountId, String groupId,
			String reportName) {
		try {
			if (carrierId.isEmpty() || accountId.isEmpty() || groupId.isEmpty() || reportName.isEmpty()) {
				return ResponseEntity.badRequest().body("carrierId, accountId, groupId, reportName values required.");
			}
			return ResponseEntity.ok().body(
					eligProfileService.getEligQueueDefaultsByPrimaryKey(carrierId, accountId, groupId, reportName));
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PostMapping("/saveEligQueueDetail")
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public ResponseEntity saveEligQueueDetail(@RequestBody String jsonString) {
		if (StringUtils.isEmpty(jsonString)) {
			return ResponseEntity.badRequest().body("Request body was not sent.");
		}
		try {
			ElgEqdEligQueueDefaults elgEqdEligQueueDefaults = eligProfileService.saveEligQueueDetail(jsonString);
			return ResponseEntity.ok().body(elgEqdEligQueueDefaults);
		} catch (ValidationException validationException) {
			return ResponseEntity.unprocessableEntity().body(validationException.getMessage());
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return ResponseEntity.badRequest().body("Could not save queue detail - an unexpected error occurred.");
		}
	}

    @PutMapping("/inactivateProfile")
    @ResponseBody
    public ResponseEntity inactivateProfile(@RequestParam("cid") String carrierId,
                                            @RequestParam("aid") String accountId,
                                            @RequestParam("gid") String groupId,
                                            @RequestBody String body) {
        try {
            eligProfileService.inactivateProfile(carrierId, accountId, groupId, body);
            return ResponseEntity.ok().body(null);
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    @PostMapping("/saveQualityDefaultDetails")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseEntity saveQualityDefaultDetails(@RequestBody String jsonString) {
		if (jsonString.isEmpty()) {
			return ResponseEntity.badRequest().body("Request body was not sent.");
		}

		try {
			LOG.debug(">>>Inside saveQualityDefaultDetails-->" + jsonString);
			EligQualityDefaultDetailForm  eligQualityDefaultDetailForm = qualityDefaultDetailService.saveQualityDefaultDetails(jsonString);
			return ResponseEntity.ok(eligQualityDefaultDetailForm);
		} catch (ValidationException validationException) {
            return ResponseEntity.unprocessableEntity().body(validationException.getMessage());
		} catch (Exception e) {			
			LOG.error(e.getMessage());
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
    
   
    
    @GetMapping("/populateQualityDefaultDetails")
    @ResponseBody
    public ResponseEntity populateQualityDefaultDetails(@RequestParam("carrierId") String carrierId,
                                     @RequestParam("accountId") String accountId, @RequestParam("groupId") String groupId) {
		if (carrierId.isEmpty() || accountId.isEmpty() || groupId.isEmpty()) {
			return ResponseEntity.badRequest().body("Carrier ID, Account ID, and Group ID are all required.");
		}

		try {
        	LOG.debug(">>>Inside populateQualityDefaultDetails");
        	EligQualityDefaultDetailForm  eligQualityDefaultDetailForm = qualityDefaultDetailService.populateQualityDefaultDetails(carrierId, accountId, groupId);
			return ResponseEntity.ok().body(eligQualityDefaultDetailForm);
		}
        catch (Exception e) {
        	e.printStackTrace();
				LOG.error(e.getMessage());
			return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
	@GetMapping("/fetchErrorToleranceControlDetail")
	@ResponseBody
	public ResponseEntity fetchErrorToleranceControlDetail(String carrierId, String accountId, String groupId) {
		try {
			if (StringUtils.isBlank(carrierId) || StringUtils.isBlank(accountId) || StringUtils.isBlank(groupId)) {
				return ResponseEntity.badRequest().body("carrierId, accountId, groupId, reportName values required.");
			}
			return ResponseEntity.ok().body(errorToleranceControlService
					.findByCarCarrierIdAndAccountIdAndGroupId(carrierId, accountId, groupId));
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PostMapping("/saveErrorToleranceControlDetail")
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public ResponseEntity saveErrorToleranceControlDetail(@RequestBody String jsonString) {
		try {
			if (StringUtils.isBlank(jsonString)) {
				return ResponseEntity.badRequest().body("Error Tolerance Control Detail data is blank.");
			}
			errorToleranceControlService.save(jsonString);
			return ResponseEntity.ok().body(null);
		} catch (ValidationException validationException) {
			return ResponseEntity.unprocessableEntity().body(validationException.getMessage());
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
    @GetMapping("/populateEGDControl")
	@ResponseBody
	public ResponseEntity populateEGDControl(String carrierId, String accountId, String groupId) {
		try {
			if (carrierId.isEmpty() || accountId.isEmpty() || groupId.isEmpty()) {
				return ResponseEntity.badRequest().body("carrierId, accountId, groupId values required.");
			}
			return ResponseEntity.ok().body(
					governanceDataControlService.findByCarCarrierIdAndAccountIdAndGroupId(carrierId, accountId, groupId));
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PostMapping("/saveEGDControl")
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public ResponseEntity saveEGDControl(@RequestBody String jsonString) {
		if (StringUtils.isEmpty(jsonString)) {
			return ResponseEntity.badRequest().body("Request body was not sent.");
		}
		try {
			ElgEligDataGovernanceEdg elgEligDataGovernanceEdg = governanceDataControlService.saveEGDControl(jsonString);
			return ResponseEntity.ok().body(elgEligDataGovernanceEdg);
		} catch (ValidationException validationException) {
			return ResponseEntity.unprocessableEntity().body(validationException.getMessage());
		} catch (Exception e) {
			LOG.error(e.getMessage());
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

    @GetMapping("/error-tolerance/thresholds")
    @ResponseBody
    public ResponseEntity getErrorToleranceThresholdsForProfile(
            @RequestParam("carrierId") String carrierId,
            @RequestParam("accountId") String accountId,
            @RequestParam("groupId") String groupId
    ) {
        try {
            if (carrierId.isEmpty() || accountId.isEmpty() || groupId.isEmpty()) {
                return ResponseEntity.badRequest().body("carrierId, accountId, groupId values required.");
            }
            return ResponseEntity.ok().body(
                    errorToleranceThresholdService.getAllForProfile(carrierId, accountId, groupId));
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}

