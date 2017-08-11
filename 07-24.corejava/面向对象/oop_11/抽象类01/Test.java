package oop_11.³éÏóÀà01;

public class Test {

	public static void main(String[] args) {
		
		Vehicle v1 = new Car(0);
		Vehicle v2 = new Bus(1);

		
		Park p = new Park();
		p.doPark(v2);
		

	}

}
