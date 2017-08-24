package 字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.commons.lang3.ArrayUtils;

public class Test01 {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("io.txt");
		
		InputStream in = new FileInputStream( file );
//		
//		int first = in.read();
//		System.out.println("first Element : " + first );
//		
//		System.out.println("in.available() : " + in.available());
		
//		System.out.println("连续读取--------------------------");
		
//		for (int i = 0; i <= in.available() + 1 ; i++) {
//			System.out.println(in.read() );
//		}
		
		
		//将读取结果 放入 byte[]
//		byte[] datas = new byte[in.available()];
//		in.read(datas);
		
//		System.out.println(ArrayUtils.toString(datas));
//		
		
//		String str = new String(datas , "utf-8");
//		System.out.println(str);
		
		
		//跳过多少  在读取
		in.skip(2);
		System.out.println(in.read());
		
	}

}
