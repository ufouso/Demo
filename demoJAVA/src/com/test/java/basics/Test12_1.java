package com.test.java.basics;

/**
 * equals重写
 * @author xpp
 *
 */
public class Test12_1 {
	
	public static void main(String args[]) {
		Person p1 = new Person(20);
		Person p2 = new Person(20);
		Test12_1  t = new Test12_1();
		System.out.println(p1.equals(p2));
//		System.out.println(p1.equals(t));
		
		System.out.println(p1);
		System.out.println(p1.hashCode());
		//将hashCode值转换为16进制。
		System.out.println(Integer.toHexString(p1.hashCode()));
		
		
		Class clzz1 = p1.getClass();
		Class clzz2 = p2.getClass();
		//同一个class字节码对象只有一个，但是可以创建出多个对象
		System.out.println(clzz1 == clzz2);//输出结果为true
		System.out.println(clzz1.getName());//com.test.java.basics.Person
		
		//这三个的数值是一样的,没有重写的话
		System.out.println(p1);
		System.out.println(p1.getClass().getName()+"@"+Integer.toHexString(p1.hashCode()));
		System.out.println(p1.toString());
	}
}

class Person{
	
	private int age;
	
	public Person(int age) {
		this.age = age;
	}
	
	//重写了equals方法的同时，有必要重写hashCode方法，相等的对象必须hashCode值也是一样的。
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {
			throw new ClassCastException("类型转换异常");
		}
		Person p = (Person)obj;
		return this.age == p.age;
	}
	//重写了hashCode方法，用age来作为hashCode值
	@Override
	public int hashCode() {
		return this.age;
	}

//	@Override
//	public String toString() {
//		return "person"+age;
//	}
}


