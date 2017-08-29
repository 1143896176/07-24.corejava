package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

	private int port;
	private String host;

	public ChatClient(String host, int port) {
		this.host = host;
		this.port = port;
	}

	public void start() {

		Socket socket;

		try {
			socket = new Socket(host, port);

			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());

			Scanner s = new Scanner(System.in);

			while (true) {
				
				String send = s.nextLine();
				out.writeUTF(send);
				
				String receive = in.readUTF();
				System.out.println(receive);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
