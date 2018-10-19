package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgPlatformId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by bkocinsk on 5/30/2018.
 */
public interface ElgPlatformIdRepository extends JpaRepository<ElgPlatformId, String> {

    public ElgPlatformId findByPlatformId(String platFormId);    
     
    @Query(value = "select distinct(trim(p.platformId)) as platformId from ElgPlatformId p, ElgPlatformCarrierMap c, ElgEligProfileEpf pr " +
	           "where p.platformId = c.platformId and c.carrierId = pr.carCarrierId order by platformId")    
    public List<String> getAllPlatforms();

    
}
