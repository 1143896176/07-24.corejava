package 异常.start;

public class Test {
	
	public static void main(String[] args) {
		String[] strs = {"A" , "B" , "C"};
		
		try {
			
			
			
			for (int i = 0; i < 5 ; i++) {
				System.out.println(" i : " + strs[i]);
			}
			
			System.out.println(1/0);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("来吧  我都能解决....  包治百病 ");
			
		} catch(  Exception e) {
			
		}
	}

}
