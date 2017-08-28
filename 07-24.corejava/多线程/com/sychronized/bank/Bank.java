package com.sychronized.bank;

public class Bank {

	private static int menoy = 10;

	//方法加锁 / 多线程排队访问
	public synchronized static int getbalance() {
		return --menoy;
	}

}
