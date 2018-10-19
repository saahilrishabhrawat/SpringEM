package com.optum.rxclaimnextgen.repositories;

import com.optum.rxclaimnextgen.entities.PhyPrescriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by bkocinsk on 7/23/2018.
 */
public interface PhyPrescriberRepository extends JpaRepository<PhyPrescriber, String> {

    public PhyPrescriber findByPrescriberKey(String prescriberKey);
    
    
    @Query(value = "SELECT lastName "+
            "FROM  PhyPrescriber " +
            "WHERE prescriberKey = :prescriberKey ")
    public String getLastName(@Param("prescriberKey") String prescriberKey);
    
    @Query(value = "SELECT firstName "+
            "FROM  PhyPrescriber " +
            "WHERE prescriberKey = :prescriberKey ")
    public String getFirstName(@Param("prescriberKey") String prescriberKey);

}

