import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x >= 100 && y >= 100) {
			if(x <= 200 && y <= 200) {
				System.out.println("("+x+","+y+")�� �簢�� �ȿ� �ֽ��ϴ�.");
			}else {
				System.out.println("�簢�� �ȿ� �����.");
			}
		}else {
			System.out.println("�簢�� �ȿ� �����.");
		}

	}

}
