package com.test.java.basics;

/**
 * 单例设计模式：保证对象的唯一性
 * @author xpp
 *
 */
public class Test8_2 {

	
	public static void main(String[] args) {
		TestTT tt1 = TestTT.getInstance();
		tt1.setAge(50);
		TestTT tt2 = TestTT.getInstance();
		System.out.println(tt1.getAge());
		System.out.println(tt2.getAge());
		System.out.println(tt1 == tt2);
		//输出结果为：50   50
	}
}

class TestTT{
	//构造函数私有化
	private TestTT() {
	}
	//创建本类对象
	static TestTT tt = new TestTT();
	
	//将创建的对象返回
	public static TestTT getInstance() {
		return tt;
	}

	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}