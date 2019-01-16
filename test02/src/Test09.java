import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력>>");//원의 중심은 어디로 좌표를 찍을지 정하는 x,y값
		int z = sc.nextInt();//좌표 z
		int y = sc.nextInt();//좌표 y
		double zirm = sc.nextDouble();//지정된 좌표에서 반지름
		System.out.print("점 입력>>");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if((z-a)*(z-a)+(y-b)*(y-b)<=zirm*zirm) {//z-a 랑 y-b는 원의 중심과 내가 찝을 좌표와의 거리
			System.out.println("점 ("+a+","+b+")는 원 안에 있다.");
		}else {
			System.out.println("원 밖에 있습니다.");
		}
	}

}
