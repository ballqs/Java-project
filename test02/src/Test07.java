import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x >= 100 && y >= 100) {
			if(x <= 200 && y <= 200) {
				System.out.println("("+x+","+y+")는 사각형 안에 있습니다.");
			}else {
				System.out.println("사각형 안에 없어요.");
			}
		}else {
			System.out.println("사각형 안에 없어요.");
		}

	}

}
