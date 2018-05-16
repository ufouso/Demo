package com.test.java.poolThread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class TestBlockingQueue {
	
	@Test
	public void testOne() throws InterruptedException{
		//创建双缓冲队列
		BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(10);
		for(int i=0;i<20;i++ ){
//			bq.put(i);
			boolean a = bq.offer(i, 5, TimeUnit.SECONDS);
			System.out.println("存入是否成功："+ a);
		}
		
	}
}
