package chat������;

import java.net.*;

public class ServerExample4 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(9002);
			System.out.println("wait");
			while(true) {
				Socket socket = serverSocket.accept();//serverSocket�� 9002���� ���Ͽ� ��´�.
				Thread thread = new PerClinetThread(socket);//�׸��� Thread�� ����
				thread.start();
				System.out.println("conn!");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
