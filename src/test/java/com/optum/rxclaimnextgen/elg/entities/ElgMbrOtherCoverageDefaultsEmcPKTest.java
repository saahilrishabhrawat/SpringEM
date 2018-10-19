package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElgMbrOtherCoverageDefaultsEmcPKTest {

    private ElgMbrOtherCoverageDefaultsEmcPK elgMbrOtherCoverageDefaultsEmcPK;

    @Before
    public void setUp() throws Exception {
        this.elgMbrOtherCoverageDefaultsEmcPK = new ElgMbrOtherCoverageDefaultsEmcPK();
    }

    @After
    public void tearDown() throws Exception {
        this.elgMbrOtherCoverageDefaultsEmcPK = null;
    }

    @Test
    public void setCarCarrierId() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmcPK.setCarCarrierId(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmcPK.getCarCarrierId());
    }

    @Test
    public void setAccountId() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmcPK.setAccountId(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmcPK.getAccountId());
    }

    @Test
    public void setGroupId() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmcPK.setGroupId(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmcPK.getGroupId());
    }
}