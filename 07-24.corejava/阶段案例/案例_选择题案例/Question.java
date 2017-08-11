package 案例_选择题案例;

//JavaBean
public abstract class Question {

	protected String title;
	protected Option[] options;
	protected int type; // 案例中 没用到 type , 0 = 单选 , 1 = 多选

	public Question() {

	}

	public Question(String title, Option[] options, int type) {
		this.title = title;
		this.options = options;
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Option[] getOptions() {
		return options;
	}

	public void setOptions(Option[] options) {
		this.options = options;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	// 行为也可以是抽象的   定义名称 参数等  但不要详细的说明内容
	public abstract boolean check(char[] customerChoice) ;

}
