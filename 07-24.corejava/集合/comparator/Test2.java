package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {

		Stu s1 = new Stu("a", 80.0);
		Stu s2 = new Stu("b", 59.0);
		Stu s3 = new Stu("c", 90.0);

		List<Stu> stus = new ArrayList<Stu>();
		stus.add(s1);
		stus.add(s2);
		stus.add(s3);


		Collections.sort(stus, new Comparator<Stu>() {

			@Override
			public int compare(Stu o1, Stu o2) {

				if (o1.getScore() > o2.getScore())
					return 1;
				else if (o1.getScore() < o2.getScore())
					return -1;
				else
					return 0;
			}

		});
		
		
		for (Stu stu : stus) {
			System.out.println(stu);
		}

	}

}
