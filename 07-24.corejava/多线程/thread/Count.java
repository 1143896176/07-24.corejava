package thread;

public class Count extends Thread {
	
	public int count = 0;
	
	@Override
	public void run() {  
		for (int i = 0; i < 5; i++) {
			System.out.println(getName() + " , count : " + ++count);
		}
		
		
	}

}
