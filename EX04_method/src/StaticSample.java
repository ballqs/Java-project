class StaticSampleEx{
	int z = 5;
	public void g() {
		m = 20;
	}
	public static void h() {
		
	}
	public static int m;
	public static void f() {
		int n = 15;
		m = 5 + n;
	}
}

public class StaticSample {

	public static void main(String[] args) {
		StaticSampleEx.m = 10;
		// static이라서 new 없이 불러오기 가능
		
		StaticSampleEx s1,s2;
		s1 = new StaticSampleEx();
		s2 = new StaticSampleEx();
		System.out.println("s1 : "+s1.m);
		//최초로 정한 10값
		
		s1.g();
		System.out.println("s1 : "+s1.m);
		//20

		System.out.println("s2 : "+s2.m);
		//s2에는 아무런 값도 주지 않았는데 s1에 의해 주어진 값이 s2에도 영향을 받았다.
		//static이기 때문에 공유한다는 의미다.
		
		s1.h();
		System.out.println(s1.m);
	}

}
