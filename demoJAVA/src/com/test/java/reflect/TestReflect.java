package com.test.java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射用处最多的是在框架中
 * 和数据库连接中，比如jdbc中的获取数据库连接
 * @author xpp
 *
 */
public class TestReflect {
	public static void main(String[] args) {
		try {
			//1.创建反射的3中方式
			Class<?> c1 = Class.forName("com.test.java.reflect.Person");
			Class<?> c2 = Person.class;
			Class<?> c3 = new Person().getClass();
			//2.调用
			System.out.println(c1.getName());
			System.out.println(c2.getName());
			System.out.println(c3.getName());
			Method[] method1 = c1.getDeclaredMethods();
			for(int i=0;i<method1.length;i++) {
				System.out.println(method1[i].getName());
			}
			Field[] f = c2.getDeclaredFields();
			for(int i=0;i<f.length;i++) {
				System.out.println(f[i].getName());
			}
			
			Method m = c1.getMethod("dodo", new Class[] {String.class, String.class});
			m.invoke(new Person(), new Object[] {"a","b"});
			
			Constructor<?> constructor = c3.getConstructor( new Class[] {String.class, String.class});
			constructor.newInstance(new Object[] {"c","d"});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Person{
	private String name;
	private String age;
	private String sex;
	
	public Person() {}
	public Person(String name, String age) {
		this.name = name;
		this.age = age;
		System.out.println(name+"::--::"+age);
	}
	
	public void dodo(String name, String age) {
		System.out.println(name+"==="+age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
