package com.optum.rxclaimnextgen.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by bkocinsk on 7/22/2018.
 */
public class PlnPlanPK implements Serializable {

    private String planCode;
    private int planEffDate;
    private int planTermDate;

    public PlnPlanPK() {
        super();
    }

    public PlnPlanPK(String planCode, int planEffDate, int planTermDate) {
        super();
        this.planCode = planCode;
        this.planEffDate = planEffDate;
        this.planTermDate = planTermDate;
    }

    @Id
    @Column(name = "ADAECD")
    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    @Id
    @Column(name = "ADAKDT")
    public int getPlanEffDate() {
        return planEffDate;
    }

    public void setPlanEffDate(int planEffDate) {
        this.planEffDate = planEffDate;
    }

    @Id
    @Column(name = "ADA1DT")
    public int getPlanTermDate() {
        return planTermDate;
    }

    public void setPlanTermDate(int planTermDate) {
        this.planTermDate = planTermDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        com.optum.rxclaimnextgen.entities.PlnPlanPK that = (com.optum.rxclaimnextgen.entities.PlnPlanPK) o;

        if (planEffDate != that.planEffDate) return false;
        if (planTermDate != that.planTermDate) return false;
        return planCode != null ? planCode.equals(that.planCode) : that.planCode == null;
    }

    @Override
    public int hashCode() {
        int result = planCode != null ? planCode.hashCode() : 0;
        result = 31 * result + planEffDate;
        result = 31 * result + planTermDate;
        return result;
    }

    @Override
    public String toString() {
        return "PlnPlanPK{" +
                "planCode='" + planCode + '\'' +
                ", planEffDate=" + planEffDate +
                ", planTermDate=" + planTermDate +
                '}';
    }
}
