package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Test_LinkedList_ArrayList {
	
	public static void main(String[] args) {
		int max = 20000;
		int min = 0;
		int s = 0;
		
		
		ArrayList array = new ArrayList();
		long curr = System.nanoTime();  
		
		for (int i = 0; i < 20000 ; i++) {
			//插入数据
//			array.add(0,new Object());
			//追加数据
			array.add(new Object());
		}
		
		System.out.println("时间差 : " + ( System.nanoTime() - curr) );
		
		LinkedList link = new LinkedList();
		curr =  System.nanoTime();  
		for (int i = 0; i < 20000 ; i++) {
//			link.add(0,new Object());
			link.add(new Object());
		}
		System.out.println("时间差 : " + ( System.nanoTime() - curr) );
		
		System.out.println("//////////////////////////");
		curr =  System.nanoTime();  
		for (int i = 0; i < array.size(); i++) {
			s = new Random().nextInt(max)%(max-min+1) + min;
			array.get(s);
		}
		System.out.println("获取内容的时间差 : " + ( System.nanoTime() - curr) );
		
		curr =  System.nanoTime();  
		for (int i = 0; i < link.size(); i++) {
			s = new Random().nextInt(max)%(max-min+1) + min;
			link.get(s);
		}
		System.out.println("获取内容的时间差 : " + ( System.nanoTime() - curr) );
		
		
		System.out.println("//////////////////////////");
		curr =  System.nanoTime();  
		for (int i = 0; i < array.size(); i++) {
			array.remove(i);
		}
		System.out.println("删除内容的时间差 : " + ( System.nanoTime() - curr) );
		
		curr =  System.nanoTime();  
		for (int i = 0; i < link.size(); i++) {
			link.removeFirst();
			link.removeLast();
		}
		System.out.println("删除内容的时间差 : " + ( System.nanoTime() - curr) );
	

		
	}

}
