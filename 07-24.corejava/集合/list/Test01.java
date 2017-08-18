package list;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import list.support.Stu;

public class Test01 {
	
	public static void main(String[] args) {
		
		System.out.println("start------------");
		
		List list = new ArrayList(5);
		list.add("1");     //   1 =  new Integer(1) 
		list.add("2");
		list.add(new Date());
		list.add(new Stu(1,"tom"));
		
		printList(list);
	
		System.out.println("------------------");
		list.add(0, new Stu(2 , "jack"));
		printList(list);
		System.out.println("-----------ɾ��ĳ��Ԫ��--------");
//		list.remove("2");  //��������ɾ��     equals
		list.remove(1);   //���±�ɾ��
		printList(list);
		System.out.println("-----------�Ƿ����ĳ��Ԫ��--------");
		System.out.println(	list.contains("2"));
		
	}
	
	
	public static void printList(List list ) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println( list.get( i ) );
		}
	}

}
