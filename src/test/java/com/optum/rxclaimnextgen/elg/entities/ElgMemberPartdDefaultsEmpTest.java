package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.sql.Time;

import static org.junit.Assert.*;

public class ElgMemberPartdDefaultsEmpTest {

    private ElgMemberPartdDefaultsEmp elgMemberPartdDefaultsEmp;

    @Before
    public void setUp() throws Exception {
        this.elgMemberPartdDefaultsEmp = new ElgMemberPartdDefaultsEmp();
    }

    @After
    public void tearDown() throws Exception {
        this.elgMemberPartdDefaultsEmp = null;
    }

    @Test
    public void setCarCarrierId() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setCarCarrierId(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getCarCarrierId());
    }

    @Test
    public void setAccountId() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setAccountId(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getAccountId());
    }

    @Test
    public void setGroupId() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setGroupId(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getGroupId());
    }

    @Test
    public void setEmpContractNumberInd() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpContractNumberInd(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpContractNumberInd());
    }

    @Test
    public void setEmpContractNumber() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpContractNumber(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpContractNumber());
    }

    @Test
    public void setEmpContractNumberRepr() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpContractNumberRepr(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpContractNumberRepr());
    }

    @Test
    public void setEmpPbpInd() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpPbpInd(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpPbpInd());
    }

    @Test
    public void setEmpPbp() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpPbp(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpPbp());
    }

    @Test
    public void setEmpPbpRepr() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpPbpRepr(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpPbpRepr());
    }

    @Test
    public void setEmpSegmentInd() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpSegmentInd(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpSegmentInd());
    }

    @Test
    public void setEmpSegment() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpSegment(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpSegment());
    }

    @Test
    public void setEmpSubsidyLevelInd() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpSubsidyLevelInd(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpSubsidyLevelInd());
    }

    @Test
    public void setEmpSubsidyLevel() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpSubsidyLevel(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpSubsidyLevel());
    }

    @Test
    public void setEmpCopayCategoryInd() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpCopayCategoryInd(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpCopayCategoryInd());
    }

    @Test
    public void setEmpCopayCategory() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpCopayCategory(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpCopayCategory());
    }

    @Test
    public void setEmpCopayCategoryRepr() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpCopayCategoryRepr(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpCopayCategoryRepr());
    }

    @Test
    public void setEmpCcategoryEffDteInd() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpCcategoryEffDteInd(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpCcategoryEffDteInd());
    }

    @Test
    public void setEmpCcategoryEffDate() throws Exception {
        Date expected = new Date(1234);
        this.elgMemberPartdDefaultsEmp.setEmpCcategoryEffDate(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpCcategoryEffDate());
    }

    @Test
    public void setEmpCcategoryEffDteRep() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpCcategoryEffDteRep(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpCcategoryEffDteRep());
    }

    @Test
    public void setEmpEnrollmentSourceInd() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpEnrollmentSourceInd(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpEnrollmentSourceInd());
    }

    @Test
    public void setEmpEnrollmentSource() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpEnrollmentSource(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpEnrollmentSource());
    }

    @Test
    public void setEmpPlanCodeRepr() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpPlanCodeRepr(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpPlanCodeRepr());
    }

    @Test
    public void setEmpMsiMedicareHicInd() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpMsiMedicareHicInd(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpMsiMedicareHicInd());
    }

    @Test
    public void setEmpContractPbpValidlvl() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpContractPbpValidlvl(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpContractPbpValidlvl());
    }

    @Test
    public void setEmpMmdLock() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpMmdLock(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpMmdLock());
    }

    @Test
    public void setEmpGroupRepr() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setEmpGroupRepr(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getEmpGroupRepr());
    }

    @Test
    public void setAddUserName() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setAddUserName(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getAddUserName());
    }

    @Test
    public void setAddDate() throws Exception {
        Date expected = new Date(1234);
        this.elgMemberPartdDefaultsEmp.setAddDate(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getAddDate());
    }

    @Test
    public void setAddTime() throws Exception {
        Time expected = new Time(1234);
        this.elgMemberPartdDefaultsEmp.setAddTime(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getAddTime());
    }

    @Test
    public void setAddProgramName() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setAddProgramName(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getAddProgramName());
    }

    @Test
    public void setChgUserName() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setChgUserName(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getChgUserName());
    }

    @Test
    public void setChgDate() throws Exception {
        Date expected = new Date(1234);
        this.elgMemberPartdDefaultsEmp.setChgDate(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getChgDate());
    }

    @Test
    public void setChgTime() throws Exception {
        Time expected = new Time(1234);
        this.elgMemberPartdDefaultsEmp.setChgTime(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getChgTime());
    }

    @Test
    public void setChgProgramName() throws Exception {
        String expected = "foobar";
        this.elgMemberPartdDefaultsEmp.setChgProgramName(expected);

        assertEquals(expected, this.elgMemberPartdDefaultsEmp.getChgProgramName());
    }

}