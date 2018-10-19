package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgCrdCarrierListDetail;
import com.optum.rxclaimnextgen.elg.entities.ElgCrdCarrierListDetailPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bkocinsk on 6/8/2018.
 */
public interface ElgCrdCarrierListDetailRepository extends JpaRepository<ElgCrdCarrierListDetail, ElgCrdCarrierListDetailPK> {

    public ElgCrdCarrierListDetail findByCrlCarrierListNameAndCarCarrierId(String crlCarrierListName, String carCarrierId);
}