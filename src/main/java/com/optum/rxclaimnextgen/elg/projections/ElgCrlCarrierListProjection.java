package com.optum.rxclaimnextgen.elg.projections;



/**
 * Created by bkocinsk on 7/3/2018.
 *
 * This projection allows retrieval of just the Carrier name and
 * carrier description from the ELG_CRL_CARRIER_LIST table.
 */
public interface ElgCrlCarrierListProjection {

    public String getCrlCarrierListName();

    public String getCrlCarrierListDesc();
}