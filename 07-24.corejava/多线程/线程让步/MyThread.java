package 线程让步;

/*
 * yield()方法和sleep()方法有点相似，它也是Thread类提供的一个静态的方法，它也可以让当前正在执行的线程暂停，让出cpu资源给其他的线程。
 * 但是和sleep()方法不同的是，它不会进入到阻塞状态，而是进入到就绪状态。yield()方法只是让当前线程暂停一下，重新进入就绪的线程池中
 * */


public class MyThread extends Thread {
	
	public MyThread(String name, int pro) { 
		super(name);// 设置线程的名称
		this.setPriority(pro);// 设置优先级
	}

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println( this.getName() + " 线程第" + i + "次执行！");
			if ( i % 5 == 0)   {
				
				Thread.yield(); //让步
				System.out.println(this.getName() + " 让步 .");
				try {
//					Thread.sleep(300);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
				
		}
	}

}
