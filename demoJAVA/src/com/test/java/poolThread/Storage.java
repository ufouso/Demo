package com.test.java.poolThread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 
 * @Description 仓储 
 * @author xpp
 * @date 2017年8月28日 下午3:45:31
 */
public class Storage {
	
	BlockingQueue<Product> bq = new LinkedBlockingQueue<Product>(10);
	
	
	public BlockingQueue<Product> getBq() {
		return bq;
	}

	public void setBq(BlockingQueue<Product> bq) {
		this.bq = bq;
	}

	/**
	 * 往双缓冲队列中添加数据。	
	 * @param p
	 * @throws InterruptedException
	 */
	public void push(Product p) throws InterruptedException{
		bq.put(p);
	}
	
	/**
	 * 往双缓冲队列中删除数据
	 * @throws InterruptedException 
	 */
	public void pop() throws InterruptedException{
		bq.take();//此方法取走BlockingQueue里排在首位的对象,若BlockingQueue为空,阻断进入等待状态直到 
				  //BlockingQueue有新的数据被加入; 
	}
}
