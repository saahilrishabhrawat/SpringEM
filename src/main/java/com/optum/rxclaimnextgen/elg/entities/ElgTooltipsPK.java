package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by bkocinsk on 8/23/2018.
 */
public class ElgTooltipsPK implements Serializable {
    private String screenTitle;
    private String fieldLabel;

    @Column(name = "SCREEN_TITLE")
    @Id
    public String getScreenTitle() {
        return screenTitle;
    }

    public void setScreenTitle(String screenTitle) {
        this.screenTitle = screenTitle;
    }

    @Column(name = "FIELD_LABEL")
    @Id
    public String getFieldLabel() {
        return fieldLabel;
    }

    public void setFieldLabel(String fieldLabel) {
        this.fieldLabel = fieldLabel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElgTooltipsPK that = (ElgTooltipsPK) o;

        if (screenTitle != null ? !screenTitle.equals(that.screenTitle) : that.screenTitle != null) return false;
        if (fieldLabel != null ? !fieldLabel.equals(that.fieldLabel) : that.fieldLabel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = screenTitle != null ? screenTitle.hashCode() : 0;
        result = 31 * result + (fieldLabel != null ? fieldLabel.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ElgTooltipsPK{" +
                "screenTitle='" + screenTitle + '\'' +
                ", fieldLabel='" + fieldLabel + '\'' +
                '}';
    }
}

