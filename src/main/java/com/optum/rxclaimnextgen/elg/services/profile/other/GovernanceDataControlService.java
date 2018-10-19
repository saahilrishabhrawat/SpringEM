package com.optum.rxclaimnextgen.elg.services.profile.other;

import java.io.IOException;

import com.optum.rxclaimnextgen.elg.entities.ElgEligDataGovernanceEdg;
import com.optum.rxclaimnextgen.elg.exceptions.ValidationException;

public interface GovernanceDataControlService {

    ElgEligDataGovernanceEdg findByCarCarrierIdAndAccountIdAndGroupId(String carCarrierId, String accountId, String groupId);
    
    public ElgEligDataGovernanceEdg saveEGDControl(String jsonString) throws IOException, ValidationException, Exception;

}
