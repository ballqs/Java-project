import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileInputStream in1,in2;
//		FileOutputStream out;
		String filename1,filename2,file1 = null,file2 = null;
		try {
			System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
			System.out.print("첫번째 파일 이름을 입력하세요>>");
			filename1 = sc.nextLine();
			System.out.print("두번째 파일 이름을 입력하세요>>");
			filename2 = sc.nextLine();
			System.out.println(filename1+"와 "+filename2+"를 비교합니다.");
			in1 = new FileInputStream("C:\\Users\\it\\Desktop\\"+filename1);
			in2 = new FileInputStream("C:\\Users\\it\\Desktop\\"+filename2);
			
			int c;
			while((c=in1.read()) != -1) {
				file1 = file1 + Character.toString((char)c);
			}
			int b;
			while((b=in2.read()) != -1) {
				file2 = file2 + Character.toString((char)b);
			}
			if(file1.equals(file2)) {
				System.out.print("파일이 같습니다.");
			}else {
				System.out.println("다른 파일입니다.");
			}
			in1.close();
			in2.close();
			sc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
