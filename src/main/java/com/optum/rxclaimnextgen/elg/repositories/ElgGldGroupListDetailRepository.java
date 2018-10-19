package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgGldGroupListDetail;
import com.optum.rxclaimnextgen.elg.entities.ElgGldGroupListDetailPK;
import com.optum.rxclaimnextgen.elg.projections.ElgGldGroupListDetailProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by bkocinsk on 6/8/2018.
 */
public interface ElgGldGroupListDetailRepository extends JpaRepository<ElgGldGroupListDetail, ElgGldGroupListDetailPK> {

    public ElgGldGroupListDetail findByGrlGroupListNameAndCarCarrierIdAndAccAccountIdAndGrpGroupId(String grlGroupListName, String carCarrierId, String accAccountId, String grpGroupId);



}
