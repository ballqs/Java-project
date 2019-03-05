package chat1대1;

import java.net.Socket;

public class ClientExample3 {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("###.###.###.###",9001);//원하는 아이피를 적으세요.
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			thread1.start();
			thread2.start();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
