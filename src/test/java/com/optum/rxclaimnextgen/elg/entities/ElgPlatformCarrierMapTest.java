package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.sql.Time;

import static org.junit.Assert.*;

public class ElgPlatformCarrierMapTest {

    private ElgPlatformCarrierMap elgPlatformCarrierMap;

    @Before
    public void setUp() throws Exception {
        this.elgPlatformCarrierMap = new ElgPlatformCarrierMap();
    }

    @After
    public void tearDown() throws Exception {
        this.elgPlatformCarrierMap = null;
    }

    @Test
    public void setPlatformId() throws Exception {
        String expected = "foobar";
        this.elgPlatformCarrierMap.setPlatformId(expected);

        assertEquals(expected, this.elgPlatformCarrierMap.getPlatformId());
    }

    @Test
    public void setCarrierId() throws Exception {
        String expected = "foobar";
        this.elgPlatformCarrierMap.setCarrierId(expected);

        assertEquals(expected, this.elgPlatformCarrierMap.getCarrierId());
    }

    @Test
    public void setAddUserName() throws Exception {
        String expected = "foobar";
        this.elgPlatformCarrierMap.setAddUserName(expected);

        assertEquals(expected, this.elgPlatformCarrierMap.getAddUserName());
    }

    @Test
    public void setAddDate() throws Exception {
        Date expected = new Date(1234);
        this.elgPlatformCarrierMap.setAddDate(expected);

        assertEquals(expected, this.elgPlatformCarrierMap.getAddDate());
    }

    @Test
    public void setAddTime() throws Exception {
        Time expected = new Time(1234);
        this.elgPlatformCarrierMap.setAddTime(expected);

        assertEquals(expected, this.elgPlatformCarrierMap.getAddTime());
    }

    @Test
    public void setAddProgramName() throws Exception {
        String expected = "foobar";
        this.elgPlatformCarrierMap.setAddProgramName(expected);

        assertEquals(expected, this.elgPlatformCarrierMap.getAddProgramName());
    }

    @Test
    public void setChgUserName() throws Exception {
        String expected = "foobar";
        this.elgPlatformCarrierMap.setChgUserName(expected);

        assertEquals(expected, this.elgPlatformCarrierMap.getChgUserName());
    }

    @Test
    public void setChgDate() throws Exception {
        Date expected = new Date(1234);
        this.elgPlatformCarrierMap.setChgDate(expected);

        assertEquals(expected, this.elgPlatformCarrierMap.getChgDate());
    }

    @Test
    public void setChgTime() throws Exception {
        Time expected = new Time(1234);
        this.elgPlatformCarrierMap.setChgTime(expected);

        assertEquals(expected, this.elgPlatformCarrierMap.getChgTime());
    }

    @Test
    public void setChgProgramName() throws Exception {
        String expected = "foobar";
        this.elgPlatformCarrierMap.setChgProgramName(expected);

        assertEquals(expected, this.elgPlatformCarrierMap.getChgProgramName());
    }

}