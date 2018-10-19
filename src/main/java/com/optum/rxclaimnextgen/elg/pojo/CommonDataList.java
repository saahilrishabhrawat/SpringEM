/**
 * 
 */
package com.optum.rxclaimnextgen.elg.pojo;

/**
 * @author Hemant Sharma
 *
 */
public class CommonDataList {
	private String listID;
	private String listDesc;
	private String valueID;
	private String valueDesc;

	/**
	 * @return the listID
	 */
	public String getListID() {
		return listID;
	}

	/**
	 * @param listID the listID to set
	 */
	public void setListID(String listID) {
		this.listID = listID;
	}

	/**
	 * @return the listDesc
	 */
	public String getListDesc() {
		return listDesc;
	}

	/**
	 * @param listDesc the listDesc to set
	 */
	public void setListDesc(String listDesc) {
		this.listDesc = listDesc;
	}

	/**
	 * @return the valueID
	 */
	public String getValueID() {
		return valueID;
	}

	/**
	 * @param valueID the valueID to set
	 */
	public void setValueID(String valueID) {
		this.valueID = valueID;
	}

	/**
	 * @return the valueDesc
	 */
	public String getValueDesc() {
		return valueDesc;
	}

	/**
	 * @param valueDesc the valueDesc to set
	 */
	public void setValueDesc(String valueDesc) {
		this.valueDesc = valueDesc;
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
		result = prime * result + ((listID == null) ? 0 : listID.hashCode());
		result = prime * result + ((valueID == null) ? 0 : valueID.hashCode());
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
		CommonDataList other = (CommonDataList) obj;
		if (listID == null) {
			if (other.listID != null)
				return false;
		} else if (!listID.equals(other.listID))
			return false;
		if (valueID == null) {
			if (other.valueID != null)
				return false;
		} else if (!valueID.equals(other.valueID))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommonList [listID=" + listID + ", listDesc=" + listDesc + ", valueID=" + valueID + ", valueDesc="
				+ valueDesc + "]";
	}

}
