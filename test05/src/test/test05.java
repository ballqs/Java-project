package test;

import java.util.Scanner;

class concert{
	Scanner sc = new Scanner(System.in);
	String Rating[] = new String[10];
	String name;
	int number;
	public concert() {
		for(int i=0; i<Rating.length; i++) {
			Rating[i] = "---";
		}
	}
	public String setname(String name) {
		this.name = name;
		return name;
	}
	public void setrating(int number) {
		Rating[number-1] = name;
		this.number = number;
	}
	public void cancel() {
		for(int i=0; i<Rating.length; i++) {
			if(Rating[i].equals(name)) {
				Rating[i]="---";
			}else if(!Rating[i].equals(name) && i==Rating.length) {
				break;
			}
		}
	}
}

public class test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		String name;
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		concert S = new concert();
		concert A = new concert();
		concert B = new concert();
		while(true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			do {
				num = sc.nextInt();
			}while(num<1||num>4);
			if(num==1) {
				System.out.print("�¼����� S(1), A(2), B(3)>>");
				num = sc.nextInt();
				if(num==1) {
					System.out.print("S>> ");
					for(int i=0; i<S.Rating.length; i++) {
						System.out.print(S.Rating[i]+" ");
					}
					System.out.println();
					System.out.print("�̸�>>");
					S.setname(sc.next());
					System.out.print("��ȣ>>");
					S.setrating(sc.nextInt());
					continue;
				}else if(num==2) {
					System.out.print("A>> ");
					for(int i=0; i<A.Rating.length; i++) {
						System.out.print(A.Rating[i]+" ");
					}
					System.out.println();
					System.out.print("�̸�>>");
					A.setname(sc.next());
					System.out.print("��ȣ>>");
					A.setrating(sc.nextInt());
					continue;
				}else if(num==3) {
					System.out.print("B>> ");
					for(int i=0; i<B.Rating.length; i++) {
						System.out.print(B.Rating[i]+" ");
					}
					System.out.println();
					System.out.print("�̸�>>");
					B.setname(sc.next());
					System.out.print("��ȣ>>");
					B.setrating(sc.nextInt());
					continue;
				}
			}else if(num==2) {
				System.out.print("S>> ");
				for(int i=0; i<S.Rating.length; i++) {
					System.out.print(S.Rating[i]+" ");
				}
				System.out.println();
				System.out.print("A>> ");
				for(int i=0; i<A.Rating.length; i++) {
					System.out.print(A.Rating[i]+" ");
				}
				System.out.println();
				System.out.print("B>> ");
				for(int i=0; i<B.Rating.length; i++) {
					System.out.print(B.Rating[i]+" ");
				}
				System.out.println();
				System.out.println("<<��ȸ�� �Ϸ��߽��ϴ�.>>");
			}else if(num==3) {
				System.out.print("�¼����� S(1), A(2), B(3)>>");
				num = sc.nextInt();
				if(num==1) {
					for(int i=0; i<S.Rating.length; i++) {
						System.out.print(S.Rating[i]+" ");
					}
					System.out.println();
					System.out.print("�̸�>>");
					S.setname(sc.next());
					S.cancel();
				}else if(num==2) {
					for(int i=0; i<A.Rating.length; i++) {
						System.out.print(A.Rating[i]+" ");
					}
					System.out.println();
					System.out.print("�̸�>>");
					A.setname(sc.next());
					A.cancel();
				}else if(num==3) {
					for(int i=0; i<B.Rating.length; i++) {
						System.out.print(B.Rating[i]+" ");
					}
					System.out.println();
					System.out.print("�̸�>>");
					B.setname(sc.next());
					B.cancel();
				}
			}else if(num==4) {
				System.out.println("���� ���񽺴� ��������Դϴ�.");
				break;
			}
		}
	}

}
