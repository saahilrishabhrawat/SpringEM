package com.optum.rxclaimnextgen.elg.pojo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EligMemberCareAssignDetailFormTest {

    private EligMemberCareAssignDetailForm eligMemberCareAssignDetailForm;

    @Before
    public void setUp() throws Exception {
        this.eligMemberCareAssignDetailForm = new EligMemberCareAssignDetailForm();
    }

    @After
    public void tearDown() throws Exception {
        this.eligMemberCareAssignDetailForm = null;
    }

    @Test
    public void setCarCarrierId() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setCarCarrierId(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getCarCarrierId());
    }

    @Test
    public void setAccountId() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setAccountId(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getAccountId());
    }

    @Test
    public void setGroupId() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setGroupId(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getGroupId());
    }

    @Test
    public void setEmdCareEffDate() {
    	 DateType expected = new DateType();
         expected.setMonth("01");
         expected.setDay("02");
         expected.setYear("2001");
        this.eligMemberCareAssignDetailForm.setEmdCareEffDate(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getEmdCareEffDate());
    }

    @Test
    public void setEmdCareEffDateInd() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setEmdCareEffDateInd(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getEmdCareEffDateInd());
    }

    @Test
    public void setEmdCareThruDateInd() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setEmdCareThruDateInd(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getEmdCareThruDateInd());
    }

    @Test
    public void setEmdCareThruDate() {
    	 DateType expected = new DateType();
         expected.setMonth("01");
         expected.setDay("02");
         expected.setYear("2001");
        this.eligMemberCareAssignDetailForm.setEmdCareThruDate(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getEmdCareThruDate());
    }

    @Test
    public void setEmdNetworkInd() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setEmdNetworkInd(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getEmdNetworkInd());
    }

    @Test
    public void setCnwNetworkID() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setCnwNetworkID(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getCnwNetworkID());
    }

    @Test
    public void setEmdMCFOvrPlanInd() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setEmdMCFOvrPlanInd(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getEmdMCFOvrPlanInd());
    }

    @Test
    public void setEmdMCFOvrPlanCode() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setEmdMCFOvrPlanCode(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getEmdMCFOvrPlanCode());
    }

    @Test
    public void setEmdMCFOvrPlanEffDate() {
        DateType expected = new DateType();
        expected.setMonth("01");
        expected.setDay("02");
        expected.setYear("2001");
        this.eligMemberCareAssignDetailForm.setEmdMCFOvrPlanEffDate(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getEmdMCFOvrPlanEffDate());
    }

    @Test
    public void setEmdCareFacilityInd() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setEmdCareFacilityInd(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getEmdCareFacilityInd());
    }

    @Test
    public void setCfaCareFacilityID() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setCfaCareFacilityID(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getCfaCareFacilityID());
    }

    @Test
    public void setEmdQualifierInd() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setEmdQualifierInd(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getEmdQualifierInd());
    }

    @Test
    public void setCquQualifierID() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setCquQualifierID(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getCquQualifierID());
    }

    @Test
    public void setEmdPhysicianIDInd() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setEmdPhysicianIDInd(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getEmdPhysicianIDInd());
    }

    @Test
    public void setPrfPrescriberID() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setPrfPrescriberID(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getPrfPrescriberID());
    }

    @Test
    public void setPrfPrescriberIDState() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setPrfPrescriberIDState(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getPrfPrescriberIDState());
    }

    @Test
    public void setAddUserName() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setAddUserName(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getAddUserName());
    }

    @Test
    public void setAddDate() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setAddDate(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getAddDate());
    }

    @Test
    public void setAddTime() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setAddTime(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getAddTime());
    }

    @Test
    public void setAddProgramName() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setAddProgramName(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getAddProgramName());
    }

    @Test
    public void setChgUserName() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setChgUserName(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getChgUserName());
    }

    @Test
    public void setChgDate() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setChgDate(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getChgDate());
    }

    @Test
    public void setChgTime() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setChgTime(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getChgTime());
    }

    @Test
    public void setChgProgramName() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setChgProgramName(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getChgProgramName());
    }

    @Test
    public void setMessage() {
        String expected = "foobar";
        this.eligMemberCareAssignDetailForm.setMessage(expected);

        assertEquals(expected, this.eligMemberCareAssignDetailForm.getMessage());
    }
}