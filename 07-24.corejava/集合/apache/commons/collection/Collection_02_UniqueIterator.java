package apache.commons.collection;



import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.iterators.UniqueFilterIterator;

public class Collection_02_UniqueIterator {

	/**
	 * 遍历 相异的元素
	 * 重复的元素 只显示一次 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] medals = new String[] {"Gold","Silver","Silver","Gold","Bronze"};
		
		List<String> medalsList = Arrays.asList(medals);
		
		Iterator<String> it = medalsList.iterator();
		
		Iterator<String> uniqueIterator = new UniqueFilterIterator( it );
		
		while(uniqueIterator.hasNext()) {
			System.out.println("Unique Medal: "+uniqueIterator.next());
		}
		
		
		//原生办法
		Set sets = new HashSet(medalsList);
		System.err.println(sets);
		
	}

}
