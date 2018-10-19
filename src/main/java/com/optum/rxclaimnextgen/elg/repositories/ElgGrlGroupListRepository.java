package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgGrlGroupList;
import com.optum.rxclaimnextgen.elg.projections.ElgGrlGroupListProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by bkocinsk on 6/8/2018.
 */
public interface ElgGrlGroupListRepository extends JpaRepository<ElgGrlGroupList, String> {

    public ElgGrlGroupList findByGrlGroupListName(String grlGroupListName);

    @Query(value = "SELECT DISTINCT trim(grl.grlGroupListName) as grlGroupListName, trim(grl.grlGroupListDescriptn) as grlGroupListDescriptn " +
            "FROM  ElgGrlGroupList grl, " +
            "ElgGldGroupListDetail gld, " +
            "ElgPlatformCarrierMap map, " +
            "ElgPlatformId pid " +
            "WHERE grl.grlGroupListName = gld.grlGroupListName " +
            "AND gld.carCarrierId = map.carrierId " +
            "AND map.platformId= pid.platformId " +
            "ORDER BY grlGroupListName ")
    public List<ElgGrlGroupListProjection> getAllGroupNamesAndDescriptions();
}
