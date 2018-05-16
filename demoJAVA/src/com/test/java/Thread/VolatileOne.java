package com.test.java.Thread;

/**
 * volatile关键字,这种不能保证原子性。
 * @author xpp
 *
 */
public class VolatileOne {
	
	public volatile int inc = 0;
	
	public void increase(){
		inc++;
	}
	
	public static void main(String[] args) {
		
		VolatileOne vo = new VolatileOne();
		
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
