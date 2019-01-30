package test06;

import java.util.Scanner;


public class test08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String tel;
		System.out.print("인원수>>");
		int num = sc.nextInt();
		test08_1Phone t[] = new test08_1Phone[num];
		for(int i=0; i<t.length; i++) {
			t[i] = new test08_1Phone();
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			name = sc.next();
			t[i].setName(name);
			tel = sc.next();
			t[i].setTel(tel);
		}
		System.out.println("저장되었습니다...");
		while(true) {
			System.out.print("검색할 이름>>");
			name = sc.next();
			if(name.equals("그만")) {
				System.out.println("프로그램을 종료하겠습니다.");
				return;
			}else {
				for(int i = 0; true; i++) {
					if(t[i].getName().equals(name)) {
						System.out.println(name+"의 번호는 "+t[i].getTel()+" 입니다.");
						break;
					}else if(!t[i].getName().equals(name) && i == t.length-1) {
						System.out.println(name+" 이 없습니다.");
						break;
					}
				}
			}
		}
	}

}
