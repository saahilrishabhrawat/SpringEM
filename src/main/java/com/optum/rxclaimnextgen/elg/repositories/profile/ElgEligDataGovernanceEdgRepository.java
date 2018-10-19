package com.optum.rxclaimnextgen.elg.repositories.profile;

import com.optum.rxclaimnextgen.elg.entities.ElgEligDataGovernanceEdg;
import com.optum.rxclaimnextgen.elg.entities.ElgEligDataGovernanceEdgPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElgEligDataGovernanceEdgRepository  extends JpaRepository<ElgEligDataGovernanceEdg, ElgEligDataGovernanceEdgPK> {
    ElgEligDataGovernanceEdg findByCarCarrierIdAndAccountIdAndGroupId(String carCarrierId, String accountId, String groupId);

}
