package com.bw.utils;


import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		String extendName = FileUtil.getExtendName("wa.jsp");
		System.out.println(extendName);
		
	}

}
