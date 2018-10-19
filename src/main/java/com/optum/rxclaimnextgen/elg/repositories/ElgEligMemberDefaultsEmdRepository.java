package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgEligMemberDefaultsEmd;
import com.optum.rxclaimnextgen.elg.entities.ElgEligMemberDefaultsEmdPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bkocinsk on 6/22/2018.
 */
public interface ElgEligMemberDefaultsEmdRepository  extends JpaRepository<ElgEligMemberDefaultsEmd, ElgEligMemberDefaultsEmdPK> {

    // finds one row by primary key
    public ElgEligMemberDefaultsEmd findByCarCarrierIdAndAccountIdAndGroupId(String carCarrierId, String accountId, String groupId);
}
