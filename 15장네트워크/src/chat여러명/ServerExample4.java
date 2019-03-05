package chat여러명;

import java.net.*;

public class ServerExample4 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(9002);
			System.out.println("wait");
			while(true) {
				Socket socket = serverSocket.accept();//serverSocket의 9002값을 소켓에 담는다.
				Thread thread = new PerClinetThread(socket);//그리고 Thread에 적용
				thread.start();
				System.out.println("conn!");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
