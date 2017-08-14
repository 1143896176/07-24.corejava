package 案例_选择题案例.question;

import 案例_选择题案例.question.support.Option;

public class SingleQuestion extends ChoiceQuestion {
	
	public char answer; //正确答案
	
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
