package test06;


public class test04 {

	public static void main(String[] args) {
		test04_1Rectangle r = new test04_1Rectangle(2, 2, 8, 7);
		test04_1Rectangle s = new test04_1Rectangle(5, 5, 6, 6);
		test04_1Rectangle t = new test04_1Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s�� ������ "+s.square());
		if(t.contains(r))System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s))System.out.println("t�� s�� �����մϴ�.");
	}

}
