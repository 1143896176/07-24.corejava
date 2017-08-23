package 结构模式.装饰者模式;

public class Decorator {
	
	private Swift swift;
	
	public Decorator(Swift swift) {
		this.swift = swift;
	}
	
	public void fly() {
		swift.fly();
	}

}
