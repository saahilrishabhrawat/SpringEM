package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgAclAccountList;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bkocinsk on 6/8/2018.
 */
public interface ElgAclAccountListRepository extends JpaRepository<ElgAclAccountList, String> {

    public ElgAclAccountList findByAclAccountListName(String aclAccountListName);
}