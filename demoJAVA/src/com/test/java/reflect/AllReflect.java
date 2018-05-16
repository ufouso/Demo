package com.test.java.reflect;

import java.lang.reflect.Method;

/**
 * 测试各种反射的 重点
 * 反射机制： 程序在编译期不知道具体的哪个类被加载了，在运行期才进行加载，这就是反射。
 * 反射：为什么会慢？，因为 编译器没法对反射的代码做优化，同时编译期的东西放到了运行期来执行。JIT
 * @author xpp
 *
 */
public class AllReflect {

	public static void main(String[] args) {
		//实现反射的三种方式：
		try {
			//方法NO.1
//			Class<?> clz = Class.forName("com.test.java.reflect.TestOne");
//			//获取类的名称，就是forName里面的值。
//			System.out.println(clz.getName());
//			Method[] m = clz.getDeclaredMethods();
//			//获取类中的所有方法的名称
//			for(int i=0 ;i <m.length; i++) {
//				System.out.println(	m[i].getName());
//			}
//			
//			//获取静态的属性，类中方法中的成员变量是无法获取到的，
//			//无法获取的原因是：Class.forName("")这种方法是类加载器加载，将静态内容加载到内存中，而这个时候对象还没有产生，
//			//所有就导致了静态方法不能访问非静态方法和非静态属性。静态方法和静态属性早于非静态方法和非静态属性。
//			Field[] f = clz.getDeclaredFields();
//			for(int i=0; i<f.length;i++) {
//				System.out.println(f[i].getName());
//			}
			
			//方法NO.2
//			TestOne one = new TestOne();
//			Class<?> clz2 = one.getClass();
//			//这个创建实例和new TestOne()一样的。
//			TestOne one2 = (TestOne)clz2.newInstance();
//			//创建构造方法，并且运行构造方法。
//			Class[] c = new Class[] {String.class, Integer.class};
//			Constructor<?> constructor = clz2.getConstructor(c);
//			Object[] x = {"大魔王", 1};
//			//实例化
//			Object obj = constructor.newInstance(x);
			
			//方法NO.3
			TestOne one = new TestOne();
			Class<?> clz3 = TestOne.class;
			Method m = clz3.getMethod("doTest", new Class[]{});
			m.invoke(one);
			one.doTest();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class TestOne{
	
	private String name;
	
	private String age;
	
	public TestOne() {
	}
	public TestOne(String a, Integer b) {
		System.out.println(a+b);
	}
	
	public void doTest() {
		String a = "f";
		System.out.println(a);
	}
	public void doTest2() {
		System.out.println("2");
	}
}