package list;

import java.util.ArrayList;
import java.util.Iterator;

public class Test02 {
	
	public static void main(String[] args) {
		
		ArrayList array = new ArrayList();
		
		array.add("a");
		array.add("b");
		array.add("c");
		array.add("d");
		array.add("e");
		
//		for (Object object : array) {
//			System.out.println(object);
//		}
//		
		
		Iterator it = array.iterator();
		
		while(it.hasNext()) {
			String str = (String)it.next();
			
			if(str.equals("b")) {
				it.remove();
			}
		}
		
		System.out.println(array);
		
		
	}

}
