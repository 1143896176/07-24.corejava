package com.sychronized.ticket.extend;

import java.util.Vector;

public class Sell implements Runnable {

	private Vector<Object> self = new Vector<Object>();// 定义容器
	private String sell;
	private int sum; // 存储目前得到的奖金

	public Sell(String name) {
		this.sell = name;
	}

	@Override
	public void run() {
		try {

//			synchronized (this) {

				while (Ticket.tickets.size() > 0) {

					self.addElement(Ticket.tickets.remove(0));

					System.out.println(this.sell + "卖了" + self.size() + " 张");

					if (self.size() > 0 && self.size() % 5 == 0) {
						sum += 5;
					}

				}
//			}

			System.out.println(this.sell + "共卖了 " + self.size() + " 张票 , 得到了" + sum + " 元");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
