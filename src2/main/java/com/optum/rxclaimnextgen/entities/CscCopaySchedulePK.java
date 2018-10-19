package com.optum.rxclaimnextgen.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by bkocinsk on 8/3/2018.
 */
public class CscCopaySchedulePK implements Serializable {

    private String copayScheduleName;
    private int stepNbr;

    public CscCopaySchedulePK() {
        super();
    }

    public CscCopaySchedulePK(String copayScheduleName, int stepNbr) {
        super();
        this.copayScheduleName = copayScheduleName;
        this.stepNbr = stepNbr;
    }

    @Id
    @Column(name = "CBGRCD")
    public String getCopayScheduleName() {
        return copayScheduleName;
    }

    public void setCopayScheduleName(String copayScheduleName) {
        this.copayScheduleName = copayScheduleName;
    }

    @Id
    @Column(name = "CBELNB")
    public int getStepNbr() {
        return stepNbr;
    }

    public void setStepNbr(int stepNbr) { this.stepNbr = stepNbr; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CscCopaySchedulePK that = (CscCopaySchedulePK) o;

        if (stepNbr != that.stepNbr) return false;
        return copayScheduleName != null ? copayScheduleName.equals(that.copayScheduleName) : that.copayScheduleName == null;
    }

    @Override
    public int hashCode() {
        int result = copayScheduleName != null ? copayScheduleName.hashCode() : 0;
        result = 31 * result + stepNbr;
        return result;
    }

    @Override
    public String toString() {
        return "CscCopaySchedulePK{" +
                "copayScheduleName='" + copayScheduleName + '\'' +
                ", stepNbr=" + stepNbr +
                '}';
    }
}
