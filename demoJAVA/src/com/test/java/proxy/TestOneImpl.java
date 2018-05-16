package com.test.java.proxy;

public class TestOneImpl implements TestOne{

	@Override
	public void addSome() {
		System.out.println("添加");
	}

	@Override
	public void delSome() {
		System.out.println("删除");
	}

}
