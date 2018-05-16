package com.test.java.allTest;

import java.util.Scanner;

public class Test {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		while(true){
//			System.out.println(sc.nextLine());
//		}
		String a = sc.nextLine();
		
		System.out.println(a.concat("ddddd"));
		
		String ff = new String(a.getBytes(),1,2);
		System.out.println(ff);
	}
}
