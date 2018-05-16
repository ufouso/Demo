package com.test.java.Thread;

/**
 * jvm启动时就启动了多个现成的，至少有两个线程可以分析出来
 * 1.执行main函数的线程：该线程的任务代码都定义在main函数中
 * 2.负责垃圾回收的线程：垃圾回收器定义的。
 * @author xpp
 *
 */
public class Thread1 extends Object{
	
	@Override
	public void finalize() throws Throwable{
		System.out.println("垃圾回收");
	}
	
	public static void main(String[] args) {
		new DemoThread1();
		new DemoThread1();
		new DemoThread1();
		new DemoThread1();
		//运行垃圾回收器，因为垃圾回收器会不定期的来回收垃圾，
		//为了测试现象，直接调用运行垃圾回收器。
		System.gc();
		System.out.println("主线程");
	}
}

class DemoThread1{
}