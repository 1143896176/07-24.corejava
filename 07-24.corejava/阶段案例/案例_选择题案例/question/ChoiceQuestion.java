package ����_ѡ���ⰸ��.question;

import ����_ѡ���ⰸ��.question.support.Option;

//JavaBean
public abstract class ChoiceQuestion extends Question{

	
	protected Option[] options;
	protected int type; // ������ û�õ� type , 0 = ��ѡ , 1 = ��ѡ

	public ChoiceQuestion(String title, Option[] options, int type) {
		super(title);
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

	// ��ΪҲ�����ǳ����   �������� ������  ����Ҫ��ϸ��˵������
	public abstract boolean check(char[] customerChoice) ;

}
