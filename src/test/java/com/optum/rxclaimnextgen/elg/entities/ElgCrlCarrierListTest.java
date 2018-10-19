package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.sql.Time;

import static org.junit.Assert.*;

public class ElgCrlCarrierListTest {

    private ElgCrlCarrierList elgCrlCarrierList;

    @Before
    public void setUp() {
        this.elgCrlCarrierList = new ElgCrlCarrierList();
    }

    @After
    public void tearDown() {
        this.elgCrlCarrierList = null;
    }

    @Test
    public void setCrlCarrierListName() throws Exception {
        String expected = "foobar";
        this.elgCrlCarrierList.setCrlCarrierListName(expected);

        assertEquals(expected, this.elgCrlCarrierList.getCrlCarrierListName());
    }

    @Test
    public void setCrlCarrierListDesc() throws Exception {
        String expected = "foobar";
        this.elgCrlCarrierList.setCrlCarrierListDesc(expected);

        assertEquals(expected, this.elgCrlCarrierList.getCrlCarrierListDesc());
    }

    @Test
    public void setAddUserName() throws Exception {
        String expected = "foobar";
        this.elgCrlCarrierList.setAddUserName(expected);

        assertEquals(expected, this.elgCrlCarrierList.getAddUserName());
    }

    @Test
    public void setAddDate() throws Exception {
        Date expected = new Date(1234);
        this.elgCrlCarrierList.setAddDate(expected);

        assertEquals(expected, this.elgCrlCarrierList.getAddDate());
    }

    @Test
    public void setAddTime() throws Exception {
        Time expected = new Time(1234);
        this.elgCrlCarrierList.setAddTime(expected);

        assertEquals(expected, this.elgCrlCarrierList.getAddTime());
    }

    @Test
    public void setAddProgramName() throws Exception {
        String expected = "foobar";
        this.elgCrlCarrierList.setAddProgramName(expected);

        assertEquals(expected, this.elgCrlCarrierList.getAddProgramName());
    }

    @Test
    public void setChgUserName() throws Exception {
        String expected = "foobar";
        this.elgCrlCarrierList.setChgUserName(expected);

        assertEquals(expected, this.elgCrlCarrierList.getChgUserName());
    }

    @Test
    public void setChgDate() throws Exception {
        Date expected = new Date(1234);
        this.elgCrlCarrierList.setChgDate(expected);

        assertEquals(expected, this.elgCrlCarrierList.getChgDate());
    }

    @Test
    public void setChgTime() throws Exception {
        Time expected = new Time(1234);
        this.elgCrlCarrierList.setChgTime(expected);

        assertEquals(expected, this.elgCrlCarrierList.getChgTime());
    }

    @Test
    public void setChgProgramName() throws Exception {
        String expected = "foobar";
        this.elgCrlCarrierList.setChgProgramName(expected);

        assertEquals(expected, this.elgCrlCarrierList.getChgProgramName());
    }

}