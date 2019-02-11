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
		System.out.print("할일(빈칸없이입력)?");
		String work = sc.next();
		return work;
	}
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램.");
		for(int i=0; i<Day.length; i++) {
			Day[i] = new test07_2Day();
		}
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.print("날짜(1~30)?");
				num = sc.nextInt();
				work = input(Day[num]);
				Day[num].set(work);
				break;
			case 2:
				System.out.print("날짜(1~30)?");
				num = sc.nextInt();
				view(Day[num]);
				break;
			case 3:
				finish();
				return;
			default:
				System.out.println("잘못된 번호입니다.");
				break;
			}
		}
	}
}
