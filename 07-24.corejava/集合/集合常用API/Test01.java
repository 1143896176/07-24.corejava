package 集合常用API;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class Test01 {
	
	
	//List容器  -- > 数组

	public static void main(String[] args) {
		
		List<String> strs = new ArrayList();
		strs.add("a");
		strs.add("b");
		strs.add("c");
		strs.add("d");
		
		Object[] strs2 = strs.toArray();
		System.out.println(ArrayUtils.toString(strs2));
		

	}

}
