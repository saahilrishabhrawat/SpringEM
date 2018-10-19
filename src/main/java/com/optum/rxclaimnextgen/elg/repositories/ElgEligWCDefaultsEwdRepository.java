package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgEligWCDefaultsEwd;
import com.optum.rxclaimnextgen.elg.entities.ElgEligWCDefaultsEwdPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bkocinsk on 7/23/2018.
 */
public interface ElgEligWCDefaultsEwdRepository extends JpaRepository<ElgEligWCDefaultsEwd, ElgEligWCDefaultsEwdPK> {

    public ElgEligWCDefaultsEwd findByCarCarrierIdAndAccountIdAndGroupId(String carCarrierId, String accountId, String groupId);
}

