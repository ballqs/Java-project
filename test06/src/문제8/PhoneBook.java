package 문제8;

import java.util.Scanner;

public class PhoneBook {
	Phone phone_arr[];
	Scanner sc;
	
	public PhoneBook() {
		sc = new Scanner(System.in);
	}
	public void input() {
		System.out.print("인원수>>");
		int count = sc.nextInt();
		phone_arr = new Phone[count];
		for(int i=0; i<phone_arr.length; i++) {
			System.out.print("이름과 전화번호는 빈칸 없이 입력) >>");
			String name = sc.next();
			String tel = sc.next();
			phone_arr[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
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
			System.out.print("검색할 이름>>");
			String name = sc.next();
			if(name.equals("그만")) {
				break;
			}
			String tel = search(name);
			if(tel == null) {
				System.out.println(name+"이 없습니다.");
			}else if(tel != null) {
				System.out.println(name+"의 번호는 "+tel+" 입니다.");
			}
		}
	}
}
