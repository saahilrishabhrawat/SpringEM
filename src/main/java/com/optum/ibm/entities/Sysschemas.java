package com.optum.ibm.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by bkocinsk on 6/13/2018.
 */
@Entity
@Table(name = "SYSSCHEMAS", schema = "QSYS2")
public class Sysschemas {
    private String schemaName;
    private String schemaOwner;
    private String schemaCreator;
    private Timestamp creationTimestamp;
    private Integer schemaSize;
    private String schemaText;
    private String systemSchemaName;
    private Short iaspNumber;

    @Id
    @Column(name = "SCHEMA_NAME", nullable = false, length = 128)
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    @Basic
    @Column(name = "SCHEMA_OWNER", nullable = false, length = 128)
    public String getSchemaOwner() {
        return schemaOwner;
    }

    public void setSchemaOwner(String schemaOwner) {
        this.schemaOwner = schemaOwner;
    }

    @Basic
    @Column(name = "SCHEMA_CREATOR", nullable = false, length = 128)
    public String getSchemaCreator() {
        return schemaCreator;
    }

    public void setSchemaCreator(String schemaCreator) {
        this.schemaCreator = schemaCreator;
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
    @Column(name = "SCHEMA_SIZE", nullable = false, precision = 0)
    public Integer getSchemaSize() {
        return schemaSize;
    }

    public void setSchemaSize(Integer schemaSize) {
        this.schemaSize = schemaSize;
    }

    @Basic
    @Column(name = "SCHEMA_TEXT", nullable = true, length = 50)
    public String getSchemaText() {
        return schemaText;
    }

    public void setSchemaText(String schemaText) {
        this.schemaText = schemaText;
    }

    @Basic
    @Column(name = "SYSTEM_SCHEMA_NAME", nullable = false, length = 10)
    public String getSystemSchemaName() {
        return systemSchemaName;
    }

    public void setSystemSchemaName(String systemSchemaName) {
        this.systemSchemaName = systemSchemaName;
    }

    @Basic
    @Column(name = "IASP_NUMBER", nullable = false)
    public Short getIaspNumber() {
        return iaspNumber;
    }

    public void setIaspNumber(Short iaspNumber) {
        this.iaspNumber = iaspNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sysschemas that = (Sysschemas) o;

        if (schemaName != null ? !schemaName.equals(that.schemaName) : that.schemaName != null) return false;
        if (schemaOwner != null ? !schemaOwner.equals(that.schemaOwner) : that.schemaOwner != null) return false;
        if (schemaCreator != null ? !schemaCreator.equals(that.schemaCreator) : that.schemaCreator != null)
            return false;
        if (creationTimestamp != null ? !creationTimestamp.equals(that.creationTimestamp) : that.creationTimestamp != null)
            return false;
        if (schemaSize != null ? !schemaSize.equals(that.schemaSize) : that.schemaSize != null) return false;
        if (schemaText != null ? !schemaText.equals(that.schemaText) : that.schemaText != null) return false;
        if (systemSchemaName != null ? !systemSchemaName.equals(that.systemSchemaName) : that.systemSchemaName != null)
            return false;
        if (iaspNumber != null ? !iaspNumber.equals(that.iaspNumber) : that.iaspNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schemaName != null ? schemaName.hashCode() : 0;
        result = 31 * result + (schemaOwner != null ? schemaOwner.hashCode() : 0);
        result = 31 * result + (schemaCreator != null ? schemaCreator.hashCode() : 0);
        result = 31 * result + (creationTimestamp != null ? creationTimestamp.hashCode() : 0);
        result = 31 * result + (schemaSize != null ? schemaSize.hashCode() : 0);
        result = 31 * result + (schemaText != null ? schemaText.hashCode() : 0);
        result = 31 * result + (systemSchemaName != null ? systemSchemaName.hashCode() : 0);
        result = 31 * result + (iaspNumber != null ? iaspNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Sysschemas{" +
                "schemaName='" + schemaName + '\'' +
                ", schemaOwner='" + schemaOwner + '\'' +
                ", schemaCreator='" + schemaCreator + '\'' +
                ", creationTimestamp=" + creationTimestamp +
                ", schemaSize=" + schemaSize +
                ", schemaText='" + schemaText + '\'' +
                ", systemSchemaName='" + systemSchemaName + '\'' +
                ", iaspNumber=" + iaspNumber +
                '}';
    }
}