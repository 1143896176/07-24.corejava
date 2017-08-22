package map;

import java.util.Date;
import java.util.TreeMap;

public class Test02 {

	public static void main(String[] args) {
		TreeMap<String , Object>  map = new TreeMap<String , Object>();

		map.put("5", "tom2");
		map.put("3", false);
		map.put("4", new Date());
		
		System.out.println(map);

	}

}
