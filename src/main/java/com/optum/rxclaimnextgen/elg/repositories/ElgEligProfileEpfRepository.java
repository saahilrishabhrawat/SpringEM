package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgEligProfileEpf;
import com.optum.rxclaimnextgen.elg.entities.ElgEligProfileEpfPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by bkocinsk on 5/29/2018.
 */
public interface ElgEligProfileEpfRepository extends JpaRepository<ElgEligProfileEpf, ElgEligProfileEpfPK> {

    public List<ElgEligProfileEpf> findByCarCarrierId(String carCarrierId);

    public ElgEligProfileEpf findByCarCarrierIdAndAccountIdAndGroupId(String carCarrierId, String accountId, String groupId);
    
    public List<ElgEligProfileEpf> findByEpfLoadIdentifier(String epfLoadIdentifier);
}
