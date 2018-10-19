package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgCrlCarrierList;

import java.util.List;

import com.optum.rxclaimnextgen.elg.projections.ElgCrlCarrierListProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by bkocinsk on 6/8/2018.
 */
public interface ElgCrlCarrierListRepository extends JpaRepository<ElgCrlCarrierList, String> {

    public ElgCrlCarrierList findByCrlCarrierListName(String crlCarrierListName);

    @Query(value = "SELECT DISTINCT trim(eccl.crlCarrierListName) as crlCarrierListName " +
            "FROM  ElgCrlCarrierList eccl, " +
            "ElgCrdCarrierListDetail eccld, " +
            "ElgPlatformCarrierMap epcm, " +
            "ElgPlatformId epi, " +
            "ElgEligProfileEpf epf " +
            "WHERE eccl.crlCarrierListName = eccld.crlCarrierListName " +
            "AND eccld.carCarrierId = epcm.carrierId " +
            "AND epcm.platformId= epi.platformId " +
            "AND epcm.carrierId = epf.carCarrierId " +
            "ORDER BY crlCarrierListName")
    public List<String> getAllCarrierLists();

    @Query(value = "SELECT  DISTINCT trim(carCarrierId) from ElgCrdCarrierListDetail WHERE crlCarrierListName = :carrierList ")
    public List<String> getAllCarrierIdsbyCarrierList(@Param("carrierList") String carrierList);

    @Query(value = "SELECT DISTINCT trim(eccl.crlCarrierListName) as crlCarrierListName, trim(eccl.crlCarrierListDesc) as crlCarrierListDesc " +
            "FROM  ElgCrlCarrierList eccl, " +
            "ElgCrdCarrierListDetail eccld, " +
            "ElgPlatformCarrierMap epcm, " +
            "ElgPlatformId epi " +
            "WHERE eccl.crlCarrierListName = eccld.crlCarrierListName " +
            "AND eccld.carCarrierId = epcm.carrierId " +
            "AND epcm.platformId= epi.platformId " +
            "ORDER BY crlCarrierListName")
    public List<ElgCrlCarrierListProjection> getAllCarrierIdsAndDescriptions();
}