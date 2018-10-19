package com.optum.rxclaimnextgen.elg.repositories.profile;

import com.optum.rxclaimnextgen.elg.entities.ElgToleranceCheckDtlEcd;
import com.optum.rxclaimnextgen.elg.entities.ElgToleranceCheckDtlEcdPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ElgToleranceCheckDtlEcdRepository extends JpaRepository<ElgToleranceCheckDtlEcd, ElgToleranceCheckDtlEcdPK> {

    ElgToleranceCheckDtlEcd findByCarCarrierIdAndAccountIdAndGroupIdAndEcdFileIdFieldNumber(String carCarrierId, String accountId, String groupId, String ecdFileFieldNumber);

    @Query("SELECT t FROM ElgToleranceCheckDtlEcd t WHERE t.carCarrierId = :carrierId AND t.accountId = :accountId AND t.groupId = :groupId ORDER BY t.ecdFileIdFieldNumber DESC, t.ecdFieldName DESC")
    List<ElgToleranceCheckDtlEcd> getAllForProfile(@Param("carrierId") String carCarrierId, @Param("accountId") String accountId, @Param("groupId") String groupId);

}
