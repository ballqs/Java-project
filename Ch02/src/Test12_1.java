import java.util.Scanner;

public class Test12_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����>>");
		int b = 10;
		int num1;
		int num2;
		String a;
		num1 = sc.nextInt();
		a = sc.next();
		num2 = sc.nextInt();
		int sum;
		double sum2;
		if(a.equals("+")) {
			sum = num1 + num2;
			System.out.println(num1+a+num2+"�� ��� ����� "+sum);
		}else if(a.equals("-")) {
			sum = num1 - num2;
			System.out.println(num1+a+num2+"�� ��� ����� "+sum);
		}else if(a.equals("*")) {
			sum = num1 * num2;
			System.out.println(num1+a+num2+"�� ��� ����� "+sum);
		}else if(a.equals("/")) {
			sum2 = (double)(num1 / num2);
			if(num1 != 0 && num2 != 0) {
				System.out.println(num1+a+num2+"�� ��� ����� "+sum2);
			}else {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
		}else {
			System.out.println("�׷��� ���� �Ӹ�...");
		}
	}

}
