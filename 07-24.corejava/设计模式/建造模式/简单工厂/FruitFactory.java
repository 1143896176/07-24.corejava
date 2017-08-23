package 建造模式.简单工厂;

public class FruitFactory {
	
	public static Fruit factory(String name) {
		
		if("apple".equals(name)) {
//			System.out.println("放在漂亮的包装里..  ");
//			
			return new Apple();
		} else if("grape".equals(name)) {
			return new Grape();
		} else {
			return null;
		}

	}

}
