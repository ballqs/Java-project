import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int i = sc.nextInt();
		if (i>=10 && i<100) {
			int first,second;
			first = i%10;//���� �ڸ�
			second = i/10;//���� �ڸ�
			if(first%3==0 || second%3==0) {
				if(first%3==0&&second%3==0) {
					System.out.println("�ڼ�¦¦");
				}else {
					System.out.println("�ڼ�¦");
				}
			}else {
				System.out.println("�Ѵ� �ȸ¾ƿ� ��_��");
			}
		}else {
			System.out.println("�� �� ����!");
			return;
		}
	}

}
