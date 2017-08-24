package apache.commons.collection;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import apache.commons.collection.support.Person;

public class Collection_09_MapToBean {

	public static void main(String[] args) throws Exception {
		
		Map<String , Object> params = new HashMap<String , Object>();
		params.put("age", "20");
		params.put("name", "oracle");
		params.put("occupation", "UK");
		
		Person person = new Person();
		
		//”√ map ÃÓ≥‰ bean 
		BeanUtils.populate(person, params);

		System.out.println(person);

	}

}
