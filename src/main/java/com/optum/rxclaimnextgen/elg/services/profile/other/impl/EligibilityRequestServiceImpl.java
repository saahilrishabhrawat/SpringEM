package com.optum.rxclaimnextgen.elg.services.profile.other.impl;

import com.optum.rxclaimnextgen.elg.entities.ElgEligRequestDetailErd;
import com.optum.rxclaimnextgen.elg.projections.ElgEligRequestDetailErdProjection;
import com.optum.rxclaimnextgen.elg.repositories.profile.ElgEligRequestDetailErdRepository;
import com.optum.rxclaimnextgen.elg.services.profile.other.EligibilityRequestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EligibilityRequestServiceImpl implements EligibilityRequestService {

    private static final Logger LOG = LoggerFactory.getLogger(EligibilityRequestServiceImpl.class);

    @Autowired
    private ElgEligRequestDetailErdRepository elgEligRequestDetailErdRepository;

    @Override
    public ElgEligRequestDetailErd findByCarCarrierIdAndAccountIdAndGroupIdAndErdTrackingId(String carCarrierId, String accountId, String groupId, int erdTrackingId) {
        return elgEligRequestDetailErdRepository.findByCarCarrierIdAndAccountIdAndGroupIdAndErdTrackingId(carCarrierId, accountId, groupId, erdTrackingId);
    }

    @Override
    public List<ElgEligRequestDetailErd> findByCarCarrierIdAndAccountIdAndGroupId(String carCarrierId, String accountId, String groupId) {
        return elgEligRequestDetailErdRepository.findByCarCarrierIdAndAccountIdAndGroupId(carCarrierId, accountId, groupId);
    }
    
    @Override
    public List<ElgEligRequestDetailErdProjection> getEligibilityRequestDetailForProfile(String carCarrierId, String accountId, String groupId) {         
		return elgEligRequestDetailErdRepository.getEligibilityRequestDetailForProfile(carCarrierId, accountId, groupId);
    }
}
