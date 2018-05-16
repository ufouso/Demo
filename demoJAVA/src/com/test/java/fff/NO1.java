package com.test.java.fff;

public class NO1 {
	
	public int show(String num,String str) {
		System.out.println(num+"====="+str);
		return 111;
	}
	
	
	public static void show(int a) {
		switch (a) {
		default:
			System.out.println("default");
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
		}
	}
	
	public static void main(String[] args) {
		show(3);
//		show(4);
	}
}
