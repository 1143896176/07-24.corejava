package Date;

import java.util.Date;

public class Test01 {

	
	public static void main(String[] args) {

		Date now = new Date();
		
		System.out.println(now);
		
		System.out.println(now.getDay());
		System.out.println(now.getDate());
		System.out.println(now.getYear()+1900);
		System.out.println(now.getMinutes());
		
		System.out.println("----------------");
		
		Date d1 = new Date(2017-1900 , 8 , 21);
		System.out.println(d1);
		


	}


}
