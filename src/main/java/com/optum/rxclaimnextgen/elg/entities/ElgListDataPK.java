package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by bkocinsk on 9/20/2018.
 */
public class ElgListDataPK implements Serializable {
    private String listId;
    private String valueId;

    @Column(name = "LIST_ID")
    @Id
    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    @Column(name = "VALUE_ID")
    @Id
    public String getValueId() {
        return valueId;
    }

    public void setValueId(String valueId) {
        this.valueId = valueId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElgListDataPK that = (ElgListDataPK) o;

        if (listId != null ? !listId.equals(that.listId) : that.listId != null) return false;
        if (valueId != null ? !valueId.equals(that.valueId) : that.valueId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = listId != null ? listId.hashCode() : 0;
        result = 31 * result + (valueId != null ? valueId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ElgListDataPK{" +
                "listId='" + listId + '\'' +
                ", valueId='" + valueId + '\'' +
                '}';
    }
}
