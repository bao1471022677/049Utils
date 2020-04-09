package com.bw.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		try {
			InputStream stream = new FileInputStream(new File(""));
			StreamUtil.closeAll(stream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		InputStream txtFile = new FileInputStream(new File("D:\\自定义 Office 模板\\w.txt"));
		String readTextFile = StreamUtil.readTextFile(txtFile);
		System.out.println(readTextFile);
		
	}

	@Test
	public void testReadTextFileFile() throws FileNotFoundException {
		InputStream txtFile = new FileInputStream(new File("D:\\自定义 Office 模板\\w.txt"));

		String readTextFile = StreamUtil.readTextFile(txtFile);
		System.out.println(readTextFile);
	}

}
