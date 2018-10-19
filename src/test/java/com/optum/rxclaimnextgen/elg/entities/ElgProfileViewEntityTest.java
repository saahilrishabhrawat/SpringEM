package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class ElgProfileViewEntityTest {

    private ElgProfileViewEntity elgProfileViewEntity;

    @Before
    public void setUp() throws Exception {
        this.elgProfileViewEntity = new ElgProfileViewEntity();
    }

    @After
    public void tearDown() throws Exception {
        this.elgProfileViewEntity = null;
    }

    @Test
    public void setEpfLoadIdentifier() throws Exception {
        String expected = "foobar";
        this.elgProfileViewEntity.setEpfLoadIdentifier(expected);

        assertEquals(expected, this.elgProfileViewEntity.getEpfLoadIdentifier());
    }

    @Test
    public void setPlatformId() throws Exception {
        String expected = "foobar";
        this.elgProfileViewEntity.setPlatformId(expected);

        assertEquals(expected, this.elgProfileViewEntity.getPlatformId());
    }

    @Test
    public void setCarCarrierId() throws Exception {
        String expected = "foobar";
        this.elgProfileViewEntity.setCarCarrierId(expected);

        assertEquals(expected, this.elgProfileViewEntity.getCarCarrierId());
    }

    @Test
    public void setAccountId() throws Exception {
        String expected = "foobar";
        this.elgProfileViewEntity.setAccountId(expected);

        assertEquals(expected, this.elgProfileViewEntity.getAccountId());
    }

    @Test
    public void setGroupId() throws Exception {
        String expected = "foobar";
        this.elgProfileViewEntity.setGroupId(expected);

        assertEquals(expected, this.elgProfileViewEntity.getGroupId());
    }

    @Test
    public void setEpfCurrentLoadDate() throws Exception {
        Date expected = new Date(1234);
        this.elgProfileViewEntity.setEpfCurrentLoadDate(expected);

        assertEquals(expected, this.elgProfileViewEntity.getEpfCurrentLoadDate());
    }

    @Test
    public void setEpfCurrentLoaded() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgProfileViewEntity.setEpfCurrentLoaded(expected);

        assertEquals(expected, this.elgProfileViewEntity.getEpfCurrentLoaded());
    }

    @Test
    public void setEpfReformatVersion() throws Exception {
        String expected = "foobar";
        this.elgProfileViewEntity.setEpfReformatVersion(expected);

        assertEquals(expected, this.elgProfileViewEntity.getEpfReformatVersion());
    }

    @Test
    public void setEpfReformatPgm() throws Exception {
        String expected = "foobar";
        this.elgProfileViewEntity.setEpfReformatPgm(expected);

        assertEquals(expected, this.elgProfileViewEntity.getEpfReformatPgm());
    }

    @Test
    public void setEpfLoadType() throws Exception {
        String expected = "foobar";
        this.elgProfileViewEntity.setEpfLoadType(expected);

        assertEquals(expected, this.elgProfileViewEntity.getEpfLoadType());
    }

    @Test
    public void setEpfStatus() throws Exception{
        String expected = "A";
        this.elgProfileViewEntity.setEpfStatus(expected);

        assertEquals(expected, this.elgProfileViewEntity.getEpfStatus());
    }
}