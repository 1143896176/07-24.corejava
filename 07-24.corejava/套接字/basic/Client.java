package basic;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket("127.0.0.1" , 8888);
		
		OutputStream out = socket.getOutputStream();
		InputStream in = socket.getInputStream();
		
		String msg = "hello";
		
		out.write(msg.getBytes());
		
		byte[] data = new byte[1024]; 
		in.read(data);
		String receive = new String(data);
		System.out.println("服务端跟我说 : " + receive);
		
	}

}
