package test;

public class Test {
	public static void main(String[] args) {
		String str = "����";
		byte[] bytes = str.getBytes();
		// ��ӡ�ֽ�����
	
		for (int i = 0; i < bytes.length; i++)
			System.out.print("\t" + bytes[i]);
	}
}
