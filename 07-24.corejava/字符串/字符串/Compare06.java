package �ַ���;

public class Compare06 {

	public static void main(String[] args) {
		String s1 = new String("�����"); //����һ�� , �ҿ�����һ���� ��������...
		String s2 = s1.intern(); // �����    //������в����� ���һ��s1������ , ��֮������ȡ�� . 
		String s3 = "�����";  // s3 ֱ��������  s1 ���еı��ݼ��� . 
		
		System.out.println("s1 == s2? " + (s1 == s2));
		System.out.println("s3 == s2? " + (s3 == s2));
	}

}
