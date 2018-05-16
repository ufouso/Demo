package com.test.java.basics;

public class Test8_3 {
	
	public static void main(String[] args) {
		
	}
}
//懒汉式：多线程并发访问时，无法保证对象唯一性。
class Single{
	//这种是类加载了对象还没有创建，只有调用了getInstace的时候才创建对象
	//延迟加载形式。
	private static Single s = null;
	
	private Single() {}
	
	public static Single getInstance() {
		if(s == null) {
			s = new Single();
		}
		return s;
	} 
	
}