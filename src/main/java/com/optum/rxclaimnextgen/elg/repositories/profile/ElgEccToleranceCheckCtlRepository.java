package com.optum.rxclaimnextgen.elg.repositories.profile;

import com.optum.rxclaimnextgen.elg.entities.ElgEccToleranceCheckCtl;
import com.optum.rxclaimnextgen.elg.entities.ElgEccToleranceCheckCtlPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElgEccToleranceCheckCtlRepository extends JpaRepository<ElgEccToleranceCheckCtl, ElgEccToleranceCheckCtlPK> {
    ElgEccToleranceCheckCtl findByCarCarrierIdAndAccountIdAndGroupId(String carCarrierId, String accountId, String groupId);
}
