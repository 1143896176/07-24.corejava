package Url;

import java.io.DataInputStream;
import java.net.URL;
import java.net.URLConnection;

public class Test {

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://www.baidu.com");
		
		URLConnection conn = url.openConnection();
		
		DataInputStream in = new DataInputStream(conn.getInputStream());
		
		String data = null; 
		
		StringBuffer sbf = new StringBuffer();
		
		while( ( data = in.readLine() ) !=null ) {
			sbf.append(data);
		}
		
		System.out.println(sbf);

	}

}
