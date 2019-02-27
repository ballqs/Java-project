package »ó¼Ó;

public class A {
	private int a;
	protected A(int i) {
		a = i;
	}
}
class B extends A{
	private int b;
	public B(int a) {
		super(a);
		b = 0;
	}
}
class C{
	int d = 1;
	B b = new B(d);
}
