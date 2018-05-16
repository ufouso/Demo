package com.test.java.basics;

/**
 * finally代码块
 * @author xpp
 *
 */
public class Test11_2 {
	
	public static void main(String[] args) throws Exception {
		int[] arr = new int[3];
		TestEx ex = new TestEx();
//		try {
//			ex.tt(arr, 3);
//		} catch (Exception e) {
//			System.out.println("execption");
//			//这种情况下，over不会输出；
////			return ;
//			//除非退出jvm，那么finally才不会输出
//			System.exit(0);
//		} finally {
//			//不管如何finally都会输出；
//			System.out.println("finally");
//		}
//		System.out.println("over");
		
		try {
			ex.tt(arr, -3);
		}finally {
			System.out.println("finally");
		}
		
	}
}


class TestEx{
	
	public static void tt(int[] arr, int i) throws Exception {
		
		if(i<0) {
			throw new Exception();
		}
		System.out.println(arr[i]);
	}
	
}