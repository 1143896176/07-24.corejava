package 案例_选择题案例;

public class QuestionHandler {

	// 检查答案...
	public void doChoiceCheck(ChoiceQuestion[] questions, Answer[] answers) {

		System.out.println("测评结果为 : ");

		String result = "";

		for (int i = 0; i < questions.length; i++) {

			if (questions[i].check(answers[i].getChoice())) {  //答案是 Answer 类  , 内容在  此类的数组里 

				result = "题" + (i + 1) + " : √ ";
			} else {
				result = "题" + (i + 1) + " : × ";
			}

			System.out.println(result);
		}

	}

	// 显示题目..
	public void showQuestion(ChoiceQuestion[] questions) {

		if (questions != null && questions.length > 0) { // 不为空在循环 , 以防 空指针异常  NullPointException
			for (int i = 0; i < questions.length; i++) {

				System.out.println("题目 " + (i + 1) + " : " + questions[i].getTitle());
				for (Option option : questions[i].getOptions()) {
					System.out.println(option.getKey() + " . " + option.getText());
				}
				System.out.println("***************************");

			}
		}

	}

}
