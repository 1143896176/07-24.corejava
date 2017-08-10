package oop_06.�̳�03_super_this;

public class B extends A {
	
	public int count;
	
	public B() {

	}
	
	
	public B(int x , int y ) {
		super.count = y;
		this.count = x;
	}
	
	

	public B(int age) {
		super(age); // super ֻ�ܷ��ڵ�һ��
		System.out.println("B -> age : " + age);
	}
	
	public B(String name) {
		super(name); // super ֻ�ܷ��ڵ�һ��
		System.out.println("B -> name : " + name);
	}
	
	
	public void sayHi() {
		super.sayHello();
	}
	
}
