package ���캯��.test;

import ���캯��.�������;

public class Test_������� {
	
	public static void main(String[] args) {
		
		������� d1 = new �������();
		
		System.out.println("�ҵĴ���������� : "  + d1.eggCount +" �Ƿ������� :  " + d1.lazi);
		
		
		������� d2 = new �������(3);
		
		System.out.println("�ҵĴ���������� : "  + d2.eggCount +" �Ƿ������� :  " + d2.lazi);
		
		������� d3 = new �������(4 , false);
//		d3.eggCount = 2;
		System.out.println("�ҵĴ���������� : "  + d3.eggCount +" �Ƿ������� :  " + d3.lazi);
		
	}

}
