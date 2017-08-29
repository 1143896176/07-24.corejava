package chat;

public class StartClient {

	public static void main(String[] args) {
		new ChatClient("localhost", 8888).start();
	}

}
