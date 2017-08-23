package ����ģʽ.singleton;

public class Recycle2 {

	//����ʽ
	private static Recycle2 recycle ;

	private Recycle2() {
			
		}

	public static Recycle2 getInstance() {
		if(recycle == null) {
			recycle = new Recycle2();
		}
		return recycle;
	}

}
