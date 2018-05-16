package com.test.java.poolThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPoolThread {
	
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		for(int j=0;j<5;j++){
			Handle h = new Handle();
			threadPool.execute(h);
		}
	}
}

class Handle implements Runnable{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("执行当前的线程为："+name);
		for(int i=0;i < 10;i++){
			try {
				System.out.println(name+"为："+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("当前执行完毕！");
		
	}
	
	
	
}
