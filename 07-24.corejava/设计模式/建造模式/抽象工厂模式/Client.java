package 建造模式.抽象工厂模式;

public class Client {

	public static void main(String[] args) {
		
		AClass a ;
		MercedesFactory factory = new MercedesFactoryCN();
		a = factory.createAClass();
		
		

	}

}
