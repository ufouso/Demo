package com.test.java.basics;

public class Test10_8 {
	
	public static void main(String[] args) {
		new Zi1();
	}
}


class Fu1{
	
	Fu1(){
		System.out.println("父");
		//子类重写了父类的方法。
		show();
	}
	
	void show() {
		System.out.println("父show");
	}
}

class Zi1 extends Fu1{
	
	int num = 4;
	
	{
		System.out.println("构造代码块"+num);
		num = num+1;
	}
	
	//1
	Zi1(){
		//2
		super();
		//3
		//显示初始化
		//4
		//构造代码块初始化
		System.out.println("子");
		show();
	}
	
	void show() {
		System.out.println("子show"+num);
	}
	
}