package com.sychronized.bank;

public class Bank {

	private static int menoy = 10;

	//�������� / ���߳��Ŷӷ���
	public synchronized static int getbalance() {
		return --menoy;
	}

}
