package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElgAldAccountListDetailPKTest {

    private ElgAldAccountListDetailPK elgAldAccountListDetailPK;

    @Before
    public void setUp() {
        elgAldAccountListDetailPK = new ElgAldAccountListDetailPK();
    }

    @After
    public void tearDown() {
        elgAldAccountListDetailPK = null;
    }

    @Test
    public void setAclAccountListName() throws Exception {
        String expected = "foobar";
        this.elgAldAccountListDetailPK.setAclAccountListName(expected);

        assertEquals(expected, this.elgAldAccountListDetailPK.getAclAccountListName());
    }

    @Test
    public void setCarCarrierId() throws Exception {
        String expected = "foobar";
        this.elgAldAccountListDetailPK.setCarCarrierId(expected);

        assertEquals(expected, this.elgAldAccountListDetailPK.getCarCarrierId());
    }

    @Test
    public void setAccAccountId() throws Exception {
        String expected = "foobar";
        this.elgAldAccountListDetailPK.setAccAccountId(expected);

        assertEquals(expected, this.elgAldAccountListDetailPK.getAccAccountId());
    }

}