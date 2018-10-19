package com.optum.rxclaimnextgen.services.impl;

import com.optum.rxclaimnextgen.entities.*;
import com.optum.rxclaimnextgen.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bkocinsk on 7/19/2018.
 */
@Service
public class ClaimServicesImpl implements com.optum.rxclaimnextgen.services.ClaimServices {

    @Autowired
    private CfaCareFacilityRepository cfaCareFacilityRepo;
    @Autowired
    private PlnPlanRepository plnPlanRepo;

    @Autowired
    private CnwCareNetworkRepository cnwCareNetworkRepo;

    @Autowired
    private CquCareQualifierRepository cquCareQualifierRepo;

    @Autowired
    private PrfPrescriberIdRepository prfPrescriberIdRepo;

    @Autowired
    private PrqPrescriberQualTypeRepository prqPrescriberQualTypeRepo;

    @Autowired
    private PhyPrescriberRepository phyPrescriberRepo;

    @Autowired
    private CscCopayScheduleRepository cscCopayScheduleRepo;

    @Autowired
    DigDiagnosisRepository digDiagnosisRepository;
    @Autowired
    CfaCareFacilityRepository cfaCareFacilityRepository;
    @Autowired
    PlnPlanRepository plnPlanRepository;

    @Autowired
    EltEmailDistributionRepository eltEmailDistributionRepository;




    public CfaCareFacility findByCarrierIdAndCareFacilityId(String carrierId, String careFacilityId) {
        CfaCareFacility results = cfaCareFacilityRepo.findByCarrierIdAndCareFacilityId(carrierId, careFacilityId);
        return results;
    }

    public PlnPlan findByPlanCodeAndPlanEffDateAndPlanTermDate(String planCode, int planEffDate, int planTermDate) {
        PlnPlan results = plnPlanRepo.findByPlanCodeAndPlanEffDateAndPlanTermDate(planCode, planEffDate, planTermDate);
        return results;
    }

    public List<PlnPlan> findByPlanCode(String planCode) {
        List<PlnPlan> results = plnPlanRepo.findByPlanCode(planCode);
        return results;
    }

    public CnwCareNetwork findByNetworkbyPrimaryKey(String carrierId, String accountId, String groupId, String networkId) {
        CnwCareNetwork results = cnwCareNetworkRepo.findByCarrierIdAndAccountIdAndGroupIdAndNetworkId(carrierId, accountId, groupId, networkId);
        return results;
    }

    public List<CnwCareNetwork> findNetworkByNetworkId(String networkId) {
        List<CnwCareNetwork> results = cnwCareNetworkRepo.findByNetworkId(networkId);
        return results;
    }

    public CquCareQualifier findQualifierByPrimaryKey(String carrierId, String accountId, String groupId, String qualifierId) {
        CquCareQualifier results = cquCareQualifierRepo.findByCarrierIdAndAccountIdAndGroupIdAndQualifierId(carrierId, accountId, groupId, qualifierId);
        return results;
    }

    public List<CquCareQualifier> findQualifierByQualifierId(String qualifierId) {
        List<CquCareQualifier> results = cquCareQualifierRepo.findByQualifierId(qualifierId);
        return results;
    }

    public PrfPrescriberId findPrescriberIdByPrimaryKey(String prescriberId, String prescriberIdQualifier, String prescriberIdState) {
        PrfPrescriberId results = prfPrescriberIdRepo.findByPrescriberIdAndPrescriberIdQualifierAndPrescriberIdState(prescriberId, prescriberIdQualifier, prescriberIdState);
        return results;
    }

    public List<PrfPrescriberId> findPrescriberIdByPrescriberId(String prescriberId) {
        List<PrfPrescriberId> results = prfPrescriberIdRepo.findByPrescriberId(prescriberId);
        return results;
    }

    public PrqPrescriberQualType findPrescriberQualTypeByPrescriberIdQualifier(String prescriberIdQualifier) {
        PrqPrescriberQualType results = prqPrescriberQualTypeRepo.findByPrescriberIdQualifier(prescriberIdQualifier);
        return results;
    }

    public PhyPrescriber findPhyPrescriberByPrescriberKey(String prescriberKey) {
        PhyPrescriber results = phyPrescriberRepo.findByPrescriberKey(prescriberKey);
        return results;
    }

    public CscCopaySchedule findCopayScheduleByPrimaryKey(String copayScheduleName, int stepNbr) {
        CscCopaySchedule results = cscCopayScheduleRepo.findByCopayScheduleNameAndStepNbr(copayScheduleName, stepNbr);
        return results;
    }

    public List<CnwCareNetwork> findCareNetworkByCarrierIdAndNetworkId(String carrierId, String networkId) {
        List<CnwCareNetwork> results = cnwCareNetworkRepo.findByCarrierIdAndNetworkId(carrierId, networkId);
        return results;
    }

    public List<PlnPlan> findPlanByPlanCodeAndEffDate(String planCode, int effDate) {
        List<PlnPlan> results = plnPlanRepo.findByPlanCodeAndPlanEffDate(planCode, effDate);
        return results;
    }

    public List<CquCareQualifier> findCareQualifierByCarrierIdAndQualifierId(String carrierId, String qualifierId) {
        List<CquCareQualifier> results = cquCareQualifierRepo.findByCarrierIdAndQualifierId(carrierId, qualifierId);
        return results;
    }

	@Override
	public int findPrescriberIdCount(String prescriberId) {
		
		int results = prfPrescriberIdRepo.getPrescriberIdCount(prescriberId);
		return results;
	}
	@Override
	public int findcareFacilityIdCount(String careFacilityId, String carCarrierId) {
		int results=cfaCareFacilityRepository.getCareFacilityIdCount(careFacilityId, carCarrierId);
		return results;
	}

	
	@Override
	public String findQualifierAbbreviation(String PrfPrescriberId) {
		String prescriberIdQualifier=prfPrescriberIdRepo.getPrescriberIdQualifier(PrfPrescriberId);
		String results =  prqPrescriberQualTypeRepo.getQualifierAbbreviation( prescriberIdQualifier);
		return results;
	}
	@Override
	public String findFormattedName(String PrfPrescriberId) {
		String prescriberKey =prfPrescriberIdRepo.getPrescriberKey(PrfPrescriberId);
		String lastName=phyPrescriberRepo.getLastName(prescriberKey);
		String firstName=phyPrescriberRepo.getFirstName(prescriberKey);
		String name=lastName.trim()+", "+firstName.trim();
		return name;
	}

	@Override
	public String findPrescriberIdState(String PrfPrescriberId) {
		String prescriberIdState=prfPrescriberIdRepo.getPrescriberIdState(PrfPrescriberId);
		return prescriberIdState;
	}

    public DigDiagnosis findByDiagnosisCode(String diagnosisCode) {
        return digDiagnosisRepository.findByDiagnosisCode(diagnosisCode);
    }

	//Network
	@Override
	public String findValidNetworkForAllGroupAndAccount(String networkId, String carrierId, String accountId,
			String groupId) {
		String message=cnwCareNetworkRepo.findValidNetworkForAllGroupAndAccount(networkId, carrierId);
		return message;
	}

	@Override
	public String findValidNetworkForAllAccount(String networkId, String carrierId, String accountId, String groupId) {
		String message=cnwCareNetworkRepo.findValidNetworkForAllAccount(networkId, carrierId, groupId);	
		return message;

	}

	@Override
	public String findValidNetworkForAllGroup(String networkId, String carrierId, String accountId, String groupId) {
		String message=cnwCareNetworkRepo.findValidNetworkForAllGroup(networkId, carrierId, accountId);
		return message;
		
	}

	@Override
	public String findValidNetworkForCAG(String networkId, String carrierId, String accountId, String groupId) {
		String message=cnwCareNetworkRepo.findValidNetworkForCAG(networkId, carrierId, accountId, groupId);
		return message;
	}

	@Override
    public EltEmailDistribution findByEltEmailDistListID(String eltEmailDistListID) {
        return eltEmailDistributionRepository.findByEltEmailDistListID(eltEmailDistListID);
    }

	
	//Care Assign Qualifier validations added

	@Override
	public String findValidQualifierForAllGroupAndAccount(String qualifierId, String carrierId, String accountId,
			String groupId) {
		String message=cquCareQualifierRepo.findValidQualifierForAllGroupAndAccount(qualifierId, carrierId);
		  System.out.println("Qualifier>>>>>" + message);
		return message;
	}

	@Override
	public String findValidQualifierForAllAccount(String qualifierId, String carrierId, String accountId, String groupId) {
		String message=cquCareQualifierRepo.findValidQualifierForAllAccount(qualifierId, carrierId, groupId);
		  System.out.println("Qualifier>>>>>" + message);
		return message;

	}

	@Override
	public String findValidQualifierForAllGroup(String qualifierId, String carrierId, String accountId, String groupId) {
		String message=cquCareQualifierRepo.findValidQualifierForAllGroup(qualifierId, carrierId, accountId);
		  System.out.println("Qualifier>>>>>" + message);
		return message;
		
	}

	@Override
	public String findValidQualifierForCAG(String qualifierId, String carrierId, String accountId, String groupId) {
		String message=cquCareQualifierRepo.findValidQualifierForCAG(qualifierId, carrierId, accountId, groupId);
		  System.out.println("Qualifier>>>>>" + message);
		return message;
	}




}
