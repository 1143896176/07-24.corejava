package ����;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class Test03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = 127;
		byte b2 = -128;
		byte b3 = 'a';
		byte b4 = 'A'; // һ����ĸ = 1 byte = 8 bit
		
		
		System.out.println(b4);
		
		// byte b5 ='aa'; ��ʹ���
		// byte b6 ='��'; ��ʹ��� һ������ 2���ֽ� 16bit
		short s1 = '��'; // һ������ 2���ֽ� 16bit short �� 16 bitλ��
		// short s2 = '����'; // 2������ 4���ֽ� 32 bit int ��32 bit��
		// int i1 = '����'; ���� int ���������͵� , char �� 16 bit�� = 2 byte = һ������
		char c1 = '��';
		// byte ת�� string
		String string = "����";
		byte by[] = string.getBytes();
		String str = new String(by);
		System.out.println(s1);
		
		
		System.out.println(URLEncoder.encode("��"));
		
	}
}
