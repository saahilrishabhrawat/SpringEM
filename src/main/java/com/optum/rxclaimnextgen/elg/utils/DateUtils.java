/**
 * 
 */
package com.optum.rxclaimnextgen.elg.utils;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.optum.rxclaimnextgen.elg.pojo.DateType;
import com.optum.rxclaimnextgen.elg.services.impl.EligProfileServicesImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Date;

/**
 * @author hsharm21
 *
 */
public class DateUtils {

	private static final Logger LOG = LoggerFactory.getLogger(DateUtils.class);


	public static String convertDateToString(java.util.Date date) {
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String reportDate = df.format(date);
		return reportDate;
	}
	
	public static DateType convertUtilDateTODateType(java.util.Date date) {	
		if(date==null)
		{
			return null;
		}
		
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String reportDate = df.format(date);
		String[] str = reportDate.split("/");
		DateType dt = new DateType();
				dt.setDay(str[1]);
				dt.setMonth(str[0]);
				dt.setYear(str[2]);
				
		
		return dt;
	}

	public static Date parseToSqlDateType(DateType dateObject){
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");
		java.util.Date usdDate = null;
		try {
			if (dateObject != null) {
				usdDate = sdf1.parse(dateObject.getMonth()+"-"+dateObject.getDay()+"-"+dateObject.getYear());
			}
			else {
				usdDate = sdf1.parse("01-01-0001");
			}
		}
		catch (ParseException e) {
			LOG.error("Date Not Parsed Exception !", e);
		}
		java.sql.Date stringToDate = new java.sql.Date(usdDate.getTime());

		return stringToDate;
	}

	public static Date currentDate() {
		return new java.sql.Date(System.currentTimeMillis());
	}

	public static Time currentTime() {
		return new java.sql.Time(System.currentTimeMillis());
	}

	/**
	 * Sets the date to 01-01-0001 when the date should really be null
	 * @return Date
	 */
	public static Date getDefaultValueWhenDateIsNull(){
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");
		java.util.Date usdDate = null;
		try {
			usdDate = sdf1.parse("01-01-0001");
		}
		catch (ParseException e) {
			LOG.error("Date Not Parsed Exception !", e);
		}
		java.sql.Date stringToDate = new java.sql.Date(usdDate.getTime());

		return stringToDate;
	}
	
	/** 
	 * Converts string date(MM/DD/YYYY) to century date(CenturyYYMMDD)
	 * @param inputDate
	 * @return
	 */
	public static int convertDateToCenturyDate(String inputDate) {
		String[] strDate=inputDate.split("/");
		String year=strDate[2];			
		String centuryDt=(Integer.parseInt(year.substring(0, 2)) - 19)+year.substring(2,4)+strDate[0]+strDate[1];		
		return Integer.parseInt(centuryDt);
		}
}
