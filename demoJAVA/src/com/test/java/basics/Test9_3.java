package com.test.java.basics;

/**
 * 抽象类
 * @author xpp
 *
 */
public abstract class Test9_3 {
	
	void show1() {}
	
	void show2() {}

	abstract void show();
}

class Demo9_3 extends Test9_3{

	@Override
	public void show() {
		
	}
}