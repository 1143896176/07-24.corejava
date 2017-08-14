package ∏∏¿‡Object.equals;

public class Stu {

	private int id;
	private String name;
	private int score;
	
	public Stu() {
		
	}

	public Stu(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	

	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Stu s1 = this;
		Stu s2 = (Stu)obj;
		
		if(s1.getId() == s2.getId()) return true;
		else return false;
	}

}
