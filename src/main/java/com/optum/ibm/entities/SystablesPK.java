package com.optum.ibm.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by bkocinsk on 6/13/2018.
 */
public class SystablesPK implements Serializable {
    private String tableName;
    private String tableSchema;

    @Id
    @Column(name = "TABLE_NAME", nullable = false, length = 128)
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


    @Id
    @Column(name = "TABLE_SCHEMA", nullable = false, length = 128)
    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystablesPK that = (SystablesPK) o;

        if (!tableName.equals(that.tableName)) return false;
        return tableSchema.equals(that.tableSchema);
    }

    @Override
    public int hashCode() {
        int result = tableName.hashCode();
        result = 31 * result + tableSchema.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "SystablesPK{" +
                "tableName='" + tableName + '\'' +
                ", tableSchema='" + tableSchema + '\'' +
                '}';
    }
}


