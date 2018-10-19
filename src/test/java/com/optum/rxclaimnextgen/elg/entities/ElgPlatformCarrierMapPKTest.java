package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElgPlatformCarrierMapPKTest {

    private ElgPlatformCarrierMapPK elgPlatformCarrierMapPK;

    @Before
    public void setUp() throws Exception {
        this.elgPlatformCarrierMapPK = new ElgPlatformCarrierMapPK();
    }

    @After
    public void tearDown() throws Exception {
        this.elgPlatformCarrierMapPK = null;
    }

    @Test
    public void setPlatformId() throws Exception {
        String expected = "foobar";
        this.elgPlatformCarrierMapPK.setPlatformId(expected);

        assertEquals(expected, this.elgPlatformCarrierMapPK.getPlatformId());
    }

    @Test
    public void setCarrierId() throws Exception {
        String expected = "foobar";
        this.elgPlatformCarrierMapPK.setCarrierId(expected);

        assertEquals(expected, this.elgPlatformCarrierMapPK.getCarrierId());
    }

}