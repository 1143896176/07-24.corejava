package set;

import java.util.HashSet;
import java.util.Set;

public class Test_HashSet {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("2");set.add("1");set.add("4");set.add("2");set.add(null);set.add(null);
		
		System.out.println(set);
		
		System.out.println("-----------");
		Set<Stu> stus = new HashSet<Stu>();
		
		
		//如果是自定义引用类型
		Stu s1 = new Stu("tom" , 20 , 60.0);
		Stu s2 = new Stu("tom" , 20 , 60.0);
		Stu s3 = new Stu("tom" , 20 , 60.0);
		Stu s4 = new Stu("tom" , 20 , 60.0);
		
		stus.add(s1);stus.add(s2);stus.add(s3);stus.add(s4);
		
		System.out.println(stus);
		
	}

}
