class Hello22{
	//1.�޼ҵ� �����(in:O, out:O)
	public int Hello2Sum(int n, int m) {
		return n+m;
	}
	//2.�޼ҵ� �����(in:O, out:X)
	public void sum2(int a, int b) {
		int c;
		c= a+b;
		System.out.println(c);
	}
	//3.�޼ҵ� �����(in:X, out:X)
	public void sum3() {
		System.out.println("�ȳ�~!!!");
	}
	//4.�޼ҵ� �����(in:X, out:O)
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
		//1�� �޼ҵ� ���
		s=h2.Hello2Sum(i, 10);//s�� ���� ������ �ֱ⿡ ���� ���� return�� ���� ���ƿ´�.
		//2�� �޼ҵ� ���
		h2.sum2(100, 200);//���⼭ ���� �������� ��� ���� ���� ���� ����
		//3�� �޼ҵ� ���
		h2.sum3();//���� ������(out�� ����)
		//4�� �޼ҵ� ���
		System.out.println(h2.sum4());//in���� ������ return���� out���� �޾Ƽ� ����Ѵ�.
		s = h2.sum4();
		a='?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}

}
