package com.test.java.SubObserver;

public interface SubServer {
	/**
	 * 添加观察者
	 */
	public void addObserver(Observer obs);
	/**
	 * 移除观察者
	 */
	public void removeObserver(Observer obs);
	
	/**
	 * 通知所有的观察者，被观察者有修改。
	 */
	public void noticeObserver();
}
