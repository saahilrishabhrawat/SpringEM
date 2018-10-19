package com.optum.rxclaimnextgen.elg.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.optum.rxclaimnextgen.elg.entities.ElgStateSta;
import com.optum.rxclaimnextgen.elg.projections.ElgStateStaProjection;

public interface ElgStateStaRepository extends JpaRepository<ElgStateSta, String> {

    ElgStateSta findByStaStateCode(String stateCode);
    
    @Query(value = "select trim(ess.staStateCode) as staStateCode,trim(ess.staStateDescription) as staStateDescription from ElgStateSta ess")
    List<ElgStateStaProjection> findAllByQuery();
}
