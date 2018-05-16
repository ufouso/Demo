package com.test.java.basics;

/**
 * 内部类作为局部成员
 * @author xpp
 *
 */
public class Test10_5 {

	public static void main(String[] args) {
		Outer3 out = new Outer3();
		out.method();
	}
}


class Outer3{
	void method() {
		int x = 5;
		class Inter{
			void show() {
				System.out.println("num:"+x);
			}
		}
		new Inter().show();
	}
}