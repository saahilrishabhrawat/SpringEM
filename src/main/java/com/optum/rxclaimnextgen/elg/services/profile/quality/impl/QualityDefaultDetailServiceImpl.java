package com.optum.rxclaimnextgen.elg.services.profile.quality.impl;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.optum.rxclaimnextgen.elg.entities.ElgEligQualityDefaultsQde;
import com.optum.rxclaimnextgen.elg.exceptions.ValidationException;
import com.optum.rxclaimnextgen.elg.pojo.profile.quality.EligQualityDefaultDetailForm;
import com.optum.rxclaimnextgen.elg.repositories.ElgEligQualityDefaultsQdeRepository;
import com.optum.rxclaimnextgen.elg.services.profile.member.HealthDefaultDetailService;
import com.optum.rxclaimnextgen.elg.services.profile.quality.QualityDefaultDetailService;
import com.optum.rxclaimnextgen.elg.utils.DateUtils;

@Service
public class QualityDefaultDetailServiceImpl implements QualityDefaultDetailService {
	
	  @Autowired
	    private ElgEligQualityDefaultsQdeRepository elgEligQualityDefaultsQdeRepository;


	 public EligQualityDefaultDetailForm saveQualityDefaultDetails(String jsonString) throws IOException,ValidationException,Exception {
	        String results = null;
	        ObjectMapper mapper = new ObjectMapper();
	        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
	        EligQualityDefaultDetailForm formData = mapper.readValue(jsonString, new TypeReference<EligQualityDefaultDetailForm>() {
	        });	        
			EligQualityDefaultDetailForm eligQualityDefaultDetailForm = null;
			eligQualityDefaultDetailForm = populateQualityDefaultDetailsPojoFromEntity(callQualityDefaultDetailsUpsert(formData));
			eligQualityDefaultDetailForm.setMessage("SUCCESS");   
	        return eligQualityDefaultDetailForm;
	    }	 
	 
	
	    
	    private ElgEligQualityDefaultsQde callQualityDefaultDetailsUpsert(EligQualityDefaultDetailForm eligQualityDefaultDetailForm) {
	    	ElgEligQualityDefaultsQde elgEligQualityDefaultsQde;
	    	elgEligQualityDefaultsQde = getQualityDefaultDetailsByPrimaryKey(eligQualityDefaultDetailForm.getCarCarrierId(), eligQualityDefaultDetailForm.getAccountId(), eligQualityDefaultDetailForm.getGroupId());
	        if (elgEligQualityDefaultsQde == null) {
	        	elgEligQualityDefaultsQde = new ElgEligQualityDefaultsQde();
	        	elgEligQualityDefaultsQde.setCarCarrierId(eligQualityDefaultDetailForm.getCarCarrierId());
	        	elgEligQualityDefaultsQde.setAccountId(eligQualityDefaultDetailForm.getAccountId());
	        	elgEligQualityDefaultsQde.setGroupId(eligQualityDefaultDetailForm.getGroupId());
	        	elgEligQualityDefaultsQde.setAddDate(DateUtils.currentDate());
	        	elgEligQualityDefaultsQde.setAddTime(DateUtils.currentTime());
	        	elgEligQualityDefaultsQde.setAddProgramName("JAVA_PRG");
	        	elgEligQualityDefaultsQde.setAddUserName("TEST_USER");
	        	elgEligQualityDefaultsQde.setChgDate(DateUtils.currentDate());
	        	elgEligQualityDefaultsQde.setChgTime(DateUtils.currentTime());
	        	elgEligQualityDefaultsQde.setChgProgramName("JAVA_PRG");
	        	elgEligQualityDefaultsQde.setChgUserName("TEST_USER");

	        } else {
	        	elgEligQualityDefaultsQde.setChgDate(DateUtils.currentDate());
	        	elgEligQualityDefaultsQde.setChgTime(DateUtils.currentTime());
	        	elgEligQualityDefaultsQde.setChgProgramName("JAVA_PRG");
	        	elgEligQualityDefaultsQde.setChgUserName("TEST_USER");
	        }
	        
	        elgEligQualityDefaultsQde.setQdePersonCodeInd(eligQualityDefaultDetailForm.getQdePersonCodeInd());
	        elgEligQualityDefaultsQde.setQdeGenderInd(eligQualityDefaultDetailForm.getQdeGenderInd());   
	        elgEligQualityDefaultsQde.setQdeDateOfBirthInd(eligQualityDefaultDetailForm.getQdeDateOfBirthInd());   
	        elgEligQualityDefaultsQde.setQdeDurKeyInd(eligQualityDefaultDetailForm.getQdeDurKeyInd());   
	        elgEligQualityDefaultsQde.setQdeSocSecNbrInd(eligQualityDefaultDetailForm.getQdeSocSecNbrInd());   
	        elgEligQualityDefaultsQde.setQdeAddress1Ind(eligQualityDefaultDetailForm.getQdeAddress1Ind());   
	        elgEligQualityDefaultsQde.setQdeAddress2Ind(eligQualityDefaultDetailForm.getQdeAddress2Ind());   
	        elgEligQualityDefaultsQde.setQdeAddress3Ind(eligQualityDefaultDetailForm.getQdeAddress3Ind());   
	        elgEligQualityDefaultsQde.setQdeCityInd(eligQualityDefaultDetailForm.getQdeCityInd());   
	        elgEligQualityDefaultsQde.setQdeStateInd(eligQualityDefaultDetailForm.getQdeStateInd());   
	        elgEligQualityDefaultsQde.setQdeZipInd(eligQualityDefaultDetailForm.getQdeZipInd());   
	        elgEligQualityDefaultsQde.setQdeZip2Ind(eligQualityDefaultDetailForm.getQdeZip2Ind());   
	        elgEligQualityDefaultsQde.setQdeZip3Ind(eligQualityDefaultDetailForm.getQdeZip3Ind());   
	        elgEligQualityDefaultsQde.setQdeFamilyFlagInd(eligQualityDefaultDetailForm.getQdeFamilyFlagInd());   
	        elgEligQualityDefaultsQde.setQdeFamilyTypeInd(eligQualityDefaultDetailForm.getQdeFamilyTypeInd());   
	        elgEligQualityDefaultsQde.setQdeFamilyIdInd(eligQualityDefaultDetailForm.getQdeFamilyIdInd());   
	        elgEligQualityDefaultsQde.setQdePlanCodeInd(eligQualityDefaultDetailForm.getQdePlanCodeInd());   
	        elgEligQualityDefaultsQde.setQdePlanEffDateInd(eligQualityDefaultDetailForm.getQdePlanEffDateInd());   
	        elgEligQualityDefaultsQde.setQdeClientProdCodeInd(eligQualityDefaultDetailForm.getQdeClientProdCodeInd());   
	        elgEligQualityDefaultsQde.setQdeClientRiderCodeInd(eligQualityDefaultDetailForm.getQdeClientRiderCodeInd());   
	        elgEligQualityDefaultsQde.setQdeMedPartdCntNbrInd(eligQualityDefaultDetailForm.getQdeMedPartdCntNbrInd());   
	        elgEligQualityDefaultsQde.setQdeMedicareHicInd(eligQualityDefaultDetailForm.getQdeMedicareHicInd());   
	        elgEligQualityDefaultsQde.setQdePbpInd(eligQualityDefaultDetailForm.getQdePbpInd());   
	        elgEligQualityDefaultsQde.setQdeSubsidyLevelInd(eligQualityDefaultDetailForm.getQdeSubsidyLevelInd());   
	        elgEligQualityDefaultsQde.setQdeCopayCategoryInd(eligQualityDefaultDetailForm.getQdeCopayCategoryInd());   
	        elgEligQualityDefaultsQde.setQdeMbrCddEffDateInd(eligQualityDefaultDetailForm.getQdeMbrCddEffDateInd());   
	        elgEligQualityDefaultsQde.setQdeMbrCddThruDateInd(eligQualityDefaultDetailForm.getQdeMbrCddThruDateInd());   
	        elgEligQualityDefaultsQde.setQdeMbrCddInd(eligQualityDefaultDetailForm.getQdeMbrCddInd());   
	        elgEligQualityDefaultsQde.setQdeMpartdEffDateInd(eligQualityDefaultDetailForm.getQdeMpartdEffDateInd());   	        
	        elgEligQualityDefaultsQde.setQdeMpartdThruDateInd(eligQualityDefaultDetailForm.getQdeMpartdThruDateInd());   
	        elgEligQualityDefaultsQde.setQdeMsiAltIdInd(eligQualityDefaultDetailForm.getQdeMsiAltIdInd());   
	        elgEligQualityDefaultsQde.setQdeAltInsTypeInd(eligQualityDefaultDetailForm.getQdeAltInsTypeInd());   
	        elgEligQualityDefaultsQde.setQdeMbrAptcIndInd(eligQualityDefaultDetailForm.getQdeMbrAptcIndInd());   
	        elgEligQualityDefaultsQde.setQdeHimGpEffDateInd(eligQualityDefaultDetailForm.getQdeHimGpEffDateInd());   
	        elgEligQualityDefaultsQde.setQdeHimGpThruDateInd(eligQualityDefaultDetailForm.getQdeHimGpThruDateInd());  
	        
	        return qualityDefaultDetailsUpsert(elgEligQualityDefaultsQde);
	    }

	    public ElgEligQualityDefaultsQde qualityDefaultDetailsUpsert(ElgEligQualityDefaultsQde elgEligQualityDefaultsQde) {
	        return elgEligQualityDefaultsQdeRepository.saveAndFlush(elgEligQualityDefaultsQde);
	    }


	    public EligQualityDefaultDetailForm populateQualityDefaultDetails(String carrierId, String accountId, String groupId) {
	    	EligQualityDefaultDetailForm  eligQualityDefaultDetailForm  = null;
	    	ElgEligQualityDefaultsQde elgEligQualityDefaultsQde = getQualityDefaultDetailsByPrimaryKey(carrierId, accountId, groupId);
	        
	        if(elgEligQualityDefaultsQde!=null)
	        	eligQualityDefaultDetailForm = populateQualityDefaultDetailsPojoFromEntity(elgEligQualityDefaultsQde);
	        
	        return eligQualityDefaultDetailForm;
	    }

	    public ElgEligQualityDefaultsQde getQualityDefaultDetailsByPrimaryKey(String carrierId, String accountId, String groupId) {
	    	ElgEligQualityDefaultsQde elgEligQualityDefaultsQde = elgEligQualityDefaultsQdeRepository.findByCarCarrierIdAndAccountIdAndGroupId(carrierId, accountId, groupId);       
	        return elgEligQualityDefaultsQde;
	    }

	    public EligQualityDefaultDetailForm populateQualityDefaultDetailsPojoFromEntity(ElgEligQualityDefaultsQde elgEligQualityDefaultsQde) {
	    	EligQualityDefaultDetailForm eligQualityDefaultDetailForm = new EligQualityDefaultDetailForm();
	    	eligQualityDefaultDetailForm.setCarCarrierId(elgEligQualityDefaultsQde.getCarCarrierId());
	    	eligQualityDefaultDetailForm.setAccountId(elgEligQualityDefaultsQde.getAccountId());
	    	eligQualityDefaultDetailForm.setGroupId(elgEligQualityDefaultsQde.getGroupId());
	    	
	    	eligQualityDefaultDetailForm.setQdePersonCodeInd(elgEligQualityDefaultsQde.getQdePersonCodeInd());
	        eligQualityDefaultDetailForm.setQdeGenderInd(elgEligQualityDefaultsQde.getQdeGenderInd());   
	        eligQualityDefaultDetailForm.setQdeDateOfBirthInd(elgEligQualityDefaultsQde.getQdeDateOfBirthInd());   
	        eligQualityDefaultDetailForm.setQdeDurKeyInd(elgEligQualityDefaultsQde.getQdeDurKeyInd());   
	        eligQualityDefaultDetailForm.setQdeSocSecNbrInd(elgEligQualityDefaultsQde.getQdeSocSecNbrInd());   
	        eligQualityDefaultDetailForm.setQdeAddress1Ind(elgEligQualityDefaultsQde.getQdeAddress1Ind());   
	        eligQualityDefaultDetailForm.setQdeAddress2Ind(elgEligQualityDefaultsQde.getQdeAddress2Ind());   
	        eligQualityDefaultDetailForm.setQdeAddress3Ind(elgEligQualityDefaultsQde.getQdeAddress3Ind());   
	        eligQualityDefaultDetailForm.setQdeCityInd(elgEligQualityDefaultsQde.getQdeCityInd());   
	        eligQualityDefaultDetailForm.setQdeStateInd(elgEligQualityDefaultsQde.getQdeStateInd());   
	        eligQualityDefaultDetailForm.setQdeZipInd(elgEligQualityDefaultsQde.getQdeZipInd());   
	        eligQualityDefaultDetailForm.setQdeZip2Ind(elgEligQualityDefaultsQde.getQdeZip2Ind());   
	        eligQualityDefaultDetailForm.setQdeZip3Ind(elgEligQualityDefaultsQde.getQdeZip3Ind());   
	        eligQualityDefaultDetailForm.setQdeFamilyFlagInd(elgEligQualityDefaultsQde.getQdeFamilyFlagInd());   
	        eligQualityDefaultDetailForm.setQdeFamilyTypeInd(elgEligQualityDefaultsQde.getQdeFamilyTypeInd());   
	        eligQualityDefaultDetailForm.setQdeFamilyIdInd(elgEligQualityDefaultsQde.getQdeFamilyIdInd());   
	        eligQualityDefaultDetailForm.setQdePlanCodeInd(elgEligQualityDefaultsQde.getQdePlanCodeInd());   
	        eligQualityDefaultDetailForm.setQdePlanEffDateInd(elgEligQualityDefaultsQde.getQdePlanEffDateInd());   
	        eligQualityDefaultDetailForm.setQdeClientProdCodeInd(elgEligQualityDefaultsQde.getQdeClientProdCodeInd());   
	        eligQualityDefaultDetailForm.setQdeClientRiderCodeInd(elgEligQualityDefaultsQde.getQdeClientRiderCodeInd());   
	        eligQualityDefaultDetailForm.setQdeMedPartdCntNbrInd(elgEligQualityDefaultsQde.getQdeMedPartdCntNbrInd());   
	        eligQualityDefaultDetailForm.setQdeMedicareHicInd(elgEligQualityDefaultsQde.getQdeMedicareHicInd());   
	        eligQualityDefaultDetailForm.setQdePbpInd(elgEligQualityDefaultsQde.getQdePbpInd());   
	        eligQualityDefaultDetailForm.setQdeSubsidyLevelInd(elgEligQualityDefaultsQde.getQdeSubsidyLevelInd());   
	        eligQualityDefaultDetailForm.setQdeCopayCategoryInd(elgEligQualityDefaultsQde.getQdeCopayCategoryInd());   
	        eligQualityDefaultDetailForm.setQdeMbrCddEffDateInd(elgEligQualityDefaultsQde.getQdeMbrCddEffDateInd());   
	        eligQualityDefaultDetailForm.setQdeMbrCddThruDateInd(elgEligQualityDefaultsQde.getQdeMbrCddThruDateInd());   
	        eligQualityDefaultDetailForm.setQdeMbrCddInd(elgEligQualityDefaultsQde.getQdeMbrCddInd());   
	        eligQualityDefaultDetailForm.setQdeMpartdEffDateInd(elgEligQualityDefaultsQde.getQdeMpartdEffDateInd());   	        
	        eligQualityDefaultDetailForm.setQdeMpartdThruDateInd(elgEligQualityDefaultsQde.getQdeMpartdThruDateInd());   
	        eligQualityDefaultDetailForm.setQdeMsiAltIdInd(elgEligQualityDefaultsQde.getQdeMsiAltIdInd());   
	        eligQualityDefaultDetailForm.setQdeAltInsTypeInd(elgEligQualityDefaultsQde.getQdeAltInsTypeInd());   
	        eligQualityDefaultDetailForm.setQdeMbrAptcIndInd(elgEligQualityDefaultsQde.getQdeMbrAptcIndInd());   
	        eligQualityDefaultDetailForm.setQdeHimGpEffDateInd(elgEligQualityDefaultsQde.getQdeHimGpEffDateInd());   
	        eligQualityDefaultDetailForm.setQdeHimGpThruDateInd(elgEligQualityDefaultsQde.getQdeHimGpThruDateInd());  

	    	eligQualityDefaultDetailForm.setAddDate(DateUtils.convertDateToString(elgEligQualityDefaultsQde.getAddDate()));
	    	eligQualityDefaultDetailForm.setAddTime(elgEligQualityDefaultsQde.getAddTime().toString());
	    	eligQualityDefaultDetailForm.setAddProgramName(elgEligQualityDefaultsQde.getAddProgramName());
	    	eligQualityDefaultDetailForm.setAddUserName(elgEligQualityDefaultsQde.getAddUserName());
	    	eligQualityDefaultDetailForm.setChgDate(DateUtils.convertDateToString(elgEligQualityDefaultsQde.getChgDate()));
	    	eligQualityDefaultDetailForm.setChgTime(elgEligQualityDefaultsQde.getChgTime().toString());
	    	eligQualityDefaultDetailForm.setChgProgramName(elgEligQualityDefaultsQde.getChgProgramName());
	    	eligQualityDefaultDetailForm.setChgUserName(elgEligQualityDefaultsQde.getChgUserName());
	        return eligQualityDefaultDetailForm;
	    }


}
