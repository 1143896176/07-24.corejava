package 案例_选择题案例.question;

import 案例_选择题案例.question.support.Option;

//JavaBean
public abstract class ChoiceQuestion extends Question{

	
	protected Option[] options;

	public ChoiceQuestion(String title, Option[] options) {
		super(title);
		this.options = options;
	
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



}
