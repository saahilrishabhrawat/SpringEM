/**
 * 
 */
package com.optum.rxclaimnextgen.elg.pojo;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Hemant Sharma
 *
 */
public class AddressGroup {
	private String egdAddress1;
	private String egdAddress2;
	private String egdCity;
	private String egdState;
	private String egdZip;
	private String egdZip2;
	private String egdZip3;
	private String egdCountryCode;

	/**
	 * @return the egdAddress1
	 */
	public String getEgdAddress1() {
		return egdAddress1;
	}

	/**
	 * @param egdAddress1 the egdAddress1 to set
	 */
	public void setEgdAddress1(String egdAddress1) {
		this.egdAddress1 = StringUtils.trim(egdAddress1);
	}

	/**
	 * @return the egdAddress2
	 */
	public String getEgdAddress2() {
		return egdAddress2;
	}

	/**
	 * @param egdAddress2 the egdAddress2 to set
	 */
	public void setEgdAddress2(String egdAddress2) {
		this.egdAddress2 = StringUtils.trim(egdAddress2);
	}

	/**
	 * @return the egdCity
	 */
	public String getEgdCity() {
		return egdCity;
	}

	/**
	 * @param egdCity the egdCity to set
	 */
	public void setEgdCity(String egdCity) {
		this.egdCity = StringUtils.trim(egdCity);
	}

	/**
	 * @return the egdState
	 */
	public String getEgdState() {
		return egdState;
	}

	/**
	 * @param egdState the egdState to set
	 */
	public void setEgdState(String egdState) {
		this.egdState = StringUtils.trim(egdState);
	}

	/**
	 * @return the egdZip
	 */
	public String getEgdZip() {
		return egdZip;
	}

	/**
	 * @param egdZip the egdZip to set
	 */
	public void setEgdZip(String egdZip) {
		this.egdZip = StringUtils.trim(egdZip);
	}

	/**
	 * @return the egdZip2
	 */
	public String getEgdZip2() {
		return egdZip2;
	}

	/**
	 * @param egdZip2 the egdZip2 to set
	 */
	public void setEgdZip2(String egdZip2) {
		this.egdZip2 = StringUtils.trim(egdZip2);
	}

	/**
	 * @return the egdZip3
	 */
	public String getEgdZip3() {
		return egdZip3;
	}

	/**
	 * @param egdZip3 the egdZip3 to set
	 */
	public void setEgdZip3(String egdZip3) {
		this.egdZip3 = StringUtils.trim(egdZip3);
	}

	/**
	 * @return the egdCountryCode
	 */
	public String getEgdCountryCode() {
		return egdCountryCode;
	}

	/**
	 * @param egdCountryCode the egdCountryCode to set
	 */
	public void setEgdCountryCode(String egdCountryCode) {
		this.egdCountryCode = StringUtils.trim(egdCountryCode);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EligGroupDefaultDetailAddress [egdAddress1=" + egdAddress1 + ", egdAddress2=" + egdAddress2
				+ ", egdCity=" + egdCity + ", egdState=" + egdState + ", egdZip=" + egdZip + ", egdZip2=" + egdZip2
				+ ", egdZip3=" + egdZip3 + ", egdCountryCode=" + egdCountryCode + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((egdAddress1 == null) ? 0 : egdAddress1.hashCode());
		result = prime * result + ((egdAddress2 == null) ? 0 : egdAddress2.hashCode());
		result = prime * result + ((egdCity == null) ? 0 : egdCity.hashCode());
		result = prime * result + ((egdCountryCode == null) ? 0 : egdCountryCode.hashCode());
		result = prime * result + ((egdState == null) ? 0 : egdState.hashCode());
		result = prime * result + ((egdZip == null) ? 0 : egdZip.hashCode());
		result = prime * result + ((egdZip2 == null) ? 0 : egdZip2.hashCode());
		result = prime * result + ((egdZip3 == null) ? 0 : egdZip3.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressGroup other = (AddressGroup) obj;
		if (egdAddress1 == null) {
			if (other.egdAddress1 != null)
				return false;
		} else if (!egdAddress1.equals(other.egdAddress1))
			return false;
		if (egdAddress2 == null) {
			if (other.egdAddress2 != null)
				return false;
		} else if (!egdAddress2.equals(other.egdAddress2))
			return false;
		if (egdCity == null) {
			if (other.egdCity != null)
				return false;
		} else if (!egdCity.equals(other.egdCity))
			return false;
		if (egdCountryCode == null) {
			if (other.egdCountryCode != null)
				return false;
		} else if (!egdCountryCode.equals(other.egdCountryCode))
			return false;
		if (egdState == null) {
			if (other.egdState != null)
				return false;
		} else if (!egdState.equals(other.egdState))
			return false;
		if (egdZip == null) {
			if (other.egdZip != null)
				return false;
		} else if (!egdZip.equals(other.egdZip))
			return false;
		if (egdZip2 == null) {
			if (other.egdZip2 != null)
				return false;
		} else if (!egdZip2.equals(other.egdZip2))
			return false;
		if (egdZip3 == null) {
			if (other.egdZip3 != null)
				return false;
		} else if (!egdZip3.equals(other.egdZip3))
			return false;
		return true;
	}

}
