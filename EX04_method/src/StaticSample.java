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
		// static�̶� new ���� �ҷ����� ����
		
		StaticSampleEx s1,s2;
		s1 = new StaticSampleEx();
		s2 = new StaticSampleEx();
		System.out.println("s1 : "+s1.m);
		//���ʷ� ���� 10��
		
		s1.g();
		System.out.println("s1 : "+s1.m);
		//20

		System.out.println("s2 : "+s2.m);
		//s2���� �ƹ��� ���� ���� �ʾҴµ� s1�� ���� �־��� ���� s2���� ������ �޾Ҵ�.
		//static�̱� ������ �����Ѵٴ� �ǹ̴�.
		
		s1.h();
		System.out.println(s1.m);
	}

}
