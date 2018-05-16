package com.test.java.allTest;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestAF {
	
	public static void main(String[] args) {
		String a = "T1$T2$T3$T4$T5$T6$T7$T1$T2$";
//		String[] b = a.split("\\$");
//		List<String> list = new ArrayList<String>();
//		for(int i=0;i<b.length;i++) {
//			list.add(b[i]);
//		}
//		Set<String> set = new LinkedHashSet<String>();
//		set.addAll(list);
//		list.clear();
//		list.addAll(set);
//		
//		String fg = "";
//		for(String f : list) {
//			fg += f+"$";
//		}
//		System.out.println(fg);
		
		String[] arr = a.split("\\$");
		Set<String> set = new LinkedHashSet<String>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		float gg = 2.3f;
		double ff = 3.2;
		char h = 'a';
		
		
	}
}
