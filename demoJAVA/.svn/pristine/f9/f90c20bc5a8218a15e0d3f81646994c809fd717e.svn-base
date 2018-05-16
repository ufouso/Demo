package com.test.java.allTest;

public class C{
	static int num = 4; // 静态变量第二个
	{
		num += 3;					//7
		System.out.println("b");   //b
	}
	int a = 5;
	{ // 成员变量第三个
		System.out.println("c");
	}

	C() { // 类的构造函数，第四个加载
		System.out.println("d");    //d
	}

	static { // 静态块，第一个加载
		System.out.println("a");
	}

	static void run() // 静态方法，调用的时候才加载// 注意看，e没有加载
	{
		System.out.println("e");
	}

	public static void main(String[] args) {
		new C();
//		输出结果：a,b, c,d
	}
}