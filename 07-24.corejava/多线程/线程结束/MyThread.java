package �߳̽���;

class MyThread extends Thread {
	
	int i = 0;

	@Override
	public void run() {
		
		while (true) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("�ж��쳣��������");
				return;
			}
			i++;
		}
	}
}