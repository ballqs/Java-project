import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i % 2 == 0) {
			if(i % 3 == 0) {
				System.out.println("6의 배수입니다.");
			}else {
				System.out.println("짝수이지만 6의 배수가 아닙니다.");
			}
		}else {
			System.out.println("홀수입니다.");
		}
	}

}
