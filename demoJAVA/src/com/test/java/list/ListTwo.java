package com.test.java.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 增强for循环的测试，它的底层是使用迭代器的，所以循环的时候不能对数据进行添加和删除
 * 它的内部使用迭代时，会先产生一个单链索引表，如果中途数据的数量出现变化的时候，
 * 这个索引表不会同步修改，这样就会导致它找不到正确的数据。
 * 报出ConCurrentModificationException
 * 当时如果使用的是迭代器自己的Iterator中的remove方法，那么就可以删除。
 * @author xpp
 *
 */
public class ListTwo {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
//		for(String str: list){
//			list.remove(str);
//			System.out.println(str);
//		}
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String a = it.next();
			if("a".equals(a)){
				it.remove();
			}
		}	
		for(String g : list){
			System.out.println(g);
		}
		
		
		System.out.println("======================================");
//		ListIterator<String> i = list.listIterator();
//		while(i.hasNext()){
//			i.add("faker");
//			System.out.println(i.next());
//		}
//		System.out.println("=======================================");
//		
//		while(i.hasPrevious()){
//			System.out.println(i.previous());
//		}
		
		
		
	}
}
