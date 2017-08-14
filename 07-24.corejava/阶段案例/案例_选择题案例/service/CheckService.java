package 案例_选择题案例.service;

import 案例_选择题案例.answer.Answer;
import 案例_选择题案例.constant.Constant;
import 案例_选择题案例.handler.BlankQuestionHandler;
import 案例_选择题案例.handler.ChoiceQuestionHandler;
import 案例_选择题案例.question.BlankQuestion;
import 案例_选择题案例.question.ChoiceQuestion;
import 案例_选择题案例.question.Question;

public class CheckService {

	private Question[] questions;
	private Answer[] answers;
	
	private ChoiceQuestionHandler choiceHandler = new ChoiceQuestionHandler();
	private BlankQuestionHandler blankHandler = new BlankQuestionHandler();
	
	private int score;

	public CheckService(Question[] questions , Answer[] answers) {
		this.questions = questions;
		this.answers = answers;
	}
	
	public int getScore() {  // 只能获取成绩 , 外界不能赋值 . 
		return score;
	}
	
	public int mark() {

		for (int i = 0; i < questions.length; i++) {
			
			int each = 0 ;
			
			if( questions[i] instanceof ChoiceQuestion ) {
				each = choiceHandler.check(questions[i], answers[i]);
			} else if( questions[i] instanceof BlankQuestion ) {
				
				each = blankHandler.check(questions[i], answers[i]);
				if(each>0 && each < ((BlankQuestion)questions[i]).getAnswer().length * Constant.BLANK_SCORE) {
					score += each;
					
					System.out.println("题 "+(i+1)+" 回答不完全正确  , 此题得 " + each +" 分 . ");
					continue;
				}
			}
			
			if(each!=0) {
				score += each;
				
				System.out.println("题 "+(i+1)+" 回答正确  , 此题得 " + each +" 分 . ");
				
			} else {
				System.out.println("题 "+(i+1)+" 回答错误 ");
			}
			
		}
		
		return score;
	}

}
