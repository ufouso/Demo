package com.test.java.basics;

/**
 * 匿名内部类的细节
 * @author xpp
 *
 */
public class Test10_7 {

	static class Inter{
	}
	
	public static void main(String[] args) {
		System.out.println("11111");
		//此处会报错，因为主函数是静态的，
		//而匿名内部类不是静态的。
		//静态的随着类的加载而加载，此时成员变量都还没有产生。
		//如果Inter是静态的就可以。
		new Inter();
	}
	public void show() {
		//
		new Inter();
	}
	
	public void showw() {
		//此处为匿名内部类，同时这个是实现了Object抽象方法的子类
		new Object() {
			void show() {
				System.out.println("faker666");
			}
		}.show();//此时直接通过子类来调用show()方法。
		
		//注意了，如果Object的子类中有很多的方法时，
		//想通过对象的引用来调用的话，就相当于对象的向上转型
		//如果父类中没有子类的方法，那么父类引用是不能够调用的
		Object ob = new Object() {
			void show1() {
				System.out.println("show1");
			}
			void show2() {
				System.out.println("show2");
			}
		};
		//以下这两种就会报错.
//		ob.show1();
//		ob.show2();
	}
	
}


