import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int i = sc.nextInt();
		if(i < 10 || i > 99) {
			System.out.println("10~99�� �Է����ּ���!");
			return;
		}
		int z = i > 9 ? i/10 : 0;//10�� �ڸ���
		int y = i > 9 ? i%10 : 0;//1�� �ڸ���
		if(z == y) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}else {
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
		}

	}

}
