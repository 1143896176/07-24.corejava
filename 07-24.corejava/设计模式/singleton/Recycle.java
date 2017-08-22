package singleton;

public class Recycle {
	
	//����ʽ
	private static Recycle recycle = new Recycle();
	
	private Recycle() {
		
	}
	
	public static Recycle getInstance() {
		return recycle;
	}

}
