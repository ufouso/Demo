package com.test.java.basics;

public class Test7_3 {
	
	{//构造代码块是给所有对象初始化的，而构造函数是给特定的对象进行初始化的。
		System.out.println("333");
	}

	static {//静态代码块只会执行一次，随着类的加载而加载
		System.out.println("1111");
	}
	
	public void show() {
		System.out.println("2222");
	}
	
	public static void main(String[] args) {
		new Test7_3().show();
		new Test7_3().show();
	}
}
