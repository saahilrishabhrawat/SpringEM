package com.optum.rxclaimnextgen.elg.services.impl;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.HashMap;
import java.net.URLEncoder;

import com.optum.rxclaimnextgen.elg.entities.*;
import com.optum.rxclaimnextgen.elg.repositories.*;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.optum.rxclaimnextgen.elg.exceptions.ValidationException;
import com.optum.rxclaimnextgen.elg.pojo.EligAltInsuranceDefaultDetail;
import com.optum.rxclaimnextgen.elg.pojo.EligCoverageDefaultDetail;
import com.optum.rxclaimnextgen.elg.pojo.EligMemberCareAssignDetailForm;
import com.optum.rxclaimnextgen.elg.pojo.EligMemberDefaultDetailsForm;
import com.optum.rxclaimnextgen.elg.pojo.EligMemberHimDefaultOvrDetailForm;
import com.optum.rxclaimnextgen.elg.pojo.EligMemberIncidentDefaultDetailForm;
import com.optum.rxclaimnextgen.elg.pojo.EligMemberOverrideDetailForm;
import com.optum.rxclaimnextgen.elg.pojo.TypeAheadType;
import com.optum.rxclaimnextgen.elg.services.EligProfileMemberServices;
import com.optum.rxclaimnextgen.elg.services.NonEligAPIServices;
import com.optum.rxclaimnextgen.elg.services.helper.EligProfileMemberServiceHelper;
import com.optum.rxclaimnextgen.elg.utils.DateUtils;


/**
 * Created by gsharm40 on 06/25/2018.
 */
@Service
public class EligProfileMemberServicesImpl implements EligProfileMemberServices {

    private static final Logger LOG = LoggerFactory.getLogger(EligProfileServicesImpl.class);
    @Autowired
    private NonEligAPIServices nonEligAPIServices;

    @Autowired
    private ElgEligProfileEpfRepository eligProfEpfRepo;
    @Autowired
    private ElgEligMemberDefaultsOvrEmhRepository elgEligMemberDefaultsOvrEmhRepository;
    
    @Autowired
    private ElgEligMemberDefaultsEmdRepository elgMemberDefaultsEmdRepo;

    @Autowired
    private ElgEligMemberDefaultsOvrEmhRepository elgMemberDefaultsOvrEmhRepo;

    @Autowired
    private ElgMemberPartdDefaultsEmpRepository elgMemberPartdDefaultsRepo;

    @Autowired
    private ElgMbrOtherCoverageDefaultsEmcRepository elgMbrOtherCoverageDefaultsEmcRepository;
    

    @Autowired
    private ElgEodEligOverrideDfltsRepository elgEodEligOverrideDfltsRepo;
    
    @Autowired
    private ElgEligWCDefaultsEwdRepository elgEligWCDefaultsEwdRepo;

    @Autowired
    private ElgEligGroupDefaultsEgdRepository elgEligGroupDefaultsEgdRepo;

    @Autowired
    private EligProfileMemberServiceHelper memberServiceHelper;

    @Autowired
    private ElgEligMemberDefaultsEmdRepository elgEligMemberDefaultsEmdRepository;

    public EligMemberHimDefaultOvrDetailForm saveHimDefaultOverrideDetails(String jsonString) throws IOException {
        String results = null;
        ObjectMapper mapper = new ObjectMapper();
        EligMemberHimDefaultOvrDetailForm formData = mapper.readValue(jsonString, new TypeReference<EligMemberHimDefaultOvrDetailForm>() {
        });
        
        EligMemberHimDefaultOvrDetailForm eligMemberHimDefaultOvrDetailForm = populatePojoFromEntity(callUpsert(formData));
        eligMemberHimDefaultOvrDetailForm.setMessage("SUCCESS");
        return eligMemberHimDefaultOvrDetailForm;
    }

    private ElgEligMemberDefaultsOvrEmh callUpsert(EligMemberHimDefaultOvrDetailForm eligMemberHimDefaultOvrDetailForm) {
        ElgEligMemberDefaultsOvrEmh elgEligMemberDefaultsOvrEmh;
        elgEligMemberDefaultsOvrEmh = getMemberHimDefaultsOvrDetailsByPrimaryKey(eligMemberHimDefaultOvrDetailForm.getCarCarrierId(), eligMemberHimDefaultOvrDetailForm.getAccountId(), eligMemberHimDefaultOvrDetailForm.getGroupId());
        if (elgEligMemberDefaultsOvrEmh == null) {
            elgEligMemberDefaultsOvrEmh = new ElgEligMemberDefaultsOvrEmh();
            elgEligMemberDefaultsOvrEmh.setCarCarrierId(eligMemberHimDefaultOvrDetailForm.getCarCarrierId());
            elgEligMemberDefaultsOvrEmh.setAccountId(eligMemberHimDefaultOvrDetailForm.getAccountId());
            elgEligMemberDefaultsOvrEmh.setGroupId(eligMemberHimDefaultOvrDetailForm.getGroupId());
            elgEligMemberDefaultsOvrEmh.setAddDate(DateUtils.currentDate());
            elgEligMemberDefaultsOvrEmh.setAddTime(DateUtils.currentTime());
            elgEligMemberDefaultsOvrEmh.setAddProgramName("JAVA_PRG");
            elgEligMemberDefaultsOvrEmh.setAddUserName("TEST_USER");
            elgEligMemberDefaultsOvrEmh.setChgDate(DateUtils.currentDate());
            elgEligMemberDefaultsOvrEmh.setChgTime(DateUtils.currentTime());
            elgEligMemberDefaultsOvrEmh.setChgProgramName("JAVA_PRG");
            elgEligMemberDefaultsOvrEmh.setChgUserName("TEST_USER");

        } else {
            elgEligMemberDefaultsOvrEmh.setChgDate(DateUtils.currentDate());
            elgEligMemberDefaultsOvrEmh.setChgTime(DateUtils.currentTime());
            elgEligMemberDefaultsOvrEmh.setChgProgramName("JAVA_PRG");
            elgEligMemberDefaultsOvrEmh.setChgUserName("TEST_USER");
        }
        elgEligMemberDefaultsOvrEmh.setEmhHimFromThruDateI(eligMemberHimDefaultOvrDetailForm.getEmhHimFromThruDateI());
        elgEligMemberDefaultsOvrEmh.setEmhHimFromThruDateR(eligMemberHimDefaultOvrDetailForm.getEmhHimFromThruDateR());
        elgEligMemberDefaultsOvrEmh.setEmhQhpPlanIdInd(eligMemberHimDefaultOvrDetailForm.getEmhQhpPlanIdInd());
        elgEligMemberDefaultsOvrEmh.setEmhQhpPlanIdRep(eligMemberHimDefaultOvrDetailForm.getEmhQhpPlanIdRep());
        elgEligMemberDefaultsOvrEmh.setEmhCsrLevelInd(eligMemberHimDefaultOvrDetailForm.getEmhCsrLevelInd());
        elgEligMemberDefaultsOvrEmh.setEmhCsrLevelRep(eligMemberHimDefaultOvrDetailForm.getEmhCsrLevelRep());
        elgEligMemberDefaultsOvrEmh.setEmhMetalLevelInd(eligMemberHimDefaultOvrDetailForm.getEmhMetalLevelInd());
        elgEligMemberDefaultsOvrEmh.setEmhMetalLevelIndRep(eligMemberHimDefaultOvrDetailForm.getEmhMetalLevelIndRep());
        elgEligMemberDefaultsOvrEmh.setEmhMemberEthnicityInd(eligMemberHimDefaultOvrDetailForm.getEmhMemberEthnicityInd());
        elgEligMemberDefaultsOvrEmh.setEmhMemberEthnicityRep(eligMemberHimDefaultOvrDetailForm.getEmhMemberEthnicityRep());
        elgEligMemberDefaultsOvrEmh.setEmhAptcIndicator(eligMemberHimDefaultOvrDetailForm.getEmhAptcIndicator());
        elgEligMemberDefaultsOvrEmh.setEmhHimGraceStartEndI(eligMemberHimDefaultOvrDetailForm.getEmhHimGraceStartEndI());
        elgEligMemberDefaultsOvrEmh.setEmhHimGraceStartEndR(eligMemberHimDefaultOvrDetailForm.getEmhHimGraceStartEndR());
        elgEligMemberDefaultsOvrEmh.setEmhFamilyIdReproc(eligMemberHimDefaultOvrDetailForm.getEmhFamilyIdReproc());
        return upsert(elgEligMemberDefaultsOvrEmh);
    }

    public ElgEligMemberDefaultsOvrEmh upsert(ElgEligMemberDefaultsOvrEmh elgEligMemberDefaultsOvrEmh) {
        return elgEligMemberDefaultsOvrEmhRepository.saveAndFlush(elgEligMemberDefaultsOvrEmh);
    }


    public EligMemberHimDefaultOvrDetailForm populateHimDefaultsOvrDetailsByPrimaryKey(String carrierId, String accountId, String groupId) {
    	EligMemberHimDefaultOvrDetailForm  eligMemberHimDefaultOvrDetailForm  = null;
        ElgEligMemberDefaultsOvrEmh elgEligMemberDefaultsOvrEmh = getMemberHimDefaultsOvrDetailsByPrimaryKey(carrierId, accountId, groupId);
        
        if(elgEligMemberDefaultsOvrEmh!=null)
         eligMemberHimDefaultOvrDetailForm = populatePojoFromEntity(elgEligMemberDefaultsOvrEmh);
        
        return eligMemberHimDefaultOvrDetailForm;
    }

    public ElgEligMemberDefaultsOvrEmh getMemberHimDefaultsOvrDetailsByPrimaryKey(String carrierId, String accountId, String groupId) {
        ElgEligMemberDefaultsOvrEmh elgEligMemberDefaultsOvrEmh = elgEligMemberDefaultsOvrEmhRepository.findByCarCarrierIdAndAccountIdAndGroupId(carrierId, accountId, groupId);       
        return elgEligMemberDefaultsOvrEmh;
    }

    public EligMemberHimDefaultOvrDetailForm populatePojoFromEntity(ElgEligMemberDefaultsOvrEmh elgEligMemberDefaultsOvrEmh) {
        EligMemberHimDefaultOvrDetailForm eligMemberHimDefaultOvrDetailForm = new EligMemberHimDefaultOvrDetailForm();
        eligMemberHimDefaultOvrDetailForm.setCarCarrierId(elgEligMemberDefaultsOvrEmh.getCarCarrierId());
        eligMemberHimDefaultOvrDetailForm.setAccountId(elgEligMemberDefaultsOvrEmh.getAccountId());
        eligMemberHimDefaultOvrDetailForm.setGroupId(elgEligMemberDefaultsOvrEmh.getGroupId());
        eligMemberHimDefaultOvrDetailForm.setEmhHimFromThruDateI(elgEligMemberDefaultsOvrEmh.getEmhHimFromThruDateI());
        eligMemberHimDefaultOvrDetailForm.setEmhHimFromThruDateR(elgEligMemberDefaultsOvrEmh.getEmhHimFromThruDateR());
        eligMemberHimDefaultOvrDetailForm.setEmhQhpPlanIdInd(elgEligMemberDefaultsOvrEmh.getEmhQhpPlanIdInd());
        eligMemberHimDefaultOvrDetailForm.setEmhQhpPlanIdRep(elgEligMemberDefaultsOvrEmh.getEmhQhpPlanIdRep());
        eligMemberHimDefaultOvrDetailForm.setEmhCsrLevelInd(elgEligMemberDefaultsOvrEmh.getEmhCsrLevelInd());
        eligMemberHimDefaultOvrDetailForm.setEmhCsrLevelRep(elgEligMemberDefaultsOvrEmh.getEmhCsrLevelRep());
        eligMemberHimDefaultOvrDetailForm.setEmhMetalLevelInd(elgEligMemberDefaultsOvrEmh.getEmhMetalLevelInd());
        eligMemberHimDefaultOvrDetailForm.setEmhMetalLevelIndRep(elgEligMemberDefaultsOvrEmh.getEmhMetalLevelIndRep());
        eligMemberHimDefaultOvrDetailForm.setEmhMemberEthnicityInd(elgEligMemberDefaultsOvrEmh.getEmhMemberEthnicityInd());
        eligMemberHimDefaultOvrDetailForm.setEmhMemberEthnicityRep(elgEligMemberDefaultsOvrEmh.getEmhMemberEthnicityRep());
        eligMemberHimDefaultOvrDetailForm.setEmhAptcIndicator(elgEligMemberDefaultsOvrEmh.getEmhAptcIndicator());
        eligMemberHimDefaultOvrDetailForm.setEmhHimGraceStartEndI(elgEligMemberDefaultsOvrEmh.getEmhHimGraceStartEndI());
        eligMemberHimDefaultOvrDetailForm.setEmhHimGraceStartEndR(elgEligMemberDefaultsOvrEmh.getEmhHimGraceStartEndR());
        eligMemberHimDefaultOvrDetailForm.setEmhFamilyIdReproc(elgEligMemberDefaultsOvrEmh.getEmhFamilyIdReproc());

        eligMemberHimDefaultOvrDetailForm.setAddDate(DateUtils.convertDateToString(elgEligMemberDefaultsOvrEmh.getAddDate()));
        eligMemberHimDefaultOvrDetailForm.setAddTime(elgEligMemberDefaultsOvrEmh.getAddTime().toString());
        eligMemberHimDefaultOvrDetailForm.setAddProgramName(elgEligMemberDefaultsOvrEmh.getAddProgramName());
        eligMemberHimDefaultOvrDetailForm.setAddUserName(elgEligMemberDefaultsOvrEmh.getAddUserName());
        eligMemberHimDefaultOvrDetailForm.setChgDate(DateUtils.convertDateToString(elgEligMemberDefaultsOvrEmh.getChgDate()));
        eligMemberHimDefaultOvrDetailForm.setChgTime(elgEligMemberDefaultsOvrEmh.getChgTime().toString());
        eligMemberHimDefaultOvrDetailForm.setChgProgramName(elgEligMemberDefaultsOvrEmh.getChgProgramName());
        eligMemberHimDefaultOvrDetailForm.setChgUserName(elgEligMemberDefaultsOvrEmh.getChgUserName());
        return eligMemberHimDefaultOvrDetailForm;

    }
    public ElgEligMemberDefaultsEmd findMemberDefaultsEmdByPrimaryKey(String carCarrierId, String accountId, String groupId) {
        return elgMemberDefaultsEmdRepo.findByCarCarrierIdAndAccountIdAndGroupId(carCarrierId, accountId, groupId);
    }

    public ElgEligMemberDefaultsOvrEmh findMemberDefaultsOvrEmhByPrimaryKey(String carCarrierId, String accountId, String groupId) {
        return elgMemberDefaultsOvrEmhRepo.findByCarCarrierIdAndAccountIdAndGroupId(carCarrierId, accountId, groupId);
    }

    public ElgMemberPartdDefaultsEmp findMemberPartdDefaultsEmpByPrimaryKey(String carCarrierId, String accountId, String groupId) {
        return elgMemberPartdDefaultsRepo.findByCarCarrierIdAndAccountIdAndGroupId(carCarrierId, accountId, groupId);
    }

    public ElgMbrOtherCoverageDefaultsEmc findMbrOtherCovDefaultsByPrimaryKey(String carCarrierId, String accountId, String groupId) {
        return elgMbrOtherCoverageDefaultsEmcRepository.findByCarCarrierIdAndAccountIdAndGroupId(carCarrierId, accountId, groupId);
    }
    
    
    
    
    /**
     * CARE ASSIGNMENT FORM STARTS HERE
     */
    
    
    
    /**
     * Populate Data for the Care Assign
     * @param carrierId
     * @param accountId
     * @param groupId
     * @return  Care Assign form to Controller
     * @throws Exception 
     */
        public EligMemberCareAssignDetailForm populateCareAssignDetailsByPrimaryKey(String carrierId, String accountId, String groupId, String platformId) throws Exception {
        	EligMemberCareAssignDetailForm eligMemberCareAssignDetailForm = null;
        	ElgEligMemberDefaultsEmd elgEligCareAssign = getCareAssignByPrimaryKey(carrierId, accountId, groupId);
        	if(elgEligCareAssign!=null)
             eligMemberCareAssignDetailForm = populateCareAssignPojoFromEntity(elgEligCareAssign,platformId);
            return eligMemberCareAssignDetailForm;
        }
    /**
     * Get Data from Data base for Care Assign
     * @param carrierId
     * @param accountId
     * @param groupId
     * @return  elgEligCareAssign that comes from Data Base
     */
      public ElgEligMemberDefaultsEmd getCareAssignByPrimaryKey(String carrierId, String accountId, String groupId) {
    	  ElgEligMemberDefaultsEmd elgEligCareAssign = elgMemberDefaultsEmdRepo.findByCarCarrierIdAndAccountIdAndGroupId(carrierId, accountId, groupId);
    	 
    	  return elgEligCareAssign;
      }
        
    
    /**
     * Populate Care Assign Pojo From Entity
     * @param elgEligCareAssign
     * @return EligMemberCareAssignDetailForm
     * @throws Exception 
     */
    public EligMemberCareAssignDetailForm populateCareAssignPojoFromEntity(ElgEligMemberDefaultsEmd elgEligCareAssign, String platformId) throws Exception {
    	EligMemberCareAssignDetailForm eligMemberCareAssignDetailForm = new EligMemberCareAssignDetailForm();
    	eligMemberCareAssignDetailForm.setCarCarrierId(elgEligCareAssign.getCarCarrierId());
    	eligMemberCareAssignDetailForm.setAccountId(elgEligCareAssign.getAccountId());
    	eligMemberCareAssignDetailForm.setGroupId(elgEligCareAssign.getGroupId());
    	eligMemberCareAssignDetailForm.setCarCarrierId(elgEligCareAssign.getCarCarrierId()) ;
    	eligMemberCareAssignDetailForm.setAccountId(elgEligCareAssign.getAccountId());
    	eligMemberCareAssignDetailForm.setGroupId(elgEligCareAssign.getGroupId());
    	eligMemberCareAssignDetailForm.setEmdCareEffDate(DateUtils.convertUtilDateTODateType(elgEligCareAssign.getEmdCareEffDate()));
    	eligMemberCareAssignDetailForm.setEmdCareEffDateInd(elgEligCareAssign.getEmdCareEffDateInd()) ;
    	eligMemberCareAssignDetailForm.setEmdCareThruDateInd(elgEligCareAssign.getEmdCareThruDateInd());
    	eligMemberCareAssignDetailForm.setEmdCareThruDate(DateUtils.convertUtilDateTODateType(elgEligCareAssign.getEmdCareThruDate())) ;
    	eligMemberCareAssignDetailForm.setEmdCareFacilityInd(elgEligCareAssign.getEmdCareFacilityInd() ) ;
    	eligMemberCareAssignDetailForm.setEmdNetworkInd(elgEligCareAssign.getEmdNetworkInd()) ;
       	eligMemberCareAssignDetailForm.setEmdQualifierInd(elgEligCareAssign.getEmdQualifierInd() );
    	eligMemberCareAssignDetailForm.setCnwNetworkID(elgEligCareAssign.getCnwNetworkId()) ;
    	eligMemberCareAssignDetailForm.setEmdMCFOvrPlanInd(elgEligCareAssign.getEmdMcfOvrPlanInd()) ;
   	    eligMemberCareAssignDetailForm.setEmdMCFOvrPlanCode(elgEligCareAssign.getEmdMcfOvrPlanCode());
    	eligMemberCareAssignDetailForm.setEmdMCFOvrPlanEffDate(DateUtils.convertUtilDateTODateType(elgEligCareAssign.getEmdMcfOvrPlanEffDate())) ;
    	eligMemberCareAssignDetailForm.setCfaCareFacilityID(elgEligCareAssign.getCfaCareFacilityId() ) ;
    	eligMemberCareAssignDetailForm.setCquQualifierID(elgEligCareAssign.getCquQualifierId()) ;
    	eligMemberCareAssignDetailForm.setEmdPhysicianIDInd(elgEligCareAssign.getEmdPhysicianIdInd());
    	eligMemberCareAssignDetailForm.setPrfPrescriberID(elgEligCareAssign.getPrfPrescriberId());
    	eligMemberCareAssignDetailForm.setWrkPHYFormattedName(getWrkPHYFormattedName( platformId, elgEligCareAssign.getPrfPrescriberId()) ) ;
   	    eligMemberCareAssignDetailForm.setPrfPrescriberIDState(getPrescriberIdState(platformId, elgEligCareAssign.getPrfPrescriberId() )) ;
   	    
     	eligMemberCareAssignDetailForm.setAddDate(DateUtils.convertDateToString(elgEligCareAssign.getAddDate()));
    	eligMemberCareAssignDetailForm.setAddTime(elgEligCareAssign.getAddTime().toString());
    	eligMemberCareAssignDetailForm.setAddProgramName(elgEligCareAssign.getAddProgramName());
    	eligMemberCareAssignDetailForm.setAddUserName(elgEligCareAssign.getAddUserName());
    	eligMemberCareAssignDetailForm.setChgDate(DateUtils.convertDateToString(elgEligCareAssign.getChgDate()));
        eligMemberCareAssignDetailForm.setChgTime(elgEligCareAssign.getChgTime().toString());
        eligMemberCareAssignDetailForm.setChgProgramName(elgEligCareAssign.getChgProgramName());
        eligMemberCareAssignDetailForm.setChgUserName(elgEligCareAssign.getChgUserName());
        if(platformId!=null) {
        eligMemberCareAssignDetailForm.setPrqQualAbbreviation(getQualifierAbbreviation(platformId, elgEligCareAssign.getPrfPrescriberId() )) ;
        }
        return eligMemberCareAssignDetailForm;

    }
    
    /**
   	 * Care Assignment save data method will come here ...
   	 */
   	@Override
   	public EligMemberCareAssignDetailForm saveCareAssignDetails(String jsonString, String platformId) throws IOException, ValidationException, Exception  {
   		
   	    String results = null;
        ObjectMapper mapper = new ObjectMapper();
        EligMemberCareAssignDetailForm formData = mapper.readValue(jsonString, new TypeReference<EligMemberCareAssignDetailForm>() {
        });
        EligMemberCareAssignDetailForm eligMemberCareAssignDetailForm = null;
        HashMap<String, String> validationErrors = validateCareAssignForm(formData);
        if (validationErrors.isEmpty()) {
        	 eligMemberCareAssignDetailForm = populateCareAssignPojoFromEntity(callCareAssignUpsert(formData),platformId);
             eligMemberCareAssignDetailForm.setMessage("SUCCESS");
             
        }
        else {
            // An error occurred. Throw an exception
            throw new ValidationException(mapper.writer().writeValueAsString(validationErrors));
        }
        return eligMemberCareAssignDetailForm;
       
   	}
    public ElgEligProfileEpf getProfileByPrimaryKey(String carrierId, String accountId, String groupId) {
        return eligProfEpfRepo.findByCarCarrierIdAndAccountIdAndGroupId(carrierId, accountId, groupId);
    }
    private HashMap<String, String> validateCareAssignForm(EligMemberCareAssignDetailForm formData) throws Exception {
        HashMap validationErrors = new HashMap<String, String>();
        boolean foundAnError = false;
        
        ElgEligProfileEpf elgEligProfileEpf;
        elgEligProfileEpf = getProfileByPrimaryKey(formData.getCarCarrierId(),formData.getAccountId(),formData.getGroupId());
        String reformatVersion = elgEligProfileEpf.getEpfReformatVersion().trim();
        String prfPrescriberId =formData.getPrfPrescriberID();
        String careFacilityId=formData.getCfaCareFacilityID();
       
       
        
        int prfPrescriberIdlength=prfPrescriberId.trim().length();
        String networkPlanCode=formData.getEmdMCFOvrPlanCode();
        java.sql.Date  sqlnetworkPlanDate=DateUtils.parseToSqlDateType(formData.getEmdMCFOvrPlanEffDate()) ;   
        
        // for network Validation
        String carCarrierId=formData.getCarCarrierId();
        String accountId=formData.getAccountId();
        String groupId=formData.getGroupId();
        
        
        
        String networkPlanDate=DateUtils.convertDateToString(sqlnetworkPlanDate);
   
         if (!"50".equals(reformatVersion)&& prfPrescriberIdlength>10) {
        	
             validationErrors.put("emdPhysicianIDInd", "This profile cannot use a Provider ID with more than 10 characters");
             foundAnError = true;
         }
    
         
         if (!prfPrescriberId.equals("")) {
       
        	 int count=checkIfMultiplePrescriberIdExists(formData.getPlatformId(),prfPrescriberId);
            
        	 if(count>1) {
        	 validationErrors.put("prescriberIdMultiple", "Multiple records found");
             foundAnError = true;
             }
            
            if(count==0) {
           	 validationErrors.put("prescriberId", "Provider not found");
                foundAnError = true;
                }
         }
         
         if (!careFacilityId.equals("")) {
             
        	 int count=checkIfCareFacilityIdExists(formData.getPlatformId(),careFacilityId,carCarrierId);
            
            
            if(count==0) {
           	 validationErrors.put("careFacilityId", "Facility was not found");
                foundAnError = true;
                }
         }
         
 if (!networkPlanCode.equals("") &&!networkPlanDate.equals("") ) {
	 
            
 String result=checkIfNetworkPlanCodeExists(formData.getPlatformId(),networkPlanCode,DateUtils.convertDateToCenturyDate(networkPlanDate));

          if(result==null) {
           	 validationErrors.put("networkPlanCode", "Plan was not found");
              foundAnError = true;
               }
 }
 
 //Validate Network
 
 if (!formData.getCnwNetworkID().equals("")) {
	 
	 String message=validNetworkExists(formData.getPlatformId(),formData.getCnwNetworkID(),carCarrierId,formData.getAccountId(),formData.getGroupId());

    if(!"Success".equals(message)) {
   	 validationErrors.put("networkId", message);
        foundAnError = true;
        }
 }
    
 
 //Validate Qualifier
 
 if (!formData.getCquQualifierID().equals("")) {
	 
	 String message=validQualifierExists(formData.getPlatformId(),formData.getCquQualifierID(),carCarrierId,formData.getAccountId(),formData.getGroupId());
    System.out.println("Qualifier>>>>>" + message);
	 if(!"Success".equals(message)) {
  	 validationErrors.put("qualifierId", message);
       foundAnError = true;
       }
}
   
        
        return validationErrors;
    }
    
    //Care Assign Service 2 validatiom
    
   public String validNetworkExists(String platformId,String cnwNetworkID,String carCarrierId,String accountId,String groupId) throws Exception {
	   
	   String api="";
	   
	     //Case 1 C = ?, A =*ALL, G = *ALL
		 if (accountId.trim().equals("*ALL")&& groupId.trim().equals("*ALL"))
		 {
			 api = "/getValidNetworkForAllGroupAndAccount?nid="+URLEncoder.encode(cnwNetworkID.trim(),"UTF-8")+"&cid=" + carCarrierId.trim() +"&aid=" + accountId.trim()+"&gid=" + groupId.trim(); 
		 }
		 //CASE 2 -  C = ?, A =*ALL, G =?
		 else if (accountId.trim().equals("*ALL") && !groupId.trim().equals("*ALL"))
		 {
			 api = "/getValidNetworkForAllAccount?nid="+URLEncoder.encode(cnwNetworkID.trim(),"UTF-8")+"&cid=" + carCarrierId.trim() +"&aid=" + accountId.trim()+"&gid=" + groupId.trim(); 
		 }
		 //CASE 3 - C = ?, A =?, G =*ALL
		 else if (groupId.trim().equals("*ALL") && !accountId.trim().equals("*ALL"))
		 {
			 api = "/getValidNetworkForAllGroup?nid="+URLEncoder.encode(cnwNetworkID.trim(),"UTF-8")+"&cid=" + carCarrierId.trim() +"&aid=" + accountId.trim()+"&gid=" + groupId.trim();
		 }
		//CSE4-c? a? g ?
		 else {
			 api = "/getValidNetworkForCAG?nid="+URLEncoder.encode(cnwNetworkID.trim(),"UTF-8")+"&cid=" + carCarrierId.trim() +"&aid=" + accountId.trim()+"&gid=" + groupId.trim();
			 
		 }  
		String message = nonEligAPIServices.callNonEligDataService(platformId, api);
		return message; 
   }
    
   //Care Assign Backend Validations
   
   public String validQualifierExists(String platformId,String qualifierID,String carCarrierId,String accountId,String groupId) throws Exception {
	   
	   String api="";
	   
	     //Case 1 C = ?, A =*ALL, G = *ALL
		 if (accountId.trim().equals("*ALL")&& groupId.trim().equals("*ALL"))
		 {
			 api = "/getValidQualifierForAllGroupAndAccount?qid="+URLEncoder.encode(qualifierID.trim(),"UTF-8")+"&cid=" + carCarrierId.trim() +"&aid=" + accountId.trim()+"&gid=" + groupId.trim(); 
		 }
		 //CASE 2 -  C = ?, A =*ALL, G =?
		 else if (accountId.trim().equals("*ALL") && !groupId.trim().equals("*ALL"))
		 {
			 api = "/getValidQualifierForAllAccount?qid="+URLEncoder.encode(qualifierID.trim(),"UTF-8")+"&cid=" + carCarrierId.trim() +"&aid=" + accountId.trim()+"&gid=" + groupId.trim(); 
		 }
		 //CASE 3 - C = ?, A =?, G =*ALL
		 else if (groupId.trim().equals("*ALL") && !accountId.trim().equals("*ALL"))
		 {
			 api = "/getValidQualifierForAllGroup?qid="+URLEncoder.encode(qualifierID.trim(),"UTF-8")+"&cid=" + carCarrierId.trim() +"&aid=" + accountId.trim()+"&gid=" + groupId.trim();
		 }
		//CSE4-c? a? g ?
		 else {
			 api = "/getValidQualifierForCAG?qid="+URLEncoder.encode(qualifierID.trim(),"UTF-8")+"&cid=" + carCarrierId.trim() +"&aid=" + accountId.trim()+"&gid=" + groupId.trim();
			 
		 }  
		String message = nonEligAPIServices.callNonEligDataService(platformId, api);
		return message; 
   }
   
   
    
    public int checkIfMultiplePrescriberIdExists(String platformId, String prescriberId) throws Exception {
    	
    	String api = "/getPhyPrescriberIdCount?pid="+URLEncoder.encode(prescriberId.trim(),"UTF-8") ;
        String results = nonEligAPIServices.callNonEligDataService(platformId, api);
    	int count = Integer.parseInt(results);	
      
        return count;
      
    }
  public String checkIfNetworkPlanCodeExists(String platformId, String networkPlanCode, int networkPlanDate) throws Exception {
	  
	  if (networkPlanCode==null) {
  		return null;
  	}
    	String api = "/getPlanByPlanCodeAndEffDate?pc="+URLEncoder.encode(networkPlanCode.trim(),"UTF-8")+"&efd=" + networkPlanDate ;
   
    	String results = nonEligAPIServices.callNonEligDataService(platformId, api);	
        return results;
      
    }
    public int checkIfCareFacilityIdExists(String platformId, String careFacilityId,String carCarrierId) throws Exception {
    	if (careFacilityId==null) {
    		return 0;
    	}
    	String api = "/getCareFacilityIdCount?cfid="+URLEncoder.encode(careFacilityId.trim(),"UTF-8")+"&cid=" + URLEncoder.encode(carCarrierId.trim(),"UTF-8") ;
        String results = nonEligAPIServices.callNonEligDataService(platformId, api);
    	int count = Integer.parseInt(results);	
    
       return count;
      
    }
    public String getQualifierAbbreviation(String platformId, String PrfPrescriberId) throws Exception {
    	if (PrfPrescriberId==null) {
    		return null;
    	}
   	  
       String api = "/getQualifierAbbreviation?pid=" +URLEncoder.encode(PrfPrescriberId.trim(),"UTF-8") ;
       String results = nonEligAPIServices.callNonEligDataService(platformId, api);
       return results;
     
   }
    
    public String getPrescriberIdState(String platformId, String PrfPrescriberId) throws Exception {
    	if (PrfPrescriberId==null) {
    		return null;
    	}
      	  String api = "/getPrescriberIdState?pid=" +URLEncoder.encode(PrfPrescriberId.trim(),"UTF-8") ;
          String results = nonEligAPIServices.callNonEligDataService(platformId, api);
          return results;
        
      }
    
    public String getWrkPHYFormattedName( String platformId, String PrfPrescriberId) throws Exception {
    	if (PrfPrescriberId==null) {
    		return null;
    	}
    	  String api = "/getFormattedName?pid=" +URLEncoder.encode(PrfPrescriberId.trim(),"UTF-8") ;
          String results = nonEligAPIServices.callNonEligDataService(platformId, api);
          return results;
    }
     	   	
    private ElgEligMemberDefaultsEmd callCareAssignUpsert(EligMemberCareAssignDetailForm eligMemberCareAssignDetailForm) {
    	
    	 ElgEligMemberDefaultsEmd elgEligCareAssign;
    	 elgEligCareAssign = getCareAssignByPrimaryKey(eligMemberCareAssignDetailForm.getCarCarrierId(), eligMemberCareAssignDetailForm.getAccountId(), eligMemberCareAssignDetailForm.getGroupId());
        if (elgEligCareAssign == null) {
        	elgEligCareAssign = new ElgEligMemberDefaultsEmd();
        	elgEligCareAssign.setCarCarrierId(eligMemberCareAssignDetailForm.getCarCarrierId());
        	elgEligCareAssign.setAccountId(eligMemberCareAssignDetailForm.getAccountId());
        	elgEligCareAssign.setGroupId(eligMemberCareAssignDetailForm.getGroupId());
        	elgEligCareAssign.setAddDate(DateUtils.currentDate());
        	elgEligCareAssign.setAddTime(DateUtils.currentTime());
        	elgEligCareAssign.setAddProgramName("JAVA_PRG");
        	elgEligCareAssign.setAddUserName("TEST_USER");
        	elgEligCareAssign.setChgDate(DateUtils.currentDate());
        	elgEligCareAssign.setChgTime(DateUtils.currentTime());
        	elgEligCareAssign.setChgProgramName("JAVA_PRG");
        	elgEligCareAssign.setChgUserName("TEST_USER");

        } else {
        	elgEligCareAssign.setChgDate(DateUtils.currentDate());
        	elgEligCareAssign.setChgTime(DateUtils.currentTime());
        	elgEligCareAssign.setChgProgramName("JAVA_PRG"); 
        	elgEligCareAssign.setChgUserName("TEST_USER");
        }
         elgEligCareAssign.setEmdCareEffDate(DateUtils.parseToSqlDateType(eligMemberCareAssignDetailForm.getEmdCareEffDate()));
    	 elgEligCareAssign.setEmdCareEffDateInd(eligMemberCareAssignDetailForm.getEmdCareEffDateInd() ) ;
    	 elgEligCareAssign.setEmdCareThruDateInd(eligMemberCareAssignDetailForm.getEmdCareThruDateInd());
    	 elgEligCareAssign.setEmdCareThruDate(DateUtils.parseToSqlDateType(eligMemberCareAssignDetailForm.getEmdCareThruDate())) ;
    	 elgEligCareAssign.setEmdCareFacilityInd(eligMemberCareAssignDetailForm.getEmdCareFacilityInd())  ;
    	 elgEligCareAssign.setEmdNetworkInd(eligMemberCareAssignDetailForm.getEmdNetworkInd()) ;
       	 elgEligCareAssign.setEmdQualifierInd(eligMemberCareAssignDetailForm.getEmdQualifierInd()) ;
    	 elgEligCareAssign.setCnwNetworkId(eligMemberCareAssignDetailForm.getCnwNetworkID()) ;
    	 elgEligCareAssign.setEmdMcfOvrPlanInd(eligMemberCareAssignDetailForm.getEmdMCFOvrPlanInd()) ;
   	     elgEligCareAssign.setEmdMcfOvrPlanCode(eligMemberCareAssignDetailForm.getEmdMCFOvrPlanCode());
    	 elgEligCareAssign.setEmdMcfOvrPlanEffDate(DateUtils.parseToSqlDateType(eligMemberCareAssignDetailForm.getEmdMCFOvrPlanEffDate())) ;
    	 elgEligCareAssign.setCfaCareFacilityId(eligMemberCareAssignDetailForm.getCfaCareFacilityID())  ;
    	 elgEligCareAssign.setCquQualifierId(eligMemberCareAssignDetailForm.getCquQualifierID()) ;
    	 elgEligCareAssign.setEmdPhysicianIdInd(eligMemberCareAssignDetailForm.getEmdPhysicianIDInd());
    	 elgEligCareAssign.setPrfPrescriberId(eligMemberCareAssignDetailForm.getPrfPrescriberID());
   	     elgEligCareAssign.setPrfPrescriberIdState(eligMemberCareAssignDetailForm.getPrfPrescriberIDState()) ;
   	     
        return careAssignupsert(elgEligCareAssign);
    }

    public ElgEligMemberDefaultsEmd careAssignupsert(ElgEligMemberDefaultsEmd elgEligCareAssign) {
  
        return elgMemberDefaultsEmdRepo.saveAndFlush(elgEligCareAssign);
    }

		
        /**	
         * Populate data for Override detail form
         */
		@Override
		public EligMemberOverrideDetailForm populateOverrideDetailsByPrimaryKey(String carrierId, String accountId,
				String groupId) {
			EligMemberOverrideDetailForm eligMemberOverrideDetailForm = null;
			ElgEodEligOverrideDflts elgEligOverrideEntity = getOverrideDetailsByPrimaryKey(carrierId, accountId, groupId);
        	if(elgEligOverrideEntity!=null)
        		eligMemberOverrideDetailForm = populateOverridePojoFromEntity(elgEligOverrideEntity);
            return eligMemberOverrideDetailForm;
		}
		
	    public ElgEodEligOverrideDflts getOverrideDetailsByPrimaryKey(String carrierId, String accountId, String groupId) {
	    	ElgEodEligOverrideDflts elgEligOverrideEntity = elgEodEligOverrideDfltsRepo.findByCarCarrierIdAndAccountIdAndGroupId(carrierId, accountId, groupId); 
	    	  return elgEligOverrideEntity;
	      }
	    
	    /**
	     * Populate Care Assign Pojo From Entity
	     * @param elgEligCareAssign
	     * @return EligMemberCareAssignDetailForm
	     */
	    public EligMemberOverrideDetailForm populateOverridePojoFromEntity(ElgEodEligOverrideDflts elgEligOverrideEntity) {
	    	EligMemberOverrideDetailForm eligMemberOverrideDetailForm = new EligMemberOverrideDetailForm();
	    	
	    	eligMemberOverrideDetailForm.setCarCarrierId(elgEligOverrideEntity.getCarCarrierId());
	    	eligMemberOverrideDetailForm.setAccountId(elgEligOverrideEntity.getAccountId());
	    	eligMemberOverrideDetailForm.setGroupId(elgEligOverrideEntity.getGroupId());
	    	eligMemberOverrideDetailForm.setCarCarrierId(elgEligOverrideEntity.getCarCarrierId()) ;
	    	eligMemberOverrideDetailForm.setAccountId(elgEligOverrideEntity.getAccountId());
	    	eligMemberOverrideDetailForm.setGroupId(elgEligOverrideEntity.getGroupId());
	    	
	    	//eligMemberCareAssignDetailForm.setEmdCareEffDate(DateUtils.convertUtilDateTODateType(elgEligCareAssign.getEmdCareEffDate()));
	    	eligMemberOverrideDetailForm.setEodCopayFromDateInd(elgEligOverrideEntity.getEodCopayFromDateInd());
	    	eligMemberOverrideDetailForm.setEodCopayFromDate(DateUtils.convertUtilDateTODateType(elgEligOverrideEntity.getEodCopayFromDate()));
	    	eligMemberOverrideDetailForm.setEodCopayScheduleInd(elgEligOverrideEntity.getEodCopayScheduleInd());
	    	eligMemberOverrideDetailForm.setEodCopaySchedule(elgEligOverrideEntity.getEodCopaySchedule());
	    	eligMemberOverrideDetailForm.setEodCopayThruDateInd(elgEligOverrideEntity.getEodCopayThruDateInd());
	    	eligMemberOverrideDetailForm.setEodCopayThruDate(DateUtils.convertUtilDateTODateType(elgEligOverrideEntity.getEodCopayThruDate()));
	    	eligMemberOverrideDetailForm.setEodCopayStepInd(elgEligOverrideEntity.getEodCopayStepInd());
	    	eligMemberOverrideDetailForm.setEodCopayStep(elgEligOverrideEntity.getEodCopayStep().toString());
	   //
	    	eligMemberOverrideDetailForm.setAddDate(DateUtils.convertDateToString(elgEligOverrideEntity.getAddDate()));
	    	eligMemberOverrideDetailForm.setAddTime(elgEligOverrideEntity.getAddTime().toString());
	    	eligMemberOverrideDetailForm.setAddProgramName(elgEligOverrideEntity.getAddProgramName());
	    	eligMemberOverrideDetailForm.setAddUserName(elgEligOverrideEntity.getAddUserName());
	    	eligMemberOverrideDetailForm.setChgDate(DateUtils.convertDateToString(elgEligOverrideEntity.getChgDate()));
	    	eligMemberOverrideDetailForm.setChgTime(elgEligOverrideEntity.getChgTime().toString());
	    	eligMemberOverrideDetailForm.setChgProgramName(elgEligOverrideEntity.getChgProgramName());
	    	eligMemberOverrideDetailForm.setChgUserName(elgEligOverrideEntity.getChgUserName());
	        return eligMemberOverrideDetailForm;

	    }
	    
	        
/**	
 * Save data for Override detail form
 * @throws Exception 
 */
		@Override
		public EligMemberOverrideDetailForm saveOverrideDetails(String jsonString)
				throws IOException, ValidationException, Exception {
		   	    String results = null;
		        ObjectMapper mapper = new ObjectMapper();
		        EligMemberOverrideDetailForm formData = mapper.readValue(jsonString, new TypeReference<EligMemberOverrideDetailForm>() {
		        });
		        EligMemberOverrideDetailForm eligMemberOverrideDetailForm = null;
		        HashMap<String, String> validationErrors = validateOverrideDetailForm(formData);
		        if (validationErrors.isEmpty()) {
		        
		        	eligMemberOverrideDetailForm = populateOverridePojoFromEntity(callOverrideDetailUpsert(formData));
		        	eligMemberOverrideDetailForm.setMessage("SUCCESS");
		             
		        }
		        else {
		            // An error occurred. Throw an exception
		            throw new ValidationException(mapper.writer().writeValueAsString(validationErrors));
		        }
		        return eligMemberOverrideDetailForm;
		       
		   	}

private ElgEodEligOverrideDflts callOverrideDetailUpsert(EligMemberOverrideDetailForm eligMemberOverrideDetailForm) {
	ElgEodEligOverrideDflts elgEligOverrideEntity;
	elgEligOverrideEntity = getOverrideDetailsByPrimaryKey(eligMemberOverrideDetailForm.getCarCarrierId(), eligMemberOverrideDetailForm.getAccountId(), eligMemberOverrideDetailForm.getGroupId());
    if (elgEligOverrideEntity == null) {
    	elgEligOverrideEntity = new ElgEodEligOverrideDflts();
    	elgEligOverrideEntity.setCarCarrierId(eligMemberOverrideDetailForm.getCarCarrierId());
    	elgEligOverrideEntity.setAccountId(eligMemberOverrideDetailForm.getAccountId());
    	elgEligOverrideEntity.setGroupId(eligMemberOverrideDetailForm.getGroupId());
    	elgEligOverrideEntity.setAddDate(DateUtils.currentDate());
    	elgEligOverrideEntity.setAddTime(DateUtils.currentTime());
    	elgEligOverrideEntity.setAddProgramName("JAVA_PRG");
    	elgEligOverrideEntity.setAddUserName("TEST_USER");
    	elgEligOverrideEntity.setChgDate(DateUtils.currentDate());
    	elgEligOverrideEntity.setChgTime(DateUtils.currentTime());
    	elgEligOverrideEntity.setChgProgramName("JAVA_PRG");
    	elgEligOverrideEntity.setChgUserName("TEST_USER");

    } else {
    	elgEligOverrideEntity.setChgDate(DateUtils.currentDate());
    	elgEligOverrideEntity.setChgTime(DateUtils.currentTime());
    	elgEligOverrideEntity.setChgProgramName("JAVA_PRG"); 
    	elgEligOverrideEntity.setChgUserName("TEST_USER");
    }
    
    
    elgEligOverrideEntity.setEodCopayFromDate(DateUtils.parseToSqlDateType(eligMemberOverrideDetailForm.getEodCopayFromDate()));
    elgEligOverrideEntity.setEodCopayFromDateInd(eligMemberOverrideDetailForm.getEodCopayFromDateInd()) ;
	 
    elgEligOverrideEntity.setEodCopayThruDate(DateUtils.parseToSqlDateType(eligMemberOverrideDetailForm.getEodCopayThruDate()));
    elgEligOverrideEntity.setEodCopayThruDateInd(eligMemberOverrideDetailForm.getEodCopayThruDateInd()) ;
    

    elgEligOverrideEntity.setEodCopaySchedule(eligMemberOverrideDetailForm.getEodCopaySchedule()) ;
    elgEligOverrideEntity.setEodCopayScheduleInd(eligMemberOverrideDetailForm.getEodCopayScheduleInd()) ;
    

    elgEligOverrideEntity.setEodCopayStep(Integer.parseInt(eligMemberOverrideDetailForm.getEodCopayStep())) ;
    elgEligOverrideEntity.setEodCopayStepInd(eligMemberOverrideDetailForm.getEodCopayStepInd()) ;
    
    return overrideDetailupsert(elgEligOverrideEntity);
}
    public ElgEodEligOverrideDflts overrideDetailupsert(ElgEodEligOverrideDflts elgEligOverrideEntity) {

    return elgEodEligOverrideDfltsRepo.saveAndFlush(elgEligOverrideEntity);

}

private HashMap<String, String> validateOverrideDetailForm(EligMemberOverrideDetailForm formData) throws Exception {
    HashMap validationErrors = new HashMap<String, String>();
    boolean foundAnError = false;
    String stepNumber=formData.getEodCopayStep();
    boolean copayFound=false;
   
  
    
    if( !formData.getEodCopaySchedule().equals("")) {
    copayFound=checkIfCopayScheduleExists( formData.getPlatformId(), formData.getEodCopaySchedule(), formData.getEodCopayStep());   
    if (!copayFound) {
    	
        validationErrors.put("copaySchedule", "Copay schedule + step number does not exist");
        foundAnError = true;
    }
    }
    if( !stepNumber.equals("0")) {
        copayFound=checkIfCopayScheduleExists( formData.getPlatformId(), formData.getEodCopaySchedule(), formData.getEodCopayStep());   
    
        if (!copayFound) {
        	
            validationErrors.put("copayStep", "Copay schedule + step number does not exist");
            foundAnError = true;
        }
        }
    return validationErrors;
}



public Boolean checkIfCopayScheduleExists(String platformId, String copayScheduleName, String stepNumber) throws Exception {
    String api = "/getCscCopayScheduleByPrimaryKey?cid=" +URLEncoder.encode(copayScheduleName.trim(),"UTF-8")  + "&sid=" +URLEncoder.encode(stepNumber.trim(),"UTF-8")  ;
    String results = nonEligAPIServices.callNonEligDataService(platformId, api);
    if (results == null || results.isEmpty()) {
        return Boolean.FALSE;
    }
    else {
    	
        return Boolean.TRUE;
    }
}





/**
 * INCIDENT DEFAULT FORM STARTS HERE
 */

public EligMemberIncidentDefaultDetailForm populateIncidentDefaultDetailByPrimaryKey(String carrierId,
		String accountId, String groupId) {
	EligMemberIncidentDefaultDetailForm eligMemberIncidentDefaultDetailForm = null;
	ElgEligWCDefaultsEwd elgEligIncidentDefaultDetail = getIncidentDefaultDetailByPrimaryKey(carrierId, accountId, groupId);
	if(elgEligIncidentDefaultDetail!=null)
		eligMemberIncidentDefaultDetailForm = populateIncidentDefaultDetailPojoFromEntity(elgEligIncidentDefaultDetail);
    return eligMemberIncidentDefaultDetailForm;
}

/**
 * Get Data from Data base for Incident Default Detail
 * @param carrierId
 * @param accountId
 * @param groupId
 * @return  elgEligIncidentDefaultDetail that comes from Data Base
 */
  public ElgEligWCDefaultsEwd getIncidentDefaultDetailByPrimaryKey(String carrierId, String accountId, String groupId) {
	  ElgEligWCDefaultsEwd elgEligIncidentDefaultDetail = elgEligWCDefaultsEwdRepo.findByCarCarrierIdAndAccountIdAndGroupId(carrierId, accountId, groupId);
	  return elgEligIncidentDefaultDetail;
  }
    

/**
 * Populate Incident Default Detail Pojo From Entity
 * @param ElgEligWCDefaultsEwd
 * @return EligMemberIncidentDefaultDetailForm
 */
public EligMemberIncidentDefaultDetailForm populateIncidentDefaultDetailPojoFromEntity(ElgEligWCDefaultsEwd elgEligIncidentDefaultDetail) {
	EligMemberIncidentDefaultDetailForm eligMemberIncidentDefaultDetailForm = new EligMemberIncidentDefaultDetailForm();
	eligMemberIncidentDefaultDetailForm.setCarCarrierId(elgEligIncidentDefaultDetail.getCarCarrierId());
	eligMemberIncidentDefaultDetailForm.setAccountId(elgEligIncidentDefaultDetail.getAccountId());
	eligMemberIncidentDefaultDetailForm.setAddDate(DateUtils.convertDateToString(elgEligIncidentDefaultDetail.getAddDate()));
	eligMemberIncidentDefaultDetailForm.setAddProgramName(elgEligIncidentDefaultDetail.getChgProgramName());
	eligMemberIncidentDefaultDetailForm.setChgDate(DateUtils.convertDateToString(elgEligIncidentDefaultDetail.getChgDate()));
	eligMemberIncidentDefaultDetailForm.setChgProgramName(elgEligIncidentDefaultDetail.getChgProgramName());
	eligMemberIncidentDefaultDetailForm.setChgTime(elgEligIncidentDefaultDetail.getChgTime().toString());
	eligMemberIncidentDefaultDetailForm.setChgUserName(elgEligIncidentDefaultDetail.getChgUserName());
	eligMemberIncidentDefaultDetailForm.setEwdClaimReference(elgEligIncidentDefaultDetail.getEwdClaimReference());
	eligMemberIncidentDefaultDetailForm.setEwdClaimReferenceInd(elgEligIncidentDefaultDetail.getEwdClaimReferenceInd());
	eligMemberIncidentDefaultDetailForm.setEwdClientPatientPay(elgEligIncidentDefaultDetail.getEwdClientPatientPay());
	eligMemberIncidentDefaultDetailForm.setEwdClientPatientpayInd(elgEligIncidentDefaultDetail.getEwdClientPatientpayInd());
	eligMemberIncidentDefaultDetailForm.setEwdClientPriceSchdInd(elgEligIncidentDefaultDetail.getEwdClientPriceSchdInd());
	eligMemberIncidentDefaultDetailForm.setEwdClientPriceSchedule(elgEligIncidentDefaultDetail.getEwdClientPriceSchedule());
	eligMemberIncidentDefaultDetailForm.setEwdIdCardInd(elgEligIncidentDefaultDetail.getEwdIdCardInd());
	eligMemberIncidentDefaultDetailForm.setEwdInjuryFromDate(DateUtils.convertUtilDateTODateType(elgEligIncidentDefaultDetail.getEwdInjuryFromDate()));
	eligMemberIncidentDefaultDetailForm.setEwdInjuryFromDateInd(elgEligIncidentDefaultDetail.getEwdInjuryFromDateInd());
	eligMemberIncidentDefaultDetailForm.setEwdInjuryThruDate(DateUtils.convertUtilDateTODateType(elgEligIncidentDefaultDetail.getEwdInjuryThruDate()));
	eligMemberIncidentDefaultDetailForm.setEwdInjuryThruDateInd(elgEligIncidentDefaultDetail.getEwdInjuryThruDateInd());
	eligMemberIncidentDefaultDetailForm.setEwdPharmPatientPay(elgEligIncidentDefaultDetail.getEwdPharmPatientPay());
	eligMemberIncidentDefaultDetailForm.setEwdPharmPatientPayInd(elgEligIncidentDefaultDetail.getEwdPharmPatientPayInd());
	eligMemberIncidentDefaultDetailForm.setEwdPlanInd(elgEligIncidentDefaultDetail.getEwdPlanInd());
	eligMemberIncidentDefaultDetailForm.setEwdPriceScheduleInd(elgEligIncidentDefaultDetail.getEwdPriceScheduleInd());
	eligMemberIncidentDefaultDetailForm.setEwdWcIncidentId("");
	eligMemberIncidentDefaultDetailForm.setEwdWcIncidentIdInd(elgEligIncidentDefaultDetail.getEwdWcIncidentIdInd());
	eligMemberIncidentDefaultDetailForm.setGroupId(elgEligIncidentDefaultDetail.getGroupId());
	eligMemberIncidentDefaultDetailForm.setPlanCode(elgEligIncidentDefaultDetail.getPlanCode());
	eligMemberIncidentDefaultDetailForm.setPlanEffDate(DateUtils.convertUtilDateTODateType(elgEligIncidentDefaultDetail.getPlanEffDate()));
	eligMemberIncidentDefaultDetailForm.setPrcPriceScheduleName(elgEligIncidentDefaultDetail.getPrcPriceScheduleName());
    
    return eligMemberIncidentDefaultDetailForm;

}
/**
	 * Incident Default Detail save data methods starts
	 */
	@Override
	public ElgEligWCDefaultsEwd saveIncidentDefaultDetail(String jsonString) throws IOException, ValidationException, Exception  {
	    String results = null;
    ObjectMapper mapper = new ObjectMapper();
    EligMemberIncidentDefaultDetailForm formData = mapper.readValue(jsonString, new TypeReference<EligMemberIncidentDefaultDetailForm>() {
    });
    ElgEligWCDefaultsEwd elgEligWCDefaultsEwd = null;
    HashMap<String, String> validationErrors = validateIncidentDefaultDetailForm(formData);
    if (validationErrors.isEmpty()) {
    	return callIncidentDefaultDetailUpsert(formData);    	
    }
    else {
        // An error occurred. Throw an exception
        throw new ValidationException(mapper.writer().writeValueAsString(validationErrors));
    }
   
   
	}

public ElgEligWCDefaultsEwd getProfileForIncidentDefaultDetailByPrimaryKey(String carrierId, String accountId, String groupId) {
    return elgEligWCDefaultsEwdRepo.findByCarCarrierIdAndAccountIdAndGroupId(carrierId, accountId, groupId);
}
private HashMap<String, String> validateIncidentDefaultDetailForm(EligMemberIncidentDefaultDetailForm formData) throws Exception {
    HashMap validationErrors = new HashMap<String, String>();
    boolean foundAnError = false;
    String result =null;  
    
	String planCode = formData.getPlanCode();
	String pharPriceSchedule = formData.getPrcPriceScheduleName();
	String pharPatientPay = formData.getEwdPharmPatientPay();
	String clientPriceSchedule = formData.getEwdClientPriceSchedule();
	String clientPatientPay = formData.getEwdClientPatientPay();
	
	if(!StringUtils.isEmpty(planCode)){
		//result= checkPlanCode(formData.getPlatformId(), planCode);	  
	    if (StringUtils.isEmpty(checkPlanCode(formData.getPlatformId(), planCode))) {
	    	validationErrors.put("planCode", "Plan code not found");
	    	foundAnError = true;
	    } 
	}
	if(!StringUtils.isEmpty(pharPriceSchedule)){
		//result= checkClientAndPharmacyPriceSchedule(formData.getPlatformId(), pharPriceSchedule);	  
		if (StringUtils.isEmpty(checkClientAndPharmacyPriceSchedule(formData.getPlatformId(), pharPriceSchedule))) {
	    	validationErrors.put("prcPriceScheduleName", "Pharmacy price schedule not found");
	    	foundAnError = true;
	    } 
	}
	if(!StringUtils.isEmpty(clientPriceSchedule)){
		//result= checkClientAndPharmacyPriceSchedule(formData.getPlatformId(), clientPriceSchedule);	  
	    if (StringUtils.isEmpty(checkClientAndPharmacyPriceSchedule(formData.getPlatformId(), clientPriceSchedule))) {
	    	validationErrors.put("ewdClientPriceSchedule", "Client price schedule not found");
	    	foundAnError = true;
	    } 
	}
	if(!StringUtils.isEmpty(pharPatientPay)){
		//result= checkClientAndPharmacyPatientPay(formData.getPlatformId(), pharPatientPay);	  
	    if (StringUtils.isEmpty(checkClientAndPharmacyPatientPay(formData.getPlatformId(), pharPatientPay))) {
	    	validationErrors.put("ewdPharmPatientPay", "Pharmacy patient pay not found");
	    	foundAnError = true;
	    } 
	}
	if(!StringUtils.isEmpty(clientPatientPay)){
		//result= checkClientAndPharmacyPatientPay(formData.getPlatformId(), clientPatientPay);	  
		if (StringUtils.isEmpty(checkClientAndPharmacyPatientPay(formData.getPlatformId(), clientPatientPay))) {
	    	validationErrors.put("ewdClientPatientPay", "Client patient pay not found");
	    	foundAnError = true;
	    } 
	}
    return validationErrors;
}
private ElgEligWCDefaultsEwd callIncidentDefaultDetailUpsert(EligMemberIncidentDefaultDetailForm eligMemberIncidentDefaultDetailForm) {
	
	ElgEligWCDefaultsEwd elgEligWCDefaultsEwd;

	elgEligWCDefaultsEwd = getProfileForIncidentDefaultDetailByPrimaryKey(eligMemberIncidentDefaultDetailForm.getCarCarrierId(), eligMemberIncidentDefaultDetailForm.getAccountId(), eligMemberIncidentDefaultDetailForm.getGroupId());
	   	
   if (elgEligWCDefaultsEwd == null) {
	   elgEligWCDefaultsEwd = new ElgEligWCDefaultsEwd();
	   elgEligWCDefaultsEwd.setCarCarrierId(eligMemberIncidentDefaultDetailForm.getCarCarrierId());
	   elgEligWCDefaultsEwd.setAccountId(eligMemberIncidentDefaultDetailForm.getAccountId());
	   elgEligWCDefaultsEwd.setGroupId(eligMemberIncidentDefaultDetailForm.getGroupId());
	   elgEligWCDefaultsEwd.setAddDate(DateUtils.currentDate());
//	   elgEligWCDefaultsEwd.setAddTime(DateUtils.currentTime());
//	   elgEligWCDefaultsEwd.setAddProgramName("JAVA_PRG");
//	   elgEligWCDefaultsEwd.setAddUserName("TEST_USER");
	   elgEligWCDefaultsEwd.setChgDate(DateUtils.currentDate());
	   elgEligWCDefaultsEwd.setChgTime(DateUtils.currentTime());
	   elgEligWCDefaultsEwd.setChgProgramName("JAVA_PRG");
	   elgEligWCDefaultsEwd.setChgUserName("TEST_USER");

   } else {
	   elgEligWCDefaultsEwd.setChgDate(DateUtils.currentDate());
	   elgEligWCDefaultsEwd.setChgTime(DateUtils.currentTime());
	   elgEligWCDefaultsEwd.setChgProgramName("JAVA_PRG"); 
	   elgEligWCDefaultsEwd.setChgUserName("TEST_USER");
   }


   elgEligWCDefaultsEwd.setEwdClaimReference(eligMemberIncidentDefaultDetailForm.getEwdClaimReference());
   elgEligWCDefaultsEwd.setEwdClaimReferenceInd(eligMemberIncidentDefaultDetailForm.getEwdClaimReferenceInd());
   elgEligWCDefaultsEwd.setEwdClientPatientPay(eligMemberIncidentDefaultDetailForm.getEwdClientPatientPay());
   elgEligWCDefaultsEwd.setEwdClientPatientpayInd(eligMemberIncidentDefaultDetailForm.getEwdClientPatientpayInd());
   elgEligWCDefaultsEwd.setEwdClientPriceSchdInd(eligMemberIncidentDefaultDetailForm.getEwdClientPriceSchdInd());
   elgEligWCDefaultsEwd.setEwdClientPriceSchedule(eligMemberIncidentDefaultDetailForm.getEwdClientPriceSchedule());
   elgEligWCDefaultsEwd.setEwdIdCardInd(eligMemberIncidentDefaultDetailForm.getEwdIdCardInd());
   elgEligWCDefaultsEwd.setEwdInjuryFromDate(DateUtils.parseToSqlDateType(eligMemberIncidentDefaultDetailForm.getEwdInjuryFromDate()));
   elgEligWCDefaultsEwd.setEwdInjuryFromDateInd(eligMemberIncidentDefaultDetailForm.getEwdInjuryFromDateInd());
   elgEligWCDefaultsEwd.setEwdInjuryThruDate(DateUtils.parseToSqlDateType(eligMemberIncidentDefaultDetailForm.getEwdInjuryThruDate()));
   elgEligWCDefaultsEwd.setEwdInjuryThruDateInd(eligMemberIncidentDefaultDetailForm.getEwdInjuryThruDateInd());
   elgEligWCDefaultsEwd.setEwdPharmPatientPay(eligMemberIncidentDefaultDetailForm.getEwdPharmPatientPay());
   elgEligWCDefaultsEwd.setEwdPharmPatientPayInd(eligMemberIncidentDefaultDetailForm.getEwdPharmPatientPayInd());
   elgEligWCDefaultsEwd.setEwdPlanInd(eligMemberIncidentDefaultDetailForm.getEwdPlanInd());
   elgEligWCDefaultsEwd.setEwdPriceScheduleInd(eligMemberIncidentDefaultDetailForm.getEwdPriceScheduleInd());
   elgEligWCDefaultsEwd.setEwdWcIncidentId("");
   elgEligWCDefaultsEwd.setEwdWcIncidentIdInd(eligMemberIncidentDefaultDetailForm.getEwdWcIncidentIdInd());
   elgEligWCDefaultsEwd.setGroupId(eligMemberIncidentDefaultDetailForm.getGroupId());
   elgEligWCDefaultsEwd.setPlanCode(eligMemberIncidentDefaultDetailForm.getPlanCode());
   elgEligWCDefaultsEwd.setPlanEffDate(DateUtils.parseToSqlDateType(eligMemberIncidentDefaultDetailForm.getPlanEffDate()));
   elgEligWCDefaultsEwd.setPrcPriceScheduleName(eligMemberIncidentDefaultDetailForm.getPrcPriceScheduleName());
	     
   return incidentDefaultDetailupsert(elgEligWCDefaultsEwd);
}
public ElgEligWCDefaultsEwd incidentDefaultDetailupsert(ElgEligWCDefaultsEwd elgEligWCDefaultsEwd) {
	  
    return elgEligWCDefaultsEwdRepo.saveAndFlush(elgEligWCDefaultsEwd);
}

	@Override
	public EligCoverageDefaultDetail fetchCoverageDefaultDetail(String carrierId, String accountId, String groupId) {
		LOG.info("<<< enter in EligProfileMemberServicesImpl.fetchCoverageDefaultDetail()");
		ElgMemberPartdDefaultsEmp elgMemberPartdDefaultsEmp = elgMemberPartdDefaultsRepo
				.findByCarCarrierIdAndAccountIdAndGroupId(carrierId, accountId, groupId);
		ElgMbrOtherCoverageDefaultsEmc otherCoverageDefaultsEmc = elgMbrOtherCoverageDefaultsEmcRepository
				.findByCarCarrierIdAndAccountIdAndGroupId(carrierId, accountId, groupId);
		LOG.info(">>>> exit from EligProfileMemberServicesImpl.fetchCoverageDefaultDetail()");
		return memberServiceHelper.populateCoverageDetails(elgMemberPartdDefaultsEmp, otherCoverageDefaultsEmc);
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public EligCoverageDefaultDetail saveCoverageDefaultDetail(String jsonString) throws IOException {
		LOG.info("<<< enter in EligProfileMemberServicesImpl.saveCoverageDefaultDetail()");
		ElgMemberPartdDefaultsEmp elgMemberPartdDefaultsEmp = null;
		ElgMbrOtherCoverageDefaultsEmc elgMbrOtherCoverageDefaultsEmc = null;
		EligCoverageDefaultDetail coverageDefaultDetail = memberServiceHelper.parseCoverageFormData(jsonString);
		LOG.info("<<< start save/update operation for MedicareIndicators");
		elgMemberPartdDefaultsEmp = elgMemberPartdDefaultsRepo.saveAndFlush(memberServiceHelper
				.prepareMedicareIndicatorsEnity(elgMemberPartdDefaultsRepo.findByCarCarrierIdAndAccountIdAndGroupId(
						coverageDefaultDetail.getCarCarrierId(), coverageDefaultDetail.getAccountId(),
						coverageDefaultDetail.getGroupId()), coverageDefaultDetail));
		LOG.info("<<< end save/update operation for MedicareIndicators");
		LOG.info("<<< start save/update operation for OtherCoverageIndicators");
		elgMbrOtherCoverageDefaultsEmc = elgMbrOtherCoverageDefaultsEmcRepository.saveAndFlush(
				memberServiceHelper.prepareOtherCoverageIndicatorsEnity(elgMbrOtherCoverageDefaultsEmcRepository
						.findByCarCarrierIdAndAccountIdAndGroupId(coverageDefaultDetail.getCarCarrierId(),
								coverageDefaultDetail.getAccountId(), coverageDefaultDetail.getGroupId()),
						coverageDefaultDetail));
		LOG.info("<<< end save/update operation for MedicareIndicators");
		LOG.info("<<< after save prepare saved details to send back to ");
		BeanUtils.copyProperties(elgMemberPartdDefaultsEmp, coverageDefaultDetail);
		BeanUtils.copyProperties(elgMbrOtherCoverageDefaultsEmc, coverageDefaultDetail);
		LOG.info("<<< end save/update operation for MedicareIndicators");
		coverageDefaultDetail.setMessage("SUCCESS");
		LOG.info(">>>> exit from EligProfileMemberServicesImpl.saveCoverageDefaultDetail()");
		return coverageDefaultDetail;
	}

	@Override
	public EligAltInsuranceDefaultDetail fetchAltInsuranceDefaultDetail(String carrierId, String accountId, String groupId) {
		LOG.info("<<< enter in EligProfileMemberServicesImpl.fetchCoverageDefaultDetail()");
		ElgEligMemberDefaultsEmd elgMemberPartdDefaultsEmp = elgMemberDefaultsEmdRepo
				.findByCarCarrierIdAndAccountIdAndGroupId(carrierId, accountId, groupId);
		LOG.info(">>>> exit from EligProfileMemberServicesImpl.fetchAltInsuranceDefaultDetail()");
		return memberServiceHelper.populateAltInsurance(elgMemberPartdDefaultsEmp);
	}

    public ElgEligGroupDefaultsEgd findGroupDefaultsByPrimaryKey(String carCarrierId, String accountId, String groupId) {
        LOG.debug(">>> in findGroupDefaultsByPrimaryKey");
        ElgEligGroupDefaultsEgd egd = elgEligGroupDefaultsEgdRepo.findByCarCarrierIdAndAccountIdAndGroupId(carCarrierId, accountId, groupId);
        return egd;
    }

	@Override
	public EligAltInsuranceDefaultDetail saveAltInsuranceDefaultDetail(String formData)
			throws JsonParseException, JsonMappingException, IOException {
		LOG.debug(">>> in saveAltInsuranceDefaultDetail");
		EligAltInsuranceDefaultDetail altInsuranceDefaultDetail = memberServiceHelper
				.unmarshallAltInsFormData(formData);
		ElgEligMemberDefaultsEmd elgMemberPartdDefaultsEmp = elgMemberDefaultsEmdRepo
				.findByCarCarrierIdAndAccountIdAndGroupId(altInsuranceDefaultDetail.getCarCarrierId(),
						altInsuranceDefaultDetail.getAccountId(), altInsuranceDefaultDetail.getGroupId());
		memberServiceHelper.prepareAltInsuranceEntity(altInsuranceDefaultDetail, elgMemberPartdDefaultsEmp);
		elgMemberPartdDefaultsEmp = elgMemberDefaultsEmdRepo.saveAndFlush(elgMemberPartdDefaultsEmp);
		BeanUtils.copyProperties(elgMemberPartdDefaultsEmp, altInsuranceDefaultDetail);
		return altInsuranceDefaultDetail;
	}
	
	 public EligMemberDefaultDetailsForm saveMemberDefaultDetails(String jsonString) throws IOException,ValidationException,Exception {
	        String results = null;
	        ObjectMapper mapper = new ObjectMapper();
	        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
	        EligMemberDefaultDetailsForm formData = mapper.readValue(jsonString, new TypeReference<EligMemberDefaultDetailsForm>() {
	        });	
	        EligMemberDefaultDetailsForm eligMemberDefaultDetailsForm = null;
	        HashMap<String, String> validationErrors = validateMemberDefaultDetailsForm(formData);
	        if (validationErrors.isEmpty()) {
		        eligMemberDefaultDetailsForm = populateMemberDefaultDetailsPojoFromEntity(callMemberDefaultDetailsUpsert(formData));
		        eligMemberDefaultDetailsForm.setMessage("SUCCESS");
	        }
	        else {
	            // An error occurred. Throw an exception
	            throw new ValidationException(mapper.writer().writeValueAsString(validationErrors));
	        }
	        return eligMemberDefaultDetailsForm;
	    }	 
	 
	 private HashMap<String, String> validateMemberDefaultDetailsForm(EligMemberDefaultDetailsForm formData) throws Exception {
		    HashMap<String, String> validationErrors = new HashMap<String, String>();		   		    
		    java.sql.Date  sqlPlanEffDate=DateUtils.parseToSqlDateType(formData.getPlanEffDate());
	        String strPlanEffDate=DateUtils.convertDateToString(sqlPlanEffDate);	
	        int intPlanEffDate = DateUtils.convertDateToCenturyDate(strPlanEffDate);
	        String result = null;
	        if("D".equals(formData.getEmdPlanInd()))
	        {
				result = findPlanByPlanCodeAndEffDate(intPlanEffDate,formData.getPlanCode(),formData.getPlatformId());
				if(result==null) {
				 validationErrors.put("planEffDatePlanCodeError", "Plan code entered is invalid");			 
				}			
	        }
	        return validationErrors;
	    }
	    
	    public String findPlanByPlanCodeAndEffDate(int planEffDate, String planCode,String platformId) throws Exception {	    	
	    	String api = "/getPlanByPlanCodeAndEffDate?efd="+planEffDate+"&pc="+URLEncoder.encode(planCode.trim(),"UTF-8");
	        String result = nonEligAPIServices.callNonEligDataService(platformId, api);      
	        return result;	      
	    }
	    
	    private ElgEligMemberDefaultsEmd callMemberDefaultDetailsUpsert(EligMemberDefaultDetailsForm eligMemberDefaultDetailsForm) {
	    	ElgEligMemberDefaultsEmd elgEligMemberDefaultsEmd;
	    	elgEligMemberDefaultsEmd = getMemberDefaultDetailsByPrimaryKey(eligMemberDefaultDetailsForm.getCarCarrierId(), eligMemberDefaultDetailsForm.getAccountId(), eligMemberDefaultDetailsForm.getGroupId());
	        if (elgEligMemberDefaultsEmd == null) {
	        	elgEligMemberDefaultsEmd = new ElgEligMemberDefaultsEmd();
	        	elgEligMemberDefaultsEmd.setCarCarrierId(eligMemberDefaultDetailsForm.getCarCarrierId());
	        	elgEligMemberDefaultsEmd.setAccountId(eligMemberDefaultDetailsForm.getAccountId());
	        	elgEligMemberDefaultsEmd.setGroupId(eligMemberDefaultDetailsForm.getGroupId());
	        	elgEligMemberDefaultsEmd.setAddDate(DateUtils.currentDate());
	        	elgEligMemberDefaultsEmd.setAddTime(DateUtils.currentTime());
	        	elgEligMemberDefaultsEmd.setAddProgramName("JAVA_PRG");
	        	elgEligMemberDefaultsEmd.setAddUserName("TEST_USER");
	        	elgEligMemberDefaultsEmd.setChgDate(DateUtils.currentDate());
	        	elgEligMemberDefaultsEmd.setChgTime(DateUtils.currentTime());
	        	elgEligMemberDefaultsEmd.setChgProgramName("JAVA_PRG");
	        	elgEligMemberDefaultsEmd.setChgUserName("TEST_USER");

	        } else {
	        	elgEligMemberDefaultsEmd.setChgDate(DateUtils.currentDate());
	        	elgEligMemberDefaultsEmd.setChgTime(DateUtils.currentTime());
	        	elgEligMemberDefaultsEmd.setChgProgramName("JAVA_PRG");
	        	elgEligMemberDefaultsEmd.setChgUserName("TEST_USER");
	        }
	        elgEligMemberDefaultsEmd.setEmdMemberEligibilityTp(eligMemberDefaultDetailsForm.getEmdMemberEligibilityTp());
	        elgEligMemberDefaultsEmd.setEmdCreateSpouseInd(eligMemberDefaultDetailsForm.getEmdCreateSpouseInd());
	        elgEligMemberDefaultsEmd.setEmdCreateDependentsInd(eligMemberDefaultDetailsForm.getEmdCreateDependentsInd());
	        if(eligMemberDefaultDetailsForm.getEmdNumberOfDependents()!=null && !"".equalsIgnoreCase(eligMemberDefaultDetailsForm.getEmdNumberOfDependents()))
	         elgEligMemberDefaultsEmd.setEmdNumberOfDependents(new BigInteger(eligMemberDefaultDetailsForm.getEmdNumberOfDependents()));
	        else
	         elgEligMemberDefaultsEmd.setEmdNumberOfDependents(null);

	        elgEligMemberDefaultsEmd.setEmdNameInd(eligMemberDefaultDetailsForm.getEmdNameInd());
	        elgEligMemberDefaultsEmd.setEmdFirstName(eligMemberDefaultDetailsForm.getEmdFirstName());
	        elgEligMemberDefaultsEmd.setEmdMiddleInitial(eligMemberDefaultDetailsForm.getEmdMiddleInitial());
	        elgEligMemberDefaultsEmd.setEmdLastName(eligMemberDefaultDetailsForm.getEmdLastName());
	        
	        elgEligMemberDefaultsEmd.setEmdSocSecNbrInd(eligMemberDefaultDetailsForm.getEmdSocSecNbrInd());
	        
	        if(eligMemberDefaultDetailsForm.getEmdSocSecNbr()!=null && !"".equalsIgnoreCase(eligMemberDefaultDetailsForm.getEmdSocSecNbr()))
	        {	         
	         elgEligMemberDefaultsEmd.setEmdSocSecNbr(new Integer(eligMemberDefaultDetailsForm.getEmdSocSecNbr().replaceAll("-","")));
	        }
	        else
	         elgEligMemberDefaultsEmd.setEmdSocSecNbr(null);
	        
	        elgEligMemberDefaultsEmd.setEmdBuildSocSecNbr(eligMemberDefaultDetailsForm.getEmdBuildSocSecNbr());
	        elgEligMemberDefaultsEmd.setEmdSsnOnErrorFile(eligMemberDefaultDetailsForm.getEmdSsnOnErrorFile());
	        
	        elgEligMemberDefaultsEmd.setEmdSexInd(eligMemberDefaultDetailsForm.getEmdSexInd());
	        elgEligMemberDefaultsEmd.setEmdSex(eligMemberDefaultDetailsForm.getEmdSex());
	        
	        elgEligMemberDefaultsEmd.setEmdDateOfBirthInd(eligMemberDefaultDetailsForm.getEmdDateOfBirthInd());
	        elgEligMemberDefaultsEmd.setEmdDateOfBirth(DateUtils.parseToSqlDateType(eligMemberDefaultDetailsForm.getEmdDateOfBirth()));
	        
	        elgEligMemberDefaultsEmd.setEmdAddressInd(eligMemberDefaultDetailsForm.getEmdAddressInd());
	        
	        elgEligMemberDefaultsEmd.setEmdCountryInd(eligMemberDefaultDetailsForm.getEmdCountryInd());
	        elgEligMemberDefaultsEmd.setEmdCountryCode(eligMemberDefaultDetailsForm.getEmdCountryCode());
	        
	        elgEligMemberDefaultsEmd.setEmdEmailInd(eligMemberDefaultDetailsForm.getEmdEmailInd());
	        elgEligMemberDefaultsEmd.setEmdPhoneNumberInd(eligMemberDefaultDetailsForm.getEmdPhoneNumberInd());
	        
	        
	        
	        
	        elgEligMemberDefaultsEmd.setEmdPersonCodeInd(eligMemberDefaultDetailsForm.getEmdPersonCodeInd());
	        elgEligMemberDefaultsEmd.setEmdPersonCode(eligMemberDefaultDetailsForm.getEmdPersonCode());
	        
	        elgEligMemberDefaultsEmd.setEmdRelationshipCodeInd(eligMemberDefaultDetailsForm.getEmdRelationshipCodeInd());
	        elgEligMemberDefaultsEmd.setEmdRelationshipCode(eligMemberDefaultDetailsForm.getEmdRelationshipCode());
	        
	        elgEligMemberDefaultsEmd.setEmdMemberTypeInd(eligMemberDefaultDetailsForm.getEmdMemberTypeInd());
	        elgEligMemberDefaultsEmd.setEmdMemberType(eligMemberDefaultDetailsForm.getEmdMemberType());
	        
	        elgEligMemberDefaultsEmd.setEmdFamilyTypeInd(eligMemberDefaultDetailsForm.getEmdFamilyTypeInd());
	        elgEligMemberDefaultsEmd.setEmdFamilyType(eligMemberDefaultDetailsForm.getEmdFamilyType());
	        
	        elgEligMemberDefaultsEmd.setEmdFamilyIndicatorInd(eligMemberDefaultDetailsForm.getEmdFamilyIndicatorInd());
	        elgEligMemberDefaultsEmd.setEmdFamilyIndicator(eligMemberDefaultDetailsForm.getEmdFamilyIndicator());
	        
	        elgEligMemberDefaultsEmd.setEmdFamilyIdInd(eligMemberDefaultDetailsForm.getEmdFamilyIdInd());
	        elgEligMemberDefaultsEmd.setEmdFamilyId(eligMemberDefaultDetailsForm.getEmdFamilyId());
	        
	        elgEligMemberDefaultsEmd.setEmdMultBirthCodeInd(eligMemberDefaultDetailsForm.getEmdMultBirthCodeInd());
	        if(eligMemberDefaultDetailsForm.getEmdMultipleBirthCode()!=null && !"".equalsIgnoreCase(eligMemberDefaultDetailsForm.getEmdMultipleBirthCode()))
	         elgEligMemberDefaultsEmd.setEmdMultipleBirthCode(new BigInteger(eligMemberDefaultDetailsForm.getEmdMultipleBirthCode()));
	        else
	         elgEligMemberDefaultsEmd.setEmdMultipleBirthCode(null);
	        elgEligMemberDefaultsEmd.setEmdMemberIdFormatChec(eligMemberDefaultDetailsForm.getEmdMemberIdFormatChec());
	        
	        
	        elgEligMemberDefaultsEmd.setEmdLanguageCodeInd(eligMemberDefaultDetailsForm.getEmdLanguageCodeInd());
	        elgEligMemberDefaultsEmd.setEmdLanguageCode(eligMemberDefaultDetailsForm.getEmdLanguageCode().getLanguageCode());
	        
	        elgEligMemberDefaultsEmd.setEmdOrigEffDateInd(eligMemberDefaultDetailsForm.getEmdOrigEffDateInd());
	        elgEligMemberDefaultsEmd.setEmdOrigEffectiveDate(DateUtils.parseToSqlDateType(eligMemberDefaultDetailsForm.getEmdOrigEffectiveDate()));
	        
	        elgEligMemberDefaultsEmd.setEmdRenewalDateInd(eligMemberDefaultDetailsForm.getEmdRenewalDateInd());
	        elgEligMemberDefaultsEmd.setEmdRenewalDate(DateUtils.parseToSqlDateType(eligMemberDefaultDetailsForm.getEmdRenewalDate()));
	                
	        elgEligMemberDefaultsEmd.setEmdMedicareHicInd(eligMemberDefaultDetailsForm.getEmdMedicareHicInd());
	        elgEligMemberDefaultsEmd.setEmdMedicareHic(eligMemberDefaultDetailsForm.getEmdMedicareHic());
	        
	        elgEligMemberDefaultsEmd.setEmdMedicareEffDateInd(eligMemberDefaultDetailsForm.getEmdMedicareEffDateInd());
	        elgEligMemberDefaultsEmd.setEmdMedicareEffDate(DateUtils.parseToSqlDateType(eligMemberDefaultDetailsForm.getEmdMedicareEffDate()));
	        
	        elgEligMemberDefaultsEmd.setEmdMedicareCvgTypeInd(eligMemberDefaultDetailsForm.getEmdMedicareCvgTypeInd());
	        elgEligMemberDefaultsEmd.setEmdMedicareCvgType(eligMemberDefaultDetailsForm.getEmdMedicareCvgType());
	        
	        elgEligMemberDefaultsEmd.setEmdInactvFutureCovInd(eligMemberDefaultDetailsForm.getEmdInactvFutureCovInd());
	        
	        
	        
	        
	        elgEligMemberDefaultsEmd.setEmdEffectiveDateInd(eligMemberDefaultDetailsForm.getEmdEffectiveDateInd());
	        elgEligMemberDefaultsEmd.setEmdEffectiveDate(DateUtils.parseToSqlDateType(eligMemberDefaultDetailsForm.getEmdEffectiveDate()));
	        
	        elgEligMemberDefaultsEmd.setEmdThruDateInd(eligMemberDefaultDetailsForm.getEmdThruDateInd());
	        elgEligMemberDefaultsEmd.setEmdThruDate(DateUtils.parseToSqlDateType(eligMemberDefaultDetailsForm.getEmdThruDate()));
	        
	        if(eligMemberDefaultDetailsForm.getEmdThruDays()!=null && !"".equalsIgnoreCase(eligMemberDefaultDetailsForm.getEmdThruDays()))
	        	elgEligMemberDefaultsEmd.setEmdThruDays(new Integer(eligMemberDefaultDetailsForm.getEmdThruDays()));
		    else
		        elgEligMemberDefaultsEmd.setEmdThruDays(null);
	        
	        elgEligMemberDefaultsEmd.setEmdPlanInd(eligMemberDefaultDetailsForm.getEmdPlanInd());
	        elgEligMemberDefaultsEmd.setPlanEffDate(DateUtils.parseToSqlDateType(eligMemberDefaultDetailsForm.getPlanEffDate()));
	        elgEligMemberDefaultsEmd.setPlanCode(eligMemberDefaultDetailsForm.getPlanCode());
	        
	        elgEligMemberDefaultsEmd.setEmdBrandCopayInd(eligMemberDefaultDetailsForm.getEmdBrandCopayInd());
	        if(eligMemberDefaultDetailsForm.getEmdBrandCopay()!=null && !"".equalsIgnoreCase(eligMemberDefaultDetailsForm.getEmdBrandCopay()))
	         elgEligMemberDefaultsEmd.setEmdBrandCopay(new BigDecimal(eligMemberDefaultDetailsForm.getEmdBrandCopay()));
	        else
	         elgEligMemberDefaultsEmd.setEmdBrandCopay(null);
	        
	        elgEligMemberDefaultsEmd.setEmdGenericCopayInd(eligMemberDefaultDetailsForm.getEmdGenericCopayInd());
	        if(eligMemberDefaultDetailsForm.getEmdGenericCopay()!=null && !"".equalsIgnoreCase(eligMemberDefaultDetailsForm.getEmdGenericCopay()))
	         elgEligMemberDefaultsEmd.setEmdGenericCopay(new BigDecimal(eligMemberDefaultDetailsForm.getEmdGenericCopay()));
	        else
	         elgEligMemberDefaultsEmd.setEmdGenericCopay(null);
	        
	        elgEligMemberDefaultsEmd.setEmdCopay3Ind(eligMemberDefaultDetailsForm.getEmdCopay3Ind());
	        if(eligMemberDefaultDetailsForm.getEmdCopay3()!=null && !"".equalsIgnoreCase(eligMemberDefaultDetailsForm.getEmdCopay3()))
	         elgEligMemberDefaultsEmd.setEmdCopay3(new BigDecimal(eligMemberDefaultDetailsForm.getEmdCopay3()));
	        else
	         elgEligMemberDefaultsEmd.setEmdCopay3(null);
	        
	        elgEligMemberDefaultsEmd.setEmdCopay4Ind(eligMemberDefaultDetailsForm.getEmdCopay4Ind());
	        if(eligMemberDefaultDetailsForm.getEmdCopay4()!=null && !"".equalsIgnoreCase(eligMemberDefaultDetailsForm.getEmdCopay4()))
	         elgEligMemberDefaultsEmd.setEmdCopay4(new BigDecimal(eligMemberDefaultDetailsForm.getEmdCopay4()));
	        else
	         elgEligMemberDefaultsEmd.setEmdCopay4(null);
	        elgEligMemberDefaultsEmd.setEmdPlanEligValidation(eligMemberDefaultDetailsForm.getEmdPlanEligValidation());
	        
	        
	        
	        
	        elgEligMemberDefaultsEmd.setEmdDurKeyInd(eligMemberDefaultDetailsForm.getEmdDurKeyInd());        
	        elgEligMemberDefaultsEmd.setEmdDurKey(eligMemberDefaultDetailsForm.getEmdDurKey());
	        
	        elgEligMemberDefaultsEmd.setEmdDurFlagInd(eligMemberDefaultDetailsForm.getEmdDurFlagInd());        
	        elgEligMemberDefaultsEmd.setEmdDurFlag(eligMemberDefaultDetailsForm.getEmdDurFlag());
	        
	        elgEligMemberDefaultsEmd.setEmdClientProdCodeInd(eligMemberDefaultDetailsForm.getEmdClientProdCodeInd());        
	        elgEligMemberDefaultsEmd.setEmdClientProductCode(eligMemberDefaultDetailsForm.getEmdClientProductCode());
	        
	        elgEligMemberDefaultsEmd.setEmdClientRiderCodeInd(eligMemberDefaultDetailsForm.getEmdClientRiderCodeInd());        
	        elgEligMemberDefaultsEmd.setEmdClientRiderCode(eligMemberDefaultDetailsForm.getEmdClientRiderCode());
	       
	        
	        
	        
	        
	       
	        return memberDefaultDetailsUpsert(elgEligMemberDefaultsEmd);
	    }

	    public ElgEligMemberDefaultsEmd memberDefaultDetailsUpsert(ElgEligMemberDefaultsEmd elgEligMemberDefaultsEmd) {
	        return elgEligMemberDefaultsEmdRepository.saveAndFlush(elgEligMemberDefaultsEmd);
	    }


	    public EligMemberDefaultDetailsForm populateMemberDefaultDetails(String carrierId, String accountId, String groupId) {
	    	EligMemberDefaultDetailsForm  eligMemberDefaultDetailsForm  = null;
	    	ElgEligMemberDefaultsEmd elgEligMemberDefaultsEmd = getMemberDefaultDetailsByPrimaryKey(carrierId, accountId, groupId);
	        
	        if(elgEligMemberDefaultsEmd!=null)
	        	eligMemberDefaultDetailsForm = populateMemberDefaultDetailsPojoFromEntity(elgEligMemberDefaultsEmd);
	        
	        return eligMemberDefaultDetailsForm;
	    }

	    public ElgEligMemberDefaultsEmd getMemberDefaultDetailsByPrimaryKey(String carrierId, String accountId, String groupId) {
	    	ElgEligMemberDefaultsEmd elgEligMemberDefaultsEmd = elgEligMemberDefaultsEmdRepository.findByCarCarrierIdAndAccountIdAndGroupId(carrierId, accountId, groupId);       
	        return elgEligMemberDefaultsEmd;
	    }

	    public EligMemberDefaultDetailsForm populateMemberDefaultDetailsPojoFromEntity(ElgEligMemberDefaultsEmd elgEligMemberDefaultsEmd) {
	    	EligMemberDefaultDetailsForm eligMemberDefaultDetailsForm = new EligMemberDefaultDetailsForm();
	    	eligMemberDefaultDetailsForm.setCarCarrierId(elgEligMemberDefaultsEmd.getCarCarrierId());
	    	eligMemberDefaultDetailsForm.setAccountId(elgEligMemberDefaultsEmd.getAccountId());
	    	eligMemberDefaultDetailsForm.setGroupId(elgEligMemberDefaultsEmd.getGroupId());
	    	
	    	eligMemberDefaultDetailsForm.setEmdMemberEligibilityTp(elgEligMemberDefaultsEmd.getEmdMemberEligibilityTp());
	    	eligMemberDefaultDetailsForm.setEmdCreateSpouseInd(elgEligMemberDefaultsEmd.getEmdCreateSpouseInd());
	    	eligMemberDefaultDetailsForm.setEmdCreateDependentsInd(elgEligMemberDefaultsEmd.getEmdCreateDependentsInd());
	    	
	    	if(elgEligMemberDefaultsEmd.getEmdNumberOfDependents()!=null)
	    	 eligMemberDefaultDetailsForm.setEmdNumberOfDependents(elgEligMemberDefaultsEmd.getEmdNumberOfDependents().toString());
	    	else
	    	 eligMemberDefaultDetailsForm.setEmdNumberOfDependents(null);
	    	
	    	eligMemberDefaultDetailsForm.setEmdNameInd(elgEligMemberDefaultsEmd.getEmdNameInd());
	    	eligMemberDefaultDetailsForm.setEmdFirstName(elgEligMemberDefaultsEmd.getEmdFirstName());
	    	eligMemberDefaultDetailsForm.setEmdMiddleInitial(elgEligMemberDefaultsEmd.getEmdMiddleInitial());
	    	eligMemberDefaultDetailsForm.setEmdLastName(elgEligMemberDefaultsEmd.getEmdLastName());
	        
	    	eligMemberDefaultDetailsForm.setEmdSocSecNbrInd(elgEligMemberDefaultsEmd.getEmdSocSecNbrInd());
	    	
	    	if(elgEligMemberDefaultsEmd.getEmdSocSecNbr()!=null)
	    	{	    			    				
	    		String emdSSNMod = "";
	    		for(int i =0;i<elgEligMemberDefaultsEmd.getEmdSocSecNbr().toString().length();i++)
	    		{
	    			if(i==3||i==5)
	    			  emdSSNMod=emdSSNMod+"-";
	    			
	    			emdSSNMod = emdSSNMod+elgEligMemberDefaultsEmd.getEmdSocSecNbr().toString().toCharArray()[i];	    		    
	    		}
		      eligMemberDefaultDetailsForm.setEmdSocSecNbr(emdSSNMod);
	    	}
		    else
		      eligMemberDefaultDetailsForm.setEmdSocSecNbr(null);
	        
	    	eligMemberDefaultDetailsForm.setEmdBuildSocSecNbr(elgEligMemberDefaultsEmd.getEmdBuildSocSecNbr());
	    	eligMemberDefaultDetailsForm.setEmdSsnOnErrorFile(elgEligMemberDefaultsEmd.getEmdSsnOnErrorFile());
	        
	    	eligMemberDefaultDetailsForm.setEmdSexInd(elgEligMemberDefaultsEmd.getEmdSexInd());
	    	eligMemberDefaultDetailsForm.setEmdSex(elgEligMemberDefaultsEmd.getEmdSex());
	        
	    	eligMemberDefaultDetailsForm.setEmdDateOfBirthInd(elgEligMemberDefaultsEmd.getEmdDateOfBirthInd());
	    	eligMemberDefaultDetailsForm.setEmdDateOfBirth(DateUtils.convertUtilDateTODateType(elgEligMemberDefaultsEmd.getEmdDateOfBirth()));
	        
	    	eligMemberDefaultDetailsForm.setEmdAddressInd(elgEligMemberDefaultsEmd.getEmdAddressInd());
	        
	    	eligMemberDefaultDetailsForm.setEmdCountryInd(elgEligMemberDefaultsEmd.getEmdCountryInd());
	    	eligMemberDefaultDetailsForm.setEmdCountryCode(elgEligMemberDefaultsEmd.getEmdCountryCode());
	        
	    	eligMemberDefaultDetailsForm.setEmdEmailInd(elgEligMemberDefaultsEmd.getEmdEmailInd());
	    	eligMemberDefaultDetailsForm.setEmdPhoneNumberInd(elgEligMemberDefaultsEmd.getEmdPhoneNumberInd());
	    	
	    	
	    	eligMemberDefaultDetailsForm.setEmdPersonCodeInd(elgEligMemberDefaultsEmd.getEmdPersonCodeInd());
	    	eligMemberDefaultDetailsForm.setEmdPersonCode(elgEligMemberDefaultsEmd.getEmdPersonCode());
	         
	    	eligMemberDefaultDetailsForm.setEmdRelationshipCodeInd(elgEligMemberDefaultsEmd.getEmdRelationshipCodeInd());
	    	eligMemberDefaultDetailsForm.setEmdRelationshipCode(elgEligMemberDefaultsEmd.getEmdRelationshipCode());
	         
	    	eligMemberDefaultDetailsForm.setEmdMemberTypeInd(elgEligMemberDefaultsEmd.getEmdMemberTypeInd());
	    	eligMemberDefaultDetailsForm.setEmdMemberType(elgEligMemberDefaultsEmd.getEmdMemberType());
	         
	    	eligMemberDefaultDetailsForm.setEmdFamilyTypeInd(elgEligMemberDefaultsEmd.getEmdFamilyTypeInd());
	    	eligMemberDefaultDetailsForm.setEmdFamilyType(elgEligMemberDefaultsEmd.getEmdFamilyType());
	         
	    	eligMemberDefaultDetailsForm.setEmdFamilyIndicatorInd(elgEligMemberDefaultsEmd.getEmdFamilyIndicatorInd());
	    	eligMemberDefaultDetailsForm.setEmdFamilyIndicator(elgEligMemberDefaultsEmd.getEmdFamilyIndicator());
	         
	    	eligMemberDefaultDetailsForm.setEmdFamilyIdInd(elgEligMemberDefaultsEmd.getEmdFamilyIdInd());
	    	eligMemberDefaultDetailsForm.setEmdFamilyId(elgEligMemberDefaultsEmd.getEmdFamilyId());
	         
	    	eligMemberDefaultDetailsForm.setEmdMultBirthCodeInd(elgEligMemberDefaultsEmd.getEmdMultBirthCodeInd());
	    	
	    	if(elgEligMemberDefaultsEmd.getEmdMultipleBirthCode()!=null)
	    	 eligMemberDefaultDetailsForm.setEmdMultipleBirthCode(elgEligMemberDefaultsEmd.getEmdMultipleBirthCode().toString());
	    	else
		     eligMemberDefaultDetailsForm.setEmdMultipleBirthCode(null);
	         
	    	eligMemberDefaultDetailsForm.setEmdMemberIdFormatChec(elgEligMemberDefaultsEmd.getEmdMemberIdFormatChec());
	         
	         
	    	eligMemberDefaultDetailsForm.setEmdLanguageCodeInd(elgEligMemberDefaultsEmd.getEmdLanguageCodeInd());
	    	eligMemberDefaultDetailsForm.setEmdLanguageCode(new TypeAheadType(elgEligMemberDefaultsEmd.getEmdLanguageCode()));
	    	eligMemberDefaultDetailsForm.setEmdOrigEffDateInd(elgEligMemberDefaultsEmd.getEmdOrigEffDateInd());
	    	eligMemberDefaultDetailsForm.setEmdOrigEffectiveDate(DateUtils.convertUtilDateTODateType(elgEligMemberDefaultsEmd.getEmdOrigEffectiveDate()));
	         
	    	eligMemberDefaultDetailsForm.setEmdRenewalDateInd(elgEligMemberDefaultsEmd.getEmdRenewalDateInd());
	    	eligMemberDefaultDetailsForm.setEmdRenewalDate(DateUtils.convertUtilDateTODateType(elgEligMemberDefaultsEmd.getEmdRenewalDate()));
	                 
	    	eligMemberDefaultDetailsForm.setEmdMedicareHicInd(elgEligMemberDefaultsEmd.getEmdMedicareHicInd());
	    	eligMemberDefaultDetailsForm.setEmdMedicareHic(elgEligMemberDefaultsEmd.getEmdMedicareHic());
	         
	    	eligMemberDefaultDetailsForm.setEmdMedicareEffDateInd(elgEligMemberDefaultsEmd.getEmdMedicareEffDateInd());
	    	eligMemberDefaultDetailsForm.setEmdMedicareEffDate(DateUtils.convertUtilDateTODateType(elgEligMemberDefaultsEmd.getEmdMedicareEffDate()));
	         
	    	eligMemberDefaultDetailsForm.setEmdMedicareCvgTypeInd(elgEligMemberDefaultsEmd.getEmdMedicareCvgTypeInd());
	    	eligMemberDefaultDetailsForm.setEmdMedicareCvgType(elgEligMemberDefaultsEmd.getEmdMedicareCvgType());
	         
	    	eligMemberDefaultDetailsForm.setEmdInactvFutureCovInd(elgEligMemberDefaultsEmd.getEmdInactvFutureCovInd());
	         
	         
	         
	         
	    	eligMemberDefaultDetailsForm.setEmdEffectiveDateInd(elgEligMemberDefaultsEmd.getEmdEffectiveDateInd());
	    	eligMemberDefaultDetailsForm.setEmdEffectiveDate(DateUtils.convertUtilDateTODateType(elgEligMemberDefaultsEmd.getEmdEffectiveDate()));
	         
	    	eligMemberDefaultDetailsForm.setEmdThruDateInd(elgEligMemberDefaultsEmd.getEmdThruDateInd());
	    	eligMemberDefaultDetailsForm.setEmdThruDate(DateUtils.convertUtilDateTODateType(elgEligMemberDefaultsEmd.getEmdThruDate()));
	    	if(elgEligMemberDefaultsEmd.getEmdThruDays()!=null)
	    	 eligMemberDefaultDetailsForm.setEmdThruDays(elgEligMemberDefaultsEmd.getEmdThruDays().toString());
	    	else
	    	 eligMemberDefaultDetailsForm.setEmdThruDays(null);
	    	
	    	eligMemberDefaultDetailsForm.setEmdPlanInd(elgEligMemberDefaultsEmd.getEmdPlanInd());
	    	eligMemberDefaultDetailsForm.setPlanEffDate(DateUtils.convertUtilDateTODateType(elgEligMemberDefaultsEmd.getPlanEffDate()));
	    	eligMemberDefaultDetailsForm.setPlanCode(elgEligMemberDefaultsEmd.getPlanCode());
	    	
	    	eligMemberDefaultDetailsForm.setEmdBrandCopayInd(elgEligMemberDefaultsEmd.getEmdBrandCopayInd());
	    	if(elgEligMemberDefaultsEmd.getEmdBrandCopay()!=null)
	    	 eligMemberDefaultDetailsForm.setEmdBrandCopay(elgEligMemberDefaultsEmd.getEmdBrandCopay().toString());
	    	else
	    	 eligMemberDefaultDetailsForm.setEmdBrandCopay(null);
	    		
	         
	    	eligMemberDefaultDetailsForm.setEmdGenericCopayInd(elgEligMemberDefaultsEmd.getEmdGenericCopayInd());
	    	if(elgEligMemberDefaultsEmd.getEmdGenericCopay()!=null)
	    	 eligMemberDefaultDetailsForm.setEmdGenericCopay(elgEligMemberDefaultsEmd.getEmdGenericCopay().toString());
	    	else
		     eligMemberDefaultDetailsForm.setEmdGenericCopay(null);
	         
	    	eligMemberDefaultDetailsForm.setEmdCopay3Ind(elgEligMemberDefaultsEmd.getEmdCopay3Ind());
	    	if(elgEligMemberDefaultsEmd.getEmdCopay3()!=null)
	    	 eligMemberDefaultDetailsForm.setEmdCopay3(elgEligMemberDefaultsEmd.getEmdCopay3().toString());
	    	else
	    	 eligMemberDefaultDetailsForm.setEmdCopay3(null);
	         
	    	eligMemberDefaultDetailsForm.setEmdCopay4Ind(elgEligMemberDefaultsEmd.getEmdCopay4Ind());
	    	if(elgEligMemberDefaultsEmd.getEmdCopay4()!=null)
	    	 eligMemberDefaultDetailsForm.setEmdCopay4(elgEligMemberDefaultsEmd.getEmdCopay4().toString());
	    	else
	    	 eligMemberDefaultDetailsForm.setEmdCopay4(null);
	    	eligMemberDefaultDetailsForm.setEmdPlanEligValidation(elgEligMemberDefaultsEmd.getEmdPlanEligValidation());
	         
	         
	         
	         
	    	eligMemberDefaultDetailsForm.setEmdDurKeyInd(elgEligMemberDefaultsEmd.getEmdDurKeyInd());        
	    	eligMemberDefaultDetailsForm.setEmdDurKey(elgEligMemberDefaultsEmd.getEmdDurKey());
	         
	    	eligMemberDefaultDetailsForm.setEmdDurFlagInd(elgEligMemberDefaultsEmd.getEmdDurFlagInd());        
	    	eligMemberDefaultDetailsForm.setEmdDurFlag(elgEligMemberDefaultsEmd.getEmdDurFlag());
	         
	    	eligMemberDefaultDetailsForm.setEmdClientProdCodeInd(elgEligMemberDefaultsEmd.getEmdClientProdCodeInd());        
	    	eligMemberDefaultDetailsForm.setEmdClientProductCode(elgEligMemberDefaultsEmd.getEmdClientProductCode());
	         
	    	eligMemberDefaultDetailsForm.setEmdClientRiderCodeInd(elgEligMemberDefaultsEmd.getEmdClientRiderCodeInd());        
	    	eligMemberDefaultDetailsForm.setEmdClientRiderCode(elgEligMemberDefaultsEmd.getEmdClientRiderCode());
	    	

	    	eligMemberDefaultDetailsForm.setAddDate(DateUtils.convertDateToString(elgEligMemberDefaultsEmd.getAddDate()));
	    	eligMemberDefaultDetailsForm.setAddTime(elgEligMemberDefaultsEmd.getAddTime().toString());
	    	eligMemberDefaultDetailsForm.setAddProgramName(elgEligMemberDefaultsEmd.getAddProgramName());
	    	eligMemberDefaultDetailsForm.setAddUserName(elgEligMemberDefaultsEmd.getAddUserName());
	    	eligMemberDefaultDetailsForm.setChgDate(DateUtils.convertDateToString(elgEligMemberDefaultsEmd.getChgDate()));
	    	eligMemberDefaultDetailsForm.setChgTime(elgEligMemberDefaultsEmd.getChgTime().toString());
	    	eligMemberDefaultDetailsForm.setChgProgramName(elgEligMemberDefaultsEmd.getChgProgramName());
	    	eligMemberDefaultDetailsForm.setChgUserName(elgEligMemberDefaultsEmd.getChgUserName());
	        return eligMemberDefaultDetailsForm;

	    }
	    
		private String checkPlanCode(String platformId, String planCode) throws Exception {	    	
	    	String api = "/getPlanByPlanCode?pcode="+URLEncoder.encode(planCode.trim(),"UTF-8") ;   
	    	String results = nonEligAPIServices.callNonEligDataService(platformId, api);	
	        return results;
	      
	    }
		
		private String checkClientAndPharmacyPriceSchedule(String platformId, String priceSchedule) throws Exception {	    	
	    	String api = "/getPrcPriceScheduleByScheduleName?pid="+URLEncoder.encode(priceSchedule.trim(),"UTF-8") ;   
	    	String results = nonEligAPIServices.callNonEligDataService(platformId, api);	
	        return results;
	      
	    }
		
		private String checkClientAndPharmacyPatientPay(String platformId, String patientPay) throws Exception {	    	
	    	String api = "/getPatientPayScheduleByScheduleName?pid="+URLEncoder.encode(patientPay.trim(),"UTF-8") ;   
	    	String results = nonEligAPIServices.callNonEligDataService(platformId, api);	
	        return results;
	      
	    }
		
/*		private String checkClientPriceSchedule(String platformId, String planCode) throws Exception {	    	
	    	String api = "/getPrcPriceScheduleByScheduleName?pid="+URLEncoder.encode(planCode.trim(),"UTF-8") ;   
	    	String results = nonEligAPIServices.callNonEligDataService(platformId, api);	
	        return results;
	      
	    }
		
		private String checkClientPatientPay(String platformId, String planCode) throws Exception {	    	
	    	String api = "/getPatientPayScheduleByScheduleName?pcode="+URLEncoder.encode(planCode.trim(),"UTF-8") ;   
	    	String results = nonEligAPIServices.callNonEligDataService(platformId, api);	
	        return results;
	      
	    }*/
	    
}
