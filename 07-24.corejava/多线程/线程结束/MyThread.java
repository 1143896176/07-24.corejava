package 线程结束;

class MyThread extends Thread {
	
	int i = 0;

	@Override
	public void run() {
		
		while (true) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("中断异常被捕获了");
				return;
			}
			i++;
		}
	}
}