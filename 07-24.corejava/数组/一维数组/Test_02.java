package һά����;

public class Test_02 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[3]; // 3 �������� . length
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
//		arr[3] = 40;  //  java.lang.ArrayIndexOutOfBoundsException  �����±�Խ��
	
		//* ͨ�� for ѭ��  ������� �������� */
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] );
		}
		
//		System.out.println(1/0);  //  java.lang.ArithmeticException
		
	}

}
