package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElgGldGroupListDetailPKTest {

    private ElgGldGroupListDetailPK elgGldGroupListDetailPK;

    @Before
    public void setUp() throws Exception {
        this.elgGldGroupListDetailPK = new ElgGldGroupListDetailPK();
    }

    @After
    public void tearDown() throws Exception {
        this.elgGldGroupListDetailPK = null;
    }

    @Test
    public void setGrlGroupListName() throws Exception {
        String expected = "foobar";
        this.elgGldGroupListDetailPK.setGrlGroupListName(expected);

        assertEquals(expected, this.elgGldGroupListDetailPK.getGrlGroupListName());
    }

    @Test
    public void setCarCarrierId() throws Exception {
        String expected = "foobar";
        this.elgGldGroupListDetailPK.setCarCarrierId(expected);

        assertEquals(expected, this.elgGldGroupListDetailPK.getCarCarrierId());
    }

    @Test
    public void setAccAccountId() throws Exception {
        String expected = "foobar";
        this.elgGldGroupListDetailPK.setAccAccountId(expected);

        assertEquals(expected, this.elgGldGroupListDetailPK.getAccAccountId());
    }

    @Test
    public void setGrpGroupId() throws Exception {
        String expected = "foobar";
        this.elgGldGroupListDetailPK.setGrpGroupId(expected);

        assertEquals(expected, this.elgGldGroupListDetailPK.getGrpGroupId());
    }

}