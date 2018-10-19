package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElgEqdEligQueueDefaultsPKTest {

    private ElgEqdEligQueueDefaultsPK elgEqdEligQueueDefaultsPK;

    @Before
    public void setUp() throws Exception {
        this.elgEqdEligQueueDefaultsPK = new ElgEqdEligQueueDefaultsPK();
    }

    @After
    public void tearDown() throws Exception {
        this.elgEqdEligQueueDefaultsPK = null;
    }

    @Test
    public void setCarCarrierId() {
        String expected = "foobar";
        this.elgEqdEligQueueDefaultsPK.setCarCarrierId(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaultsPK.getCarCarrierId());
    }

    @Test
    public void setEqdAccountId() {
        String expected = "foobar";
        this.elgEqdEligQueueDefaultsPK.setEqdAccountId(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaultsPK.getEqdAccountId());
    }

    @Test
    public void setEqdGroupId() {
        String expected = "foobar";
        this.elgEqdEligQueueDefaultsPK.setEqdGroupId(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaultsPK.getEqdGroupId());
    }

    @Test
    public void setEqdReportName() {
        String expected = "foobar";
        this.elgEqdEligQueueDefaultsPK.setEqdReportName(expected);

        assertEquals(expected, this.elgEqdEligQueueDefaultsPK.getEqdReportName());
    }
}