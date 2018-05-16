package com.test.java.Thread;

/**
 * 两个人同时往一个金库中存入100，都存3次。
 * @author xpp
 *
 */
public class Thread5 {
	
	public static void main(String[] arsg) {
		Cust c = new Cust();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}
}
//金库
class Bank{
	
	private int num;
	
	//bank在线程中是同一个，那么其中的成员也是同一个
//	private Object obj = new Object();
	
	//将同步代码块改为同步函数
	public synchronized void add(int money) {
//		synchronized(obj) {
			num = num+money;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("存入后金库金额为："+num);
//		}
	}
}
//储户
class Cust implements Runnable{
	//必须保证是同一个金库
	Bank b = new Bank();
	
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			b.add(100);
		}
	}
}