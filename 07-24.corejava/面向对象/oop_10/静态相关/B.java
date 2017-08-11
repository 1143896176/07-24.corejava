package oop_10.静态相关;

public class B extends A{
	
	{
		System.out.println("类B  : 我是代码块  ");
	}
	
	static {
		System.out.println("类B  : 我是 static 静态块 . ");
	}
	
	B() {
		System.out.println("类B  : 我是 构造函数 B() ");
	}

}
