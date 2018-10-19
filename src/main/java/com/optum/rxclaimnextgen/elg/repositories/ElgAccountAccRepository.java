package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgAccountAcc;
import com.optum.rxclaimnextgen.elg.entities.ElgAccountAccPK;
import com.optum.rxclaimnextgen.elg.projections.ElgAccountAccProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by bkocinsk on 8/10/2018.
 */
public interface ElgAccountAccRepository extends JpaRepository<ElgAccountAcc, ElgAccountAccPK> {

    public ElgAccountAccProjection findByCarCarrierIdAndAccAccountId(String carCarrierId, String accountId);

}
