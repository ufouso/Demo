package com.test.java.Thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 这个方法使用integer时，必须加上synchronized才能保证不会出现并发线程同时
 * 访问的问题。
 * @author xpp
 *
 */
public class OneTest {
	
	private static Integer count = 0;
	
	synchronized public static void increment(){
		count++;
	}
	
}

/**
 * 这种AtomicInteger则不用加上synchronized,因为它是提供原子性的。
 * 适合高并发情况下通过线程安全的方式操作加减。
 * @author xpp
 *
 */
class TwoTest{
	
	private static AtomicInteger atomic = new AtomicInteger(); 
	
	public static void increment(){
		atomic.getAndIncrement();
	}	
}
