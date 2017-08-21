package Calendar;

import java.util.Calendar;
import java.util.Date;

public class Test2 {
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.add(Calendar.HOUR, 1);
		System.out.println(c.getTime());
	
		
	}

}
