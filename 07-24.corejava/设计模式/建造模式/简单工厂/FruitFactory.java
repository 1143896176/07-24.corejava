package ����ģʽ.�򵥹���;

public class FruitFactory {
	
	public static Fruit factory(String name) {
		
		if("apple".equals(name)) {
//			System.out.println("����Ư���İ�װ��..  ");
//			
			return new Apple();
		} else if("grape".equals(name)) {
			return new Grape();
		} else {
			return null;
		}

	}

}
