package test;

import java.util.Scanner;

class concert_2{
	Scanner sc = new Scanner(System.in);
	String name;
	int num;
	String S[] = {"---","---","---","---","---","---","---","---","---","---"};
	String A[] = {"---","---","---","---","---","---","---","---","---","---"};
	String B[] = {"---","---","---","---","---","---","---","---","---","---"};
	
	public String SetName(String name) {
		this.name = name;
		return name;
	}
	public int SetNum(int num) {
		this.num = num;
		return num;
	}
	void S() {
		S[num-1] = name;
	}
	public void Scancel() {
		System.out.print("S>>");
		for(int i=0; i<S.length; i++) {
			if(S[i].equals(name)) {
				S[i]="---";
			}else if(!S[i].equals(name) && i==S.length) {
				break;
			}
		}
	}
	void A() {
		A[num-1] = name;
	}
	public void Acancel() {
		System.out.print("A>>");
		for(int i=0; i<A.length; i++) {
			if(A[i].equals(name)) {
				A[i]="---";
			}else if(!A[i].equals(name) && i==A.length) {
				break;
			}
		}
	}
	void B() {
		B[num-1] = name;
	}
	public void Bcancel() {
		System.out.print("B>>");
		for(int i=0; i<B.length; i++) {
			if(B[i].equals(name)) {
				B[i]="---";
			}else if(!B[i].equals(name) && i==B.length) {
				break;
			}
		}
	}
}
class test extends concert_2{
	void reservation() {
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int num = sc.nextInt();
		if(num==1) {
			System.out.print("S>>");
			for(int i=0; i<S.length; i++) {
				System.out.print(S[i]+" ");
			}
			System.out.println();
			System.out.print("이름>>");
			SetName(sc.next());
			System.out.print("번호>>");
			SetNum(sc.nextInt());
			S();
		}else if(num==2) {
			System.out.print("A>>");
			for(int i=0; i<A.length; i++) {
				System.out.print(A[i]+" ");
			}
			System.out.println();
			System.out.print("이름>>");
			SetName(sc.next());
			System.out.print("번호>>");
			SetNum(sc.nextInt());
			A();
		}else if(num==3) {
			System.out.print("B>>");
			for(int i=0; i<B.length; i++) {
				System.out.print(B[i]+" ");
			}
			System.out.println();
			System.out.print("이름>>");
			SetName(sc.next());
			System.out.print("번호>>");
			SetNum(sc.nextInt());
			B();
		}
	}
	void lookup(){
		System.out.print("S>> ");
		for(int i=0; i<S.length; i++) {
			System.out.print(S[i]+" ");
		}
		System.out.println();
		System.out.print("A>> ");
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println();
		System.out.print("B>> ");
		for(int i=0; i<B.length; i++) {
			System.out.print(B[i]+" ");
		}
		System.out.println();
		System.out.println("<<조회를 완료했습니다.>>");
	}
	void cancel(){
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		num = sc.nextInt();
		if(num==1) {
			for(int i=0; i<S.length; i++) {
				System.out.print(S[i]+" ");
			}
			System.out.println();
			System.out.print("이름>>");
			SetName(sc.next());
			Scancel();
		}else if(num==2) {
			for(int i=0; i<A.length; i++) {
				System.out.print(A[i]+" ");
			}
			System.out.println();
			System.out.print("이름>>");
			SetName(sc.next());
			Acancel();
		}else if(num==3) {
			for(int i=0; i<B.length; i++) {
				System.out.print(B[i]+" ");
			}
			System.out.println();
			System.out.print("이름>>");
			SetName(sc.next());
			Bcancel();
		}
	}
}


class test05_22 extends test{
	Scanner sc = new Scanner(System.in);
	int num;
	test05_22() {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			num = sc.nextInt();
			switch (num) {
			case 1:
				reservation();
				break;
			case 2:
				lookup();
				break;
			case 3:
				cancel();
				break;
			case 4:
				System.out.println("프로그램을 종료하겠습니다.");
				return;
			default:
				System.out.println("그런 선택지는 없습니다.");
				continue;
			}
		}
	}
}

public class test05_2 {
	public static void main(String[] args) {
		new test05_22();
	}
}
