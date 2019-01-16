import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.print("�� (i,j)�� ��ǥ�� �Է��Ͻÿ�>>");
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		if(inRect(x,y,100,200,100,200) && inRect(x,j,100,200,100,200) && 
				inRect(i,y,100,200,100,200) && inRect(i,j,100,200,100,200)) {
			System.out.println("�簢���� �ȿ� �ִ�.");
			
		}else if(inRect(x,y,100,200,100,200) || inRect(x,j,100,200,100,200) || 
				inRect(i,y,100,200,100,200) || inRect(i,j,100,200,100,200)){
			System.out.println("�浹�� �Ͼ��.");
			
		}else if(inRect(100,100,x,y,i,j) && inRect(200,200,x,y,i,j) && 
				inRect(100,200,x,y,i,j) && inRect(200,100,x,y,i,j)){
			System.out.println("������");
			
		}else if(inRect(100,100,x,y,i,j) || inRect(200,200,x,y,i,j) || 
				inRect(100,200,x,y,i,j) || inRect(200,100,x,y,i,j)){
			System.out.println("��ü�� ������ ������");
				
			}else {
			System.out.println("�浹 ����!");
		}
	}

	public static boolean inRect(int q, int w, int rectx1, int recty1, int rectx2, int recty2) {
		if((q >= rectx1 && q <= rectx2) //�Է��� 1���� �簢�� �ȿ� �ִ�.
				&& (w >= recty1 && w<= recty2)) {
			return true;
		}else { return false;
		}
	}

}
