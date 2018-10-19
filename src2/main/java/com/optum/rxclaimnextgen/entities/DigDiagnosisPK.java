package com.optum.rxclaimnextgen.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by James Sheputis on 8/30/2018.
 */
public class DigDiagnosisPK implements Serializable {

    private String qualifier;
    private String typeCode;
    private String diagnosisCode;

    public DigDiagnosisPK() {
        super();
    }

    public DigDiagnosisPK(String qualifier, String typeCode, String diagnosisCode) {
        super();
        this.qualifier = qualifier;
        this.typeCode = typeCode;
        this.diagnosisCode = diagnosisCode;
    }

    @Id
    @Column(name = "AXSHAQ")
    public String getQualifier() {
        return qualifier;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    @Id
    @Column(name = "AXSIAQ")
    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    @Id
    @Column(name = "AXBLCD")
    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DigDiagnosisPK that = (DigDiagnosisPK) o;
        return Objects.equals(qualifier, that.qualifier) &&
                Objects.equals(typeCode, that.typeCode) &&
                Objects.equals(diagnosisCode, that.diagnosisCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qualifier, typeCode, diagnosisCode);
    }

    @Override
    public String toString() {
        return "DigDiagnosisPK{" +
                "qualifier='" + qualifier + '\'' +
                ", typeCode='" + typeCode + '\'' +
                ", diagnosisCode='" + diagnosisCode + '\'' +
                '}';
    }
}
