package ����8;

import java.util.Scanner;

public class PhoneBook {
	Phone phone_arr[];
	Scanner sc;
	
	public PhoneBook() {
		sc = new Scanner(System.in);
	}
	public void input() {
		System.out.print("�ο���>>");
		int count = sc.nextInt();
		phone_arr = new Phone[count];
		for(int i=0; i<phone_arr.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ�� ��ĭ ���� �Է�) >>");
			String name = sc.next();
			String tel = sc.next();
			phone_arr[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
	}
	public String search(String name) {
		for(int i=0; i<phone_arr.length; i++) {
			if(name.equals(phone_arr[i].getName())) {
				return phone_arr[i].getTel();
			}
		}
		return null;
	}
	public void run() {
		input();
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String name = sc.next();
			if(name.equals("�׸�")) {
				break;
			}
			String tel = search(name);
			if(tel == null) {
				System.out.println(name+"�� �����ϴ�.");
			}else if(tel != null) {
				System.out.println(name+"�� ��ȣ�� "+tel+" �Դϴ�.");
			}
		}
	}
}
