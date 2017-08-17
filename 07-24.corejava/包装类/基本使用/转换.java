package 基本使用;

public class 转换 {
	
	public static void main(String[] args) {
		
		int a = 10;
		Integer b = new Integer(a);   // int - > Integer
		System.out.println(b);
		
		int c = b.intValue();   // Integer - > int
		System.out.println(c);
		
		String d = b.toString();   // Integer --> String
		String e = "10";
		System.out.println(d.equals(e));
		
		long id = System.currentTimeMillis();   //  int/long/double....... -- > String     // String.valueOf(各种基本数据类型);
		String str = String.valueOf(id);
		Double ddd = Double.valueOf("1.23");     //  String -- > XXXX.parseXXX()  --- > XXXX
		
		String f = "1.1";
		Double g = Double.parseDouble(f);
		System.out.println(g);
		
	}

}
