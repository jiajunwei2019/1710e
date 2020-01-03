package com.jiajunwei.util;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testReandom() {
		for (int i = 0; i < 5; i++) {
			RandomUtil.reandom(1, 3);
		}
	
	}
	@Test
	public void testReandom1() {
		 RandomUtil.subRandmo(1, 10, 3);
	
	}
	@Test
	public void testReandom2() {
		String randmoString = RandomUtil.randmoString(4);
	    System.out.println(randmoString);
	}
	@Test
	public void testReandom3() {
		
	
	}
	@Test
	public void testReandom4() {
		
	
	}
	

}
