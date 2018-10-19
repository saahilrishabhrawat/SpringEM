package com.optum.rxclaimnextgen.elg.pojo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EligMemberHimDefaultOvrDetailFormTest {

    private EligMemberHimDefaultOvrDetailForm eligMemberHimDefaultOvrDetailForm;

    @Before
    public void setUp() throws Exception {
        this.eligMemberHimDefaultOvrDetailForm = new EligMemberHimDefaultOvrDetailForm();
    }

    @After
    public void tearDown() throws Exception {
        this.eligMemberHimDefaultOvrDetailForm = null;
    }

    @Test
    public void setCarCarrierId() throws Exception {
        String expected = "foobar";
        this.eligMemberHimDefaultOvrDetailForm.setCarCarrierId(expected);

        assertEquals(expected, this.eligMemberHimDefaultOvrDetailForm.getCarCarrierId());
    }

    @Test
    public void setAccountId() throws Exception {
        String expected = "foobar";
        this.eligMemberHimDefaultOvrDetailForm.setAccountId(expected);

        assertEquals(expected, this.eligMemberHimDefaultOvrDetailForm.getAccountId());
    }

    @Test
    public void setGroupId() throws Exception {
        String expected = "foobar";
        this.eligMemberHimDefaultOvrDetailForm.setGroupId(expected);

        assertEquals(expected, this.eligMemberHimDefaultOvrDetailForm.getGroupId());
    }

    @Test
    public void setEmhHimFromThruDateI() throws Exception {
        String expected = "foobar";
        this.eligMemberHimDefaultOvrDetailForm.setEmhHimFromThruDateI(expected);

        assertEquals(expected, this.eligMemberHimDefaultOvrDetailForm.getEmhHimFromThruDateI());
    }

    @Test
    public void setEmhHimFromThruDateR() throws Exception {
        String expected = "foobar";
        this.eligMemberHimDefaultOvrDetailForm.setEmhHimFromThruDateR(expected);

        assertEquals(expected, this.eligMemberHimDefaultOvrDetailForm.getEmhHimFromThruDateR());
    }

    @Test
    public void setEmhQhpPlanIdInd() throws Exception {
        String expected = "foobar";
        this.eligMemberHimDefaultOvrDetailForm.setEmhQhpPlanIdInd(expected);

        assertEquals(expected, this.eligMemberHimDefaultOvrDetailForm.getEmhQhpPlanIdInd());
    }

    @Test
    public void setEmhQhpPlanIdRep() throws Exception {
        String expected = "foobar";
        this.eligMemberHimDefaultOvrDetailForm.setEmhQhpPlanIdRep(expected);

        assertEquals(expected, this.eligMemberHimDefaultOvrDetailForm.getEmhQhpPlanIdRep());
    }

    @Test
    public void setEmhCsrLevelInd() throws Exception {
        String expected = "foobar";
        this.eligMemberHimDefaultOvrDetailForm.setEmhCsrLevelInd(expected);

        assertEquals(expected, this.eligMemberHimDefaultOvrDetailForm.getEmhCsrLevelInd());
    }

    @Test
    public void setEmhCsrLevelRep() throws Exception {
        String expected = "foobar";
        this.eligMemberHimDefaultOvrDetailForm.setEmhCsrLevelRep(expected);

        assertEquals(expected, this.eligMemberHimDefaultOvrDetailForm.getEmhCsrLevelRep());
    }

    @Test
    public void setEmhMetalLevelInd() throws Exception {
        String expected = "foobar";
        this.eligMemberHimDefaultOvrDetailForm.setEmhMetalLevelInd(expected);

        assertEquals(expected, this.eligMemberHimDefaultOvrDetailForm.getEmhMetalLevelInd());
    }

    @Test
    public void setEmhMetalLevelIndRep() throws Exception {
        String expected = "foobar";
        this.eligMemberHimDefaultOvrDetailForm.setEmhMetalLevelIndRep(expected);

        assertEquals(expected, this.eligMemberHimDefaultOvrDetailForm.getEmhMetalLevelIndRep());
    }

    @Test
    public void setEmhMemberEthnicityInd() throws Exception {
        String expected = "foobar";
        this.eligMemberHimDefaultOvrDetailForm.setEmhMemberEthnicityInd(expected);

        assertEquals(expected, this.eligMemberHimDefaultOvrDetailForm.getEmhMemberEthnicityInd());
    }

    @Test
    public void setEmhMemberEthnicityRep() throws Exception {
        String expected = "foobar";
        this.eligMemberHimDefaultOvrDetailForm.setEmhMemberEthnicityRep(expected);

        assertEquals(expected, this.eligMemberHimDefaultOvrDetailForm.getEmhMemberEthnicityRep());
    }

    @Test
    public void setEmhAptcIndicator() throws Exception {
        String expected = "foobar";
        this.eligMemberHimDefaultOvrDetailForm.setEmhAptcIndicator(expected);

        assertEquals(expected, this.eligMemberHimDefaultOvrDetailForm.getEmhAptcIndicator());
    }

    @Test
    public void setEmhHimGraceStartEndI() throws Exception {
        String expected = "foobar";
        this.eligMemberHimDefaultOvrDetailForm.setEmhHimGraceStartEndI(expected);

        assertEquals(expected, this.eligMemberHimDefaultOvrDetailForm.getEmhHimGraceStartEndI());
    }

    @Test
    public void setEmhHimGraceStartEndR() throws Exception {
        String expected = "foobar";
        this.eligMemberHimDefaultOvrDetailForm.setEmhHimGraceStartEndR(expected);

        assertEquals(expected, this.eligMemberHimDefaultOvrDetailForm.getEmhHimGraceStartEndR());
    }

    @Test
    public void setEmhFamilyIdReproc() throws Exception {
        String expected = "foobar";
        this.eligMemberHimDefaultOvrDetailForm.setEmhFamilyIdReproc(expected);

        assertEquals(expected, this.eligMemberHimDefaultOvrDetailForm.getEmhFamilyIdReproc());
    }

}