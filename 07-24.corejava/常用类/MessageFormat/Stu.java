package MessageFormat;

import java.text.MessageFormat;

public class Stu {
	
	private int id = 1 ;
	private String name = "tom";
	private double score = 99.9;
	@Override
	public String toString() {
		
		String info = "id : {0} \t\tname: {1}\t\tscore : {2}" ;
		
		return MessageFormat.format(  info , id , name , score);
	}

	
	

}
