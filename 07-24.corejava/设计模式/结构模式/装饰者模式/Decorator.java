package �ṹģʽ.װ����ģʽ;

public class Decorator {
	
	private Swift swift;
	
	public Decorator(Swift swift) {
		this.swift = swift;
	}
	
	public void fly() {
		swift.fly();
	}

}
