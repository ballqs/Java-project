import java.util.Scanner;

public class ex08_0 {
	
	public static String inRect(int x1, int y1, int x2,int y2){
		String rtStr = "�����Դϴ�."; 
		int left, right, top, bottom; 
	    if (x1 > x2) { //���� ��ǥ�� ���� ���� ū�� �񱳸� �ؼ� right,left�� ���Ѵ�.
	      right = x1; 
	      left = x2; 
	      } else { 
	      right = x2; 
	      left = x1; 
	   } 
	   if (y1 > y2) {  //���� ��ǥ�� ���� ���� ū�� �񱳸� �ؼ� top,bottom�� ���Ѵ�.
	     top = y1; 
	     bottom = y2; 
	     } else { 
	     top = y2; 
	     bottom = y1; 
	  } 
	  if ( left > 200 || right < 100 || top < 100 || bottom > 200 ) { 
	    rtStr = "�浹���� ����"; 
	    } else { 
	    rtStr = "�浹"; 
	 }
	  return rtStr;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("��(x,y)�� �Է��Ͻÿ�=>");
		
		int x1 = sc.nextInt();//ù��° �� x1��ǥ
		int y1 = sc.nextInt();//ù��° �� y1��ǥ

		int x2 = sc.nextInt();//�ι�° �� x2��ǥ
		int y2 = sc.nextInt();//�ι�° �� y2��ǥ
		
		String str = inRect(x1,y1,x2,y2);
		System.out.println(str);
	}
}
