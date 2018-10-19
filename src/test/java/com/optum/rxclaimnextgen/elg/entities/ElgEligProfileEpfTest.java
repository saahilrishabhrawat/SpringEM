package com.optum.rxclaimnextgen.elg.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.sql.Time;

import static org.junit.Assert.*;

public class ElgEligProfileEpfTest {

    private ElgEligProfileEpf elgEligProfileEpf;

    @Before
    public void setUp() throws Exception {
        this.elgEligProfileEpf = new ElgEligProfileEpf();
    }

    @After
    public void tearDown() throws Exception {
        this.elgEligProfileEpf = null;
    }

    @Test
    public void setCarCarrierId() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setCarCarrierId(expected);

        assertEquals(expected, this.elgEligProfileEpf.getCarCarrierId());
    }

    @Test
    public void setAccountId() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setAccountId(expected);

        assertEquals(expected, this.elgEligProfileEpf.getAccountId());
    }

    @Test
    public void setGroupId() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setGroupId(expected);

        assertEquals(expected, this.elgEligProfileEpf.getGroupId());
    }

    @Test
    public void setEpfLoadIdentifier() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfLoadIdentifier(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfLoadIdentifier());
    }

    @Test
    public void setEpfLibraryName() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfLibraryName(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfLibraryName());
    }

    @Test
    public void setEpfStageGroupsInd() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfStageGroupsInd(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfStageGroupsInd());
    }

    @Test
    public void setEpfLoadType() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfLoadType(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfLoadType());
    }

    @Test
    public void setEpfGroupLoadType() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfGroupLoadType(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfGroupLoadType());
    }

    @Test
    public void setEpfReformatPgm() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfReformatPgm(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfReformatPgm());
    }

    @Test
    public void setEpfPostProcessProgram() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfPostProcessProgram(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfPostProcessProgram());
    }

    @Test
    public void setEpfRejection() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfRejection(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfRejection());
    }

    @Test
    public void setEpfGroupRefreshRej() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfGroupRefreshRej(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfGroupRefreshRej());
    }

    @Test
    public void setEpfMediaFrequency() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfMediaFrequency(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfMediaFrequency());
    }

    @Test
    public void setEpfMediaType() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfMediaType(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfMediaType());
    }

    @Test
    public void setEpfTapeCharacterCode() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfTapeCharacterCode(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfTapeCharacterCode());
    }

    @Test
    public void setEpfDeviceName() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfDeviceName(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfDeviceName());
    }

    @Test
    public void setEpfMbrFileName() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfMbrFileName(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfMbrFileName());
    }

    @Test
    public void setEpfMbrMediaRecordLen() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfMbrMediaRecordLen(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfMbrMediaRecordLen());
    }

    @Test
    public void setEpfMbrMediaBlockLen() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfMbrMediaBlockLen(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfMbrMediaBlockLen());
    }

    @Test
    public void setEpfMbrMediaNbrReels() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfMbrMediaNbrReels(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfMbrMediaNbrReels());
    }

    @Test
    public void setEpfMbrMediaLabels() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfMbrMediaLabels(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfMbrMediaLabels());
    }

    @Test
    public void setEpfMbrTapeSeqNbr() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfMbrTapeSeqNbr(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfMbrTapeSeqNbr());
    }

    @Test
    public void setEpfGrpFileName() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfGrpFileName(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfGrpFileName());
    }

    @Test
    public void setEpfGrpMediaRecordLen() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfGrpMediaRecordLen(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfGrpMediaRecordLen());
    }

    @Test
    public void setEpfGrpMediaBlockLen() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfGrpMediaBlockLen(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfGrpMediaBlockLen());
    }

    @Test
    public void setEpfGrpMediaNbrReels() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfGrpMediaNbrReels(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfGrpMediaNbrReels());
    }

    @Test
    public void setEpfGrpMediaLabels() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfGrpMediaLabels(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfGrpMediaLabels());
    }

    @Test
    public void setEpfGroupTapeSeqNbr() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfGroupTapeSeqNbr(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfGroupTapeSeqNbr());
    }

    @Test
    public void setEpfCurrentStageDt() throws Exception {
        Date expected = new Date(1234);
        this.elgEligProfileEpf.setEpfCurrentStageDt(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfCurrentStageDt());
    }

    @Test
    public void setEpfCurrentInput() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfCurrentInput(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfCurrentInput());
    }

    @Test
    public void setEpfCurrentStaged() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfCurrentStaged(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfCurrentStaged());
    }

    @Test
    public void setEpfCurrentLoaded() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfCurrentLoaded(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfCurrentLoaded());
    }

    @Test
    public void setEpfCurrentRejected() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfCurrentRejected(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfCurrentRejected());
    }

    @Test
    public void setEpfCurrentLoadDate() throws Exception {
        Date expected = new Date(1234);
        this.elgEligProfileEpf.setEpfCurrentLoadDate(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfCurrentLoadDate());
    }

    @Test
    public void setEpfPreviousStageDt() throws Exception {
        Date expected = new Date(1234);
        this.elgEligProfileEpf.setEpfPreviousStageDt(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfPreviousStageDt());
    }

    @Test
    public void setEpfPreviousInput() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfPreviousInput(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfPreviousInput());
    }

    @Test
    public void setEpfPreviousStaged() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfPreviousStaged(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfPreviousStaged());
    }

    @Test
    public void setEpfPreviousLoaded() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfPreviousLoaded(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfPreviousLoaded());
    }

    @Test
    public void setEpfPreviousRejected() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfPreviousRejected(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfPreviousRejected());
    }

    @Test
    public void setEpfPreviousLoadDt() throws Exception {
        Date expected = new Date(1234);
        this.elgEligProfileEpf.setEpfPreviousLoadDt(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfPreviousLoadDt());
    }

    @Test
    public void setEpfPriorStageDate() throws Exception {
        Date expected = new Date(1234);
        this.elgEligProfileEpf.setEpfPriorStageDate(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfPriorStageDate());
    }

    @Test
    public void setEpfPriorInput() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfPriorInput(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfPriorInput());
    }

    @Test
    public void setEpfPriorStaged() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfPriorStaged(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfPriorStaged());
    }

    @Test
    public void setEpfPriorLoaded() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfPriorLoaded(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfPriorLoaded());
    }

    @Test
    public void setEpfPriorRejected() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfPriorRejected(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfPriorRejected());
    }

    @Test
    public void setEpfPriorLoadDate() throws Exception {
        Date expected = new Date(1234);
        this.elgEligProfileEpf.setEpfPriorLoadDate(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfPriorLoadDate());
    }

    @Test
    public void setEpfReformatVersion() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfReformatVersion(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfReformatVersion());
    }

    @Test
    public void setEpfTermNbrOfDays() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfTermNbrOfDays(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfTermNbrOfDays());
    }

    @Test
    public void setEpfTermDaysQualifier() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfTermDaysQualifier(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfTermDaysQualifier());
    }

    @Test
    public void setEpfStageLoadInProcess() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfStageLoadInProcess(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfStageLoadInProcess());
    }

    @Test
    public void setEpfSuspendProcessing() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfSuspendProcessing(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfSuspendProcessing());
    }

    @Test
    public void setEpfErrorsInLastRun() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfErrorsInLastRun(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfErrorsInLastRun());
    }

    @Test
    public void setEpfPrintMbrGrpErrors() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfPrintMbrGrpErrors(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfPrintMbrGrpErrors());
    }

    @Test
    public void setEpfIdCard() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfIdCard(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfIdCard());
    }

    @Test
    public void setEpfTermedMembersRpt() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfTermedMembersRpt(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfTermedMembersRpt());
    }

    @Test
    public void setEpfTermCareAssignment() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfTermCareAssignment(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfTermCareAssignment());
    }

    @Test
    public void setEpfGroupListName() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfGroupListName(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfGroupListName());
    }

    @Test
    public void setEpfTermThresholdTba() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfTermThresholdTba(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfTermThresholdTba());
    }

    @Test
    public void setEpfTermThresholdExp() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.elgEligProfileEpf.setEpfTermThresholdExp(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfTermThresholdExp());
    }

    @Test
    public void setEpfRejectionLookup() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfRejectionLookup(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfRejectionLookup());
    }

    @Test
    public void setEpfStatus() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setEpfStatus(expected);

        assertEquals(expected, this.elgEligProfileEpf.getEpfStatus());
    }

    @Test
    public void setAddUserName() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setAddUserName(expected);

        assertEquals(expected, this.elgEligProfileEpf.getAddUserName());
    }

    @Test
    public void setAddDate() throws Exception {
        Date expected = new Date(1234);
        this.elgEligProfileEpf.setAddDate(expected);

        assertEquals(expected, this.elgEligProfileEpf.getAddDate());
    }

    @Test
    public void setAddTime() throws Exception {
        Time expected = new Time(1234);
        this.elgEligProfileEpf.setAddTime(expected);

        assertEquals(expected, this.elgEligProfileEpf.getAddTime());
    }

    @Test
    public void setAddProgramName() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setAddProgramName(expected);

        assertEquals(expected, this.elgEligProfileEpf.getAddProgramName());
    }

    @Test
    public void setChgUserName() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setChgUserName(expected);

        assertEquals(expected, this.elgEligProfileEpf.getChgUserName());
    }

    @Test
    public void setChgDate() throws Exception {
        Date expected = new Date(1234);
        this.elgEligProfileEpf.setChgDate(expected);

        assertEquals(expected, this.elgEligProfileEpf.getChgDate());
    }

    @Test
    public void setChgTime() throws Exception {
        Time expected = new Time(1234);
        this.elgEligProfileEpf.setChgTime(expected);

        assertEquals(expected, this.elgEligProfileEpf.getChgTime());
    }

    @Test
    public void setChgProgramName() throws Exception {
        String expected = "foobar";
        this.elgEligProfileEpf.setChgProgramName(expected);

        assertEquals(expected, this.elgEligProfileEpf.getChgProgramName());
    }

}