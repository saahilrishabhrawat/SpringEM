package com.optum.rxclaimnextgen.repositories;

import com.optum.rxclaimnextgen.entities.PrqPrescriberQualType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by bkocinsk on 7/23/2018.
 */
public interface PrqPrescriberQualTypeRepository extends JpaRepository<PrqPrescriberQualType, String> {

    public PrqPrescriberQualType findByPrescriberIdQualifier(String prescriberIdQualifier);
    
    @Query(value = "SELECT qualifierAbbreviation "+
            "FROM  PrqPrescriberQualType " +
            "WHERE prescriberIdQualifier = :prescriberIdQualifier ")
    public String getQualifierAbbreviation(@Param("prescriberIdQualifier") String prescriberIdQualifier);

}
