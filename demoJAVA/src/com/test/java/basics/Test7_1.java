package com.test.java.basics;

public class Test7_1 {

	private String name;
	
	private int age;
	
	Test7_1(String name){
		this.name = name;
	}
	
	Test7_1(String name,int age){
		this.age = age;
	}

	public void say() {
		System.out.println(name);
	}
	
	public  boolean compare(Test7_1 test) {
		return this.age == test.age;
	}
	
	
	public static void main(String[] args) {
		Test7_1 test = new Test7_1("a",10);
		test.say();
		Test7_1 test1 = new Test7_1("a",11);
		System.out.println(test.compare(test1));
	}
}
