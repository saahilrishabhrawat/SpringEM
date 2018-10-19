package com.optum.rxclaimnextgen.repositories;


import com.optum.rxclaimnextgen.entities.CquCareQualifier;
import com.optum.rxclaimnextgen.entities.CquCareQualifierPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by bkocinsk on 7/22/2018.
 */
public interface CquCareQualifierRepository extends JpaRepository<CquCareQualifier, CquCareQualifierPK> {

    public CquCareQualifier findByCarrierIdAndAccountIdAndGroupIdAndQualifierId(String carrierId, String accountId, String groupId, String qualifierId);

    public List<CquCareQualifier> findByQualifierId(String qualifierId);

    public List<CquCareQualifier> findByCarrierIdAndQualifierId(String carrierId, String qualifierId);
    
    @Query(nativeQuery=true,
    		value = 
    "SELECT Case When  COUNT(1) > 0 then 'Success' "+
    "ELSE 'Entry is invalid' END MSG FROM RCCQUP  WHERE  HDAACD = :carrierId AND HDPNC2 = :qualifierId "
    		)
    public String findValidQualifierForAllGroupAndAccount(@Param("qualifierId") String qualifierId ,
			@Param("carrierId") String carrierId
			);
    
    @Query(nativeQuery=true,
    		value = 
    
    			   "SELECT Case When  COUNT(1) > 0 then "+ 
    			   "( SELECT Case When  COUNT(1) > 0 then 'Success' ELSE "+
                   "( SELECT Case When  COUNT(1) > 0 then 'Success' ELSE 'Entry is invalid' "+
                   "END FROM RCCQUP  WHERE  HDAACD = :carrierId AND  HDYJC4 = :groupId AND  HDPNC2 = :qualifierId ) "+
                   "END FROM RCCQUP  WHERE  HDAACD = :carrierId AND HDYIC4 = '*ALL' AND HDYJC4 = '*ALL' AND  HDPNC2 = :qualifierId ) "+
                   "ELSE 'Entry is invalid' END MSG FROM RCCQUP  WHERE  HDAACD = :carrierId AND  HDPNC2 = :qualifierId "
)
    public String findValidQualifierForAllAccount(@Param("qualifierId") String qualifierId ,
			@Param("carrierId") String carrierId,
			@Param("groupId") String groupId);

    @Query(nativeQuery=true,
    		value = 
                   "SELECT Case When  COUNT(1) > 0 then "+ 
                   "(SELECT Case When  COUNT(1) > 0 then 'Success' ELSE "+
                   "( SELECT Case When  COUNT(1) > 0 then 'Success' ELSE 'Entry is invalid' "+
                   "END FROM RCCQUP  WHERE  HDAACD = :carrierId AND  HDYIC4 = :accountId AND HDPNC2 = :qualifierId) "+
                   "END FROM RCCQUP  WHERE  HDAACD = :carrierId AND HDYIC4 = '*ALL' AND HDYJC4 = '*ALL' AND HDPNC2 = :qualifierId) "+
                   "ELSE 'Entry is invalid' END MSG FROM RCCQUP  WHERE  HDAACD = :carrierId AND HDPNC2 = :qualifierId ")
    public String findValidQualifierForAllGroup(@Param("qualifierId") String qualifierId ,
			@Param("carrierId") String carrierId,
			@Param("accountId") String accountId);

    @Query(nativeQuery=true,
    		value = 
    		"SELECT Case When  COUNT(1) > 0 then ( "+
            "SELECT Case When  COUNT(1) > 0 then 'Success' ELSE ( "+
            "Select Case When  COUNT(1) > 0 then 'Success' ELSE  ( "+
            "Select Case When  COUNT(1) > 0 then 'Success' ELSE 'Entry is invalid' "+ 
            "END FROM RCCQUP  WHERE  HDAACD = :carrierId AND HDYIC4 = '*ALL' AND HDYJC4 = '*ALL' AND HDPNC2 = :qualifierId  ) "+          
            "END FROM RCCQUP  WHERE  HDAACD = :carrierId AND HDYIC4 = :accountId AND HDYJC4 = '*ALL' AND HDPNC2 = :qualifierId ) "+
            "END FROM RCCQUP  WHERE  HDAACD = :carrierId AND HDYIC4 = :accountId AND HDYJC4 = :groupId AND HDPNC2 = :qualifierId ) "+
            "ELSE 'Entry is invalid' END  MSG  FROM RCCQUP  WHERE  HDAACD = :carrierId AND HDPNC2 = :qualifierId "
)
    public String findValidQualifierForCAG(@Param("qualifierId") String qualifierId ,
    					@Param("carrierId") String carrierId,
    					@Param("accountId") String accountId,
    					@Param("groupId") String groupId);
  
}


