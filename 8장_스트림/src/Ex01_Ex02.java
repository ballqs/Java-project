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
			fout = new FileWriter("C:\\Users\\it\\Desktop\\����.txt");
			System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
			while(true) {
				System.out.print("�̸� ��ȭ��ȣ >>");
				String line = sc.nextLine();
				if(line.equals("�׸�")) {
					break;
				}
				fout.write(line,0,line.length());
				fout.write("\r\n",0,2);
			}
			System.out.println("C:\\Users\\it\\Desktop\\����.txt�� �����Ͽ����ϴ�.");
			fout.close();
			
			fin = new FileInputStream("C:\\Users\\it\\Desktop\\����.txt");
			in =  new InputStreamReader(fin,"UTF-8");
			int c;
			
			System.out.println("C:\\Users\\it\\Desktop\\����.txt�� ����մϴ�.");
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
