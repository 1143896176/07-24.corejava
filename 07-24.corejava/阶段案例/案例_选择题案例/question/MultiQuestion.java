package 案例_选择题案例.question;

import org.apache.commons.lang3.ArrayUtils;

import 案例_选择题案例.question.support.Option;

public class MultiQuestion extends ChoiceQuestion {

	public char[] answer; // 正确答案


	public MultiQuestion(String title, Option[] options, int type, char[] answer) {
		super(title, options, type);
		this.answer = answer;
	}

	public char[] getAnswer() {
		return answer;
	}

	public void setAnswer(char[] answer) {
		this.answer = answer;
	}

	@Override
	public boolean check(char[] customerChoice) {
		boolean flag = true; //

		if (customerChoice != null && customerChoice.length == answer.length) { // 答案的个数和正确答案的个数 要匹配

			for (int i = 0; i < answer.length; i++) {//用每个正确答案去比较 用户选择的答案

				flag = ArrayUtils.contains(customerChoice, answer[i]); //一旦发现有一个错误 , flag 会 变成 false ; 

				if (!flag) break;
			}

		} else {
			flag = false;
		}

		return flag;
	}

}
