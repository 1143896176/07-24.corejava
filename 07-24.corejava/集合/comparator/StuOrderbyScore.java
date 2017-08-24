package comparator;

import java.util.Comparator;

public class StuOrderbyScore implements Comparator<Stu> {

	@Override
	public int compare(Stu o1, Stu o2) {
		
		if(o1.getScore() > o2.getScore()) return 1;
		else if(o1.getScore() < o2.getScore()) return -1;
		else 	return 0;
	}

}
