package basic;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	
	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(8888);
		
		System.out.println("�����������");
		
		Socket socket = server.accept();
		
		System.out.println("���˷���");
		
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
		
		byte[] data = new byte[1024];
		
		in.read(data);
		System.out.println("�ͻ���˵ : " + new String(data));
		
		
		
		out.write("���յ���".getBytes());
		
	}

}
