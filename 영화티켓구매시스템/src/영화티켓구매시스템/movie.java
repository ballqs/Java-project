package ��ȭƼ�ϱ��Žý���;

import java.util.Scanner;

public class movie {
	Scanner sc = new Scanner(System.in);
	int num;
	String id,pw;
	user user[];
	movielist ml[];
	int i;
	boolean a = false;
	public movie() {
		user = new user[2];
		user[0] = new user("id1","1234","ȫ�浿","010-1111-1111",50000);
		user[1] = new user("id2","5678","������","010-2222-2222",20000);
		
		ml = new movielist[2];
		ml[0] = new movielist(1, "��Ÿ����2", 10000, "G05", "15:00");
		ml[1] = new movielist(2, "��ŷ", 10000, "H08", "18:00");
		
		while(true) {
			System.out.print("�α��� : ");
			id = sc.next();
			if(id.equals("�׸�")) {
				return;
			}
			System.out.print("��й�ȣ : ");
			pw = sc.next();
			
			for(i=0; i<user.length; i++) {
				if(id.equals(user[i].getId()) && pw.equals(user[i].getPw())) {
					System.out.println(user[i].getName()+"�� ����ʽÿ�!");
					a = true;
				}
			}
			while(a) {
				System.out.print("(1)����, (2)��ȸ, (3)���� >>");
				num = sc.nextInt();
				switch(num) {
				case 1:
					movieselect(num,i-1);
					break;
				case 2:
					select(i-1);
					break;
				case 3:
					a = false;
				default:
					break;
				}
			}
		}
	}
	
	public void movieselect(int num,int i) {
		System.out.println("� ��ȭ�� �����Ͻðڽ��ϱ�?");
		System.out.print("(1)��Ÿ����2, (2)��ŷ >>");
		num = sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("���ΰ����Ͻ� ���� ������ �����Ű���?");
			System.out.print("(1)��, (2)�ƴϿ� >>");
			num = sc.nextInt();
			if(num == 1) {
				System.out.println(ml[0].getMoviename()+"�� ������ "+ml[0].getPrice()+"�̸� ���� ����� 5000�� ������ �˴ϴ�.");
				user[i].setMoney(user[i].getMoney() - (ml[0].getPrice()-5000));
				user[i].setTicket(ml[0].getMoviename());	
			}else {
				System.out.println(ml[0].getMoviename()+"�� ������ "+ml[0].getPrice()+"�Դϴ�.");
				user[i].setMoney(user[i].getMoney() - ml[0].getPrice());
				user[i].setTicket(ml[0].getMoviename());				
			}
			break;
		case 2:
			System.out.println(ml[1].getMoviename()+"�� ������ "+ml[1].getPrice()+"�Դϴ�.");
			user[i].setMoney(user[i].getMoney() - ml[1].getPrice());
			user[i].setTicket(ml[1].getMoviename());
			break;
		default :
			System.out.println("�߸��� ��ȣ�Դϴ�.");
			break;
		}
	}
	public void select(int i) {
		System.out.println("������ ��ȸ�Ͻðڽ��ϱ�?");
		System.out.print("(1)������ ��ȭ, (2)�ܾ� >>");
		num = sc.nextInt();
		switch(num) {
			case 1:
				System.out.println("���� �����Ͻ� ��ȭ���� "+user[i].getTicket()+"�Դϴ�.");
				break;
			case 2:
				System.out.println("���� ������ �ܾ��� "+user[i].getMoney()+"�Դϴ�.");
				break;
			default:
				System.out.println("�߸��� ��ȣ�Դϴ�.");
				break;
		}
	}
}
