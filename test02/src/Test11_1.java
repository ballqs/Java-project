import java.util.Scanner;

public class Test11_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int i = sc.nextInt();
		if(i > 0 && i <= 12) {
			if(i >=3 && i <=5) {
				System.out.println("봄");
			}else if(i >=6 && i <=8) {
				System.out.println("여름");
			}else if(i >=7 && i <=11) {
				System.out.println("가을");
			}else if(i == 1 || i == 2 || i == 12) {
				System.out.println("겨울");
			}
		}
	}

}
