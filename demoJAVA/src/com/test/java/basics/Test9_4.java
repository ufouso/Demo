package com.test.java.basics;

public class Test9_4 extends DemoFu implements Demo1,Demo2{
	//Demo1和Demo2中的抽象方法同名
	//此时多实现，同时重写了Demo1和Demo2中的show方法。
	public void show() {
		
	}
}
//接口1
interface Demo1 extends Demo2, Demo3{
	public void show();
}
//接口2
interface Demo2{
	public void show();
}

interface Demo3{
	public void show();
}
//父类
class DemoFu{
	public void show() {
		
	}
}