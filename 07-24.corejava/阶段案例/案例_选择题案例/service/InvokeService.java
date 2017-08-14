package 案例_选择题案例.service;

import 案例_选择题案例.constant.Constant;
import 案例_选择题案例.question.BlankQuestion;
import 案例_选择题案例.question.ChoiceQuestion;
import 案例_选择题案例.question.Question;
import 案例_选择题案例.question.support.Option;

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
	
		System.out.println("选择题共 : "+ (choiceAmount) +"道 , 每题 : "+Constant.CHOICE_SCORE+"分 , 共 " + (choiceAmount)*Constant.CHOICE_SCORE + " 分 . ");
		
		System.out.println("填空题共 : " + (blankAmount) +"道 , 每题 : " + Constant.BLANK_SCORE + "分 , 共 " + (blankItemAmount) * Constant.BLANK_SCORE + " 分 . ");
		
		System.out.println("--------------------------------------------");
	}
	
	public void showQuestions() {
		for (int i = 0; i < questions.length; i++) {

			System.out.println("题目 " + (i + 1) + " : " + questions[i].getTitle());
			if (questions[i] instanceof ChoiceQuestion) { // 选择题
				ChoiceQuestion choice = (ChoiceQuestion) questions[i];
				for (Option option : choice.getOptions()) {
					System.out.println(option.getKey() + " . " + option.getText());
				}
				System.out.println("***************************");
			}

		}
	}

}
