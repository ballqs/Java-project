package test06;

import java.util.Scanner;

public class test07_1MonthSchedule{
	Scanner sc = new Scanner(System.in);
	private int num;
	private String work;
	test07_2Day Day[] = new test07_2Day[30];
	public void view(test07_2Day day) {
		day.show();
	}
	public String input(test07_2Day day) {
		System.out.print("����(��ĭ�����Է�)?");
		String work = sc.next();
		return work;
	}
	public void finish() {
		System.out.println("���α׷��� �����մϴ�.");
	}
	public void run() {
		System.out.println("�̹��� ������ ���� ���α׷�.");
		for(int i=0; i<Day.length; i++) {
			Day[i] = new test07_2Day();
		}
		while(true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.print("��¥(1~30)?");
				num = sc.nextInt();
				work = input(Day[num]);
				Day[num].set(work);
				break;
			case 2:
				System.out.print("��¥(1~30)?");
				num = sc.nextInt();
				view(Day[num]);
				break;
			case 3:
				finish();
				return;
			default:
				System.out.println("�߸��� ��ȣ�Դϴ�.");
				break;
			}
		}
	}
}
