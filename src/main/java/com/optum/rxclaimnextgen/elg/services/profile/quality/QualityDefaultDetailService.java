package com.optum.rxclaimnextgen.elg.services.profile.quality;

import java.io.IOException;

import com.optum.rxclaimnextgen.elg.exceptions.ValidationException;
import com.optum.rxclaimnextgen.elg.pojo.profile.quality.EligQualityDefaultDetailForm;

public interface QualityDefaultDetailService {
	
	public EligQualityDefaultDetailForm saveQualityDefaultDetails(String jsonString) throws IOException,ValidationException, Exception;
	public EligQualityDefaultDetailForm populateQualityDefaultDetails(String carrierId, String accountId, String groupId);
	
}
