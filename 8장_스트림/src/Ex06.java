
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
			System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
			System.out.print("ù��° ���� ���� �Է��ϼ���. >>");
			filename1 = sc.next();
			fin = new FileInputStream("C:\\Users\\it\\Desktop\\"+filename1+".txt");
			in = new InputStreamReader(fin);
			int c;
			while((c=in.read())!=-1) {
				str = str + Character.toString((char)c);
			}
			System.out.print("�ι�° ���� ���� �Է��ϼ���. >>");
			filename2 = sc.next();
			fin = new FileInputStream("C:\\Users\\it\\Desktop\\"+filename2+".txt");
			in = new InputStreamReader(fin);
			while((c=in.read())!=-1) {
				str2 = str2 + Character.toString((char)c);
			}
			
			str3 = str + str2;
			fout = new FileWriter("C:\\Users\\it\\Desktop\\����.txt");
			fout.write(str3,0,str3.length());
			
			System.out.println("C:\\Users\\it\\Desktop\\����.txt �� ����Ǿ����ϴ�.");
			
			fout.close();
			in.close();
			fin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
