package test06;

import java.util.Scanner;


public class test08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String tel;
		System.out.print("�ο���>>");
		int num = sc.nextInt();
		test08_1Phone t[] = new test08_1Phone[num];
		for(int i=0; i<t.length; i++) {
			t[i] = new test08_1Phone();
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			name = sc.next();
			t[i].setName(name);
			tel = sc.next();
			t[i].setTel(tel);
		}
		System.out.println("����Ǿ����ϴ�...");
		while(true) {
			System.out.print("�˻��� �̸�>>");
			name = sc.next();
			if(name.equals("�׸�")) {
				System.out.println("���α׷��� �����ϰڽ��ϴ�.");
				return;
			}else {
				for(int i = 0; true; i++) {
					if(t[i].getName().equals(name)) {
						System.out.println(name+"�� ��ȣ�� "+t[i].getTel()+" �Դϴ�.");
						break;
					}else if(!t[i].getName().equals(name) && i == t.length-1) {
						System.out.println(name+" �� �����ϴ�.");
						break;
					}
				}
			}
		}
	}

}
