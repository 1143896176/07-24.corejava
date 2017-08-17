package 自定义异常;

public class AgeException extends Exception {
	
	public AgeException() {
		super("年龄输入有误");
	}

}
