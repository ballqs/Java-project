package ����7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MonthSchedule {
	Scanner sc = new Scanner(System.in);
	Day day[];
	int count_day;
	public MonthSchedule(int count_day) {
		this.count_day = count_day;
		day = new Day[count_day];
		for(int i=0; i<day.length; i++) {
			day[i] = new Day();
		}
	}
	public void run() {
		System.out.println("�̹��� ������ ���� ���α׷�");
		while(true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			try {
				count_day = sc.nextInt();
				switch(count_day) {
				case 1:
					input();
					break;
				case 2:
					view();
					break;
				case 3:
					finish();
					return;
				default:
					System.out.println("�߸��� ��ȣ�Դϴ�.");
					break;
				}
				
			}catch(InputMismatchException e) {
				System.out.println("�� �Է��Ѱž�? �ٽ� �Է���");
				sc = new Scanner(System.in);
			}
		}
	}
	public void input() {
		System.out.print("��¥(1~30)?");
		count_day =sc.nextInt() - 1;//Ư�� ��¥(�Է�)
		System.out.print("����(��ĭ�����Է�)?");
		String work = sc.next();//Ư�� ��¥�� �� ��
		day[count_day].set(work);
	}
	public void view() {
		System.out.print("��¥(1~30)?");
		count_day =sc.nextInt() - 1;//Ư�� ��¥(����)
		System.out.print((count_day+1)+"���� �� ���� ");
		day[count_day].show();
	}
	public void finish() {
		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
	}
}
