package �ַ�����ʹ��;

public class TestStringApi {
	
	/*
	 * api
	 * 
	 * */

	public static void main(String[] args) {
		String str = "ABC";
		String email = "hahaha@qq.com";
		String email2 = "hahaha@qq.com@haha";
		String id = "120104197001011234";
		
		String a = "Hello ";
		String b = "World";
		
		String skills = "java,node.js,python,scala,springboot,css,hadoop,mogodb";
		
		String password = " 66 6666 ";
		
		
		System.out.println(str.toLowerCase());
		
		System.out.println("charAt(0) : " + email.charAt(0));
		
		System.out.println("id ȡ 4�Ժ�" + id.substring(4));
		System.out.println("���� : " + id.substring(6, 14));
		
		System.out.println("У�� @ ���� : " + email.indexOf("@"));     //indexOf( char , index )  //����˵���������Ժ�ʼ��...
		System.out.println("У�� qq ���� : " + email.indexOf("qq"));
		System.out.println("У�����һ�� @ ���� : " + email2.lastIndexOf("@"));
		
		String c = a.concat(b);
		System.out.println(c);
		
		System.out.println("////  �Ҷ���ʲô?  ///");
		String[] skill = skills.split(",");
		for (String s : skill) {
			System.out.println(s);
		}
		
		System.out.println("���� : )   ");
		
		System.out.println(password.trim());  //ȥ�� ���˵�  space
		
	}

}
