package com.optum.rxclaimnextgen.controllers;

import com.optum.rxclaimnextgen.entities.*;
import com.optum.rxclaimnextgen.services.ClaimServices;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bkocinsk on 7/20/2018.
 */
@RestController
public class ClaimsController {

    private static final Logger LOG = LoggerFactory.getLogger(ClaimsController.class);

    @Autowired
    ClaimServices claimServices;

    @GetMapping("/getCareFacilityByPrimaryKey")
    @ResponseBody
    public ResponseEntity getCareFacilityByPrimaryKey(@RequestParam("cid") String carrierId,
                                                         @RequestParam("cfid") String careFacilityId) {
        if (carrierId.isEmpty() || careFacilityId.isEmpty()) {
            return ResponseEntity.badRequest().body("carrierId and careFacilityId values required.");
        }

        try {
            LOG.debug(">>>> in getCareFacilityByPrimaryKey");
            CfaCareFacility cf = claimServices.findByCarrierIdAndCareFacilityId(carrierId, careFacilityId);
            if (cf == null) {
                return ResponseEntity.badRequest().body("Could not find a matching care facility.");
            }
            return ResponseEntity.ok(cf);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/getPlanByPrimaryKey")
    @ResponseBody
    public ResponseEntity getPlanByPrimaryKey(@RequestParam("pcode") String planCode,
                                                 @RequestParam("effdt") int planEffDate,
                                                 @RequestParam("trmdt") int planTermDate) {
        if (planCode.isEmpty() || planEffDate == 0 || planTermDate == 0) {
            return ResponseEntity.badRequest().body("planCode and planEffDate and planTermDate values required.");
        }

        try {
            LOG.debug(">>>> in getPlanByPrimaryKey");
            PlnPlan plan = claimServices.findByPlanCodeAndPlanEffDateAndPlanTermDate(planCode, planEffDate, planTermDate);
            if (plan == null) {
                return ResponseEntity.badRequest().body("Could not find a matching plan.");
            }
            return ResponseEntity.ok(plan);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/getPlanByPlanCode")
    @ResponseBody
    public ResponseEntity getPlanByPlanCode(@RequestParam("pcode") String planCode) {
        if (planCode.isEmpty()) {
            return ResponseEntity.badRequest().body("planCode value required.");
        }

        try {
            LOG.debug(">>>> in getPlanByPlanCode");
            List<PlnPlan> plan = claimServices.findByPlanCode(planCode);
            if (plan == null) {
                return ResponseEntity.badRequest().body("Could not find a matching plan.");
            }
            return ResponseEntity.ok(plan);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/getNetworkByPrimaryKey")
    @ResponseBody
    public ResponseEntity getNetworkByPrimaryKey(@RequestParam("cid") String carrierId,
                                                    @RequestParam("aid") String accountId,
                                                    @RequestParam("gid") String groupId,
                                                    @RequestParam("nid") String networkId) {

        if (carrierId.isEmpty() || accountId.isEmpty() || groupId.isEmpty() || networkId.isEmpty()) {
            return ResponseEntity.badRequest().body("carrierId, accountId, groupId, and networkId values required.");
        }

        try {
            LOG.debug(">>>> in getNetworkByPrimaryKey");
            CnwCareNetwork cnw = claimServices.findByNetworkbyPrimaryKey(carrierId, accountId, groupId, networkId);
            if (cnw == null) {
                return ResponseEntity.badRequest().body("Could not find a matching network.");
            }
            return ResponseEntity.ok(cnw);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/getNetworkByNetworkId")
    @ResponseBody
    public ResponseEntity getNetworkByNetworkId(@RequestParam("nid") String networkId) {

        if (networkId.isEmpty()) {
            return ResponseEntity.badRequest().body("networkId value required.");
        }

        try {
            LOG.debug(">>>> in getNetworkByNetworkId");
            List<CnwCareNetwork> cnw = claimServices.findNetworkByNetworkId(networkId);
            if (cnw == null) {
                return ResponseEntity.badRequest().body("Could not find a matching network.");
            }
            return ResponseEntity.ok(cnw);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/getQualifierByPrimaryKey")
    @ResponseBody
    public ResponseEntity getQualifierByPrimaryKey(@RequestParam("cid") String carrierId,
                                                    @RequestParam("aid") String accountId,
                                                    @RequestParam("gid") String groupId,
                                                    @RequestParam("qid") String qualifierId) {

        if (carrierId.isEmpty() || accountId.isEmpty() || groupId.isEmpty() || qualifierId.isEmpty()) {
            return ResponseEntity.badRequest().body("carrierId, accountId, groupId, and qualifierId values required.");
        }

        try {
            LOG.debug(">>>> in getQualifierByPrimaryKey");
            CquCareQualifier cqu = claimServices.findQualifierByPrimaryKey(carrierId, accountId, groupId, qualifierId);
            if (cqu == null) {
                return ResponseEntity.badRequest().body("Could not find a matching qualifier.");
            }
            return ResponseEntity.ok(cqu);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/getQualifierByQualifierId")
    @ResponseBody
    public ResponseEntity getQualifierByQualifierId(@RequestParam("qid") String qualifierId) {

        if (qualifierId.isEmpty()) {
            return ResponseEntity.badRequest().body("qualifierId value required.");
        }

        try {
            LOG.debug(">>>> in getQualifierByQualifierId");
            List<CquCareQualifier> cqu = claimServices.findQualifierByQualifierId(qualifierId);
            if (cqu == null) {
                return ResponseEntity.badRequest().body("Could not find a matching qualifier.");
            }
            return ResponseEntity.ok(cqu);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/getPrescriberIdByPrimaryKey")
    @ResponseBody
    public ResponseEntity getPrescriberIdByPrimaryKey(@RequestParam("pid") String prescriberId,
                                                      @RequestParam("qid") String prescriberIdQualifier,
                                                      @RequestParam("sid") String prescriberIdState) {

        if (prescriberId.isEmpty() || prescriberIdQualifier.isEmpty() || prescriberIdState.isEmpty()) {
            return ResponseEntity.badRequest().body("prescriberId, prescriberIdQualifier, and prescriberIdState values required.");
        }

        try {
            LOG.debug(">>>> in getQualifierPrescriberByPrimaryKey");
            PrfPrescriberId prf = claimServices.findPrescriberIdByPrimaryKey(prescriberId, prescriberIdQualifier, prescriberIdState);
            if (prf == null) {
                return ResponseEntity.badRequest().body("Could not find a matching prescriber.");
            }
            return ResponseEntity.ok(prf);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/getPrescriberIdByPrescriberId")
    @ResponseBody
    public ResponseEntity getPrescriberIdByPrescriberId(@RequestParam("pid") String prescriberId) {

        if (prescriberId.isEmpty()) {
            return ResponseEntity.badRequest().body("prescriberId value required.");
        }

        try {
            LOG.debug(">>>> in getPrescriberIdByPrescriberId");
            List<PrfPrescriberId> prf = claimServices.findPrescriberIdByPrescriberId(prescriberId);
            if (prf == null) {
                return ResponseEntity.badRequest().body("Could not find a matching prescriber");
            }
            return ResponseEntity.ok(prf);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/getPrescriberQualTypeByPrescriberIdQualifier")
    @ResponseBody
    public ResponseEntity getPrescriberQualTypeByPrescriberIdQualifier(@RequestParam("pid") String prescriberIdQualifier) {

        if (prescriberIdQualifier.isEmpty()) {
            return ResponseEntity.badRequest().body("prescriberIdQualifier value required.");
        }

        try {
            LOG.debug(">>>> in getPrescriberQualTypeByPrescriberIdQualifier");
            PrqPrescriberQualType prq = claimServices.findPrescriberQualTypeByPrescriberIdQualifier(prescriberIdQualifier);
            if (prq == null) {
                return ResponseEntity.badRequest().body("Could not find a matching prescriber id qualifier");
            }
            return ResponseEntity.ok(prq);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/getPhyPrescriberByPrescriberKey")
    @ResponseBody
    public ResponseEntity getPhyPrescriberByPrescriberKey(@RequestParam("pid") String prescriberKey) {

        if (prescriberKey.isEmpty()) {
            return ResponseEntity.badRequest().body("prescriberKey value required.");
        }

        try {
            LOG.debug(">>>> in getPhyPrescriberByPrescriberKey");
            PhyPrescriber phy = claimServices.findPhyPrescriberByPrescriberKey(prescriberKey);
            if (phy == null) {
                return ResponseEntity.badRequest().body("Could not find a matching prescriber id qualifier");
            }
            return ResponseEntity.ok(phy);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    //Get Prescriber ID Count
    
    @GetMapping("/getPhyPrescriberIdCount")
    @ResponseBody
    public ResponseEntity getPhyPrescriberIdCount(@RequestParam("pid") String prescriberKey) {
        if (prescriberKey.isEmpty()) {
            return ResponseEntity.badRequest().body("prescriberKey value required.");
        }

        try {
            LOG.debug(">>>> in getPhyPrescriberByPrescriberKey");
            int result = claimServices.findPrescriberIdCount(prescriberKey);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
        	e.printStackTrace();
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
   
    
    //Get Facility ID Count
    
    @GetMapping("/getCareFacilityIdCount")
    @ResponseBody
    public ResponseEntity getCareFacilityIdCount(@RequestParam("cfid") String careFacilityId, @RequestParam("cid") String carCarrierId) {
        if (careFacilityId.isEmpty()) {
            return ResponseEntity.badRequest().body("careFacilityId value required.");
        }

        try {
            LOG.debug(">>>> in getPcareFacilityId");
            int result = claimServices.findcareFacilityIdCount(careFacilityId,carCarrierId);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
        	e.printStackTrace();
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    //Get Facility ID Count  
    
    @GetMapping("/getQualifierAbbreviation")
    @ResponseBody
    public ResponseEntity getQualifierAbbreviation(@RequestParam("pid") String PrfPrescriberId) {
    
        if (PrfPrescriberId.isEmpty()) {
            return ResponseEntity.badRequest().body("prescriberIdQualifier value required.");
        }

        try {
            LOG.debug(">>>> in getPhyPrescriberByPrescriberKey");
            String result = claimServices. findQualifierAbbreviation(PrfPrescriberId);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
        	e.printStackTrace();
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    @GetMapping("/getFormattedName")
    @ResponseBody
    public ResponseEntity getFormattedName(@RequestParam("pid") String PrfPrescriberId) {
    	
        if (PrfPrescriberId.isEmpty()) {
            return ResponseEntity.badRequest().body("prescriberIdQualifier value required.");
        }

        try {
            LOG.debug(">>>> in getPhyPrescriberByPrescriberKey");
            String result = claimServices. findFormattedName(PrfPrescriberId);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
        	e.printStackTrace();
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    @GetMapping("/getPrescriberIdState")
    @ResponseBody
    public ResponseEntity getPrescriberIdState(@RequestParam("pid") String PrfPrescriberId) {
    	
        if (PrfPrescriberId.isEmpty()) {
            return ResponseEntity.badRequest().body("prescriberIdQualifier value required.");
        }

        try {
            LOG.debug(">>>> in getPhyPrescriberByPrescriberKey");
            String result = claimServices. findPrescriberIdState(PrfPrescriberId);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
        	e.printStackTrace();
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    
    @GetMapping("/getCscCopayScheduleByPrimaryKey")
    @ResponseBody
    public ResponseEntity getCscCopayScheduleByPrimaryKey(@RequestParam("cid") String copayScheduleName, @RequestParam("sid") String stepNbr) {

        int stepNumber;

        if (copayScheduleName.isEmpty() || stepNbr.isEmpty()) {
            return ResponseEntity.badRequest().body("copayScheduleName and stepNbr values required.");
        }
        else if (!StringUtils.isNumeric(stepNbr)) {
            return ResponseEntity.badRequest().body("stepNbr must be a valid number.");
        }

        try {
            LOG.debug(">>>> in getCscCopayScheduleByPrimaryKey");
            stepNumber = Integer.parseInt(stepNbr);
            CscCopaySchedule csc = claimServices.findCopayScheduleByPrimaryKey(copayScheduleName, stepNumber);
            if (csc == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok().body(csc);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/getCareNetworkByCarrierIdAndNetworkId")
    @ResponseBody
    public ResponseEntity getCareNetworkByCarrierIdAndNetworkId(@RequestParam("cid") String carrierId, @RequestParam("nid") String networkId) {
        List<CnwCareNetwork> results = new ArrayList<CnwCareNetwork>();
        LOG.debug(">>>> in getCareNetworkByCarrierIdAndNetworkId carrierId=" + carrierId + " networkId=" + networkId);
        if (carrierId.isEmpty() || networkId.isEmpty()) {
            return ResponseEntity.badRequest().body("carrierId and networkId values required.");
        }
        try {
            results = claimServices.findCareNetworkByCarrierIdAndNetworkId(carrierId, networkId);
            if (results == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok().body(results);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/getPlanByPlanCodeAndEffDate")
    @ResponseBody
    public ResponseEntity getPlanByPlanCodeAndEffDate(@RequestParam("pc") String planCode, @RequestParam("efd") String effDate) {
        List<PlnPlan> results = new ArrayList<PlnPlan>();
        LOG.debug(">>>> in getPlanByPlanCodeAndEffDate planCode=" + planCode + " effDate=" + effDate);
        if (planCode.isEmpty() || effDate.isEmpty()) {
            return ResponseEntity.badRequest().body("planCode and effDate values required.");
        }
        else if (!StringUtils.isNumeric(effDate)) {
            return ResponseEntity.badRequest().body("effDate must be a valid number.");
        }

        try {
            int effDateNum = Integer.parseInt(effDate);
            results = claimServices.findPlanByPlanCodeAndEffDate(planCode, effDateNum);
            if (results == null || results.size()==0) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok().body(results);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/getCareQualifierByCarrierIdAndQualifierId")
    @ResponseBody
    public ResponseEntity getCareQualifierByCarrierIdAndQualifierId(@RequestParam("cid") String carrierId, @RequestParam("qid") String qualifierId) {

        if (carrierId.isEmpty() || qualifierId.isEmpty()) {
            return ResponseEntity.badRequest().body("carrierId and qualifierId values required.");
        }

        try {
            LOG.debug(">>>> in getCareQualifierByCarrierIdAndQualifierId");
            List<CquCareQualifier> cqu = claimServices.findCareQualifierByCarrierIdAndQualifierId(carrierId, qualifierId);
            if (cqu == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok().body(cqu);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/diagnosisCode")
    @ResponseBody
    public ResponseEntity getCareQualifierByCarrierIdAndQualifierId(@RequestParam("diagnosisCode") String diagnosisCode) {

        if (diagnosisCode.isEmpty()) {
            return ResponseEntity.badRequest().body("diagnosisCode is required.");
        }

        try {
            LOG.debug(">>>> in diagnosisCode");
            DigDiagnosis digDiagnosis = claimServices.findByDiagnosisCode(diagnosisCode);
            if (digDiagnosis == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok().body(digDiagnosis);
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    
 // Network Id Validation
    
    //1
    
    @GetMapping("/getValidQualifierForAllGroupAndAccount")
    @ResponseBody
    public ResponseEntity getValidQualifierForAllGroupAndAccount(@RequestParam("qid") String qualifierId,
    		                                    @RequestParam("cid") String carrierId,
    		                                    @RequestParam("aid") String accountId,
    		                                    @RequestParam("gid") String groupId
    		
    		) {
        if (qualifierId.isEmpty()||carrierId.isEmpty()||accountId.isEmpty()||groupId.isEmpty()) {
            return ResponseEntity.badRequest().body("All value required.");
        }

        try {
            LOG.debug(">>>> in qualifierId validation");
            String message = claimServices.findValidQualifierForAllGroupAndAccount(qualifierId,carrierId,accountId,groupId);
            return ResponseEntity.ok(message.trim());
        } catch (Exception e) {
        	e.printStackTrace();
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    
    
    //2
    @GetMapping("/getValidQualifierForAllAccount")
    @ResponseBody
    public ResponseEntity getValidQualifierForAllAccount(@RequestParam("qid") String qualifierId,
    		                                    @RequestParam("cid") String carrierId,
    		                                    @RequestParam("aid") String accountId,
    		                                    @RequestParam("gid") String groupId
    		
    		) {
        if (qualifierId.isEmpty()||carrierId.isEmpty()||accountId.isEmpty()||groupId.isEmpty()) {
            return ResponseEntity.badRequest().body("All value required.");
        }

        try {
            LOG.debug(">>>> in getValidNetworkExists");
            String message = claimServices.findValidQualifierForAllAccount(qualifierId,carrierId,accountId,groupId);
            return ResponseEntity.ok(message.trim());
        } catch (Exception e) {
        	e.printStackTrace();
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    //3
    @GetMapping("/getValidQualifierForAllGroup")
    @ResponseBody
    public ResponseEntity getValidQualifierForAllGroup(@RequestParam("qid") String qualifierId,
    		                                    @RequestParam("cid") String carrierId,
    		                                    @RequestParam("aid") String accountId,
    		                                    @RequestParam("gid") String groupId
    		
    		) {
        if (qualifierId.isEmpty()||carrierId.isEmpty()||accountId.isEmpty()||groupId.isEmpty()) {
            return ResponseEntity.badRequest().body("All value required.");
        }

        try {
            LOG.debug(">>>> in getValidNetworkExists");
            String message = claimServices.findValidQualifierForAllGroup(qualifierId,carrierId,accountId,groupId);
            return ResponseEntity.ok(message.trim());
        } catch (Exception e) {
        	e.printStackTrace();
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    //4
    @GetMapping("/getValidQualifierForCAG")
    @ResponseBody
    public ResponseEntity getValidQualifierForCAG(@RequestParam("qid") String qualifierId,
    		                                    @RequestParam("cid") String carrierId,
    		                                    @RequestParam("aid") String accountId,
    		                                    @RequestParam("gid") String groupId
    		
    		) {
        if (qualifierId.isEmpty()||carrierId.isEmpty()||accountId.isEmpty()||groupId.isEmpty()) {
            return ResponseEntity.badRequest().body("All value required.");
        }

        try {
            LOG.debug(">>>> in getValidQualifierForCAG");
            String message = claimServices.findValidQualifierForCAG(qualifierId,carrierId,accountId,groupId);
            return ResponseEntity.ok(message.trim());
        } catch (Exception e) {
        	e.printStackTrace();
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    
   //QualifierId validation ENDS 
    
    ///////---
    
 // Network Id Validation
    
    //1
    
    @GetMapping("/getValidNetworkForAllGroupAndAccount")
    @ResponseBody
    public ResponseEntity getValidNetworkForAllGroupAndAccount(@RequestParam("nid") String networkId,
    		                                    @RequestParam("cid") String carrierId,
    		                                    @RequestParam("aid") String accountId,
    		                                    @RequestParam("gid") String groupId
    		
    		) {
        if (networkId.isEmpty()||carrierId.isEmpty()||accountId.isEmpty()||groupId.isEmpty()) {
            return ResponseEntity.badRequest().body("All value required.");
        }

        try {
            LOG.debug(">>>> in getValidNetworkExists");
            String message = claimServices.findValidNetworkForAllGroupAndAccount(networkId,carrierId,accountId,groupId);
            return ResponseEntity.ok(message.trim());
        } catch (Exception e) {
        	e.printStackTrace();
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    
    
    //2
    @GetMapping("/getValidNetworkForAllAccount")
    @ResponseBody
    public ResponseEntity getValidNetworkForAllAccount(@RequestParam("nid") String networkId,
    		                                    @RequestParam("cid") String carrierId,
    		                                    @RequestParam("aid") String accountId,
    		                                    @RequestParam("gid") String groupId
    		
    		) {
        if (networkId.isEmpty()||carrierId.isEmpty()||accountId.isEmpty()||groupId.isEmpty()) {
            return ResponseEntity.badRequest().body("All value required.");
        }

        try {
            LOG.debug(">>>> in getValidNetworkExists");
            String message = claimServices.findValidNetworkForAllAccount(networkId,carrierId,accountId,groupId);
            return ResponseEntity.ok(message.trim());
        } catch (Exception e) {
        	e.printStackTrace();
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    //3
    @GetMapping("/getValidNetworkForAllGroup")
    @ResponseBody
    public ResponseEntity getValidNetworkForAllGroup(@RequestParam("nid") String networkId,
    		                                    @RequestParam("cid") String carrierId,
    		                                    @RequestParam("aid") String accountId,
    		                                    @RequestParam("gid") String groupId
    		
    		) {
        if (networkId.isEmpty()||carrierId.isEmpty()||accountId.isEmpty()||groupId.isEmpty()) {
            return ResponseEntity.badRequest().body("All value required.");
        }

        try {
            LOG.debug(">>>> in getValidNetworkExists");
            String message = claimServices.findValidNetworkForAllGroup(networkId,carrierId,accountId,groupId);
            return ResponseEntity.ok(message.trim());
        } catch (Exception e) {
        	e.printStackTrace();
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    //4
    @GetMapping("/getValidNetworkForCAG")
    @ResponseBody
    public ResponseEntity getValidNetworkForCAG(@RequestParam("nid") String networkId,
    		                                    @RequestParam("cid") String carrierId,
    		                                    @RequestParam("aid") String accountId,
    		                                    @RequestParam("gid") String groupId
    		
    		) {
        if (networkId.isEmpty()||carrierId.isEmpty()||accountId.isEmpty()||groupId.isEmpty()) {
            return ResponseEntity.badRequest().body("All value required.");
        }

        try {
            LOG.debug(">>>> in getValidNetworkExists");
            String message = claimServices.findValidNetworkForCAG(networkId,carrierId,accountId,groupId);
            return ResponseEntity.ok(message.trim());
        } catch (Exception e) {
        	e.printStackTrace();
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    
   //NetworkId validation ENDS

    @GetMapping("/getEmailDistributionList")
    @ResponseBody
    public ResponseEntity getEmailDistribution(@RequestParam("emailListId") String emailListId) {
        if (emailListId.isEmpty()) {
            return ResponseEntity.badRequest().body("Email list id required.");
        }

        try {
            EltEmailDistribution eltEmailDistribution = claimServices.findByEltEmailDistListID(URLDecoder.decode(emailListId,StandardCharsets.UTF_8.toString()));

            if (eltEmailDistribution == null) {
                return ResponseEntity.notFound().build();
            }

            return ResponseEntity.ok().body(eltEmailDistribution);
        }
        catch (Exception e) {
            LOG.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
}

