import java.util.Scanner;

public class Test12_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����>>");
		int num1;
		int num2;
		String a;
		num1 = sc.nextInt();
		a = sc.next();
		num2 = sc.nextInt();
		int sum;
		double sum2;
		switch(a) {
			case "+":
				sum = num1 + num2;
				System.out.println(num1+a+num2+"�� ��� ����� "+sum);
				break;
			case "-":
				sum = num1 - num2;
				System.out.println(num1+a+num2+"�� ��� ����� "+sum);
				break;
			case "*":
				sum = num1 * num2;
				System.out.println(num1+a+num2+"�� ��� ����� "+sum);
				break;
			case "/":
				sum2 = (double)(num1 / num2);
				if(num1 != 0 && num2 != 0) {
					System.out.println(num1+a+num2+"�� ��� ����� "+sum2);
				}else {
					System.out.println("0���� ���� �� �����ϴ�.");
				}
				break;
			default :
				System.out.println("�׷��� ���� �Ӹ�...");
				break;
		}
		
	}

}
