package com.optum.rxclaimnextgen.elg.projections;

/**
 * Created by bkocinsk on 7/11/2018.
 *
 * This projection allows retrieval of just the Group name and
 * group description from the ELG_GRL_GROUP_LIST table.
 */
public interface ElgGrlGroupListProjection {

    public String getGrlGroupListName();

    public String getGrlGroupListDescriptn();
}
