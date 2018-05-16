package com.test.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * (使用的JDK动态代理)
 * 调用处理器，当代理对象调用代理方法的时候，会执行invoke方法。
 * @author xpp
 *
 */
public class ProxyTestOneHandler implements InvocationHandler{
	
	private Object target;
	
	public ProxyTestOneHandler(Object target){
		this.target = target;
	}
	
	/**
	 * @param proxy 代理对象的引用
	 * @param method 目标对象的目标方法
	 * @param args   目标对象的目标方法需要的参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("1111");
		//执行目标方法
		Object ob = method.invoke(target, args);
		System.out.println("2222");
		return ob;
	}
	
	
}
