package com.test.java.basics;
/**
 * 匿名内部类
 * @author xpp
 *
 */
public class Test10_6 {
	
	public static void main(String[] args) {
		Outer4 out = new Outer4();
		out.dotest();
		
		function(
			new Demoshow() {
				@Override
				public void show2() {
					System.out.println("show2");
				}

				@Override
				public void show1() {
					System.out.println("show1");
				}
			}
		);
	}
	
	public static void function(Demoshow ds) {
		ds.show1();
		ds.show2();
	}
}

abstract class Demo{
	
	abstract void show();
	
	abstract void showw();
}

class Outer4{
	
	private int num=5;
	
	void dotest() {
		//匿名内部类必须是继承或者实现接口
		Demo dd = new Demo() {
			void show() {
				System.out.println("输出num:"+num);
			}

			@Override
			void showw() {
				System.out.println("showw");
			}
		};
		dd.show();
	}
}


interface Demoshow{
	void show1();
	void show2();
}
