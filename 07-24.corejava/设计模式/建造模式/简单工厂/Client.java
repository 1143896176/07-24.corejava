package 建造模式.简单工厂;

public class Client {

	public static void main(String[] args) {
	
		Fruit f1 = FruitFactory.factory("apple");

		Fruit f2 = FruitFactory.factory("grape");
		
		
	}

}
