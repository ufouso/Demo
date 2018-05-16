package com.test.java.Thread;

/**
 * 创建线程的方式二
 * @author xpp
 *
 */
public class Thread3 implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i<20;i++) {
			System.out.println(Thread.currentThread().getName()+"---------"+i);
		}
	}
	
	public static void main(String args[]) {
		Thread3 t1 = new Thread3();
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t1);
		thread1.start();
		thread2.start();
		
		System.out.println(Thread.currentThread().getName());
	}
}
