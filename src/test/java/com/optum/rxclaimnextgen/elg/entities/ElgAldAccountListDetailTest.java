package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.sql.Date;
import java.sql.Time;

import static org.junit.Assert.*;

public class ElgAldAccountListDetailTest {
    private ElgAldAccountListDetail elgAldAccountListDetail;


    @Before
    public void setUp() {
        elgAldAccountListDetail = new ElgAldAccountListDetail();
    }

    @After
    public void tearDown() {
        elgAldAccountListDetail = null;
    }

    @Test
    public void setAclAccountListName() throws Exception {
        String expected = "foobar";
        this.elgAldAccountListDetail.setAclAccountListName(expected);

        assertEquals(expected, this.elgAldAccountListDetail.getAclAccountListName());
    }

    @Test
    public void setCarCarrierId() throws Exception {
        String expected = "foobar";
        this.elgAldAccountListDetail.setCarCarrierId(expected);

        assertEquals(expected, this.elgAldAccountListDetail.getCarCarrierId());
    }

    @Test
    public void setAccAccountId() throws Exception {
        String expected = "foobar";
        this.elgAldAccountListDetail.setAccAccountId(expected);

        assertEquals(expected, this.elgAldAccountListDetail.getAccAccountId());
    }

    @Test
    public void setAddUserName() throws Exception {
        String expected = "foobar";
        this.elgAldAccountListDetail.setAddUserName(expected);

        assertEquals(expected, this.elgAldAccountListDetail.getAddUserName());
    }

    @Test
    public void setAddDate() throws Exception {
        Date expected = new Date(1234);
        this.elgAldAccountListDetail.setAddDate(expected);

        assertEquals(expected, this.elgAldAccountListDetail.getAddDate());
    }

    @Test
    public void setAddTime() throws Exception {
        Time expected = new Time(1234);
        this.elgAldAccountListDetail.setAddTime(expected);

        assertEquals(expected, this.elgAldAccountListDetail.getAddTime());
    }

    @Test
    public void setAddProgramName() throws Exception {
        String expected = "foobar";
        this.elgAldAccountListDetail.setAddProgramName(expected);

        assertEquals(expected, this.elgAldAccountListDetail.getAddProgramName());
    }

    @Test
    public void setChgUserName() throws Exception {
        String expected = "foobar";
        this.elgAldAccountListDetail.setChgUserName(expected);

        assertEquals(expected, this.elgAldAccountListDetail.getChgUserName());
    }

    @Test
    public void setChgDate() throws Exception {
        Date expected = new Date(1234);
        this.elgAldAccountListDetail.setChgDate(expected);

        assertEquals(expected, this.elgAldAccountListDetail.getChgDate());
    }

    @Test
    public void setChgTime() throws Exception {
        Time expected = new Time(1234);
        this.elgAldAccountListDetail.setChgTime(expected);

        assertEquals(expected, this.elgAldAccountListDetail.getChgTime());
    }

    @Test
    public void setChgProgramName() throws Exception {
        String expected = "foobar";
        this.elgAldAccountListDetail.setChgProgramName(expected);

        assertEquals(expected, this.elgAldAccountListDetail.getChgProgramName());
    }

}