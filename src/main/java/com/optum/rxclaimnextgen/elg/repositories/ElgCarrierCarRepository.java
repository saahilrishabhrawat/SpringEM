package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgCarrierCar;
import com.optum.rxclaimnextgen.elg.projections.ElgCarrierCarProjection;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bkocinsk on 8/10/2018.
 */
public interface ElgCarrierCarRepository extends JpaRepository<ElgCarrierCar, String> {

    public ElgCarrierCarProjection findByCarCarrierId(String carCarrierId);

}

