package com.test.java.SubObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者的实现类
 * @author xpp
 *
 */
public class SubServerImpl implements SubServer {
	
	private List<Observer> list=null;
	
	public SubServerImpl() {
		if(list == null) {
			list = new ArrayList<Observer>();
		}
	}
	/**
	 * 添加观察者
	 */
	@Override
	public void addObserver(Observer obs) {
		list.add(obs);
	}
	/**
	 * 移除观察者
	 */
	@Override
	public void removeObserver(Observer obs) {
		if(list.indexOf(obs)>=0) {
			list.remove(obs);
		}
	}
	/**
	 * 通知观察者修改
	 */
	@Override
	public void noticeObserver() {
		for(int i=0;i<list.size();i++) {
			Observer ob = list.get(i);
			ob.updateSome();
		}
	}
	
}
