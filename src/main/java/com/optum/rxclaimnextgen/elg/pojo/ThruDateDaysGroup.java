package com.optum.rxclaimnextgen.elg.pojo;

import org.apache.commons.lang3.StringUtils;

public class ThruDateDaysGroup {
	private DateType egdThruDate;
	private String egdThruDays;

	/**
	 * @return the egdThruDate
	 */
	public DateType getEgdThruDate() {
		return egdThruDate;
	}

	/**
	 * @param egdThruDate the egdThruDate to set
	 */
	public void setEgdThruDate(DateType egdThruDate) {
		this.egdThruDate = egdThruDate;
	}

	/**
	 * @return the egdThruDays
	 */
	public String getEgdThruDays() {
		return egdThruDays;
	}

	/**
	 * @param egdThruDays the egdThruDays to set
	 */
	public void setEgdThruDays(String egdThruDays) {
		this.egdThruDays = StringUtils.trim(egdThruDays);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ThruDateDaysGroup [egdThruDate=" + egdThruDate + ", egdThruDays=" + egdThruDays + "]";
	}

}