package ����_ѡ���ⰸ��;

import ����_ѡ���ⰸ��.answer.Answer;
import ����_ѡ���ⰸ��.answer.BlankAnswer;
import ����_ѡ���ⰸ��.answer.ChoiceAnswer;
import ����_ѡ���ⰸ��.question.ChoiceQuestion;
import ����_ѡ���ⰸ��.question.BlankQuestion;
import ����_ѡ���ⰸ��.question.MultiQuestion;
import ����_ѡ���ⰸ��.question.Question;
import ����_ѡ���ⰸ��.question.SingleQuestion;
import ����_ѡ���ⰸ��.question.support.Option;
import ����_ѡ���ⰸ��.service.CheckService;
import ����_ѡ���ⰸ��.service.InvokeService;

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

		ChoiceQuestion s1 = new SingleQuestion(t1, sOptions , singleAnswer);
		
		////////////////////////////////////////////	//��һ��  �������

		String t2 = "���� ���� ����˵����ȷ����? ";

		Option mo1 = new Option('A', "ArrayList���������");
		Option mo2 = new Option('B', "comparable �ӿ��ṩ��������");
		Option mo3 = new Option('C', "iterator ����");
		Option mo4 = new Option('D', "Map�̳��� Collection ");
		Option[] mOptions = { mo1, mo2, mo3, mo4 };
		//��ȷ�𰸵����� 
		char[] multiAnswer = { 'A', 'B' };

		ChoiceQuestion m1 = new MultiQuestion(t2, mOptions , multiAnswer); //��ѡ�⹹�����
		
		//////////////////////////////
		
		//�����(1)
		String s3 = "�����ύ��_____ , ______ ���ַ�ʽ ? " ; 
		BlankQuestion b1 = new BlankQuestion(s3, "post" , "get");
		//�����(2)
		String s4 = "������������������_____ , _____ , ______ . " ; 
		BlankQuestion b2 = new BlankQuestion(s4, "��װ" , "�̳�" , "��̬");

		/////////////// ��Ŀ
		Question[] questions = { s1 , m1 , b1 , b2};

		///////////
		// ��
		Answer answer1 = new ChoiceAnswer(new char[] {'D'});
		Answer answer2 = new ChoiceAnswer(new char[] {'B' , 'A' });
		String[] contents1 = {"get" , "post"}; 
		String[] contents2 = {"��װ" , "�̳�" , "��̬" }; 
		Answer answer3 = new BlankAnswer(contents1);
		Answer answer4 = new BlankAnswer(contents2);
		
		Answer[] answers = {answer1 , answer2 , answer3 , answer4};
		

		//�Ծ��ʼ��
		InvokeService invoke = new InvokeService();
		invoke.init(questions);
		
		System.out.println(" \n��ʼ�о�\n  ");
		
		//�����о�� Service
		CheckService check = new CheckService(questions , answers);
		
		check.mark();
		
		System.out.println("�ܳɼ�Ϊ : " + check.getScore());
		

	}

}
