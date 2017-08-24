package Buffered;

import java.io.FileInputStream;

public class Test01 {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream in = new FileInputStream("¿¼Ìâ°¸Àý.jpg");
		
		int data ;
		long start = System.nanoTime();
		while(( data = in.read()) != - 1) {
//			System.out.println(data);
		}
		long end = System.nanoTime();
		long time = ( end - start ) / 1000000 ;
		
		System.out.println( time );
	}

}
