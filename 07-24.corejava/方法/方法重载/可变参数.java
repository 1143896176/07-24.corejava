package ��������;

public class �ɱ���� {
	
	public static void main(String[] args) {
		
		method(1,2,3,4,5);
		
	}
	
	//arr ���Ϊ����
	static void method( int... arr ) {
		
		if(arr!=null && arr.length >0) {
			for (int i : arr) {
				System.err.println(i);
			}
		}
		
	}

}
