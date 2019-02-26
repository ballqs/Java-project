package 영화티켓구매시스템;

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
		user[0] = new user("id1","1234","홍길동","010-1111-1111",50000);
		user[1] = new user("id2","5678","강감찬","010-2222-2222",20000);
		
		ml = new movielist[2];
		ml[0] = new movielist(1, "스타워즈2", 10000, "G05", "15:00");
		ml[1] = new movielist(2, "더킹", 10000, "H08", "18:00");
		
		while(true) {
			System.out.print("로그인 : ");
			id = sc.next();
			if(id.equals("그만")) {
				return;
			}
			System.out.print("비밀번호 : ");
			pw = sc.next();
			
			for(i=0; i<user.length; i++) {
				if(id.equals(user[i].getId()) && pw.equals(user[i].getPw())) {
					System.out.println(user[i].getName()+"님 어서오십시오!");
					a = true;
				}
			}
			while(a) {
				System.out.print("(1)구매, (2)조회, (3)종료 >>");
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
		System.out.println("어떤 영화를 구매하시겠습니까?");
		System.out.print("(1)스타워즈2, (2)더킹 >>");
		num = sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("할인가능하신 쿠폰 가지고 있으신가요?");
			System.out.print("(1)네, (2)아니요 >>");
			num = sc.nextInt();
			if(num == 1) {
				System.out.println(ml[0].getMoviename()+"의 가격은 "+ml[0].getPrice()+"이며 할인 적용시 5000원 할인이 됩니다.");
				user[i].setMoney(user[i].getMoney() - (ml[0].getPrice()-5000));
				user[i].setTicket(ml[0].getMoviename());	
			}else {
				System.out.println(ml[0].getMoviename()+"의 가격은 "+ml[0].getPrice()+"입니다.");
				user[i].setMoney(user[i].getMoney() - ml[0].getPrice());
				user[i].setTicket(ml[0].getMoviename());				
			}
			break;
		case 2:
			System.out.println(ml[1].getMoviename()+"의 가격은 "+ml[1].getPrice()+"입니다.");
			user[i].setMoney(user[i].getMoney() - ml[1].getPrice());
			user[i].setTicket(ml[1].getMoviename());
			break;
		default :
			System.out.println("잘못된 번호입니다.");
			break;
		}
	}
	public void select(int i) {
		System.out.println("무엇을 조회하시겠습니까?");
		System.out.print("(1)구매한 영화, (2)잔액 >>");
		num = sc.nextInt();
		switch(num) {
			case 1:
				System.out.println("현재 구매하신 영화명은 "+user[i].getTicket()+"입니다.");
				break;
			case 2:
				System.out.println("현재 남으신 잔액은 "+user[i].getMoney()+"입니다.");
				break;
			default:
				System.out.println("잘못된 번호입니다.");
				break;
		}
	}
}
