package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgEqdEligQueueDefaults;
import com.optum.rxclaimnextgen.elg.entities.ElgEqdEligQueueDefaultsPK;
import com.optum.rxclaimnextgen.elg.projections.ElgEqdEligQueueDefaultsProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by bkocinsk on 7/23/2018.
 */
public interface ElgEqdEligQueueDefaultsRepository extends JpaRepository<ElgEqdEligQueueDefaults, ElgEqdEligQueueDefaultsPK> {

    // finds one row by primary key
    public ElgEqdEligQueueDefaults findByCarCarrierIdAndEqdAccountIdAndEqdGroupIdAndEqdReportName(String carCarrierId, String accountId, String groupId, String reportName);

    @Query(value =
            "SELECT " +
                "trim(carCarrierId) AS carCarrierId," +
                "trim(eqdAccountId) AS eqdAccountId," +
                "trim(eqdGroupId) AS eqdGroupId," +
                "trim(eqdReportName) AS eqdReportName," +
                "trim(eqdOutputQueueLibrary) AS eqdOutputQueueLibrary," +
                "trim(eqdOutputQueueName) AS eqdOutputQueueName," +
                "eqdNumberOfCopies AS eqdNumberOfCopies," +
                "trim(eqdSaveSpoolFile) AS eqdSaveSpoolFile," +
                "trim(eqdHoldSpoolFile) AS eqdHoldSpoolFile," +
                "trim(eqdSpoolFileName) AS eqdSpoolFileName " +
            "FROM ElgEqdEligQueueDefaults " +
            "WHERE " +
                "carCarrierId = :carrierId " +
                "AND eqdAccountId = :accountId " +
                "AND eqdGroupId = :groupId " +
            "ORDER BY " +
                "eqdReportName DESC," +
                "eqdOutputQueueName DESC," +
                "eqdOutputQueueLibrary DESC"
    )
    public List<ElgEqdEligQueueDefaultsProjection> getAllEligQueuesForProfile(
            @Param("carrierId") String carrierId,
            @Param("accountId") String accountId,
            @Param("groupId") String groupId
    );
}

