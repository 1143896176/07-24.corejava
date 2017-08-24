package 字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test03 {
	public static void main(String[] args) throws Exception {
		File from = new File("考题案例.jpg");
		File to = new File("考题案例2.jpg");

		InputStream in = new FileInputStream(from);
		OutputStream out = new FileOutputStream(to);

		byte[] datas = new byte[in.available()];

		in.read(datas);

		out.write(datas);
		to.createNewFile();

	}
}
