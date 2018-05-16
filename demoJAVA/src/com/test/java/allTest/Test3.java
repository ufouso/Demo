package com.test.java.allTest;

/**
 * 定义函数的格式：
 * 修饰符     返回值类型    函数名（参数类型   形参，...）{
 * 		执行语句;
 * 		return 返回值;
 * }
 * @author xpp
 *
 */
public class Test3 {
	
	public static void main(String[] args) {
//		for(int x=0;x<3;x++) {
//			System.out.println("1111");
//		}
		
//		a1:for(int a=0;a<3;a++) {
//			
//			a2:for(int b=0;b<3;b++) {
//				System.out.println(a);
//				//跳出指定循环a1
//				break a1;
//			}
//		}

		String A = "abcdefg";
		String B = "ab";
		String C = "h";
		System.out.println(A.indexOf(B));
		System.out.println(A.indexOf(C));
		draw();
		doTest();
		
		int[] i = new int[3];
		System.out.print(i);
	}
	
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static void dodo() {
		System.out.println("11");
		return;
	}
	
	/**
	 * 画一个矩形
	 */
	public static void draw() {
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=4;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/**
	 * 比较两个数是否相等
	 * @param a
	 * @param b
	 * @return
	 */
	public boolean isEquals(int a, int b) {
//		if(a == b) {
//			return true;
//		}else {
//			return false;
//		}
		return a == b;
	}
	
	/**
	 * 比较两个整数，获取较大的那个整数
	 * @return
	 */
	public int compare(int a, int b) {
		return a>b?a:b;
	}
	
	/**
	 * 99乘法表
	 */
	public static void doTest() {
		for(int a=1;a<=9;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print(b+"*"+a+"="+a*b+"\t");
			}
			System.out.println();
		}
	}
	
	public static char doTest1() {
		return 'a';
	}
	
	public void doTest2() {
//		{//局部代码块
//			int age = 3;
//		}
		//此处是不能够访问到局部代码块中的age的
		//因为age的作用域只是在局部代码块中，
		//出了局部代码块，那么age这个局部变量就会被栈内存释放。
//		System.out.println(age);
	}
	
	/**
	 * 创建数组的三种方式。
	 */
	public void doTest3() {
		int[] a = new int[3];
		a[0]=1;
		int[] b = new int[] {2,3,4};
		int[] c = {2,3,3,4};
		
	}
}
