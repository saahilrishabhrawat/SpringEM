package com.optum.ibm.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.*;

public class SysschemasTest {

    private Sysschemas sysschemas;

    @Before
    public void setUp() throws Exception {
        this.sysschemas = new Sysschemas();
    }

    @After
    public void tearDown() throws Exception {
        this.sysschemas = null;
    }

    @Test
    public void setSchemaName() throws Exception {
        String expected = "foobar";
        this.sysschemas.setSchemaName(expected);

        assertEquals(expected, this.sysschemas.getSchemaName());
    }

    @Test
    public void setSchemaOwner() throws Exception {
        String expected = "foobar";
        this.sysschemas.setSchemaOwner(expected);

        assertEquals(expected, this.sysschemas.getSchemaOwner());
    }

    @Test
    public void setSchemaCreator() throws Exception {
        String expected = "foobar";
        this.sysschemas.setSchemaCreator(expected);

        assertEquals(expected, this.sysschemas.getSchemaCreator());
    }

    @Test
    public void setCreationTimestamp() throws Exception {
        Timestamp expected = new Timestamp(763983980000L);
        this.sysschemas.setCreationTimestamp(expected);

        assertEquals(expected, this.sysschemas.getCreationTimestamp());
    }

    @Test
    public void setSchemaSize() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.sysschemas.setSchemaSize(expected);

        assertEquals(expected, this.sysschemas.getSchemaSize());
    }

    @Test
    public void setSchemaText() throws Exception {
        String expected = "foobar";
        this.sysschemas.setSchemaText(expected);

        assertEquals(expected, this.sysschemas.getSchemaText());
    }

    @Test
    public void setSystemSchemaName() throws Exception {
        String expected = "foobar";
        this.sysschemas.setSystemSchemaName(expected);

        assertEquals(expected, this.sysschemas.getSystemSchemaName());
    }

    @Test
    public void setIaspNumber() throws Exception {
        Short expected = Short.MAX_VALUE;
        this.sysschemas.setIaspNumber(expected);

        assertEquals(expected, this.sysschemas.getIaspNumber());
    }

}