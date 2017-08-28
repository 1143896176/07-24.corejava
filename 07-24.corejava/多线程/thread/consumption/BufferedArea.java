package thread.consumption;

import java.util.LinkedList;

//����һ����ģ�⻺����
public class BufferedArea {

	private LinkedList<Object> myList = new LinkedList<Object>();
	private final int MAX = 3;
	private final int MIN = 0;

	
	public void addData(Object obj) {
		try {
			
			synchronized (myList) {
			
				while (this.myList.size() == MAX) {
					
					System.out.println("�������е������Ѿ�װ�����ˡ���");
				
					myList.wait(); //ֹͣ�������
				}

		
				if (this.myList.add(obj)) {
					Thread.sleep(200); // ���붯����Ҫ0.5��
				
					System.out.println("�򻺳��������һ�����ݶ���" + obj);
					
					myList.notifyAll();  //������һ��ȡ�����ݵ��߳̿�ʼ����
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// �ӻ���������ȡ���ݵķ���
	public void getData() {
		try {
			synchronized (myList) {
				// �жϻ������е������Ƿ��Ѿ���ȡ����
				while (this.myList.size() == MIN) {
					// ����̨��ʾ��Ϣ
					System.out.println("�������е������Ѿ���ȡ���ˡ���");
					// ���еȴ�
					myList.wait();
				}

				Thread.sleep(300); // ����������Ҫ2��
				// �ӻ�������ȡ��һ������(���ü��ϵ�remove�������Ӽ�����ȡ��һ������)
				Object obj = myList.removeLast();
				// �ж�
				if (obj != null) {
					// ����̨���һ����Ϣ
					System.out.println("�ӻ�������ȡ��һ������" + obj);
					// ���ѵȴ������е������߳�
					myList.notifyAll();
				}

			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}