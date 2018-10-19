package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.sql.Time;

import static org.junit.Assert.*;

public class ElgGrlGroupListTest {

    private ElgGrlGroupList elgGrlGroupList;

    @Before
    public void setUp() {
        this.elgGrlGroupList = new ElgGrlGroupList();
    }

    @After
    public void tearDown() {
        this.elgGrlGroupList = null;
    }

    @Test
    public void setGrlGroupListName() throws Exception {
        String expected = "foobar";
        this.elgGrlGroupList.setGrlGroupListName(expected);

        assertEquals(expected, this.elgGrlGroupList.getGrlGroupListName());
    }

    @Test
    public void setGrlGroupListDescriptn() throws Exception {
        String expected = "foobar";
        this.elgGrlGroupList.setGrlGroupListDescriptn(expected);

        assertEquals(expected, this.elgGrlGroupList.getGrlGroupListDescriptn());
    }

    @Test
    public void setAddUserName() throws Exception {
        String expected = "foobar";
        this.elgGrlGroupList.setAddUserName(expected);

        assertEquals(expected, this.elgGrlGroupList.getAddUserName());
    }

    @Test
    public void setAddDate() throws Exception {
        Date expected = new Date(1234);
        this.elgGrlGroupList.setAddDate(expected);

        assertEquals(expected, this.elgGrlGroupList.getAddDate());
    }

    @Test
    public void setAddTime() throws Exception {
        Time expected = new Time(1234);
        this.elgGrlGroupList.setAddTime(expected);

        assertEquals(expected, this.elgGrlGroupList.getAddTime());
    }


    @Test
    public void setAddProgramName() throws Exception {
        String expected = "foobar";
        this.elgGrlGroupList.setAddProgramName(expected);

        assertEquals(expected, this.elgGrlGroupList.getAddProgramName());
    }

    @Test
    public void setChgUserName() throws Exception {
        String expected = "foobar";
        this.elgGrlGroupList.setChgUserName(expected);

        assertEquals(expected, this.elgGrlGroupList.getChgUserName());
    }

    @Test
    public void setChgDate() throws Exception {
        Date expected = new Date(1234);
        this.elgGrlGroupList.setChgDate(expected);

        assertEquals(expected, this.elgGrlGroupList.getChgDate());
    }

    @Test
    public void setChgTime() throws Exception {
        Time expected = new Time(1234);
        this.elgGrlGroupList.setChgTime(expected);

        assertEquals(expected, this.elgGrlGroupList.getChgTime());
    }

    @Test
    public void setChgProgramName() throws Exception {
        String expected = "foobar";
        this.elgGrlGroupList.setChgProgramName(expected);

        assertEquals(expected, this.elgGrlGroupList.getChgProgramName());
    }

}