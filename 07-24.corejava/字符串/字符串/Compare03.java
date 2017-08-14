package 字符串;

public class Compare03 {


	public static void main(String[] args) {
		String str1 = "str";
		String str2 = "ing";
		
		//只有使用 "" 的方式创建的字符串对象之间 采用 "+" 连接产生的新对象才会被加入字符串常量池中
		String str3 = "str" + "ing";
		//对于其他形式比如两个对象引用直接通过 "+" 连接或
		//通过new方式创建的对象连接，所产生的新对象并不会加入字符串常量池中。
		String str4 = str1 + str2;
		
		
		System.out.println(str3 == str4);
		String str5 = "string";
		System.out.println(str3 == str5);

	}

}
