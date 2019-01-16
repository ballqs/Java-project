import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int z = sc.nextInt();
		int y = sc.nextInt();
		int x = sc.nextInt();
		if(z > y) {
			if(z > x) {
				if(x > y) {
					System.out.println(x+"가 중간 숫자입니다.");
				}else if(x < y){
					System.out.println(y+"가 중간 숫자입니다.");
				}else if(x == y) {
					System.out.println(x+"가 중간 숫자입니다.");
				}
			}else if(z < x){
				System.out.println(z+"가 중간 숫자입니다.");
			}else if(x == z) {
				System.out.println(x+"가 중간 숫자입니다.");
			}
		}else if(z < y){//y가 z보다 크다.
			if(y > x) {
				if(z > x) {
					System.out.println(z+"가 중간 숫자입니다.");
				}else if(z < x) {
					System.out.println(x+"가 중간 숫자입니다.");
				}else if(x == z) {
					System.out.println(x+"가 중간 숫자입니다.");
				}
			}else if(y < x){
				System.out.println(y+"가 중간 숫자입니다.");
			}else if(y == x) {
				System.out.println(x+"가 중간 숫자입니다.");
			}
		}else if(z == y) {
			System.out.println(z+"가 중간 숫자입니다.");
		}
		double sum = (double)(z + y + x)/3;
		System.out.println("평균 값 : "+sum);
	}

}
