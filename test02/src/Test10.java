import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");//���� �߽��� ���� ��ǥ�� ������ ���ϴ� x,y��
		int z1 = sc.nextInt();//��ǥ z
		int y1 = sc.nextInt();//��ǥ y
		double r1 = sc.nextDouble();//������ ��ǥ���� ������
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");//���� �߽��� ���� ��ǥ�� ������ ���ϴ� x,y��
		int z2 = sc.nextInt();//��ǥ z
		int y2 = sc.nextInt();//��ǥ y
		double r2 = sc.nextDouble();//������ ��ǥ���� ������
		if(Math.sqrt((z1-z2)*(z1-z2)+(y1-y2)*(y1-y2)) <= r1+r2) {
			System.out.println("�� ���� ���� ��ģ��.");
		}else {
			System.out.println("�� ���� ��ġ�� �ʴ´�.");
		}
	}

}
