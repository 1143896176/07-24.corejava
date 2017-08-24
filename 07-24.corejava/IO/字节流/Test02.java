package ×Ö½ÚÁ÷;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test02 {

	public static void main(String[] args) throws Exception {
		File from = new File("io.txt");
		File to = new File("io2.txt");
		
		InputStream in = new FileInputStream(from);
		OutputStream out = new FileOutputStream(to);
		
		byte[] datas = new byte[in.available()];
		
		in.read(datas);
		
		String str = new String(datas , "utf-8");
		
		out.write(str.getBytes());
		to.createNewFile();
		
	}

}
