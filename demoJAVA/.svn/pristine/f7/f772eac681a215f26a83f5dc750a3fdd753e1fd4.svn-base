package com.test.java.poolThread;

/**
 * 
 * @Description: 生产者
 * @author xpp
 * @date 2017年8月28日 下午3:28:02 
 * @version V1.0
 */
public class Producer implements Runnable{
	
	private String name;
	
	private Storage storage;
	
	private Producer(String name, Storage storage){
		this.name = name;
		this.storage = storage;
	}
	
	
	@Override
	public void run() {
		try {
			while(true){
				System.out.println(name + "生产者开始生产");
				String id =  Integer.toString((int)Math.random()*10000);
				Product  p = new Product(id);
				storage.push(p);
				System.out.println(name + "商品已经生产了一个；");
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
