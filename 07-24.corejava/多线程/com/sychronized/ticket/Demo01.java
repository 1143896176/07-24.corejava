package com.sychronized.ticket;



class SellThread implements Runnable{
	
	int tickets = 100;	
	
	@Override
	public void run() {
	
		while(true){		
			synchronized (this) {
				if(tickets>0){
					try {
//						Thread.sleep(10);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+":sell tickets:"+tickets);
					tickets--; //����ƱԴ����
				}else{
					break;
				}
			}
		}
	}	
}

public class Demo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//����һ����Ʊ��ʵ������
		SellThread st = new SellThread();
		
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
