package 线程合并;

class MyThread extends Thread { 

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
			System.out.println(this.getName() + "线程第" + i + "次执行！");
		}
	}

}