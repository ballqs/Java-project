
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fout;
		
		InputStreamReader in;
		FileInputStream fin;
		
		String str = "",str2 = "",str3,filename1,filename2;
		try {
			System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
			System.out.print("첫번째 파일 명을 입력하세요. >>");
			filename1 = sc.next();
			fin = new FileInputStream("C:\\Users\\it\\Desktop\\"+filename1+".txt");
			in = new InputStreamReader(fin);
			int c;
			while((c=in.read())!=-1) {
				str = str + Character.toString((char)c);
			}
			System.out.print("두번째 파일 명을 입력하세요. >>");
			filename2 = sc.next();
			fin = new FileInputStream("C:\\Users\\it\\Desktop\\"+filename2+".txt");
			in = new InputStreamReader(fin);
			while((c=in.read())!=-1) {
				str2 = str2 + Character.toString((char)c);
			}
			
			str3 = str + str2;
			fout = new FileWriter("C:\\Users\\it\\Desktop\\문제.txt");
			fout.write(str3,0,str3.length());
			
			System.out.println("C:\\Users\\it\\Desktop\\문제.txt 로 저장되었습니다.");
			
			fout.close();
			in.close();
			fin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
