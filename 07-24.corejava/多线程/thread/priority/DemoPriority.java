package thread.priority;



public class DemoPriority {

	public static void main(String[] args) {

		// 创建两个子线程对象,并且为子线程起别名
		Thread t1 = new Thread(new MyThread(), "t1");
		Thread t2 = new Thread(new MyThread(), "t2");
		// 获取到当前主线程，并设置别名
		Thread tm = Thread.currentThread();
		tm.setName("main");

		// 设置子线程的优先级别
		t1.setPriority(Thread.MAX_PRIORITY); // priority: 10
		t2.setPriority(Thread.MIN_PRIORITY); // priority: 1

		// 显示线程名称及其优先级
		System.out.println("[" + t1.getName() + "," + t1.getPriority() + "]");
		System.out.println("[" + t2.getName() + "," + t2.getPriority() + "]");
		System.out.println("[" + tm.getName() + "," + tm.getPriority() + "]");

		// 启动子线程
		t1.start();
		t2.start();

		// 主线程
		String strName = tm.getName();
		for (int i = 1; i <= 20; i++) {
			System.out.println(strName + ":" + i);
		}

	}

}
