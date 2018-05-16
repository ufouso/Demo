package com.test.java.SubObserver;

public class TestSubOb {
	
	public static void main(String[] args) {
		
		SubServerImpl sub = new SubServerImpl();
		
		ObserverImpl obs1 = new ObserverImpl(sub);
		ObserverImpl obs2 = new ObserverImpl(sub);
		ObserverImpl obs3 = new ObserverImpl(sub);
		
		sub.noticeObserver();
		
	}
}
