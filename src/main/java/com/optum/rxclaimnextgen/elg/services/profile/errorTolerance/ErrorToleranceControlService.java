package com.optum.rxclaimnextgen.elg.services.profile.errorTolerance;

import com.optum.rxclaimnextgen.elg.pojo.EligErrorToleranceControl;

public interface ErrorToleranceControlService {
	EligErrorToleranceControl findByCarCarrierIdAndAccountIdAndGroupId(String carCarrierId, String accountId,
			String groupId);

	void save(String jsonString) throws Exception;
}
