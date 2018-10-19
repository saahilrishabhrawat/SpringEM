package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElgMemberPartdDefaultsEmpPKTest {

    private ElgMemberPartdDefaultsEmpPK elgMemberPartdDefaultsEmpPK;

    @Before
    public void setUp() throws Exception {
        this.elgMemberPartdDefaultsEmpPK = new ElgMemberPartdDefaultsEmpPK();
    }

    @After
    public void tearDown() throws Exception {
        this.elgMemberPartdDefaultsEmpPK = null;
    }

    @Test
    public void setCarCarrierId() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmpPK.setCarCarrierId(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmpPK.getCarCarrierId());
    }

    @Test
    public void setAccountId() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmpPK.setAccountId(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmpPK.getAccountId());
    }

    @Test
    public void setGroupId() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmpPK.setGroupId(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmpPK.getGroupId());
    }

}