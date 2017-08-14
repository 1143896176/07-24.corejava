package 案例_选择题案例.question;

public class BlankQuestion extends Question {
	
	protected String[] answer;
	
	public BlankQuestion(String title , String... answer) {
		super(title);
		this.answer = answer;
	}

	public String[] getAnswer() {
		return answer;
	}

	public void setAnswer(String[] answer) {
		this.answer = answer;
	}
	
	

}
