package com.optum.ibm.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SystablesPKTest {

    private SystablesPK systablesPK;

    @Before
    public void setUp() throws Exception {
        this.systablesPK = new SystablesPK();
    }

    @After
    public void tearDown() throws Exception {
        this.systablesPK = null;
    }

    @Test
    public void setTableName() throws Exception {
        String expected = "foobar";
        this.systablesPK.setTableName(expected);

        assertEquals(expected, this.systablesPK.getTableName());
    }

    @Test
    public void setTableSchema() throws Exception {
        String expected = "foobar";
        this.systablesPK.setTableSchema(expected);

        assertEquals(expected, this.systablesPK.getTableSchema());
    }

}