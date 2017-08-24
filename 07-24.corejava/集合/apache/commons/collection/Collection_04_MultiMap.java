package apache.commons.collection;



import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections.MultiMap;
import org.apache.commons.collections.map.MultiValueMap;

public class Collection_04_MultiMap {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		//多重性 Map    解决 key 不能重复的问题
		MultiMap map = new MultiValueMap(); // MultiHashMap() 过期的实现方法
		
		map.put("one", "corejava");  
		map.put("one", "html 5");
		map.put("one", "css3");
		map.put("one", "javascript");
		map.put("one", "Oracle PL/SQL");

		map.put("two", "Http");
		map.put("two", "JavaEE");
		map.put("two", "XML");
		map.put("two", "Ajax");
		map.put("two", "Jquery / ext / dwr ");
		
		
		map.put("three", "struts2");
		map.put("three", "hibernate");
		map.put("three", "spring");
		map.put("three", "ejb / Jboss / weblogic ");
		map.put("three", "android");
		map.put("three", "SOA");
		
		Set keySet = map.keySet();   //   one two three
		
		Iterator keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) { 
			Object key = keyIterator.next();//第一层循环，获取   one two three
			Collection values = (Collection)map.get(key); //map.get("one")  ---> corejava  html5 css javascript
			System.out.println("key: "+key+" , 数据长度是 : "+values.size());
			
//			Iterator valuesIterator = values.iterator();
//			while(valuesIterator.hasNext()){
//				System.out.println("\t value : "+valuesIterator.next());
//			}
			
			System.out.println(values);
			
			System.out.println("");
		}
	}
}
