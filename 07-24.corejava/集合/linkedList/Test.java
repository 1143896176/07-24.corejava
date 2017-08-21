package linkedList;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		
		LinkedList<String> lists = new LinkedList<String>();
		
		lists.add("a");
		lists.add("b");
		lists.addLast("c");
		
		System.out.println(lists);
		lists.set(0, "A");
		String element = lists.removeFirst();
		System.out.println("element : " + element );
		
		System.out.println(lists);
		
		
		
	}

}
