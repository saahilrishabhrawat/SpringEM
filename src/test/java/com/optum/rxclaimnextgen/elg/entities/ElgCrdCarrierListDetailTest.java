package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.sql.Time;

import static org.junit.Assert.*;

public class ElgCrdCarrierListDetailTest {

    private ElgCrdCarrierListDetail elgCrdCarrierListDetail;

    @Before
    public void setUp() {
        elgCrdCarrierListDetail = new ElgCrdCarrierListDetail();
    }

    @After
    public void tearDown() {
        elgCrdCarrierListDetail = null;
    }

    @Test
    public void setCrlCarrierListName() throws Exception {
        String expected = "foobar";
        this.elgCrdCarrierListDetail.setCrlCarrierListName(expected);

        assertEquals(expected, this.elgCrdCarrierListDetail.getCrlCarrierListName());
    }

    @Test
    public void setCarCarrierId() throws Exception {
        String expected = "foobar";
        this.elgCrdCarrierListDetail.setCarCarrierId(expected);

        assertEquals(expected, this.elgCrdCarrierListDetail.getCarCarrierId());
    }

    @Test
    public void setAddUserName() throws Exception {
        String expected = "foobar";
        this.elgCrdCarrierListDetail.setAddUserName(expected);

        assertEquals(expected, this.elgCrdCarrierListDetail.getAddUserName());
    }

    @Test
    public void setAddDate() throws Exception {
        Date expected = new Date(1234);
        this.elgCrdCarrierListDetail.setAddDate(expected);

        assertEquals(expected, this.elgCrdCarrierListDetail.getAddDate());
    }

    @Test
    public void setAddTime() throws Exception {
        Time expected = new Time(1234);
        this.elgCrdCarrierListDetail.setAddTime(expected);

        assertEquals(expected, this.elgCrdCarrierListDetail.getAddTime());
    }

    @Test
    public void setAddProgramName() throws Exception {
        String expected = "foobar";
        this.elgCrdCarrierListDetail.setAddProgramName(expected);

        assertEquals(expected, this.elgCrdCarrierListDetail.getAddProgramName());
    }

    @Test
    public void setChgUserName() throws Exception {
        String expected = "foobar";
        this.elgCrdCarrierListDetail.setChgUserName(expected);

        assertEquals(expected, this.elgCrdCarrierListDetail.getChgUserName());
    }

    @Test
    public void setChgDate() throws Exception {
        Date expected = new Date(1234);
        this.elgCrdCarrierListDetail.setChgDate(expected);

        assertEquals(expected, this.elgCrdCarrierListDetail.getChgDate());
    }

    @Test
    public void setChgTime() throws Exception {
        Time expected = new Time(1234);
        this.elgCrdCarrierListDetail.setChgTime(expected);

        assertEquals(expected, this.elgCrdCarrierListDetail.getChgTime());
    }

    @Test
    public void setChgProgramName() throws Exception {
        String expected = "foobar";
        this.elgCrdCarrierListDetail.setChgProgramName(expected);

        assertEquals(expected, this.elgCrdCarrierListDetail.getChgProgramName());
    }

}