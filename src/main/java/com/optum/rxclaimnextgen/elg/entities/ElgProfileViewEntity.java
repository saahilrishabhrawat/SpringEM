/**
 * 
 */
package com.optum.rxclaimnextgen.elg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author hsharm21
 *
 */

@Entity(name="ElgProfileViewEntity")
public class ElgProfileViewEntity{
	@Column
	private String platformId;
	@Column
	private String carCarrierId;
	@Column
	private String accountId;
	@Column
	private String groupId;
	@Column
	private Date epfCurrentLoadDate;
	@Column
	private Integer epfCurrentLoaded;
	@Id
	@Column(name = "EPF_Load_Identifier", unique = true, nullable = false, updatable = false)
	private String epfLoadIdentifier;
	@Column
	private String epfReformatVersion;
	@Column
	private String epfReformatPgm;
	@Column
	private String epfLoadType;
	@Column
	private String epfStatus;

	public ElgProfileViewEntity() {
		super();
	}

	/**
	 * @param platformId
	 * @param carCarrierId
	 * @param accountId
	 * @param groupId
	 * @param epfCurrentLoadDate
	 * @param epfCurrentLoaded
	 * @param epfLoadIdentifier
	 * @param epfReformatVersion
	 * @param epfReformatPgm
	 * @param epfLoadType
	 * @param epfStatus
	 */
	public ElgProfileViewEntity(String platformId, String carCarrierId, String accountId, String groupId,
			Date epfCurrentLoadDate, Integer epfCurrentLoaded, String epfLoadIdentifier, String epfReformatVersion,
			String epfReformatPgm, String epfLoadType, String epfStatus) {
		super();
		this.platformId = platformId;
		this.carCarrierId = carCarrierId;
		this.accountId = accountId;
		this.groupId = groupId;
		this.epfCurrentLoadDate = epfCurrentLoadDate;
		this.epfCurrentLoaded = epfCurrentLoaded;
		this.epfLoadIdentifier = epfLoadIdentifier;
		this.epfReformatVersion = epfReformatVersion;
		this.epfReformatPgm = epfReformatPgm;
		this.epfLoadType = epfLoadType;
		this.epfStatus = epfStatus;
	}
	/**
	 * @return the epfLoadIdentifier
	 */
	public String getEpfLoadIdentifier() {
		return epfLoadIdentifier;
	}
	/**
	 * @param epfLoadIdentifier the epfLoadIdentifier to set
	 */
	public void setEpfLoadIdentifier(String epfLoadIdentifier) {
		this.epfLoadIdentifier = epfLoadIdentifier;
	}
	/**
	 * @return the platformId
	 */
	public String getPlatformId() {
		return platformId;
	}
	/**
	 * @param platformId the platformId to set
	 */
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}
	/**
	 * @return the carCarrierId
	 */
	public String getCarCarrierId() {
		return carCarrierId;
	}
	/**
	 * @param carCarrierId the carCarrierId to set
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
	 * @param accountId the accountId to set
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
	 * @param groupId the groupId to set
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	/**
	 * @return the epfCurrentLoadDate
	 */
	public Date getEpfCurrentLoadDate() {
		return epfCurrentLoadDate;
	}
	/**
	 * @param epfCurrentLoadDate the epfCurrentLoadDate to set
	 */
	public void setEpfCurrentLoadDate(Date epfCurrentLoadDate) {
		this.epfCurrentLoadDate = epfCurrentLoadDate;
	}
	/**
	 * @return the epfCurrentLoaded
	 */
	public Integer getEpfCurrentLoaded() {
		return epfCurrentLoaded;
	}
	/**
	 * @param epfCurrentLoaded the epfCurrentLoaded to set
	 */
	public void setEpfCurrentLoaded(Integer epfCurrentLoaded) {
		this.epfCurrentLoaded = epfCurrentLoaded;
	}
	/**
	 * @return the epfReformatVersion
	 */
	public String getEpfReformatVersion() {
		return epfReformatVersion;
	}
	/**
	 * @param epfReformatVersion the epfReformatVersion to set
	 */
	public void setEpfReformatVersion(String epfReformatVersion) {
		this.epfReformatVersion = epfReformatVersion;
	}
	/**
	 * @return the epfReformatPgm
	 */
	public String getEpfReformatPgm() {
		return epfReformatPgm;
	}
	/**
	 * @param epfReformatPgm the epfReformatPgm to set
	 */
	public void setEpfReformatPgm(String epfReformatPgm) {
		this.epfReformatPgm = epfReformatPgm;
	}
	/**
	 * @return the epfLoadType
	 */
	public String getEpfLoadType() {
		return epfLoadType;
	}
	/**
	 * @param epfLoadType the epfLoadType to set
	 */
	public void setEpfLoadType(String epfLoadType) {
		this.epfLoadType = epfLoadType;
	}

	public String getEpfStatus() {
		return epfStatus;
	}

	public void setEpfStatus(String epfStatus) {
		this.epfStatus = epfStatus;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ElgProfileViewEntity [epfLoadIdentifier=" + epfLoadIdentifier + ", platformId=" + platformId
				+ ", carCarrierId=" + carCarrierId + ", accountId=" + accountId + ", groupId=" + groupId
				+ ", epfCurrentLoadDate=" + epfCurrentLoadDate + ", epfCurrentLoaded=" + epfCurrentLoaded
				+ ", epfReformatVersion=" + epfReformatVersion + ", epfReformatPgm=" + epfReformatPgm + ", epfLoadType="
				+ epfLoadType + ", epfStatus=" + epfStatus + "]";
	}



}
