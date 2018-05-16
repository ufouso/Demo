package com.test.java.allTest;

public class Test2 {
	
	public static void main(String[] args) {
//		for(int a=1;a<=5;a++) {
//			for(int b=a;b<=5;b++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println("--------------------");
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println("----------------------");
//		for(int x=1;x<=5;x++) {
//			for(int y=5;y>=x;y--) {
//				System.out.print(y);
//			}
//			System.out.println();
//		}
//		System.out.println("----------------------");
////		5-4
////		5-3
////		5-2
////		5-1
////		5-0
//		for(int c = 5;c>=1;c--) {
//			for(int d=5;d>=c;d--) {
//				System.out.print(d);
//			}
//			System.out.println();
//		}
//		System.out.println("----------------------");
//		
//		for(int e=1;e<=5;e++) {
//			for(int f=1;f<=e;f++) {
//				System.out.print(f);
//			}
//			System.out.println();
//		}
//		
//		System.out.println("----------------------");
//		for(int A=1;A<=9;A++) {
//			for(int B=1;B<=A;B++) {
//				System.out.print(B+"*"+A+"="+A*B+"	");
//			}
//			System.out.println();
//		}
//		System.out.println("---------------------");
//		System.out.println("666\t666");
		
//		* * * * * * * * * * 
//		 * * * *   * * * * 
//		  * * *     * * * 
//		   * *       * * 
//		    *         * 
		for(int a=1;a<=5;a++) {
			for(int b=1;b<a;b++) {
				System.out.print(" ");
			}
			for(int c=a;c<=5;c++) {
				System.out.print("*"+" ");
			}
			for(int d=1;d<a;d++) {
				System.out.print(" ");
			}
			for(int d=1;d<a;d++) {
				System.out.print(" ");
			}
			for(int e = a; e<=5;e++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		for(int x=1;x<=9;x++) {
			for(int y=x;y<=9;y++) {
				System.out.print("\t");
			}
			for(int y=x;y>0;y--) {
				System.out.print(x+"*"+y+"\t");//"="+x*y+
			}
			for(int y=1;y<=x;y++) {
				System.out.print(y+"*"+x+"\t");//"="+x*y+
			}
			System.out.println("");
		}
		System.out.println("---");
		for(int x=1;x<=9;x++) {
			for(int y=1;y<=x;y++) {
				System.out.print("-");
			}
			for(int y=9;y>0;y--) {
				System.out.println();
			}
			System.out.println();
		}
		
		
		
		
	}
}	
