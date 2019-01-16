import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int i = sc.nextInt();
		if(i < 10 || i > 99) {
			System.out.println("10~99만 입력해주세요!");
			return;
		}
		int z = i > 9 ? i/10 : 0;//10의 자리수
		int y = i > 9 ? i%10 : 0;//1의 자리수
		if(z == y) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}else {
			System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
		}

	}

}
