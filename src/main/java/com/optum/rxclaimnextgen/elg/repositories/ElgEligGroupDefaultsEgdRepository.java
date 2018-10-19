package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgEligGroupDefaultsEgd;
import com.optum.rxclaimnextgen.elg.entities.ElgEligGroupDefaultsEgdPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bkocinsk on 8/9/2018.
 */
public interface ElgEligGroupDefaultsEgdRepository extends JpaRepository<ElgEligGroupDefaultsEgd, ElgEligGroupDefaultsEgdPK> {

    // finds one row by primary key
    public ElgEligGroupDefaultsEgd findByCarCarrierIdAndAccountIdAndGroupId(String carCarrierId, String accountId, String groupId);
}

