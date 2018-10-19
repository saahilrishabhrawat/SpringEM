package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgEligMemberDefaultsOvrEmh;
import com.optum.rxclaimnextgen.elg.entities.ElgEligMemberDefaultsOvrEmhPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bkocinsk on 6/22/2018.
 */
public interface ElgEligMemberDefaultsOvrEmhRepository extends JpaRepository<ElgEligMemberDefaultsOvrEmh, ElgEligMemberDefaultsOvrEmhPK> {

    // finds one row by primary key
    public ElgEligMemberDefaultsOvrEmh findByCarCarrierIdAndAccountIdAndGroupId(String carCarrierId, String accountId, String groupId);
}