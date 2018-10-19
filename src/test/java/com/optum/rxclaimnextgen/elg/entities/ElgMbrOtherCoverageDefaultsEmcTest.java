package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.sql.Time;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;

public class ElgMbrOtherCoverageDefaultsEmcTest {

    ElgMbrOtherCoverageDefaultsEmc elgMbrOtherCoverageDefaultsEmc;

    @Before
    public void setUp() throws Exception {
        this.elgMbrOtherCoverageDefaultsEmc = new ElgMbrOtherCoverageDefaultsEmc();
    }

    @After
    public void tearDown() throws Exception {
        this.elgMbrOtherCoverageDefaultsEmc = null;
    }

    @Test
    public void setCarCarrierId() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setCarCarrierId(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getCarCarrierId());
    }

    @Test
    public void setAccountId() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setAccountId(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getAccountId());
    }

    @Test
    public void setGroupId() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setGroupId(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getGroupId());
    }

    @Test
    public void setEmcBinInd() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcBinInd(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcBinInd());
    }

    @Test
    public void setEmcBin() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcBin(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcBin());
    }

    @Test
    public void setEmcPcnInd() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcPcnInd(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcPcnInd());
    }

    @Test
    public void setEmcPcn() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcPcn(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcPcn());
    }

    @Test
    public void setEmcSbmGroupInd() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcSbmGroupInd(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcSbmGroupInd());
    }

    @Test
    public void setEmcSbmGroup() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcSbmGroup(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcSbmGroup());
    }

    @Test
    public void setEmcHelpDeskPhoneInd() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcHelpDeskPhoneInd(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcHelpDeskPhoneInd());
    }

    @Test
    public void setEmcHelpDeskPhone() {
        int expected = Integer.MAX_VALUE;
        this.elgMbrOtherCoverageDefaultsEmc.setEmcHelpDeskPhone(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcHelpDeskPhone());
    }

    @Test
    public void setEmcSupplementaltypcdInd() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcSupplementaltypcdInd(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcSupplementaltypcdInd());
    }

    @Test
    public void setEmcSupplementaltypcd() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcSupplementaltypcd(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcSupplementaltypcd());
    }

    @Test
    public void setEmcSupplementaltypcdRep() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcSupplementaltypcdRep(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcSupplementaltypcdRep());
    }

    @Test
    public void setEmcCoverageIdInd() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcCoverageIdInd(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcCoverageIdInd());
    }

    @Test
    public void setEmcCoverageId() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcCoverageId(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcCoverageId());
    }

    @Test
    public void setEmcMemberIdInd() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcMemberIdInd(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcMemberIdInd());
    }

    @Test
    public void setEmcMemberId() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcMemberId(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcMemberId());
    }

    @Test
    public void setEmcPersonCodeInd() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcPersonCodeInd(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcPersonCodeInd());
    }

    @Test
    public void setEmcPersonCode() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcPersonCode(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcPersonCode());
    }

    @Test
    public void setEmcCoverageCategoryInd() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcCoverageCategoryInd(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcCoverageCategoryInd());
    }

    @Test
    public void setEmcCoverageCategory() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcCoverageCategory(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcCoverageCategory());
    }

    @Test
    public void setEmcFromDateInd() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcFromDateInd(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcFromDateInd());
    }

    @Test
    public void setEmcFromDateReproInd() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcFromDateReproInd(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcFromDateReproInd());
    }

    @Test
    public void setEmcThruDateInd() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcThruDateInd(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcThruDateInd());
    }

    @Test
    public void setEmcThruDateReproInd() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcThruDateReproInd(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcThruDateReproInd());
    }

    @Test
    public void setEmcMmcLock() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcMmcLock(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcMmcLock());
    }

    @Test
    public void setEmcRemoveReproFlag() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcRemoveReproFlag(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcRemoveReproFlag());
    }

    @Test
    public void setEmcBinRepro() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcBinRepro(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcBinRepro());
    }

    @Test
    public void setEmcPcnRepro() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcPcnRepro(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcPcnRepro());
    }

    @Test
    public void setEmcSbmGroupRepro() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcSbmGroupRepro(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcSbmGroupRepro());
    }

    @Test
    public void setEmcMemberIdRepro() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setEmcMemberIdRepro(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getEmcMemberIdRepro());
    }

    @Test
    public void setAddUserName() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setAddUserName(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getAddUserName());
    }

    @Test
    public void setAddDate() {
        Date expected = new Date(1234);
        this.elgMbrOtherCoverageDefaultsEmc.setAddDate(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getAddDate());
}

    @Test
    public void setAddTime() {
        Time expected = new Time(1234);
        this.elgMbrOtherCoverageDefaultsEmc.setAddTime(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getAddTime());
    }

    @Test
    public void setAddProgramName() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setAddProgramName(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getAddProgramName());
    }

    @Test
    public void setChgUserName() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setChgUserName(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getChgUserName());
    }

    @Test
    public void setChgDate() {
        Date expected = new Date(1234);
        this.elgMbrOtherCoverageDefaultsEmc.setChgDate(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getChgDate());
    }

    @Test
    public void setChgTime() {
        Time expected = new Time(1234);
        this.elgMbrOtherCoverageDefaultsEmc.setChgTime(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getChgTime());
    }

    @Test
    public void setChgProgramName() {
        String expected = "foobar";
        this.elgMbrOtherCoverageDefaultsEmc.setChgProgramName(expected);

        assertEquals(expected, this.elgMbrOtherCoverageDefaultsEmc.getChgProgramName());
    }
}