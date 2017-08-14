package ����_ѡ���ⰸ��.question;

import ����_ѡ���ⰸ��.question.support.Option;

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
