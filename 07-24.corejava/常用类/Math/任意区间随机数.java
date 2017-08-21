package Math;

public class 任意区间随机数 {

	public static void main(String[] args) {
		int min = 0; // from
		int max = 9; // to
		int result = min + (int) (Math.random() * ((max) + 1));
		System.out.println(result);
	}

}
