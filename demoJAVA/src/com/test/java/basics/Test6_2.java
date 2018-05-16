package com.test.java.basics;

/**
 * 
 * @author xpp
 *
 */
public class Test6_2 {
	
	int x;
	
	public static void main(String[] args) {
		Test6_2 test = new Test6_2();
		show(test);
		System.out.println(test.x);//输出结果为4.
	}
	
	public static void show(Test6_2 test) {
		test.x=4;
	}
	
}
