package com.test.java.Thread;

public class Thread6 {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(TestThread66.getInstance());
		Thread t2 = new Thread(TestThread66.getInstance());
		Thread t3 = new Thread(TestThread66.getInstance());
		Thread t4 = new Thread(TestThread66.getInstance());
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

/**
 * 饿汉 模式
 * @author xpp
 *
 */
class TestThread6{
	
	private static Thread6 t = new Thread6();
	
	private TestThread6() {}
	
	public static Thread6 getInstance() {
		return t;
	} 
}
/**
 * 懒汉模式,这种是线程不安全的
 * @author xpp
 *
 */
class TestThread66 implements Runnable{
	
	private static TestThread66 t=null;
	
	private TestThread66() {};
	
//	//使用静态方法锁的话，可以解决线程安全的问题，但是会产生效率问题。
//	public static synchronized Thread6 getInstance() {
//		//将此方法放入线程中的run方法中时，会有线程不安全的隐患
//		//可能会产生多个对象，不能保证对象的唯一性，这种就不是单例的了。
//		if(t == null) {
//			t = new Thread6();
//		}
//		return t;
//	}
	
//	//使用静态代码块的话，可以解决线程安全的问题，同时使用判断来解决效率问题
//	public static TestThread66 getInstance() {
//		//这里再添加判断是为了解决当多个线程同时进入的话，第一个拿到了锁，
//        //第二个进不来，第一个没有创建完对象的话，t就会是null,之后所有的都不可能去等待获取锁。
//		if(t==null) {
//			//因为是静态的方法所以不可能使用this,所以使用的锁是类.class
//			synchronized(TestThread66.class) {
//				//将此方法放入线程中的run方法中时，会有线程不安全的隐患
//				//可能会产生多个对象，不能保证对象的唯一性，这种就不是单例的了。
//				if(t == null) {
//					System.out.println("创建对象");
//					t = new TestThread66();
//				}
//			}
//		}
//		return t;
//	}

	
	public static TestThread66 getInstance() {
		if(t == null) {
			System.out.println(Thread.currentThread().getName()+"创建对象");
			t = new TestThread66();
		}
		return t;
	}
	
	@Override
	public void run() {
		getInstance();
	}
}
