package com.test.java.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * ? extends E:接收E类型或者E的子类型。
 * ? super E:接收E类型或者E的父类型
 * @author xpp
 *
 */
public class TestGenerics {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		System.out.println("a");
		//需要强转
		GenericsA a = new GenericsA();
		Animal animal = (Animal)a.dotest(Animal.class);
		//不用强转
		GenericsB b = new GenericsB();
		Animal animal1 = b.dotest(Animal.class);
		
		GenericsC<String> c = new GenericsC<String>();
		List<String> list = new ArrayList<String>();
		c.doTest(list);
		
		GenericsDImpl<String,Integer> d = new GenericsDImpl<String, Integer>("F",1);
		System.out.println(d.getK());
		System.out.println(d.dMap());
		System.out.println(d.dmap());
	}
}


class GenericsA{
	//使用泛型？，可以是任何对象类型，表示不确定的java类型
	public Object dotest(Class<?> cla) throws InstantiationException, IllegalAccessException{
		return cla.newInstance();
	}
}

class GenericsB{
	//使用泛型T，表示具体的一个java类型。
	public <T> T dotest(Class<T> t) throws InstantiationException, IllegalAccessException {
		return t.newInstance();
	}
}
//类来定义类型
class GenericsC<T>{
	public List<T> doTest(List<T> list) {
		return list;
	}
}
//这种会报错，语法错误，不能使用？
//class Generics<?>{
//	
//}
//通过类来定义类型
interface GenericsD<K, V>{
	public K dMap();
	public V dmap();
}

class GenericsDImpl<K, V> implements GenericsD<K, V>{
	
	private K k;
	
	private V v;
	
	public GenericsDImpl(K key, V value) {
		this.k = key;
		this.v = value;
	}
	
	@Override
	public K dMap() {
		return getK();
	}

	@Override
	public V dmap() {
		return getV();
	}

	public K getK() {
		return k;
	}

	public V getV() {
		return v;
	}
}


