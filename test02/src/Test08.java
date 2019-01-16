import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.print("점 (i,j)의 좌표를 입력하시오>>");
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		if(inRect(x,y,100,200,100,200) && inRect(x,j,100,200,100,200) && 
				inRect(i,y,100,200,100,200) && inRect(i,j,100,200,100,200)) {
			System.out.println("사각형이 안에 있다.");
			
		}else if(inRect(x,y,100,200,100,200) || inRect(x,j,100,200,100,200) || 
				inRect(i,y,100,200,100,200) || inRect(i,j,100,200,100,200)){
			System.out.println("충돌이 일어난다.");
			
		}else if(inRect(100,100,x,y,i,j) && inRect(200,200,x,y,i,j) && 
				inRect(100,200,x,y,i,j) && inRect(200,100,x,y,i,j)){
			System.out.println("덮었음");
			
		}else if(inRect(100,100,x,y,i,j) || inRect(200,200,x,y,i,j) || 
				inRect(100,200,x,y,i,j) || inRect(200,100,x,y,i,j)){
			System.out.println("전체를 덮지는 못했음");
				
			}else {
			System.out.println("충돌 없음!");
		}
	}

	public static boolean inRect(int q, int w, int rectx1, int recty1, int rectx2, int recty2) {
		if((q >= rectx1 && q <= rectx2) //입력점 1개가 사각형 안에 있다.
				&& (w >= recty1 && w<= recty2)) {
			return true;
		}else { return false;
		}
	}

}
