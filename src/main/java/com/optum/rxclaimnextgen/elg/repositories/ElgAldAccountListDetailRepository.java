package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgAldAccountListDetail;
import com.optum.rxclaimnextgen.elg.entities.ElgAldAccountListDetailPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bkocinsk on 6/8/2018.
 */
public interface ElgAldAccountListDetailRepository extends JpaRepository<ElgAldAccountListDetail, ElgAldAccountListDetailPK> {

    public ElgAldAccountListDetail findByAclAccountListNameAndCarCarrierIdAndAccAccountId(String aclAccountListName, String carCarrierId, String accAccountId);
}