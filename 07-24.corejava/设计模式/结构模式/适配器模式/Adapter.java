package 结构模式.适配器模式;

public class Adapter implements Target {
	
	private Adaptee adaptee;
	
	public Adapter( Adaptee adaptee ) {
		this.adaptee = adaptee;
	}

	@Override
	public void powerSupply() {
		adaptee.powerSupply();
	}

	@Override
	public void learn() {
		System.out.println("打开了eclipse ,  愉快的 学起了 Java ...   ");
	}
	
	

}
