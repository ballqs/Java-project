import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 원의 중심과 반지름 입력>>");//원의 중심은 어디로 좌표를 찍을지 정하는 x,y값
		int z1 = sc.nextInt();//좌표 z
		int y1 = sc.nextInt();//좌표 y
		double r1 = sc.nextDouble();//지정된 좌표에서 반지름
		System.out.print("두번째 원의 중심과 반지름 입력>>");//원의 중심은 어디로 좌표를 찍을지 정하는 x,y값
		int z2 = sc.nextInt();//좌표 z
		int y2 = sc.nextInt();//좌표 y
		double r2 = sc.nextDouble();//지정된 좌표에서 반지름
		if(Math.sqrt((z1-z2)*(z1-z2)+(y1-y2)*(y1-y2)) <= r1+r2) {
			System.out.println("두 원은 서로 겹친다.");
		}else {
			System.out.println("두 원은 겹치지 않는다.");
		}
	}

}
