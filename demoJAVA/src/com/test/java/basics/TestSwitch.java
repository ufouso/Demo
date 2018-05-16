package com.test.java.basics;

public class TestSwitch {
	
	public static void main(String[] args) {
//		ifTest();//4015      33116  
//		switchTest();//3539  33220  32870  33297
	}
	
	public static void switchTest() {
		long  begin = System.currentTimeMillis();
		for(int i = 0;i<10000000;i++) {
			int a = 1;
			switch(a) {
				case 2:
					System.out.println("222");
					break;
				case 3:
					System.out.println("333");
					break;
				case 1:
					System.out.println("111");
					break;
				default:
					System.out.println("default");
			}
			
		}
		long  end = System.currentTimeMillis();
		System.out.println(end-begin);
	}
	
	public static void ifTest() {
		long  begin = System.currentTimeMillis();
		for(int i=0;i<10000000;i++) {
			int a = 1;
			if(a == 2) {
				System.out.println("222");
			}else if(a == 3) {
				System.out.println("333");
			}else if(a == 1){
				System.out.println("111");
			}
		}
		long  end = System.currentTimeMillis();
		System.out.println(end-begin);
	}
}
