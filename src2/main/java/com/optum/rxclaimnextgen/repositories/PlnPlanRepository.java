package com.optum.rxclaimnextgen.repositories;

import com.optum.rxclaimnextgen.entities.PlnPlan;
import com.optum.rxclaimnextgen.entities.PlnPlanPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by bkocinsk on 7/19/2018.
 */
public interface PlnPlanRepository extends JpaRepository<PlnPlan, PlnPlanPK> {

    public PlnPlan findByPlanCodeAndPlanEffDateAndPlanTermDate(String planCode, int planEffDate, int planTermDate);

    public List<PlnPlan> findByPlanCode(String planCode);

    public List<PlnPlan> findByPlanCodeAndPlanEffDate(String planCode, int planEffDate);
}
