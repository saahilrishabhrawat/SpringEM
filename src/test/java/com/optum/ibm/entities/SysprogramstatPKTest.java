package com.optum.ibm.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SysprogramstatPKTest {

    private SysprogramstatPK sysprogramstatPK;

    @Before
    public void setUp() throws Exception {
        this.sysprogramstatPK = new SysprogramstatPK();
    }

    @After
    public void tearDown() throws Exception {
        this.sysprogramstatPK = null;
    }

    @Test
    public void setProgramSchema() throws Exception {
        String expected = "foobar";
        this.sysprogramstatPK.setProgramSchema(expected);

        assertEquals(expected, this.sysprogramstatPK.getProgramSchema());
    }

    @Test
    public void setProgramName() throws Exception {
        String expected = "foobar";
        this.sysprogramstatPK.setProgramName(expected);

        assertEquals(expected, this.sysprogramstatPK.getProgramName());
    }

    @Test
    public void setProgramType() throws Exception {
        String expected = "foobar";
        this.sysprogramstatPK.setProgramType(expected);

        assertEquals(expected, this.sysprogramstatPK.getProgramType());
    }

}