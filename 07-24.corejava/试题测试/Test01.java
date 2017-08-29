public class Test01 {
	String a = new String("aa");

	public static void main(String[] args) {
		Test01 t = new Test01();
		t.change(t.a);
		System.out.println(t.a);
	}

	public void change(String a) {
		a = "bb";
	}

}
