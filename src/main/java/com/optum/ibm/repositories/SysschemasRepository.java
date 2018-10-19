package com.optum.ibm.repositories;

import com.optum.ibm.entities.Sysschemas;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bkocinsk on 6/13/2018.
 */
public interface SysschemasRepository extends JpaRepository<Sysschemas, String> {

    public Sysschemas findBySchemaName(String schemaName);
}