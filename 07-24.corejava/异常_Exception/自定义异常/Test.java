package 自定义异常;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		int age = -10;
		
		try {
			
			if(age < 0 || age > 120) {
				throw new AgeException();
			}
			
		} catch (AgeException e) {
			System.out.println(e.getMessage());
			System.out.println(new Date());  // go on  
		}

	}

}
