package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test03 {
	
public static void main(String[] args) {
		
		List array = new ArrayList(20);
		
		array.add("a");
		array.add("b");
		array.add("c");
		array.add("d");
		array.add("e");
		
		
		ListIterator it = array.listIterator();
		
		
		while(it.hasNext()) {
			System.out.println("第 " +it.nextIndex() +" 个元素 : 值是 : "+it.next());
		}
		System.out.println("----------");
		while(it.hasPrevious()) {
			System.out.println("第 " +it.previousIndex() +" 个元素 : 值是 : "+it.previous());
		}
		
		
		
	}


}
