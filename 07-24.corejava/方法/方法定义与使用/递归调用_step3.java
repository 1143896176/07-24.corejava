package ����������ʹ��;

public class �ݹ����_step3 {

	
	static int count = 0;
	
	public static void main(String[] args) throws Exception  {
		
				sayHello();
	
	}
	
	/* �õ�ʱ�������  ����Ը�....... */
	static void sayHello() throws Exception {
		
		System.out.println(" Hello function .....   ");
		String cmd = "cmd /c start chrome http://www.baidu.com";
		Runtime.getRuntime().exec(cmd);
		
		count++;
		
		if(count<3) {
			sayHello();
		} else {
			return;
		}
		

	}
	

}
