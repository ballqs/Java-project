import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex01_Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			fout = new FileWriter("C:\\Users\\it\\Desktop\\연습.txt");
			System.out.println("전화번호 입력 프로그램입니다.");
			while(true) {
				System.out.print("이름 전화번호 >>");
				String line = sc.nextLine();
				if(line.equals("그만")) {
					break;
				}
				fout.write(line,0,line.length());
				fout.write("\r\n",0,2);
			}
			System.out.println("C:\\Users\\it\\Desktop\\연습.txt에 저장하였습니다.");
			fout.close();
			
			fin = new FileInputStream("C:\\Users\\it\\Desktop\\연습.txt");
			in =  new InputStreamReader(fin,"UTF-8");
			int c;
			
			System.out.println("C:\\Users\\it\\Desktop\\연습.txt를 출력합니다.");
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
