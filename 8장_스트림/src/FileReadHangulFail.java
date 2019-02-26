import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileReadHangulFail {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\Users\\it\\Desktop\\SQL.txt");
			in = new InputStreamReader(fin,"US-ASCII");
			int c;
			
			System.out.println("인코딩 문자 집합은 "+in.getEncoding());
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
