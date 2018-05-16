package com.test.java.Thread;

/**
 * 线程的实现方法一。继承Thread类
 * @author xpp
 * 1.getName()获取线程的名字
 * 2.Thread.currentThread()：当前正在运行的线程的引用
 * 3. 自定义线程的名称，直接调用Thread的构造方法中传入值就可以定义线程的名称
 */
public class Thread2 {
	
	public static void main(String[] args) {
		TestThread th = new TestThread("小李");
		TestThread th1 = new TestThread("TOM");
		//开启线程，调用run方法。
		th.start();
		th1.start();
//		String a = null;
//		System.out.println(a.length());
		System.out.println("over===="+Thread.currentThread().getName());
	}
}
//实现线程的第一种方法
class TestThread extends Thread{
	
	private String name;
	
	//Thread的类中还有定义线程名称的构造方法
	public TestThread(String name) {
		super(name);
//		this.name = name;
	}
	
	@Override
	public void run() {
//		int[] arr = new int[3];
//		System.out.println(arr[3]);
		for(int i=0;i<10;i++) {
			//可以通过Thread中的getName获取线程的名称。
//			System.out.println(name+"======"+i+"------"+getName());
			//获取当前正在运行的线程的名称
			System.out.println(Thread.currentThread().getName());
		}
	}
}