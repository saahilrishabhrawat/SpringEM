package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgEligHealthDefaultsEhd;
import com.optum.rxclaimnextgen.elg.entities.ElgEligHealthDefaultsEhdPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bkocinsk on 8/9/2018.
 */
public interface ElgEligHealthDefaultsEhdRepository extends JpaRepository<ElgEligHealthDefaultsEhd, ElgEligHealthDefaultsEhdPK> {

    // finds one row by primary key
    public ElgEligHealthDefaultsEhd findByCarCarrierIdAndAccountIdAndGroupId(String carCarrierId, String accountId, String groupId);
}

