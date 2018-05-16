package com.test.java.SubObserver;

public class TestOneClass {
	
	public TestOneClass() {}

	public void add() {
		System.out.println("自己修改" );
		TestTwoClass two = new TestTwoClass();
		two.read();
	}
	
	
	
	public static void main(String[] args) {
		TestOneClass one = new TestOneClass();
		TestTwoClass two = new TestTwoClass(one);
		one.add();
	}
}



class TestTwoClass{
	
	private TestOneClass one;
	
	public TestTwoClass() {}
	
	public TestTwoClass(TestOneClass one) {
		this.one = one;
		this.one.add();
	}
	
	public void read() {
		System.out.println("被观察者修改了");
	}
}
