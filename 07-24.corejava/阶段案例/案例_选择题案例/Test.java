package ����_ѡ���ⰸ��;

import ����_ѡ���ⰸ��.answer.Answer;
import ����_ѡ���ⰸ��.answer.ChoiceAnswer;
import ����_ѡ���ⰸ��.question.ChoiceQuestion;
import ����_ѡ���ⰸ��.question.MultiQuestion;
import ����_ѡ���ⰸ��.question.SingleQuestion;
import ����_ѡ���ⰸ��.question.support.Option;

public class Test {

	public static void main(String[] args) {

		// ����һ����ѡ��
		//���
		String t1 = "����˵���������? ";
		//��ѡ����ĸ�ѡ��
		Option so1 = new Option('A', "==�����ڻ����������ݵıȽ�");
		Option so2 = new Option('B', "equals()  ���������� �������ݵıȽ�");
		Option so3 = new Option('C', "intanseOf �������ж϶��������");
		Option so4 = new Option('D', "String �ǻ�����������");
		Option[] sOptions = { so1, so2, so3, so4 };
		//����  �������ȷ���� D
		char singleAnswer = 'D';

		ChoiceQuestion s1 = new SingleQuestion(t1, sOptions , 0, singleAnswer);
		
		////////////////////////////////////////////	//��һ��  �������

		String t2 = "���� ���� ����˵����ȷ����? ";

		Option mo1 = new Option('A', "ArrayList���������");
		Option mo2 = new Option('B', "comparable �ӿ��ṩ��������");
		Option mo3 = new Option('C', "iterator ����");
		Option mo4 = new Option('D', "Map�̳��� Collection ");
		Option[] mOptions = { mo1, mo2, mo3, mo4 };
		//��ȷ�𰸵����� 
		char[] multiAnswer = { 'A', 'B' };

		//��ѡ�⹹�����
		ChoiceQuestion m1 = new MultiQuestion(t2, mOptions , 1 , multiAnswer);

		/////////////// ��Ŀ
		ChoiceQuestion[] questions = { s1, m1 };

		///////////
		// ��
		Answer answer1 = new ChoiceAnswer(new char[] {'D'});
		Answer answer2 = new ChoiceAnswer(new char[] {'B' , 'A' , 'C'});
		Answer[] answers = {answer1 , answer2 };
		

		/////////////////////
		// ��ʾ��Ŀ
//		QuestionHandler handler = new QuestionHandler();
//		handler.showQuestion(questions);

		/////////////////////

//		System.out.println("�����");
//		handler.doChoiceCheck(questions, answers);

	}

}
