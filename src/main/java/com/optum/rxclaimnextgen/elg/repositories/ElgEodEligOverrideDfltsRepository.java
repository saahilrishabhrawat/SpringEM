package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgEodEligOverrideDflts;
import com.optum.rxclaimnextgen.elg.entities.ElgEodEligOverrideDfltsPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bkocinsk on 7/18/2018.
 */
public interface ElgEodEligOverrideDfltsRepository extends JpaRepository<ElgEodEligOverrideDflts, ElgEodEligOverrideDfltsPK> {

    public ElgEodEligOverrideDflts findByCarCarrierIdAndAccountIdAndGroupId(String carCarrierId, String accountId, String groupId);
}
