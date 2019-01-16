import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int i = sc.nextInt();
		if (i>=10 && i<100) {
			int first,second;
			first = i%10;//일의 자리
			second = i/10;//십의 자리
			if(first%3==0 || second%3==0) {
				if(first%3==0&&second%3==0) {
					System.out.println("박수짝짝");
				}else {
					System.out.println("박수짝");
				}
			}else {
				System.out.println("둘다 안맞아요 ㅠ_ㅠ");
			}
		}else {
			System.out.println("말 좀 들어라!");
			return;
		}
	}

}
