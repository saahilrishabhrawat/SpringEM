package com.optum.ibm.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.*;

public class SysprogramstatTest {

    private Sysprogramstat sysprogramstat;

    @Before
    public void setUp() throws Exception {
        this.sysprogramstat = new Sysprogramstat();
    }

    @After
    public void tearDown() throws Exception {
        this.sysprogramstat = null;
    }

    @Test
    public void setProgramSchema() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setProgramSchema(expected);

        assertEquals(expected, this.sysprogramstat.getProgramSchema());
    }

    @Test
    public void setProgramName() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setProgramName(expected);

        assertEquals(expected, this.sysprogramstat.getProgramName());
    }

    @Test
    public void setProgramType() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setProgramType(expected);

        assertEquals(expected, this.sysprogramstat.getProgramType());
    }

    @Test
    public void setModuleName() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setModuleName(expected);

        assertEquals(expected, this.sysprogramstat.getModuleName());
    }

    @Test
    public void setProgramOwner() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setProgramOwner(expected);

        assertEquals(expected, this.sysprogramstat.getProgramOwner());
    }

    @Test
    public void setProgramCreator() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setProgramCreator(expected);

        assertEquals(expected, this.sysprogramstat.getProgramCreator());
    }

    @Test
    public void setCreationTimestamp() throws Exception {
        Timestamp expected = new Timestamp(763983980000L);
        this.sysprogramstat.setCreationTimestamp(expected);

        assertEquals(expected, this.sysprogramstat.getCreationTimestamp());
    }

    @Test
    public void setDefaultSchema() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setDefaultSchema(expected);

        assertEquals(expected, this.sysprogramstat.getDefaultSchema());
    }

    @Test
    public void setIsolation() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setIsolation(expected);

        assertEquals(expected, this.sysprogramstat.getIsolation());
    }

    @Test
    public void setConcurrentaccessresolution() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setConcurrentaccessresolution(expected);

        assertEquals(expected, this.sysprogramstat.getConcurrentaccessresolution());
    }

    @Test
    public void setNumberStatements() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.sysprogramstat.setNumberStatements(expected);

        assertEquals(expected, this.sysprogramstat.getNumberStatements());
    }

    @Test
    public void setProgramUsedSize() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.sysprogramstat.setProgramUsedSize(expected);

        assertEquals(expected, this.sysprogramstat.getProgramUsedSize());
    }

    @Test
    public void setNumberCompressions() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.sysprogramstat.setNumberCompressions(expected);

        assertEquals(expected, this.sysprogramstat.getNumberCompressions());
    }

    @Test
    public void setStatementContentionCount() throws Exception {
        Long expected = Long.MAX_VALUE;
        this.sysprogramstat.setStatementContentionCount(expected);

        assertEquals(expected, this.sysprogramstat.getStatementContentionCount());
    }

    @Test
    public void setOriginalSourceFile() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setOriginalSourceFile(expected);

        assertEquals(expected, this.sysprogramstat.getOriginalSourceFile());
    }

    @Test
    public void setOriginalSourceFileCcsid() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.sysprogramstat.setOriginalSourceFileCcsid(expected);

        assertEquals(expected, this.sysprogramstat.getOriginalSourceFileCcsid());
    }

    @Test
    public void setRoutineType() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setRoutineType(expected);

        assertEquals(expected, this.sysprogramstat.getRoutineType());
    }

    @Test
    public void setRoutineBody() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setRoutineBody(expected);

        assertEquals(expected, this.sysprogramstat.getRoutineBody());
    }

    @Test
    public void setFunctionOrigin() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setFunctionOrigin(expected);

        assertEquals(expected, this.sysprogramstat.getFunctionOrigin());
    }

    @Test
    public void setFunctionType() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setFunctionType(expected);

        assertEquals(expected, this.sysprogramstat.getFunctionType());
    }

    @Test
    public void setNumberExternalRoutines() throws Exception {
        Short expected = Short.MAX_VALUE;
        this.sysprogramstat.setNumberExternalRoutines(expected);

        assertEquals(expected, this.sysprogramstat.getNumberExternalRoutines());
    }

    @Test
    public void setExtendedIndicator() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setExtendedIndicator(expected);

        assertEquals(expected, this.sysprogramstat.getExtendedIndicator());
    }

    @Test
    public void setcNulRequired() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setcNulRequired(expected);

        assertEquals(expected, this.sysprogramstat.getcNulRequired());
    }

    @Test
    public void setNaming() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setNaming(expected);

        assertEquals(expected, this.sysprogramstat.getNaming());
    }

    @Test
    public void setTargetRelease() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setTargetRelease(expected);

        assertEquals(expected, this.sysprogramstat.getTargetRelease());
    }

    @Test
    public void setEarliestPossibleRelease() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setEarliestPossibleRelease(expected);

        assertEquals(expected, this.sysprogramstat.getEarliestPossibleRelease());
    }

    @Test
    public void setRdb() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setRdb(expected);

        assertEquals(expected, this.sysprogramstat.getRdb());
    }

    @Test
    public void setConsistencyToken() throws Exception {
        byte[] expected = "foobar".getBytes();
        this.sysprogramstat.setConsistencyToken(expected);

        assertEquals(expected, this.sysprogramstat.getConsistencyToken());
    }

    @Test
    public void setAllowCopyData() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setAllowCopyData(expected);

        assertEquals(expected, this.sysprogramstat.getAllowCopyData());
    }

    @Test
    public void setCloseSqlCursor() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setCloseSqlCursor(expected);

        assertEquals(expected, this.sysprogramstat.getCloseSqlCursor());
    }

    @Test
    public void setLobFetchOptimization() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setLobFetchOptimization(expected);

        assertEquals(expected, this.sysprogramstat.getLobFetchOptimization());
    }

    @Test
    public void setDecimalPoint() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setDecimalPoint(expected);

        assertEquals(expected, this.sysprogramstat.getDecimalPoint());
    }

    @Test
    public void setSqlStringDelimiter() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setSqlStringDelimiter(expected);

        assertEquals(expected, this.sysprogramstat.getSqlStringDelimiter());
    }

    @Test
    public void setDateFormat() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setDateFormat(expected);

        assertEquals(expected, this.sysprogramstat.getDateFormat());
    }

    @Test
    public void setDateSeparator() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setDateSeparator(expected);

        assertEquals(expected, this.sysprogramstat.getDateSeparator());
    }

    @Test
    public void setTimeFormat() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setTimeFormat(expected);

        assertEquals(expected, this.sysprogramstat.getTimeFormat());
    }

    @Test
    public void setTimeSeparator() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setTimeSeparator(expected);

        assertEquals(expected, this.sysprogramstat.getTimeSeparator());
    }

    @Test
    public void setDynamicDefaultSchema() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setDynamicDefaultSchema(expected);

        assertEquals(expected, this.sysprogramstat.getDynamicDefaultSchema());
    }

    @Test
    public void setCurrentRules() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setCurrentRules(expected);

        assertEquals(expected, this.sysprogramstat.getCurrentRules());
    }

    @Test
    public void setAllowBlock() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setAllowBlock(expected);

        assertEquals(expected, this.sysprogramstat.getAllowBlock());
    }

    @Test
    public void setDelayPrepare() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setDelayPrepare(expected);

        assertEquals(expected, this.sysprogramstat.getDelayPrepare());
    }

    @Test
    public void setUserProfile() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setUserProfile(expected);

        assertEquals(expected, this.sysprogramstat.getUserProfile());
    }

    @Test
    public void setDynamicUserProfile() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setDynamicUserProfile(expected);

        assertEquals(expected, this.sysprogramstat.getDynamicUserProfile());
    }

    @Test
    public void setSortSequence() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setSortSequence(expected);

        assertEquals(expected, this.sysprogramstat.getSortSequence());
    }

    @Test
    public void setLanguageIdentifier() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setLanguageIdentifier(expected);

        assertEquals(expected, this.sysprogramstat.getLanguageIdentifier());
    }

    @Test
    public void setSortSequenceSchema() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setSortSequenceSchema(expected);

        assertEquals(expected, this.sysprogramstat.getSortSequenceSchema());
    }

    @Test
    public void setSortSequenceName() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setSortSequenceName(expected);

        assertEquals(expected, this.sysprogramstat.getSortSequenceName());
    }

    @Test
    public void setRdbConnectionMethod() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setRdbConnectionMethod(expected);

        assertEquals(expected, this.sysprogramstat.getRdbConnectionMethod());
    }

    @Test
    public void setDecresultMaximumPrecision() throws Exception {
        Short expected = Short.MAX_VALUE;
        this.sysprogramstat.setDecresultMaximumPrecision(expected);

        assertEquals(expected, this.sysprogramstat.getDecresultMaximumPrecision());
    }

    @Test
    public void setDecresultMaximumScale() throws Exception {
        Short expected = Short.MAX_VALUE;
        this.sysprogramstat.setDecresultMaximumScale(expected);

        assertEquals(expected, this.sysprogramstat.getDecresultMaximumScale());
    }

    @Test
    public void setDecresultMinimumDivideScale() throws Exception {
        Short expected = Short.MAX_VALUE;
        this.sysprogramstat.setDecresultMinimumDivideScale(expected);

        assertEquals(expected, this.sysprogramstat.getDecresultMinimumDivideScale());
    }

    @Test
    public void setDecfloatRoundingMode() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setDecfloatRoundingMode(expected);

        assertEquals(expected, this.sysprogramstat.getDecfloatRoundingMode());
    }

    @Test
    public void setDecfloatWarning() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setDecfloatWarning(expected);

        assertEquals(expected, this.sysprogramstat.getDecfloatWarning());
    }

    @Test
    public void setSqlpath() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setSqlpath(expected);

        assertEquals(expected, this.sysprogramstat.getSqlpath());
    }

    @Test
    public void setDbgview() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setDbgview(expected);

        assertEquals(expected, this.sysprogramstat.getDbgview());
    }

    @Test
    public void setDbgkey() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setDbgkey(expected);

        assertEquals(expected, this.sysprogramstat.getDbgkey());
    }

    @Test
    public void setLastUsedTimestamp() throws Exception {
        Timestamp expected = new Timestamp(763983980000L);
        this.sysprogramstat.setLastUsedTimestamp(expected);

        assertEquals(expected, this.sysprogramstat.getLastUsedTimestamp());
    }

    @Test
    public void setDaysUsedCount() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.sysprogramstat.setDaysUsedCount(expected);

        assertEquals(expected, this.sysprogramstat.getDaysUsedCount());
    }

    @Test
    public void setLastResetTimestamp() throws Exception {
        Timestamp expected = new Timestamp(763983980000L);
        this.sysprogramstat.setLastResetTimestamp(expected);

        assertEquals(expected, this.sysprogramstat.getLastResetTimestamp());
    }

    @Test
    public void setSystemProgramName() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setSystemProgramName(expected);

        assertEquals(expected, this.sysprogramstat.getSystemProgramName());
    }

    @Test
    public void setSystemProgramSchema() throws Exception {
        String expected = "foobar";
        this.sysprogramstat.setSystemProgramSchema(expected);

        assertEquals(expected, this.sysprogramstat.getSystemProgramSchema());
    }

    @Test
    public void setIaspNumber() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.sysprogramstat.setIaspNumber(expected);

        assertEquals(expected, this.sysprogramstat.getIaspNumber());
    }

}