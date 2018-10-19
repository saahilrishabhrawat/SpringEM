package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgEligQualityDefaultsQde;
import com.optum.rxclaimnextgen.elg.entities.ElgEligQualityDefaultsQdePK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bkocinsk on 8/31/2018.
 */
public interface ElgEligQualityDefaultsQdeRepository extends JpaRepository<ElgEligQualityDefaultsQde, ElgEligQualityDefaultsQdePK> {

    // finds one row by primary key
    public ElgEligQualityDefaultsQde findByCarCarrierIdAndAccountIdAndGroupId(String carCarrierId, String accountId, String groupId);
}
