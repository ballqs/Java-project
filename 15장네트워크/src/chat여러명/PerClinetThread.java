package chat여러명;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerClinetThread extends Thread{
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
	//가변적인 길이를 가지고 있는게 list
	//Collections 클래스는 여러 유용한 알고리즘을 구현한 메소드들을 제공한다.
	//synchronizedList : 상호배제 겹치는거 안됨
	Socket socket;//소켓
	PrintWriter writer;//print(); 같은거 사용할수 있게 해주는 것
	PerClinetThread(Socket socket){
		this.socket = socket;//소켓에 포트 값을 받아온다.
		try {
			writer = new PrintWriter(socket.getOutputStream());//9002의 값에 받아온 output의 값을 writer에 저장
			list.add(writer);
		}catch(Exception e) {
			System.out.println(e.getMessage());// <---PrintStream
		}
	}
	public void run() {
		String name = null;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//받은 정보
			name = reader.readLine();//받은 정보를 읽어들여 name에 저장
			sendAll("#"+name+"님이 들어오셨습니다");
			while(true) {
				String str = reader.readLine();//읽어드린 값이 없을때 break;
				if(str == null) {
					break;
				}
				sendAll(name+">"+str);//읽어드린 값이 있다면 sendAll로 이동
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			list.remove(writer);//list에 들어있는 값 지우기
			sendAll("#"+name+"님이 나가셨습니다.");
			try {
				socket.close();//소켓 닫기
			}catch(Exception Ignored) {
				
			}
		}
	}
	private void sendAll(String str) {
		for(PrintWriter writer : list) {
			writer.println(str);
			writer.flush();//writer에 있는 모든 문자열 전송
			//파일에 쓰는 경우 이걸 써야 파일 쓰기가 가능?
		}
	}
}
