import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		//c���� = b���� + a���� �ﰢ�� ����
		Scanner sc = new Scanner(System.in);
		int max=0,mid=0,min=0;//ū�� �߰��� ������
		System.out.print("���� 3���� �Է��ϼ��� >>");
		int n,m,l;
		n = sc.nextInt();
		m = sc.nextInt();
		l = sc.nextInt();
		if(n > m) {//n�� m���� ũ��
			if(n > l) {//n�� l���� ũ��
				max = n;
			}else if(n < l){//l�� n���� ũ��
				max = l;
			}else if(n == l) {
				max = n;
			}
		}else if(m > n) {//m�� n���� ũ��
			if(m > l) {//m�� l���� ũ��
				max = m;
			}else if(m < l){
				max = l;
			}else if(m == l) {
				max = m;
			}
		}
		if(n > m) {
			if(n > l) {
				if(m > l) {
					mid = m;
				}else if(m < l){
					mid = l;
				}else if(m == l) {
					mid = m;
				}
			}else if(n < l){
				mid = n;
			}else if(n == l) {
				mid = n;
			}
		}else if(m > n) {
			if(m > l) {
				if(n > l) {
					mid = n;
				}else if(n < l){
					mid = l;
				}else if(n == l) {
					mid = n;
				}
			}else if(m < l){
				mid = m;
			}else if(m == l) {
				mid = m;
			}
		}else if (m == n) {
			mid = m;
		}
		if(n > m) {
			if(m > l) {
				min = l;
			}else if(m < l){
				min = m;
			}else if(m == l) {
				min = m;
			}
		}else if(m > n){
			if(n > l) {
				min = l;
			}else if(n < l){
				min = n;
			}else if(n == l) {
				min = n;
			}
		}else if(m == n) {
			min = m;
		}
		
		if(max*max == mid*mid + min*min) {
			System.out.println("�ﰢ���� �˴ϴ�.");
		}else {
			System.out.println("�ﰢ�� �ȵ� ����...");
		}
	}

}
