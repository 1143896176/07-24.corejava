package basic;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	
	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(8888);
		
		System.out.println("服务端启动了");
		
		Socket socket = server.accept();
		
		System.out.println("有人访问");
		
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
		
		byte[] data = new byte[1024];
		
		in.read(data);
		System.out.println("客户端说 : " + new String(data));
		
		
		
		out.write("我收到了".getBytes());
		
	}

}
