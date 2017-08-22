package set;

import java.util.HashSet;
import java.util.Iterator;

public class Test_HashSet_Get {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Ab");
		set.add("Ba");
		set.add("Aa");
		set.add("Bb");
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
