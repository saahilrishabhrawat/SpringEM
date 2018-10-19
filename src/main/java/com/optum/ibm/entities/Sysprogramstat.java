package com.optum.ibm.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by bkocinsk on 6/13/2018.
 */
@Entity
@Table(name = "SYSPROGRAMSTAT", schema = "QSYS2")
@IdClass(SysprogramstatPK.class)
public class Sysprogramstat {
    private String programSchema;
    private String programName;
    private String programType;
    private String moduleName;
    private String programOwner;
    private String programCreator;
    private Timestamp creationTimestamp;
    private String defaultSchema;
    private String isolation;
    private String concurrentaccessresolution;
    private Integer numberStatements;
    private Integer programUsedSize;
    private Integer numberCompressions;
    private Long statementContentionCount;
    private String originalSourceFile;
    private Integer originalSourceFileCcsid;
    private String routineType;
    private String routineBody;
    private String functionOrigin;
    private String functionType;
    private Short numberExternalRoutines;
    private String extendedIndicator;
    private String cNulRequired;
    private String naming;
    private String targetRelease;
    private String earliestPossibleRelease;
    private String rdb;
    private byte[] consistencyToken;
    private String allowCopyData;
    private String closeSqlCursor;
    private String lobFetchOptimization;
    private String decimalPoint;
    private String sqlStringDelimiter;
    private String dateFormat;
    private String dateSeparator;
    private String timeFormat;
    private String timeSeparator;
    private String dynamicDefaultSchema;
    private String currentRules;
    private String allowBlock;
    private String delayPrepare;
    private String userProfile;
    private String dynamicUserProfile;
    private String sortSequence;
    private String languageIdentifier;
    private String sortSequenceSchema;
    private String sortSequenceName;
    private String rdbConnectionMethod;
    private Short decresultMaximumPrecision;
    private Short decresultMaximumScale;
    private Short decresultMinimumDivideScale;
    private String decfloatRoundingMode;
    private String decfloatWarning;
    private String sqlpath;
    private String dbgview;
    private String dbgkey;
    private Timestamp lastUsedTimestamp;
    private Integer daysUsedCount;
    private Timestamp lastResetTimestamp;
    private String systemProgramName;
    private String systemProgramSchema;
    private Integer iaspNumber;

    @Id
    @Column(name = "PROGRAM_SCHEMA", nullable = false, length = 128)
    public String getProgramSchema() {
        return programSchema;
    }

    public void setProgramSchema(String programSchema) {
        this.programSchema = programSchema;
    }

    @Id
    @Column(name = "PROGRAM_NAME", nullable = false, length = 128)
    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    @Id
    @Column(name = "PROGRAM_TYPE", nullable = false, length = 128)
    public String getProgramType() {
        return programType;
    }

    public void setProgramType(String programType) {
        this.programType = programType;
    }

    @Basic
    @Column(name = "MODULE_NAME", nullable = true, length = 10)
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    @Basic
    @Column(name = "PROGRAM_OWNER", nullable = false, length = 128)
    public String getProgramOwner() {
        return programOwner;
    }

    public void setProgramOwner(String programOwner) {
        this.programOwner = programOwner;
    }

    @Basic
    @Column(name = "PROGRAM_CREATOR", nullable = false, length = 128)
    public String getProgramCreator() {
        return programCreator;
    }

    public void setProgramCreator(String programCreator) {
        this.programCreator = programCreator;
    }

    @Basic
    @Column(name = "CREATION_TIMESTAMP", nullable = false)
    public Timestamp getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Timestamp creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    @Basic
    @Column(name = "DEFAULT_SCHEMA", nullable = true, length = 128)
    public String getDefaultSchema() {
        return defaultSchema;
    }

    public void setDefaultSchema(String defaultSchema) {
        this.defaultSchema = defaultSchema;
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
    @Column(name = "CONCURRENTACCESSRESOLUTION", nullable = true, length = 1)
    public String getConcurrentaccessresolution() {
        return concurrentaccessresolution;
    }

    public void setConcurrentaccessresolution(String concurrentaccessresolution) {
        this.concurrentaccessresolution = concurrentaccessresolution;
    }

    @Basic
    @Column(name = "NUMBER_STATEMENTS", nullable = false)
    public Integer getNumberStatements() {
        return numberStatements;
    }

    public void setNumberStatements(Integer numberStatements) {
        this.numberStatements = numberStatements;
    }

    @Basic
    @Column(name = "PROGRAM_USED_SIZE", nullable = false)
    public Integer getProgramUsedSize() {
        return programUsedSize;
    }

    public void setProgramUsedSize(Integer programUsedSize) {
        this.programUsedSize = programUsedSize;
    }

    @Basic
    @Column(name = "NUMBER_COMPRESSIONS", nullable = true)
    public Integer getNumberCompressions() {
        return numberCompressions;
    }

    public void setNumberCompressions(Integer numberCompressions) {
        this.numberCompressions = numberCompressions;
    }

    @Basic
    @Column(name = "STATEMENT_CONTENTION_COUNT", nullable = true)
    public Long getStatementContentionCount() {
        return statementContentionCount;
    }

    public void setStatementContentionCount(Long statementContentionCount) {
        this.statementContentionCount = statementContentionCount;
    }

    @Basic
    @Column(name = "ORIGINAL_SOURCE_FILE", nullable = true, length = 128)
    public String getOriginalSourceFile() {
        return originalSourceFile;
    }

    public void setOriginalSourceFile(String originalSourceFile) {
        this.originalSourceFile = originalSourceFile;
    }

    @Basic
    @Column(name = "ORIGINAL_SOURCE_FILE_CCSID", nullable = true)
    public Integer getOriginalSourceFileCcsid() {
        return originalSourceFileCcsid;
    }

    public void setOriginalSourceFileCcsid(Integer originalSourceFileCcsid) {
        this.originalSourceFileCcsid = originalSourceFileCcsid;
    }

    @Basic
    @Column(name = "ROUTINE_TYPE", nullable = true, length = 9)
    public String getRoutineType() {
        return routineType;
    }

    public void setRoutineType(String routineType) {
        this.routineType = routineType;
    }

    @Basic
    @Column(name = "ROUTINE_BODY", nullable = true, length = 8)
    public String getRoutineBody() {
        return routineBody;
    }

    public void setRoutineBody(String routineBody) {
        this.routineBody = routineBody;
    }

    @Basic
    @Column(name = "FUNCTION_ORIGIN", nullable = true, length = 1)
    public String getFunctionOrigin() {
        return functionOrigin;
    }

    public void setFunctionOrigin(String functionOrigin) {
        this.functionOrigin = functionOrigin;
    }

    @Basic
    @Column(name = "FUNCTION_TYPE", nullable = true, length = 1)
    public String getFunctionType() {
        return functionType;
    }

    public void setFunctionType(String functionType) {
        this.functionType = functionType;
    }

    @Basic
    @Column(name = "NUMBER_EXTERNAL_ROUTINES", nullable = true)
    public Short getNumberExternalRoutines() {
        return numberExternalRoutines;
    }

    public void setNumberExternalRoutines(Short numberExternalRoutines) {
        this.numberExternalRoutines = numberExternalRoutines;
    }

    @Basic
    @Column(name = "EXTENDED_INDICATOR", nullable = true, length = 9)
    public String getExtendedIndicator() {
        return extendedIndicator;
    }

    public void setExtendedIndicator(String extendedIndicator) {
        this.extendedIndicator = extendedIndicator;
    }

    @Basic
    @Column(name = "C_NUL_REQUIRED", nullable = true, length = 10)
    public String getcNulRequired() {
        return cNulRequired;
    }

    public void setcNulRequired(String cNulRequired) {
        this.cNulRequired = cNulRequired;
    }

    @Basic
    @Column(name = "NAMING", nullable = true, length = 4)
    public String getNaming() {
        return naming;
    }

    public void setNaming(String naming) {
        this.naming = naming;
    }

    @Basic
    @Column(name = "TARGET_RELEASE", nullable = true, length = 6)
    public String getTargetRelease() {
        return targetRelease;
    }

    public void setTargetRelease(String targetRelease) {
        this.targetRelease = targetRelease;
    }

    @Basic
    @Column(name = "EARLIEST_POSSIBLE_RELEASE", nullable = true, length = 6)
    public String getEarliestPossibleRelease() {
        return earliestPossibleRelease;
    }

    public void setEarliestPossibleRelease(String earliestPossibleRelease) {
        this.earliestPossibleRelease = earliestPossibleRelease;
    }

    @Basic
    @Column(name = "RDB", nullable = true, length = 18)
    public String getRdb() {
        return rdb;
    }

    public void setRdb(String rdb) {
        this.rdb = rdb;
    }

    @Basic
    @Column(name = "CONSISTENCY_TOKEN", nullable = true)
    public byte[] getConsistencyToken() {
        return consistencyToken;
    }

    public void setConsistencyToken(byte[] consistencyToken) {
        this.consistencyToken = consistencyToken;
    }

    @Basic
    @Column(name = "ALLOW_COPY_DATA", nullable = true, length = 9)
    public String getAllowCopyData() {
        return allowCopyData;
    }

    public void setAllowCopyData(String allowCopyData) {
        this.allowCopyData = allowCopyData;
    }

    @Basic
    @Column(name = "CLOSE_SQL_CURSOR", nullable = true, length = 10)
    public String getCloseSqlCursor() {
        return closeSqlCursor;
    }

    public void setCloseSqlCursor(String closeSqlCursor) {
        this.closeSqlCursor = closeSqlCursor;
    }

    @Basic
    @Column(name = "LOB_FETCH_OPTIMIZATION", nullable = true, length = 9)
    public String getLobFetchOptimization() {
        return lobFetchOptimization;
    }

    public void setLobFetchOptimization(String lobFetchOptimization) {
        this.lobFetchOptimization = lobFetchOptimization;
    }

    @Basic
    @Column(name = "DECIMAL_POINT", nullable = true, length = 7)
    public String getDecimalPoint() {
        return decimalPoint;
    }

    public void setDecimalPoint(String decimalPoint) {
        this.decimalPoint = decimalPoint;
    }

    @Basic
    @Column(name = "SQL_STRING_DELIMITER", nullable = true, length = 9)
    public String getSqlStringDelimiter() {
        return sqlStringDelimiter;
    }

    public void setSqlStringDelimiter(String sqlStringDelimiter) {
        this.sqlStringDelimiter = sqlStringDelimiter;
    }

    @Basic
    @Column(name = "DATE_FORMAT", nullable = true, length = 4)
    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    @Basic
    @Column(name = "DATE_SEPARATOR", nullable = true, length = 1)
    public String getDateSeparator() {
        return dateSeparator;
    }

    public void setDateSeparator(String dateSeparator) {
        this.dateSeparator = dateSeparator;
    }

    @Basic
    @Column(name = "TIME_FORMAT", nullable = true, length = 4)
    public String getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    @Basic
    @Column(name = "TIME_SEPARATOR", nullable = true, length = 1)
    public String getTimeSeparator() {
        return timeSeparator;
    }

    public void setTimeSeparator(String timeSeparator) {
        this.timeSeparator = timeSeparator;
    }

    @Basic
    @Column(name = "DYNAMIC_DEFAULT_SCHEMA", nullable = true, length = 4)
    public String getDynamicDefaultSchema() {
        return dynamicDefaultSchema;
    }

    public void setDynamicDefaultSchema(String dynamicDefaultSchema) {
        this.dynamicDefaultSchema = dynamicDefaultSchema;
    }

    @Basic
    @Column(name = "CURRENT_RULES", nullable = true, length = 4)
    public String getCurrentRules() {
        return currentRules;
    }

    public void setCurrentRules(String currentRules) {
        this.currentRules = currentRules;
    }

    @Basic
    @Column(name = "ALLOW_BLOCK", nullable = true, length = 8)
    public String getAllowBlock() {
        return allowBlock;
    }

    public void setAllowBlock(String allowBlock) {
        this.allowBlock = allowBlock;
    }

    @Basic
    @Column(name = "DELAY_PREPARE", nullable = true, length = 4)
    public String getDelayPrepare() {
        return delayPrepare;
    }

    public void setDelayPrepare(String delayPrepare) {
        this.delayPrepare = delayPrepare;
    }

    @Basic
    @Column(name = "USER_PROFILE", nullable = true, length = 7)
    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    }

    @Basic
    @Column(name = "DYNAMIC_USER_PROFILE", nullable = true, length = 6)
    public String getDynamicUserProfile() {
        return dynamicUserProfile;
    }

    public void setDynamicUserProfile(String dynamicUserProfile) {
        this.dynamicUserProfile = dynamicUserProfile;
    }

    @Basic
    @Column(name = "SORT_SEQUENCE", nullable = true, length = 12)
    public String getSortSequence() {
        return sortSequence;
    }

    public void setSortSequence(String sortSequence) {
        this.sortSequence = sortSequence;
    }

    @Basic
    @Column(name = "LANGUAGE_IDENTIFIER", nullable = true, length = 3)
    public String getLanguageIdentifier() {
        return languageIdentifier;
    }

    public void setLanguageIdentifier(String languageIdentifier) {
        this.languageIdentifier = languageIdentifier;
    }

    @Basic
    @Column(name = "SORT_SEQUENCE_SCHEMA", nullable = true, length = 10)
    public String getSortSequenceSchema() {
        return sortSequenceSchema;
    }

    public void setSortSequenceSchema(String sortSequenceSchema) {
        this.sortSequenceSchema = sortSequenceSchema;
    }

    @Basic
    @Column(name = "SORT_SEQUENCE_NAME", nullable = true, length = 10)
    public String getSortSequenceName() {
        return sortSequenceName;
    }

    public void setSortSequenceName(String sortSequenceName) {
        this.sortSequenceName = sortSequenceName;
    }

    @Basic
    @Column(name = "RDB_CONNECTION_METHOD", nullable = true, length = 4)
    public String getRdbConnectionMethod() {
        return rdbConnectionMethod;
    }

    public void setRdbConnectionMethod(String rdbConnectionMethod) {
        this.rdbConnectionMethod = rdbConnectionMethod;
    }

    @Basic
    @Column(name = "DECRESULT_MAXIMUM_PRECISION", nullable = true)
    public Short getDecresultMaximumPrecision() {
        return decresultMaximumPrecision;
    }

    public void setDecresultMaximumPrecision(Short decresultMaximumPrecision) {
        this.decresultMaximumPrecision = decresultMaximumPrecision;
    }

    @Basic
    @Column(name = "DECRESULT_MAXIMUM_SCALE", nullable = true)
    public Short getDecresultMaximumScale() {
        return decresultMaximumScale;
    }

    public void setDecresultMaximumScale(Short decresultMaximumScale) {
        this.decresultMaximumScale = decresultMaximumScale;
    }

    @Basic
    @Column(name = "DECRESULT_MINIMUM_DIVIDE_SCALE", nullable = true)
    public Short getDecresultMinimumDivideScale() {
        return decresultMinimumDivideScale;
    }

    public void setDecresultMinimumDivideScale(Short decresultMinimumDivideScale) {
        this.decresultMinimumDivideScale = decresultMinimumDivideScale;
    }

    @Basic
    @Column(name = "DECFLOAT_ROUNDING_MODE", nullable = true, length = 8)
    public String getDecfloatRoundingMode() {
        return decfloatRoundingMode;
    }

    public void setDecfloatRoundingMode(String decfloatRoundingMode) {
        this.decfloatRoundingMode = decfloatRoundingMode;
    }

    @Basic
    @Column(name = "DECFLOAT_WARNING", nullable = true, length = 3)
    public String getDecfloatWarning() {
        return decfloatWarning;
    }

    public void setDecfloatWarning(String decfloatWarning) {
        this.decfloatWarning = decfloatWarning;
    }

    @Basic
    @Column(name = "SQLPATH", nullable = true, length = 3483)
    public String getSqlpath() {
        return sqlpath;
    }

    public void setSqlpath(String sqlpath) {
        this.sqlpath = sqlpath;
    }

    @Basic
    @Column(name = "DBGVIEW", nullable = true, length = 9)
    public String getDbgview() {
        return dbgview;
    }

    public void setDbgview(String dbgview) {
        this.dbgview = dbgview;
    }

    @Basic
    @Column(name = "DBGKEY", nullable = true, length = 3)
    public String getDbgkey() {
        return dbgkey;
    }

    public void setDbgkey(String dbgkey) {
        this.dbgkey = dbgkey;
    }

    @Basic
    @Column(name = "LAST_USED_TIMESTAMP", nullable = true)
    public Timestamp getLastUsedTimestamp() {
        return lastUsedTimestamp;
    }

    public void setLastUsedTimestamp(Timestamp lastUsedTimestamp) {
        this.lastUsedTimestamp = lastUsedTimestamp;
    }

    @Basic
    @Column(name = "DAYS_USED_COUNT", nullable = false)
    public Integer getDaysUsedCount() {
        return daysUsedCount;
    }

    public void setDaysUsedCount(Integer daysUsedCount) {
        this.daysUsedCount = daysUsedCount;
    }

    @Basic
    @Column(name = "LAST_RESET_TIMESTAMP", nullable = true)
    public Timestamp getLastResetTimestamp() {
        return lastResetTimestamp;
    }

    public void setLastResetTimestamp(Timestamp lastResetTimestamp) {
        this.lastResetTimestamp = lastResetTimestamp;
    }

    @Basic
    @Column(name = "SYSTEM_PROGRAM_NAME", nullable = false, length = 10)
    public String getSystemProgramName() {
        return systemProgramName;
    }

    public void setSystemProgramName(String systemProgramName) {
        this.systemProgramName = systemProgramName;
    }

    @Basic
    @Column(name = "SYSTEM_PROGRAM_SCHEMA", nullable = false, length = 10)
    public String getSystemProgramSchema() {
        return systemProgramSchema;
    }

    public void setSystemProgramSchema(String systemProgramSchema) {
        this.systemProgramSchema = systemProgramSchema;
    }

    @Basic
    @Column(name = "IASP_NUMBER", nullable = false)
    public Integer getIaspNumber() {
        return iaspNumber;
    }

    public void setIaspNumber(Integer iaspNumber) {
        this.iaspNumber = iaspNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sysprogramstat that = (Sysprogramstat) o;

        if (programSchema != null ? !programSchema.equals(that.programSchema) : that.programSchema != null)
            return false;
        if (programName != null ? !programName.equals(that.programName) : that.programName != null) return false;
        if (programType != null ? !programType.equals(that.programType) : that.programType != null) return false;
        if (moduleName != null ? !moduleName.equals(that.moduleName) : that.moduleName != null) return false;
        if (programOwner != null ? !programOwner.equals(that.programOwner) : that.programOwner != null) return false;
        if (programCreator != null ? !programCreator.equals(that.programCreator) : that.programCreator != null)
            return false;
        if (creationTimestamp != null ? !creationTimestamp.equals(that.creationTimestamp) : that.creationTimestamp != null)
            return false;
        if (defaultSchema != null ? !defaultSchema.equals(that.defaultSchema) : that.defaultSchema != null)
            return false;
        if (isolation != null ? !isolation.equals(that.isolation) : that.isolation != null) return false;
        if (concurrentaccessresolution != null ? !concurrentaccessresolution.equals(that.concurrentaccessresolution) : that.concurrentaccessresolution != null)
            return false;
        if (numberStatements != null ? !numberStatements.equals(that.numberStatements) : that.numberStatements != null)
            return false;
        if (programUsedSize != null ? !programUsedSize.equals(that.programUsedSize) : that.programUsedSize != null)
            return false;
        if (numberCompressions != null ? !numberCompressions.equals(that.numberCompressions) : that.numberCompressions != null)
            return false;
        if (statementContentionCount != null ? !statementContentionCount.equals(that.statementContentionCount) : that.statementContentionCount != null)
            return false;
        if (originalSourceFile != null ? !originalSourceFile.equals(that.originalSourceFile) : that.originalSourceFile != null)
            return false;
        if (originalSourceFileCcsid != null ? !originalSourceFileCcsid.equals(that.originalSourceFileCcsid) : that.originalSourceFileCcsid != null)
            return false;
        if (routineType != null ? !routineType.equals(that.routineType) : that.routineType != null) return false;
        if (routineBody != null ? !routineBody.equals(that.routineBody) : that.routineBody != null) return false;
        if (functionOrigin != null ? !functionOrigin.equals(that.functionOrigin) : that.functionOrigin != null)
            return false;
        if (functionType != null ? !functionType.equals(that.functionType) : that.functionType != null) return false;
        if (numberExternalRoutines != null ? !numberExternalRoutines.equals(that.numberExternalRoutines) : that.numberExternalRoutines != null)
            return false;
        if (extendedIndicator != null ? !extendedIndicator.equals(that.extendedIndicator) : that.extendedIndicator != null)
            return false;
        if (cNulRequired != null ? !cNulRequired.equals(that.cNulRequired) : that.cNulRequired != null) return false;
        if (naming != null ? !naming.equals(that.naming) : that.naming != null) return false;
        if (targetRelease != null ? !targetRelease.equals(that.targetRelease) : that.targetRelease != null)
            return false;
        if (earliestPossibleRelease != null ? !earliestPossibleRelease.equals(that.earliestPossibleRelease) : that.earliestPossibleRelease != null)
            return false;
        if (rdb != null ? !rdb.equals(that.rdb) : that.rdb != null) return false;
        if (!Arrays.equals(consistencyToken, that.consistencyToken)) return false;
        if (allowCopyData != null ? !allowCopyData.equals(that.allowCopyData) : that.allowCopyData != null)
            return false;
        if (closeSqlCursor != null ? !closeSqlCursor.equals(that.closeSqlCursor) : that.closeSqlCursor != null)
            return false;
        if (lobFetchOptimization != null ? !lobFetchOptimization.equals(that.lobFetchOptimization) : that.lobFetchOptimization != null)
            return false;
        if (decimalPoint != null ? !decimalPoint.equals(that.decimalPoint) : that.decimalPoint != null) return false;
        if (sqlStringDelimiter != null ? !sqlStringDelimiter.equals(that.sqlStringDelimiter) : that.sqlStringDelimiter != null)
            return false;
        if (dateFormat != null ? !dateFormat.equals(that.dateFormat) : that.dateFormat != null) return false;
        if (dateSeparator != null ? !dateSeparator.equals(that.dateSeparator) : that.dateSeparator != null)
            return false;
        if (timeFormat != null ? !timeFormat.equals(that.timeFormat) : that.timeFormat != null) return false;
        if (timeSeparator != null ? !timeSeparator.equals(that.timeSeparator) : that.timeSeparator != null)
            return false;
        if (dynamicDefaultSchema != null ? !dynamicDefaultSchema.equals(that.dynamicDefaultSchema) : that.dynamicDefaultSchema != null)
            return false;
        if (currentRules != null ? !currentRules.equals(that.currentRules) : that.currentRules != null) return false;
        if (allowBlock != null ? !allowBlock.equals(that.allowBlock) : that.allowBlock != null) return false;
        if (delayPrepare != null ? !delayPrepare.equals(that.delayPrepare) : that.delayPrepare != null) return false;
        if (userProfile != null ? !userProfile.equals(that.userProfile) : that.userProfile != null) return false;
        if (dynamicUserProfile != null ? !dynamicUserProfile.equals(that.dynamicUserProfile) : that.dynamicUserProfile != null)
            return false;
        if (sortSequence != null ? !sortSequence.equals(that.sortSequence) : that.sortSequence != null) return false;
        if (languageIdentifier != null ? !languageIdentifier.equals(that.languageIdentifier) : that.languageIdentifier != null)
            return false;
        if (sortSequenceSchema != null ? !sortSequenceSchema.equals(that.sortSequenceSchema) : that.sortSequenceSchema != null)
            return false;
        if (sortSequenceName != null ? !sortSequenceName.equals(that.sortSequenceName) : that.sortSequenceName != null)
            return false;
        if (rdbConnectionMethod != null ? !rdbConnectionMethod.equals(that.rdbConnectionMethod) : that.rdbConnectionMethod != null)
            return false;
        if (decresultMaximumPrecision != null ? !decresultMaximumPrecision.equals(that.decresultMaximumPrecision) : that.decresultMaximumPrecision != null)
            return false;
        if (decresultMaximumScale != null ? !decresultMaximumScale.equals(that.decresultMaximumScale) : that.decresultMaximumScale != null)
            return false;
        if (decresultMinimumDivideScale != null ? !decresultMinimumDivideScale.equals(that.decresultMinimumDivideScale) : that.decresultMinimumDivideScale != null)
            return false;
        if (decfloatRoundingMode != null ? !decfloatRoundingMode.equals(that.decfloatRoundingMode) : that.decfloatRoundingMode != null)
            return false;
        if (decfloatWarning != null ? !decfloatWarning.equals(that.decfloatWarning) : that.decfloatWarning != null)
            return false;
        if (sqlpath != null ? !sqlpath.equals(that.sqlpath) : that.sqlpath != null) return false;
        if (dbgview != null ? !dbgview.equals(that.dbgview) : that.dbgview != null) return false;
        if (dbgkey != null ? !dbgkey.equals(that.dbgkey) : that.dbgkey != null) return false;
        if (lastUsedTimestamp != null ? !lastUsedTimestamp.equals(that.lastUsedTimestamp) : that.lastUsedTimestamp != null)
            return false;
        if (daysUsedCount != null ? !daysUsedCount.equals(that.daysUsedCount) : that.daysUsedCount != null)
            return false;
        if (lastResetTimestamp != null ? !lastResetTimestamp.equals(that.lastResetTimestamp) : that.lastResetTimestamp != null)
            return false;
        if (systemProgramName != null ? !systemProgramName.equals(that.systemProgramName) : that.systemProgramName != null)
            return false;
        if (systemProgramSchema != null ? !systemProgramSchema.equals(that.systemProgramSchema) : that.systemProgramSchema != null)
            return false;
        if (iaspNumber != null ? !iaspNumber.equals(that.iaspNumber) : that.iaspNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = programSchema != null ? programSchema.hashCode() : 0;
        result = 31 * result + (programName != null ? programName.hashCode() : 0);
        result = 31 * result + (programType != null ? programType.hashCode() : 0);
        result = 31 * result + (moduleName != null ? moduleName.hashCode() : 0);
        result = 31 * result + (programOwner != null ? programOwner.hashCode() : 0);
        result = 31 * result + (programCreator != null ? programCreator.hashCode() : 0);
        result = 31 * result + (creationTimestamp != null ? creationTimestamp.hashCode() : 0);
        result = 31 * result + (defaultSchema != null ? defaultSchema.hashCode() : 0);
        result = 31 * result + (isolation != null ? isolation.hashCode() : 0);
        result = 31 * result + (concurrentaccessresolution != null ? concurrentaccessresolution.hashCode() : 0);
        result = 31 * result + (numberStatements != null ? numberStatements.hashCode() : 0);
        result = 31 * result + (programUsedSize != null ? programUsedSize.hashCode() : 0);
        result = 31 * result + (numberCompressions != null ? numberCompressions.hashCode() : 0);
        result = 31 * result + (statementContentionCount != null ? statementContentionCount.hashCode() : 0);
        result = 31 * result + (originalSourceFile != null ? originalSourceFile.hashCode() : 0);
        result = 31 * result + (originalSourceFileCcsid != null ? originalSourceFileCcsid.hashCode() : 0);
        result = 31 * result + (routineType != null ? routineType.hashCode() : 0);
        result = 31 * result + (routineBody != null ? routineBody.hashCode() : 0);
        result = 31 * result + (functionOrigin != null ? functionOrigin.hashCode() : 0);
        result = 31 * result + (functionType != null ? functionType.hashCode() : 0);
        result = 31 * result + (numberExternalRoutines != null ? numberExternalRoutines.hashCode() : 0);
        result = 31 * result + (extendedIndicator != null ? extendedIndicator.hashCode() : 0);
        result = 31 * result + (cNulRequired != null ? cNulRequired.hashCode() : 0);
        result = 31 * result + (naming != null ? naming.hashCode() : 0);
        result = 31 * result + (targetRelease != null ? targetRelease.hashCode() : 0);
        result = 31 * result + (earliestPossibleRelease != null ? earliestPossibleRelease.hashCode() : 0);
        result = 31 * result + (rdb != null ? rdb.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(consistencyToken);
        result = 31 * result + (allowCopyData != null ? allowCopyData.hashCode() : 0);
        result = 31 * result + (closeSqlCursor != null ? closeSqlCursor.hashCode() : 0);
        result = 31 * result + (lobFetchOptimization != null ? lobFetchOptimization.hashCode() : 0);
        result = 31 * result + (decimalPoint != null ? decimalPoint.hashCode() : 0);
        result = 31 * result + (sqlStringDelimiter != null ? sqlStringDelimiter.hashCode() : 0);
        result = 31 * result + (dateFormat != null ? dateFormat.hashCode() : 0);
        result = 31 * result + (dateSeparator != null ? dateSeparator.hashCode() : 0);
        result = 31 * result + (timeFormat != null ? timeFormat.hashCode() : 0);
        result = 31 * result + (timeSeparator != null ? timeSeparator.hashCode() : 0);
        result = 31 * result + (dynamicDefaultSchema != null ? dynamicDefaultSchema.hashCode() : 0);
        result = 31 * result + (currentRules != null ? currentRules.hashCode() : 0);
        result = 31 * result + (allowBlock != null ? allowBlock.hashCode() : 0);
        result = 31 * result + (delayPrepare != null ? delayPrepare.hashCode() : 0);
        result = 31 * result + (userProfile != null ? userProfile.hashCode() : 0);
        result = 31 * result + (dynamicUserProfile != null ? dynamicUserProfile.hashCode() : 0);
        result = 31 * result + (sortSequence != null ? sortSequence.hashCode() : 0);
        result = 31 * result + (languageIdentifier != null ? languageIdentifier.hashCode() : 0);
        result = 31 * result + (sortSequenceSchema != null ? sortSequenceSchema.hashCode() : 0);
        result = 31 * result + (sortSequenceName != null ? sortSequenceName.hashCode() : 0);
        result = 31 * result + (rdbConnectionMethod != null ? rdbConnectionMethod.hashCode() : 0);
        result = 31 * result + (decresultMaximumPrecision != null ? decresultMaximumPrecision.hashCode() : 0);
        result = 31 * result + (decresultMaximumScale != null ? decresultMaximumScale.hashCode() : 0);
        result = 31 * result + (decresultMinimumDivideScale != null ? decresultMinimumDivideScale.hashCode() : 0);
        result = 31 * result + (decfloatRoundingMode != null ? decfloatRoundingMode.hashCode() : 0);
        result = 31 * result + (decfloatWarning != null ? decfloatWarning.hashCode() : 0);
        result = 31 * result + (sqlpath != null ? sqlpath.hashCode() : 0);
        result = 31 * result + (dbgview != null ? dbgview.hashCode() : 0);
        result = 31 * result + (dbgkey != null ? dbgkey.hashCode() : 0);
        result = 31 * result + (lastUsedTimestamp != null ? lastUsedTimestamp.hashCode() : 0);
        result = 31 * result + (daysUsedCount != null ? daysUsedCount.hashCode() : 0);
        result = 31 * result + (lastResetTimestamp != null ? lastResetTimestamp.hashCode() : 0);
        result = 31 * result + (systemProgramName != null ? systemProgramName.hashCode() : 0);
        result = 31 * result + (systemProgramSchema != null ? systemProgramSchema.hashCode() : 0);
        result = 31 * result + (iaspNumber != null ? iaspNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Sysprogramstat{" +
                "programSchema='" + programSchema + '\'' +
                ", programName='" + programName + '\'' +
                ", programType='" + programType + '\'' +
                ", moduleName='" + moduleName + '\'' +
                ", programOwner='" + programOwner + '\'' +
                ", programCreator='" + programCreator + '\'' +
                ", creationTimestamp=" + creationTimestamp +
                ", defaultSchema='" + defaultSchema + '\'' +
                ", isolation='" + isolation + '\'' +
                ", concurrentaccessresolution='" + concurrentaccessresolution + '\'' +
                ", numberStatements=" + numberStatements +
                ", programUsedSize=" + programUsedSize +
                ", numberCompressions=" + numberCompressions +
                ", statementContentionCount=" + statementContentionCount +
                ", originalSourceFile='" + originalSourceFile + '\'' +
                ", originalSourceFileCcsid=" + originalSourceFileCcsid +
                ", routineType='" + routineType + '\'' +
                ", routineBody='" + routineBody + '\'' +
                ", functionOrigin='" + functionOrigin + '\'' +
                ", functionType='" + functionType + '\'' +
                ", numberExternalRoutines=" + numberExternalRoutines +
                ", extendedIndicator='" + extendedIndicator + '\'' +
                ", cNulRequired='" + cNulRequired + '\'' +
                ", naming='" + naming + '\'' +
                ", targetRelease='" + targetRelease + '\'' +
                ", earliestPossibleRelease='" + earliestPossibleRelease + '\'' +
                ", rdb='" + rdb + '\'' +
                ", consistencyToken=" + Arrays.toString(consistencyToken) +
                ", allowCopyData='" + allowCopyData + '\'' +
                ", closeSqlCursor='" + closeSqlCursor + '\'' +
                ", lobFetchOptimization='" + lobFetchOptimization + '\'' +
                ", decimalPoint='" + decimalPoint + '\'' +
                ", sqlStringDelimiter='" + sqlStringDelimiter + '\'' +
                ", dateFormat='" + dateFormat + '\'' +
                ", dateSeparator='" + dateSeparator + '\'' +
                ", timeFormat='" + timeFormat + '\'' +
                ", timeSeparator='" + timeSeparator + '\'' +
                ", dynamicDefaultSchema='" + dynamicDefaultSchema + '\'' +
                ", currentRules='" + currentRules + '\'' +
                ", allowBlock='" + allowBlock + '\'' +
                ", delayPrepare='" + delayPrepare + '\'' +
                ", userProfile='" + userProfile + '\'' +
                ", dynamicUserProfile='" + dynamicUserProfile + '\'' +
                ", sortSequence='" + sortSequence + '\'' +
                ", languageIdentifier='" + languageIdentifier + '\'' +
                ", sortSequenceSchema='" + sortSequenceSchema + '\'' +
                ", sortSequenceName='" + sortSequenceName + '\'' +
                ", rdbConnectionMethod='" + rdbConnectionMethod + '\'' +
                ", decresultMaximumPrecision=" + decresultMaximumPrecision +
                ", decresultMaximumScale=" + decresultMaximumScale +
                ", decresultMinimumDivideScale=" + decresultMinimumDivideScale +
                ", decfloatRoundingMode='" + decfloatRoundingMode + '\'' +
                ", decfloatWarning='" + decfloatWarning + '\'' +
                ", sqlpath='" + sqlpath + '\'' +
                ", dbgview='" + dbgview + '\'' +
                ", dbgkey='" + dbgkey + '\'' +
                ", lastUsedTimestamp=" + lastUsedTimestamp +
                ", daysUsedCount=" + daysUsedCount +
                ", lastResetTimestamp=" + lastResetTimestamp +
                ", systemProgramName='" + systemProgramName + '\'' +
                ", systemProgramSchema='" + systemProgramSchema + '\'' +
                ", iaspNumber=" + iaspNumber +
                '}';
    }
}