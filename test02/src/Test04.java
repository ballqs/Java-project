import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 3�� �Է�>>");
		int z = sc.nextInt();
		int y = sc.nextInt();
		int x = sc.nextInt();
		if(z > y) {
			if(z > x) {
				if(x > y) {
					System.out.println(x+"�� �߰� �����Դϴ�.");
				}else if(x < y){
					System.out.println(y+"�� �߰� �����Դϴ�.");
				}else if(x == y) {
					System.out.println(x+"�� �߰� �����Դϴ�.");
				}
			}else if(z < x){
				System.out.println(z+"�� �߰� �����Դϴ�.");
			}else if(x == z) {
				System.out.println(x+"�� �߰� �����Դϴ�.");
			}
		}else if(z < y){//y�� z���� ũ��.
			if(y > x) {
				if(z > x) {
					System.out.println(z+"�� �߰� �����Դϴ�.");
				}else if(z < x) {
					System.out.println(x+"�� �߰� �����Դϴ�.");
				}else if(x == z) {
					System.out.println(x+"�� �߰� �����Դϴ�.");
				}
			}else if(y < x){
				System.out.println(y+"�� �߰� �����Դϴ�.");
			}else if(y == x) {
				System.out.println(x+"�� �߰� �����Դϴ�.");
			}
		}else if(z == y) {
			System.out.println(z+"�� �߰� �����Դϴ�.");
		}
		double sum = (double)(z + y + x)/3;
		System.out.println("��� �� : "+sum);
	}

}
