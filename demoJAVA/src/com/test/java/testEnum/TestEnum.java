package com.test.java.testEnum;

/**
 * 测试枚举类型
 * @Description 
 * @author xpp
 * @date 2017年9月5日 下午4:08:11
 */
public class TestEnum {
	
	public enum color{
		Red,
		blue,
		whilte,
		faker
	}
	
	
	
	public static void main(String[] args) {
		color color1 = color.Red;
		System.out.println(color1);
	}
		
}
