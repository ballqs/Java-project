import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		int Time;
		int second;
		int minute;
		int hour;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���");// ��,��,�ʷ� ��ȯ�� ���� �Է�
		
		Time = sc.nextInt();
		second = Time % 60;// 60���� ���� �������� �ʸ� �ǹ�
		minute = (Time / 60) % 60;// 60���� ���� ���� �ٽ� 60���� ���� �������� ���� �ǹ�
		hour = (Time / 60) / 60;// 60���� ���� ���� �ٽ� 60���� ���� ���� �ð��� �ǹ�
		
		System.out.print(Time + "�ʴ�");
		System.out.print(hour + "�ð�");
		System.out.print(minute + "�� ");
		System.out.println(second + "���Դϴ�.");

	}

}
