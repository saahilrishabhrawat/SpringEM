package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.sql.Time;

import static org.junit.Assert.*;

public class ElgEligMemberDefaultsOvrEmhTest {

    private ElgEligMemberDefaultsOvrEmh elgEligMemberDefaultsOvrEmh;


    @Before
    public void setUp() throws Exception {
        this.elgEligMemberDefaultsOvrEmh = new ElgEligMemberDefaultsOvrEmh();
    }

    @After
    public void tearDown() throws Exception {
        this.elgEligMemberDefaultsOvrEmh = null;
    }

    @Test
    public void setCarCarrierId() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setCarCarrierId(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getCarCarrierId());
    }

    @Test
    public void setAccountId() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setAccountId(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getAccountId());
    }

    @Test
    public void setGroupId() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setGroupId(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getGroupId());
    }

    @Test
    public void setEmhHimFromThruDateI() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setEmhHimFromThruDateI(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getEmhHimFromThruDateI());
    }

    @Test
    public void setEmhHimFromThruDateR() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setEmhHimFromThruDateR(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getEmhHimFromThruDateR());
    }

    @Test
    public void setEmhQhpPlanIdInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setEmhQhpPlanIdInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getEmhQhpPlanIdInd());
    }

    @Test
    public void setEmhQhpPlanIdRep() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setEmhQhpPlanIdRep(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getEmhQhpPlanIdRep());
    }

    @Test
    public void setEmhCsrLevelInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setEmhCsrLevelInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getEmhCsrLevelInd());
    }

    @Test
    public void setEmhCsrLevelRep() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setEmhCsrLevelRep(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getEmhCsrLevelRep());
    }

    @Test
    public void setEmhMetalLevelInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setEmhMetalLevelInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getEmhMetalLevelInd());
    }

    @Test
    public void setEmhMetalLevelIndRep() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setEmhMetalLevelIndRep(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getEmhMetalLevelIndRep());
    }

    @Test
    public void setEmhMemberEthnicityInd() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setEmhMemberEthnicityInd(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getEmhMemberEthnicityInd());
    }

    @Test
    public void setEmhMemberEthnicityRep() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setEmhMemberEthnicityRep(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getEmhMemberEthnicityRep());
    }

    @Test
    public void setEmhAptcIndicator() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setEmhAptcIndicator(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getEmhAptcIndicator());
    }

    @Test
    public void setEmhHimGraceStartEndI() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setEmhHimGraceStartEndI(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getEmhHimGraceStartEndI());
    }

    @Test
    public void setEmhHimGraceStartEndR() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setEmhHimGraceStartEndR(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getEmhHimGraceStartEndR());
    }

    @Test
    public void setEmhFamilyIdReproc() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setEmhFamilyIdReproc(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getEmhFamilyIdReproc());
    }

    @Test
    public void setAddUserName() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setAddUserName(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getAddUserName());
    }

    @Test
    public void setAddDate() throws Exception {
        Date expected = new Date(1234);
        this.elgEligMemberDefaultsOvrEmh.setAddDate(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getAddDate());
    }

    @Test
    public void setAddTime() throws Exception {
        Time expected = new Time(1234);
        this.elgEligMemberDefaultsOvrEmh.setAddTime(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getAddTime());
    }

    @Test
    public void setAddProgramName() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setAddProgramName(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getAddProgramName());
    }

    @Test
    public void setChgUserName() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setChgUserName(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getChgUserName());
    }

    @Test
    public void setChgDate() throws Exception {
        Date expected = new Date(1234);
        this.elgEligMemberDefaultsOvrEmh.setChgDate(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getChgDate());
    }

    @Test
    public void setChgTime() throws Exception {
        Time expected = new Time(1234);
        this.elgEligMemberDefaultsOvrEmh.setChgTime(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getChgTime());
    }

    @Test
    public void setChgProgramName() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmh.setChgProgramName(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmh.getChgProgramName());
    }

}