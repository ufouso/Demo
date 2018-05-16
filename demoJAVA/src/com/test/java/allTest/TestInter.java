package com.test.java.allTest;

public class TestInter {
	
	public static void main(String[] args) {
		
	}
	
	public void show() {
		
		int age = 22;
		
		class Inner{
			int num = 5;
			void show() {
				System.out.println(num);
				System.out.println(age);
			}
		}
		new Inner().show();
	}
}
