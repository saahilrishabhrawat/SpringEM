package com.optum.ibm.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by bkocinsk on 7/3/2018.
 */
@Entity
@Table(name = "OBJECT_STATISTICS", schema = "QSYS2")
public class ObjectStatistics {
    private String objname;

    @Id
    @Column(name = "OBJNAME", nullable = false)
    public String getObjname() {
        return objname;
    }

    public void setObjname(String objname) {
        this.objname = objname;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObjectStatistics that = (ObjectStatistics) o;

        return objname != null ? objname.equals(that.objname) : that.objname == null;
    }

    @Override
    public int hashCode() {
        return objname != null ? objname.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ObjectStatistics{" +
                "objname='" + objname + '\'' +
                '}';
    }
}
