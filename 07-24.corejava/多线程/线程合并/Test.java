package �̺߳ϲ�;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread thread = new MyThread();
		thread.start();
		thread.join(3000);
		
		
		
		// �����̼߳��뵽���̺߳��棬����������߳���3000����ʱ����ûִ���꣬
		// �����̱߳㲻�ٵȴ���ִ���꣬�������״̬���ȴ�cpu���� , ��ʼ����
		for (int i = 1; i <= 30; i++) {
			Thread.sleep(200);
			System.out.println(Thread.currentThread().getName() + "�̵߳�" + i + "��ִ�У�");
		}
	}

}
