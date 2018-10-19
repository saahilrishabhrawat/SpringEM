package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElgEligMemberDefaultsEmdPKTest {

    private ElgEligMemberDefaultsEmdPK elgEligMemberDefaultsEmdPK;

    @Before
    public void setUp() {
        this.elgEligMemberDefaultsEmdPK = new ElgEligMemberDefaultsEmdPK();
    }

    @After
    public void tearDown() {
        this.elgEligMemberDefaultsEmdPK = null;
    }

    @Test
    public void setCarCarrierId() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmdPK.setCarCarrierId(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmdPK.getCarCarrierId());
    }

    @Test
    public void setAccountId() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmdPK.setAccountId(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmdPK.getAccountId());
    }

    @Test
    public void setGroupId() throws Exception {
        String expected = "foobar";
        this.elgEligMemberDefaultsEmdPK.setGroupId(expected);

        assertEquals(expected, this.elgEligMemberDefaultsEmdPK.getGroupId());
    }

}