package com.optum.rxclaimnextgen.elg.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.optum.rxclaimnextgen.elg.entities.ElgEligProfileEpf;
import com.optum.rxclaimnextgen.elg.entities.ElgEqdEligQueueDefaults;
import com.optum.rxclaimnextgen.elg.entities.ElgProfileViewEntity;
import com.optum.rxclaimnextgen.elg.exceptions.ValidationException;
import com.optum.rxclaimnextgen.elg.pojo.EligGroupListNames;
import com.optum.rxclaimnextgen.elg.pojo.EligGroupListNamesNoProfiles;
import com.optum.rxclaimnextgen.elg.pojo.EligProfileDetailForm;
import com.optum.rxclaimnextgen.elg.pojo.EligProfileView;
import com.optum.rxclaimnextgen.elg.projections.*;
import com.optum.rxclaimnextgen.elg.repositories.ElgProfileViewRepository;
import com.optum.rxclaimnextgen.elg.services.EligProfileServices;
import net.minidev.json.JSONArray;
import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by bkocinsk on 6/19/2018.
 */

public class EligibilityProfileControllerTest extends AbstractControllerTest {


    @MockBean
    private EligProfileServices mockEligProfileService;

    @MockBean
    private ElgProfileViewRepository mockEligProfileRepo;

    @MockBean
    private ElgProfileViewEntity mockElgProfileViewEntity;

    private List<EligProfileView> mockEligProfileViewList = new ArrayList<EligProfileView>();
    private List<ElgProfileViewEntity> mockElgProfileViewEntityList = new ArrayList<ElgProfileViewEntity>();

    private static String ADD_UPDATE_EXCEPTION_TEXT = "An error occurred and your changes were not saved. If you continue to experience this error, please contact technical support.";


    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @After
    public void tearDown() throws Exception {
        mockMvc = null;
    }

    @Test
    public void findAllEligProfileDataTest() throws Exception {
        EligProfileView eligProfileView = new EligProfileView();
        eligProfileView.setPlatformId("PLT1");
        eligProfileView.setCarCarrierId("CARRIERID-1");
        eligProfileView.setAccountId("ACCT-1");
        eligProfileView.setGroupId("GRP-1");
        eligProfileView.setLastLoad("20180619");
        eligProfileView.setCount(10);
        eligProfileView.setIdentifier("ID-1");
        eligProfileView.setVersion("VERSION-1");
        eligProfileView.setReformat("PGM-1");
        eligProfileView.setLoad("LOAD-1");
        mockEligProfileViewList.add(eligProfileView);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String sDate = "2018-06-19";

        Date epfCurrentLoadDate = formatter.parse(sDate);

        mockElgProfileViewEntity = new ElgProfileViewEntity();
        mockElgProfileViewEntity.setPlatformId("PLT1");
        mockElgProfileViewEntity.setCarCarrierId("CARRIERID-1");
        mockElgProfileViewEntity.setAccountId(StringUtils.trim("ACCT-1"));
        mockElgProfileViewEntity.setGroupId(StringUtils.trim("GRP-1"));
        mockElgProfileViewEntity.setEpfCurrentLoadDate(epfCurrentLoadDate);
        mockElgProfileViewEntity.setEpfCurrentLoaded(10);
        mockElgProfileViewEntity.setEpfLoadIdentifier("ID-1");
        mockElgProfileViewEntity.setEpfReformatVersion("VERSION-1");
        mockElgProfileViewEntity.setEpfReformatPgm("PGM-1");
        mockElgProfileViewEntity.setEpfLoadType("LOAD-1");
        mockElgProfileViewEntityList.add(mockElgProfileViewEntity);

        when(mockEligProfileRepo.findElgProfileData()).thenReturn(mockElgProfileViewEntityList);
        when(mockEligProfileService.findAllEligProfileData()).thenReturn(mockEligProfileViewList);
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get("/getAllEligProfileData").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        String expected = "[{\"platformId\":\"PLT1\",\"carCarrierId\":\"CARRIERID-1\",\"accountId\":\"ACCT-1\",\"groupId\":\"GRP-1\",\"lastLoad\":\"20180619\",\"count\":10,\"identifier\":\"ID-1\",\"version\":\"VERSION-1\",\"reformat\":\"PGM-1\",\"load\":\"LOAD-1\"}]";

        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
    }

    @Test(expected = Exception.class)
    public void findAllEligProfileDataExceptionTest() throws Exception {

        when(mockEligProfileRepo.findElgProfileData()).thenThrow(new RuntimeException("I got an exception"));
        when(mockEligProfileService.findAllEligProfileData()).thenThrow(new RuntimeException("I got an exception"));
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get("/getAllEligProfileData").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();

        String expected = "I got an exception";
        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
    }

    @Test
    public void getProfileByPrimaryKeyTestGood() throws Exception {
        String testCarrierId = "CARRIERID-1";
        String testAccountId = "PLT1";
        String testGroupId = "GRP-1";

        String requestURL =
                "/getProfileByPrimaryKey?"
                        + "carrierId=" + testCarrierId
                        + "&accountId=" + testAccountId
                        + "&groupId=" + testGroupId;

        ElgEligProfileEpf elgEligProfileEpf = new ElgEligProfileEpf();
        elgEligProfileEpf.setCarCarrierId(testCarrierId);
        elgEligProfileEpf.setAccountId(testAccountId);
        elgEligProfileEpf.setGroupId(testGroupId);

        when(mockEligProfileService.getProfileByPrimaryKey(testCarrierId, testAccountId, testGroupId))
                .thenReturn(elgEligProfileEpf);
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
        String expected = "{\"carCarrierId\":\"CARRIERID-1\",\"accountId\":\"PLT1\",\"groupId\":\"GRP-1\",\"epfLoadIdentifier\":null,\"epfLibraryName\":null,\"epfStageGroupsInd\":null,\"epfLoadType\":null,\"epfGroupLoadType\":null,\"epfReformatPgm\":null,\"epfPostProcessProgram\":null,\"epfRejection\":null,\"epfGroupRefreshRej\":null,\"epfMediaFrequency\":null,\"epfMediaType\":null,\"epfTapeCharacterCode\":null,\"epfDeviceName\":null,\"epfMbrFileName\":null,\"epfMbrMediaRecordLen\":null,\"epfMbrMediaBlockLen\":null,\"epfMbrMediaNbrReels\":null,\"epfMbrMediaLabels\":null,\"epfMbrTapeSeqNbr\":null,\"epfGrpFileName\":null,\"epfGrpMediaRecordLen\":null,\"epfGrpMediaBlockLen\":null,\"epfGrpMediaNbrReels\":null,\"epfGrpMediaLabels\":null,\"epfGroupTapeSeqNbr\":null,\"epfCurrentStageDt\":null,\"epfCurrentInput\":null,\"epfCurrentStaged\":null,\"epfCurrentLoaded\":null,\"epfCurrentRejected\":null,\"epfCurrentLoadDate\":null,\"epfPreviousStageDt\":null,\"epfPreviousInput\":null,\"epfPreviousStaged\":null,\"epfPreviousLoaded\":null,\"epfPreviousRejected\":null,\"epfPreviousLoadDt\":null,\"epfPriorStageDate\":null,\"epfPriorInput\":null,\"epfPriorStaged\":null,\"epfPriorLoaded\":null,\"epfPriorRejected\":null,\"epfPriorLoadDate\":null,\"epfReformatVersion\":null,\"epfTermNbrOfDays\":null,\"epfTermDaysQualifier\":null,\"epfStageLoadInProcess\":null,\"epfSuspendProcessing\":null,\"epfErrorsInLastRun\":null,\"epfPrintMbrGrpErrors\":null,\"epfIdCard\":null,\"epfTermedMembersRpt\":null,\"epfTermCareAssignment\":null,\"epfGroupListName\":null,\"epfTermThresholdTba\":null,\"epfTermThresholdExp\":null,\"epfRejectionLookup\":null,\"epfStatus\":null,\"addUserName\":null,\"addDate\":null,\"addTime\":null,\"addProgramName\":null,\"chgUserName\":null,\"chgDate\":null,\"chgTime\":null,\"chgProgramName\":null}";
        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
    }

    @Test
    public void getProfileByPrimaryKeyTestBadNoParams() throws Exception {
        when(mockEligProfileService.getProfileByPrimaryKey(null, null, null))
                .thenReturn(null);
        mockMvc
                .perform(MockMvcRequestBuilders.get("/getProfileByPrimaryKey").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn();
    }

    @Test
    public void getProfileByPrimaryKeyTestBadAllParamsEmpty() throws Exception {
        String testCarrierId = "";
        String testAccountId = "";
        String testGroupId = "";

        String requestURL =
                "/getProfileByPrimaryKey?"
                        + "carrierId=" + testCarrierId
                        + "&accountId=" + testAccountId
                        + "&groupId=" + testGroupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn();
    }

    @Test
    public void getProfileByPrimaryKeyTestBadEmptyCarrierId() throws Exception {
        String testCarrierId = "";
        String testAccountId = "PLT1";
        String testGroupId = "GRP-1";

        String requestURL =
                "/getProfileByPrimaryKey?"
                        + "carrierId=" + testCarrierId
                        + "&accountId=" + testAccountId
                        + "&groupId=" + testGroupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn();
    }

    @Test
    public void getProfileByPrimaryKeyTestBadEmptyAccountId() throws Exception {
        String testCarrierId = "CARRIERID-1";
        String testAccountId = "";
        String testGroupId = "GRP-1";

        String requestURL =
                "/getProfileByPrimaryKey?"
                        + "carrierId=" + testCarrierId
                        + "&accountId=" + testAccountId
                        + "&groupId=" + testGroupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn();
    }

    @Test
    public void getProfileByPrimaryKeyTestBadEmptyGroupId() throws Exception {
        String testCarrierId = "CARRIERID-1";
        String testAccountId = "PLT1";
        String testGroupId = "";

        String requestURL =
                "/getProfileByPrimaryKey?"
                        + "carrierId=" + testCarrierId
                        + "&accountId=" + testAccountId
                        + "&groupId=" + testGroupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn();
    }

    @Test
    public void getProfileByPrimaryKeyNullTest() throws Exception {
        String testCarrierId = "CARRIERID-1";
        String testAccountId = "PLT1";
        String testGroupId = "ABC";

        String requestURL =
                "/getProfileByPrimaryKey?"
                        + "carrierId=" + testCarrierId
                        + "&accountId=" + testAccountId
                        + "&groupId=" + testGroupId;

        ElgEligProfileEpf epf = null;
        when(mockEligProfileService.getProfileByPrimaryKey(testCarrierId, testAccountId, testGroupId))
                .thenReturn(epf);
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();
        String expected = "Could not find a matching profile.";
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test(expected = Exception.class)
    public void getProfileByPrimaryKeyExceptionTest() throws Exception {
        String testCarrierId = "CARRIERID-1";
        String testAccountId = "PLT1";
        String testGroupId = "ABC";

        String requestURL =
                "/getProfileByPrimaryKey?"
                        + "carrierId=" + testCarrierId
                        + "&accountId=" + testAccountId
                        + "&groupId=" + testGroupId;

        when(mockEligProfileService.getProfileByPrimaryKey(testCarrierId, testAccountId, testGroupId))
                .thenThrow(new RuntimeException("I got an exception"));
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();
        String expected = "I got an exception";
        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
    }

    @Test
    public void getAllPlatformsTestGood() throws Exception {
        List<String> samplePlatforms = Arrays.asList("ABC-123", "123-ZYX", "ZZZ-987");
        when(mockEligProfileService.getAllPlatforms())
                .thenReturn(samplePlatforms);
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get("/listAllPlatforms").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is2xxSuccessful()).andReturn();
        JSONAssert.assertEquals(JSONArray.toJSONString(samplePlatforms), mvcResult.getResponse().getContentAsString(), false);
    }

    @Test(expected = Exception.class)
    public void getAllPlatformsExceptionTest() throws Exception {
        List<String> samplePlatforms = Arrays.asList("ABC-123", "123-ZYX", "ZZZ-987");
        when(mockEligProfileService.getAllPlatforms())
                .thenThrow(new RuntimeException("I got an exception"));
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get("/listAllPlatforms").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();
        String expected = "I got an exception";
        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
    }

    @Test
    public void addProfileGoodTest() throws Exception {
        EligProfileDetailForm formData = new EligProfileDetailForm();
        ObjectMapper mapper = new ObjectMapper();
        String formDataString = mapper.writeValueAsString(formData);
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.post("/addProfile", formDataString).content(formDataString).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is2xxSuccessful()).andReturn();
    }

    @Test
    public void addProfileValidationExceptionTest() throws Exception {
        EligProfileDetailForm formData = new EligProfileDetailForm();
        ObjectMapper mapper = new ObjectMapper();
        String formDataString = mapper.writeValueAsString(formData);
        doThrow(new ValidationException("Validation errors occurred"))
                .when(mockEligProfileService)
                .saveProfileDetail(formDataString, "add");
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.post("/addProfile", formDataString)
                        .content(formDataString).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isUnprocessableEntity()).andReturn();
        int expected = 422;
        assertEquals(expected, result.getResponse().getStatus());
    }

    @Test
    public void addProfileExceptionTest() throws Exception {
        EligProfileDetailForm formData = new EligProfileDetailForm();
        ObjectMapper mapper = new ObjectMapper();
        String formDataString = mapper.writeValueAsString(formData);
        doThrow(new RuntimeException("I got an exception"))
                .when(mockEligProfileService)
                .saveProfileDetail(formDataString, "add");
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.post("/addProfile", formDataString)
                        .content(formDataString).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();

        int expected = 400;
        assertEquals(expected, result.getResponse().getStatus());
    }


    @Test
    public void copyProfileGoodTest() throws Exception {
        EligProfileDetailForm formData = new EligProfileDetailForm();
        ObjectMapper mapper = new ObjectMapper();
        String formDataString = mapper.writeValueAsString(formData);
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.post("/copyProfile", formDataString).content(formDataString).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is2xxSuccessful()).andReturn();
    }

    @Test
    public void copyProfileValidationExceptionTest() throws Exception {
        EligProfileDetailForm formData = new EligProfileDetailForm();
        ObjectMapper mapper = new ObjectMapper();
        String formDataString = mapper.writeValueAsString(formData);
        doThrow(new ValidationException("Validation errors occurred"))
                .when(mockEligProfileService)
                .copyProfile(formDataString);
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.post("/copyProfile", formDataString)
                        .content(formDataString).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isUnprocessableEntity()).andReturn();
        int expected = 422;
        assertEquals(expected, result.getResponse().getStatus());
    }

    @Test
    public void copyProfileExceptionTest() throws Exception {
        EligProfileDetailForm formData = new EligProfileDetailForm();
        ObjectMapper mapper = new ObjectMapper();
        String formDataString = mapper.writeValueAsString(formData);
        doThrow(new RuntimeException("I got an exception"))
                .when(mockEligProfileService)
                .copyProfile(formDataString);
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.post("/copyProfile", formDataString)
                        .content(formDataString).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();

        int expected = 400;
        assertEquals(expected, result.getResponse().getStatus());
    }

    @Test
    public void saveProfileTestGood() throws Exception {
        EligProfileDetailForm formData = new EligProfileDetailForm();
        ObjectMapper mapper = new ObjectMapper();
        String formDataString = mapper.writeValueAsString(formData);
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.post("/saveProfile", formDataString).content(formDataString).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is2xxSuccessful()).andReturn();
    }

    @Test
    public void saveProfileValidationExceptionTest() throws Exception {
        EligProfileDetailForm formData = new EligProfileDetailForm();
        ObjectMapper mapper = new ObjectMapper();
        String formDataString = mapper.writeValueAsString(formData);
        doThrow(new ValidationException("Validation errors occurred"))
                .when(mockEligProfileService)
                .saveProfileDetail(formDataString, "update");
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.post("/saveProfile", formDataString)
                        .content(formDataString).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isUnprocessableEntity()).andReturn();
        int expected = 422;
        assertEquals(expected, result.getResponse().getStatus());
    }

    @Test
    public void saveProfileExceptionTest() throws Exception {
        EligProfileDetailForm formData = new EligProfileDetailForm();
        ObjectMapper mapper = new ObjectMapper();
        String formDataString = mapper.writeValueAsString(formData);
        doThrow(new RuntimeException("I got an exception"))
                .when(mockEligProfileService)
                .saveProfileDetail(formDataString, "update");
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.post("/saveProfile", formDataString)
                        .content(formDataString).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();

        int expected = 400;
        assertEquals(expected, result.getResponse().getStatus());
    }


    @Test
    public void getAllCarrierListsTestGood() throws Exception {
        List<String> sampleCarriers = Arrays.asList("ABC-123", "123-ZYX", "ZZZ-987");
        when(mockEligProfileService.getAllCarrierLists())
                .thenReturn(sampleCarriers);
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get("/listAllCarrierLists").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is2xxSuccessful()).andReturn();
        JSONAssert.assertEquals(JSONArray.toJSONString(sampleCarriers), mvcResult.getResponse().getContentAsString(), false);
    }

    @Test(expected = Exception.class)
    public void getAllCarrierListsExceptionTest() throws Exception {
        List<String> sampleCarriers = Arrays.asList("ABC-123", "123-ZYX", "ZZZ-987");
        when(mockEligProfileService.getAllCarrierLists())
                .thenThrow(new RuntimeException("I got an exception"));
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get("/listAllCarrierLists").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();
        String expected = "I got an exception";
        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
    }

    @Test
    public void getAllCarrierIdsbyCarrierListGood() throws Exception {
        String testCarrierList = "FOO-BAR";
        List<String> sampleCarriers = Arrays.asList("ABC-123", "123-ZYX", "ZZZ-987");
        String requestURL =
                "/getAllCarrierIdsbyCarrierList?"
                        + "carrierList=" + testCarrierList;
        when(mockEligProfileService.getAllCarrierIdsbyCarrierList(testCarrierList))
                .thenReturn(sampleCarriers);
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is2xxSuccessful()).andReturn();
        LOG.debug(mvcResult.getResponse().getContentAsString());
        LOG.debug(sampleCarriers.toString());
        JSONAssert.assertEquals(JSONArray.toJSONString(sampleCarriers), mvcResult.getResponse().getContentAsString(), false);
    }

    @Test
    public void getAllCarrierIdsbyCarrierListGoodMissingCarrierList() throws Exception {
        String testCarrierList = "";
        String requestURL =
                "/getAllCarrierIdsbyCarrierList?"
                        + "carrierList=" + testCarrierList;
        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test(expected = Exception.class)
    public void getAllCarrierIdsbyCarrierListExceptionTest() throws Exception {
        String testCarrierList = "FOO-BAR";
        List<String> sampleCarriers = Arrays.asList("ABC-123", "123-ZYX", "ZZZ-987");
        String requestURL =
                "/getAllCarrierIdsbyCarrierList?"
                        + "carrierList=" + testCarrierList;
        when(mockEligProfileService.getAllCarrierIdsbyCarrierList(testCarrierList))
                .thenThrow(new RuntimeException("I got an exception"));
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();
        String expected = "I got an exception";
        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
    }

    @Test
    public void getAllCarrierIdsAndDescriptionsTest() throws Exception {
        String requestURL =
                "/getCrlCarrierListProjection";
        List<ElgCrlCarrierListProjection> expected = new ArrayList<>();
        when(mockEligProfileService.getAllCarrierIdsAndDescriptions())
                .thenReturn(expected);
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        JSONAssert.assertEquals(JSONArray.toJSONString(expected), result.getResponse().getContentAsString(), false);
    }

    @Test(expected = Exception.class)
    public void getAllCarrierIdsAndDescriptionsExceptionTest() throws Exception {
        String requestURL =
                "/getCrlCarrierListProjection";
        when(mockEligProfileService.getAllCarrierIdsAndDescriptions())
                .thenThrow(new RuntimeException("I got an exception"));
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();
        String expected = "I got an exception";
        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
    }

    @Test
    public void getAllGroupNamesAndDescriptionsTest() throws Exception {
        String requestURL =
                "/getGrlGroupListProjection";
        List<ElgGrlGroupListProjection> expected = new ArrayList<>();
        when(mockEligProfileService.getAllGroupNamesAndDescriptions())
                .thenReturn(expected);
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
        JSONAssert.assertEquals(JSONArray.toJSONString(expected), result.getResponse().getContentAsString(), false);
    }

    @Test(expected = Exception.class)
    public void getAllGroupNamesAndDescriptionsExceptionTest() throws Exception {
        String requestURL =
                "/getGrlGroupListProjection";
        when(mockEligProfileService.getAllGroupNamesAndDescriptions())
                .thenThrow(new RuntimeException("I got an exception"));
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();
        String expected = "I got an exception";
        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
    }


    @Test
    public void getAllGroupsForGroupNameListTest() throws Exception {
        String groupNameList = "foobar";
        String requestURL =
                "/getAllGroupsForGroupNameList"
                + "?gln=" + groupNameList;
        List<EligGroupListNames> expected = new ArrayList<>();
        when(mockEligProfileService.getAllGroupsForGroupNameList(groupNameList))
                .thenReturn(expected);
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
        JSONAssert.assertEquals(JSONArray.toJSONString(expected), result.getResponse().getContentAsString(), false);
    }


    @Test
    public void getAllGroupsForGroupNameListMissingGroupNameList() throws Exception {
        String groupNameList = "";
        String requestURL =
                "/getAllGroupsForGroupNameList"
                        + "?gln=" + groupNameList;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError())
        ;
    }

    @Test(expected = Exception.class)
    public void getAllGroupsForGroupNameListExceptionTest() throws Exception {
        String requestURL =
                "/getAllGroupsForGroupNameList?gln=TEST";
        when(mockEligProfileService.getAllGroupsForGroupNameList("TEST"))
                .thenThrow(new RuntimeException("I got an exception"));
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();
        String expected = "I got an exception";
        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
    }

    @Test
    public void getAllGroupsWithoutEligProfiles() throws Exception {
        String requestURL =
                "/getAllGroupsWithoutEligProfiles";
        List<EligGroupListNamesNoProfiles> expected = new ArrayList<>();
        when(mockEligProfileService.getAllGroupsWithoutEligProfiles())
                .thenReturn(expected);
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
        JSONAssert.assertEquals(JSONArray.toJSONString(expected), result.getResponse().getContentAsString(), false);
    }

    @Test(expected = Exception.class)
    public void getAllGroupsWithoutEligProfilesExceptionTest() throws Exception {
        String requestURL =
                "/getAllGroupsWithoutEligProfiles";
        when(mockEligProfileService.getAllGroupsWithoutEligProfiles())
                .thenThrow(new RuntimeException("I got an exception"));
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();
        String expected = "I got an exception";
        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
    }

    @Test
    public void getEligibilityQueueForProfile() throws Exception {
        String testCarrierId = "foo";
        String testAccountId = "bar";
        String testGroupId = "foobar";
        String requestURL =
                "/eligibilityQueueForProfile?"
                        + "carrierId=" + testCarrierId
                        + "&accountId=" + testAccountId
                        + "&groupId=" + testGroupId;
        List<ElgEqdEligQueueDefaultsProjection> expected = new ArrayList<>();
        when(mockEligProfileService.getEligQueueDefaultsForProfile(anyString(), anyString(), anyString()))
            .thenReturn(expected);
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
        JSONAssert.assertEquals(JSONArray.toJSONString(expected), result.getResponse().getContentAsString(), false);
    }

    @Test
    public void getEligibilityQueueForProfileMissingCarrierId() throws Exception {
        String testCarrierId = "";
        String testAccountId = "bar";
        String testGroupId = "foobar";
        String requestURL =
                "/eligibilityQueueForProfile?"
                        + "carrierId=" + testCarrierId
                        + "&accountId=" + testAccountId
                        + "&groupId=" + testGroupId;
        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void getEligibilityQueueForProfileMissingAccountId() throws Exception {
        String testCarrierId = "foo";
        String testAccountId = "";
        String testGroupId = "foobar";
        String requestURL =
                "/eligibilityQueueForProfile?"
                        + "carrierId=" + testCarrierId
                        + "&accountId=" + testAccountId
                        + "&groupId=" + testGroupId;
        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void getEligibilityQueueForProfileMissingGroupId() throws Exception {
        String testCarrierId = "foo";
        String testAccountId = "bar";
        String testGroupId = "";
        String requestURL =
                "/eligibilityQueueForProfile?"
                        + "carrierId=" + testCarrierId
                        + "&accountId=" + testAccountId
                        + "&groupId=" + testGroupId;
        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void getEligibilityQueueForProfileMissingAllParams() throws Exception {
        String testCarrierId = "";
        String testAccountId = "";
        String testGroupId = "";
        String requestURL =
                "/eligibilityQueueForProfile?"
                        + "carrierId=" + testCarrierId
                        + "&accountId=" + testAccountId
                        + "&groupId=" + testGroupId;
        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError());
    }

    @Test(expected = Exception.class)
    public void getEligibilityQueueForProfileExceptionTest() throws Exception {
        String testCarrierId = "foo";
        String testAccountId = "bar";
        String testGroupId = "foobar";
        String requestURL =
                "/eligibilityQueueForProfile?"
                        + "carrierId=" + testCarrierId
                        + "&accountId=" + testAccountId
                        + "&groupId=" + testGroupId;
        when(mockEligProfileService.getEligQueueDefaultsForProfile(anyString(), anyString(), anyString()))
                .thenThrow(new RuntimeException("I got an exception"));
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();
        String expected = "I got an exception";
        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
    }




}
