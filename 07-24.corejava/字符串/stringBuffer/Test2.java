package stringBuffer;

public class Test2 {

	public static void main(String[] args) {
		
		String aaa = "";
		
		StringBuffer sbf = new StringBuffer(aaa);
		sbf.append("a").append("b");
		
		String str = sbf.toString();
		System.out.println(str);

		
	
	}

}
