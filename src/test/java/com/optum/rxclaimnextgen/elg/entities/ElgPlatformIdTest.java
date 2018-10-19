package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.sql.Time;

import static org.junit.Assert.*;

public class ElgPlatformIdTest {

    private ElgPlatformId elgPlatformId;

    @Before
    public void setUp() throws Exception {
        this.elgPlatformId = new ElgPlatformId();
    }

    @After
    public void tearDown() throws Exception {
        this.elgPlatformId = null;
    }

    @Test
    public void setPlatformId() throws Exception {
        String expected = "foobar";
        this.elgPlatformId.setPlatformId(expected);

        assertEquals(expected, this.elgPlatformId.getPlatformId());
    }

    @Test
    public void setPlatformDesc() throws Exception {
        String expected = "foobar";
        this.elgPlatformId.setPlatformDesc(expected);

        assertEquals(expected, this.elgPlatformId.getPlatformDesc());
    }

    @Test
    public void setAddUserName() throws Exception {
        String expected = "foobar";
        this.elgPlatformId.setAddUserName(expected);

        assertEquals(expected, this.elgPlatformId.getAddUserName());
    }

    @Test
    public void setAddDate() throws Exception {
        Date expected = new Date(1234);
        this.elgPlatformId.setAddDate(expected);

        assertEquals(expected, this.elgPlatformId.getAddDate());
    }

    @Test
    public void setAddTime() throws Exception {
        Time expected = new Time(1234);
        this.elgPlatformId.setAddTime(expected);

        assertEquals(expected, this.elgPlatformId.getAddTime());
    }

    @Test
    public void setAddProgramName() throws Exception {
        String expected = "foobar";
        this.elgPlatformId.setAddProgramName(expected);

        assertEquals(expected, this.elgPlatformId.getAddProgramName());
    }

    @Test
    public void setChgUserName() throws Exception {
        String expected = "foobar";
        this.elgPlatformId.setChgUserName(expected);

        assertEquals(expected, this.elgPlatformId.getChgUserName());
    }

    @Test
    public void setChgDate() throws Exception {
        Date expected = new Date(1234);
        this.elgPlatformId.setChgDate(expected);

        assertEquals(expected, this.elgPlatformId.getChgDate());
    }

    @Test
    public void setChgTime() throws Exception {
        Time expected = new Time(1234);
        this.elgPlatformId.setChgTime(expected);

        assertEquals(expected, this.elgPlatformId.getChgTime());
    }

    @Test
    public void setChgProgramName() throws Exception {
        String expected = "foobar";
        this.elgPlatformId.setChgProgramName(expected);

        assertEquals(expected, this.elgPlatformId.getChgProgramName());
    }

}