package com.test.java.allTest;
/**
 * 
 * @author xpp
 *
 */
public class TestArray4 {
	
	public static void main(String[] args) {
		get16(60);
		System.out.println();
		get16(0);
		System.out.println();
		get2(60);
	}
	
	public static void get16(int num) {
		if(num ==0) {
			return;
		}
		//定义一个对应的表
		char[] array = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; 
		//定义一个用来存放16进制之后的各个位置的数，这个数组的长度是8，是因为
		//int型的长度是32位，而16进制每4位二进制组成一个16进制位，
		//此处就是个容器用来存放
		char[] chr = new char[8];
		int pos=chr.length;
		int a;
		while(num !=0) {
			a = num &15;
			chr[--pos] =array[a];
			num = num >>>4;
		}
		for(int i=pos;i<chr.length;i++) {
			System.out.print(chr[i]);
		}
	}
	
	public static void get2(int num) {
		char[] array = {'0','1'}; 
		char[] chr = new char[32];
		int pos=chr.length;
		int a;
		while(num !=0) {
			a = num &1;
			chr[--pos] =array[a];
			num = num >>>1;
		}
		for(int i=pos;i<chr.length;i++) {
			System.out.print(chr[i]);
		}
	}
	
	
	public static void getbase(int num) {
		//定义一个数组
		char[] array = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] chr = new char[32];
		
		
		
		
	}
	
	
}
