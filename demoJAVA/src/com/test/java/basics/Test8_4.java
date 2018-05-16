package com.test.java.basics;

public class Test8_4 {
	
	private int num;
	
	//通过方法来获取到父类的num;
	public int getNum() {
		return num;
	}
	
}

class Zi extends Test8_4{
	
	private int num;
	
	public void show() {
		System.out.println(this.num +"======"+ super.getNum());
	}
	
	
	public static void main(String[] args) {
		Zi zi = new Zi();
		
	}
}
