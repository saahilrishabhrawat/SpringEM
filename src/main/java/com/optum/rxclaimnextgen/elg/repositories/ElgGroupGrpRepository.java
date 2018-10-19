package com.optum.rxclaimnextgen.elg.repositories;

import com.optum.rxclaimnextgen.elg.entities.ElgGroupGrp;
import com.optum.rxclaimnextgen.elg.entities.ElgGroupGrpPK;
import com.optum.rxclaimnextgen.elg.pojo.EligGroupListNames;
import com.optum.rxclaimnextgen.elg.projections.ElgGroupGrpProjection;
import com.optum.rxclaimnextgen.elg.projections.ElgGroupGrpNoProfilesProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by bkocinsk on 7/16/2018.
 */
public interface ElgGroupGrpRepository extends JpaRepository<ElgGroupGrp, ElgGroupGrpPK> {

    public ElgGroupGrp findByCarCarrierIdAndAccAccountIdAndGrpGroupId(String carCarrierId, String accAccountId, String grpGroupId);

    @Query( nativeQuery = true,
            value = "SELECT trim(gld.car_carrier_id) as car_carrier_id, trim(gld.acc_account_id) as acc_acount_id, " +
            " trim(gld.grp_group_id) as grp_group_id, trim(grp.grp_group_name) as grp_group_name " +
            " FROM  elg_gld_group_list_detail gld left outer join elg_group_grp grp " +
            " on gld.car_carrier_id = grp.car_carrier_id " +
            " and gld.acc_account_id = grp.acc_account_id " +
            " and gld.grp_group_id = grp.grp_group_id, " +
            " elg_platform_carrier_map map, " +
            " elg_platform_id pid " +
            " WHERE gld.grl_group_list_name =  :groupListName " +
            " AND gld.car_carrier_id = map.carrier_id " +
            " AND map.platform_id= pid.platform_id " +
            " ORDER BY 1, 2, 3 ")
    public List<Object> getAllGroupsForGroupListName(@Param("groupListName") String groupListName);


    @Query( nativeQuery = true,
            value = "SELECT DISTINCT trim(gld.car_carrier_id) as carCarrierId, trim(gld.acc_account_id) as accAccountId, " +
            " trim(gld.grp_group_id) as grpGroupId, trim(grp.grp_group_name) as grpGroupName, trim(pid.platform_id) as platformId " +
            "FROM  elg_gld_group_list_detail gld " +
            "LEFT JOIN elg_group_grp grp ON grp.car_carrier_id = gld.car_carrier_id " +
            "      AND grp.acc_account_id = gld.acc_account_id " +
            "      AND grp.grp_group_id = gld.grp_group_id " +
            "JOIN elg_platform_carrier_map map ON gld.car_carrier_id = map.carrier_id " +
            "JOIN elg_platform_id pid ON map.platform_id = pid.platform_id " +
            "WHERE NOT EXISTS (SELECT * FROM elg_elig_profile_epf epf " +
            "                   WHERE gld.car_carrier_id = epf.car_carrier_id "  +
            "                   AND gld.acc_account_id = epf.account_id " +
            "                   AND gld.grp_group_id = epf.group_id )" +
            "ORDER BY 1, 2, 3 ")
    public List<Object> getAllGroupsWithoutEligProfiles();


}
