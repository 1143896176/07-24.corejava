package ����������ʹ��;

public class Test_01 {

	public static void main(String[] args) {

		int sum = add(10, 10);

		System.out.println(" sum : " + sum);

	}

	/**
	 * 
	 * @param a ��һ������ �� xxxxx ����xxxx ��Ҫ���� xxxx
	 * @param b �ڶ�������
	 * @return ������͵�ֵ . . . . 
	 */
	static int add(int x , int y) { // ������Ҫ�������� , �������� // a ,  b �ֱ�����β�
		// sum �Ǿֲ����� // �˿��������Ŀ�ʼ
		int sum = x + y;

		return sum; // ���ص��Ǽ��������� //����ʱ �ڴ��Ѿֲ����� sum ���� .
	}

	static int add2(int a, int b, int c) {

		int sum = a + b + c;

		return sum;
	}

}
