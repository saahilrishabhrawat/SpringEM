package com.optum.ibm.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by bkocinsk on 6/15/2018.
 */
public class SysprogramstatPK implements Serializable {
    private String programSchema;
    private String programName;
    private String programType;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysprogramstatPK that = (SysprogramstatPK) o;

        if (programSchema != null ? !programSchema.equals(that.programSchema) : that.programSchema != null)
            return false;
        if (programName != null ? !programName.equals(that.programName) : that.programName != null) return false;
        return programType != null ? programType.equals(that.programType) : that.programType == null;
    }

    @Override
    public int hashCode() {
        int result = programSchema != null ? programSchema.hashCode() : 0;
        result = 31 * result + (programName != null ? programName.hashCode() : 0);
        result = 31 * result + (programType != null ? programType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SysprogramstatPK{" +
                "programSchema='" + programSchema + '\'' +
                ", programName='" + programName + '\'' +
                ", programType='" + programType + '\'' +
                '}';
    }
}
