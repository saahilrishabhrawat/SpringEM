/**
 * 
 */
package com.optum.rxclaimnextgen.elg.pojo;

/**
 * @author hsharm21
 *
 */
public class EligProfileView {
	private String platformId;
	private String carCarrierId;
	private String accountId;
	private String groupId;
	private String lastLoad;
	private Integer count;
	private String identifier;
	private String version;
	private String reformat;
	private String load;
	private String epfStatus;

	/**
	 * @return the platformId
	 */
	public String getPlatformId() {
		return platformId;
	}

	/**
	 * @param platformId
	 *            the platformId to set
	 */
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	/**
	 * @return the carrierId
	 */
	public String getCarCarrierId() {
		return carCarrierId;
	}

	/**
	 * @param carCarrierId
	 *            the carrierId to set
	 */
	public void setCarCarrierId(String carCarrierId) {
		this.carCarrierId = carCarrierId;
	}

	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId
	 *            the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the groupId
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * @param groupId
	 *            the groupId to set
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	/**
	 * @return the lastLoad
	 */
	public String getLastLoad() {
		return lastLoad;
	}

	/**
	 * @param lastLoad
	 *            the lastLoad to set
	 */
	public void setLastLoad(String lastLoad) {
		this.lastLoad = lastLoad;
	}

	/**
	 * @return the count
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * @return the identifier
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * @param identifier
	 *            the identifier to set
	 */
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the reformat
	 */
	public String getReformat() {
		return reformat;
	}

	/**
	 * @param reformat
	 *            the reformat to set
	 */
	public void setReformat(String reformat) {
		this.reformat = reformat;
	}

	/**
	 * @return the load
	 */
	public String getLoad() {
		return load;
	}

	/**
	 * @param load
	 *            the load to set
	 */
	public void setLoad(String load) {
		this.load = load;
	}

	public String getEpfStatus() {
		return epfStatus;
	}

	public void setEpfStatus(String epfStatus) {
		this.epfStatus = epfStatus;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EligProfileView [platformId=" + platformId + ", carCarrierId=" + carCarrierId + ", accountId=" + accountId
				+ ", groupId=" + groupId + ", lastLoad=" + lastLoad + ", count=" + count + ", identifier=" + identifier
				+ ", version=" + version + ", reformat=" + reformat + ", load=" + load + ", epfStatus=" + epfStatus + "]";
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
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((carCarrierId == null) ? 0 : carCarrierId.hashCode());
		result = prime * result + ((count == null) ? 0 : count.hashCode());
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
		result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
		result = prime * result + ((lastLoad == null) ? 0 : lastLoad.hashCode());
		result = prime * result + ((load == null) ? 0 : load.hashCode());
		result = prime * result + ((platformId == null) ? 0 : platformId.hashCode());
		result = prime * result + ((reformat == null) ? 0 : reformat.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
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
		EligProfileView other = (EligProfileView) obj;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (carCarrierId == null) {
			if (other.carCarrierId != null)
				return false;
		} else if (!carCarrierId.equals(other.carCarrierId))
			return false;
		if (count == null) {
			if (other.count != null)
				return false;
		} else if (!count.equals(other.count))
			return false;
		if (groupId == null) {
			if (other.groupId != null)
				return false;
		} else if (!groupId.equals(other.groupId))
			return false;
		if (identifier == null) {
			if (other.identifier != null)
				return false;
		} else if (!identifier.equals(other.identifier))
			return false;
		if (lastLoad == null) {
			if (other.lastLoad != null)
				return false;
		} else if (!lastLoad.equals(other.lastLoad))
			return false;
		if (load == null) {
			if (other.load != null)
				return false;
		} else if (!load.equals(other.load))
			return false;
		if (platformId == null) {
			if (other.platformId != null)
				return false;
		} else if (!platformId.equals(other.platformId))
			return false;
		if (reformat == null) {
			if (other.reformat != null)
				return false;
		} else if (!reformat.equals(other.reformat))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}


}
