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
			System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
			System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
			filename1 = sc.nextLine();
			System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
			filename2 = sc.nextLine();
			System.out.println(filename1+"�� "+filename2+"�� ���մϴ�.");
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
				System.out.print("������ �����ϴ�.");
			}else {
				System.out.println("�ٸ� �����Դϴ�.");
			}
			in1.close();
			in2.close();
			sc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
