package ����_ѡ���ⰸ��.handler;

import ����_ѡ���ⰸ��.answer.Answer;
import ����_ѡ���ⰸ��.answer.ChoiceAnswer;
import ����_ѡ���ⰸ��.check.Check;
import ����_ѡ���ⰸ��.question.ChoiceQuestion;
import ����_ѡ���ⰸ��.question.Question;
import ����_ѡ���ⰸ��.question.support.Option;

public class ChoiceQuestionHandler implements Check{
	
	

	@Override
	public boolean doCheck(Question question, Answer answer) {
		
		return false;
	}

	// ����...
	public void doCheck(ChoiceQuestion[] questions, ChoiceAnswer[] answers) {

		System.out.println("�������Ϊ : ");

		String result = "";

		for (int i = 0; i < questions.length; i++) {

			if (questions[i].check(answers[i].getChoice())) {  //���� Answer ��  , ������  ����������� 

				result = "��" + (i + 1) + " : �� ";
			} else {
				result = "��" + (i + 1) + " : �� ";
			}

			System.out.println(result);
		}

	}

	// ��ʾ��Ŀ..
	public void showQuestion(ChoiceQuestion[] questions) {

		if (questions != null && questions.length > 0) { // ��Ϊ����ѭ�� , �Է� ��ָ���쳣  NullPointException
			for (int i = 0; i < questions.length; i++) {

				System.out.println("��Ŀ " + (i + 1) + " : " + questions[i].getTitle());
				for (Option option : questions[i].getOptions()) {
					System.out.println(option.getKey() + " . " + option.getText());
				}
				System.out.println("***************************");

			}
		}

	}


}
