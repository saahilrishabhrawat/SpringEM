package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElgEligProfileEpfPKTest {

    private ElgEligProfileEpfPK elgEligProfileEpfPK;

    @Before
    public void setUp() throws Exception {
        this.elgEligProfileEpfPK = new ElgEligProfileEpfPK();
    }

    @After
    public void tearDown() throws Exception {
        this.elgEligProfileEpfPK = null;
    }

    @Test
    public void setCarCarrierId() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpfPK.setCarCarrierId(expected);

        assertEquals(expected, this.elgEligProfileEpfPK.getCarCarrierId());
    }

    @Test
    public void setAccountId() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpfPK.setAccountId(expected);

        assertEquals(expected, this.elgEligProfileEpfPK.getAccountId());
    }

    @Test
    public void setGroupId() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpfPK.setGroupId(expected);

        assertEquals(expected, this.elgEligProfileEpfPK.getGroupId());
    }

}