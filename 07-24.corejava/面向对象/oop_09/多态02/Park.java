package oop_09.��̬02;

public class Park {

	public void doPark(Vehicle v) {

		if (v.getType() == 0) {
			System.out.println("���� С���� , ÿСʱ 2 Ԫ");
		} else if (v.getType() == 1) {
			System.out.println("���� ������ , ÿСʱ 20 Ԫ");
		} else if (v.getType() == 3) {
			System.out.println("���� ������ , �Ͻ���ȥ.........");
		}

	}

}
