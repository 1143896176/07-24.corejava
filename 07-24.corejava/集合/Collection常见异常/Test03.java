package Collection³£¼ûÒì³£;

import java.util.LinkedList;

public class Test03 {

	public static void main(String[] args) {

		LinkedList<String> lists = new LinkedList();
		lists.add("a");
		lists.add("b");
		lists.add("c");

		for (String s : lists) {
			lists.remove(s);
		}

	}

}
