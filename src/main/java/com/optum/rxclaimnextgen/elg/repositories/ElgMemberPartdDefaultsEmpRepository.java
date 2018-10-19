package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgMemberPartdDefaultsEmp;
import com.optum.rxclaimnextgen.elg.entities.ElgMemberPartdDefaultsEmpPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bkocinsk on 6/22/2018.
 */
public interface ElgMemberPartdDefaultsEmpRepository extends JpaRepository<ElgMemberPartdDefaultsEmp, ElgMemberPartdDefaultsEmpPK> {

    // finds one row by primary key
    public ElgMemberPartdDefaultsEmp findByCarCarrierIdAndAccountIdAndGroupId(String carCarrierId, String accountId, String groupId);
}