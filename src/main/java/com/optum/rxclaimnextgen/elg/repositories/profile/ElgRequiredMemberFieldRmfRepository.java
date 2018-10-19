package com.optum.rxclaimnextgen.elg.repositories.profile;

import com.optum.rxclaimnextgen.elg.entities.ElgRequiredMemberFieldRmf;
import com.optum.rxclaimnextgen.elg.entities.ElgRequiredMemberFieldRmfPK;
import com.optum.rxclaimnextgen.elg.projections.ElgRequiredMemberFieldRmfProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ElgRequiredMemberFieldRmfRepository extends JpaRepository<ElgRequiredMemberFieldRmf, ElgRequiredMemberFieldRmfPK> {

    @Query(value = "SELECT "
            + "trim(platform.platformId) AS platformId,"
            + "trim(requiredMemberFields.rmfCarrierId) AS rmfCarrierId,"
            + "trim(requiredMemberFields.rmfAccountId) AS rmfAccountId,"
            + "trim(requiredMemberFields.rmfGroupId) AS rmfGroupId,"
            + "requiredMemberFields.addDate AS addDate,"
            + "requiredMemberFields.chgDate AS chgDate,"
            + "trim(requiredMemberFields.chgUserName) AS chgUserName "
            + "FROM ElgPlatformId platform, "
            + "ElgPlatformCarrierMap pltCarMap, "
            + "ElgRequiredMemberFieldRmf requiredMemberFields "
            + "WHERE platform.platformId = pltCarMap.platformId"
            + " and pltCarMap.carrierId = requiredMemberFields.rmfCarrierId"
    )
    List<ElgRequiredMemberFieldRmfProjection> findRequiredMemberFieldData();

    ElgRequiredMemberFieldRmf findByRmfCarrierIdAndRmfAccountIdAndRmfGroupId(String carrierId, String accountId, String groupId);

}
