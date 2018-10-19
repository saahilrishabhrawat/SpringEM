package com.optum.rxclaimnextgen.elg.services.impl;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.optum.AbstractTest;
import com.optum.ibm.entities.ObjectStatistics;
import com.optum.ibm.entities.Sysschemas;
import com.optum.ibm.entities.Systables;
import com.optum.ibm.repositories.ObjectStatisticsRepository;
import com.optum.ibm.repositories.SysschemasRepository;
import com.optum.ibm.repositories.SystablesRepository;
import com.optum.rxclaimnextgen.elg.entities.*;
import com.optum.rxclaimnextgen.elg.exceptions.ValidationException;
import com.optum.rxclaimnextgen.elg.pojo.EligGroupListNamesNoProfiles;
import com.optum.rxclaimnextgen.elg.pojo.EligProfileDetailForm;
import com.optum.rxclaimnextgen.elg.pojo.EligProfileView;
import com.optum.rxclaimnextgen.elg.projections.*;
import com.optum.rxclaimnextgen.elg.repositories.*;
import com.optum.rxclaimnextgen.elg.services.EligProfileServices;
import com.optum.rxclaimnextgen.elg.services.NonEligAPIServices;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class EligProfileServicesImplTest extends AbstractTest {

    @Autowired
    private EligProfileServices eligProfileServicesImpl;

    @Autowired
    private NonEligAPIServices nonEligAPIServicesImpl;

    @MockBean
    private ElgAclAccountListRepository elgAclAccountListRepo;

    @MockBean
    private ElgAldAccountListDetailRepository elgAldAccountListDetailRepo;

    @MockBean
    private ElgCrdCarrierListDetailRepository elgCrdCarrierListDetailRepo;

    @MockBean
    private ElgCrlCarrierListRepository elgCrlCarrierListRepo;

    @MockBean
    private ElgGldGroupListDetailRepository elgGldGroupListDetailRepo;

    @MockBean
    private ElgGrlGroupListRepository elgGrlGroupListRepo;

    @MockBean
    private ElgPlatformIdRepository elgPlatformIdRepo;

    @MockBean
    private ElgPlatformCarrierMapRepository elgPlatformCarrierMapRepo;

    @MockBean
    private ElgEligProfileEpfRepository eligProfEpfRepo;

    @MockBean
    private ElgProfileViewRepository elgProfileDataRepository;

    @MockBean
    private ElgGroupGrpRepository elgGroupGrpRepo;

    @MockBean
    private ElgEodEligOverrideDfltsRepository elgEodEligOverrideDfltsRepo;

    @MockBean
    private ElgEqdEligQueueDefaultsRepository elgEqdEligQueueDefaultsRepo;





    /*  *****************  IBM Catalog Repositories ***********************/

    @MockBean
    private SystablesRepository systablesRepository;

    @MockBean
    private SysschemasRepository sysschemasRepository;

    @MockBean
    private ObjectStatisticsRepository objectStatisticsRepository;


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void findByAclAccountListName() throws Exception {
        String testAccountName = "foobar";
        ElgAclAccountList expectedResult = new ElgAclAccountList();
        when(elgAclAccountListRepo.findByAclAccountListName(testAccountName))
                .thenReturn(expectedResult)
        ;

        assertEquals(expectedResult, this.eligProfileServicesImpl.findByAclAccountListName(testAccountName));
    }

    @Test
    public void findByAclAccountListNameAndCarrierIdAndAccAccountId() throws Exception {
        ElgAldAccountListDetailPK elgAldAccountListDetailPKTest = new ElgAldAccountListDetailPK();
        elgAldAccountListDetailPKTest.setAccAccountId("accountId");
        elgAldAccountListDetailPKTest.setCarCarrierId("carrierId");
        elgAldAccountListDetailPKTest.setAclAccountListName("accountListName");

        ElgAldAccountListDetail expectedResult = new ElgAldAccountListDetail();

        when(elgAldAccountListDetailRepo.findByAclAccountListNameAndCarCarrierIdAndAccAccountId("accountListName", "carrierId", "accountId"))
                .thenReturn(expectedResult);

        assertEquals(expectedResult, eligProfileServicesImpl.findByAclAccountListNameAndCarrierIdAndAccAccountId(elgAldAccountListDetailPKTest));
    }

    @Test
    public void findByCrlCarrierListNameAndCarCarrierId() throws Exception {
        String crlCarrierListName = "foo";
        String carCarrierId = "bar";
        ElgCrdCarrierListDetail expected = new ElgCrdCarrierListDetail();

        when(elgCrdCarrierListDetailRepo.findByCrlCarrierListNameAndCarCarrierId(crlCarrierListName, carCarrierId))
                .thenReturn(expected)
        ;

        assertEquals(expected, eligProfileServicesImpl.findByCrlCarrierListNameAndCarCarrierId(crlCarrierListName, carCarrierId));
    }

    @Test
    public void findByCrlCarrierListName() throws Exception {
        String crlCarrierListName = "foobar";
        ElgCrlCarrierList expected = new ElgCrlCarrierList();

        when(elgCrlCarrierListRepo.findByCrlCarrierListName(crlCarrierListName))
                .thenReturn(expected)
        ;

        assertEquals(expected, eligProfileServicesImpl.findByCrlCarrierListName(crlCarrierListName));
    }

    @Test
    public void findByGroupListDetailPrimaryKey() throws Exception {
        String grlGroupListName = "foo";
        String carCarrierId = "bar";
        String accAccountId = "barfoo";
        String grpGroupId = "foobar";

        ElgGldGroupListDetail expected = new ElgGldGroupListDetail();

        when(elgGldGroupListDetailRepo.findByGrlGroupListNameAndCarCarrierIdAndAccAccountIdAndGrpGroupId(grlGroupListName, carCarrierId, accAccountId, grpGroupId))
                .thenReturn(expected)
        ;

        assertEquals(expected, eligProfileServicesImpl.findByGroupListDetailPrimaryKey(grlGroupListName, carCarrierId, accAccountId, grpGroupId));
    }

    @Test
    public void findByGrlGroupListName() throws Exception {
        String grlGroupListName = "foobar";
        ElgGrlGroupList expected = new ElgGrlGroupList();

        when(elgGrlGroupListRepo.findByGrlGroupListName(grlGroupListName))
                .thenReturn(expected)
        ;

        assertEquals(expected, eligProfileServicesImpl.findByGrlGroupListName(grlGroupListName));
    }

    @Test
    public void findByPlatformId() throws Exception {
        String platformId = "foobar";
        ElgPlatformId expected = new ElgPlatformId();

        when(elgPlatformIdRepo.findByPlatformId(platformId))
                .thenReturn(expected)
        ;

        assertEquals(expected, eligProfileServicesImpl.findByPlatformId(platformId));
    }

    @Test
    public void findByCarCarrierId() throws Exception {
        String carCarrierId = "foobar";
        List<ElgEligProfileEpf> expected = new ArrayList<>();
        ElgEligProfileEpf elgEligProfileEpf = new ElgEligProfileEpf();
        expected.add(elgEligProfileEpf);


        when(eligProfEpfRepo.findByCarCarrierId(carCarrierId))
                .thenReturn(expected)
        ;

        assertEquals(expected, eligProfileServicesImpl.findByCarCarrierId(carCarrierId));
    }

    @Test
    public void findMapByPlatformId() throws Exception {
        String platformId = "foobar";
        List<ElgPlatformCarrierMap> expected = new ArrayList<>();
        ElgPlatformCarrierMap elgPlatformCarrierMap = new ElgPlatformCarrierMap();
        expected.add(elgPlatformCarrierMap);

        when(elgPlatformCarrierMapRepo.findByPlatformId(platformId))
                .thenReturn(expected)
        ;

        assertEquals(expected, eligProfileServicesImpl.findMapByPlatformId(platformId));
    }

    @Test
    public void findMapByPlatformIdAndCarrierId() throws Exception {
        String platformId = "foobar";
        String carrierId = "barfoo";
        ElgPlatformCarrierMap expected = new ElgPlatformCarrierMap();

        when(elgPlatformCarrierMapRepo.findByPlatformIdAndCarrierId(platformId, carrierId))
            .thenReturn(expected)
        ;

        assertEquals(expected, eligProfileServicesImpl.findMapByPlatformIdAndCarrierId(platformId, carrierId));
    }

    @Test
    public void getAllPlatforms() throws Exception {
        List<String> samplePlatforms = Arrays.asList("ABC-123", "123-ZYX", "ZZZ-987");

        when(elgPlatformIdRepo.getAllPlatforms())
                .thenReturn(samplePlatforms)
        ;

        assertEquals(samplePlatforms, eligProfileServicesImpl.getAllPlatforms());
    }

    @Test
    public void getAllCarrierLists() throws Exception {
        List<String> sampleCarriers = Arrays.asList("ABC-123", "123-ZYX", "ZZZ-987");

        when(elgCrlCarrierListRepo.getAllCarrierLists())
                .thenReturn(sampleCarriers)
        ;

        assertEquals(sampleCarriers, eligProfileServicesImpl.getAllCarrierLists());
    }

    @Test
    public void getAllCarrierIdsbyCarrierList() throws Exception {
        List<String> sampleCarriers = Arrays.asList("ABC-123", "123-ZYX", "ZZZ-987");
        String carrierList = "foo";

        when(elgCrlCarrierListRepo.getAllCarrierIdsbyCarrierList(carrierList))
                .thenReturn(sampleCarriers)
        ;

        assertEquals(sampleCarriers, eligProfileServicesImpl.getAllCarrierIdsbyCarrierList(carrierList));
    }

    @Test
    public void findAllEligProfileData() throws Exception {
        List<ElgProfileViewEntity> elgProfileViewEntityArrayList = new ArrayList<>();
        List<EligProfileView> expected = new ArrayList<>();

        ElgProfileViewEntity elgProfileViewEntity = new ElgProfileViewEntity();
        elgProfileViewEntity.setPlatformId("lorem");
        elgProfileViewEntity.setCarCarrierId("barfoo");
        elgProfileViewEntity.setAccountId("foobar");
        elgProfileViewEntity.setGroupId("123ABC   ");
        elgProfileViewEntity.setEpfCurrentLoadDate(new Date(1530032456000L));
        elgProfileViewEntity.setEpfCurrentLoaded(10);
        elgProfileViewEntity.setEpfLoadIdentifier("ipsum ");
        elgProfileViewEntity.setEpfReformatVersion("TESTVERSION   ");
        elgProfileViewEntity.setEpfReformatPgm("REFORMATTEST                ");
        elgProfileViewEntity.setEpfLoadType("TESTLOADTYPE ");
        elgProfileViewEntityArrayList.add(elgProfileViewEntity);

        EligProfileView eligProfileViewExpected = new EligProfileView();
        eligProfileViewExpected.setPlatformId("lorem");
        eligProfileViewExpected.setCarCarrierId("barfoo");
        eligProfileViewExpected.setAccountId("foobar");
        eligProfileViewExpected.setGroupId("123ABC");
        eligProfileViewExpected.setLastLoad("06/26/2018");
        eligProfileViewExpected.setCount(10);
        eligProfileViewExpected.setIdentifier("ipsum");
        eligProfileViewExpected.setVersion("TESTVERSION");
        eligProfileViewExpected.setReformat("REFORMATTEST");
        eligProfileViewExpected.setLoad("TESTLOADTYPE");
        expected.add(eligProfileViewExpected);

        when(elgProfileDataRepository.findElgProfileData())
                .thenReturn(elgProfileViewEntityArrayList)
        ;

        assertEquals(expected, eligProfileServicesImpl.findAllEligProfileData());
    }

    @Test
    public void findByTableNameAndTableSchema() throws Exception {
        Systables expected = new Systables();
        String tableName = "foo";
        String tableSchema = "bar";

        when(systablesRepository.findByTableNameAndTableSchema(tableName, tableSchema))
                .thenReturn(expected)
        ;

        assertEquals(expected, eligProfileServicesImpl.findByTableNameAndTableSchema(tableName, tableSchema));
    }

    @Test
    public void findBySchemaName() throws Exception {
        String schemaName = "foobar";
        Sysschemas expected = new Sysschemas();

        when(sysschemasRepository.findBySchemaName(schemaName))
                .thenReturn(expected)
        ;

        assertEquals(expected, eligProfileServicesImpl.findBySchemaName(schemaName));
    }

    @Test
    public void findProgramStatInfo() throws Exception {
        String programSchema = "FOO";
        String programName = "BAR";
        String programType = "FOOBAR";
        ObjectStatistics expected = new ObjectStatistics();

        when(objectStatisticsRepository.findStats(programSchema, programName))
                .thenReturn(expected)
        ;

        assertEquals(expected, eligProfileServicesImpl.findProgramStatInfo(programSchema, programName));
    }

    /*
    @Test
    public void saveProfileDetailInvalidGroupListAndSchema() throws Exception {
        EligProfileDetailForm eligProfileDetailFormTest = new EligProfileDetailForm();
        String groupListName = "FAKEGROUPLIST";
        eligProfileDetailFormTest.setEpfGroupListName(groupListName);
        String mode = "update";
        HashMap expectedValidationErrors = new HashMap<String, String>();
        expectedValidationErrors.put("epfLibraryName", "Library name was not found");
        expectedValidationErrors.put("epfGroupListName", "C/A/G Eligibility List entered is invalid");

        ObjectMapper objectMapper = new ObjectMapper();

        String json = "{\"carCarrierId\":null,\"platformId\":null,\"accountId\":null,\"groupId\":null,\"epfReformatVersion\":\"ABC123\",\"epfLoadIdentifier\":\"123ABC\",\"epfReformatPgm\":\"ABC1234\",\"epfLibraryName\":null,\"epfGrpFileName\":null,\"epfStatus\":null,\"epfStageGroupsInd\":null,\"epfLoadType\":null,\"epfMbrFileName\":null,\"epfMbrMediaRecordLen\":null,\"epfRejection\":null,\"epfTermThresholdTba\":null,\"epfTermDaysQualifier\":null,\"epfTermNbrOfDays\":null,\"epfGroupLoadType\":null,\"epfGrpMediaRecordLen\":null,\"epfGroupRefreshRej\":null,\"epfTermedMembersRpt\":null,\"epfTermCareAssignment\":null,\"epfSuspendProcessing\":null,\"epfRejectionLookup\":null,\"epfPrintMbrGrpErrors\":null,\"epfPostProcessProgram\":null,\"epfGroupListName\":\"FAKEGROUPLIST\"}";

        when(eligProfileServicesImpl.findByGrlGroupListName(groupListName))
                .thenReturn(null)
        ;

        when(objectStatisticsRepository.findStats(null, null))
                .thenReturn(null)
        ;

        try {
            eligProfileServicesImpl.saveProfileDetail(json, mode);
        }
        catch (ValidationException validationException) {
            ObjectMapper mapper = new ObjectMapper();
            assertEquals(mapper.writer().writeValueAsString(expectedValidationErrors), validationException.getMessage());
        }
    }
    */

    /*
    @Test
    public void saveProfileDetailInvalidSchema() throws Exception {
        EligProfileDetailForm eligProfileDetailFormTest = new EligProfileDetailForm();
        String groupListName = "FAKEGROUPLIST";
        String mode = "update";
        eligProfileDetailFormTest.setEpfGroupListName(groupListName);
        eligProfileDetailFormTest.setEpfReformatPgm("ABCD123");
        eligProfileDetailFormTest.setEpfLoadIdentifier("123ABC");

        ElgGrlGroupList elgGrlGroupList = new ElgGrlGroupList();

        HashMap expectedValidationErrors = new HashMap<String, String>();
        expectedValidationErrors.put("epfLibraryName", "Library name was not found");

        ObjectMapper objectMapper = new ObjectMapper();

        String json = "{\"carCarrierId\":null,\"platformId\":null,\"accountId\":null,\"groupId\":null,\"epfReformatVersion\":\"ABC123\",\"epfLoadIdentifier\":\"ABC1234\",\"epfReformatPgm\":\"123ABC\",\"epfLibraryName\":null,\"epfGrpFileName\":null,\"epfStatus\":null,\"epfStageGroupsInd\":null,\"epfLoadType\":null,\"epfMbrFileName\":null,\"epfMbrMediaRecordLen\":null,\"epfRejection\":null,\"epfTermThresholdTba\":null,\"epfTermDaysQualifier\":null,\"epfTermNbrOfDays\":null,\"epfGroupLoadType\":null,\"epfGrpMediaRecordLen\":null,\"epfGroupRefreshRej\":null,\"epfTermedMembersRpt\":null,\"epfTermCareAssignment\":null,\"epfSuspendProcessing\":null,\"epfRejectionLookup\":null,\"epfPrintMbrGrpErrors\":null,\"epfPostProcessProgram\":null,\"epfGroupListName\":\"FAKEGROUPLIST\"}";

        when(eligProfileServicesImpl.findByGrlGroupListName(groupListName))
                .thenReturn(elgGrlGroupList)
        ;

        when(objectStatisticsRepository.findStats(null, null))
                .thenReturn(null)
        ;

        try {
            eligProfileServicesImpl.saveProfileDetail(json, mode);
        }
        catch (ValidationException validationException) {
            ObjectMapper mapper = new ObjectMapper();
            assertEquals(mapper.writer().writeValueAsString(expectedValidationErrors), validationException.getMessage());
        }
    }
    */

    @Test(expected = JsonParseException.class)
    public void saveProfileDetailInvalidJSON() throws Exception {
        String badStringData = "{SDFSD: ksdfsdf}";
        String mode = "update";
        eligProfileServicesImpl.saveProfileDetail(badStringData, mode);
    }

    @Test
    public void getProfileByPrimaryKey() throws Exception {
        String carrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";

        ElgEligProfileEpf expected = new ElgEligProfileEpf();

        when(eligProfEpfRepo.findByCarCarrierIdAndAccountIdAndGroupId(carrierId, accountId, groupId))
                .thenReturn(expected)
        ;
        assertEquals(expected.toString(), eligProfileServicesImpl.getProfileByPrimaryKey(carrierId, accountId, groupId).toString());
    }

    @Test
    public void getAllCarrierIdsAndDescriptionsTest() {
        List<ElgCrlCarrierListProjection> expected = new ArrayList<>();

        when(elgCrlCarrierListRepo.getAllCarrierIdsAndDescriptions())
            .thenReturn(expected)
        ;

        assertEquals(expected.toString(), this.eligProfileServicesImpl.getAllCarrierIdsAndDescriptions().toString());
    }

    @Test
    public void getAllGroupNamesAndDescriptionsTest() {
        List<ElgGrlGroupListProjection> expected = new ArrayList<>();

        when(elgGrlGroupListRepo.getAllGroupNamesAndDescriptions())
                .thenReturn(expected)
        ;

        assertEquals(expected.toString(), this.eligProfileServicesImpl.getAllGroupNamesAndDescriptions().toString());
    }

    @Test
    public void getAllGroupsForGroupNameListTest() {
        /*
        String groupName = "foobar";
        List<ElgGroupGrpProjection> expected = new ArrayList<>();

        when(elgGroupGrpRepo.getAllGroupsForGroupListName(anyString()))
                .thenReturn(expected)
        ;

        assertEquals(expected.toString(), this.eligProfileServicesImpl.getAllGroupsForGroupNameList(groupName).toString());
       */
    }

    @Test
    public void findByGroupPrimaryKeyTest() {
        String carCarrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";

        ElgGroupGrp expected = new ElgGroupGrp();

        when(elgGroupGrpRepo.findByCarCarrierIdAndAccAccountIdAndGrpGroupId(anyString(), anyString(), anyString()))
                .thenReturn(expected)
        ;

        assertEquals(expected.toString(), this.eligProfileServicesImpl.findByGroupPrimaryKey(carCarrierId, accountId, groupId).toString());
    }

    @Test
    public void getAllGroupsWithoutEligProfilesTest() {
        List<Object> expected = new ArrayList();

        when(elgGroupGrpRepo.getAllGroupsWithoutEligProfiles())
                .thenReturn(expected)
        ;

        assertEquals(expected.toString(), this.eligProfileServicesImpl.getAllGroupsWithoutEligProfiles().toString());
    }

    @Test
    public void getOverrideDfltsByPrimaryKeyTest() {
        String carCarrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";

        ElgEodEligOverrideDflts expected = new ElgEodEligOverrideDflts();

        when(elgEodEligOverrideDfltsRepo.findByCarCarrierIdAndAccountIdAndGroupId(anyString(), anyString(), anyString()))
                .thenReturn(expected)
        ;

        assertEquals(expected.toString(), this.eligProfileServicesImpl.getOverrideDfltsByPrimaryKey(carCarrierId, accountId, groupId).toString());
    }

    @Test
    public void getEligQueueDefaultsByPrimaryKeyTest() {
        String carCarrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";
        String reportName = "reportNameTest";

        ElgEqdEligQueueDefaults expected = new ElgEqdEligQueueDefaults();
        expected.setCarCarrierId(carCarrierId);
        expected.setEqdAccountId(accountId);
        expected.setEqdGroupId(groupId);
        expected.setEqdReportName(reportName);

        when(elgEqdEligQueueDefaultsRepo.findByCarCarrierIdAndEqdAccountIdAndEqdGroupIdAndEqdReportName(anyString(), anyString(), anyString(), anyString()))
                .thenReturn(expected)
        ;

        assertEquals(expected.toString(), this.eligProfileServicesImpl.getEligQueueDefaultsByPrimaryKey(carCarrierId, accountId, groupId, reportName).toString());
    }

    @Test
    public void getEligQueueDefaultsForProfileTest() {
        String carCarrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";
        String reportName = "reportNameTest";

        List<ElgEqdEligQueueDefaultsProjection> expected = new ArrayList<>();

        when(elgEqdEligQueueDefaultsRepo.getAllEligQueuesForProfile(anyString(), anyString(), anyString()))
                .thenReturn(expected)
        ;

        assertEquals(expected.toString(), this.eligProfileServicesImpl.getEligQueueDefaultsForProfile(carCarrierId, accountId, groupId).toString());
    }

}