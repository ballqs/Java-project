package test06;

import java.util.Scanner;

public class test07_1MonthSchedule{
	Scanner sc = new Scanner(System.in);
	private String work;
	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
	}
	public void view(int num) {
		if(work==null) {
			System.out.println("없습니다.");
		}else {
			System.out.println(num+"일의 할 일은 "+work+"입니다.");
		}
	}
	public void input() {
		System.out.print("할일(빈칸없이입력)?");
		work = sc.next();
	}
}
