package com.sychronized.ticket.extend;

import java.util.Vector;

public class Ticket {
	
	
//	List lists = Collections.synchronizedList(new ArrayList()); // 实现同步 . 
	public static Vector<Object> tickets = new Vector<Object>();
	
	static {
		
		for(int i = 0 ; i<100 ; i++) {
			tickets.add(new Object());
		}
	}

}
