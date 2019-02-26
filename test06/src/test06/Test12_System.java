package test06;

import java.util.Scanner;

public class Test12_System {
	Scanner sc = new Scanner(System.in);
	private int num,num2;
	private String name;
	private String Rank[] = {"S","A","B"};
	Test12_Seat Seat[] = new Test12_Seat[3];
	public void run() {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		for(int i=0; i<Seat.length; i++) {
			Seat[i] = new Test12_Seat(10);
		}
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			num = sc.nextInt();
			switch(num) {
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
					finish();
					return;
				default :
					System.out.println("없는 번호입니다.");
					break;
			}
		}
	}
	public void reservation() {//예약
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		num = sc.nextInt();
		switch(num) {
			case 1:
				subsystem();
				break;
			case 2:
				subsystem();
				break;
			case 3:
				subsystem();
				break;
			default:
				System.out.println("없는 좌석입니다.");
				break;
		}
	}
	public void lookup() {//조회
		for(int i=0; i<Seat.length; i++) {
			Seat[i].VIEW(Rank[i]);
		}
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	public void cancel() {//취소
		System.out.print("좌석 S:1, A:2, B:3>>");
		num = sc.nextInt();
		switch(num) {
		case 1:
			cancelSubsystem();
			break;
		case 2:
			cancelSubsystem();
			break;
		case 3:
			cancelSubsystem();
			break;
		default:
			System.out.println("없는 좌석입니다.");
			break;
	}
	}
	public void finish() {//끝내기
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
	public void subsystem() {//예약 안의 시스템
		System.out.print("이름>>");
		name = sc.next();
		System.out.print("번호>>");
		num2 = sc.nextInt();
		Seat[num-1].setName(name);
		Seat[num-1].SeatReservation(num2-1);
	}
	public void cancelSubsystem() {
		num--;
		Seat[num].VIEW(Rank[num]);
		System.out.print("이름>>");
		name = sc.next();
		Seat[num].SeatCancel(name);
	}
}
