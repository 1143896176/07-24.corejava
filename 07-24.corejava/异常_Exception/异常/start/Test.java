package �쳣.start;

public class Test {
	
	public static void main(String[] args) {
		String[] strs = {"A" , "B" , "C"};
		
		try {
			
			
			
			for (int i = 0; i < 5 ; i++) {
				System.out.println(" i : " + strs[i]);
			}
			
			System.out.println(1/0);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����  �Ҷ��ܽ��....  ���ΰٲ� ");
			
		} catch(  Exception e) {
			
		}
	}

}
