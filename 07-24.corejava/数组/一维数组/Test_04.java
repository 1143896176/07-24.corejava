package һά����;

public class Test_04 {
	//���鿽��
	public static void main(String[] args) {
		
		
		int[] src = {1,2,3,4};
		
		int[] desc = {5,6,7,8};
		
		System.arraycopy(src, 1, desc, 1, 2);
		
		for (int i : desc) {
			System.out.println(i);
		}
		
 	}

}
