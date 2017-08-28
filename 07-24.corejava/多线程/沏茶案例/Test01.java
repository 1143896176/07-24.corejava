package 沏茶案例;

public class Test01 {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread( new Boil() , "烧水的人");
		t1.start();
		
		Thread t2 = new Thread( new Wash() , "洗茶杯的人");
		t2.start();
		
	}


}
