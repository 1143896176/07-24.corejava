package thread.consumption;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		BufferedArea bufferedArea  = new BufferedArea();
		//����һ�������ߵ����߳�
		new Thread(new Product(bufferedArea)).start();
		//����һ�������ߵ����߳�
		new Thread(new Consumer(bufferedArea)).start();
		
	}

}
