package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		
		Stu s1 = new Stu("a" , 80.0);
		Stu s2 = new Stu("b" , 59.0);
		Stu s3 = new Stu("c" , 90.0);
		
		List<Stu> stus = new ArrayList<Stu>();
		stus.add(s1);
		stus.add(s2);
		stus.add(s3);
		
		StuOrderbyScore c = new StuOrderbyScore();
		
		Collections.sort(stus, c);
		
		for (Stu stu : stus) {
			System.out.println(stu);
		}
		
		
	}

}
