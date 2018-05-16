package com.test.java.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 测试反射
 * @author xpp
 *
 */
public class TestFsOne{
	
	public static void main(String[] args) {
		try {
			//NO.1
			//通过名称来获取你想要操作的类Class
			Class c = Class.forName("com.xpp.testOne.TestFs");
			TestFs fs = new TestFs();
			Method method = c.getMethod("run", new Class[]{String.class});
			//输入上送参数并且执行方法。
			method.invoke(fs, new Object[]{"faker"});
			
			
			//NO.2
			//通过类包的全路径来获取class
			Class c2 = Class.forName("com.xpp.testOne.TestFs");
			//利用class的自审，来返回方法对象的集合
			Method[] ms = c2.getDeclaredMethods();
			for(Method me : ms){
				System.out.println("对象类的方法名称："+ me.getName());
			}
			//利用class的自审，获取静态属性对象集合，成员变量不能获取。
			Field[] fss = c2.getDeclaredFields();
			for(Field f : fss){
				System.out.println("对应类的属性名称："+f.getName());
			}
			
			//NO.3
			Class c3 = Class.forName("com.xpp.testOne.TestFs");
			//这种方式相当于new TestFs()
			TestFs tfs = (TestFs) c3.newInstance();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class TestFs{
	
	private String name;
	
	private String age;
	
	private String male;
	
	public void run(String a){
		
		String b="sss";
		
		System.out.println(a+":反射");
	}
	
}
