package chat������;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerClinetThread extends Thread{
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
	//�������� ���̸� ������ �ִ°� list
	//Collections Ŭ������ ���� ������ �˰����� ������ �޼ҵ���� �����Ѵ�.
	//synchronizedList : ��ȣ���� ��ġ�°� �ȵ�
	Socket socket;//����
	PrintWriter writer;//print(); ������ ����Ҽ� �ְ� ���ִ� ��
	PerClinetThread(Socket socket){
		this.socket = socket;//���Ͽ� ��Ʈ ���� �޾ƿ´�.
		try {
			writer = new PrintWriter(socket.getOutputStream());//9002�� ���� �޾ƿ� output�� ���� writer�� ����
			list.add(writer);
		}catch(Exception e) {
			System.out.println(e.getMessage());// <---PrintStream
		}
	}
	public void run() {
		String name = null;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//���� ����
			name = reader.readLine();//���� ������ �о�鿩 name�� ����
			sendAll("#"+name+"���� �����̽��ϴ�");
			while(true) {
				String str = reader.readLine();//�о�帰 ���� ������ break;
				if(str == null) {
					break;
				}
				sendAll(name+">"+str);//�о�帰 ���� �ִٸ� sendAll�� �̵�
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			list.remove(writer);//list�� ����ִ� �� �����
			sendAll("#"+name+"���� �����̽��ϴ�.");
			try {
				socket.close();//���� �ݱ�
			}catch(Exception Ignored) {
				
			}
		}
	}
	private void sendAll(String str) {
		for(PrintWriter writer : list) {
			writer.println(str);
			writer.flush();//writer�� �ִ� ��� ���ڿ� ����
			//���Ͽ� ���� ��� �̰� ��� ���� ���Ⱑ ����?
		}
	}
}
