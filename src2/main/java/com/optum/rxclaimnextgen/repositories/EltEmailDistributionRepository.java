package com.optum.rxclaimnextgen.repositories;

import com.optum.rxclaimnextgen.entities.EltEmailDistribution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EltEmailDistributionRepository extends JpaRepository<EltEmailDistribution, String> {

    EltEmailDistribution findByEltEmailDistListID(String eltEmailDistListID);

}
