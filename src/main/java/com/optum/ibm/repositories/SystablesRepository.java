package com.optum.ibm.repositories;

import com.optum.ibm.entities.Systables;
import com.optum.ibm.entities.SystablesPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bkocinsk on 6/13/2018.
 */

public interface SystablesRepository extends JpaRepository<Systables, SystablesPK>  {

    public Systables findByTableNameAndTableSchema(String tableName, String tableSchema);
}