import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		//c제곱 = b제곱 + a제곱 삼각형 공식
		Scanner sc = new Scanner(System.in);
		int max=0,mid=0,min=0;//큰값 중간값 작은값
		System.out.print("정수 3개를 입력하세요 >>");
		int n,m,l;
		n = sc.nextInt();
		m = sc.nextInt();
		l = sc.nextInt();
		if(n > m) {//n이 m보다 크다
			if(n > l) {//n이 l보다 크다
				max = n;
			}else if(n < l){//l이 n보다 크다
				max = l;
			}else if(n == l) {
				max = n;
			}
		}else if(m > n) {//m이 n보다 크다
			if(m > l) {//m이 l보다 크다
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
			System.out.println("삼각형이 됩니다.");
		}else {
			System.out.println("삼각형 안됨 ㅅㄱ...");
		}
	}

}
