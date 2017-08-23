package 建造模式.工厂方法;

public class Client {

	public static void main(String[] args) {

		Product i8;
		Factory factory = new IphoneFactory();
		
		i8 = factory.factory();
		
		System.out.println(i8);

	}

}
