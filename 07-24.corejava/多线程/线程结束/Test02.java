package �߳̽���;

public class Test02 {
	public static void main(String[] args) throws InterruptedException {

		MyThread thread = new MyThread();
		thread.start();

		Thread.sleep(3000); // ���߳�����, �������̱߳�����Ĵ��

		thread.interrupt();
	}
}
