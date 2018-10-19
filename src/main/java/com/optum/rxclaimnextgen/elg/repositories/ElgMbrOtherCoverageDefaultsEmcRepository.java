package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgMbrOtherCoverageDefaultsEmc;
import com.optum.rxclaimnextgen.elg.entities.ElgMbrOtherCoverageDefaultsEmcPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bkocinsk on 7/3/2018.
 */
public interface ElgMbrOtherCoverageDefaultsEmcRepository extends JpaRepository<ElgMbrOtherCoverageDefaultsEmc, ElgMbrOtherCoverageDefaultsEmcPK> {
    // finds one row by primary key
    public ElgMbrOtherCoverageDefaultsEmc findByCarCarrierIdAndAccountIdAndGroupId(String carCarrierId, String accountId, String groupId);
}
