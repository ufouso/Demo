package com.test.java.list;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * list去除重复的数据
 * @author xpp
 *
 */
public class ListOne {
	
	public static List<?> removeRepeat(List<?> list){
		//hashSet不进行排序，treeSet进行排序
//		Set set = new LinkedHashSet<>();
//		set.addAll(list);
//		list.clear();
//		list.addAll(set);
		List listOne = new ArrayList<>(new TreeSet<>(list));
		return listOne;
	}
	

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("b");
		list.add("1");
		list.add("2");
		list.add("3");
		List<String> listNew = (List<String>) removeRepeat(list);
		for(String str : listNew){
			System.out.println(str);
		}
	}
	
	
}
