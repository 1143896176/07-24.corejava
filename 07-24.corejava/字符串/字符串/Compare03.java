package �ַ���;

public class Compare03 {


	public static void main(String[] args) {
		String str1 = "str";
		String str2 = "ing";
		
		//ֻ��ʹ�� "" �ķ�ʽ�������ַ�������֮�� ���� "+" ���Ӳ������¶���Żᱻ�����ַ�����������
		String str3 = "str" + "ing";
		//����������ʽ����������������ֱ��ͨ�� "+" ���ӻ�
		//ͨ��new��ʽ�����Ķ������ӣ����������¶��󲢲�������ַ����������С�
		String str4 = str1 + str2;
		
		
		System.out.println(str3 == str4);
		String str5 = "string";
		System.out.println(str3 == str5);

	}

}
