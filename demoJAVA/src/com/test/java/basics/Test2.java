package com.test.java.basics;

/**
 * 
 * @author xpp
 *
 */
public class Test2 {

	public static void main(String[] args) {
		//这个是强制类型转换，int转 byte;
		byte a = 4;
		byte a1 = 3;
		byte a2 = 4;
		//下面行报错，原因为：a1和a2都是变量，那么a1和a2都有可能是127，那么编译期的时候会判断是否在范围内，就会报精度损失。
		//a = a1+a2;
		
		//运行结果为：5+5=55
		System.out.println("5+5="+5+5);
		//运行结果为：5+5=10
		System.out.println("5+5="+(5+5));
		
		
		int x = 1;
		System.out.println("x="+x++);
		int y = 1;
		y++;
		System.out.println("y="+y);
		System.out.println(3==2);
	}
}
