package ����_ѡ���ⰸ��.service;

import ����_ѡ���ⰸ��.answer.Answer;
import ����_ѡ���ⰸ��.constant.Constant;
import ����_ѡ���ⰸ��.handler.BlankQuestionHandler;
import ����_ѡ���ⰸ��.handler.ChoiceQuestionHandler;
import ����_ѡ���ⰸ��.question.BlankQuestion;
import ����_ѡ���ⰸ��.question.ChoiceQuestion;
import ����_ѡ���ⰸ��.question.Question;

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
	
	public int getScore() {  // ֻ�ܻ�ȡ�ɼ� , ��粻�ܸ�ֵ . 
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
					
					System.out.println("�� "+(i+1)+" �ش���ȫ��ȷ  , ����� " + each +" �� . ");
					continue;
				}
			}
			
			if(each!=0) {
				score += each;
				
				System.out.println("�� "+(i+1)+" �ش���ȷ  , ����� " + each +" �� . ");
				
			} else {
				System.out.println("�� "+(i+1)+" �ش���� ");
			}
			
		}
		
		return score;
	}

}
