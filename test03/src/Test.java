import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i % 2 == 0) {
			if(i % 3 == 0) {
				System.out.println("6�� ����Դϴ�.");
			}else {
				System.out.println("¦�������� 6�� ����� �ƴմϴ�.");
			}
		}else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}

}
