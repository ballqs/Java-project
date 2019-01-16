import java.util.Scanner;

public class ex08_0 {
	
	public static String inRect(int x1, int y1, int x2,int y2){
		String rtStr = "오류입니다."; 
		int left, right, top, bottom; 
	    if (x1 > x2) { //받은 좌표중 둘중 뭐가 큰지 비교를 해서 right,left를 정한다.
	      right = x1; 
	      left = x2; 
	      } else { 
	      right = x2; 
	      left = x1; 
	   } 
	   if (y1 > y2) {  //받은 좌표중 둘중 뭐가 큰지 비교를 해서 top,bottom를 정한다.
	     top = y1; 
	     bottom = y2; 
	     } else { 
	     top = y2; 
	     bottom = y1; 
	  } 
	  if ( left > 200 || right < 100 || top < 100 || bottom > 200 ) { 
	    rtStr = "충돌하지 않음"; 
	    } else { 
	    rtStr = "충돌"; 
	 }
	  return rtStr;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("점(x,y)를 입력하시오=>");
		
		int x1 = sc.nextInt();//첫번째 점 x1좌표
		int y1 = sc.nextInt();//첫번째 점 y1좌표

		int x2 = sc.nextInt();//두번째 점 x2좌표
		int y2 = sc.nextInt();//두번째 점 y2좌표
		
		String str = inRect(x1,y1,x2,y2);
		System.out.println(str);
	}
}
