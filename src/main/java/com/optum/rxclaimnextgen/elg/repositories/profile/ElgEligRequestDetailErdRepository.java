package com.optum.rxclaimnextgen.elg.repositories.profile;

import com.optum.rxclaimnextgen.elg.entities.ElgEligRequestDetailErd;
import com.optum.rxclaimnextgen.elg.entities.ElgEligRequestDetailErdPK;
import com.optum.rxclaimnextgen.elg.projections.ElgEligRequestDetailErdProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ElgEligRequestDetailErdRepository extends JpaRepository<ElgEligRequestDetailErd, ElgEligRequestDetailErdPK> {

    ElgEligRequestDetailErd findByCarCarrierIdAndAccountIdAndGroupIdAndErdTrackingId (String carCarrierId, String accountId, String groupId, int erdTrackingId);

    List<ElgEligRequestDetailErd> findByCarCarrierIdAndAccountIdAndGroupId(String carCarrierId, String accountId, String groupId);
    
    @Query(value =
            "SELECT " +
                "trim(carCarrierId) AS carCarrierId," +
                "trim(accountId) AS accountId," +
                "trim(groupId) AS groupId," +
                "trim(erdTrackingId) AS erdTrackingId," +
                "trim(erdLoadType) AS erdLoadType," +
                "trim(erdStatus) AS erdStatus," +
                "chgDate AS chgDate," +
                "trim(chgUserName) AS chgUserName " +
            "FROM ElgEligRequestDetailErd " +
            "WHERE " +
                "carCarrierId = :carrierId " +
                "AND accountId = :accountId " +
                "AND groupId = :groupId " +
            "ORDER BY " +
                "erdTrackingId DESC," +
                "chgDate ASC " 
                
    )
    List<ElgEligRequestDetailErdProjection> getEligibilityRequestDetailForProfile(
            @Param("carrierId") String carrierId,
            @Param("accountId") String accountId,
            @Param("groupId") String groupId
    );
    
    
}
