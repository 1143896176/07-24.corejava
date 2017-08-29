package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

	private int port;

	public ChatServer(int port) {
		this.port = port;
	}

	public void start() {
		ServerSocket server = null;
		Socket socket;
		try {
			server = new ServerSocket(port);

			socket = server.accept();

			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());

			Scanner s = new Scanner(System.in);

			while (true) {

				String receive = in.readUTF();
				System.out.println(receive);

				String send = s.nextLine();
				out.writeUTF(send);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

	}

}
