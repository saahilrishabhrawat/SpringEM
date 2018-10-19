package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElgEligMemberDefaultsOvrEmhPKTest {

    private ElgEligMemberDefaultsOvrEmhPK elgEligMemberDefaultsOvrEmhPK;

    @Before
    public void setUp() throws Exception {
        this.elgEligMemberDefaultsOvrEmhPK = new ElgEligMemberDefaultsOvrEmhPK();
    }

    @After
    public void tearDown() throws Exception {
        this.elgEligMemberDefaultsOvrEmhPK = null;
    }

    @Test
    public void setCarCarrierId() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmhPK.setCarCarrierId(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmhPK.getCarCarrierId());
    }

    @Test
    public void setAccountId() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmhPK.setAccountId(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmhPK.getAccountId());
    }

    @Test
    public void setGroupId() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsOvrEmhPK.setGroupId(expected);

        assertEquals(expected, this.elgEligMemberDefaultsOvrEmhPK.getGroupId());
    }

}