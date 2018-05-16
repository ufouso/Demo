package com.test.java.basics;

import java.sql.SQLException;

/**
 * 异常的应用
 * @author xpp
 *
 */
public class Test11_3 {
	
	public static void main(String[] args) {
		Teacher t = new Teacher("老师");
		try {
			t.teach();
		}catch(NoplanException e) {
			System.out.println(e.getMessage());
			System.out.println("速度换人解决");
		}
	}
	
}

class Teacher{
	
	private String name;
	
	private Computer computer;
	
	public Teacher(String name) {
		this.name = name;
		this.computer = new Computer();
	}
	
	public void teach() throws NoplanException{
		try {
			computer.run();
		} catch (LanPinException e) {
			System.out.println(e.getMessage());
			computer.reset();
			teach();
		} catch (MaoYanException e) {
			System.out.println(e.getMessage());
			throw new NoplanException("没发解决，换人");
		}
	}
	
}

class Computer{
	
	int state = 2;
	
	public void run() throws LanPinException,MaoYanException{
		System.out.println("电脑运行");
		if(state ==1) {
			throw new LanPinException("蓝屏"); 
		}
		if(state ==2) {
			throw new MaoYanException("冒烟");
		}
	}
	
	public void reset() {
		state = 0;
		System.out.println("重启电脑");
	}
}

class LanPinException extends Exception{
	public LanPinException(String msg) {
		super(msg);
	}
}
class MaoYanException extends Exception{
	public MaoYanException(String msg) {
		super(msg);
	}
}
class NoplanException extends Exception{
	public NoplanException(String msg){
		super(msg);
	}
}