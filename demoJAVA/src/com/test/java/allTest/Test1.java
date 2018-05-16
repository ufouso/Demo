package com.test.java.allTest;

public class Test1 {
	
	public static void main(String[] args) {
		
		for(int x=0;x<=5;x++) {
			for(int y=1;y<=5-x;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for(int a=0;a<5;a++) {
			for(int b=5;b-a>0;b--) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		for(int aa=1;aa<=5;aa++) {
			for(int bb=1;bb<=aa;bb++ ) {
				System.out.print(bb);
			}
			System.out.println();
		}
		
		
		
	}
}
