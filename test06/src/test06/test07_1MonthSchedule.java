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
			System.out.println("�����ϴ�.");
		}else {
			System.out.println(num+"���� �� ���� "+work+"�Դϴ�.");
		}
	}
	public void input() {
		System.out.print("����(��ĭ�����Է�)?");
		work = sc.next();
	}
}
