package com.test.java.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 锁
 * @author xpp
 *
 */
public class LockOne {
	
	public int inc = 0;
	
	Lock lock = new ReentrantLock();
	
	public void increase(){
		lock.lock();
		try {
			inc++;
		} finally{
			lock.unlock();
		}
	}
	
	public static void main(String[] args) {
		
		LockOne vo = new LockOne();
		
		for(int i=0;i<10;i++){
			new Thread(){
				public void run(){
					for(int j=0;j<1000;j++){
						vo.increase();
//						inc++;
					}
				}
			}.start();
		}
		while(Thread.activeCount() >1){
			Thread.yield();
		}
		System.out.println(vo.inc);
	}
}
