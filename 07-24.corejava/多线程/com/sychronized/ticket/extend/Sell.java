package com.sychronized.ticket.extend;

import java.util.Vector;

public class Sell implements Runnable {

	private Vector<Object> self = new Vector<Object>();// ��������
	private String sell;
	private int sum; // �洢Ŀǰ�õ��Ľ���

	public Sell(String name) {
		this.sell = name;
	}

	@Override
	public void run() {
		try {

//			synchronized (this) {

				while (Ticket.tickets.size() > 0) {

					self.addElement(Ticket.tickets.remove(0));

					System.out.println(this.sell + "����" + self.size() + " ��");

					if (self.size() > 0 && self.size() % 5 == 0) {
						sum += 5;
					}

				}
//			}

			System.out.println(this.sell + "������ " + self.size() + " ��Ʊ , �õ���" + sum + " Ԫ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
