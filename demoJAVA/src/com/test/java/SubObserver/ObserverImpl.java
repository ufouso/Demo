package com.test.java.SubObserver;
/**
 * 观察者的实现类
 * @author xpp
 *
 */
public class ObserverImpl implements Observer {
	
	private SubServer sub;
	
	/**
	 * 
	 * @param sub
	 */
	public ObserverImpl(SubServer sub) {
		this.sub = sub;
		this.sub.addObserver(this);
	}
	
	
	@Override
	public void updateSome() {
		System.out.println("被观察者改变了");
	}

}
