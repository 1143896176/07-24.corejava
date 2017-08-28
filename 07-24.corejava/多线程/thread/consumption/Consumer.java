package thread.consumption;

//创建一个类模拟消费者对象
class Consumer implements Runnable {

	private BufferedArea bufferedArea;

	public Consumer(BufferedArea bufferedArea) {
		this.bufferedArea = bufferedArea;
	}

	@Override
	public void run() {
	
		while (true) {
			// 从缓冲区中获取到已经存放的数据
			this.bufferedArea.getData();
		}
	}

}
