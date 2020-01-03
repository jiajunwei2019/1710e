package com.jiajunwei.util;

import java.util.HashSet;
import java.util.Random;

/**
 * 
 * @ClassName: StringUtil 
 * @Description: TODO
 * @author: Administrator
 * @date: 2020年1月2日 下午6:56:45
 */
public class RandomUtil {

	public static int reandom(int min,int max) {
		Random random = new Random();
		int nextInt = random.nextInt(max-min+1)+min;
		return nextInt;
		
	}
	public static int[] subRandmo(int min,int max,int subs) {
		int i[]=new int[subs];
		HashSet<Integer> set=new HashSet<Integer>();
		
		while(set.size()!=subs) {
			int reandom = reandom(min, max);
			set.add(reandom);
		}
		int ii=0;
		for (Integer integer : set) {
			i[ii]=integer;
			ii++;
		}
		return i;
	}
	 
	public static char randomCharacter() {
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		return str.charAt(reandom(0, str.length()-1));
		
	}
	public static String randmoString(int length) {
		String str="";
		for (int i = 0; i <length ; i++) {
			str+=randomCharacter();
		}
		return str;
	}
	
}
