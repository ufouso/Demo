package com.test.java.Thread;

/**
 * 实现runnable接口
 * @author xpp
 *
 */
public class Ticket1 implements Runnable{

	private int num = 10;

	Object obj = new Object();
	
	@Override
	public void run() {
		
		while(true) {
			//此处的obj就相当于锁
			synchronized(obj) {
				if(num >0) {
					//此处有可能出现线程不安全的情况，有出现负数的可能，可以使用同步代码块来解决
					//保证共享的数据只被一条执行，不会出现并发的可能
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"======"+num--);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Ticket1 t = new Ticket1();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
