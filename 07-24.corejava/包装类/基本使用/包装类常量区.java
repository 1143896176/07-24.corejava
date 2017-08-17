package 基本使用;

public class 包装类常量区 {
	
	public static void main(String[] args) {
		
		Integer a1 = 10;    // -128-127
		Integer a2 = 10;
		
		Integer a3 = new Integer(10);
		Integer a4 = new Integer(10);
		
		Integer a5 = 100;
		Integer a6 = 100;
		
		Integer a7 = 127;
		Integer a8 = 127;
		
//		System.out.println(a1==a2);
//		System.out.println(a1.equals(a2));
//		
//		System.out.println(a3==a4);
//		System.out.println(a3.equals(a4));
//		
//		System.out.println(a1==a3);
//		System.out.println(a1.equals(a3));
		
		
		System.out.println(a5==a6);
		System.out.println(a5.equals(a6));
		
		System.out.println(a7==a8);
		System.out.println(a7.equals(a8));
		
		
	}

}
