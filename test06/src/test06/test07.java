package test06;

import java.util.Scanner;


public class test07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("이번달 스케쥴 관리 프로그램.");
		test07_1MonthSchedule Day[] = new test07_1MonthSchedule[30];
		for(int i=0; i<Day.length; i++) {
			Day[i] = new test07_1MonthSchedule();
		}
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			num = sc.nextInt();
			switch (num) {
			case 1:
				//여기서 날짜를 어떻게 지정하냐 라는 문제지만...
				System.out.print("날짜(1~30)?");
				num = sc.nextInt();
				Day[num].input();
				break;
			case 2:
				System.out.print("날짜(1~30)?");
				num = sc.nextInt();
				Day[num].view(num);
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 번호입니다.");
				break;
			}
		}
	}

}
