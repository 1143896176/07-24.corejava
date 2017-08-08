package ���Դ�;

public class MyArrayUtils {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };

//		int[] result = addElement(array, 9);
		
//		int[] result = removeElementFromIndex(array, 0);
		
		int[] result = subArray(array, 2, 6);

		printArr(result);

	}

	// �������
	public static void printArr(int[] array) {
		for (int i : array) {
			System.out.print(i + "\t");
		}
	}

	// Ԫ��׷��
	public static int[] addElement(int[] array, int data) {

		int[] result = new int[array.length + 1];

		for (int i = 0; i < array.length; i++) {
			result[i] = array[i];
		}

		result[result.length - 1] = data;

		return result;
	}

	// ����ɾ��
	public static int[] removeElementFromIndex(int[] array, int index) {

		int[] result;

		result = new int[index];
		for (int i = 0; i < index; i++) {
			result[i] = array[i];

		}

		return result;
	}
	
	//��ȡ���� 
	static int[] subArray(int[] array , int from , int to) {
		int len =  to - from ;
		int[] result = new int[len]; 
		
		System.arraycopy(array, from, result, 0, len);
		
		return result;
	}

}
