import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �߽ɰ� ������ �Է�>>");//���� �߽��� ���� ��ǥ�� ������ ���ϴ� x,y��
		int z = sc.nextInt();//��ǥ z
		int y = sc.nextInt();//��ǥ y
		double zirm = sc.nextDouble();//������ ��ǥ���� ������
		System.out.print("�� �Է�>>");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if((z-a)*(z-a)+(y-b)*(y-b)<=zirm*zirm) {//z-a �� y-b�� ���� �߽ɰ� ���� ���� ��ǥ���� �Ÿ�
			System.out.println("�� ("+a+","+b+")�� �� �ȿ� �ִ�.");
		}else {
			System.out.println("�� �ۿ� �ֽ��ϴ�.");
		}
	}

}
