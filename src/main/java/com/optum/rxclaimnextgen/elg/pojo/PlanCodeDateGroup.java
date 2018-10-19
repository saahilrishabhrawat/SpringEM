package com.optum.rxclaimnextgen.elg.pojo;

import org.apache.commons.lang3.StringUtils;

public class PlanCodeDateGroup {
	private String planCode;
	private DateType planEffDate;

	/**
	 * @return the planCode
	 */
	public String getPlanCode() {
		return planCode;
	}

	/**
	 * @param planCode the planCode to set
	 */
	public void setPlanCode(String planCode) {
		this.planCode = StringUtils.trim(planCode);
	}

	/**
	 * @return the planEffDate
	 */
	public DateType getPlanEffDate() {
		return planEffDate;
	}

	/**
	 * @param planEffDate the planEffDate to set
	 */
	public void setPlanEffDate(DateType planEffDate) {
		this.planEffDate = planEffDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PlanCodeDateGroup [planCode=" + planCode + ", planEffDate=" + planEffDate + "]";
	}
	
}
