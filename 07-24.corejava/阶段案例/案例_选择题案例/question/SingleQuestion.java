package ����_ѡ���ⰸ��.question;

import ����_ѡ���ⰸ��.question.support.Option;

public class SingleQuestion extends ChoiceQuestion {
	
	public char answer; //��ȷ��
	
	public SingleQuestion(String title , Option[] options  , char answer) {
		
		super(title , options);
		this.answer = answer;
		
	}

	public char getAnswer() {
		return answer;
	}

	public void setAnswer(char answer) {
		this.answer = answer;
	}


	
	
	
	

}
