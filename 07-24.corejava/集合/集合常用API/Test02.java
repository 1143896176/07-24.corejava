package 集合常用API;

import java.util.Arrays;
import java.util.List;

public class Test02 {

	
	public static void main(String[] args) {
		
		String[] strs = {"a" , "b" , "c "};
		
		List<String> strs2 = Arrays.asList(strs);  //转换后的 list  非动态
		
		strs2.add("d"); //  
		
		System.out.println(strs2);
	
		
	}
}
