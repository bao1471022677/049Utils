package com.bw.utils;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetDateByInitMonth() {
		
		Date date = new Date();
		Date dateByInitMonth = DateUtil.getDateByInitMonth(date);
		String string = dateByInitMonth.toString();
		System.out.println(string);
		
	}

	@Test
	public void testGetDateByFullMonth() {
		Date dateByFullMonth = DateUtil.getDateByFullMonth(new Date());
		System.out.println(dateByFullMonth.toString());
		
	}

}
