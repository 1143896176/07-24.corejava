package 案例_选择题案例.handler;

import org.apache.commons.lang3.ArrayUtils;

import 案例_选择题案例.answer.Answer;
import 案例_选择题案例.answer.ChoiceAnswer;
import 案例_选择题案例.check.Check;
import 案例_选择题案例.constant.Constant;
import 案例_选择题案例.question.MultiQuestion;
import 案例_选择题案例.question.Question;
import 案例_选择题案例.question.SingleQuestion;

public class ChoiceQuestionHandler implements Check {

	@Override
	public int check(Question question, Answer answer) {

		ChoiceAnswer choiceAnswer = (ChoiceAnswer) answer;

		boolean flag = false;

		if (question instanceof SingleQuestion) {
			SingleQuestion single = (SingleQuestion) question;
			flag = single.getAnswer() == choiceAnswer.getChoice()[0];

		} else if ( question instanceof MultiQuestion ) {
			MultiQuestion multi = (MultiQuestion) question;
			
			
			if (choiceAnswer.getChoice() != null && choiceAnswer.getChoice().length == multi.getAnswer().length) { // 答案的个数和正确答案的个数 要匹配

				for (int i = 0; i <  multi.getAnswer().length ; i++) {//用每个正确答案去比较 用户选择的答案

					flag = ArrayUtils.contains(choiceAnswer.getChoice(), multi.getAnswer()[i]); //一旦发现有一个错误 , flag 会 变成 false ; 

					if (!flag) break;
				}

			} 
		}
		
		if(flag) return Constant.CHOICE_SCORE;
		else return 0;
	}


}
