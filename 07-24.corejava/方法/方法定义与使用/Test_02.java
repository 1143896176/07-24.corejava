package ����������ʹ��;

public class Test_02 {
	
	
	public static void getX( int x) {
		x = 3*x;
	}
	
	public static void getY( int[] y ) {
		y[0] = 3*y[0]; 
	}
	
	public static void main(String[] args) {
		
		int x = 10;
		System.out.println("x : " + x);
		getX(x); //ʵ��     // ��������  ��ֵ
		System.out.println("x : " + x);
		
		int[] y = {10}; 
		System.out.println("y : " + y[0]);
		getY(y);//ʵ��      // ��������  ��ַ
		System.out.println("y : " + y[0]);
		
	}
	


}
