package com.optum.rxclaimnextgen.repositories;

import com.optum.rxclaimnextgen.entities.CscCopaySchedule;
import com.optum.rxclaimnextgen.entities.CscCopaySchedulePK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by bkocinsk on 8/3/2018.
 */
public interface CscCopayScheduleRepository extends JpaRepository<CscCopaySchedule, CscCopaySchedulePK> {

   public CscCopaySchedule findByCopayScheduleNameAndStepNbr(String copayScheduleName, int stepNbr);
}
