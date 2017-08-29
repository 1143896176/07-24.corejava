package chat;

public class StartServer {

	public static void main(String[] args) {

		new ChatServer(8888).start();
		
	}

}
