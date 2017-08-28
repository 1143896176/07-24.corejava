package thread.consumption;

//创建一个类模拟生产者对象
class Product implements Runnable {

	private BufferedArea bufferedArea;

	public Product(BufferedArea bufferedArea) {
		this.bufferedArea = bufferedArea;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			// 产生一个新的对象数据
			Object obj = new Object();
			// 向缓冲区添加(存放)数据
			this.bufferedArea.addData(obj);
		}
	}
}
