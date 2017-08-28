package 沏茶案例;

public class Wash extends Thread {
	
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("开始洗第" + i + "　个茶杯");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			System.out.println("第" + i + "　个茶杯 洗完了");
		}
	}

}
