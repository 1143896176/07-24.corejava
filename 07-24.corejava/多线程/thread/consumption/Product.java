package thread.consumption;

//����һ����ģ�������߶���
class Product implements Runnable {

	private BufferedArea bufferedArea;

	public Product(BufferedArea bufferedArea) {
		this.bufferedArea = bufferedArea;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			// ����һ���µĶ�������
			Object obj = new Object();
			// �򻺳������(���)����
			this.bufferedArea.addData(obj);
		}
	}
}
