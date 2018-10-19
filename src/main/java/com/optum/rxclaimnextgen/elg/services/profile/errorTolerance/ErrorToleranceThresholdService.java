package com.optum.rxclaimnextgen.elg.services.profile.errorTolerance;

import com.optum.rxclaimnextgen.elg.entities.ElgToleranceCheckDtlEcd;

import java.util.List;

public interface ErrorToleranceThresholdService  {

    List<ElgToleranceCheckDtlEcd> getAllForProfile(String carCarrierId, String accountId, String groupId);

}
