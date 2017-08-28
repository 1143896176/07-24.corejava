package thread;

public class Test01 {
	
	public static void main(String[] args) {
		
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		
		c1.start();
		c2.start();
		c3.start();
		
	}

}
