package ����������ʹ��;

public class �ݹ����_step1 {

	//ȫ�ֱ���
	static int count = 0;
	
	public static void main(String[] args) throws Exception  {
		
			for (int i = 0; i < 3; i++) {
				sayHello();
			}
			count++;
			System.out.println(count);
	}
	
	// java.lang.StackOverflowError
	static void sayHello() {
		
		System.out.println(" Hello function .....   ");
		

		count++;
		
//		sayHello();
	}
	

}
