import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1,num2;
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿� �Է��ϼ���.");
		System.out.print("ö�� : ");
		num1 = sc.nextLine();
		System.out.print("���� : ");
		num2 = sc.nextLine();
		if(num1.equals("����")) {
			if(num2.equals("����")) {
				System.out.println("�����ϴ�.");
			}else if(num2.equals("��")) {
				System.out.println("ö���� �̰���ϴ�.");
			}else if(num2.equals("����")) {
				System.out.println("ö���� �����ϴ�.");
			}
		}else if(num1.equals("����")) {
			if(num2.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			}else if(num2.equals("��")) {
				System.out.println("ö���� �����ϴ�.");
			}else if(num2.equals("����")) {
				System.out.println("�����ϴ�.");
			}
		}else if(num1.equals("��")) {
			if(num2.equals("����")) {
				System.out.println("ö���� �����ϴ�.");
			}else if(num2.equals("��")) {
				System.out.println("�����ϴ�.");
			}else if(num2.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			}
		}

	}

}
