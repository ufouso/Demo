package com.test.java.Thread;

public class Thread4 {
	
	public static void main(String[] args) {
		System.out.println("主线程开始："+Thread.currentThread().getName());
		MyThread1 mt = new MyThread1();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		t1.start();
		t2.start();
		try {
			//一般情况下，如果子线程中的代码执行时间过长的话，那么主线程会提前结束
			//为了让主线程能够调用到子线程的执行结果，可以使用join来执行，
			//当前线程等待加入的线程执行完毕之后再执行。
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		System.out.println("主线程结束："+Thread.currentThread().getName());
	}
}

class MyThread1 implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread()+"---"+i);
		}
	}
}
class MyThread2 implements Runnable{
	@Override
	public void run() {
		
	}
}
