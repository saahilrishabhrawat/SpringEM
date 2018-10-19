package com.optum.ibm.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.*;

public class SystablesTest {

    private Systables systables;

    @Before
    public void setUp() throws Exception {
        this.systables = new Systables();
    }

    @After
    public void tearDown() throws Exception {
        this.systables = null;
    }

    @Test
    public void setTableName() throws Exception {
        String expected = "foobar";
        this.systables.setTableName(expected);

        assertEquals(expected, this.systables.getTableName());
    }

    @Test
    public void setTableOwner() throws Exception {
        String expected = "foobar";
        this.systables.setTableOwner(expected);

        assertEquals(expected, this.systables.getTableOwner());
    }

    @Test
    public void setTableType() throws Exception {
        String expected = "foobar";
        this.systables.setTableType(expected);

        assertEquals(expected, this.systables.getTableType());
    }

    @Test
    public void setColumnCount() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.systables.setColumnCount(expected);

        assertEquals(expected, this.systables.getColumnCount());
    }

    @Test
    public void setRowLength() throws Exception {
        Integer expected = Integer.MAX_VALUE;
        this.systables.setRowLength(expected);

        assertEquals(expected, this.systables.getRowLength());
    }

    @Test
    public void setTableText() throws Exception {
        String expected = "foobar";
        this.systables.setTableText(expected);

        assertEquals(expected, this.systables.getTableText());
    }

    @Test
    public void setLongComment() throws Exception {
        String expected = "foobar";
        this.systables.setLongComment(expected);

        assertEquals(expected, this.systables.getLongComment());
    }

    @Test
    public void setTableSchema() throws Exception {
        String expected = "foobar";
        this.systables.setTableSchema(expected);

        assertEquals(expected, this.systables.getTableSchema());
    }

    @Test
    public void setLastAlteredTimestamp() throws Exception {
        Timestamp expected = new Timestamp(763983980000L);
        this.systables.setLastAlteredTimestamp(expected);

        assertEquals(expected, this.systables.getLastAlteredTimestamp());
    }

    @Test
    public void setSystemTableName() throws Exception {
        String expected = "foobar";
        this.systables.setSystemTableName(expected);

        assertEquals(expected, this.systables.getSystemTableName());
    }

    @Test
    public void setSystemTableSchema() throws Exception {
        String expected = "foobar";
        this.systables.setSystemTableSchema(expected);

        assertEquals(expected, this.systables.getSystemTableSchema());
    }

    @Test
    public void setFileType() throws Exception {
        String expected = "foobar";
        this.systables.setFileType(expected);

        assertEquals(expected, this.systables.getFileType());
    }

    @Test
    public void setBaseTableCatalog() throws Exception {
        String expected = "foobar";
        this.systables.setBaseTableCatalog(expected);

        assertEquals(expected, this.systables.getBaseTableCatalog());
    }

    @Test
    public void setBaseTableSchema() throws Exception {
        String expected = "foobar";
        this.systables.setBaseTableSchema(expected);

        assertEquals(expected, this.systables.getBaseTableSchema());
    }

    @Test
    public void setBaseTableName() throws Exception {
        String expected = "foobar";
        this.systables.setBaseTableName(expected);

        assertEquals(expected, this.systables.getBaseTableName());
    }

    @Test
    public void setBaseTableMember() throws Exception {
        String expected = "foobar";
        this.systables.setBaseTableMember(expected);

        assertEquals(expected, this.systables.getBaseTableMember());
    }

    @Test
    public void setSystemTable() throws Exception {
        String expected = "foobar";
        this.systables.setSystemTable(expected);

        assertEquals(expected, this.systables.getSystemTable());
    }

    @Test
    public void setSelectOmit() throws Exception {
        String expected = "foobar";
        this.systables.setSelectOmit(expected);

        assertEquals(expected, this.systables.getSelectOmit());
    }

    @Test
    public void setIsInsertableInto() throws Exception {
        String expected = "foobar";
        this.systables.setIsInsertableInto(expected);

        assertEquals(expected, this.systables.getIsInsertableInto());
    }

    @Test
    public void setIaspNumber() throws Exception {
        Short expected = Short.MAX_VALUE;
        this.systables.setIaspNumber(expected);

        assertEquals(expected, this.systables.getIaspNumber());
    }

    @Test
    public void setEnabled() throws Exception {
        String expected = "foobar";
        this.systables.setEnabled(expected);

        assertEquals(expected, this.systables.getEnabled());
    }

    @Test
    public void setMaintenance() throws Exception {
        String expected = "foobar";
        this.systables.setMaintenance(expected);

        assertEquals(expected, this.systables.getMaintenance());
    }

    @Test
    public void setRefresh() throws Exception {
        String expected = "foobar";
        this.systables.setRefresh(expected);

        assertEquals(expected, this.systables.getRefresh());
    }

    @Test
    public void setRefreshTime() throws Exception {
        Timestamp expected = new Timestamp(763983980000L);
        this.systables.setRefreshTime(expected);

        assertEquals(expected, this.systables.getRefreshTime());
    }

    @Test
    public void setMqtDefinition() throws Exception {
        String expected = "foobar";
        this.systables.setMqtDefinition(expected);

        assertEquals(expected, this.systables.getMqtDefinition());
    }

    @Test
    public void setIsolation() throws Exception {
        String expected = "foobar";
        this.systables.setIsolation(expected);

        assertEquals(expected, this.systables.getIsolation());
    }

    @Test
    public void setPartitionTable() throws Exception {
        String expected = "foobar";
        this.systables.setPartitionTable(expected);

        assertEquals(expected, this.systables.getPartitionTable());
    }

    @Test
    public void setTableDefiner() throws Exception {
        String expected = "foobar";
        this.systables.setTableDefiner(expected);

        assertEquals(expected, this.systables.getTableDefiner());
    }

    @Test
    public void setMqtRestoreDeferred() throws Exception {
        String expected = "foobar";
        this.systables.setMqtRestoreDeferred(expected);

        assertEquals(expected, this.systables.getMqtRestoreDeferred());
    }

    @Test
    public void setRoundingMode() throws Exception {
        String expected = "foobar";
        this.systables.setRoundingMode(expected);

        assertEquals(expected, this.systables.getRoundingMode());
    }

    @Test
    public void setControl() throws Exception {
        String expected = "foobar";
        this.systables.setControl(expected);

        assertEquals(expected, this.systables.getControl());
    }

}