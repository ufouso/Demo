package com.test.java.allTest;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class TestA {

	public static void main(String[] args) {
		 String LOCATION = ""; 
		    String URLLOCATION = ""; 
		    try {     
//		    	String a = null;
//		    	System.out.println(a.length());
		    	
		    	
		    	
				LOCATION =TestA.class.getProtectionDomain().getCodeSource().getLocation().getFile(); 
				URLLOCATION =  URLDecoder.decode(LOCATION, "UTF-8"); 
		    } catch (UnsupportedEncodingException e) { 
				e.printStackTrace();
		    } 
		    System.out.println("** loc=" + LOCATION + "; URLLoc=" + URLLOCATION);

	}
}
