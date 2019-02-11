package test06;

import java.util.Scanner;

public class Ex07Day {
	Scanner sc = new Scanner(System.in);
	private String work;
	private int n;
	private String worknum[] = new String[n];
	public Ex07Day(int i) {
		this.n = i;
	}
	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
	}
	public void show() {
		if(work == null) {
			System.out.println("없습니다.");
		}else {
			System.out.println(work+"입니다.");
		}
	}
	public void run(){
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			n = sc.nextInt();
			switch (n) {
			case 1:
				input();
			case 2:
				view();
			case 3:
				finish();
				break;
				
			default:
				System.out.println("없는 번호입니다.");
			}
		}
	}
	public void view() {
		System.out.print("날짜(1~30)?");
		n = sc.nextInt();
		if(worknum[n] == null) {
			System.out.println("없습니다.");
		}else {
			System.out.println(n+"일의 할 일은 "+work+"입니다.");
		}
	}
	public void input() {
		System.out.print("날짜(1~30)?");
		n = sc.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		work = sc.next();
		this.worknum[n] = work;
	}
	public void finish() {
		System.out.println("종료하겠습니다.");
	}
}
