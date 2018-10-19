package com.optum.rxclaimnextgen.elg.pojo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EligProfileDetailFormTest {

    private EligProfileDetailForm eligProfileDetailForm;

    @Before
    public void setUp() throws Exception {
        this.eligProfileDetailForm = new EligProfileDetailForm();
    }

    @After
    public void tearDown() throws Exception {
        this.eligProfileDetailForm = null;
    }

    @Test
    public void setCarCarrierId() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setCarCarrierId(expected);

        assertEquals(expected, this.eligProfileDetailForm.getCarCarrierId());
    }

    @Test
    public void setPlatformId() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setPlatformId(expected);

        assertEquals(expected, this.eligProfileDetailForm.getPlatformId());
    }

    @Test
    public void setAccountId() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setAccountId(expected);

        assertEquals(expected, this.eligProfileDetailForm.getAccountId());
    }

    @Test
    public void setGroupId() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setGroupId(expected);

        assertEquals(expected, this.eligProfileDetailForm.getGroupId());
    }

    @Test
    public void setEpfReformatVersion() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfReformatVersion(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfReformatVersion());
    }

    @Test
    public void setEpfLoadIdentifier() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfLoadIdentifier(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfLoadIdentifier());
    }

    @Test
    public void setEpfReformatPgm() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfReformatPgm(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfReformatPgm());
    }

    @Test
    public void setEpfLibraryName() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfLibraryName(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfLibraryName());
    }

    @Test
    public void setEpfGrpFileName() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfGrpFileName(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfGrpFileName());
    }

    @Test
    public void setEpfStatus() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfStatus(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfStatus());
    }

    @Test
    public void setEpfStageGroupsInd() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfStageGroupsInd(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfStageGroupsInd());
    }

    @Test
    public void setEpfLoadType() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfLoadType(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfLoadType());
    }

    @Test
    public void setEpfMbrFileName() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfMbrFileName(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfMbrFileName());
    }

    @Test
    public void setEpfMbrMediaRecordLen() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfMbrMediaRecordLen(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfMbrMediaRecordLen());
    }

    @Test
    public void setEpfRejection() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfRejection(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfRejection());
    }

    @Test
    public void setEpfTermThresholdTba() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfTermThresholdTba(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfTermThresholdTba());
    }

    @Test
    public void setEpfTermDaysQualifier() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfTermDaysQualifier(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfTermDaysQualifier());
    }

    @Test
    public void setEpfTermNbrOfDays() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfTermNbrOfDays(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfTermNbrOfDays());
    }

    @Test
    public void setEpfGroupLoadType() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfGroupLoadType(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfGroupLoadType());
    }

    @Test
    public void setEpfGrpMediaRecordLen() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfGrpMediaRecordLen(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfGrpMediaRecordLen());
    }

    @Test
    public void setEpfGroupRefreshRej() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfGroupRefreshRej(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfGroupRefreshRej());
    }

    @Test
    public void setEpfTermedMembersRpt() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfTermedMembersRpt(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfTermedMembersRpt());
    }

    @Test
    public void setEpfTermCareAssignment() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfTermCareAssignment(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfTermCareAssignment());
    }

    @Test
    public void setEpfSuspendProcessing() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfSuspendProcessing(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfSuspendProcessing());
    }

    @Test
    public void setEpfRejectionLookup() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfRejectionLookup(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfRejectionLookup());
    }

    @Test
    public void setEpfPrintMbrGrpErrors() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfPrintMbrGrpErrors(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfPrintMbrGrpErrors());
    }

    @Test
    public void setEpfPostProcessProgram() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfPostProcessProgram(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfPostProcessProgram());
    }

    @Test
    public void setEpfGroupListName() throws Exception {
        String expected = "foobar";
        this.eligProfileDetailForm.setEpfGroupListName(expected);

        assertEquals(expected, this.eligProfileDetailForm.getEpfGroupListName());
    }

}