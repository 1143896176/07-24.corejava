package RandomAccess;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) {
		try {
			// create a new RandomAccessFile with filename test
			RandomAccessFile raf = new RandomAccessFile("io4.txt", "rw");

			// write something in the file
			raf.writeUTF("Hello World");

			// set the file pointer at 0 position
			raf.seek(0);

			// read and print the contents of the file
			System.out.println("" + raf.readUTF());

			// return the file descriptor of the stream
			System.out.println("" + raf.getFD());

			// close the strea and release resources
			raf.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
