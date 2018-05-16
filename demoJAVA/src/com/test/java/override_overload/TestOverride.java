package com.test.java.override_overload;

public class TestOverride {
	
	public void say(String name){
		System.out.println("father");
		System.out.println(name);
	}
	public static void main(String[] args) {
		TestSon son = new TestSon();
//		son.say();
//		son.say("faker");
		son.say("faker大魔王");
	}
}

class TestSon extends TestOverride{
	//此方法是重载
	public void say(){
		System.out.println("son");
	}
	
	//此方法是重写
	public void say(String name){
		super.say("father");
		System.out.println("重写了父类的say方法");
	}
	
}