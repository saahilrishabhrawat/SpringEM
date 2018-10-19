package com.optum.rxclaimnextgen.repositories;

import com.optum.rxclaimnextgen.entities.PrfPrescriberId;
import com.optum.rxclaimnextgen.entities.PrfPrescriberIdPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by bkocinsk on 7/23/2018.
 */
public interface PrfPrescriberIdRepository extends JpaRepository<PrfPrescriberId, PrfPrescriberIdPK> {

    public PrfPrescriberId findByPrescriberIdAndPrescriberIdQualifierAndPrescriberIdState(String prescriberId, String prescriberIdQualifier, String prescriberIdState);

    public List<PrfPrescriberId> findByPrescriberId(String prescriberId);
    
    @Query(value = "SELECT count(*)"+
            "FROM  PrfPrescriberId " +
            "WHERE prescriberId = :prescriberId ")
    public int getPrescriberIdCount(@Param("prescriberId") String prescriberId);
    
    @Query(value = "SELECT prescriberIdQualifier "+
            "FROM  PrfPrescriberId " +
            "WHERE prescriberId = :prescriberId ")
    public String getPrescriberIdQualifier(@Param("prescriberId") String prescriberId);
    
    @Query(value = "SELECT prescriberIdState "+
            "FROM  PrfPrescriberId " +
            "WHERE prescriberId = :prescriberId ")
    public String getPrescriberIdState(@Param("prescriberId") String prescriberId);
    
    @Query(value = "SELECT prescriberKey "+
            "FROM  PrfPrescriberId " +
            "WHERE prescriberId = :prescriberId ")
    public String getPrescriberKey(@Param("prescriberId") String prescriberId);
}
