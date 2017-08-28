package com.sychronized.ticket;


//����һ�����߳�����ɺ���Ʊ������
class SellThread1 implements Runnable{
	//����һ����ĳ�Ա������ģ�⹲��ĳ�Ʊ
	int tickets = 100;	
	
	@Override
	public void run() {
	
		//��Ʊ����
		while(true){			
			sell();			
		}		
	}	
	//��Ʊ�ķ���
	private synchronized void sell(){ //����
		if(tickets>0){
			try {
//				Thread.sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":sell tickets:"+tickets);
			tickets--; //����ƱԴ����
		} else {
			return;
		}
	}
}

public class Demo02 {

	public static void main(String[] args) {
	
		//����һ����Ʊ��ʵ������
		SellThread1 st = new SellThread1();
		
		Thread t1 = new Thread(st);
		t1.setName("��Ʊ��1");
		Thread t2 = new Thread(st);
		t2.setName("��Ʊ��2");
		Thread t3 = new Thread(st);
		t3.setName("��Ʊ��3");
		Thread t4 = new Thread(st);
		t4.setName("��Ʊ��4");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
