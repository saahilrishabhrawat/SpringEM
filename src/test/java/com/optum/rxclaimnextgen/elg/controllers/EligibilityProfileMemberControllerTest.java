package com.optum.rxclaimnextgen.elg.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.optum.rxclaimnextgen.elg.entities.ElgEligHealthDefaultsEhd;
import com.optum.rxclaimnextgen.elg.exceptions.ValidationException;
import com.optum.rxclaimnextgen.elg.pojo.*;
import com.optum.rxclaimnextgen.elg.pojo.profile.member.EligMemberHealthDefaultDetailForm;
import com.optum.rxclaimnextgen.elg.services.EligProfileMemberServices;
import com.optum.rxclaimnextgen.elg.services.profile.member.HealthDefaultDetailService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class EligibilityProfileMemberControllerTest extends AbstractControllerTest {

    @MockBean
    EligProfileMemberServices mockEligProfileMemberService;

    @MockBean
    HealthDefaultDetailService mockHealthDefaultDetailService;

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
    public void saveHimDefaultOverrideDetailsTest() throws Exception {
        String requestURL = "/saveHimDefaultOverrideDetails";

        EligMemberHimDefaultOvrDetailForm eligMemberHimDefaultOvrDetailForm = new EligMemberHimDefaultOvrDetailForm();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(eligMemberHimDefaultOvrDetailForm);

        mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL).content(jsonData).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn()
        ;
    }

    @Test
    public void saveHimDefaultOverrideDetailsEmptyTest() throws Exception {
        String requestURL = "/saveHimDefaultOverrideDetails";
        LOG.debug(">>> in here");
        String jsonData = "";

        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL, jsonData).content(jsonData).contentType(MediaType.APPLICATION_JSON))
                //.perform(MockMvcRequestBuilders.post(requestURL).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();
        String expected = "Request body was not sent";
        LOG.debug("XXX=" + result.getResponse().getContentAsString());
        //JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
    }

    @Test
    public void saveHimDefaultOverrideDetailsExceptionTest() throws Exception {
        String requestURL = "/saveHimDefaultOverrideDetails";
        EligMemberHimDefaultOvrDetailForm eligMemberHimDefaultOvrDetailForm = new EligMemberHimDefaultOvrDetailForm();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(eligMemberHimDefaultOvrDetailForm);

        doThrow(new RuntimeException("I got an exception"))
                .when(mockEligProfileMemberService)
                .saveHimDefaultOverrideDetails(jsonData);
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL, jsonData)
                        .content(jsonData).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();

        String expected = "{\"Message\" : \"ERROR " + ADD_UPDATE_EXCEPTION_TEXT + "\"}";
        LOG.debug(">>> result=" + result.getResponse().getContentAsString());
        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
    }

    @Test
    public void populateHimDefaultsOvrDetails() throws Exception {
        String carrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";

        EligMemberHimDefaultOvrDetailForm expected = new EligMemberHimDefaultOvrDetailForm();
        expected.setAccountId(accountId);
        expected.setCarCarrierId(carrierId);
        expected.setGroupId(groupId);

        when(mockEligProfileMemberService.populateHimDefaultsOvrDetailsByPrimaryKey(anyString(), anyString(), anyString()))
                .thenReturn(expected)
        ;

        String requestURL =
                "/populateHimDefaultsOvrDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        ObjectMapper objectMapper = new ObjectMapper();
        String expectedJSON = objectMapper.writeValueAsString(expected);

        JSONAssert.assertEquals(expectedJSON, result.getResponse().getContentAsString(), false);
    }

    @Test
    public void populateHimDefaultsOvrDetailsMissingArguments() throws Exception {
        String carrierId = "";
        String accountId = "";
        String groupId = "";
        String requestURL =
                "/populateHimDefaultsOvrDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void populateHimDefaultsOvrDetailsMissingCarrierId() throws Exception {
        String carrierId = "";
        String accountId = "foo";
        String groupId = "bar";
        String requestURL =
                "/populateHimDefaultsOvrDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void populateHimDefaultsOvrDetailsMissingAccountId() throws Exception {
        String carrierId = "bar";
        String accountId = "";
        String groupId = "foo";
        String requestURL =
                "/populateHimDefaultsOvrDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void populateHimDefaultsOvrDetailsMissingGroupId() throws Exception {
        String carrierId = "bar";
        String accountId = "foo";
        String groupId = "";
        String requestURL =
                "/populateHimDefaultsOvrDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void populateHimDefaultsOvrDetailsExceptionTest() throws Exception {

        String requestURL =
                "/populateHimDefaultsOvrDetails?"
                        + "carrierId=ABC"
                        + "&accountId=DEF"
                        + "&groupId=GHI";
        when(mockEligProfileMemberService.populateHimDefaultsOvrDetailsByPrimaryKey(anyString(), anyString(), anyString()))
                .thenThrow(new RuntimeException("I got an exception"));
        ;
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();
        String expected = "I got an exception";
        assertEquals(expected, result.getResponse().getContentAsString());
    }


    @Test
    public void populateCareAssignDetails() throws Exception {
        String carrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";
        String platformId = "P1";

        EligMemberCareAssignDetailForm expected = new EligMemberCareAssignDetailForm();
        expected.setAccountId(accountId);
        expected.setCarCarrierId(carrierId);
        expected.setGroupId(groupId);
        expected.setPlatformId(platformId);

        when(mockEligProfileMemberService.populateCareAssignDetailsByPrimaryKey(anyString(), anyString(), anyString(), anyString()))
                .thenReturn(expected)
        ;

        String requestURL =
                "/populateCareAssignDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId
                        + "&platformId=" + platformId;

        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
        LOG.debug(">>>>" + result.getResponse().getContentAsString());
        ObjectMapper objectMapper = new ObjectMapper();
        String expectedJSON = objectMapper.writeValueAsString(expected);

        JSONAssert.assertEquals(expectedJSON, result.getResponse().getContentAsString(), false);
    }


    @Test
    public void populateCareAssignDetailsMissingArguments() throws Exception {
        String carrierId = "";
        String accountId = "";
        String groupId = "";
        String platformId = "";
        String requestURL =
                "/populateCareAssignDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId
                        + "&platformId=" + platformId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void populateCareAssignDetailsMissingCarrierId() throws Exception {
        String carrierId = "";
        String accountId = "foo";
        String groupId = "bar";
        String platformId = "P1";
        String requestURL =
                "/populateCareAssignDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId
                        + "&platformId=" + platformId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void populateCareAssignDetailsMissingAccountId() throws Exception {
        String carrierId = "bar";
        String accountId = "";
        String groupId = "foo";
        String platformId = "P1";
        String requestURL =
                "/populateCareAssignDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId
                        + "&platformId=" + platformId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void populateCareAssignDetailsMissingGroupId() throws Exception {
        String carrierId = "bar";
        String accountId = "foo";
        String groupId = "";
        String platformId = "P1";
        String requestURL =
                "/populateCareAssignDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId
                        + "&platformId=" + platformId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void populateCareAssignDetailsMissingPlatformId() throws Exception {
        String carrierId = "bar";
        String accountId = "foo";
        String groupId = "g1";
        String platformId = "";
        String requestURL =
                "/populateCareAssignDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId
                        + "&platformId=" + platformId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void populateCareAssignDetailsExceptionTest() throws Exception {

        String carrierId = "bar";
        String accountId = "foo";
        String groupId = "g1";
        String platformId = "P1";
        String requestURL =
                "/populateCareAssignDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId
                        + "&platformId=" + platformId;
        when(mockEligProfileMemberService.populateCareAssignDetailsByPrimaryKey(anyString(), anyString(), anyString(), anyString()))
                .thenThrow(new RuntimeException("I got an exception"));
        ;
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();
        String expected = "I got an exception";
        LOG.debug(">>> " + result.getResponse().getContentAsString());
        assertEquals(expected, result.getResponse().getContentAsString());
    }


    @Test
    public void saveCareAssignDetails() throws Exception {
        String requestURL = "/saveCareAssignDetails?platformId=P1";

        EligMemberCareAssignDetailForm expected = new EligMemberCareAssignDetailForm();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(expected);

        mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL).content(jsonData).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn()
        ;
    }


    @Test
    public void saveCareAssignDetailsNoData() throws Exception {
        String requestURL = "/saveCareAssignDetails?platformId=P1";

        mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void saveCareAssignDetailsValidationExceptionTest() throws Exception {
        String requestURL = "/saveCareAssignDetails?platformId=P1";
        EligMemberCareAssignDetailForm form = new EligMemberCareAssignDetailForm();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(form);

        doThrow(new ValidationException("I got a validation exception"))
                .when(mockEligProfileMemberService)
                .saveCareAssignDetails(jsonData, "P1");
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL, jsonData)
                        .content(jsonData).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isUnprocessableEntity()).andReturn();

        int expected = 422;
        LOG.debug(">>> result=" + result.getResponse().getContentAsString());
        assertEquals(expected, result.getResponse().getStatus());
    }

    @Test
    public void saveCareAssignDetailsExceptionTest() throws Exception {
        String requestURL = "/saveCareAssignDetails?platformId=P1";
        EligMemberCareAssignDetailForm form = new EligMemberCareAssignDetailForm();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(form);

        doThrow(new RuntimeException("I got an exception"))
                .when(mockEligProfileMemberService)
                .saveCareAssignDetails(jsonData, "P1");
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL, jsonData)
                        .content(jsonData).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();

        int expected = 400;
        LOG.debug(">>> result=" + result.getResponse().getContentAsString());
        assertEquals(expected, result.getResponse().getStatus());
    }

    @Test
    public void populateOverrideDetailsGoodTest() throws Exception {
        String carrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";

        EligMemberOverrideDetailForm expected = new EligMemberOverrideDetailForm();
        expected.setAccountId(accountId);
        expected.setCarCarrierId(carrierId);
        expected.setGroupId(groupId);

        when(mockEligProfileMemberService.populateOverrideDetailsByPrimaryKey(anyString(), anyString(), anyString()))
                .thenReturn(expected)
        ;

        String requestURL =
                "/populateOverrideDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
        LOG.debug(">>>>" + result.getResponse().getContentAsString());
        ObjectMapper objectMapper = new ObjectMapper();
        String expectedJSON = objectMapper.writeValueAsString(expected);

        JSONAssert.assertEquals(expectedJSON, result.getResponse().getContentAsString(), false);
    }

    @Test
    public void populateOverrideDetailsMissingArguments() throws Exception {
        String carrierId = "";
        String accountId = "";
        String groupId = "";

        String requestURL =
                "/populateOverrideDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void populateOverrideDetailsMissingCarrierId() throws Exception {

        String carrierId = "";
        String accountId = "ABC";
        String groupId = "DEF";

        String requestURL =
                "/populateOverrideDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void populateOverrideDetailsMissingAccountId() throws Exception {
        String carrierId = "ABC";
        String accountId = "";
        String groupId = "DEF";

        String requestURL =
                "/populateOverrideDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void populateOverrideDetailsMissingGroupId() throws Exception {
        String carrierId = "ABC";
        String accountId = "DEF";
        String groupId = "";

        String requestURL =
                "/populateOverrideDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }


    @Test
    public void populateOverrideDetailsExceptionTest() throws Exception {

        String carrierId = "ABC";
        String accountId = "DEF";
        String groupId = "GHI";

        String requestURL =
                "/populateOverrideDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;
        when(mockEligProfileMemberService.populateOverrideDetailsByPrimaryKey(anyString(), anyString(), anyString()))
                .thenThrow(new RuntimeException("I got an exception"));
        ;
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();
        String expected = "I got an exception";
        LOG.debug(">>> " + result.getResponse().getContentAsString());
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    public void saveOverrideDetailsGoodTest() throws Exception {
        String requestURL = "/saveOverrideDetails";

        EligMemberOverrideDetailForm form = new EligMemberOverrideDetailForm();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(form);

        mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL).content(jsonData).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn()
        ;
    }

    @Test
    public void saveOverrideDetailsNoData() throws Exception {
        String requestURL = "/saveOverrideDetails";

        mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void saveOverrideDetailsValidationExceptionTest() throws Exception {
        String requestURL = "/saveOverrideDetails";
        EligMemberOverrideDetailForm form = new EligMemberOverrideDetailForm();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(form);

        doThrow(new ValidationException("I got a validation exception"))
                .when(mockEligProfileMemberService)
                .saveOverrideDetails(jsonData);
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL, jsonData)
                        .content(jsonData).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();

        String expected = "I got a validation exception";
        LOG.debug(">>> result=" + result.getResponse().getContentAsString());
        assertEquals(expected, result.getResponse().getContentAsString());
    }


    @Test
    public void saveOverrideDetailsExceptionTest() throws Exception {
        String requestURL = "/saveOverrideDetails";
        EligMemberOverrideDetailForm form = new EligMemberOverrideDetailForm();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(form);

        doThrow(new RuntimeException("I got an exception"))
                .when(mockEligProfileMemberService)
                .saveOverrideDetails(jsonData);
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL, jsonData)
                        .content(jsonData).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();

        String expected = ADD_UPDATE_EXCEPTION_TEXT;
        LOG.debug(">>> result=" + result.getResponse().getContentAsString());
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    public void populateIncidentDefaultDetailGoodTest() throws Exception {
        String carrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";

        EligMemberIncidentDefaultDetailForm expected = new EligMemberIncidentDefaultDetailForm();
        expected.setAccountId(accountId);
        expected.setCarCarrierId(carrierId);
        expected.setGroupId(groupId);

        when(mockEligProfileMemberService.populateIncidentDefaultDetailByPrimaryKey(anyString(), anyString(), anyString()))
                .thenReturn(expected)
        ;

        String requestURL =
                "/populateIncidentDefaultDetail?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
        LOG.debug(">>>>" + result.getResponse().getContentAsString());
        ObjectMapper objectMapper = new ObjectMapper();
        String expectedJSON = objectMapper.writeValueAsString(expected);

        JSONAssert.assertEquals(expectedJSON, result.getResponse().getContentAsString(), false);
    }

    @Test
    public void populateIncidentDefaultDetailMissingArguments() throws Exception {
        String carrierId = "";
        String accountId = "";
        String groupId = "";

        String requestURL =
                "/populateIncidentDefaultDetail?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void populateIncidentDefaultDetailMissingCarrierId() throws Exception {

        String carrierId = "";
        String accountId = "ABC";
        String groupId = "DEF";

        String requestURL =
                "/populateIncidentDefaultDetail?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void populateIncidentDefaultDetailMissingAccountId() throws Exception {
        String carrierId = "ABC";
        String accountId = "";
        String groupId = "DEF";

        String requestURL =
                "/populateIncidentDefaultDetail?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void populateIncidentDefaultDetailMissingGroupId() throws Exception {
        String carrierId = "ABC";
        String accountId = "DEF";
        String groupId = "";

        String requestURL =
                "/populateIncidentDefaultDetail?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }


    @Test
    public void populateIncidentDefaultDetailExceptionTest() throws Exception {

        String carrierId = "ABC";
        String accountId = "DEF";
        String groupId = "GHI";

        String requestURL =
                "/populateIncidentDefaultDetail?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;
        when(mockEligProfileMemberService.populateIncidentDefaultDetailByPrimaryKey(anyString(), anyString(), anyString()))
                .thenThrow(new RuntimeException("I got an exception"));
        ;
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();
        String expected = "I got an exception";
        LOG.debug(">>> " + result.getResponse().getContentAsString());
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    public void saveIncidentDefaultDetailGoodTest() throws Exception {
        String requestURL = "/saveIncidentDefaultDetail";

        EligMemberIncidentDefaultDetailForm form = new EligMemberIncidentDefaultDetailForm();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(form);

        mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL).content(jsonData).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn()
        ;
    }

    @Test
    public void saveIncidentDefaultDetailNoData() throws Exception {
        String requestURL = "/saveIncidentDefaultDetail";

        mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void saveIncidentDefaultDetailValidationExceptionTest() throws Exception {
        String requestURL = "/saveIncidentDefaultDetail";
        EligMemberIncidentDefaultDetailForm form = new EligMemberIncidentDefaultDetailForm();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(form);

        doThrow(new ValidationException("I got a validation exception"))
                .when(mockEligProfileMemberService)
                .saveIncidentDefaultDetail(jsonData);
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL, jsonData)
                        .content(jsonData).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();

        String expected = "I got a validation exception";
        LOG.debug(">>> result=" + result.getResponse().getContentAsString());
        assertEquals(expected, result.getResponse().getContentAsString());
    }


    @Test
    public void saveIncidentDefaultDetailExceptionTest() throws Exception {
        String requestURL = "/saveIncidentDefaultDetail";
        EligMemberIncidentDefaultDetailForm form = new EligMemberIncidentDefaultDetailForm();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(form);

        doThrow(new RuntimeException("I got an exception"))
                .when(mockEligProfileMemberService)
                .saveIncidentDefaultDetail(jsonData);
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL, jsonData)
                        .content(jsonData).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();

        String expected = ADD_UPDATE_EXCEPTION_TEXT;
        LOG.debug(">>> result=" + result.getResponse().getContentAsString());
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    public void populateCoverageDefaultDetailsGoodTest() throws Exception {
        String carrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";

        EligCoverageDefaultDetail expected = new EligCoverageDefaultDetail();
        expected.setAccountId(accountId);
        expected.setCarCarrierId(carrierId);
        expected.setGroupId(groupId);

        when(mockEligProfileMemberService.fetchCoverageDefaultDetail(anyString(), anyString(), anyString()))
                .thenReturn(expected)
        ;

        String requestURL =
                "/populateCoverageDefaultDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
        LOG.debug(">>>>" + result.getResponse().getContentAsString());
        ObjectMapper objectMapper = new ObjectMapper();
        String expectedJSON = objectMapper.writeValueAsString(expected);

        JSONAssert.assertEquals(expectedJSON, result.getResponse().getContentAsString(), false);
    }

    @Test
    public void populateCoverageDefaultDetailsMissingArguments() throws Exception {
        String carrierId = "";
        String accountId = "";
        String groupId = "";

        String requestURL =
                "/populateCoverageDefaultDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void populateCoverageDefaultDetailsMissingCarrierId() throws Exception {

        String carrierId = "";
        String accountId = "ABC";
        String groupId = "DEF";

        String requestURL =
                "/populateCoverageDefaultDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void populateCoverageDefaultDetailsMissingAccountId() throws Exception {
        String carrierId = "ABC";
        String accountId = "";
        String groupId = "DEF";

        String requestURL =
                "/populateCoverageDefaultDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void populateCoverageDefaultDetailsMissingGroupId() throws Exception {
        String carrierId = "ABC";
        String accountId = "DEF";
        String groupId = "";

        String requestURL =
                "/populateCoverageDefaultDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }


    @Test
    public void populateCoverageDefaultDetailsExceptionTest() throws Exception {

        String carrierId = "ABC";
        String accountId = "DEF";
        String groupId = "GHI";

        String requestURL =
                "/populateCoverageDefaultDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;
        when(mockEligProfileMemberService.fetchCoverageDefaultDetail(anyString(), anyString(), anyString()))
                .thenThrow(new RuntimeException("I got an exception"));
        ;
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();
        String expected = "I got an exception";
        LOG.debug(">>> " + result.getResponse().getContentAsString());
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    public void saveCoverageDefaultDetailsGoodTest() throws Exception {
        String requestURL = "/saveCoverageDefaultDetails";

        EligCoverageDefaultDetail form = new EligCoverageDefaultDetail();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(form);

        mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL).content(jsonData).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn()
        ;
    }

    @Test
    public void saveCoverageDefaultDetailsNoData() throws Exception {
        String requestURL = "/saveCoverageDefaultDetails";

        mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void saveCoverageDefaultDetailsExceptionTest() throws Exception {
        String requestURL = "/saveCoverageDefaultDetails";
        EligCoverageDefaultDetail form = new EligCoverageDefaultDetail();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(form);

        doThrow(new RuntimeException("I got an exception"))
                .when(mockEligProfileMemberService)
                .saveCoverageDefaultDetail(jsonData);
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL, jsonData)
                        .content(jsonData).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();

        String expected = "{\"Message\" : \"ERROR " + ADD_UPDATE_EXCEPTION_TEXT + "\"}";
        LOG.debug(">>> result=" + result.getResponse().getContentAsString());
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    public void fetchAltInsuranceDefaultDetailsGoodTest() throws Exception {
        String carrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";

        EligAltInsuranceDefaultDetail expected = new EligAltInsuranceDefaultDetail();
        expected.setAccountId(accountId);
        expected.setCarCarrierId(carrierId);
        expected.setGroupId(groupId);

        when(mockEligProfileMemberService.fetchAltInsuranceDefaultDetail(anyString(), anyString(), anyString()))
                .thenReturn(expected)
        ;

        String requestURL =
                "/fetchAltInsuranceDefaultDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
        LOG.debug(">>>>" + result.getResponse().getContentAsString());
        ObjectMapper objectMapper = new ObjectMapper();
        String expectedJSON = objectMapper.writeValueAsString(expected);

        JSONAssert.assertEquals(expectedJSON, result.getResponse().getContentAsString(), false);
    }

    @Test
    public void fetchAltInsuranceDefaultDetailsMissingArguments() throws Exception {
        String carrierId = "";
        String accountId = "";
        String groupId = "";

        String requestURL =
                "/fetchAltInsuranceDefaultDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void fetchAltInsuranceDefaultDetailsMissingCarrierId() throws Exception {

        String carrierId = "";
        String accountId = "ABC";
        String groupId = "DEF";

        String requestURL =
                "/fetchAltInsuranceDefaultDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void fetchAltInsuranceDefaultDetailsMissingAccountId() throws Exception {
        String carrierId = "ABC";
        String accountId = "";
        String groupId = "DEF";

        String requestURL =
                "/fetchAltInsuranceDefaultDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void fetchAltInsuranceDefaultDetailsMissingGroupId() throws Exception {
        String carrierId = "ABC";
        String accountId = "DEF";
        String groupId = "";

        String requestURL =
                "/fetchAltInsuranceDefaultDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }


    @Test
    public void fetchAltInsuranceDefaultDetailsExceptionTest() throws Exception {

        String carrierId = "ABC";
        String accountId = "DEF";
        String groupId = "GHI";

        String requestURL =
                "/fetchAltInsuranceDefaultDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;
        when(mockEligProfileMemberService.fetchAltInsuranceDefaultDetail(anyString(), anyString(), anyString()))
                .thenThrow(new RuntimeException("I got an exception"));
        ;
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();
        String expected = "I got an exception";
        LOG.debug(">>> " + result.getResponse().getContentAsString());
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    public void saveAltInsuranceDefaultDetailGoodTest() throws Exception {
        String requestURL = "/saveAltInsuranceDefaultDetail";

        EligAltInsuranceDefaultDetail form = new EligAltInsuranceDefaultDetail();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(form);

        mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL).content(jsonData).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn()
        ;
    }

    @Test
    public void saveAltInsuranceDefaultDetailNoData() throws Exception {
        String requestURL = "/saveAltInsuranceDefaultDetail";

        mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void saveAltInsuranceDefaultDetailExceptionTest() throws Exception {
        String requestURL = "/saveAltInsuranceDefaultDetail";
        EligAltInsuranceDefaultDetail form = new EligAltInsuranceDefaultDetail();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(form);

        doThrow(new RuntimeException("I got an exception"))
                .when(mockEligProfileMemberService)
                .saveAltInsuranceDefaultDetail(jsonData);
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.post(requestURL, jsonData)
                        .content(jsonData).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();

        String expected = "{\"Message\" : \"ERROR " + ADD_UPDATE_EXCEPTION_TEXT + "\"}";
        LOG.debug(">>> result=" + result.getResponse().getContentAsString());
        assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    public void getHealthDefaultDetailsByPKGoodTest() throws Exception {
        String carrierId = "foo";
        String accountId = "bar";
        String groupId = "foobar";

        EligMemberHealthDefaultDetailForm expected = new EligMemberHealthDefaultDetailForm();
        expected.setAccountId(accountId);
        expected.setCarCarrierId(carrierId);
        expected.setGroupId(groupId);

        when(mockHealthDefaultDetailService.findHealthDefaultsByPrimaryKey(anyString(), anyString(), anyString()))
                .thenReturn(expected)
        ;

        String requestURL =
                "/healthDefaultDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
        LOG.debug(">>>>" + result.getResponse().getContentAsString());
        ObjectMapper objectMapper = new ObjectMapper();
        String expectedJSON = objectMapper.writeValueAsString(expected);

        JSONAssert.assertEquals(expectedJSON, result.getResponse().getContentAsString(), false);
    }

    @Test
    public void getHealthDefaultDetailsMissingArguments() throws Exception {
        String carrierId = "";
        String accountId = "";
        String groupId = "";

        String requestURL =
                "/healthDefaultDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void getHealthDefaultDetailsMissingCarrierId() throws Exception {

        String carrierId = "";
        String accountId = "ABC";
        String groupId = "DEF";

        String requestURL =
                "/healthDefaultDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void getHealthDefaultDetailsMissingAccountId() throws Exception {
        String carrierId = "ABC";
        String accountId = "";
        String groupId = "DEF";

        String requestURL =
                "/healthDefaultDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }

    @Test
    public void getHealthDefaultDetailsMissingGroupId() throws Exception {
        String carrierId = "ABC";
        String accountId = "DEF";
        String groupId = "";

        String requestURL =
                "/healthDefaultDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;

        mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn()
        ;
    }


    @Test
    public void getHealthDefaultDetailsExceptionTest() throws Exception {

        String carrierId = "ABC";
        String accountId = "DEF";
        String groupId = "GHI";

        String requestURL =
                "/healthDefaultDetails?"
                        + "carrierId=" + carrierId
                        + "&accountId=" + accountId
                        + "&groupId=" + groupId;
        when(mockHealthDefaultDetailService.findHealthDefaultsByPrimaryKey(anyString(), anyString(), anyString()))
                .thenThrow(new RuntimeException("I got an exception"));
        ;
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get(requestURL).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest()).andReturn();
        String expected = "I got an exception";
        LOG.debug(">>> " + result.getResponse().getContentAsString());
        assertEquals(expected, result.getResponse().getContentAsString());
    }


}