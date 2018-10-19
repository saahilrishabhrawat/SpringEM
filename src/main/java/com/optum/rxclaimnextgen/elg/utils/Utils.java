package com.optum.rxclaimnextgen.elg.utils;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * This class provides common utilities method.
 * 
 * @author Hemant Sharma
 */
public class Utils {
	/**
	 * remove <b>mask(-)</b> from parameter value and return integer number as
	 * output.
	 * 
	 * @param helpDeskPhone
	 * @return long
	 */
	public static long removeMaskFrmPhone(String helpDeskPhone) {
		return Long.parseLong(StringUtils.remove(helpDeskPhone, Constants.HYPHEN));
	}

	/**
	 * return true if given parameter java collection List object is empty.
	 * 
	 * @param list
	 * @return boolean
	 */
	public static boolean isListEmpty(List<?> list) {
		return (null != list && list.size() > 0) ? false : true;
	}

	/**
	 * return true if given parameter java collection List object is not empty.
	 * 
	 * @param list
	 * @return boolean
	 */
	public static boolean isListNotEmpty(List<?> list) {
		return !isListEmpty(list);
	}

	/**
	 * return true if given parameter matches with "D" or "R" otherwise false
	 * 
	 * @param replacementInd
	 * @return boolean
	 */
	public static boolean isDefaultOrReplace(String replacementInd) {
		return (Constants.REPLACE.equals(replacementInd) || Constants.DEFAULT.equals(replacementInd)) ? true : false;
	}
}
