import java.io.IOException;
import java.io.InputStreamReader;

public class inputExample {

	public static void main(String[] args) {
		InputStreamReader rd = new InputStreamReader(System.in);
		//InputStreamReader는 바이트 스트림(2진수)을 캐릭터 스트림(int랑 같은거)으로 바꾸어주는 가교 역할을 하는 클래스
		//System.in을 통해 PC는 키보드로 데이터(글자)를 받아들이는 즉시 바이트로 변환한다.
				try{//예외 발생처리때 쓰는 명령어지만 try는 정상적으로 돌아가고 있으며 문제 발생시 catch로 간다.
						while(true) {//while가 true일때 반복문 실행
							int a = rd.read();//InputStreamReader가 읽은 바이트를 a에 저장
							if(a == -1)//a가 -1이 될때 이 반복문을 빠져나간다.
								break;//빠져나가는 명령어
							System.out.println((char)a);//저장한 a를 char타입으로 변환시켜 출력
						}
				}catch(IOException e) {//문제 발생시 여기로 온다.
					System.out.println("입력 에러 발생");//문제 발생하면 뜨는 출력글
				}

	}

}
