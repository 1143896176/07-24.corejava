package 结构模式.门面模式;

public class Client {

	public static void main(String[] args) {
		
		SecurityFacade facade = new SecurityFacade();
		facade.init();

	}

}
