import java.util.Scanner;

public class ex08 {
	
	public static boolean inRect(int x, int y, int r_x1,int r_y1,int r_x2,int r_y2){
		//�簢���� �浹�� �ִ��� �˰� �ϴ� �ڵ�
		if( x>=r_x1 && x<=r_x2 && //�Է��� 1���� �簢�� �ȿ� �ִ�
				y>=r_y1 && y<=r_y2) {
			return true;	
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("��(x,y)�� �Է��Ͻÿ�=>");
		
		int x1 = sc.nextInt();//ù��° �� x1��ǥ
		int y1 = sc.nextInt();//ù��° �� y1��ǥ

		int x2 = sc.nextInt();//�ι�° �� x2��ǥ
		int y2 = sc.nextInt();//�ι�° �� y2��ǥ
		
		//1.���� �簢��(100,100) (200,200) �ȿ� ���� ���� �簢���� ���� �� ���
		if(inRect(x1, y1, 100,100, 200,200) && inRect(x2, y2, 100,100, 200,200) &&
		   inRect(x1, y2, 100,100, 200,200) && inRect(x2, y1, 100,100, 200,200)) {
			System.out.println("�űԻ簢���� �ȿ� ����");
			System.out.println("�浹");
		}
		//2.���� �簢��(100,100) (200,200) �ȿ� ���� ���� �簢���� �������� �ϳ��� �浹�Ǵ� ���
		else if(inRect(x1, y1, 100,100, 200,200) || inRect(x2, y2, 100,100, 200,200) ||
				inRect(x1, y2, 100,100, 200,200) || inRect(x2, y1, 100,100, 200,200) ){
			System.out.println("�� 1���� ��ħ");
			System.out.println("�浹");
		}
		//3.���� �簢��(100,100) (200,200)�� ���� ���� �簢���� ������ �� ���
		else if(inRect(100,100, x1, y1, x2,y2) && inRect(200,200, x1, y1, x2,y2) &&
				inRect(100,200, x1, y1, x2,y2) && inRect(200,100, x1, y1, x2,y2)) {
			System.out.println("�űԻ簢���� ����(100,200)�� ����");
			System.out.println("�浹");
		}
		else if(inRect(100,100, x1, y2, x2,y1) && inRect(200,200, x1, y2, x2,y1) &&
				inRect(100,200, x1, y2, x2,y1) && inRect(200,100, x1, y2, x2,y1)) {
			System.out.println("�űԻ簢��2�� ����(100,200)�� ����");
			System.out.println("�浹");
		}else {
			System.out.println("�浹�� �Ͼ�� �ʾҽ��ϴ�.");
		}
	}
}
