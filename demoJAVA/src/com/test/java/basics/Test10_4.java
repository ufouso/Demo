package com.test.java.basics;

/**
 * 内部类，为什么内部类能直接访问外部类的成员：
 * 是因为内部类是持有外部类的引用，外部类名.this；
 * @author xpp
 *
 */
public class Test10_4 {
	public static void main(String[] args) {
		new Outer2().new Inter().show();
	}
}
class Outer2{
	private int num=3;

	class Inter{
		int num = 4;
		void show() {
			int num = 5;
			System.out.println(num);//输出结果为5;
			System.out.println(this.num);//输出结果为4；
			System.out.println(Outer2.this.num);//输出结果为3；
		}
	}
	public void show() {
		new Inter().show();
	}
}

