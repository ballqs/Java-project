package test06;

import java.util.Scanner;


public class test07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("�̹��� ������ ���� ���α׷�.");
		test07_1MonthSchedule Day[] = new test07_1MonthSchedule[30];
		for(int i=0; i<Day.length; i++) {
			Day[i] = new test07_1MonthSchedule();
		}
		while(true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			num = sc.nextInt();
			switch (num) {
			case 1:
				//���⼭ ��¥�� ��� �����ϳ� ��� ��������...
				System.out.print("��¥(1~30)?");
				num = sc.nextInt();
				Day[num].input();
				break;
			case 2:
				System.out.print("��¥(1~30)?");
				num = sc.nextInt();
				Day[num].view(num);
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸��� ��ȣ�Դϴ�.");
				break;
			}
		}
	}

}
