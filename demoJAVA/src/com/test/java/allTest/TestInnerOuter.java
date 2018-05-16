package com.test.java.allTest;

/**
 * 成员内部类，就是作为外部类的成员，可以直接调用外部类的所有成员变量和方法，即使是private的，
 * 同时，外部类要访问内部类的成员变量和方法，则需要通过内部类的对象来获取。
 * @Description 
 * @author xpp
 * @date 2017年8月31日 上午9:03:40
 */
public class TestInnerOuter {
	
	private static String a = "11111";
	
	
	public static void main(String[] args) {
//		for(String f : args){
//			System.out.println("main中的参数："+f);
//		}
		System.out.println("外部类的方法");
		TestInnerOuter tio = new TestInnerOuter();
		
		//调用内部类的方法
		TestInnerOuter.Innter inner = tio.new Innter();
		inner.InnerMethod();
		
		
	}
	
	private static void doIt(){
		System.out.println("外部类的方法doIt");
	}
	
	
	public class Innter{
		
		private String a = "22222";
		
		private void InnerMethod(){
			doIt();
			System.out.println(a);
			System.out.println(TestInnerOuter.a);
			System.out.println("内部类的方法。。。");
		}
		
	}
}
