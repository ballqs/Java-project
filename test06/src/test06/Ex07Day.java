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
			System.out.println("�����ϴ�.");
		}else {
			System.out.println(work+"�Դϴ�.");
		}
	}
	public void run(){
		while(true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
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
				System.out.println("���� ��ȣ�Դϴ�.");
			}
		}
	}
	public void view() {
		System.out.print("��¥(1~30)?");
		n = sc.nextInt();
		if(worknum[n] == null) {
			System.out.println("�����ϴ�.");
		}else {
			System.out.println(n+"���� �� ���� "+work+"�Դϴ�.");
		}
	}
	public void input() {
		System.out.print("��¥(1~30)?");
		n = sc.nextInt();
		System.out.print("����(��ĭ�����Է�)?");
		work = sc.next();
		this.worknum[n] = work;
	}
	public void finish() {
		System.out.println("�����ϰڽ��ϴ�.");
	}
}
