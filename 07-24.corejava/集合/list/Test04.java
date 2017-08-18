package list;

import java.util.ArrayList;
import java.util.List;

import list.support.Stu;

public class Test04 {
	
	public static void main(String[] args) {
		
		
		int a = 10;
		
		Stu s1 = new Stu(1 , "jack");
		
		List list = new ArrayList();
		list.add(1);
		list.add(s1);
		
		a = 100;
		s1.setName("tom");
		
		for (Object object : list) {
			System.out.println(object);
		}
		
		
		
	}

}
