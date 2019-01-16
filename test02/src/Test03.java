import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요>>");
		int i = sc.nextInt();
		int a = 0,b = 0,c = 0,d = 0,e = 0,f = 0,g = 0;//5만원,만원,천원,백원,오십원,십원,일원
		int t = 5;
		if(i >= 50000) {
			a = i >= 50000 ? i/50000 : 0;//5만원
		}
		for(int j = 1; j < a; j++) {//5만원 갯수에 따라 감소될 만원권의 갯수를 표현하기 위함
			t += 5;
		}
		if(i >= 10000) {
			if(a >= 1) {
				b = i/10000 - t;//만원
			}else{
				b = i/10000;//만원
			}
		}
		if(i >= 1000) {
			c = i/1000%10;//천원
		}
		if(i >= 100) {
			d = i/100%10;//백원 ex)65235/100 -> 652%10 -> 2
		}
		if(i >= 50) {
			e = i%100/50;//오십원 ex)65285%100 -> 85/50 -> 1
		}
		if(i >= 10) {
			if(e == 1) {
				f = (i%100/10) - 5;
			}else {
				f = i%100/10;
			}
		}
		if(i >= 1) {
			g = i%10;//일원
		}
		System.out.println("오만원권 :"+a+"매");
		System.out.println("만원권 :"+b+"매");
		System.out.println("천원권 :"+c+"매");
		System.out.println("백원 :"+d+"개");
		System.out.println("오십원 :"+e+"개");
		System.out.println("십원 :"+f+"개");
		System.out.println("일원 :"+g+"개");
		
	}

}
