package Date;

import java.util.Date;

public class Test02 {
	
	public static void main(String[] args) {
		
		Date curr = new Date();
		System.out.println(curr.getTime());
		
		long t1 = 1503298239965l;
		
		Date date = new Date(t1);
		System.out.println(date);
		
		System.out.println(date.after(curr));
		
		
		
	}

}
