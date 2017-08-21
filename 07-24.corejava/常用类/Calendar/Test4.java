package Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {

	public static void main(String[] args) {

		

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String date_str = "2017-08-21";
		
		try {
			Date d = sdf.parse(date_str);
			System.out.println(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
