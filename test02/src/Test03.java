import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ���>>");
		int i = sc.nextInt();
		int a = 0,b = 0,c = 0,d = 0,e = 0,f = 0,g = 0;//5����,����,õ��,���,���ʿ�,�ʿ�,�Ͽ�
		int t = 5;
		if(i >= 50000) {
			a = i >= 50000 ? i/50000 : 0;//5����
		}
		for(int j = 1; j < a; j++) {//5���� ������ ���� ���ҵ� �������� ������ ǥ���ϱ� ����
			t += 5;
		}
		if(i >= 10000) {
			if(a >= 1) {
				b = i/10000 - t;//����
			}else{
				b = i/10000;//����
			}
		}
		if(i >= 1000) {
			c = i/1000%10;//õ��
		}
		if(i >= 100) {
			d = i/100%10;//��� ex)65235/100 -> 652%10 -> 2
		}
		if(i >= 50) {
			e = i%100/50;//���ʿ� ex)65285%100 -> 85/50 -> 1
		}
		if(i >= 10) {
			if(e == 1) {
				f = (i%100/10) - 5;
			}else {
				f = i%100/10;
			}
		}
		if(i >= 1) {
			g = i%10;//�Ͽ�
		}
		System.out.println("�������� :"+a+"��");
		System.out.println("������ :"+b+"��");
		System.out.println("õ���� :"+c+"��");
		System.out.println("��� :"+d+"��");
		System.out.println("���ʿ� :"+e+"��");
		System.out.println("�ʿ� :"+f+"��");
		System.out.println("�Ͽ� :"+g+"��");
		
	}

}
