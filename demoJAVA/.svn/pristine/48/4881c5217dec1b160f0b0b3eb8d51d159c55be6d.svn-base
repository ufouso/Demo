package com.test.java.reflect;

import java.lang.reflect.Constructor;
/**
 * 测试反射调用构造方法。
 * @author xpp
 *
 */
public class TestFsThree {
	
	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.xpp.testOne.FsThree");
			//构造方法需要的参数
			Class[] cc = new Class[]{String.class, String.class};
			//获取构造方法，并且指定构造方法的类型
			Constructor constructor = c.getConstructor(cc);
			//需要的上送参数
			Object[] x = {"Faker","大魔王"};
			//得到实例
			Object obj = constructor.newInstance(x);
			
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}
}

class FsThree{
	
	public FsThree(String a, String b){
		System.out.println(a+":"+b);
	}
	
}
