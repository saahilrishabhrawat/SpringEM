package com.optum.rxclaimnextgen.services;

import com.optum.rxclaimnextgen.entities.*;

import java.util.List;


/**
 * Created by bkocinsk on 7/19/2018.
 */

public interface ClaimServices {

    public CfaCareFacility findByCarrierIdAndCareFacilityId(String carrierId, String careFacilityId);

    public PlnPlan findByPlanCodeAndPlanEffDateAndPlanTermDate(String planCode, int planEffDate, int planTermDate);

    public List<PlnPlan> findByPlanCode(String planCode);

    public CnwCareNetwork findByNetworkbyPrimaryKey(String carrierId, String accountId, String groupId, String networkId);

    public List<CnwCareNetwork> findNetworkByNetworkId(String networkId);

    public CquCareQualifier findQualifierByPrimaryKey(String carrierId, String accountId, String groupId, String qualifierId);

    public List<CquCareQualifier> findQualifierByQualifierId(String qualifierId);

    public PrfPrescriberId findPrescriberIdByPrimaryKey(String prescriberId, String prescriberIdQualifier, String prescriberIdState);

    public List<PrfPrescriberId> findPrescriberIdByPrescriberId(String prescriberId);

    public PrqPrescriberQualType findPrescriberQualTypeByPrescriberIdQualifier(String prescriberIdQualifier);

    public PhyPrescriber findPhyPrescriberByPrescriberKey(String prescriberKey);

    public CscCopaySchedule findCopayScheduleByPrimaryKey(String copayScheduleName, int stepNbr);

    public List<CnwCareNetwork> findCareNetworkByCarrierIdAndNetworkId(String carrierId, String networkId);

    public List<PlnPlan> findPlanByPlanCodeAndEffDate(String planCode, int effDate);

    public List<CquCareQualifier> findCareQualifierByCarrierIdAndQualifierId(String carrierId, String qualifierId);
    
    //Get Count of Prescriber Id
    public int findPrescriberIdCount(String prescriberId);
    public String findQualifierAbbreviation(String PrfPrescriberId);
    public String findPrescriberIdState( String PrfPrescriberId);
    public String findFormattedName(String PrfPrescriberId);

    DigDiagnosis findByDiagnosisCode(String diagnosisCode);
    
    public int findcareFacilityIdCount(String careFacilityId, String carCarrierId);   
    //Network validation
    public String findValidNetworkForAllGroupAndAccount(String networkId, String carrierId,String accountId,String groupId);
    public String findValidNetworkForAllAccount(String networkId, String carrierId,String accountId,String groupId);
    public String findValidNetworkForAllGroup(String networkId, String carrierId,String accountId,String groupId);
    public String findValidNetworkForCAG(String networkId, String carrierId,String accountId,String groupId);
//Qualifier validations
    
    public String findValidQualifierForAllGroupAndAccount(String qualifierId, String carrierId,String accountId,String groupId);
    public String findValidQualifierForAllAccount(String qualifierId, String carrierId,String accountId,String groupId);
    public String findValidQualifierForAllGroup(String qualifierId, String carrierId,String accountId,String groupId);
    public String findValidQualifierForCAG(String qualifierId, String carrierId,String accountId,String groupId);

    EltEmailDistribution findByEltEmailDistListID(String eltEmailDistListID);
}
