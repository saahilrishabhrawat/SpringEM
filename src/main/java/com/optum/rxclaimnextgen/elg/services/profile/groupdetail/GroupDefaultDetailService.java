/**
 * 
 */
package com.optum.rxclaimnextgen.elg.services.profile.groupdetail;

import com.optum.rxclaimnextgen.elg.pojo.EligGroupDefaultDetail;

/**
 * @author Hemant Sharma
 *
 */
public interface GroupDefaultDetailService {
	EligGroupDefaultDetail save(String jsonString) throws Exception;

	EligGroupDefaultDetail getGroupDefaultDetailByPrimaryKey(String carrierId, String accountId, String groupId);
}
