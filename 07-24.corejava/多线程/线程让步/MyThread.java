package �߳��ò�;

/*
 * yield()������sleep()�����е����ƣ���Ҳ��Thread���ṩ��һ����̬�ķ�������Ҳ�����õ�ǰ����ִ�е��߳���ͣ���ó�cpu��Դ���������̡߳�
 * ���Ǻ�sleep()������ͬ���ǣ���������뵽����״̬�����ǽ��뵽����״̬��yield()����ֻ���õ�ǰ�߳���ͣһ�£����½���������̳߳���
 * */


public class MyThread extends Thread {
	
	public MyThread(String name, int pro) { 
		super(name);// �����̵߳�����
		this.setPriority(pro);// �������ȼ�
	}

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println( this.getName() + " �̵߳�" + i + "��ִ�У�");
			if ( i % 5 == 0)   {
				
				Thread.yield(); //�ò�
				System.out.println(this.getName() + " �ò� .");
				try {
//					Thread.sleep(300);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
				
		}
	}

}
