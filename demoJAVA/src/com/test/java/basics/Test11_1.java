package com.test.java.basics;

public class Test11_1 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[3];
		Test11_1 t = new Test11_1();
		try {
			t.doTest(arr, -3);
		}catch(SomeException e) {
			
		} catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();//jvm默认的异常处理机制就是调用异常的对象的这个方法。
		}
		
	}
	
	public static int doTest(int[] arr, int index) throws SomeException {
		if(index <0) {
			throw new SomeException("666");
		}
		return arr[index];
	}
}

/**
 * 如果让一个类称为异常类，必须要继承异常体系，
 * 因为只有称为异常体系的子类才有资格具备可抛性。
 * 两个关键字：throws throw;
 * @author xpp
 *
 */
class SomeException extends Exception{
	
	public SomeException() {
	}
	
	public SomeException(String a) {
		super(a);
	}
}