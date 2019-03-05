package chat1´ë1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread{
	Socket socket;
	SenderThread(Socket socket){
		this.socket = socket;
	}
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			while(true) {
				String str = reader.readLine();
				if(str.equals("bye")) {
					break;
				}
				writer.println(str);
				writer.flush();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();
			}catch(Exception Ignored) {
			}
		}
	}
}
