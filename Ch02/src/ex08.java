import java.util.Scanner;

public class ex08 {
	
	public static boolean inRect(int x, int y, int r_x1,int r_y1,int r_x2,int r_y2){
		//사각형의 충돌이 있는지 알게 하는 코드
		if( x>=r_x1 && x<=r_x2 && //입력점 1개가 사각형 안에 있다
				y>=r_y1 && y<=r_y2) {
			return true;	
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("점(x,y)를 입력하시오=>");
		
		int x1 = sc.nextInt();//첫번째 점 x1좌표
		int y1 = sc.nextInt();//첫번째 점 y1좌표

		int x2 = sc.nextInt();//두번째 점 x2좌표
		int y2 = sc.nextInt();//두번째 점 y2좌표
		
		//1.기준 사각형(100,100) (200,200) 안에 내가 만든 사각형이 있을 때 경우
		if(inRect(x1, y1, 100,100, 200,200) && inRect(x2, y2, 100,100, 200,200) &&
		   inRect(x1, y2, 100,100, 200,200) && inRect(x2, y1, 100,100, 200,200)) {
			System.out.println("신규사각형이 안에 있음");
			System.out.println("충돌");
		}
		//2.기준 사각형(100,100) (200,200) 안에 내가 만든 사각형의 꼭지점이 하나라도 충돌되는 경우
		else if(inRect(x1, y1, 100,100, 200,200) || inRect(x2, y2, 100,100, 200,200) ||
				inRect(x1, y2, 100,100, 200,200) || inRect(x2, y1, 100,100, 200,200) ){
			System.out.println("점 1개라도 걸침");
			System.out.println("충돌");
		}
		//3.기준 사각형(100,100) (200,200)을 내가 만든 사각형이 덮었을 때 경우
		else if(inRect(100,100, x1, y1, x2,y2) && inRect(200,200, x1, y1, x2,y2) &&
				inRect(100,200, x1, y1, x2,y2) && inRect(200,100, x1, y1, x2,y2)) {
			System.out.println("신규사각형이 기준(100,200)을 포함");
			System.out.println("충돌");
		}
		else if(inRect(100,100, x1, y2, x2,y1) && inRect(200,200, x1, y2, x2,y1) &&
				inRect(100,200, x1, y2, x2,y1) && inRect(200,100, x1, y2, x2,y1)) {
			System.out.println("신규사각형2이 기준(100,200)을 포함");
			System.out.println("충돌");
		}else {
			System.out.println("충돌이 일어나지 않았습니다.");
		}
	}
}
