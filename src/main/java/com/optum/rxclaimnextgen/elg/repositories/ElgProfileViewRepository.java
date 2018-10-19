package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgProfileViewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Hemant Sharma on 6/5/2018.
 */
public interface ElgProfileViewRepository extends JpaRepository<ElgProfileViewEntity, BigDecimal> {
	@Query(value = "SELECT new com.optum.rxclaimnextgen.elg.entities.ElgProfileViewEntity(platform.platformId,profile.carCarrierId, "
			+ "profile.accountId,profile.groupId,profile.epfCurrentLoadDate, "
			+ "profile.epfCurrentLoaded,profile.epfLoadIdentifier, "
			+ "profile.epfReformatVersion,profile.epfReformatPgm,profile.epfLoadType, profile.epfStatus) "
			+ "FROM ElgPlatformId platform, " + "ElgPlatformCarrierMap pltCarMap, "
			+ "ElgEligProfileEpf profile " + "WHERE platform.platformId = pltCarMap.platformId "
			+ "and pltCarMap.carrierId = profile.carCarrierId ORDER BY profile.carCarrierId DESC,profile.accountId DESC,profile.groupId DESC,profile.epfCurrentLoadDate DESC")
	public List<ElgProfileViewEntity> findElgProfileData();
}
