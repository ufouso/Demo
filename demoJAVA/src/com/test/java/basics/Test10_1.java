package com.test.java.basics;

/**
 * 多态的好处：提高了代码的扩展性，
 * 前期定义的代码可以使用后期的内容
 * @author xpp
 *
 */
public class Test10_1 {
	
	public static void main(String[] args) {
		Cat c = new Cat();
		Animal a = new Cat();
		Animal b = new Dog();
		show(a);
		show(b);
	}
	//此处定义的就是多态的体现
	public static void show(Animal a) {
		a.eat();
	}
}
abstract class Animal{
	
	public abstract void eat();
}
class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("吃鱼");
	}
	
}
class Dog extends Animal{

	@Override
	public void eat() {
		System.out.println("吃骨头");
	}
	
}