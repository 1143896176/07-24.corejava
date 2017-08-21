package ≥£”√API;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
//		Collections.copy(dest, src);   øΩ±¥
		
		List<Integer> lists = new ArrayList<Integer>();
		
		lists.add(2);
		lists.add(1);
		
		Integer max = Collections.max(lists);
		System.out.println("max : " + max);
		
		Collections.reverse(lists);
		
		System.out.println(lists);
		
		Collections.shuffle(lists);
		
		System.out.println("œ¥≈∆ : " + lists);
		
	}

}
