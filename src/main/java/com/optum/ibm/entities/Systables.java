package com.optum.ibm.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by bkocinsk on 6/13/2018.
 */
@Entity
@Table(name = "SYSTABLES", schema = "QSYS2")
@IdClass(SystablesPK.class)
public class Systables {
    private String tableName;
    private String tableOwner;
    private String tableType;
    private Integer columnCount;
    private Integer rowLength;
    private String tableText;
    private String longComment;
    private String tableSchema;
    private Timestamp lastAlteredTimestamp;
    private String systemTableName;
    private String systemTableSchema;
    private String fileType;
    private String baseTableCatalog;
    private String baseTableSchema;
    private String baseTableName;
    private String baseTableMember;
    private String systemTable;
    private String selectOmit;
    private String isInsertableInto;
    private Short iaspNumber;
    private String enabled;
    private String maintenance;
    private String refresh;
    private Timestamp refreshTime;
    private String mqtDefinition;
    private String isolation;
    private String partitionTable;
    private String tableDefiner;
    private String mqtRestoreDeferred;
    private String roundingMode;
    private String control;

    @Id
    @Column(name = "TABLE_NAME", nullable = false, length = 128)
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "TABLE_OWNER", nullable = false, length = 128)
    public String getTableOwner() {
        return tableOwner;
    }

    public void setTableOwner(String tableOwner) {
        this.tableOwner = tableOwner;
    }

    @Basic
    @Column(name = "TABLE_TYPE", nullable = false, length = 1)
    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    @Basic
    @Column(name = "COLUMN_COUNT", nullable = false)
    public Integer getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(Integer columnCount) {
        this.columnCount = columnCount;
    }

    @Basic
    @Column(name = "ROW_LENGTH", nullable = false)
    public Integer getRowLength() {
        return rowLength;
    }

    public void setRowLength(Integer rowLength) {
        this.rowLength = rowLength;
    }

    @Basic
    @Column(name = "TABLE_TEXT", nullable = false, length = 50)
    public String getTableText() {
        return tableText;
    }

    public void setTableText(String tableText) {
        this.tableText = tableText;
    }

    @Basic
    @Column(name = "LONG_COMMENT", nullable = true, length = 2000)
    public String getLongComment() {
        return longComment;
    }

    public void setLongComment(String longComment) {
        this.longComment = longComment;
    }

    @Id
    @Column(name = "TABLE_SCHEMA", nullable = false, length = 128)
    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Basic
    @Column(name = "LAST_ALTERED_TIMESTAMP", nullable = false)
    public Timestamp getLastAlteredTimestamp() {
        return lastAlteredTimestamp;
    }

    public void setLastAlteredTimestamp(Timestamp lastAlteredTimestamp) {
        this.lastAlteredTimestamp = lastAlteredTimestamp;
    }

    @Basic
    @Column(name = "SYSTEM_TABLE_NAME", nullable = false, length = 10)
    public String getSystemTableName() {
        return systemTableName;
    }

    public void setSystemTableName(String systemTableName) {
        this.systemTableName = systemTableName;
    }

    @Basic
    @Column(name = "SYSTEM_TABLE_SCHEMA", nullable = false, length = 10)
    public String getSystemTableSchema() {
        return systemTableSchema;
    }

    public void setSystemTableSchema(String systemTableSchema) {
        this.systemTableSchema = systemTableSchema;
    }

    @Basic
    @Column(name = "FILE_TYPE", nullable = false, length = 1)
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Basic
    @Column(name = "BASE_TABLE_CATALOG", nullable = true, length = 18)
    public String getBaseTableCatalog() {
        return baseTableCatalog;
    }

    public void setBaseTableCatalog(String baseTableCatalog) {
        this.baseTableCatalog = baseTableCatalog;
    }

    @Basic
    @Column(name = "BASE_TABLE_SCHEMA", nullable = true, length = 128)
    public String getBaseTableSchema() {
        return baseTableSchema;
    }

    public void setBaseTableSchema(String baseTableSchema) {
        this.baseTableSchema = baseTableSchema;
    }

    @Basic
    @Column(name = "BASE_TABLE_NAME", nullable = true, length = 128)
    public String getBaseTableName() {
        return baseTableName;
    }

    public void setBaseTableName(String baseTableName) {
        this.baseTableName = baseTableName;
    }

    @Basic
    @Column(name = "BASE_TABLE_MEMBER", nullable = true, length = 10)
    public String getBaseTableMember() {
        return baseTableMember;
    }

    public void setBaseTableMember(String baseTableMember) {
        this.baseTableMember = baseTableMember;
    }

    @Basic
    @Column(name = "SYSTEM_TABLE", nullable = false, length = 1)
    public String getSystemTable() {
        return systemTable;
    }

    public void setSystemTable(String systemTable) {
        this.systemTable = systemTable;
    }

    @Basic
    @Column(name = "SELECT_OMIT", nullable = false, length = 1)
    public String getSelectOmit() {
        return selectOmit;
    }

    public void setSelectOmit(String selectOmit) {
        this.selectOmit = selectOmit;
    }

    @Basic
    @Column(name = "IS_INSERTABLE_INTO", nullable = false, length = 3)
    public String getIsInsertableInto() {
        return isInsertableInto;
    }

    public void setIsInsertableInto(String isInsertableInto) {
        this.isInsertableInto = isInsertableInto;
    }

    @Basic
    @Column(name = "IASP_NUMBER", nullable = false)
    public Short getIaspNumber() {
        return iaspNumber;
    }

    public void setIaspNumber(Short iaspNumber) {
        this.iaspNumber = iaspNumber;
    }

    @Basic
    @Column(name = "ENABLED", nullable = true, length = 3)
    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    @Basic
    @Column(name = "MAINTENANCE", nullable = true, length = 6)
    public String getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    @Basic
    @Column(name = "REFRESH", nullable = true, length = 9)
    public String getRefresh() {
        return refresh;
    }

    public void setRefresh(String refresh) {
        this.refresh = refresh;
    }

    @Basic
    @Column(name = "REFRESH_TIME", nullable = true)
    public Timestamp getRefreshTime() {
        return refreshTime;
    }

    public void setRefreshTime(Timestamp refreshTime) {
        this.refreshTime = refreshTime;
    }

    @Basic
    @Column(name = "MQT_DEFINITION", nullable = true)
    public String getMqtDefinition() {
        return mqtDefinition;
    }

    public void setMqtDefinition(String mqtDefinition) {
        this.mqtDefinition = mqtDefinition;
    }

    @Basic
    @Column(name = "ISOLATION", nullable = true, length = 2)
    public String getIsolation() {
        return isolation;
    }

    public void setIsolation(String isolation) {
        this.isolation = isolation;
    }

    @Basic
    @Column(name = "PARTITION_TABLE", nullable = false, length = 11)
    public String getPartitionTable() {
        return partitionTable;
    }

    public void setPartitionTable(String partitionTable) {
        this.partitionTable = partitionTable;
    }

    @Basic
    @Column(name = "TABLE_DEFINER", nullable = true, length = 128)
    public String getTableDefiner() {
        return tableDefiner;
    }

    public void setTableDefiner(String tableDefiner) {
        this.tableDefiner = tableDefiner;
    }

    @Basic
    @Column(name = "MQT_RESTORE_DEFERRED", nullable = true, length = 1)
    public String getMqtRestoreDeferred() {
        return mqtRestoreDeferred;
    }

    public void setMqtRestoreDeferred(String mqtRestoreDeferred) {
        this.mqtRestoreDeferred = mqtRestoreDeferred;
    }

    @Basic
    @Column(name = "ROUNDING_MODE", nullable = true, length = 1)
    public String getRoundingMode() {
        return roundingMode;
    }

    public void setRoundingMode(String roundingMode) {
        this.roundingMode = roundingMode;
    }

    @Basic
    @Column(name = "CONTROL", nullable = false, length = 1)
    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Systables systables = (Systables) o;

        if (tableName != null ? !tableName.equals(systables.tableName) : systables.tableName != null) return false;
        if (tableOwner != null ? !tableOwner.equals(systables.tableOwner) : systables.tableOwner != null) return false;
        if (tableType != null ? !tableType.equals(systables.tableType) : systables.tableType != null) return false;
        if (columnCount != null ? !columnCount.equals(systables.columnCount) : systables.columnCount != null)
            return false;
        if (rowLength != null ? !rowLength.equals(systables.rowLength) : systables.rowLength != null) return false;
        if (tableText != null ? !tableText.equals(systables.tableText) : systables.tableText != null) return false;
        if (longComment != null ? !longComment.equals(systables.longComment) : systables.longComment != null)
            return false;
        if (tableSchema != null ? !tableSchema.equals(systables.tableSchema) : systables.tableSchema != null)
            return false;
        if (lastAlteredTimestamp != null ? !lastAlteredTimestamp.equals(systables.lastAlteredTimestamp) : systables.lastAlteredTimestamp != null)
            return false;
        if (systemTableName != null ? !systemTableName.equals(systables.systemTableName) : systables.systemTableName != null)
            return false;
        if (systemTableSchema != null ? !systemTableSchema.equals(systables.systemTableSchema) : systables.systemTableSchema != null)
            return false;
        if (fileType != null ? !fileType.equals(systables.fileType) : systables.fileType != null) return false;
        if (baseTableCatalog != null ? !baseTableCatalog.equals(systables.baseTableCatalog) : systables.baseTableCatalog != null)
            return false;
        if (baseTableSchema != null ? !baseTableSchema.equals(systables.baseTableSchema) : systables.baseTableSchema != null)
            return false;
        if (baseTableName != null ? !baseTableName.equals(systables.baseTableName) : systables.baseTableName != null)
            return false;
        if (baseTableMember != null ? !baseTableMember.equals(systables.baseTableMember) : systables.baseTableMember != null)
            return false;
        if (systemTable != null ? !systemTable.equals(systables.systemTable) : systables.systemTable != null)
            return false;
        if (selectOmit != null ? !selectOmit.equals(systables.selectOmit) : systables.selectOmit != null) return false;
        if (isInsertableInto != null ? !isInsertableInto.equals(systables.isInsertableInto) : systables.isInsertableInto != null)
            return false;
        if (iaspNumber != null ? !iaspNumber.equals(systables.iaspNumber) : systables.iaspNumber != null) return false;
        if (enabled != null ? !enabled.equals(systables.enabled) : systables.enabled != null) return false;
        if (maintenance != null ? !maintenance.equals(systables.maintenance) : systables.maintenance != null)
            return false;
        if (refresh != null ? !refresh.equals(systables.refresh) : systables.refresh != null) return false;
        if (refreshTime != null ? !refreshTime.equals(systables.refreshTime) : systables.refreshTime != null)
            return false;
        if (mqtDefinition != null ? !mqtDefinition.equals(systables.mqtDefinition) : systables.mqtDefinition != null)
            return false;
        if (isolation != null ? !isolation.equals(systables.isolation) : systables.isolation != null) return false;
        if (partitionTable != null ? !partitionTable.equals(systables.partitionTable) : systables.partitionTable != null)
            return false;
        if (tableDefiner != null ? !tableDefiner.equals(systables.tableDefiner) : systables.tableDefiner != null)
            return false;
        if (mqtRestoreDeferred != null ? !mqtRestoreDeferred.equals(systables.mqtRestoreDeferred) : systables.mqtRestoreDeferred != null)
            return false;
        if (roundingMode != null ? !roundingMode.equals(systables.roundingMode) : systables.roundingMode != null)
            return false;
        if (control != null ? !control.equals(systables.control) : systables.control != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tableName != null ? tableName.hashCode() : 0;
        result = 31 * result + (tableOwner != null ? tableOwner.hashCode() : 0);
        result = 31 * result + (tableType != null ? tableType.hashCode() : 0);
        result = 31 * result + (columnCount != null ? columnCount.hashCode() : 0);
        result = 31 * result + (rowLength != null ? rowLength.hashCode() : 0);
        result = 31 * result + (tableText != null ? tableText.hashCode() : 0);
        result = 31 * result + (longComment != null ? longComment.hashCode() : 0);
        result = 31 * result + (tableSchema != null ? tableSchema.hashCode() : 0);
        result = 31 * result + (lastAlteredTimestamp != null ? lastAlteredTimestamp.hashCode() : 0);
        result = 31 * result + (systemTableName != null ? systemTableName.hashCode() : 0);
        result = 31 * result + (systemTableSchema != null ? systemTableSchema.hashCode() : 0);
        result = 31 * result + (fileType != null ? fileType.hashCode() : 0);
        result = 31 * result + (baseTableCatalog != null ? baseTableCatalog.hashCode() : 0);
        result = 31 * result + (baseTableSchema != null ? baseTableSchema.hashCode() : 0);
        result = 31 * result + (baseTableName != null ? baseTableName.hashCode() : 0);
        result = 31 * result + (baseTableMember != null ? baseTableMember.hashCode() : 0);
        result = 31 * result + (systemTable != null ? systemTable.hashCode() : 0);
        result = 31 * result + (selectOmit != null ? selectOmit.hashCode() : 0);
        result = 31 * result + (isInsertableInto != null ? isInsertableInto.hashCode() : 0);
        result = 31 * result + (iaspNumber != null ? iaspNumber.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        result = 31 * result + (maintenance != null ? maintenance.hashCode() : 0);
        result = 31 * result + (refresh != null ? refresh.hashCode() : 0);
        result = 31 * result + (refreshTime != null ? refreshTime.hashCode() : 0);
        result = 31 * result + (mqtDefinition != null ? mqtDefinition.hashCode() : 0);
        result = 31 * result + (isolation != null ? isolation.hashCode() : 0);
        result = 31 * result + (partitionTable != null ? partitionTable.hashCode() : 0);
        result = 31 * result + (tableDefiner != null ? tableDefiner.hashCode() : 0);
        result = 31 * result + (mqtRestoreDeferred != null ? mqtRestoreDeferred.hashCode() : 0);
        result = 31 * result + (roundingMode != null ? roundingMode.hashCode() : 0);
        result = 31 * result + (control != null ? control.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Systables{" +
                "tableName='" + tableName + '\'' +
                ", tableOwner='" + tableOwner + '\'' +
                ", tableType='" + tableType + '\'' +
                ", columnCount=" + columnCount +
                ", rowLength=" + rowLength +
                ", tableText='" + tableText + '\'' +
                ", longComment='" + longComment + '\'' +
                ", tableSchema='" + tableSchema + '\'' +
                ", lastAlteredTimestamp=" + lastAlteredTimestamp +
                ", systemTableName='" + systemTableName + '\'' +
                ", systemTableSchema='" + systemTableSchema + '\'' +
                ", fileType='" + fileType + '\'' +
                ", baseTableCatalog='" + baseTableCatalog + '\'' +
                ", baseTableSchema='" + baseTableSchema + '\'' +
                ", baseTableName='" + baseTableName + '\'' +
                ", baseTableMember='" + baseTableMember + '\'' +
                ", systemTable='" + systemTable + '\'' +
                ", selectOmit='" + selectOmit + '\'' +
                ", isInsertableInto='" + isInsertableInto + '\'' +
                ", iaspNumber=" + iaspNumber +
                ", enabled='" + enabled + '\'' +
                ", maintenance='" + maintenance + '\'' +
                ", refresh='" + refresh + '\'' +
                ", refreshTime=" + refreshTime +
                ", mqtDefinition='" + mqtDefinition + '\'' +
                ", isolation='" + isolation + '\'' +
                ", partitionTable='" + partitionTable + '\'' +
                ", tableDefiner='" + tableDefiner + '\'' +
                ", mqtRestoreDeferred='" + mqtRestoreDeferred + '\'' +
                ", roundingMode='" + roundingMode + '\'' +
                ", control='" + control + '\'' +
                '}';
    }
}