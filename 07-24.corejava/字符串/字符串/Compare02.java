package �ַ���;

public class Compare02 {

	public static void main(String[] args) {

		String s1 = "a";
		String s2 = "a";

//		System.out.println(s1.equals(s2)); // �Ƚ�����

		String s3 = new String("a");
		String s4 = new String("a");
//		System.out.println(s3.equals(s4)); //  �Ƚ�����
		
		///
		
		//���Դ�Сд�ıȽ�
		String s5 = "A";
		String s6 = "a";
//		System.out.println("���Դ�Сд : " + s5.equalsIgnoreCase(s6)); //  ���Դ�Сд�Ƚ�
		
		//�� ��ȥ�Ƚ�
		String s7 = "A";
		String s8 = "";
		String s9 = null;
		
//		System.out.println(s8.equals(s7));
		System.out.println(s7.equals(s8));
		System.out.println(s8.equals(s9));
		
	}

}
