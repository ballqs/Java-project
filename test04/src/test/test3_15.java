package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test3_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		while(true) {
			try {
				System.out.print("���ϰ��� �ϴ� �� �� �Է�(0�Է½� ���α׷� ����)>>");
				n = sc.nextInt();
				m = sc.nextInt();
				if(n==0 || m==0) {
					System.out.println("�����մϴ�.");
					break;
				}
				System.out.println(n+"x"+m+"="+n*m);
			}catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("Error! ������ �Է��ϼ���.");
				continue;
			}
		}
	}

}
