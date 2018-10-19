package com.optum.rxclaimnextgen.elg.utils;

import com.optum.rxclaimnextgen.elg.pojo.DateType;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class DateUtilsTest {

    @Test
    public void convertDateToString() throws Exception {
        Date testDate = new Date(1530032456000L);
        String expectedDateString = "06/26/2018";

        assertEquals(expectedDateString, DateUtils.convertDateToString(testDate));
    }

    @Test
    public void parseToSqlDateType() {
        java.util.Date inputDate = new java.util.Date(1530032456000L);

        DateType expected = new DateType();
        expected.setMonth("06");
        expected.setDay("26");
        expected.setYear("2018");

        assertEquals(expected.toString(), DateUtils.convertUtilDateTODateType(inputDate).toString());
    }
}