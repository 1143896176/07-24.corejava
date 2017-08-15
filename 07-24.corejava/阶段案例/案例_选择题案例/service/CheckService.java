package 案例_选择题案例.service;

import 案例_选择题案例.answer.Answer;
import 案例_选择题案例.constant.Constant;
import 案例_选择题案例.handler.BlankQuestionHandler;
import 案例_选择题案例.handler.ChoiceQuestionHandler;
import 案例_选择题案例.question.BlankQuestion;
import 案例_选择题案例.question.ChoiceQuestion;
import 案例_选择题案例.question.Question;

public class CheckService {

	//在判卷之初    必须有卷子  、 答案  、 判卷的组件  .
	
	private Question[] questions;
	private Answer[] answers;
	
	private ChoiceQuestionHandler choiceHandler = new ChoiceQuestionHandler();   //组合
	private BlankQuestionHandler blankHandler = new BlankQuestionHandler();  //组合
	
	private int score;  //总分  . 

	public CheckService(Question[] questions , Answer[] answers) { //组合 
		this.questions = questions;
		this.answers = answers;
	}
	
	public int getScore() {  // 只能获取成绩 , 外界不能赋值 . 
		return score;
	}
	
	//判卷子
	public int mark() {

		for (int i = 0; i < questions.length; i++) {
			//每道题的答案
			int each = 0 ;
			
			if( questions[i] instanceof ChoiceQuestion ) {
				each = choiceHandler.check(questions[i], answers[i]); //调用 选择题的 handler 判卷 , 并返回成绩
			} else if( questions[i] instanceof BlankQuestion ) {
				
				each = blankHandler.check(questions[i], answers[i]);  //调用 填空题的 handler 判卷 , 并返回成绩
				//如果填空题 是部分答对 , 也要进行提示输出
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
