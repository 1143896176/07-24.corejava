package 包装类案例;

public class Test {

	public static void main(String[] args) {
		
		String pwd = "AB Cabc_123   ";
		char s1 = 'A';
		char s2 ='a';
		char s3 = '1';
		char s4 = '_'; 
		char s5 = ' ';
		
//		System.out.println(Character.isDigit(s3));
////		
//		System.out.println(Character.isLowerCase(s2));
//		System.out.println(Character.isUpperCase(s1));
//		System.out.println(Character.getType(s4));
//		System.out.println(Character.isSpaceChar(s5));
//		
		char[] chars = pwd.toCharArray();
		Check check = new Check();
		
		for (char c : chars) {
			if(Character.isDigit(c)) check.setHasDigit(true);
			else if(Character.isLowerCase(c)) check.setHasLower(true);
			else if(Character.isUpperCase(c)) check.setHasUpper(true);
			else if(Character.isSpaceChar(c)) check.setHasSpace(true);
			else if(Character.getType(c) == 23 ) check.setHasUnderLine(true);
			
		}
		
		
		System.out.println(check.getLevel());
		
		
	}
	
}
