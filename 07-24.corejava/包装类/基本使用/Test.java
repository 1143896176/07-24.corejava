package 基本使用;

public class Test {

	public static void main(String[] args) {

		Integer a = 127;
		int b = 3;
		Integer c = 3;
		String num = "123";
		System.out.println(a.doubleValue());
		System.out.println(a.byteValue());
		System.out.println(Integer.parseInt(num) + 1);
		System.out.println("转换成二进制 : " + Integer.toBinaryString(b));

		System.out.println("abc123ABC_");
		char w = 'c';
		System.out.println(Character.isLowerCase(w));

	}

}
