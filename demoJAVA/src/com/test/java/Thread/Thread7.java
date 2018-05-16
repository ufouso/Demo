package com.test.java.Thread;

/**
 * 测试死锁
 * @author xpp
 *
 */
public class Thread7{

	public static void main(String[] args) {
		
		
	}
	
}

class TestO1 implements Runnable{
	private int num = 100;
	
	Object obj = new Object();
	
	@Override
	public void run() {
//		if() {
//		}
		
	}
	
	public synchronized void show() {
		System.out.println("this锁");
		synchronized(obj) {
			System.out.println("obj锁");
		}
	}
	
}
