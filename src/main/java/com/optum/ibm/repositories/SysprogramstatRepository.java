package com.optum.ibm.repositories;

import com.optum.ibm.entities.Sysprogramstat;
import com.optum.ibm.entities.SysprogramstatPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bkocinsk on 6/15/2018.
 */
public interface SysprogramstatRepository extends JpaRepository<Sysprogramstat, SysprogramstatPK> {

    public Sysprogramstat findByProgramSchemaAndProgramNameAndProgramType(String programSchema, String programName, String programType);

}
