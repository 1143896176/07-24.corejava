package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test06 {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 3;
		int c = 2;
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(a);list.add(b);list.add(c);
		
		String o = "II";
		String p = "IV";
		String q = "III";
		List<String> list2 = new ArrayList<String>();
		list2.add(o);list2.add(p);list2.add(q);
	
		Collections.sort(list2); //≈≈–Ú
		
		System.out.println(list2);
		
		
	}

}
