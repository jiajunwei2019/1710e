package com.jiajunwei.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {

	
	public static List<String> readLine(InputStream in){
		List<String> list=new ArrayList<String>();
		BufferedReader reader=new BufferedReader(new InputStreamReader(in));
	    String str=null;
	    try {
			while((str=reader.readLine())!=null) {
				
			list.add(str);	
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	    
		return list;
	}
	
	
	
}
