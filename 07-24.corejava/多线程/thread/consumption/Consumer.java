package thread.consumption;

//����һ����ģ�������߶���
class Consumer implements Runnable {

	private BufferedArea bufferedArea;

	public Consumer(BufferedArea bufferedArea) {
		this.bufferedArea = bufferedArea;
	}

	@Override
	public void run() {
	
		while (true) {
			// �ӻ������л�ȡ���Ѿ���ŵ�����
			this.bufferedArea.getData();
		}
	}

}
