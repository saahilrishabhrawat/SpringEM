package com.optum.rxclaimnextgen.elg.pojo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EligProfileViewTest {

    private EligProfileView eligProfileView;

    @Before
    public void setUp() throws Exception {
        this.eligProfileView = new EligProfileView();
    }

    @After
    public void tearDown() throws Exception {
        this.eligProfileView = null;
    }

    @Test
    public void setPlatformId() throws Exception {
        String expected = "foobar";
        this.eligProfileView.setPlatformId(expected);

        assertEquals(expected, this.eligProfileView.getPlatformId());
    }

    @Test
    public void setCarCarrierId() throws Exception {
        String expected = "foobar";
        this.eligProfileView.setCarCarrierId(expected);

        assertEquals(expected, this.eligProfileView.getCarCarrierId());
    }

    @Test
    public void setAccountId() throws Exception {
        String expected = "foobar";
        this.eligProfileView.setAccountId(expected);

        assertEquals(expected, this.eligProfileView.getAccountId());
    }

    @Test
    public void setGroupId() throws Exception {
        String expected = "foobar";
        this.eligProfileView.setGroupId(expected);

        assertEquals(expected, this.eligProfileView.getGroupId());
    }

    @Test
    public void setLastLoad() throws Exception {
        String expected = "foobar";
        this.eligProfileView.setLastLoad(expected);

        assertEquals(expected, this.eligProfileView.getLastLoad());
    }

    @Test
    public void setCount() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.eligProfileView.setCount(expected);

        assertEquals(expected, this.eligProfileView.getCount());
    }

    @Test
    public void setIdentifier() throws Exception {
        String expected = "foobar";
        this.eligProfileView.setIdentifier(expected);

        assertEquals(expected, this.eligProfileView.getIdentifier());
    }

    @Test
    public void setVersion() throws Exception {
        String expected = "foobar";
        this.eligProfileView.setVersion(expected);

        assertEquals(expected, this.eligProfileView.getVersion());
    }

    @Test
    public void setReformat() throws Exception {
        String expected = "foobar";
        this.eligProfileView.setReformat(expected);

        assertEquals(expected, this.eligProfileView.getReformat());
    }

    @Test
    public void setLoad() throws Exception {
        String expected = "foobar";
        this.eligProfileView.setLoad(expected);

        assertEquals(expected, this.eligProfileView.getLoad());
    }

    @Test
    public void setEpfStatus() throws Exception {
        String expected = "A";
        this.eligProfileView.setEpfStatus(expected);

        assertEquals(expected, this.eligProfileView.getEpfStatus());
    }

}