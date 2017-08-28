package 线程合并;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread thread = new MyThread();
		thread.start();
		thread.join(3000);
		
		
		
		// 将主线程加入到子线程后面，不过如果子线程在3000毫秒时间内没执行完，
		// 则主线程便不再等待它执行完，进入就绪状态，等待cpu调度 , 开始工作
		for (int i = 1; i <= 30; i++) {
			Thread.sleep(200);
			System.out.println(Thread.currentThread().getName() + "线程第" + i + "次执行！");
		}
	}

}
