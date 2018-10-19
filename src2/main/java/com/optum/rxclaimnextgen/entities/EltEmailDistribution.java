package com.optum.rxclaimnextgen.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "RCELTP")
public class EltEmailDistribution {
    private String eltEmailDistListID;
    private String eltEmailDistListName;
    private String addUser;
    private int addDate;
    private int addTime;
    private String addProgram;
    private String chgUser;
    private int chgDate;
    private int chgTime;
    private String chgProgram;

    @Id
    @Column(name = "E1P0HO")
    public String getEltEmailDistListID() {
        return eltEmailDistListID;
    }

    public void setEltEmailDistListID(String eltEmailDistListID) {
        this.eltEmailDistListID = eltEmailDistListID;
    }

    @Basic
    @Column(name = "E1OLIT")
    public String getEltEmailDistListName() {
        return eltEmailDistListName;
    }

    public void setEltEmailDistListName(String eltEmailDistListName) {
        this.eltEmailDistListName = eltEmailDistListName;
    }

    @Basic
    @Column(name = "E1AKVN")
    public String getAddUser() {
        return addUser;
    }

    public void setAddUser(String addUser) {
        this.addUser = addUser;
    }

    @Basic
    @Column(name = "E1C2DT")
    public int getAddDate() {
        return addDate;
    }

    public void setAddDate(int addDate) {
        this.addDate = addDate;
    }

    @Basic
    @Column(name = "E1ADTM")
    public int getAddTime() {
        return addTime;
    }

    public void setAddTime(int addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "E1ALVN")
    public String getAddProgram() {
        return addProgram;
    }

    public void setAddProgram(String addProgram) {
        this.addProgram = addProgram;
    }

    @Basic
    @Column(name = "E1ADVN")
    public String getChgUser() {
        return chgUser;
    }

    public void setChgUser(String chgUser) {
        this.chgUser = chgUser;
    }

    @Basic
    @Column(name = "E1BMDT")
    public int getChgDate() {
        return chgDate;
    }

    public void setChgDate(int chgDate) {
        this.chgDate = chgDate;
    }

    @Basic
    @Column(name = "E1ABTM")
    public int getChgTime() {
        return chgTime;
    }

    public void setChgTime(int chgTime) {
        this.chgTime = chgTime;
    }

    @Basic
    @Column(name = "E1AEVN")
    public String getChgProgram() {
        return chgProgram;
    }

    public void setChgProgram(String chgProgram) {
        this.chgProgram = chgProgram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EltEmailDistribution that = (EltEmailDistribution) o;
        return addDate == that.addDate &&
                addTime == that.addTime &&
                chgDate == that.chgDate &&
                chgTime == that.chgTime &&
                Objects.equals(eltEmailDistListID, that.eltEmailDistListID) &&
                Objects.equals(eltEmailDistListName, that.eltEmailDistListName) &&
                Objects.equals(addUser, that.addUser) &&
                Objects.equals(addProgram, that.addProgram) &&
                Objects.equals(chgUser, that.chgUser) &&
                Objects.equals(chgProgram, that.chgProgram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eltEmailDistListID, eltEmailDistListName, addUser, addDate, addTime, addProgram, chgUser, chgDate, chgTime, chgProgram);
    }
}
