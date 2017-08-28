package Æã²è°¸Àý;

public class Test01 {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread( new Boil());
		t1.start();
		
		Thread t2 = new Thread( new Wash());
		t2.start();
		
	}

}
