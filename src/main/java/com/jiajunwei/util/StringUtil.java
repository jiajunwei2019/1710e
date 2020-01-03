package com.jiajunwei.util;

public class StringUtil {
    
	public static boolean has(String str) {
		
		return null!=str&&str.length()>0;
	}
	public static boolean hasTe(String str) {

		return null!=str&&str.trim().length()>0;
	}
	public static boolean is(String src) {
		if(hasTe(src)) {
			String reg="1[3|5|6|7|8]\\d{9}";
			return src.matches(reg);
			
		}
		return false;
	}
	public static boolean isEmali(String str) {
		
		if(hasTe(str)) {
			String reg="\\w+\\@\\w+\\.\\w+";
			return str.matches(reg);
			
		}
		return false;
	}
}
