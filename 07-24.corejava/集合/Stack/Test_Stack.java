package Stack;

import java.util.Stack;

public class Test_Stack {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		for (int i = 0; i < 5; i++) {
			s.push(i);
		}

		System.out.println(s);
		
//		System.out.println(s.peek());
		System.out.println(s.pop());  //µ¯Õ»
		
		System.out.println(s);
		
	}

}
