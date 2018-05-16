package com.test.java.allTest;

public class Test4 {
	
	public static void main(String[] args) {
		int a = 4;
		int b = 9;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
//		0100
//		1001
//		
//		1101 
//		1001
//		0100
//		1101
//		0100
//		1001
		 
		 
		a = a^b; //1101 
		b = a^b; //0100
		a = a^b; //1001
	}
}
