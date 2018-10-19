package com.optum.rxclaimnextgen.elg.services.profile.member;

import com.optum.rxclaimnextgen.elg.pojo.profile.member.EligMemberHealthDefaultDetailForm;

public interface HealthDefaultDetailService {

    EligMemberHealthDefaultDetailForm saveHealthDefaultDetails(String updatedHealthDefaultsJSON, String platformId) throws Exception;

    EligMemberHealthDefaultDetailForm findHealthDefaultsByPrimaryKey(String carCarrierId, String accountId, String groupId);
}
