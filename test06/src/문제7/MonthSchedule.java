package 문제7;

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
		System.out.println("이번달 스케줄 관리 프로그램");
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
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
					System.out.println("잘못된 번호입니다.");
					break;
				}
				
			}catch(InputMismatchException e) {
				System.out.println("뭘 입력한거야? 다시 입력해");
				sc = new Scanner(System.in);
			}
		}
	}
	public void input() {
		System.out.print("날짜(1~30)?");
		count_day =sc.nextInt() - 1;//특정 날짜(입력)
		System.out.print("할일(빈칸없이입력)?");
		String work = sc.next();//특정 날짜에 할 일
		day[count_day].set(work);
	}
	public void view() {
		System.out.print("날짜(1~30)?");
		count_day =sc.nextInt() - 1;//특정 날짜(보기)
		System.out.print((count_day+1)+"일의 할 일은 ");
		day[count_day].show();
	}
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}
