package 字符串转换;

public class Test {

	public static void main(String[] args) {
		String str = "哈哈";    //这里演示过   中文占两个 . ...  
		
		byte[] bytes = str.getBytes();
		for (byte b : bytes) {
			System.out.println(b);
		}
		
		System.out.println("xxxxxxxx");
		
		char[] chars = str.toCharArray();
		
		for (char c : chars) {
			System.out.println(c);
		}

	}

}
