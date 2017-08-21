package Calendar;

import java.util.Calendar;
import java.util.Date;

public class Test {
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		Date now = c.getTime();
		
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
	}

}
