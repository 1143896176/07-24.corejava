package oop_10.静态相关;

public class A {
	
	{
		System.out.println("类A  : 我是代码块  ");
	}
	
	static {
		System.out.println("类A  : 我是 static 静态块 . ");
	}
	
	A() {
		System.out.println("类A  : 我是 构造函数 A() ");
	}

}
