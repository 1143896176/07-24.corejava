package ��谸��;

public class Test01 {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread( new Boil() , "��ˮ����");
		t1.start();
		
		Thread t2 = new Thread( new Wash() , "ϴ�豭����");
		t2.start();
		
	}


}
