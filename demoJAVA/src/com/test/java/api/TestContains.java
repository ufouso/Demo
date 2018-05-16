package com.test.java.api;

import java.util.ArrayList;
import java.util.List;
/**
 * 测试contains，经过查看源码，
 * 发现其实底层还是使用了循环调用contains
 * @author xpp
 *
 */
public class TestContains {
	
	public static void main(String[] args) {
		List<String> listAll = new ArrayList<String>();
		listAll.add("T111");
		listAll.add("T222");
		listAll.add("T333");
		listAll.add("T444");
		listAll.add("T555");
		listAll.add("T666");
		List<String> listSome = new ArrayList<String>();
		listSome.add("T666");
		listSome.add("T111");
		listSome.add("T333");
		System.out.print(checkWhetherContain(listAll, listSome));
	}
	
	public static boolean checkWhetherContain(List<String> listAll, List<String> listSome) {
		return listAll.containsAll(listSome); 
	}
}
