package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.sql.Time;

import static org.junit.Assert.*;

public class ElgAclAccountListTest {
    private ElgAclAccountList elgAclAccountList;

    @Before
    public void setUp() {
        elgAclAccountList = new ElgAclAccountList();
    }

    @After
    public void tearDown() {
        elgAclAccountList = null;
    }

    @Test
    public void getAclAccountListName() throws Exception {
        String expected = "foobar";
        this.elgAclAccountList.setAclAccountListName(expected);

        assertEquals(expected, this.elgAclAccountList.getAclAccountListName());
    }

    @Test
    public void setAclAccountListName() throws Exception {
        String expected = "foobar";
        this.elgAclAccountList.setAclAccountListName(expected);

        assertEquals(expected, this.elgAclAccountList.getAclAccountListName());
    }

    @Test
    public void getAclAccountListDescrip() throws Exception {
        String expected = "foobar";
        this.elgAclAccountList.setAclAccountListDescrip(expected);

        assertEquals(expected, this.elgAclAccountList.getAclAccountListDescrip());
    }

    @Test
    public void setAclAccountListDescrip() throws Exception {
        String expected = "foobar";
        this.elgAclAccountList.setAclAccountListDescrip(expected);

        assertEquals(expected, this.elgAclAccountList.getAclAccountListDescrip());
    }

    @Test
    public void getAddUserName() throws Exception {
        String expected = "foobar";
        this.elgAclAccountList.setAddUserName(expected);

        assertEquals(expected, this.elgAclAccountList.getAddUserName());
    }

    @Test
    public void setAddUserName() throws Exception {
        String expected = "foobar";
        this.elgAclAccountList.setAddUserName(expected);

        assertEquals(expected, this.elgAclAccountList.getAddUserName());
    }

    @Test
    public void getAddDate() throws Exception {
        Date expected = new Date(1234);
        this.elgAclAccountList.setAddDate(expected);

        assertEquals(expected, this.elgAclAccountList.getAddDate());
    }

    @Test
    public void setAddDate() throws Exception {
        Date expected = new Date(1234);
        this.elgAclAccountList.setAddDate(expected);

        assertEquals(expected, this.elgAclAccountList.getAddDate());
    }

    @Test
    public void getAddTime() throws Exception {
        Time expected = new Time(1234);
        this.elgAclAccountList.setAddTime(expected);

        assertEquals(expected, this.elgAclAccountList.getAddTime());
    }

    @Test
    public void setAddTime() throws Exception {
        Time expected = new Time(1234);
        this.elgAclAccountList.setAddTime(expected);

        assertEquals(expected, this.elgAclAccountList.getAddTime());
    }

    @Test
    public void getAddProgramName() throws Exception {
        String expected = "foobar";
        this.elgAclAccountList.setAddProgramName(expected);

        assertEquals(expected, this.elgAclAccountList.getAddProgramName());
    }

    @Test
    public void setAddProgramName() throws Exception {
        String expected = "foobar";
        this.elgAclAccountList.setAddProgramName(expected);

        assertEquals(expected, this.elgAclAccountList.getAddProgramName());
    }

    @Test
    public void getChgUserName() throws Exception {
        String expected = "foobar";
        this.elgAclAccountList.setChgUserName(expected);

        assertEquals(expected, this.elgAclAccountList.getChgUserName());
    }

    @Test
    public void setChgUserName() throws Exception {
        String expected = "foobar";
        this.elgAclAccountList.setChgUserName(expected);

        assertEquals(expected, this.elgAclAccountList.getChgUserName());
    }

    @Test
    public void getChgDate() throws Exception {
        Date expected = new Date(1234);
        this.elgAclAccountList.setChgDate(expected);

        assertEquals(expected, this.elgAclAccountList.getChgDate());
    }

    @Test
    public void setChgDate() throws Exception {
        Date expected = new Date(1234);
        this.elgAclAccountList.setChgDate(expected);

        assertEquals(expected, this.elgAclAccountList.getChgDate());
    }

    @Test
    public void getChgTime() throws Exception {
        Time expected = new Time(1234);
        this.elgAclAccountList.setChgTime(expected);

        assertEquals(expected, this.elgAclAccountList.getChgTime());
    }

    @Test
    public void setChgTime() throws Exception {
        Time expected = new Time(1234);
        this.elgAclAccountList.setChgTime(expected);

        assertEquals(expected, this.elgAclAccountList.getChgTime());
    }

    @Test
    public void getChgProgramName() throws Exception {
        String expected = "foobar";
        this.elgAclAccountList.setChgProgramName(expected);

        assertEquals(expected, this.elgAclAccountList.getChgProgramName());
    }

    @Test
    public void setChgProgramName() throws Exception {
        String expected = "foobar";
        this.elgAclAccountList.setChgProgramName(expected);

        assertEquals(expected, this.elgAclAccountList.getChgProgramName());
    }

}