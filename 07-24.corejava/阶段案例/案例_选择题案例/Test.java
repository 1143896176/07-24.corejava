package 案例_选择题案例;

import 案例_选择题案例.answer.Answer;
import 案例_选择题案例.answer.ChoiceAnswer;
import 案例_选择题案例.question.ChoiceQuestion;
import 案例_选择题案例.question.MultiQuestion;
import 案例_选择题案例.question.SingleQuestion;
import 案例_选择题案例.question.support.Option;

public class Test {

	public static void main(String[] args) {

		// 构造一个单选题
		//题干
		String t1 = "以下说法错误的是? ";
		//单选题的四个选项
		Option so1 = new Option('A', "==可用于基本类型数据的比较");
		Option so2 = new Option('B', "equals()  可用于引用 类型数据的比较");
		Option so3 = new Option('C', "intanseOf 可用于判断对象的类型");
		Option so4 = new Option('D', "String 是基本数据类型");
		Option[] sOptions = { so1, so2, so3, so4 };
		//代表  此题的正确答案是 D
		char singleAnswer = 'D';

		ChoiceQuestion s1 = new SingleQuestion(t1, sOptions , 0, singleAnswer);
		
		////////////////////////////////////////////	//第一题  构造完成

		String t2 = "关于 集合 以下说法正确的是? ";

		Option mo1 = new Option('A', "ArrayList比数组好用");
		Option mo2 = new Option('B', "comparable 接口提供了排序功能");
		Option mo3 = new Option('C', "iterator 是类");
		Option mo4 = new Option('D', "Map继承自 Collection ");
		Option[] mOptions = { mo1, mo2, mo3, mo4 };
		//正确答案的数组 
		char[] multiAnswer = { 'A', 'B' };

		//多选题构造完毕
		ChoiceQuestion m1 = new MultiQuestion(t2, mOptions , 1 , multiAnswer);

		/////////////// 题目
		ChoiceQuestion[] questions = { s1, m1 };

		///////////
		// 答案
		Answer answer1 = new ChoiceAnswer(new char[] {'D'});
		Answer answer2 = new ChoiceAnswer(new char[] {'B' , 'A' , 'C'});
		Answer[] answers = {answer1 , answer2 };
		

		/////////////////////
		// 显示题目
//		QuestionHandler handler = new QuestionHandler();
//		handler.showQuestion(questions);

		/////////////////////

//		System.out.println("检测结果");
//		handler.doChoiceCheck(questions, answers);

	}

}
