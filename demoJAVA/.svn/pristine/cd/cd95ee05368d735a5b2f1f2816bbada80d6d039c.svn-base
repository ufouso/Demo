package com.test.java.proxy;

/**
 * 测试CGLIB动态代理
 * @author xpp
 *
 */
public class Test2 {
	
	public static void main(String[] args) {
		//生成代理调用处理器
		CGLIBTestOneInterceptor interceptor = new CGLIBTestOneInterceptor(new TestTwo());
		//生成代理类
		TestTwo testOne = (TestTwo)interceptor.createProxy();
		testOne.addSome();
	}
}
