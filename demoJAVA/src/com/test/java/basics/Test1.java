package com.test.java.basics;

public class Test1 {
	
	private static final char a = 'A';
 	
	public static void main(String[] args) {
		System.out.println('A'+1);//66
		System.out.println((char)65);//A
		System.out.println('你'+0);//20320
		System.out.println('你'+1);//20321
		System.out.println('A'+0);//65
		System.out.println((char)48);//0
		System.out.println('a'+0);//97
		
		byte a = 4;
		byte b = 5;
		//此处需要强转
		byte c = (byte)(a+b);
		System.out.println(c);
	}
}

//0110 1011
//
//
//752

