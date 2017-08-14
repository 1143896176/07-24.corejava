package ����_ѡ���ⰸ��.service;

import ����_ѡ���ⰸ��.constant.Constant;
import ����_ѡ���ⰸ��.question.BlankQuestion;
import ����_ѡ���ⰸ��.question.ChoiceQuestion;
import ����_ѡ���ⰸ��.question.Question;
import ����_ѡ���ⰸ��.question.support.Option;

public class InvokeService {

	private Question[] questions;

	private int choiceAmount;
	private int blankAmount;
	private int blankItemAmount;

	public Question[] getQuestions() {
		return questions;
	}

	public void setQuestions(Question[] questions) {
		this.questions = questions;
	}

	public void init(Question[] questions) {
		
		setQuestions(questions);
		
		if (questions != null && questions.length > 0) {
			calcuTotalScore();
			showQuestions();
		}

	}

	public void calcuTotalScore() {
		for (int i = 0; i < questions.length; i++) {
			if(questions[i] instanceof ChoiceQuestion) {
				choiceAmount += 1;
			} else if(questions[i] instanceof BlankQuestion) {
				blankAmount +=1;
				BlankQuestion blankQuestion = (BlankQuestion) questions[i];
				blankItemAmount += blankQuestion.getAnswer().length ;
			}
		}
	
		System.out.println("ѡ���⹲ : "+ (choiceAmount) +"�� , ÿ�� : "+Constant.CHOICE_SCORE+"�� , �� " + (choiceAmount)*Constant.CHOICE_SCORE + " �� . ");
		
		System.out.println("����⹲ : " + (blankAmount) +"�� , ÿ�� : " + Constant.BLANK_SCORE + "�� , �� " + (blankItemAmount) * Constant.BLANK_SCORE + " �� . ");
		
		System.out.println("--------------------------------------------");
	}
	
	public void showQuestions() {
		for (int i = 0; i < questions.length; i++) {

			System.out.println("��Ŀ " + (i + 1) + " : " + questions[i].getTitle());
			if (questions[i] instanceof ChoiceQuestion) { // ѡ����
				ChoiceQuestion choice = (ChoiceQuestion) questions[i];
				for (Option option : choice.getOptions()) {
					System.out.println(option.getKey() + " . " + option.getText());
				}
				System.out.println("***************************");
			}

		}
	}

}
