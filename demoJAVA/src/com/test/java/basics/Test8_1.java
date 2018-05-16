package com.test.java.basics;

public class Test8_1 {
	
	//该类中的方法都是静态的，所以不需要创建对象,保证不让创建对象,可以将构造函数私有化.
	private Test8_1() {}
	
	public static void show() {
		System.out.println("111");
	}
	
	public static void dotest() {
		System.out.println("222");
	}
}
