package test06;

import java.util.Scanner;

public class test02 {
//�� java���ϴ� class�� public 1���� �־���Ѵ�.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		test02_1Grade me = new test02_1Grade(math, science, english);
		System.out.println("��� : "+ me.average());
		
		sc.close();
	}

}
