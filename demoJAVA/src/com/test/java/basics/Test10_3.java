package com.test.java.basics;

/**
 * 内部类
 * @author xpp
 *
 */
public class Test10_3 {
	public static void main(String[] args) {
//		Outer out = new Outer();
//		out.show();
		//1.如果没有静态成员出现的话，直接访问内部类的成员
//		Outer1.Inter in = new Outer1().new Inter();
//		in.show();
		
		//2.如果内部类是静态类的话,那么内部类就相当于一个外部类
//		Outer1.Inter in = new Outer1.Inter();
//		in.show();
		
		//3.如果内部类和内部类中的成员都是静态的话
		//那么就说明类加载之后，静态成员都加载了，直接使用类名调用
		Outer1.Inter.show();
		
		//4.如果内部类不是静态的，但是内部类的成员确实静态的，那么就会报错
		//具体原因是:想调用内部类的静态成员，而内部类却不是静态的，外部类调用内部类就需要创建对象，
		//而内部类的静态成员却需要使用类名来调用，不应该创建对象来调用。
		//最终如果内部类中定义了静态成员的话，那么内部类也必须是静态的。
	
	}
}
class Outer1{
	private static int num=3;

	static class Inter{
		//这是内部类就可以调用外部类的成员了。
		static void show() {
			System.out.println("输出内部类："+num);
		}
	}
	//如果外部类想要访问内部类的成员的话，
	//就必须调用内部类的对象来调用；
	public void show() {
		new Inter().show();
	}
}

