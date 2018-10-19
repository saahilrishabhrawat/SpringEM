package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgMemberLanguageCodeMlc;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bkocinsk on 9/26/2018.
 */
public interface ElgMemberLanguageCodeMlcRepository  extends JpaRepository<ElgMemberLanguageCodeMlc, String> {

    // finds one row by primary key
    public ElgMemberLanguageCodeMlc findByMlcMbrIsoLanguageCode(String languageCode);
}

