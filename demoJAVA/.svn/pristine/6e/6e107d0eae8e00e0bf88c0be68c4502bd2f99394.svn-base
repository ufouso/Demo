package com.test.java.reflect;

/**
 * 测试反射的加载顺序。
 * 输出结果中只要一个静态代码块，而构造方法确有两个说明，
 * Class.forName这种方法会将静态方法，静态属性和静态代码块加载到内存中。
 * @author xpp
 *
 */
public class TestFsTwo {
	
	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.xpp.testOne.FsTwo");
			//此方法相当于new FsTwo();
			FsTwo ft = (FsTwo)c.newInstance();
			
			FsTwo ft1 = new FsTwo();
			System.out.println(ft.getClass() == ft1.getClass());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class FsTwo{
	static{
		System.out.println("静态代码块");
	}
	
	public FsTwo(){
		System.out.println("构造方法");
	}
}