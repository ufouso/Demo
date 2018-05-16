package com.test.java.Thread;

/**
 * 1.使用继承的方式：此种方式每次创建对象都会在堆内存中生成一个新的num，启动线程
 * 无法保证num数据的一致性；（当然可以将num变成为静态的成员，但是如果要用多种数值的num时，num就不好改变了）
 * 
 * 1.1 如果使用同一个对象，同时启动4次，那么是会报错的，start方法启动，多次启动一个线程是会报错的。
 * java.lang.IllegalThreadStateException:无效的线程状态异常。
 * 
 * 2.使用实现Runnable接口的方式，这种就可以保证调用执行方法的时候，num是同样的一个数据
 * @author xpp
 *
 */
public class Ticket extends Thread{
	
	private int num = 100;
	
	public void run() {
		while(true) {
			if(num>0) {
				System.out.println(Thread.currentThread().getName()+"----"+num);
			}
		}
	}
	
	public static void main(String[] argsO) {
		Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		Ticket t3 = new Ticket();
		Ticket t4 = new Ticket();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
