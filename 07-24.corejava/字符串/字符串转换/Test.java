package �ַ���ת��;

public class Test {

	public static void main(String[] args) {
		String str = "����";    //������ʾ��   ����ռ���� . ...  
		
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
