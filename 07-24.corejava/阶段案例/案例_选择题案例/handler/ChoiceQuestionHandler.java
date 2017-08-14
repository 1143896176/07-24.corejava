package ����_ѡ���ⰸ��.handler;

import org.apache.commons.lang3.ArrayUtils;

import ����_ѡ���ⰸ��.answer.Answer;
import ����_ѡ���ⰸ��.answer.ChoiceAnswer;
import ����_ѡ���ⰸ��.check.Check;
import ����_ѡ���ⰸ��.constant.Constant;
import ����_ѡ���ⰸ��.question.MultiQuestion;
import ����_ѡ���ⰸ��.question.Question;
import ����_ѡ���ⰸ��.question.SingleQuestion;

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
			
			
			if (choiceAnswer.getChoice() != null && choiceAnswer.getChoice().length == multi.getAnswer().length) { // �𰸵ĸ�������ȷ�𰸵ĸ��� Ҫƥ��

				for (int i = 0; i <  multi.getAnswer().length ; i++) {//��ÿ����ȷ��ȥ�Ƚ� �û�ѡ��Ĵ�

					flag = ArrayUtils.contains(choiceAnswer.getChoice(), multi.getAnswer()[i]); //һ��������һ������ , flag �� ��� false ; 

					if (!flag) break;
				}

			} 
		}
		
		if(flag) return Constant.CHOICE_SCORE;
		else return 0;
	}


}
