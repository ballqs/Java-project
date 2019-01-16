class Hello22{
	//1.메소드 만들기(in:O, out:O)
	public int Hello2Sum(int n, int m) {
		return n+m;
	}
	//2.메소드 만들기(in:O, out:X)
	public void sum2(int a, int b) {
		int c;
		c= a+b;
		System.out.println(c);
	}
	//3.메소드 만들기(in:X, out:X)
	public void sum3() {
		System.out.println("안녕~!!!");
	}
	//4.메소드 만들기(in:X, out:O)
	public int sum4() {
		int d = 700;
		return d;
	}
}

public class Hello2 {
	public static void main(String[] args) {
		int i= 20;
		int s;
		char a;
		Hello22 h2 = new Hello22();
		//1번 메소드 사용
		s=h2.Hello2Sum(i, 10);//s는 값을 가질수 있기에 보낸 값이 return에 인해 돌아온다.
		//2번 메소드 사용
		h2.sum2(100, 200);//여기서 값을 가질수가 없어서 들어가는 값만 설정 가능
		//3번 메소드 사용
		h2.sum3();//값을 못가짐(out이 없음)
		//4번 메소드 사용
		System.out.println(h2.sum4());//in값이 없지만 return으로 out값을 받아서 출력한다.
		s = h2.sum4();
		a='?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}

}
