import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1,num2;
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에 입력하세요.");
		System.out.print("철수 : ");
		num1 = sc.nextLine();
		System.out.print("영희 : ");
		num2 = sc.nextLine();
		if(num1.equals("가위")) {
			if(num2.equals("가위")) {
				System.out.println("비겼습니다.");
			}else if(num2.equals("보")) {
				System.out.println("철수가 이겼습니다.");
			}else if(num2.equals("바위")) {
				System.out.println("철수가 졌습니다.");
			}
		}else if(num1.equals("바위")) {
			if(num2.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			}else if(num2.equals("보")) {
				System.out.println("철수가 졌습니다.");
			}else if(num2.equals("바위")) {
				System.out.println("비겼습니다.");
			}
		}else if(num1.equals("보")) {
			if(num2.equals("가위")) {
				System.out.println("철수가 졌습니다.");
			}else if(num2.equals("보")) {
				System.out.println("비겼습니다.");
			}else if(num2.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			}
		}

	}

}
