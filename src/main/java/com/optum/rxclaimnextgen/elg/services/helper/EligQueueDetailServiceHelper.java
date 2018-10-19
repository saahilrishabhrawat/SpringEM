/**
 * 
 */
package com.optum.rxclaimnextgen.elg.services.helper;

import org.springframework.stereotype.Component;

import com.optum.rxclaimnextgen.elg.entities.ElgEqdEligQueueDefaults;
import com.optum.rxclaimnextgen.elg.pojo.EligQueueDetailForm;
import com.optum.rxclaimnextgen.elg.utils.DateUtils;

/**
 * @author sbahedi
 *
 */
@Component
public class EligQueueDetailServiceHelper {
	/**
	 * prepare entity by using form object to save eligibility queue details.
	 * 
	 * @param elgEqdEligQueueDefaults
	 * @param eligQueueDetailForm
	 * @return
	 */
	public ElgEqdEligQueueDefaults prepareEligQueueDetailEntity(ElgEqdEligQueueDefaults elgEqdEligQueueDefaults,
			EligQueueDetailForm eligQueueDetailForm) {
		if (null == elgEqdEligQueueDefaults) {
			elgEqdEligQueueDefaults = new ElgEqdEligQueueDefaults();
			elgEqdEligQueueDefaults.setCarCarrierId(eligQueueDetailForm.getCarCarrierId());
			elgEqdEligQueueDefaults.setEqdAccountId(eligQueueDetailForm.getEqdAccountId());
			elgEqdEligQueueDefaults.setEqdGroupId(eligQueueDetailForm.getEqdGroupId());
			elgEqdEligQueueDefaults.setEqdReportName(eligQueueDetailForm.getEqdReportName());
			elgEqdEligQueueDefaults.setAddDate(DateUtils.currentDate());
			elgEqdEligQueueDefaults.setAddTime(DateUtils.currentTime());
			elgEqdEligQueueDefaults.setAddProgramName("JAVA_PRG");
			elgEqdEligQueueDefaults.setAddUserName("TEST_USER");
		}
		elgEqdEligQueueDefaults.setEqdOutputQueueName(eligQueueDetailForm.getEqdOutputQueueName());
		elgEqdEligQueueDefaults.setEqdOutputQueueLibrary(eligQueueDetailForm.getEqdOutputQueueLibrary());
		elgEqdEligQueueDefaults.setEqdNumberOfCopies(eligQueueDetailForm.getEqdNumberOfCopies());
		elgEqdEligQueueDefaults.setEqdSaveSpoolFile(eligQueueDetailForm.getEqdSaveSpoolFile());
		elgEqdEligQueueDefaults.setEqdHoldSpoolFile(eligQueueDetailForm.getEqdHoldSpoolFile());
		elgEqdEligQueueDefaults.setEqdSpoolFileName(eligQueueDetailForm.getEqdSpoolFileName());
		// TODO
		elgEqdEligQueueDefaults.setEqdFormType("");
		elgEqdEligQueueDefaults.setEqdDistributionUserId(eligQueueDetailForm.getEqdDistributionUserId());
		elgEqdEligQueueDefaults.setEqdSystemId(eligQueueDetailForm.getEqdSystemId());
		elgEqdEligQueueDefaults.setChgDate(DateUtils.currentDate());
		elgEqdEligQueueDefaults.setChgTime(DateUtils.currentTime());
		elgEqdEligQueueDefaults.setChgProgramName("JAVA_PRG");
		elgEqdEligQueueDefaults.setChgUserName("TEST_USER");
		return elgEqdEligQueueDefaults;
	}
}