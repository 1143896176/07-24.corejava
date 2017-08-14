package 案例_选择题案例.handler;

import org.apache.commons.lang3.ArrayUtils;

import 案例_选择题案例.answer.Answer;
import 案例_选择题案例.answer.BlankAnswer;
import 案例_选择题案例.check.Check;
import 案例_选择题案例.constant.Constant;
import 案例_选择题案例.question.BlankQuestion;
import 案例_选择题案例.question.Question;

public class BlankQuestionHandler implements Check {

	@Override
	public int check(Question question, Answer answer) {
		
		BlankQuestion blankQuestion = (BlankQuestion)question;
		BlankAnswer blankAnswer = (BlankAnswer)answer;
		
		int score = 0;
		
		if(blankAnswer.getContents()!=null && blankAnswer.getContents().length > 0 ) {
			for (int i = 0; i < blankAnswer.getContents().length; i++) {
				if( ArrayUtils.contains(blankQuestion.getAnswer(),  blankAnswer.getContents()[i]) ) {
					score += Constant.BLANK_SCORE;
				}
			}
		}
		

		return score;
	}

}
