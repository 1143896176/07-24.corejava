package �ַ���;

public class Compare05 {
	
	//A��B��Ȼ������Ϊ�������������Ƕ�û�����ϱ���ֵ��
	//�������s��ֵ֮ǰ�����Ǻ�ʱ����ֵ���Լ�������ʲô����ֵ�����Ǹ�������
	//���A��B�ڱ���ֵ֮ǰ������������һ��������
	//��ôs�Ͳ����ڱ����ڱ�ȷ������ֻ��������ʱ�������ˡ�
	
	public static final String A; // ����A
	public static final String B; // ����B
	static {
		A = "ab";
		B = "cd";
	}

	public static void main(String[] args) {
		// ������������+���Ӷ�s���г�ʼ��
		String s = A + B;
		String t = "abcd";
		if (s == t) {
			System.out.println("s����t��������ͬһ������");
		} else {
			System.out.println("s������t�����ǲ���ͬһ������");
		}
	}
	// s������t�����ǲ���ͬһ������
}
