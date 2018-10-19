package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;

import static org.junit.Assert.*;

public class ElgEqdEligQueueDefaultsTest {

    private ElgEqdEligQueueDefaults elgEqdEligQueueDefaults;

    @Before
    public void setUp() throws Exception {
        this.elgEqdEligQueueDefaults = new ElgEqdEligQueueDefaults();
    }

    @After
    public void tearDown() throws Exception {
        this.elgEqdEligQueueDefaults = null;
    }

    @Test
    public void setCarCarrierId() {
        String expected = "foobar";
        this.elgEqdEligQueueDefaults.setCarCarrierId(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getCarCarrierId());
    }

    @Test
    public void setEqdAccountId() {
        String expected = "foobar";
        this.elgEqdEligQueueDefaults.setEqdAccountId(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getEqdAccountId());
    }

    @Test
    public void setEqdGroupId() {
        String expected = "foobar";
        this.elgEqdEligQueueDefaults.setEqdGroupId(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getEqdGroupId());
    }

    @Test
    public void setEqdReportName() {
        String expected = "foobar";
        this.elgEqdEligQueueDefaults.setEqdReportName(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getEqdReportName());
    }

    @Test
    public void setEqdOutputQueueLibrary() {
        String expected = "foobar";
        this.elgEqdEligQueueDefaults.setEqdOutputQueueLibrary(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getEqdOutputQueueLibrary());
    }

    @Test
    public void setEqdOutputQueueName() {
        String expected = "foobar";
        this.elgEqdEligQueueDefaults.setEqdOutputQueueName(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getEqdOutputQueueName());
    }

    @Test
    public void setEqdNumberOfCopies() {
        BigInteger expected = BigInteger.TEN;
        this.elgEqdEligQueueDefaults.setEqdNumberOfCopies(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getEqdNumberOfCopies());
    }

    @Test
    public void setEqdSaveSpoolFile() {
        String expected = "foobar";
        this.elgEqdEligQueueDefaults.setEqdSaveSpoolFile(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getEqdSaveSpoolFile());
    }

    @Test
    public void setEqdHoldSpoolFile() {
        String expected = "foobar";
        this.elgEqdEligQueueDefaults.setEqdHoldSpoolFile(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getEqdHoldSpoolFile());
    }

    @Test
    public void setEqdSpoolFileName() {
        String expected = "foobar";
        this.elgEqdEligQueueDefaults.setEqdSpoolFileName(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getEqdSpoolFileName());
    }

    @Test
    public void setEqdFormType() {
        String expected = "foobar";
        this.elgEqdEligQueueDefaults.setEqdFormType(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getEqdFormType());
    }

    @Test
    public void setEqdDistributionUserId() {
        String expected = "foobar";
        this.elgEqdEligQueueDefaults.setEqdDistributionUserId(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getEqdDistributionUserId());
    }

    @Test
    public void setEqdSystemId() {
        String expected = "foobar";
        this.elgEqdEligQueueDefaults.setEqdSystemId(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getEqdSystemId());
    }

    @Test
    public void setAddUserName() {
        String expected = "foobar";
        this.elgEqdEligQueueDefaults.setAddUserName(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getAddUserName());
    }

    @Test
    public void setAddDate() {
        Date expected = new Date(1234);
        this.elgEqdEligQueueDefaults.setAddDate(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getAddDate());
    }

    @Test
    public void setAddTime() {
        Time expected = new Time(1234);
        this.elgEqdEligQueueDefaults.setAddTime(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getAddTime());
    }

    @Test
    public void setAddProgramName() {
        String expected = "foobar";
        this.elgEqdEligQueueDefaults.setAddProgramName(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getAddProgramName());
    }

    @Test
    public void setChgUserName() {
        String expected = "foobar";
        this.elgEqdEligQueueDefaults.setChgUserName(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getChgUserName());
    }

    @Test
    public void setChgDate() {
        Date expected = new Date(1234);
        this.elgEqdEligQueueDefaults.setChgDate(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getChgDate());
    }

    @Test
    public void setChgTime() {
        Time expected = new Time(1234);
        this.elgEqdEligQueueDefaults.setChgTime(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getChgTime());
    }

    @Test
    public void setChgProgramName() {
        String expected = "foobar";
        this.elgEqdEligQueueDefaults.setChgProgramName(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaults.getChgProgramName());
    }
}