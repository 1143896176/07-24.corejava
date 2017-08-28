package Ïß³Ì½áÊø;

public class Test01 {

	public static void main(String[] args) throws Exception {
		MyThread me = new MyThread();
		Thread t = new Thread(me);
		t.start();
		
		t.stop();
		
		
	}

}
