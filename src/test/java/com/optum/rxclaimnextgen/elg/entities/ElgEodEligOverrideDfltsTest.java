package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;

import static org.junit.Assert.*;

public class ElgEodEligOverrideDfltsTest {

    private ElgEodEligOverrideDflts elgEodEligOverrideDflts;

    @Before
    public void setUp() throws Exception {
        this.elgEodEligOverrideDflts = new ElgEodEligOverrideDflts();
    }

    @After
    public void tearDown() throws Exception {
        this.elgEodEligOverrideDflts = null;
    }

    @Test
    public void setCarCarrierId() {
        String expected = "foobar";
        this.elgEodEligOverrideDflts.setCarCarrierId(expected);

        assertEquals(expected, this.elgEodEligOverrideDflts.getCarCarrierId());
    }

    @Test
    public void setAccountId() {
        String expected = "foobar";
        this.elgEodEligOverrideDflts.setAccountId(expected);

        assertEquals(expected, this.elgEodEligOverrideDflts.getAccountId());
    }

    @Test
    public void setGroupId() {
        String expected = "foobar";
        this.elgEodEligOverrideDflts.setGroupId(expected);

        assertEquals(expected, this.elgEodEligOverrideDflts.getGroupId());
    }

    @Test
    public void setEodCopayFromDateInd() {
        String expected = "foobar";
        this.elgEodEligOverrideDflts.setEodCopayFromDateInd(expected);

        assertEquals(expected, this.elgEodEligOverrideDflts.getEodCopayFromDateInd());
    }

    @Test
    public void setEodCopayFromDate() {
        Date expected = new Date(1234);
        this.elgEodEligOverrideDflts.setEodCopayFromDate(expected);

        assertEquals(expected, this.elgEodEligOverrideDflts.getEodCopayFromDate());
    }

    @Test
    public void setEodCopayThruDateInd() {
        String expected = "foobar";
        this.elgEodEligOverrideDflts.setEodCopayThruDateInd(expected);

        assertEquals(expected, this.elgEodEligOverrideDflts.getEodCopayThruDateInd());
    }

    @Test
    public void setEodCopayThruDate() {
        Date expected = new Date(1234);
        this.elgEodEligOverrideDflts.setEodCopayThruDate(expected);

        assertEquals(expected, this.elgEodEligOverrideDflts.getEodCopayThruDate());
    }

    @Test
    public void setEodCopayScheduleInd() {
        String expected = "foobar";
        this.elgEodEligOverrideDflts.setEodCopayScheduleInd(expected);

        assertEquals(expected, this.elgEodEligOverrideDflts.getEodCopayScheduleInd());
    }

    @Test
    public void setEodCopaySchedule() {
        String expected = "foobar";
        this.elgEodEligOverrideDflts.setEodCopaySchedule(expected);

        assertEquals(expected, this.elgEodEligOverrideDflts.getEodCopaySchedule());
    }

    @Test
    public void setEodCopayStepInd() {
        String expected = "foobar";
        this.elgEodEligOverrideDflts.setEodCopayStepInd(expected);

        assertEquals(expected, this.elgEodEligOverrideDflts.getEodCopayStepInd());
    }

    @Test
    public void setEodCopayStep() {
       Integer expected = 10;
        this.elgEodEligOverrideDflts.setEodCopayStep(expected);

        assertEquals(expected, this.elgEodEligOverrideDflts.getEodCopayStep());
    }

    @Test
    public void setAddUserName() {
        String expected = "foobar";
        this.elgEodEligOverrideDflts.setAddUserName(expected);

        assertEquals(expected, this.elgEodEligOverrideDflts.getAddUserName());
    }

    @Test
    public void setAddDate() {
        Date expected = new Date(1234);
        this.elgEodEligOverrideDflts.setAddDate(expected);

        assertEquals(expected, this.elgEodEligOverrideDflts.getAddDate());
    }

    @Test
    public void setAddTime() {
        Time expected = new Time(1234);
        this.elgEodEligOverrideDflts.setAddTime(expected);

        assertEquals(expected, this.elgEodEligOverrideDflts.getAddTime());
    }

    @Test
    public void setAddProgramName() {
        String expected = "foobar";
        this.elgEodEligOverrideDflts.setAddProgramName(expected);

        assertEquals(expected, this.elgEodEligOverrideDflts.getAddProgramName());
    }

    @Test
    public void setChgUserName() {
        String expected = "foobar";
        this.elgEodEligOverrideDflts.setChgUserName(expected);

        assertEquals(expected, this.elgEodEligOverrideDflts.getChgUserName());
    }

    @Test
    public void setChgDate() {
        Date expected = new Date(1234);
        this.elgEodEligOverrideDflts.setChgDate(expected);

        assertEquals(expected, this.elgEodEligOverrideDflts.getChgDate());
    }

    @Test
    public void setChgTime() {
        Time expected = new Time(1234);
        this.elgEodEligOverrideDflts.setChgTime(expected);

        assertEquals(expected, this.elgEodEligOverrideDflts.getChgTime());
    }

    @Test
    public void setChgProgramName() {
        String expected = "foobar";
        this.elgEodEligOverrideDflts.setChgProgramName(expected);

        assertEquals(expected, this.elgEodEligOverrideDflts.getChgProgramName());
    }
}