package 线程让步;

public class Test {

	public static void main(String[] args) {

		new MyThread("低级", 1).start();
		new MyThread("中级", 5).start();
		new MyThread("高级", 10).start(); 

	}

}
