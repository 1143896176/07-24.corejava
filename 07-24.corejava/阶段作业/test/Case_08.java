package test;

public class Case_08 {
	public static void main(String[] args) {
		
		int s = 0;
		for (int x = 0; x <= 33; x++) {
			for (int y = 0; y <= 50; y++) {
				for (int z = 0; z <= 100; z++) {
					if (z % 2 == 0 && (x + y + z) == 100 && (x * 3 + y * 2 + z / 2) == 100) {
						s++;
						System.out.println("��" + s + "�ַ���" + x + "����" + y + "����" + z + "С��");
					}
				}
			}
		}
	}
}
