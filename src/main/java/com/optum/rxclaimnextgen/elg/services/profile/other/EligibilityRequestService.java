package com.optum.rxclaimnextgen.elg.services.profile.other;

import com.optum.rxclaimnextgen.elg.entities.ElgEligRequestDetailErd;
import com.optum.rxclaimnextgen.elg.projections.ElgEligRequestDetailErdProjection;

import java.util.List;

public interface EligibilityRequestService {

    ElgEligRequestDetailErd findByCarCarrierIdAndAccountIdAndGroupIdAndErdTrackingId (String carCarrierId, String accountId, String groupId, int erdTrackingId);

    List<ElgEligRequestDetailErd> findByCarCarrierIdAndAccountIdAndGroupId(String carCarrierId, String accountId, String groupId);
    
    List<ElgEligRequestDetailErdProjection> getEligibilityRequestDetailForProfile(String carCarrierId, String accountId, String groupId);

}
