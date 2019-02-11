package test06;

import java.util.Scanner;

public class Test12_System {
	Scanner sc = new Scanner(System.in);
	private int num,num2;
	private String name;
	private String Rank[] = {"S","A","B"};
	Test12_Seat Seat[] = new Test12_Seat[3];
	public void run() {
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		for(int i=0; i<Seat.length; i++) {
			Seat[i] = new Test12_Seat(10);
		}
		while(true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
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
					System.out.println("���� ��ȣ�Դϴ�.");
					break;
			}
		}
	}
	public void reservation() {//����
		System.out.print("�¼����� S(1), A(2), B(3)>>");
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
				System.out.println("���� �¼��Դϴ�.");
				break;
		}
	}
	public void lookup() {//��ȸ
		for(int i=0; i<Seat.length; i++) {
			Seat[i].VIEW(Rank[i]);
		}
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}
	public void cancel() {//���
		System.out.print("�¼� S:1, A:2, B:3>>");
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
			System.out.println("���� �¼��Դϴ�.");
			break;
	}
	}
	public void finish() {//������
		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
	}
	public void subsystem() {//���� ���� �ý���
		System.out.print("�̸�>>");
		name = sc.next();
		System.out.print("��ȣ>>");
		num2 = sc.nextInt();
		Seat[num-1].setName(name);
		Seat[num-1].SeatReservation(num2-1);
	}
	public void cancelSubsystem() {
		num--;
		Seat[num].PartialLookup(Rank[num]);
		System.out.print("�̸�>>");
		name = sc.next();
		Seat[num].SeatCancel(name);
	}
}
