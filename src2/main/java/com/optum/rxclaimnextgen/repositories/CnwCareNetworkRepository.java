package com.optum.rxclaimnextgen.repositories;

import com.optum.rxclaimnextgen.entities.CnwCareNetwork;
import com.optum.rxclaimnextgen.entities.CnwCareNetworkPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by bkocinsk on 7/22/2018.
 */
public interface CnwCareNetworkRepository extends JpaRepository<CnwCareNetwork, CnwCareNetworkPK> {

    public CnwCareNetwork findByCarrierIdAndAccountIdAndGroupIdAndNetworkId(String carrierId, String accountId, String groupId, String networkId);

    public List<CnwCareNetwork> findByNetworkId(String networkId);

    public List<CnwCareNetwork> findByCarrierIdAndNetworkId(String carrierId, String networkId);
    
    
    @Query(nativeQuery=true,
    		value = 
    "SELECT Case When  COUNT(1) > 0 then 'Success' "+
    "ELSE 'Care Network not found' END MSG FROM RCCNWP  WHERE  HCAACD = :carrierId AND HCPMC2 = :networkId "
    		)
    public String findValidNetworkForAllGroupAndAccount(@Param("networkId") String networkId ,
			@Param("carrierId") String carrierId
			);
    
    @Query(nativeQuery=true,
    		value = 
    
    			   "SELECT Case When  COUNT(1) > 0 then "+ 
    			   "( SELECT Case When  COUNT(1) > 0 then 'Success' ELSE "+
                   "( SELECT Case When  COUNT(1) > 0 then 'Success' ELSE 'Care Network not found' "+
                   "END FROM RCCNWP  WHERE  HCAACD = :carrierId AND  HCYLC4 = :groupId AND  HCPMC2 = :networkId ) "+
                   "END FROM RCCNWP  WHERE  HCAACD = :carrierId AND HCYKC4 = '*ALL' AND HCYLC4 = '*ALL' AND  HCPMC2 = :networkId ) "+
                   "ELSE 'Care Network not found' END MSG FROM RCCNWP  WHERE  HCAACD = :carrierId AND  HCPMC2 = :networkId "
)
    public String findValidNetworkForAllAccount(@Param("networkId") String networkId ,
			@Param("carrierId") String carrierId,
			@Param("groupId") String groupId);

    @Query(nativeQuery=true,
    		value = 
                   "SELECT Case When  COUNT(1) > 0 then "+ 
                   "(SELECT Case When  COUNT(1) > 0 then 'Success' ELSE "+
                   "( SELECT Case When  COUNT(1) > 0 then 'Success' ELSE 'Care Network not found' "+
                   "END FROM RCCNWP  WHERE  HCAACD = :carrierId AND  HCYKC4 = :accountId AND HCPMC2 = :networkId) "+
                   "END FROM RCCNWP  WHERE  HCAACD = :carrierId AND HCYKC4 = '*ALL' AND HCYLC4 = '*ALL' AND HCPMC2 = :networkId) "+
                   "ELSE 'Care Network not found' END MSG FROM RCCNWP  WHERE  HCAACD = :carrierId AND HCPMC2 = :networkId ")
    public String findValidNetworkForAllGroup(@Param("networkId") String networkId ,
			@Param("carrierId") String carrierId,
			@Param("accountId") String accountId);

    @Query(nativeQuery=true,
    		value = 
    		"SELECT Case When  COUNT(1) > 0 then ( "+
            "SELECT Case When  COUNT(1) > 0 then 'Success' ELSE ( "+
            "Select Case When  COUNT(1) > 0 then 'Success' ELSE  ( "+
            "Select Case When  COUNT(1) > 0 then 'Success' ELSE 'Care Network not found' "+ 
            "END FROM RCCNWP  WHERE  HCAACD = :carrierId AND HCYKC4 = '*ALL' AND HCYLC4 = '*ALL' AND HCPMC2 = :networkId  ) "+          
            "END FROM RCCNWP  WHERE  HCAACD = :carrierId AND HCYKC4 = :accountId AND HCYLC4 = '*ALL' AND HCPMC2 = :networkId ) "+
            "END FROM RCCNWP  WHERE  HCAACD = :carrierId AND HCYKC4 = :accountId AND HCYLC4 = :groupId AND HCPMC2 = :networkId ) "+
            "ELSE 'Care Network not found' END  MSG  FROM RCCNWP  WHERE  HCAACD = :carrierId AND HCPMC2 = :networkId "
)
    public String findValidNetworkForCAG(@Param("networkId") String networkId ,
    					@Param("carrierId") String carrierId,
    					@Param("accountId") String accountId,
    					@Param("groupId") String groupId);
  
}
