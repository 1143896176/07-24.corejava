package set.hashcode;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {


		Person p1 = new Person(1, "tom" , new Integer(1228));
		Person p2 = new Person(1 , "tom" , new Integer(1228));
		
//		System.out.println(p1.hashCode());
//		System.out.println(p2.hashCode());
		
		Set sets = new HashSet();
		sets.add(p1);
		sets.add(p2);
		
		System.out.println(sets);

	}

}
