package com.test.java.basics;

public class Test9_1 {
	
	public Test9_1() {
		System.out.println("父");
	}
	
	public static void main(String[] args) {
		Test9_11 tt = new Test9_11();
	}
}

class Test9_11 extends Test9_1{
	
//	public Test9_11(int x) {
//		super();
//		System.out.println("子");
////		this();
//	}
	
	
	public Test9_11() {
		super();
		System.out.println("子");
	}
	
}


class Test9_111 {//extends Object{
	
	public Test9_111() {
		super();//这个调用的就是object
		return;
	}
}
