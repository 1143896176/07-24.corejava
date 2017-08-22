package stringBuffer;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Test2 {

	public static void main(String[] args) throws Exception {
		
		String aaa = "";
		
		StringBuffer sbf = new StringBuffer(aaa);
		sbf.append("a").append("b");
		
		String str = sbf.toString();
		System.out.println(str);
		
		BigDecimal b1 = new BigDecimal("10");
		BigDecimal b2 = new BigDecimal("10");
		BigDecimal result = b1.add(b2);
		NumberFormat ins = NumberFormat.getCurrencyInstance();
		ins.setCurrency(Currency.getInstance(Locale.CHINA));

		System.out.println(ins.format(1000.00));

		
	
	}

}
