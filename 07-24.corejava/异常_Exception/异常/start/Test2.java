package �쳣.start;

public class Test2 {

	public static void main(String[] args) {

		System.out.println(aaa());
		
	}
	
	public static int aaa() {
		try {
			
			System.exit(0);
			return 0;
			
		} catch (Exception e) {
			System.out.println("�д���...");

		} finally {
			//finally �еĴ������  return ֮ǰ ִ�� . 
			System.out.println("�ͷŵ��˴�����");
		}
		return 1;
	}

}
