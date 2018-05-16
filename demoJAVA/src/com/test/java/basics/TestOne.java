package com.test.java.basics;

public class TestOne {
	
	public static void main(String[] args) {
		
		String a = new String("大魔王");
		String b = new String("大魔王");
		System.out.println(a.equals(b));
		System.out.println(a == b);
		
//		Student s = new Student("20");
//		Student s1 = new Student("20");
//		System.out.println(s == s1);
//		System.out.println(s.equals(s1));
//		
//		Test7_1 p = new Student("20");
////		Student ss = (Student) new Test7_1();
//		s.getAge();
	}
}

//class Student extends Test7_1{
//	
//	private String age;
//	
//	public Student(String age) {
//		this.age = age;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Student) {
//			return ((Student)obj).age.equals(age);
//		}
//		return false;
//	}
//
//	public String getAge() {
//		return age;
//	}
//
//	public void setAge(String age) {
//		this.age = age;
//	}
//	
//}
//
//
//class Person{
//	
//}
