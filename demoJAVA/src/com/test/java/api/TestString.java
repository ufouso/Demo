package com.test.java.api;

public class TestString {
	
	public static void main(String[] args) {
//		1.charAt 返回指定索引处的char值
		String faker = "astonmating";
		System.out.println(faker.charAt(5));
		
//		2.compareTo  返回值为0说明相等，为1说明不等
		String faker1 = "astonmating1";
		System.out.println(faker1.compareTo(faker));
		
//		3.
		String a = "aabbcc";
		String b = new String("aabbcc");
		String c = "aabb"+"cc";
		System.out.println(a == b);//false
		System.out.println(a == c);//true;
		System.out.println(a.equals(b));//false :::true
		System.out.println(a.equals(c));//true
//		System.out.println();
		
	}
}
