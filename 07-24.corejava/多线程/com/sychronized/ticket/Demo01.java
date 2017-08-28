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
					tickets--; //减少票源数量
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
	
		//创建一个售票的实例对象
		SellThread st = new SellThread();
		
		Thread t1 = new Thread(st);
		t1.setName("售票点1");
		Thread t2 = new Thread(st);
		t2.setName("售票点2");
		Thread t3 = new Thread(st);
		t3.setName("售票点3");
		Thread t4 = new Thread(st);
		t4.setName("售票点4");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
