package ����_ѡ���ⰸ��.handler;

import org.apache.commons.lang3.ArrayUtils;

import ����_ѡ���ⰸ��.answer.Answer;
import ����_ѡ���ⰸ��.answer.BlankAnswer;
import ����_ѡ���ⰸ��.check.Check;
import ����_ѡ���ⰸ��.constant.Constant;
import ����_ѡ���ⰸ��.question.BlankQuestion;
import ����_ѡ���ⰸ��.question.Question;

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
