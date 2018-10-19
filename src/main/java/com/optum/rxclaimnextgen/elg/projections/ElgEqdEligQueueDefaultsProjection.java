package com.optum.rxclaimnextgen.elg.projections;

import java.math.BigInteger;

public interface ElgEqdEligQueueDefaultsProjection {

    String getCarCarrierId();
    String getEqdAccountId();
    String getEqdGroupId();
    String getEqdReportName();
    String getEqdOutputQueueLibrary();
    String getEqdOutputQueueName();
    BigInteger getEqdNumberOfCopies();
    String getEqdSaveSpoolFile();
    String getEqdHoldSpoolFile();
    String getEqdSpoolFileName();


}
