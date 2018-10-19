package com.optum.rxclaimnextgen.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by bkocinsk on 7/23/2018.
 */
public class PrfPrescriberIdPK implements Serializable {

    private String prescriberId;
    private String prescriberIdQualifier;
    private String prescriberIdState;

    public PrfPrescriberIdPK() {
        super();
    }

    public PrfPrescriberIdPK(String prescriberId, String prescriberIdQualifier, String prescriberIdState) {
        super();
        this.prescriberId = prescriberId;
        this.prescriberIdQualifier = prescriberIdQualifier;
        this.prescriberIdState = prescriberIdState;
    }

    @Id
    @Column(name = "NYLGHB")

    public String getPrescriberId() {
        return prescriberId;
    }

    public void setPrescriberId(String prescriberId) {
        this.prescriberId = prescriberId;
    }

    @Basic
    @Column(name = "NYXCH6")
    public String getPrescriberIdQualifier() {
        return prescriberIdQualifier;
    }

    public void setPrescriberIdQualifier(String prescriberIdQualifier) {
        this.prescriberIdQualifier = prescriberIdQualifier;
    }

    @Basic
    @Column(name = "NYXEH6")
    public String getPrescriberIdState() {
        return prescriberIdState;
    }

    public void setPrescriberIdState(String prescriberIdState) {
        this.prescriberIdState = prescriberIdState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        com.optum.rxclaimnextgen.entities.PrfPrescriberIdPK that = (com.optum.rxclaimnextgen.entities.PrfPrescriberIdPK) o;

        if (prescriberId != null ? !prescriberId.equals(that.prescriberId) : that.prescriberId != null) return false;
        if (prescriberIdQualifier != null ? !prescriberIdQualifier.equals(that.prescriberIdQualifier) : that.prescriberIdQualifier != null)
            return false;
        return prescriberIdState != null ? prescriberIdState.equals(that.prescriberIdState) : that.prescriberIdState == null;
    }

    @Override
    public int hashCode() {
        int result = prescriberId != null ? prescriberId.hashCode() : 0;
        result = 31 * result + (prescriberIdQualifier != null ? prescriberIdQualifier.hashCode() : 0);
        result = 31 * result + (prescriberIdState != null ? prescriberIdState.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PrfPrescriberIdPK{" +
                "prescriberId='" + prescriberId + '\'' +
                ", prescriberIdQualifier='" + prescriberIdQualifier + '\'' +
                ", prescriberIdState='" + prescriberIdState + '\'' +
                '}';
    }
}
