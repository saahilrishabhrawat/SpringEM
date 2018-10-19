package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.sql.Time;

import static org.junit.Assert.*;

public class ElgGldGroupListDetailTest {

    private ElgGldGroupListDetail elgGldGroupListDetail;

    @Before
    public void setUp() throws Exception {
        this.elgGldGroupListDetail = new ElgGldGroupListDetail();
    }

    @After
    public void tearDown() throws Exception {
        this.elgGldGroupListDetail = null;
    }

    @Test
    public void setGrlGroupListName() throws Exception {
        String expected = "foobar";
        this.elgGldGroupListDetail.setGrlGroupListName(expected);

        assertEquals(expected, this.elgGldGroupListDetail.getGrlGroupListName());
    }

    @Test
    public void setCarCarrierId() throws Exception {
        String expected = "foobar";
        this.elgGldGroupListDetail.setCarCarrierId(expected);

        assertEquals(expected, this.elgGldGroupListDetail.getCarCarrierId());
    }

    @Test
    public void setAccAccountId() throws Exception {
        String expected = "foobar";
        this.elgGldGroupListDetail.setAccAccountId(expected);

        assertEquals(expected, this.elgGldGroupListDetail.getAccAccountId());
    }

    @Test
    public void setGrpGroupId() throws Exception {
        String expected = "foobar";
        this.elgGldGroupListDetail.setGrpGroupId(expected);

        assertEquals(expected, this.elgGldGroupListDetail.getGrpGroupId());
    }

    @Test
    public void setAddUserName() throws Exception {
        String expected = "foobar";
        this.elgGldGroupListDetail.setAddUserName(expected);

        assertEquals(expected, this.elgGldGroupListDetail.getAddUserName());
    }

    @Test
    public void setAddDate() throws Exception {
        Date expected = new Date(1234);
        this.elgGldGroupListDetail.setAddDate(expected);

        assertEquals(expected, this.elgGldGroupListDetail.getAddDate());
    }

    @Test
    public void setAddTime() throws Exception {
        Time expected = new Time(1234);
        this.elgGldGroupListDetail.setAddTime(expected);

        assertEquals(expected, this.elgGldGroupListDetail.getAddTime());
    }

    @Test
    public void setAddProgramName() throws Exception {
        String expected = "foobar";
        this.elgGldGroupListDetail.setAddProgramName(expected);

        assertEquals(expected, this.elgGldGroupListDetail.getAddProgramName());
    }

    @Test
    public void setChgUserName() throws Exception {
        String expected = "foobar";
        this.elgGldGroupListDetail.setChgUserName(expected);

        assertEquals(expected, this.elgGldGroupListDetail.getChgUserName());
    }

    @Test
    public void setChgDate() throws Exception {
        Date expected = new Date(1234);
        this.elgGldGroupListDetail.setChgDate(expected);

        assertEquals(expected, this.elgGldGroupListDetail.getChgDate());
    }

    @Test
    public void setChgTime() throws Exception {
        Time expected = new Time(1234);
        this.elgGldGroupListDetail.setChgTime(expected);

        assertEquals(expected, this.elgGldGroupListDetail.getChgTime());
    }

    @Test
    public void setChgProgramName() throws Exception {
        String expected = "foobar";
        this.elgGldGroupListDetail.setChgProgramName(expected);

        assertEquals(expected, this.elgGldGroupListDetail.getChgProgramName());
    }

}