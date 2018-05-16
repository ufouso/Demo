package com.test.java.basics;
/**
 * 
 * @author xpp
 *
 */
public class Test3 {
	
	public static void main(String[] args) {
		System.out.println(1==1 & 1==2);
		
		
		System.out.println(2<<3);
		
		//进行数据互换，但是不能使用临时变量。
		int a = 1;
		int b = 2;
		//方法一：使用的是异或
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("a="+a+",b="+b);
		//方法二：使用的是加减，但是有可能导致强制类型转换。
		a = a+b;
		b = a-b;
		a = a-b;
		//这种方式可能导致强制类型转换.
		System.out.println("a="+a+",b="+b);
		
		//使用的反码
		int f = 6;
		System.out.println(~f);
		//3个数进行比较大小。
		int i=1,j=2, k=3;
		System.out.println((i>j?i:j)>k?(i>j?i:j):k);
		
		
		int m = 3;
		{//局部代码块
			System.out.println("局部代码块"+m);
		}
		System.out.println(m);
		
		{
			//ff的作用域在这个大括号中有效，ff在出了代码块之后，内存中会被释放
			int ff = 3;
			System.out.println("局部代码块"+ff);
		}
		//所以这里根本就访问不到。
//		System.out.println(ff);
	}
}
