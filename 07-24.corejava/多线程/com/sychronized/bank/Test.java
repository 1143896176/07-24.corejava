package com.sychronized.bank;

public class Test {
	
	public static void main(String[] args) {
		
		ControlMenoy c1 = new ControlMenoy("tom");
		ControlMenoy c2 = new ControlMenoy("jack");
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		
		
		t1.start();
		t2.start();
		
		
	}
	
	

}
