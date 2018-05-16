package com.test.java.basics;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author xpp
 *
 */
public class Test4 {
	
	public static void main(String[] args) throws IOException {
		//这个是字节码
//		int i = System.in.read();
		
//		Scanner scan = new Scanner(System.in);
//		String ia = scan.nextLine();
//		int i = Integer.parseInt(ia);
//		System.out.println(i);
//		if(i>=3 && i<=5) {
//			System.out.println("春天");
//		}else if(i>5 && i<=8) {
//			System.out.println("夏天");
//		}else if(i>8 && i<=11) {
//			System.out.println("秋天");
//		}else if((i>11&& i<=12) || (i>=1 && i<=2) ) {
//			System.out.println("冬天");
//		}else {
//			System.out.println("没有对应的季节");
//		}
		
		//int类型的
//		int x = 0;
//		switch (x) {//switch中的x参数只可能是byte,short,int,char类型的,同时还有String
//		case 1:
//			System.out.println(x);
//			break;
//		case 2:
//			System.out.println(x);
//		default:
//			System.out.println("111");
//			break;
//		}
		
		
		//String类型的。
//		String f = "b";
//		switch(f) {
//			case "a":
//				System.out.println("a");
//				break;
//			case "b":
//				System.out.println("b");
//				break;
//			default:
//				System.out.println("default");
//				break;
//		}
		
		//char类型的2个字节，16位
		char E = '%';
		switch(E) {
		case '%':
			System.out.println("输出%");
			break;
		case '+':
			System.out.println("输出+");
			break;
		default:
			System.out.println("输出默认");
		}
		
		
		
//		byte A = 'a';
//		System.out.println(A);
//		short B = 12;
//		int C = 12;
//		long D = 32;
		
		int ii=1;
		switch(ii) {
		case 3:
		case 4:
		case 5:
			System.out.println("春天");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏天");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋天");
			break;
		case 1:
		case 2:
		case 12:
			System.out.println("冬天");
			break; 
		default:
			System.out.println("不在月份范围");
		}
		
	}
}
