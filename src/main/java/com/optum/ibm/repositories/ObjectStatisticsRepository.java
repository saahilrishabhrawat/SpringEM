package com.optum.ibm.repositories;

import com.optum.ibm.entities.ObjectStatistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by bkocinsk on 7/3/2018.
 */
@Repository
public interface ObjectStatisticsRepository extends JpaRepository<ObjectStatistics, String> {

    @Query(nativeQuery = true,
           value = "SELECT OBJNAME FROM TABLE (QSYS2.OBJECT_STATISTICS(:libraryName,'PGM SRVPGM', :programName )) X for read only")
    public ObjectStatistics findStats(@Param("libraryName") String libraryName,@Param("programName") String programName);

    @Query(nativeQuery = true,
            value = "SELECT OBJNAME FROM TABLE (QSYS2.OBJECT_STATISTICS(:libraryName,'OUTQ', :outputQueueName )) X for read only")
     public ObjectStatistics findOutputQueueStats(@Param("libraryName") String libraryName,@Param("outputQueueName") String outputQueueName);


}
