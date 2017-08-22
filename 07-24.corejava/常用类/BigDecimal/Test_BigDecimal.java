package BigDecimal;

import java.math.BigDecimal;

public class Test_BigDecimal {

	public static void main(String[] args) {
		
		BigDecimal d1 = new BigDecimal("10");
		BigDecimal d2 = new BigDecimal("10");
		BigDecimal result = d1.add(d2);
		System.out.println(result.pow(2));

		
		

	}

}
