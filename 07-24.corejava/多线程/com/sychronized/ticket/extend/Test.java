package com.sychronized.ticket.extend;

public class Test {
	
	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(new Sell("A"));
		Thread t2 = new Thread(new Sell("B"));
		Thread t3 = new Thread(new Sell("C"));
		
		t1.start();
		t2.start();
		t3.start();

		
	}

}
