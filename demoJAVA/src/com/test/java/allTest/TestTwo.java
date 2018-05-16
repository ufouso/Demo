package com.test.java.allTest;

public class TestTwo {
	
	public static void main(String[] args) {
		int i = 1;
		i = i++ + ++i +i++ +i;
//			1       3  3	4
		System.out.println(i);//11
		
		int i1 = 3;
		i1 = i1++;
		System.out.println(i1);
		
		int x = 1634;
		x = x/1000;//1.634,这是错误的，答案是1，因为这个是整型的，不可能有小数点.
		System.out.println(x);
		
		System.out.println(5%2);//1
		System.out.println(3+"2");//32
		System.out.println("5+5="+(5+5));//5+5=10,如果将5+5的括号去掉了，就是5+5=55;有括号会先算括号中的。
		int a = 3, b=4;
		System.out.println("a="+a+",b="+b);//a=3,b=4
		
		
		short s = 3;
		s = (short)(s+4);//必须强转，4是int型的，而s却是short型的，类型不一致。
		System.out.println(s);
		
		
		int c = 5;
		long d = 5l;
		float e = 5f;
		boolean f = true;
		
//		{
//			int g = 4;
//			System.out.println(g);
//		}
//		System.out.println(g);
		
		int h = 3;
		byte j = 5;
		h = h +j;
		System.out.println(h);
	}
}
