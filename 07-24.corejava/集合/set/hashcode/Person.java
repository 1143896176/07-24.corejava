package set.hashcode;

import java.util.Random;

public class Person {

	private int id;
	private String name;
	private Integer age;

	public Person(int id, String name , Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
//
//	@Override
//	public boolean equals(Object obj) {
//		return true;
//	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + " , age : "+age+"]";
	}
	
	

}
