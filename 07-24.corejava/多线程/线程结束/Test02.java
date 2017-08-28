package 线程结束;

public class Test02 {
	public static void main(String[] args) throws InterruptedException {

		MyThread thread = new MyThread();
		thread.start();

		Thread.sleep(3000); // 主线程阻塞, 所以子线程被以外的打断

		thread.interrupt();
	}
}
