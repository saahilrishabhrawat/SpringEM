package com.optum.rxclaimnextgen.repositories;

import com.optum.rxclaimnextgen.entities.DigDiagnosis;
import com.optum.rxclaimnextgen.entities.DigDiagnosisPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by James Sheputis on 8/30/2018.
 */
public interface DigDiagnosisRepository extends JpaRepository<DigDiagnosis, DigDiagnosisPK> {

    public DigDiagnosis findByDiagnosisCode(String diagnosisCode);

    public DigDiagnosis findByQualifierAndTypeCodeAndDiagnosisCode(String qualifier, String typeCode, String diagnosisCode);

}
