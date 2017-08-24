package Buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test02 {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream in = new FileInputStream("考题案例.jpg");
		BufferedInputStream bufferIn = new BufferedInputStream(in);
		
		FileOutputStream out = new FileOutputStream("考题案例3.jpg");
		BufferedOutputStream bufferOut = new BufferedOutputStream(out);

		
		int data ;
		long start = System.nanoTime();
		while(( data = bufferIn.read()) != - 1) {
//			System.out.println(data);
		}
		long end = System.nanoTime();
		long time = ( end - start ) / 1000000 ;
		
		System.out.println( time );
	}

}
