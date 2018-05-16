package com.test.java.basics;

/**
 * 循环
 * @author xpp
 *
 */
public class Test5 {
	
	public static void main(String[] args) {
		//1.
//		int x=1;
//		while(x<3) {
//			System.out.println("klsajfl");
//			x++;
//		}
//		
//		//do...while必定会执行一次
//		do {
//			System.out.println("1111");
//			x++;
//		}while(x<5);
//		
//		
//		//test1
//		int a = 1;
//		int sum = 0;
//		while(a<=10) {
//			sum+=a;
//			a++;
//		}
//		System.out.println(sum);
//		
//		//test2
//		int count=0;
//		int i = 1;
//		while(i<=100) {
//			if(i%6==0) {
//				count++;
//			}
//			i++;
//		}
//		System.out.println(count);
		
		//test3
//		int d;
//		for(d=0;d<3;d++) {
//			System.out.println("a");
//		}
//		int e=1;
//		for(System.out.println("a");e<3;System.out.println("b")) {
//			System.out.println("c");
//			e++;
//		}
//		//输出结果为：a  c  b  c  b
//		
//		for(int af=0,b=0;af<10;af++,b++) {
//			System.out.println("a");
//		}
		
		//test1,使用for循环来进行数据相加。
//		int x;
//		int sum=0;
//		for(x=0;x<3;x++) {
//			sum+=x;
//		}
//		System.out.println(sum);
//		System.out.println(x);
		//无限循环中,用for的表达形式
//		for(;;) {
//			System.out.println("1");
//		}
		
		
		//嵌套循环，输出*组成的矩形
		//思路：循环单个变成一行，同时换行，再循环这一行
//		for(int x1=0; x1<5; x1++) {
//			for(int y1=0;y1<5;y1++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//9*9乘法表
//		for(int i=1;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(i<j) {
//					break;
//				}
//				System.out.print(i+"*"+j+"="+i*j+"	");
//			}
//			System.out.println();
//		}
		
//		*****
//		****
//		***
//		**
//		*
//		for(int x=0;x<5;x++) {
//			for(int y=0;5-x>0;y++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int x=0;x<5;x++) {
			for(int y=x;y<5;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------");
		// 
//		for(int x=1;x<=5;x++) {
//			for(int y=x;y>0;y--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		*
//		**
//		***
//		****
//		*****
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	}
}
