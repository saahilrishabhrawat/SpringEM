package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.sql.Time;

import static org.junit.Assert.*;

public class ElgGroupGrpTest {

    private ElgGroupGrp elgGroupGrp;

    @Before
    public void setUp() throws Exception {
        this.elgGroupGrp = new ElgGroupGrp();
    }

    @After
    public void tearDown() throws Exception {
        this.elgGroupGrp = null;
    }

    @Test
    public void setCarCarrierId() {
        String expected = "foobar";
        this.elgGroupGrp.setCarCarrierId(expected);

        assertEquals(expected, this.elgGroupGrp.getCarCarrierId());
    }

    @Test
    public void setAccAccountId() {
        String expected = "foobar";
        this.elgGroupGrp.setAccAccountId(expected);

        assertEquals(expected, this.elgGroupGrp.getAccAccountId());
    }

    @Test
    public void setGrpGroupId() {
        String expected = "foobar";
        this.elgGroupGrp.setGrpGroupId(expected);

        assertEquals(expected, this.elgGroupGrp.getGrpGroupId());
    }

    @Test
    public void setGrpGroupName() {
        String expected = "foobar";
        this.elgGroupGrp.setGrpGroupName(expected);

        assertEquals(expected, this.elgGroupGrp.getGrpGroupName());
    }

    @Test
    public void setGrpAddress1() {
        String expected = "foobar";
        this.elgGroupGrp.setGrpAddress1(expected);

        assertEquals(expected, this.elgGroupGrp.getGrpAddress1());
    }

    @Test
    public void setGrpAddress2() {
        String expected = "foobar";
        this.elgGroupGrp.setGrpAddress2(expected);

        assertEquals(expected, this.elgGroupGrp.getGrpAddress2());
    }

    @Test
    public void setGrpCity() {
        String expected = "foobar";
        this.elgGroupGrp.setGrpCity(expected);

        assertEquals(expected, this.elgGroupGrp.getGrpCity());
    }

    @Test
    public void setGrpState() {
        String expected = "foobar";
        this.elgGroupGrp.setGrpState(expected);

        assertEquals(expected, this.elgGroupGrp.getGrpState());
    }

    @Test
    public void setGrpZip() {
        String expected = "foobar";
        this.elgGroupGrp.setGrpZip(expected);

        assertEquals(expected, this.elgGroupGrp.getGrpZip());
    }

    @Test
    public void setGrpZip2() {
        String expected = "foobar";
        this.elgGroupGrp.setGrpZip2(expected);

        assertEquals(expected, this.elgGroupGrp.getGrpZip2());
    }

    @Test
    public void setGrpZip3() {
        String expected = "foobar";
        this.elgGroupGrp.setGrpZip3(expected);

        assertEquals(expected, this.elgGroupGrp.getGrpZip3());
    }

    @Test
    public void setGrpCountry() {
        String expected = "foobar";
        this.elgGroupGrp.setGrpCountry(expected);

        assertEquals(expected, this.elgGroupGrp.getGrpCountry());
    }

    @Test
    public void setGrpPhone() {
        int expected = Integer.MAX_VALUE;
        this.elgGroupGrp.setGrpPhone(expected);

        assertEquals(expected, this.elgGroupGrp.getGrpPhone());
    }

    @Test
    public void setGrpContactName() {
        String expected = "foobar";
        this.elgGroupGrp.setGrpContactName(expected);

        assertEquals(expected, this.elgGroupGrp.getGrpContactName());
    }

    @Test
    public void setGrpContractDate() {
        Date expected = new Date(1234);
        this.elgGroupGrp.setGrpContractDate(expected);

        assertEquals(expected, this.elgGroupGrp.getGrpContractDate());
    }

    @Test
    public void setGrpRenewalDate() {
        Date expected = new Date(1234);
        this.elgGroupGrp.setGrpRenewalDate(expected);

        assertEquals(expected, this.elgGroupGrp.getGrpRenewalDate());
    }

    @Test
    public void setGrpSicCode() {
        String expected = "foobar";
        this.elgGroupGrp.setGrpSicCode(expected);

        assertEquals(expected, this.elgGroupGrp.getGrpSicCode());
    }

    @Test
    public void setGrpLanguageCode() {
        String expected = "foobar";
        this.elgGroupGrp.setGrpLanguageCode(expected);

        assertEquals(expected, this.elgGroupGrp.getGrpLanguageCode());
    }

    @Test
    public void setAddDate() {
        Date expected = new Date(1234);
        this.elgGroupGrp.setAddDate(expected);

        assertEquals(expected, this.elgGroupGrp.getAddDate());
    }

    @Test
    public void setChgUserName() {
        String expected = "foobar";
        this.elgGroupGrp.setChgUserName(expected);

        assertEquals(expected, this.elgGroupGrp.getChgUserName());
    }

    @Test
    public void setChgDate() {
        Date expected = new Date(1234);
        this.elgGroupGrp.setChgDate(expected);

        assertEquals(expected, this.elgGroupGrp.getChgDate());
    }

    @Test
    public void setChgTime() {
        Time expected = new Time(1234);
        this.elgGroupGrp.setChgTime(expected);

        assertEquals(expected, this.elgGroupGrp.getChgTime());
    }

    @Test
    public void setChgProgramName() {
        String expected = "foobar";
        this.elgGroupGrp.setChgProgramName(expected);

        assertEquals(expected, this.elgGroupGrp.getChgProgramName());
    }
}