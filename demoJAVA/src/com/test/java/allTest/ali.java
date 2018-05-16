package com.test.java.allTest;

public class ali
{
	public static int k=0;
											
	public static ali t1=new ali("t1");  
	public static ali t2=new ali("t2");
	
	public static int i=print("i"); 
	public static int n=99;

	public int j=print("j");
	
	{
		print("¹¹Ôì¿é");
	}
	static{print("¾²Ì¬¿é");}
	
	
	public ali(String str){
		System.out.println((++k)+":"+str+"   i="+i+"   n="+n);    //1£ºinit   i=(2:i i=i n=99)  
		++i;
		++n;
	}
	private static int print(String str) {
		System.out.println((++k)+":"+str+"   i="+i+"   n="+n);
		++n;
		return ++i;
	}
	
	public static void main(String[] args) {
		ali t=new ali("init");
		//¾²Ì¬¿é£¬
		//¹¹Ôì¿é¡£
	}
}
