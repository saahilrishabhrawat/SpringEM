package com.optum.rxclaimnextgen.elg.services;

import com.optum.ibm.entities.ObjectStatistics;
import com.optum.ibm.entities.Sysschemas;
import com.optum.ibm.entities.Systables;
import com.optum.rxclaimnextgen.elg.entities.*;
import com.optum.rxclaimnextgen.elg.exceptions.ValidationException;
import com.optum.rxclaimnextgen.elg.pojo.*;
import com.optum.rxclaimnextgen.elg.projections.*;

import java.io.IOException;
import java.util.List;

/**
 * Created by bkocinsk on 5/29/2018.
 */
public interface EligProfileServices {

    public ElgAclAccountList findByAclAccountListName(String aclAccountListName);

    public ElgAldAccountListDetail findByAclAccountListNameAndCarrierIdAndAccAccountId(ElgAldAccountListDetailPK primaryKey);

    public ElgCrdCarrierListDetail findByCrlCarrierListNameAndCarCarrierId(String crlCarrierListName, String carCarrierId);

    public ElgCrlCarrierList findByCrlCarrierListName(String crlCarrierListName);

    public ElgGldGroupListDetail findByGroupListDetailPrimaryKey(String grlGroupListName, String carCarrierId, String accAccountId, String grpGroupId);

    public ElgGrlGroupList findByGrlGroupListName(String grlGroupListName);

    public ElgPlatformId findByPlatformId(String platformId);

    public List<ElgPlatformCarrierMap> findMapByPlatformId(String platformId);

    public ElgPlatformCarrierMap findMapByPlatformIdAndCarrierId(String platformId, String carrierId);

    public List<ElgEligProfileEpf> findByCarCarrierId(String carCarrierId);
	
	public List<EligProfileView> findAllEligProfileData();

	public List<String> getAllPlatforms();

	public List<String> getAllCarrierLists();

	public List<String> getAllCarrierIdsbyCarrierList(String carrierList);

	public Systables findByTableNameAndTableSchema(String tableName, String tableSchema);

	public Sysschemas findBySchemaName(String schemaName);

	public ObjectStatistics findProgramStatInfo(String programSchema, String programName);

	public ElgEligProfileEpf saveProfileDetail(String jsonString, String mode) throws IOException, ValidationException;

    public ElgEligProfileEpf getProfileByPrimaryKey(String carrierId, String accountId, String groupId);

	public ElgEligProfileEpf upsert(ElgEligProfileEpf elgEligProfileEpf);

    public List<ElgCrlCarrierListProjection> getAllCarrierIdsAndDescriptions();

    public List<ElgGrlGroupListProjection> getAllGroupNamesAndDescriptions();

    public List<EligGroupListNames> getAllGroupsForGroupNameList(String groupListName);

    public ElgGroupGrp findByGroupPrimaryKey(String carCarrierId, String accAccountId, String grpGroupId);

    public List<EligGroupListNamesNoProfiles> getAllGroupsWithoutEligProfiles();

    public ElgEodEligOverrideDflts getOverrideDfltsByPrimaryKey(String carCarrierId, String accountId, String groupId);

    public ElgEligWCDefaultsEwd getEligWCDefaultsByPrimaryKey(String carCarrierId, String accountId, String groupId);

    public ElgEqdEligQueueDefaults getEligQueueDefaultsByPrimaryKey(String carCarrierId, String accountId, String groupId, String reportName);

    public List<ElgEqdEligQueueDefaultsProjection> getEligQueueDefaultsForProfile(String carCarrierId, String accountId, String groupId);

    public Boolean checkIfCopayScheduleExists(String platformId, String copayScheduleName, String stepNumber) throws Exception;

    public List<CnwCareNetwork> getCareNetworkByCarrierIdAndNetworkId(String platformId, String carrierId, String networkId) throws Exception;

    public List<PlnPlan> getPlanByPlanCodeAndEffDate(String platformId, String planCode, String effDate) throws Exception;

    public Boolean checkIfCareFacilityExists(String platformId, String carrierId, String careFacilityId) throws Exception;

    public List<CquCareQualifier> getCareQualifierByCarrierIdAndQualifierId(String platformId, String carrierId, String qualifierId) throws Exception;

    public Boolean checkIfCarrierAllowedForPlatform(String platformId, String carrierId);

    public Boolean checkIfCarrierExists(String carrierId);

    public Boolean checkIfAccountExists(String carrierId, String accountId);

    public Boolean checkIfGroupExists(String carrierId, String accountId, String groupId);

    public CopyProfileForm copyProfile(String jsonString) throws IOException, ValidationException;

    public ElgEqdEligQueueDefaults saveEligQueueDetail(String jsonString) throws IOException, ValidationException;

    public void inactivateProfile(String carrierId, String accountId, String groupId, String body) throws Exception;
}

