package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
		
		Queue q = new LinkedList();   //LRU
		
		for (int i = 0; i < 5; i++) {
			q.add(i);
		}
		
		System.out.println(q);
		
//		System.out.println(q.poll());  // 出列
		
		System.out.println(q.peek());   //查看 队长
		
		System.out.println(q);

	}

}
