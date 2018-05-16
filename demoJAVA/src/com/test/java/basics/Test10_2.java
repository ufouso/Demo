package com.test.java.basics;

/**
 * 内部类
 * @author xpp
 *
 */
public class Test10_2 {
	public static void main(String[] args) {
		Outer out = new Outer();
		out.show();
	}
}
class Outer{
	private int num=3;

	class Inter{
		//这是内部类就可以调用外部类的成员了。
		public void show() {
			System.out.println("输出内部类："+num);
		}
	}
	//如果外部类想要访问内部类的成员的话，
	//就必须调用内部类的对象来调用；
	public void show() {
		new Inter().show();
	}
}

