package thread.priority;

class MyThread implements Runnable {
	@Override
	public void run() {

		String tName = Thread.currentThread().getName();

		for (int i = 1; i <= 20; i++) {
			System.out.println(tName + ":" + i);
		}
	}

}