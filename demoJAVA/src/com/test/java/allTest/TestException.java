package com.test.java.allTest;

public class TestException {
	
	public static void main(String[] args) {
		try {
			dosome();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void dosome() throws Exception{
		try {
			throw new Exception("内部失败");
		} catch (Exception e) {
			throw new Exception("失败");
		}
	}
}
