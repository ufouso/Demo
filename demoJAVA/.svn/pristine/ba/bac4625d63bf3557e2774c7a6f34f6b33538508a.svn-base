package com.test.java.sychronized;

public class TestSynchronized {
	
	public static void main(String[] args) {
		
		//1.修饰一个代码块（同步语句块）,互斥，只有其中一个线程走完被锁的部分，其他线程才会走。
//		ThreadOne one = new ThreadOne();
//		Thread t1 = new Thread(one,"faker1");
//		t1.start();
//		Thread t2 = new Thread(one, "faker2");
//		t2.start();
		
		//创建的是两个新的线程，所以没有交集.独立的各走各的.
//		Thread tt1 = new Thread(new ThreadOne(),"TOM1");
//		Thread tt2 = new Thread(new ThreadOne(),"TOM2");
//		tt1.start();
//		tt2.start();
		
		
		//2.多个线程访问synchronized,非synchronized方法依旧可以访问，synchronized代码还是同步的。
//		ThreadOne one = new ThreadOne();
//		Thread t = new Thread(one,"jack");
//		Thread t1 = new Thread(one, "faker");
//		t.start();
//		t1.start();
		
		
//		3.指定给某个对象加锁
		
		ThreadTwo  two = new ThreadTwo();
		for(int i=0;i<10;i++){
			Thread t = new Thread(two,"xpp"+i);
			t.start();
		}
		
//		4.给方法加锁
//		1. synchronized关键字不能继承。 
//		虽然可以使用synchronized来定义方法，但synchronized并不属于方法定义的一部分，因此，synchronized关键字不能被继承。如果在父类中的某个方法使用了synchronized关键字，而在子类中覆盖了这个方法，在子类中的这个方法默认情况下并不是同步的，而必须显式地在子类的这个方法中加上synchronized关键字才可以。当然，还可以在子类方法中调用父类中相应的方法，这样虽然子类中的方法不是同步的，但子类调用了父类的同步方法，因此，子类的方法也就相当于同步了。这两种方式的例子代码如下： 
//		在子类方法中加上synchronized关键字
//
//		class Parent {
//		   public synchronized void method() { }
//		}
//		class Child extends Parent {
//		   public synchronized void method() { }
//		}
//		在子类方法中调用父类的同步方法
//
//		class Parent {
//		   public synchronized void method() {   }
//		}
//		class Child extends Parent {
//		   public void method() { super.method();   }
//		在定义接口方法时不能使用synchronized关键字。
//		构造方法不能使用synchronized关键字，但可以使用synchronized代码块来进行同步。 
		
//		5.给静态类和静态方法加锁
//		A. 无论synchronized关键字加在方法上还是对象上，如果它作用的对象是非静态的，则它取得的锁是对象；如果synchronized作用的对象是一个静态方法或一个类，则它取得的锁是对类，该类所有的对象同一把锁。 
//		B. 每个对象只有一个锁（lock）与之相关联，谁拿到这个锁谁就可以运行它所控制的那段代码。 
//		C. 实现同步是要很大的系统开销作为代价的，甚至可能造成死锁，所以尽量避免无谓的同步控制。
		
		
//		Thread t = new Thread(){
//			public void run(){
//				synchronized (this) {
//					for(int i=0;i<10;i++){
//						System.out.println(Thread.currentThread().getName()+":"+i);
//					}
//				}
//			}
//		};
//		t.start();
	}
}

//修饰一个代码块
class ThreadOne implements Runnable{
	private static int COUNT = 1;

	public void run1(){
		synchronized(this){
			for(int i=0;i<5;i++){
				System.out.println(Thread.currentThread().getName()+"::::"+ COUNT++);
			}
		}
	}
	
	//代码中的非synchronized部分
	public void run2(){
		System.out.println("非锁代码部分。");
	}
	
	public void run(){
		String name = Thread.currentThread().getName();
		if("faker".equals(name)){
			run1();
		}else if("jack".equals(name)){
			run2();
		}
	}
}


class ThreadTwo implements Runnable{
	
	Money money = new Money(100,100);
	@Override
	public void run() {
		
		synchronized(money){
			money.addMoney(100);
			money.removeMoney(10);
			System.out.println(money.getAmount());
		}
	}
	
}

class Money{
	
	float getAmount(){
		return amount; 
	}
	
	public Money(float amount, float limit){
		this.amount = amount;
		this.limit = limit;
	}
	
	private float amount;
	
	private float limit;
	
    public static int money=0;
	
	public void addMoney(int amount){
		money+=amount;
	}
	
	public void removeMoney(int amount){
		money-=amount;
	}
}


