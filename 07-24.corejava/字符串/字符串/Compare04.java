package �ַ���;

public class Compare04 {

	public static final String A = "ab"; // ����A
	public static final String B = "cd"; // ����B

	public static void main(String[] args) {
		String s = A + B; // ������������+���Ӷ�s���г�ʼ��
		String t = "abcd";
		if (s == t) {
			System.out.println("s����t��������ͬһ������");
		} else {
			System.out.println("s������t�����ǲ���ͬһ������");
		}
	}

}
