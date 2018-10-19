package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElgEodEligOverrideDfltsPKTest {

    private ElgEodEligOverrideDfltsPK elgEodEligOverrideDfltsPK;

    @Before
    public void setUp() throws Exception {
        this.elgEodEligOverrideDfltsPK = new ElgEodEligOverrideDfltsPK();
    }

    @After
    public void tearDown() throws Exception {
        this.elgEodEligOverrideDfltsPK = null;
    }

    @Test
    public void setCarCarrierId() {
        String expected = "foobar";
        this.elgEodEligOverrideDfltsPK.setCarCarrierId(expected);

        assertEquals(expected, this.elgEodEligOverrideDfltsPK.getCarCarrierId());
    }

    @Test
    public void setAccountId() {
        String expected = "foobar";
        this.elgEodEligOverrideDfltsPK.setAccountId(expected);

        assertEquals(expected, this.elgEodEligOverrideDfltsPK.getAccountId());
    }

    @Test
    public void setGroupId() {
        String expected = "foobar";
        this.elgEodEligOverrideDfltsPK.setGroupId(expected);

        assertEquals(expected, this.elgEodEligOverrideDfltsPK.getGroupId());
    }
}