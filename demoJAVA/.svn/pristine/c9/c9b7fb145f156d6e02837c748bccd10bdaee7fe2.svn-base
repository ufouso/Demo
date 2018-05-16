package com.test.java.poolThread;

/**
 * @Description: 消费者
 * @author xpp
 * @date 2017年8月28日 下午3:27:01 
 * @version V1.0
 */
public class Consumer implements Runnable{
	
	private String name;
	
	private Storage storage;
	
	public Consumer(String name, Storage storage){
		this.name = name;
		this.storage = storage;
	}
	
	@Override
	public void run() {
		try {
			while(true){
				System.out.println(name + "消费者准备消费商品！");
				storage.pop();
				System.out.println(name + "消费者已经消费了。");
				Thread.sleep(100);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
