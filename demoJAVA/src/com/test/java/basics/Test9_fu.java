package com.test.java.basics;

/**
 * 子类初始化的时候后会调用父类的构造函数初始化，
 * 这个时候子类的成员还没有赋值进行显示初始化，所以子类的成员的值还是默认的值。
 * 但是，当调用super结束之后，子类的成员才显示初始化，这个时候值才会有。
 * @author xpp
 *
 */
public class Test9_fu {
	
	public Test9_fu() {
		super();//这个调用的是object
		//此处调用的是重写之后的show()方法。
		show();
		return;
	}
	
	public void show() {
		System.out.println("父类");
	}
	
	public static void main(String[] args) {
		//对象创建的同时调用了父类的构造函数方法
		Test9_zi zi = new Test9_zi();
		zi.show();
	}
}
class Test9_zi extends Test9_fu{
	
	private int num  =8;
	
	public Test9_zi() {
		//当调用父类初始化结束之后，子类对象的成员显示初始化才执行，
		//所以执行super()之后的方法，输出的子类成员才会有值。
		super();
		System.out.println("子类"+num);
		return;
	}
	//此处子类重写了父类的方法，
	public void show() {
		System.out.println("子类"+num);
	}
	
}
