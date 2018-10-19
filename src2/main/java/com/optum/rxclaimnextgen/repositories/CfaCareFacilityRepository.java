package com.optum.rxclaimnextgen.repositories;

import com.optum.rxclaimnextgen.entities.CfaCareFacility;
import com.optum.rxclaimnextgen.entities.CfaCareFacilityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by bkocinsk on 7/19/2018.
 */
public interface CfaCareFacilityRepository extends JpaRepository<CfaCareFacility, CfaCareFacilityPK> {

    public List<CfaCareFacility> findByCareFacilityId(String careFacilityId);

    public CfaCareFacility findByCarrierIdAndCareFacilityId(String carrierId, String careFacilityId);
    
    @Query(value = "SELECT count(*)"+
            "FROM  CfaCareFacility " +
            "WHERE careFacilityId = :careFacilityId "+
            "AND carrierId= :carCarrierId ")
    public int getCareFacilityIdCount(@Param("careFacilityId") String careFacilityId, @Param("carCarrierId") String carCarrierId);
}
