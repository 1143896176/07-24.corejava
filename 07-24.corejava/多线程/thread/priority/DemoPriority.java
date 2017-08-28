package thread.priority;



public class DemoPriority {

	public static void main(String[] args) {

		// �����������̶߳���,����Ϊ���߳������
		Thread t1 = new Thread(new MyThread(), "t1");
		Thread t2 = new Thread(new MyThread(), "t2");
		// ��ȡ����ǰ���̣߳������ñ���
		Thread tm = Thread.currentThread();
		tm.setName("main");

		// �������̵߳����ȼ���
		t1.setPriority(Thread.MAX_PRIORITY); // priority: 10
		t2.setPriority(Thread.MIN_PRIORITY); // priority: 1

		// ��ʾ�߳����Ƽ������ȼ�
		System.out.println("[" + t1.getName() + "," + t1.getPriority() + "]");
		System.out.println("[" + t2.getName() + "," + t2.getPriority() + "]");
		System.out.println("[" + tm.getName() + "," + tm.getPriority() + "]");

		// �������߳�
		t1.start();
		t2.start();

		// ���߳�
		String strName = tm.getName();
		for (int i = 1; i <= 20; i++) {
			System.out.println(strName + ":" + i);
		}

	}

}
