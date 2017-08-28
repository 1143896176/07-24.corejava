package thread;

public class Test02 {
	
	public static void main(String[] args) {
		
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		
		Thread t1 = new Thread(c1 , "t1");
		Thread t2 = new Thread(c2 , "t2");
		Thread t3 = new Thread(c3 , "t3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
