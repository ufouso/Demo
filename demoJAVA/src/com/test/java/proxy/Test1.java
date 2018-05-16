package com.test.java.proxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理的测试类
 * @author xpp
 *
 */
public class Test1 {

	public static void main(String[] args) {
		//创建目标对象
		TestOne one = new TestOneImpl();
		
		//代理对象的创建
		//ClassLoader 类装载器，用来装载内存中的临时字节码
		//interfaces 代理类和目标类的装载器必须是一致的
		//InvocationHandler 代理对象，调用代理方法时，invoke方法会自动执行
		TestOne one1 = (TestOne)Proxy.newProxyInstance(one.getClass().getClassLoader(), 
													new Class[]{TestOne.class}, 
													new ProxyTestOneHandler(one));
		one1.addSome();
		one1.delSome();
	}
}
