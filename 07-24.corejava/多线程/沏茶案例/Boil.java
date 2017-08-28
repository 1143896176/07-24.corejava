package 沏茶案例;

public class Boil implements Runnable {

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + "开始烧水");

		try {
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("水开了");

	}

}
