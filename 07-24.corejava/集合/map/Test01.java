package map;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test01 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put(5, "tom2");
		map.put(5, "tom1");
		map.put("3", false);
		map.put(4.8, new Date());
		
		
		System.out.println(map.get(4.8));
		
//		map.remove("3");
		
		System.out.println(map);
		
		Set keys = map.keySet();
		
		Iterator it = keys.iterator();
		
		while(it.hasNext()) {
			Object key = it.next();
			System.out.println("key : " + key + " , value = " + map.get(key) );
		}
	
		
//		Set entry = map.entrySet();
//		System.out.println(entry);
//		
//		Collection values = map.values();
//		System.out.println(values);
		
		
		

	}

}
