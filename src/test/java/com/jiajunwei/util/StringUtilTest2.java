package com.jiajunwei.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest2 {

	@Test
	public void testHas() {
		
	}

	@Test
	public void testHasTe() {
		
	}

	@Test
	public void testIs() {
		boolean b = StringUtil.is("15713101382");
	   System.out.println(b);
	}
	

	@Test
	public void testIsEmali() {
		boolean emali = StringUtil.isEmali("number2000@163.com");
	  System.out.println(emali);
	}

}
