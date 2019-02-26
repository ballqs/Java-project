import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex07 {

	public static void main(String[] args) {
		File src = new File("C:\\Users\\it\\Desktop\\a.png");//복사할 이미지 경로
		File dest = new File("C:\\Users\\it\\Desktop\\이미지.png");//저장할 경로
		
		int c;
		
		try {
			BufferedInputStream fi = new BufferedInputStream(new FileInputStream(src));
			BufferedOutputStream fo = new BufferedOutputStream(new FileOutputStream(dest));
			System.out.println("a.png를 이미지.png로 복사합니다. \n10%마다 *를 출력합니다.");
			long tenPercent = src.length() / 10; //파일 길이를 10분의 1로 나눔
			// tenPercent는 파일의 값의 10분의 1 기준값
			long progress = 0; // 파일 크기 10% 될 때까지 읽은 누적 바이트 수
			byte[] buf = new byte[1024]; //한 번 읽는 단위
			int numRead = 0; // 읽은 바이트 수
			while(true) {
				/*(c = fi.read()) != -1*/
				numRead = fi.read(buf,0,buf.length);
				//buf가 0에서 buf의 끝인 1024까지 읽을때
				if(numRead == -1) {
					if(progress > 0) {
						// 지난번에 읽었지만 10%에 도달하지 않아 *가 출력되지 않은 경우
						// 즉 마지막 경우?
						System.out.print("*");
					}
					break; // 파일 끝에 도달함
				}
				if(numRead > 0) {
					fo.write(buf,0,numRead);
				}
				progress += numRead; // 파일 크기 10% 될 때까지 읽은 누적
				if(progress >= tenPercent) {
					// progress가 tenPercent를 넘을때 10%에 도달한게 되버리니까
					// *를 하나 출력!
					System.out.print("*");
					progress = 0;
					// 그리고 progress를 0으로 값을 초기화
				}
//				fo.write((byte)c);
			}
			fi.close();
			fo.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
