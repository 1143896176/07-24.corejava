package com.sychronized.ticket;


//创建一个子线程类完成后买车票的任务
class SellThread1 implements Runnable{
	//创建一个类的成员变量，模拟共享的车票
	int tickets = 100;	
	
	@Override
	public void run() {
	
		//购票任务
		while(true){			
			sell();			
		}		
	}	
	//买票的方法
	private synchronized void sell(){ //加锁
		if(tickets>0){
			try {
//				Thread.sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":sell tickets:"+tickets);
			tickets--; //减少票源数量
		} else {
			return;
		}
	}
}

public class Demo02 {

	public static void main(String[] args) {
	
		//创建一个售票的实例对象
		SellThread1 st = new SellThread1();
		
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
