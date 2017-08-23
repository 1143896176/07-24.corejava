package 结构模式.装饰者模式;

public class Client {
	
	public static void main(String[] args) {
		
		Swift mk = new MonkeyKing();
		mk.fly();
		
		Fish fish = new Fish(mk);
		fish.fly();
		
	}

}
