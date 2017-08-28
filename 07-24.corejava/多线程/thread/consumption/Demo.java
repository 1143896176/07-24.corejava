package thread.consumption;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		BufferedArea bufferedArea  = new BufferedArea();
		//创建一个生产者的子线程
		new Thread(new Product(bufferedArea)).start();
		//创建一个消费者的子线程
		new Thread(new Consumer(bufferedArea)).start();
		
	}

}
