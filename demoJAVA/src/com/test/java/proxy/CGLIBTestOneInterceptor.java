package com.test.java.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 使用cglib动态代理
 * @author xpp
 *
 */
public class CGLIBTestOneInterceptor implements MethodInterceptor{
	
	private Object target;
	
	public CGLIBTestOneInterceptor(Object target){
		this.target = target;
	}
	
	/**
	 * 创建代理对象
	 * @return
	 */
	public Object createProxy(){
		//代码增强
		//该类用于生成代理对象
		Enhancer enhancer = new Enhancer();
		//参数为拦截器
		enhancer.setCallback(this);
		//设置父类，代理生成类是目标类的子类
		enhancer.setSuperclass(target.getClass());
		//创建代理对象
		return enhancer.create();
	}
	
	
	@Override
	public Object intercept(Object obj, Method method, Object[] arg2, MethodProxy methodProxy) throws Throwable {
		System.out.println("1111");
		
		methodProxy.invokeSuper(obj, arg2);
		
		System.out.println("2222");
		
		return null;
	}
	
	
}
