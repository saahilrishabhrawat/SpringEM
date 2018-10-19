package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElgGroupGrpPKTest {

    private ElgGroupGrpPK elgGroupGrpPK;

    @Before
    public void setUp() throws Exception {
        this.elgGroupGrpPK = new ElgGroupGrpPK();
    }

    @After
    public void tearDown() throws Exception {
        this.elgGroupGrpPK = null;
    }

    @Test
    public void setCarCarrierId() {
        String expected = "foobar";
        this.elgGroupGrpPK.setCarCarrierId(expected);

        assertEquals(expected, this.elgGroupGrpPK.getCarCarrierId());
    }

    @Test
    public void setAccAccountId() {
        String expected = "foobar";
        this.elgGroupGrpPK.setAccAccountId(expected);

        assertEquals(expected, this.elgGroupGrpPK.getAccAccountId());
    }

    @Test
    public void setGrpGroupId() {
        String expected = "foobar";
        this.elgGroupGrpPK.setGrpGroupId(expected);

        assertEquals(expected, this.elgGroupGrpPK.getGrpGroupId());
    }
}