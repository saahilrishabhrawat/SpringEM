package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgPlatformCarrierMap;
import com.optum.rxclaimnextgen.elg.entities.ElgPlatformCarrierMapPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by bkocinsk on 5/30/2018.
 */
public interface ElgPlatformCarrierMapRepository extends JpaRepository<ElgPlatformCarrierMap, ElgPlatformCarrierMapPK> {

    public List<ElgPlatformCarrierMap> findByPlatformId(String platFormId);

    public ElgPlatformCarrierMap findByPlatformIdAndCarrierId(String platformId, String carrierId);
}

