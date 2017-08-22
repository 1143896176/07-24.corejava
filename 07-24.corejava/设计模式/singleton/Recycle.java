package singleton;

public class Recycle {
	
	//¶öººÊ½
	private static Recycle recycle = new Recycle();
	
	private Recycle() {
		
	}
	
	public static Recycle getInstance() {
		return recycle;
	}

}
