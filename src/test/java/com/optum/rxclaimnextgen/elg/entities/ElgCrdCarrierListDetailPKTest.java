package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElgCrdCarrierListDetailPKTest {

    private ElgCrdCarrierListDetailPK elgCrdCarrierListDetailPK;

    @Before
    public void setUp() {
        elgCrdCarrierListDetailPK = new ElgCrdCarrierListDetailPK();
    }

    @After
    public void tearDown() {
        elgCrdCarrierListDetailPK = null;
    }

    @Test
    public void setCrlCarrierListName() throws Exception {
        String expected = "foobar";
        this.elgCrdCarrierListDetailPK.setCrlCarrierListName(expected);

        assertEquals(expected, this.elgCrdCarrierListDetailPK.getCrlCarrierListName());
    }

    @Test
    public void setCarCarrierId() throws Exception {
        String expected = "foobar";
        this.elgCrdCarrierListDetailPK.setCarCarrierId(expected);

        assertEquals(expected, this.elgCrdCarrierListDetailPK.getCarCarrierId());
    }

}