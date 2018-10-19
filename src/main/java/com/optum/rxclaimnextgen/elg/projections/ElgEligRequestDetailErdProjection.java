package com.optum.rxclaimnextgen.elg.projections;

public interface ElgEligRequestDetailErdProjection {
	
	String getCarCarrierId();
    String getAccountId();
    String getGroupId();
    String getErdTrackingId();
    String getErdLoadType();
    String getErdStatus();
    String getChgDate();
    String getChgUserName();

}
